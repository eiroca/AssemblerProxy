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
package net.eiroca.portal.assembler.util;

import java.io.*;
import java.util.*;
import javax.servlet.http.*;

import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.helper.*;

/**
 * Classe che contiene le informazioni della richiesta sia in termini di
 * HTTPRequest/HTTPResponse che in termini di informazioni sulle configurazioni
 * da utilizzare nell'evaderla. Tale classe e' solo di comodita' per evitare
 * passaggi chiolometrici di informazioni tra un metodo e l'atro e di
 * efficienza in quanto le elaborazioni eventualmente necessarie per reperire
 * le informazioni di configurazioni vengono qui memorizzate evitando inutili
 * e lente invocazioni di metodi getQualcosa().
 */

public final class RequestData implements Serializable {

  public static final String SES_NAME = "last.section";

  public HttpSession session;
  public HttpServletRequest request;
  public HttpServletResponse response;

  public boolean isPost = false;
  public HashMap cookies = new HashMap();

  public RequestInfo ri;
  public AuthData auth;

  public AssemblerContext context = AssemblerContext.getInstance();

  public Assembler sys;
  public AccessDef access;
  public Application appl;
  public Section section;

  public boolean sameSection;

  public RequestData(HttpServletRequest _request, HttpServletResponse _response, boolean _isPost) throws AssemblerException {
    decodeRequest(_request, _response, _isPost);
  }

  /**
   * Decodifica della richiesta, in particolare viene creato un RequestData
   * con tutte le informazioni/configurazioni associate alla richiesta.
   * @param request
   * @param response
   * @param isPost
   * @return
   * @throws AssemblerException
   */
  public void decodeRequest(HttpServletRequest _request, HttpServletResponse _response, boolean _isPost) throws AssemblerException {
    request = _request;
    response = _response;
    sys = context.getAssemblerConf();
    //Decodifica la richiesta
    isPost = _isPost;
    session = request.getSession();
    javax.servlet.http.Cookie[] cks = request.getCookies();
    if (cks != null) {
      javax.servlet.http.Cookie c;
      for (int i = 0; i < cks.length; i++) {
        c = cks[i];
        cookies.put(c.getName(), c);
      }
    }
    //Decodifica l'URL nelle sue componenti
    ri = new RequestInfo(request, isPost);
    //Recupera le impostazioni per le impostazioni di accesso richieste
    AccessDef[] accessDefs = sys.getConfiguration().getAccessConfig().getAccessDef();
    for (int i = 0; i < accessDefs.length; i++) {
      AccessDef tmp = accessDefs[i];
      if (tmp.getID().equals("")) {
        access = tmp;
      }
      if (tmp.getID().equals(ri.getAppRights())) {
        access = tmp;
        break;
      }
    }
    //Recupera le impostazioni per l'applicazione invocata
    String app = ri.getAppName();
    Application[] apps = sys.getApplications().getApplication();
    for (int i = 0; i < apps.length; i++) {
      Application tmp = apps[i];
      if (tmp.getID().equals(app)) {
        appl = tmp;
        break;
      }
    }
    if (appl == null) {
      Utils.raiseError(false, null, "Unknown Application (" + app + ")");
    }
    //Recupera le impostazioni per della sezione invocata
    String sec = ri.getAppSection();
    Section[] secs = appl.getSections().getSection();
    for (int i = 0; i < secs.length; i++) {
      Section tmp = secs[i];
      if (tmp.getID().equals(sec)) {
        section = tmp;
        break;
      }
    }
    if (section == null) {
      Utils.raiseError(false, null, "Unknown Application Section (" + app + "/" + sec + ")");
    }
    sameSection = calcSameSection();
  }

  private boolean calcSameSection() {
    // Verifica se la richiesta e' simile alla precedente
    boolean sameSection = false;
    RequestInfo lastRI = (RequestInfo)session.getAttribute(SES_NAME);
    if (lastRI != null) {
      if ((lastRI.getAppName().equals(ri.getAppName())) & (lastRI.getAppSection().equals(ri.getAppSection()))) {
        sameSection = true;
      }
    }
    // Salva in session l'applicazione/sezione corrente
    session.setAttribute(SES_NAME, ri);
    return sameSection;
  }

}
