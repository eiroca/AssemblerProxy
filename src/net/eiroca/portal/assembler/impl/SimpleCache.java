package net.eiroca.portal.assembler.impl;

import java.util.*;
import javax.servlet.*;

import net.eiroca.portal.assembler.api.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.util.*;

public class SimpleCache extends APIClass implements ICache {

  public SimpleCache(ServletContext sc, HashMap p) {
  }

  public String getCacheKey(RequestData data, String localKey) throws AssemblerException {
    // Verifica se e' in cache e se e' usabile
    if ((data.sameSection)) {
      String sesnam = "CACHE/" + data.ri.getAppName() + "/" + data.ri.getAppSection() + localKey;
      return sesnam;
    }
    return null;
  }

  public Object get(RequestData data, String key) {
    return data.session.getAttribute(key);
  }

  public void put(RequestData data, String key, Object o) {
    if (o == null) {
      data.session.removeAttribute(key);
    }
    else {
      data.session.setAttribute(key, o);
    }
  }

}
