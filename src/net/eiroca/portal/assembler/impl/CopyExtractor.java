package net.eiroca.portal.assembler.impl;

import java.io.*;
import java.util.*;
import javax.servlet.*;

import org.apache.commons.httpclient.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.util.*;

public class CopyExtractor extends AbstractExtractor {

  public CopyExtractor(ServletContext sc, HashMap p) {
    super(sc, p);
  }

  /**
   * Estrae i pezzi delle sezioni dalla risposta
   * @param res
   * @param method
   * @return
   */
  public final Map decodeSections(Resource res, HttpMethod method) {
    Map secs = new HashMap();
    String result = null;
    try {
      result = method.getResponseBodyAsString();
    }
    catch (IOException ex) {
    }
    secs.put(prefix + "COPY", result);
    return (secs.size() > 0 ? secs : null);
  }

}
