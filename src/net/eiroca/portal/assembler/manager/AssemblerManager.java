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
package net.eiroca.portal.assembler.manager;

import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.commons.httpclient.*;
import net.eiroca.portal.assembler.api.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.gen.types.*;
import net.eiroca.portal.assembler.helper.*;
import net.eiroca.portal.assembler.util.*;

/**
 * Gestione delle problematiche del assembler.
 */

public class AssemblerManager {

  private AuthorizationManager auth;
  private ConnectionMananger cm;

  protected AssemblerContext context = AssemblerContext.getInstance();

  /**
   * Inizializzazione del manager. In particolare vengono creati e
   * inizializzatiun manager per le autenticazioni, per l'engine FreeMarker e
   * il manager delle connessioni
   * @param cont
   */
  public AssemblerManager(ServletContext cont) {
    auth = new AuthorizationManager();
    cm = new ConnectionMananger();
  }

  /**
   * Esecuzione della richiesta
   * @param sc
   * @param data
   * @throws AssemblerException
   * @throws IOException
   * @throws ServletException
   */
  public void executeRequest(ServletContext sc, RequestData data) throws AssemblerException, IOException, ServletException {
    // Controlli autenticazione
    auth.checkAuth(sc, data);
    // recupera il template
    boolean error = true;
    try {
      Copy copypart = data.section.getSectionChoice().getCopy();
      if (copypart != null) {
        exceuteTaskCopy(data);
      }
      else {
        exceuteTaskScript(sc, data);
      }
      error = false;
    }
    catch (FatalProcessingException fe) {
      executeTaskError(data);
    }
    context.touch(data.ri.getAppName(), error);
  }

  /**
   * Gestione di una rischesta tramite l'utilizzo di un template FreeMarker.
   * @param sc
   * @param data
   * @throws IOException
   * @throws AssemblerException
   * @throws ServletException
   */
  private final void exceuteTaskScript(ServletContext sc, RequestData data) throws IOException, AssemblerException, ServletException {
    //Mappa contenente tutte le sezioni avute in risposta dai moduli esterni
    Map secs = new HashMap();
    Script script = data.section.getSectionChoice().getScript();
    Resource[] moduli = script.getResource();
    ICache reqCache = data.context.getCacheClass(sc, script.getScriptCache().getID());
    if (reqCache != null) {
      String key = reqCache.getCacheKey(data, "");
    }

    int i;
    String URL;
    Resource res;
    // Processa i vari pezzi della richiesta
    boolean browserRedirect = false;
    for (i = 0; i < moduli.length; i++) {
      Map ss = null;
      res = moduli[i];
      ICache resCache = data.context.getCacheClass(sc, res.getResourceCache().getID());
      String resKey = null;
      if (resCache != null) {
        resKey = resCache.getCacheKey(data, String.valueOf(i));
        if (resKey != null) {
          ss = (Map)resCache.get(data, resKey);
        }
      }
      if (ss == null) {
        // Effettua la richiesta
        URL = decodeURL(res.getURL(), res.getURLMode(), data);
        HttpMethod method = cm.openRequest(data, res.getFollowRedirect(), res.getConnectionID(), URL);
        if (method != null) {
          // Richiesta effettuata
          if (method.getStatusCode() < 300) {
            // Richiesta eseguita con successo, decodifica le sezioni
            IExtractor extr = data.context.getExtractorClass(sc, res.getResourceExtractor().getID());
            ss = extr.decodeSections(res, method);
            if (resKey != null) {
              resCache.put(data, resKey, ss);
            }
          }
          else {
            // Gestisce l'errore della richiesta
            if ((method.getStatusCode() < 400) && (!res.getFollowRedirect())) {
              browserRedirect = true;
            }
            else {
              runError(res.getIgnoreError(), data, URL);
            }
          }
          // Chiude la richiesta
          cm.closeRequest(method);
          if (browserRedirect) {
            break;
          }
        }
        else {
          runError(res.getIgnoreError(), data, URL);
        }
      }
      // Copia le sezioni dell'ultima richiesta nella hashmap globale
      if (ss != null) {
        Iterator it = ss.keySet().iterator();
        String nam;
        String val;
        while (it.hasNext()) {
          nam = (String)it.next();
          val = (String)ss.get(nam);
          secs.put(nam, val);
        }
      }
    }
    if (!browserRedirect) {
      // Recupera lo script da eseguire
      ScriptConfig scrpt = script.getScriptConfig();
      String who = scrpt.getScriptPath();
      IScriptEngine se = context.getScriptEngineClass(sc, scrpt.getScriptEngineID());
      if (who != null) {
        // Esegue lo script FreeMarker
        se.execute(who, data, secs);
      }
      else {
        Utils.raiseError(false, data, "Bad Script");
      }
    }
  }

  /**
   * Gestione di una rischesta tramite l'utilizzo di una vera funzione Assembler
   * @param data
   * @throws AssemblerException
   * @throws IOException
   * @throws ServletException
   */
  private final void exceuteTaskCopy(RequestData data) throws AssemblerException, IOException, ServletException {
    Copy modulo = data.section.getSectionChoice().getCopy();
    String URL = decodeURL(modulo.getURL(), modulo.getURLMode(), data);
    HttpMethod method = cm.openRequest(data, modulo.getFollowRedirect(), modulo.getConnectionID(), URL);
    if (method != null) {
      try {
        if (method.getStatusCode() < 300) {
          // Richiesta eseguita con successo
          String tmp = method.getResponseHeader("Content-Type").getValue();
          if (tmp != null) {
            data.response.setContentType(tmp);
          }
          OutputStream os = data.response.getOutputStream();
          InputStream is = method.getResponseBodyAsStream();
          try {
            int d;
            do {
              d = is.read();
              if (d != -1) {
                os.write(d);
              }
            }
            while (d != -1);
          }
          finally {
            os.close();
            is.close();
          }
        }
        else {
          data.response.sendError(method.getStatusCode(), method.getStatusText());
        }
      }
      finally {
        cm.closeRequest(method);
      }
    }
    else {
      runError(modulo.getIgnoreError(), data, URL);
    }
  }

  /**
   * Gestione delle situazioni di errore in coformita' al comportamento
   * definito nel file di configurazione delle applicazioni.
   * @param data
   * @throws AssemblerException
   * @throws IOException
   * @throws ServletException
   */
  private final void executeTaskError(RequestData data) throws AssemblerException, IOException, ServletException {
    SectionChoice2 mode = data.section.getSectionChoice2();
    boolean ok = false;
    if (mode != null) {
      if (mode.getErrorRedirect() != null) {
        ok = true;
        String URL = mode.getErrorRedirect().getErrorURL();
        if (URL == null) {
          Utils.raiseError(false, data, "Invalid ErrorURL");
        }
        data.response.sendRedirect(URL);
      }
      else if (mode.getErrorScript() != null) {
        Utils.raiseError(false, data, "Unsupported ErrorScript");
        ok = true;
      }
    }
    if (!ok) {
      Utils.raiseError(false, data, "Invalid ErrorMode");
    }
  }

  /**
   * Genera l'URL della richiesta
   * @param res
   * @param data
   * @return
   */
  private final String decodeURL(String URL, ResourceTypeURLModeType URLMode, RequestData data) {
    if (URLMode == ResourceTypeURLModeType.PROCESS) {
      String tmp = data.ri.getAppQueryString();
      URL = MessageFormat.format(URL, new Object[] {data.ri.getAppPath(), new Integer(tmp.length()), tmp});
    }
    return URL;
  }

  /**
   * Genera un errore se nel file di configurazione non e' stato configurato
   * IngoreError=true.
   * @param ingoreError
   * @param data
   * @param URL
   * @throws AssemblerException
   */
  private final void runError(boolean ingoreError, RequestData data, String URL) throws AssemblerException {
    if (!ingoreError) {
      Utils.raiseError(true, data, "Error processing URL [" + URL + "]");
    }
  }

  /**
   * Gesione degli errori. Attualmente genera una pagina HTML con la
   * descrizione del problema avvenuto.
   * @param response
   * @param err
   */
  public final void executeError(HttpServletResponse response, Exception err) {
    context.fatal("Assembler", null, err);
    response.setContentType("text/html");
    try {
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head><title>Assembler ERROR</title></head>");
      out.println("<body bgcolor=\"#ffffff\">");
      out.println("<p>" + err + "</p>");
      StackTraceElement[] stack = err.getStackTrace();
      out.println("<p>Stack:<br/>");
      int max = (stack.length > 3 ? 3 : stack.length);
      for (int i = 0; i < max; i++) {
        out.println(" " + stack[i] + "<br/>");
      }
      out.println("</p>");
      out.println("</body></html>");
      out.close();
    }
    catch (IOException e) {
    }
  }

  /**
   * Gestione della pagina di "Status" del Assembler. Genera una pagina HTML con
   * le informazioni su:<br/>
   * - Properties statiche<br/>
   * - Applicazioni configurate<br/>
   * - Contatori
   * @param request
   * @param response
   */
  public final void executeStatus(HttpServletRequest request, HttpServletResponse response) {
    response.setContentType("text/html");
    try {
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head><title>Assembler STATUS</title></head>");
      out.println("<body bgcolor=\"#ffffff\">");
      out.println("<p><b>Global Properties</b><br/>");
      HashMap map;
      Iterator iter;
      map = context.getProperties();
      iter = map.keySet().iterator();
      while (iter.hasNext()) {
        String nam = (String)iter.next();
        out.println(" " + nam + " = " + map.get(nam) + "<br/>");
      }
      out.println("</p>");
      out.println("<p><b>Assembler properties</b><br/>");
      Assembler conf = context.getAssemblerConf();
      if (conf == null) {
        out.println("<b>MISSING</b><br/>");
      }
      else {
        out.println("Version: " + conf.getVersion() + "<br/>");
        out.println("Description: " + conf.getDescription() + "<br/>");
        out.println("Applications<br/>");
        Application[] apps = conf.getApplications().getApplication();
        for (int i = 0; i < apps.length; i++) {
          out.println("/" + apps[i].getID() + " = " + apps[i].getDisplayName() + "<br/>");
          for (int a = 0; a < apps[i].getSections().getSectionCount(); a++) {
            out.println("Section: " + apps[i].getSections().getSection(a).getID() + " = " + apps[i].getSections().getSection(a).isValid() + "<br/>");
          }
        }
      }
      out.println("</p>");
      out.println("<p><b>Assembler counters</b><br/>");
      map = context.getCounters();
      iter = map.keySet().iterator();
      while (iter.hasNext()) {
        String nam = (String)iter.next();
        out.println(" " + nam + " = " + map.get(nam) + "<br/>");
      }
      out.println("</p>");
      out.println("</body></html>");
      out.close();
    }
    catch (IOException e) {
    }
  }

}
