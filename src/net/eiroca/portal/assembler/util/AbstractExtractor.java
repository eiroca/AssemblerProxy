package net.eiroca.portal.assembler.util;

import java.util.*;
import javax.servlet.*;

import net.eiroca.portal.assembler.api.*;

abstract public class AbstractExtractor extends APIClass implements IExtractor {

  protected String prefix;

  public AbstractExtractor(ServletContext sc, HashMap p) {
    prefix = getStr(p, "prefix", "");
  }

}
