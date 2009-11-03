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
package net.eiroca.portal.assembler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.eiroca.library.util.Context;
import net.eiroca.portal.assembler.exception.AssemblerException;
import net.eiroca.portal.assembler.exception.IllegalRequestException;
import net.eiroca.portal.assembler.helper.AssemblerContext;
import net.eiroca.portal.assembler.manager.AssemblerManager;
import net.eiroca.portal.assembler.util.RequestData;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private AssemblerContext myContext = AssemblerContext.getInstance();

  private AssemblerManager assembler;

  private final Log log = LogFactory.getLog(this.getClass());

  /**
   * Inizializzazione della servlet, effettua:
   * - log di init()
   * - aggiornamento configurazione in base agli initParameter della servlet
   * - instanziane di un AssemblerManager
   */
  @Override
  public void init() throws ServletException {
    log.debug("init()");
    Context.declare(Context.PROPERTIESPATH, "/AssemblerConfig.xml");
    myContext.updateConfig(getServletConfig());
    assembler = new AssemblerManager(getServletContext());
  }

  /**
   * Process the HTTP Get request
   * @param request Wrapper della richiesta HTTP
   * @param response Wrapper della risposta HTTP
   * @throws ServletException
   */
  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException {
    execute(request, response, false);
  }

  /**
   * Process the HTTP Post request
   * @param request Wrapper della richiesta HTTP
   * @param response Wrapper della risposta HTTP
   * @throws ServletException
   */
  @Override
  public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException {
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
  public void execute(final HttpServletRequest request, final HttpServletResponse response, final boolean isPost) throws ServletException {
    log.debug("execute()");
    final long start = System.currentTimeMillis();
    boolean error = true;
    try {
      final String pathInfo = request.getPathInfo();
      final String adminContext = getAdminContext();
      if ((pathInfo != null) && (pathInfo.startsWith(adminContext))) {
        assembler.executeStatus(request, response);
      }
      else {
        final RequestData data = new RequestData(request, response, isPost);
        assembler.executeRequest(getServletContext(), data);
      }
      error = false;
    }
    catch (final IllegalRequestException re) {
      assembler.executeError(response, re);
    }
    catch (final AssemblerException pe) {
      assembler.executeError(response, pe);
    }
    catch (final ServletException se) {
      log("Error processing " + request.getRequestURL());
      assembler.executeError(response, se);
    }
    catch (final Exception e) {
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
  @Override
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
    catch (final Exception e) {
      myContext.warning(null, "Missing AdminContext configuration", e);
    }
    if (result == null) {
      result = "/AssemblerStatus/";
    }
    return result;
  }

}
