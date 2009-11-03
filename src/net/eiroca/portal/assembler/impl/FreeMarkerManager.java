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
package net.eiroca.portal.assembler.impl;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import net.eiroca.portal.assembler.api.IScriptEngine;
import net.eiroca.portal.assembler.util.RequestData;
import freemarker.template.Configuration;
import freemarker.template.ObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Gestione delle problematiche legate alla gestione dei Template con FreeMarker
 */
public final class FreeMarkerManager implements IScriptEngine {

  private final Configuration cfg;

  private final String contentType = "text/html";
  /**
   * Inizializzazione del engine FreeMarker
   * @param sc
   */
  public FreeMarkerManager(final ServletContext sc, final HashMap p) {
    // Prepare the FreeMarker configuration;
    // - Load templates from the WEB-INF/templates directory of the Web app.
    cfg = new Configuration();
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
  public void execute(final String who, final RequestData data, final Map secs) throws ServletException {
    try {
      final Map root = new HashMap();
      root.put("ReqInfo", data.ri);
      root.put("Sections", secs);
      final Template t = cfg.getTemplate(who);
      final Writer out = new BufferedWriter(new OutputStreamWriter(data.response.getOutputStream(), t.getEncoding()));
      data.response.setContentType(contentType + "; charset=" + t.getEncoding());
      // Merge the data-model and the template
      t.process(root, out);
      out.flush();
    }
    catch (final IOException e) {
      throw new ServletException("IO Exception", e);
    }
    catch (final TemplateException e) {
      throw new ServletException("Error while processing FreeMarker", e);
    }
  }

}
