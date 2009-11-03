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
package net.eiroca.portal.assembler.helper;

import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.servlet.ServletContext;
import net.eiroca.library.util.Context;
import net.eiroca.library.util.ResourceLocator;
import net.eiroca.portal.assembler.api.IAuthentication;
import net.eiroca.portal.assembler.api.ICache;
import net.eiroca.portal.assembler.api.IExtractor;
import net.eiroca.portal.assembler.api.IScriptEngine;
import net.eiroca.portal.assembler.exception.AssemblerException;
import net.eiroca.portal.assembler.gen.Assembler;
import net.eiroca.portal.assembler.gen.AuthenticationConfig;
import net.eiroca.portal.assembler.gen.AuthenticationDef;
import net.eiroca.portal.assembler.gen.CacheConfig;
import net.eiroca.portal.assembler.gen.CacheDef;
import net.eiroca.portal.assembler.gen.DefParam;
import net.eiroca.portal.assembler.gen.ExtractorConfig;
import net.eiroca.portal.assembler.gen.ExtractorDef;
import net.eiroca.portal.assembler.gen.ScriptEngineConfig;
import net.eiroca.portal.assembler.gen.ScriptEngineDef;

/**
 * Classe che maschera gli utilizzi dei log e dei "contatori".<br/>
 * La classe e' un singleton e il metodo getInstance() ne restituisce
 * un'istanza.<br/>
 * Vengono definiti i seguenti "canali" di log:<br/>
 * - "Log.Eventi" utilizzato per segnalare ogni sorta di evento che e' avvenuto
 * nel assembler<br/>
 * - "Log.Errori" utilizzato per segnalare gli errori<br/>
 */

public final class AssemblerContext extends Context {

  protected static AssemblerContext instance = null;

  protected AssemblerContext(final String who) {
    super(who);
  }

  public static final synchronized AssemblerContext getInstance() {
    if (AssemblerContext.instance == null) {
      AssemblerContext.instance = new AssemblerContext("Assembler");
    }
    return AssemblerContext.instance;
  }

  private static final Class[] FIRMA = {
      ServletContext.class,
      HashMap.class
  };
  private final HashMap cache = new HashMap();

  private Assembler assemblerConf = null;

  /**
   * Legge il file xml tramite l'utilizzo delle librerie castor
   */
  @Override
  public void laodProperties(final ResourceLocator propSrc) {
    Assembler newConf = null;
    try {
      final InputStreamReader is = new InputStreamReader(propSrc.getInputStream());
      newConf = Assembler.unmarshal(is);
      assemblerConf = newConf;
    }
    catch (final Exception ex) {
      ex.printStackTrace();
    }
  }

  /**
   * Restituisce la configurazione del assembler
   * @return
   */
  public Assembler getAssemblerConf() {
    checkConf();
    return assemblerConf;
  }

  private Object buildClass(final ServletContext sc, final String name, final DefParam[] prm) {
    Object o = null;
    try {
      final Class cls = Class.forName(name);
      final HashMap p = new HashMap();
      for (final DefParam element : prm) {
        p.put(element.getName(), element.getValue());
      }
      final Constructor maker = cls.getConstructor(AssemblerContext.FIRMA);
      o = maker.newInstance(new Object[] {sc, p});
    }
    catch (final InstantiationException ex) {
    }
    catch (final IllegalAccessException ex) {
    }
    catch (final IllegalArgumentException ex) {
    }
    catch (final InvocationTargetException ex) {
    }
    catch (final NoSuchMethodException ex) {
    }
    catch (final SecurityException ex) {
    }
    catch (final ClassNotFoundException ex) {
    }
    return o;
  }

  public AuthenticationDef getAuthentication(final String ID) throws AssemblerException {
    final Object o = cache.get("Authentication=" + ID);
    if (o == null) {
      final AuthenticationConfig ac = assemblerConf.getConfiguration().getAuthenticationConfig();
      AuthenticationDef auth = null;
      for (int i = 0; i < ac.getAuthenticationDefCount(); i++) {
        auth = ac.getAuthenticationDef(i);
        if (auth.getID().equals(ID)) {
          cache.put("Authentication=" + ID, auth);
          return auth;
        }
      }
      Utils.raiseError(false, null, "Bad Authentication Call " + ID);
    }
    return (AuthenticationDef)o;
  }

  public IAuthentication getAuthenticationClass(final ServletContext sc, final String ID) throws AssemblerException {
    final Object o = cache.get("AuthenticationClass=" + ID);
    if (o == null) {
      final AuthenticationDef auth = getAuthentication(ID);
      if (auth != null) {
        final IAuthentication a = (IAuthentication)buildClass(sc, auth.getClassName(), auth.getDefParam());
        if (a != null) {
          cache.put("AuthenticationClass=" + ID, a);
        }
        return a;
      }
    }
    return (IAuthentication)o;
  }

  public CacheDef getCache(final String ID) throws AssemblerException {
    final Object o = cache.get("Cache=" + ID);
    if (o == null) {
      final CacheConfig ac = assemblerConf.getConfiguration().getCacheConfig();
      CacheDef c = null;
      for (int i = 0; i < ac.getCacheDefCount(); i++) {
        c = ac.getCacheDef(i);
        if (c.getID().equals(ID)) {
          cache.put("Cache=" + ID, c);
          return c;
        }
      }
      Utils.raiseError(false, null, "Bad Cache Call " + ID);
    }
    return (CacheDef)o;
  }

  public ICache getCacheClass(final ServletContext sc, final String ID) throws AssemblerException {
    final Object o = cache.get("CacheClass=" + ID);
    if (o == null) {
      final CacheDef c = getCache(ID);
      if (c != null) {
        final ICache ic = (ICache)buildClass(sc, c.getClassName(), c.getDefParam());
        if (ic != null) {
          cache.put("CacheClass=" + ID, ic);
        }
        return ic;
      }
    }
    return (ICache)o;
  }

  public ScriptEngineDef getScriptEngine(final String ID) throws AssemblerException {
    final Object o = cache.get("ScriptEngine=" + ID);
    if (o == null) {
      final ScriptEngineConfig ac = assemblerConf.getConfiguration().getScriptEngineConfig();
      ScriptEngineDef c = null;
      for (int i = 0; i < ac.getScriptEngineDefCount(); i++) {
        c = ac.getScriptEngineDef(i);
        if (c.getID().equals(ID)) {
          cache.put("ScriptEngine=" + ID, c);
          return c;
        }
      }
      Utils.raiseError(false, null, "Bad Cache Call " + ID);
    }
    return (ScriptEngineDef)o;
  }

  public IScriptEngine getScriptEngineClass(final ServletContext sc, final String ID) throws AssemblerException {
    final Object o = cache.get("ScriptEngineClass=" + ID);
    if (o == null) {
      final ScriptEngineDef c = getScriptEngine(ID);
      if (c != null) {
        final IScriptEngine ic = (IScriptEngine)buildClass(sc, c.getClassName(), c.getDefParam());
        if (ic != null) {
          cache.put("CacheClass=" + ID, ic);
        }
        return ic;
      }
    }
    return (IScriptEngine)o;
  }

  public ExtractorDef getExtractor(final String ID) throws AssemblerException {
    final Object o = cache.get("Extractor=" + ID);
    if (o == null) {
      final ExtractorConfig ac = assemblerConf.getConfiguration().getExtractorConfig();
      ExtractorDef c = null;
      for (int i = 0; i < ac.getExtractorDefCount(); i++) {
        c = ac.getExtractorDef(i);
        if (c.getID().equals(ID)) {
          cache.put("Extractor=" + ID, c);
          return c;
        }
      }
      Utils.raiseError(false, null, "Bad Cache Call " + ID);
    }
    return (ExtractorDef)o;
  }

  public IExtractor getExtractorClass(final ServletContext sc, final String ID) throws AssemblerException {
    final Object o = cache.get("Extractor=" + ID);
    if (o == null) {
      final ExtractorDef c = getExtractor(ID);
      if (c != null) {
        final IExtractor ic = (IExtractor)buildClass(sc, c.getClassName(), c.getDefParam());
        if (ic != null) {
          cache.put("Extractor=" + ID, ic);
        }
        return ic;
      }
    }
    return (IExtractor)o;
  }

}
