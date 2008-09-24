package net.eiroca.portal.assembler.impl;

import java.io.*;
import java.util.*;
import javax.servlet.*;

import org.apache.commons.httpclient.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.util.*;

public class TAGExtractor extends AbstractExtractor {

  public TAGExtractor(ServletContext sc, HashMap p) {
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
    // Gestione delle sezioni di tipo TAG based
    int last = 0;
    while (last < result.length()) {
      start = result.indexOf("<!-- BEGIN SECTION:", last);
      if (start != -1) {
        StringBuffer name = new StringBuffer();
        start = start + 20;
        while (result.charAt(start) != ' ') {
          name.append(result.charAt(start));
          start++;
        }
        end = result.indexOf("<!-- END SECTION", start);
        if (end != -1) {
          String finalName = prefix + name.toString();
          String out = result.substring(start + 4, end);
          secs.put(finalName, out);
          last = end + 16;
        }
        else {
          break;
        }
      }
      else {
        break;
      }
    }
    return (secs.size() > 0 ? secs : null);
  }

}
