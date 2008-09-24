package net.eiroca.portal.assembler;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.commons.logging.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.helper.*;
import net.eiroca.portal.assembler.manager.*;
import net.eiroca.portal.assembler.util.*;

/**
 * <p>Title: Assembler</p>
 * <p>Description: </p>
 * <p>Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 *
 * Servlet del Assembler
 */
public class AssemblerServlet extends HttpServlet {

  private AssemblerContext myContext = AssemblerContext.getInstance();

  private AssemblerManager assembler;

  private Log log = LogFactory.getLog(this.getClass());

  /**
   * Inizializzazione della servlet, effettua:
   * - log di init()
   * - aggiornamento configurazione in base agli initParameter della servlet
   * - instanziane di un AssemblerManager
   */
  public void init() throws ServletException {
    log.debug("init()");
    myContext.declare(AssemblerContext.PROPERTIESPATH, "/AssemblerConfig.xml");
    myContext.updateConfig(getServletConfig());
    assembler = new AssemblerManager(getServletContext());
  }

  /**
   * Process the HTTP Get request
   * @param request Wrapper della richiesta HTTP
   * @param response Wrapper della risposta HTTP
   * @throws ServletException
   */
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
    execute(request, response, false);
  }

  /**
   * Process the HTTP Post request
   * @param request Wrapper della richiesta HTTP
   * @param response Wrapper della risposta HTTP
   * @throws ServletException
   */
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
    execute(request, response, true);
  }

  /**
   * Esegue la richiesta
   * @param request Wrapper della richiesta HTTP
   * @param response Wrapper della risposta HTTP
   * @param isPost se true la richiesta originaria era un Post
   * @throws ServletException Le eccezzioni sono catchate internamente e non
   * vengo propagate al container
   */
  public void execute(HttpServletRequest request, HttpServletResponse response, boolean isPost) throws ServletException {
    log.debug("execute()");
    long start = System.currentTimeMillis();
    boolean error = true;
    try {
      String pathInfo = request.getPathInfo();
      String adminContext = getAdminContext();
      if ((pathInfo != null) && (pathInfo.startsWith(adminContext))) {
        assembler.executeStatus(request, response);
      }
      else {
        RequestData data = new RequestData(request, response, isPost);
        assembler.executeRequest(getServletContext(), data);
      }
      error = false;
    }
    catch (IllegalRequestException re) {
      assembler.executeError(response, re);
    }
    catch (AssemblerException pe) {
      assembler.executeError(response, pe);
    }
    catch (ServletException se) {
      log("Error processing " + request.getRequestURL());
      assembler.executeError(response, se);
    }
    catch (Exception e) {
      assembler.executeError(response, e);
    }
    if (log.isInfoEnabled()) {
      long elapsed = System.currentTimeMillis() - start;
      if (elapsed < 0) {
        elapsed = 0;
      }
      log.info("execute();" + isPost + ";" + error + ";" + elapsed + ";\"" + request.getRequestURI() + "\"");
    }
    myContext.touch("Assembler.execute()", error);
  }

  /**
   * Clean up resources
   */
  public void destroy() {
    log.debug("destroy()");
    assembler = null;
    myContext = null;
  }

  /**
   * Restituisce il contesto (URL Path) a cui risponde l'interfaccia di status
   * del Assembler
   * @return Stringa lette dalle file xml di configurazione oppure in caso di
   * errori o mancata configurazione il valore "/AssemblerStatus/"
   */
  private final String getAdminContext() {
    String result = null;
    try {
      result = myContext.getAssemblerConf().getConfiguration().getAdminConfig().getAdminContext();
    }
    catch (Exception e) {
      myContext.warning(null, "Missing AdminContext configuration", e);
    }
    if (result == null) {
      result = "/AssemblerStatus/";
    }
    return result;
  }

}
