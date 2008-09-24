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

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import javax.servlet.*;

import net.eiroca.library.util.*;
import net.eiroca.portal.assembler.api.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.gen.*;

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

  protected AssemblerContext(String who) {
    super(who);
  }

  public static final synchronized AssemblerContext getInstance() {
    if (instance == null) {
      instance = new AssemblerContext("Assembler");
    }
    return instance;
  }

  private static final Class[] FIRMA = {
      ServletContext.class,
      HashMap.class
  };
  private HashMap cache = new HashMap();

  private Assembler assemblerConf = null;

  /**
   * Legge il file xml tramite l'utilizzo delle librerie castor
   */
  public void laodProperties(ResourceLocator propSrc) {
    Assembler newConf = null;
    try {
      InputStreamReader is = new InputStreamReader(propSrc.getInputStream());
      newConf = Assembler.unmarshal(is);
      assemblerConf = newConf;
    }
    catch (Exception ex) {
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

  private Object buildClass(ServletContext sc, String name, DefParam[] prm) {
    Object o = null;
    try {
      Class cls = Class.forName(name);
      HashMap p = new HashMap();
      for (int i = 0; i < prm.length; i++) {
        p.put(prm[i].getName(), prm[i].getValue());
      }
      Constructor maker = cls.getConstructor(FIRMA);
      o = maker.newInstance(new Object[] {sc, p});
    }
    catch (InstantiationException ex) {
    }
    catch (IllegalAccessException ex) {
    }
    catch (IllegalArgumentException ex) {
    }
    catch (InvocationTargetException ex) {
    }
    catch (NoSuchMethodException ex) {
    }
    catch (SecurityException ex) {
    }
    catch (ClassNotFoundException ex) {
    }
    return o;
  }

  public AuthenticationDef getAuthentication(String ID) throws AssemblerException {
    Object o = cache.get("Authentication=" + ID);
    if (o == null) {
      AuthenticationConfig ac = assemblerConf.getConfiguration().getAuthenticationConfig();
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

  public IAuthentication getAuthenticationClass(ServletContext sc, String ID) throws AssemblerException {
    Object o = cache.get("AuthenticationClass=" + ID);
    if (o == null) {
      AuthenticationDef auth = getAuthentication(ID);
      if (auth != null) {
        IAuthentication a = (IAuthentication)buildClass(sc, auth.getClassName(), auth.getDefParam());
        if (a != null) {
          cache.put("AuthenticationClass=" + ID, a);
        }
        return a;
      }
    }
    return (IAuthentication)o;
  }

  public CacheDef getCache(String ID) throws AssemblerException {
    Object o = cache.get("Cache=" + ID);
    if (o == null) {
      CacheConfig ac = assemblerConf.getConfiguration().getCacheConfig();
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

  public ICache getCacheClass(ServletContext sc, String ID) throws AssemblerException {
    Object o = cache.get("CacheClass=" + ID);
    if (o == null) {
      CacheDef c = getCache(ID);
      if (c != null) {
        ICache ic = (ICache)buildClass(sc, c.getClassName(), c.getDefParam());
        if (ic != null) {
          cache.put("CacheClass=" + ID, ic);
        }
        return ic;
      }
    }
    return (ICache)o;
  }

  public ScriptEngineDef getScriptEngine(String ID) throws AssemblerException {
    Object o = cache.get("ScriptEngine=" + ID);
    if (o == null) {
      ScriptEngineConfig ac = assemblerConf.getConfiguration().getScriptEngineConfig();
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

  public IScriptEngine getScriptEngineClass(ServletContext sc, String ID) throws AssemblerException {
    Object o = cache.get("ScriptEngineClass=" + ID);
    if (o == null) {
      ScriptEngineDef c = getScriptEngine(ID);
      if (c != null) {
        IScriptEngine ic = (IScriptEngine)buildClass(sc, c.getClassName(), c.getDefParam());
        if (ic != null) {
          cache.put("CacheClass=" + ID, ic);
        }
        return ic;
      }
    }
    return (IScriptEngine)o;
  }

  public ExtractorDef getExtractor(String ID) throws AssemblerException {
    Object o = cache.get("Extractor=" + ID);
    if (o == null) {
      ExtractorConfig ac = assemblerConf.getConfiguration().getExtractorConfig();
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

  public IExtractor getExtractorClass(ServletContext sc, String ID) throws AssemblerException {
    Object o = cache.get("Extractor=" + ID);
    if (o == null) {
      ExtractorDef c = getExtractor(ID);
      if (c != null) {
        IExtractor ic = (IExtractor)buildClass(sc, c.getClassName(), c.getDefParam());
        if (ic != null) {
          cache.put("Extractor=" + ID, ic);
        }
        return ic;
      }
    }
    return (IExtractor)o;
  }

}
