/* GPL > 3.0
Copyright (C) 1999-2008 eIrOcA Enrico Croce & Simona Burzio

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package net.eiroca.library.util;

import java.util.HashMap;
import java.util.Iterator;
import javax.servlet.ServletConfig;
import org.apache.log4j.Logger;

/**Helper Class to hide log and counters implementation.<br/>
 * The class is a singleton and the method getInstance() is the factory.
 * The following log channels are defined:<br/>
 * - "Log.Events" used to record generic events<br/>
 * - "Log.Errors" used to record errors<br/>
 */

public class Context {

  // Constructor
  private static String defWho = "Context";
  private static HashMap propDef = new HashMap();
  private static HashMap propVal = new HashMap();

  public Context(final String who) {
    Context.defWho = who;
    Context.declare(Context.PROPERTIESPATH, "AssemblerConfig.xml");
    Context.declare(Context.PROPERTIESTIMEOUT, "60000");
  }

  // Logging
  private static final String ERROR_PREFIX = "Error.";
  private final Logger logEvents = Logger.getLogger("Log.Events");
  private final Logger logErrors = Logger.getLogger("Log.Errors");

  /**Returns a human readable string with the given informations
   * @param who If not null is added to the output string
   * @param why If not null is added to the output string
   * @param err If not null .getMessage() is added to the output string
   * @return A StringBuffer with the result
   */
  private static final StringBuffer getMsg(final String who, final String why) {
    final StringBuffer msg = new StringBuffer();
    if (who != null) {
      msg.append('[');
      msg.append(who);
      msg.append(']');
    }
    if (why != null) {
      msg.append(why);
    }
    return msg;
  }

  /**Writes a fatal message. The message is written in Log.Events and in Log.Errors.
   * The counter "Errors.<who>" is also increased.
   * @param who The originator, if null defWho is used
   * @param why The reason of the log (must be not null)
   * @param err Optional associated error (can be null)
   */
  public final void fatal(String who, final String why, final Exception err) {
    if (who == null) {
      who = Context.defWho;
    }
    touch(Context.ERROR_PREFIX + who, true);
    final String msg = Context.getMsg(who, why).toString();
    logEvents.fatal(msg, err);
    logErrors.error(msg, err);
  }

  /**Writes an error message. The message is written in Log.Events and in Log.Errors.
   * The counter "Errors.<who>" is also increased.
   * @param who The originator, if null defWho is used
   * @param why The reason of the log (must be not null)
   * @param err Optional associated error (can be null)
   */
  public final void error(String who, final String why, final Exception err) {
    if (who == null) {
      who = Context.defWho;
    }
    touch(Context.ERROR_PREFIX + who, true);
    final String msg = Context.getMsg(who, why).toString();
    logEvents.warn(msg, err);
    logErrors.error(msg, err);
  }

  /**Writes a warning message. The message is written in Log.Events.
   * The counter "Errors.<who>" is also increased.
   * @param who The originator, if null defWho is used
   * @param why The reason of the log (must be not null)
   * @param err Optional associated error (can be null)
   */
  public final void warning(String who, final String why, final Exception err) {
    if (who == null) {
      who = Context.defWho;
    }
    touch(Context.ERROR_PREFIX + who, true);
    logEvents.warn(Context.getMsg(who, why), err);
  }

  // Counters
  private final HashMap counters = new HashMap();
  private static final String STATE_OK = " enters in 'error' condition";
  private static final String STATE_KO = " enters in 'working' condition";

  /**The methods tracks the "touch" events on a particular counter identified
   * by "who". The "touch" can be originated by an error or by a success.
   * The touch can generate a "state" change of the associated counter (e. g.
   * if too much errors are happened), this kind of events are intercepted
   * and logged in the "Log.Errors".
   * @param who Counter to be used
   * @param err If true the touch is due to an error
   */
  public final void touch(final String who, final boolean err) {
    CounterInfo inf;
    synchronized (counters) {
      inf = (CounterInfo)counters.get(who);
      if (inf == null) {
        inf = new CounterInfo();
        counters.put(who, inf);
      }
    }
    switch (inf.touch(err)) {
      case (CounterInfo.ST_OK): {
        enterStatusOK(who);
        break;
      }
      case (CounterInfo.ST_ERROR): {
        enterStatusKO(who);
        break;
      }
    }
  }

  public void enterStatusOK(final String who) {
    logErrors.error(who + Context.STATE_OK);
  }

  public void enterStatusKO(final String who) {
    logErrors.error(who + Context.STATE_KO);
  }

  /**Resets all the counters
   */
  public void resetCounters() {
    counters.clear();
  }

  /** Returns a copy of the counters
   * @return An hashmap with the (name, counter value) pairs
   */
  public HashMap getCounters() {
    final HashMap result = new HashMap();
    final Iterator it = counters.keySet().iterator();
    while (it.hasNext()) {
      final String nam = (String)it.next();
      result.put(nam, counters.get(nam));
    }
    return result;
  }

  // Properties
  public static final String PROPERTIESPATH = "Properties.Path";
  public static final String PROPERTIESTIMEOUT = "Properties.TimeOut";

  private long lastLoad = 0;
  private ResourceLocator propSrc = null;
  private boolean updating = false;

  public static final void declare(final String propName, final String propDefault) {
    Context.propVal.put(propName, propDefault);
    Context.propDef.put(propName, propDefault);
  }

  private final String getStr(final String propName) {
    final Object def = Context.propDef.get(propName);
    if (def == null) {
      error(null, "Invalid properity request (" + propName + ")", null);
      return null;
    }
    final Object val = Context.propVal.get(propName);
    return (val == null) ? (String)def : (String)val;
  }

  private final int getInt(final String propName) {
    final Object def = Context.propDef.get(propName);
    if (def == null) {
      error(null, "Invalid properity request (" + propName + ")", null);
      return 0;
    }
    try {
      return Integer.parseInt((String)Context.propVal.get(propName));
    }
    catch (final Exception e) {
      return Integer.parseInt((String)def);
    }
  }

  public HashMap getProperties() {
    final HashMap result = new HashMap();
    final Iterator it = Context.propDef.keySet().iterator();
    while (it.hasNext()) {
      final String nam = (String)it.next();
      result.put(nam, getStr(nam));
    }
    return result;
  }

  public void updateConfig(final ServletConfig conf) {
    if (conf != null) {
      final Iterator it = Context.propDef.keySet().iterator();
      while (it.hasNext()) {
        final String nam = (String)it.next();
        final String val = conf.getInitParameter(nam);
        if (val != null) {
          Context.propVal.put(nam, val);
        }
      }
      relaodProperties();
    }
  }

  public void checkConf() {
    boolean needUpdate = false;
    if (propSrc == null) {
      needUpdate = true;
    }
    else {
      final int timeOut = getInt(Context.PROPERTIESTIMEOUT);
      final long now = System.currentTimeMillis() - timeOut;
      if (lastLoad < now) {
        final long lastMod = propSrc.lastModified();
        if (lastMod < 1) {
          needUpdate = true;
        }
        else {
          needUpdate = (lastMod > lastLoad);
        }
      }
    }
    if ((needUpdate) && (!updating)) {
      relaodProperties();
    }
  }

  public final synchronized void relaodProperties() {
    warning(null, "Config.reloadProperties()", null);
    updating = true;
    try {
      final String path = getStr(Context.PROPERTIESPATH);
      try {
        propSrc = new ResourceLocator(path);
        laodProperties(propSrc);
        lastLoad = System.currentTimeMillis();
      }
      catch (final Exception e) {
        fatal("Assembler", "Error Reading AssemblerProperties (" + path + ")", e);
      }
    }
    finally {
      updating = false;
    }
  }

  public void laodProperties(final ResourceLocator propSrc) {
  }

}
