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

import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import net.eiroca.portal.assembler.api.IAuthentication;
import net.eiroca.portal.assembler.exception.AssemblerException;
import net.eiroca.portal.assembler.exception.FatalProcessingException;
import net.eiroca.portal.assembler.helper.AssemblerContext;
import net.eiroca.portal.assembler.manager.ConnectionMananger;
import net.eiroca.portal.assembler.util.APIClass;
import net.eiroca.portal.assembler.util.AuthData;
import net.eiroca.portal.assembler.util.RequestData;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;

public class CommonAuthentication extends APIClass implements IAuthentication {

  private final String PRM_AUTHCOOKIE = "AuthCookie";
  private final String PRM_SESNAMEAUTH = "SesNameAuth";
  private final String PRM_REFERSUBSTR = "ReferSubStr";
  private final String PRM_CACHETIMEOUT = "CacheTimeOut";
  private final String PRM_URL = "URL";
  private final String PRM_PREFIX = "Prefix";

  public AssemblerContext context = AssemblerContext.getInstance();

  private final String authCookieName;
  private final String sesName;
  private final String referSubStr;
  private final int cacheTimeOut;
  private final String url;
  private final String prefix;

  public CommonAuthentication(final ServletContext sc, final HashMap p) {
    String tmp;
    authCookieName = getStr(p, PRM_AUTHCOOKIE);
    sesName = getStr(p, PRM_SESNAMEAUTH);
    referSubStr = getStr(p, PRM_REFERSUBSTR);
    tmp = getStr(p, PRM_CACHETIMEOUT);
    cacheTimeOut = Integer.parseInt(tmp);
    url = getStr(p, PRM_URL);
    prefix = getStr(p, PRM_PREFIX);
  }

  public void execute(final RequestData data, final String authID, final String connID, final boolean forceSSO, final boolean decode, final boolean forceValid) throws FatalProcessingException {
    final javax.servlet.http.Cookie authCookie = (javax.servlet.http.Cookie)data.cookies.get(authCookieName);
    final String cookieVal = (authCookie != null ? authCookie.getValue() : null);
    if ((forceSSO) & (cookieVal == null)) {
      throw new FatalProcessingException("Invalid Authentication (Cookie Missing)");
    }
    if (decode | forceValid) {
      AuthData auth = null;
      try {
        auth = decriptAuth(data, connID);
      }
      catch (final AssemblerException er) {
        System.err.println(er);
      }
      if (decode) {
        data.auth = auth;
      }
      if ((forceValid) & (auth == null)) {
        throw new FatalProcessingException("Invalid Authentication (Cookie Invalid)");
      }
    }
  }

  /**
   * Decodifica dell'autenticazione. Viene verificato se e' possibile
   * utilizzare le informazioni dalla cache e se non lo e' viene invocato
   * il servizio esterno di decodifica (BroadVision). Aggiorna (in caso di
   * successo) la cache.
   * @param data
   * @return
   * @throws AssemblerException
   */
  private AuthData decriptAuth(final RequestData data, final String connID) throws AssemblerException {
    final HttpSession ses = data.session;
    AuthData auth = (AuthData)ses.getAttribute(sesName);
    if (auth != null) {
      if (isValid(data, auth)) {
        return auth;
      }
      ses.removeAttribute(sesName);
    }
    auth = readAuth(data, connID);
    if (auth != null) {
      ses.setAttribute(sesName, auth);
    }
    return auth;
  }

  /**
   * Verifica se le informaizoni di autenticazione in cache sono ancora valide.
   * Sono valide se e soltanto se il Referer della richiesta contiene una
   * sottostringa (ReferSubStr) letta da file di configurazione xml e se il
   * time-out di validita' (CacheTimeOut) non e' scaduto.
   * @param data
   * @param auth
   * @return
   */
  private boolean isValid(final RequestData data, final AuthData auth) {
    final String refer = data.request.getHeader("Referer");
    if (refer == null) {
      return false;
    }
    if (refer.indexOf(referSubStr) == -1) {
      return false;
    }
    if ((System.currentTimeMillis() - auth.getAuthTime()) > cacheTimeOut) {
      return false;
    }
    return true;
  }

  /**
   * Effettua la decodifica delle informazioni di autenticazione utilizzando
   * il servizio esterno (URL di BroadVision).
   * @param data
   * @return
   * @throws AssemblerException
   */
  private AuthData readAuth(final RequestData data, final String connID) throws AssemblerException {
    final ConnectionMananger cm = new ConnectionMananger();
    if (url == null) {
      return null;
    }
    final HttpMethod method = cm.openRequest(data, false, connID, url);
    // Gestisce gli errori
    if (method == null) {
      return null;
    }
    if (method.getStatusCode() >= 400) {
      cm.closeRequest(method);
      System.err.println("WrongStatusCode '" + method.getStatusCode() + "'");
      return null;
    }
    // Esito OK estrai le informazioni di autenticazione
    final AuthData auth = new AuthData();
    final Map authInfo = auth.getAuth();
    final Header[] headers = method.getResponseHeaders();
    String name;
    boolean valid = false;
    for (final Header header : headers) {
      name = header.getName();
      if (name.toUpperCase().startsWith(prefix)) {
        authInfo.put(name, header.getValue());
        valid = true;
      }
    }
    cm.closeRequest(method);
    return (valid ? auth : null);
  }

}
