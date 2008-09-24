package net.eiroca.portal.assembler.util;

import java.util.*;

import net.eiroca.portal.assembler.helper.*;

public class APIClass {

  public AssemblerContext context = AssemblerContext.getInstance();

  public APIClass() {
  }

  protected String getStr(HashMap p, String param, String def) {
    String tmp = (String)p.get(param);
    if (tmp == null) {
      return def;
    }
    else {
      return tmp;
    }
  }

  protected String getStr(HashMap p, String param) {
    String tmp = (String)p.get(param);
    if (tmp == null) {
      context.error(getClass().getName(), "Invalid Definition (Missing " + param + " param)", null);
      return null;
    }
    else {
      return tmp;
    }
  }

}
