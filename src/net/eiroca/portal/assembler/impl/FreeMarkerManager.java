package net.eiroca.portal.assembler.impl;

import java.io.*;
import java.util.*;
import javax.servlet.*;

import freemarker.template.*;
import net.eiroca.portal.assembler.api.*;
import net.eiroca.portal.assembler.util.*;

/**
 * Gestione delle problematiche legate alla gestione dei Template con FreeMarker
 */
public final class FreeMarkerManager implements IScriptEngine {

  private Configuration cfg;

  private String contentType = "text/html";
  /**
   * Inizializzazione del engine FreeMarker
   * @param sc
   */
  public FreeMarkerManager(ServletContext sc, HashMap p) {
    // Prepare the FreeMarker configuration;
    // - Load templates from the WEB-INF/templates directory of the Web app.
    cfg = Configuration.getDefaultConfiguration();
    // - Load templates from the WEB-INF/templates directory of the Web app.
    cfg.setServletContextForTemplateLoading(sc, "WEB-INF/templates");
    // - Set update dealy to 0 for now, to ease debugging and testing
    // cfg.setTemplateUpdateDelay(0);
    // - Set error handler for debugging HTML templates
    // cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
    // - Use beans wrapper
    cfg.setObjectWrapper(ObjectWrapper.BEANS_WRAPPER);
    // - Set default charset
    cfg.setDefaultEncoding("ISO-8859-1");
    // - Set default locale
    cfg.setLocale(Locale.ITALIAN);
  }

  /**
   * Esegue uno script FreeMarker. Allo script vengono passate le seguenti
   * variabili:<br/>
   * ReqInfo di tipo RequestInfo contenetne le informaizoni parsificate della
   * richiesta<br/>
   * Sections HashMap contenente le sezioni decodificate dai vari moduli.<br/>
   * @param who
   * @param contentType
   * @param data
   * @param secs
   * @throws ServletException
   */
  public void execute(String who, RequestData data, Map secs) throws ServletException {
    try {
      Map root = new HashMap();
      root.put("ReqInfo", data.ri);
      root.put("Sections", secs);
      Template t = cfg.getTemplate(who);
      Writer out = new BufferedWriter(new OutputStreamWriter(data.response.getOutputStream(), t.getEncoding()));
      data.response.setContentType(contentType + "; charset=" + t.getEncoding());
      // Merge the data-model and the template
      t.process(root, out);
      out.flush();
    }
    catch (IOException e) {
      throw new ServletException("IO Exception", e);
    }
    catch (TemplateException e) {
      throw new ServletException("Error while processing FreeMarker", e);
    }
  }

}
