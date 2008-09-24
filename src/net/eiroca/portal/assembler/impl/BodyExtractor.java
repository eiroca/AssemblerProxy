package net.eiroca.portal.assembler.impl;

import java.io.*;
import java.util.*;
import javax.servlet.*;

import org.apache.commons.httpclient.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.util.*;

public class BodyExtractor extends AbstractExtractor {

  public BodyExtractor(ServletContext sc, HashMap p) {
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
    int start;
    int end;
    // Gestione delle sezioni di tipo BODY based
    start = result.indexOf("<body>");
    if (start == -1) {
      start = result.indexOf("<BODY>");
    }
    if (start != -1) {
      end = result.indexOf("</body>");
      if (end == -1) {
        end = result.indexOf("<BODY>");
      }
      if ((start != -1) & (end != -1)) {
        result = result.substring(start + 6, end);
        secs.put(prefix + "BODY", result);
      }
    }
    return (secs.size() > 0 ? secs : null);
  }

}
