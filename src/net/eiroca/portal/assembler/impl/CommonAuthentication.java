package net.eiroca.portal.assembler.impl;

import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.commons.httpclient.*;
import net.eiroca.portal.assembler.api.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.helper.*;
import net.eiroca.portal.assembler.manager.*;
import net.eiroca.portal.assembler.util.*;

public class CommonAuthentication extends APIClass implements IAuthentication {

  private final String PRM_AUTHCOOKIE = "AuthCookie";
  private final String PRM_SESNAMEAUTH = "SesNameAuth";
  private final String PRM_REFERSUBSTR = "ReferSubStr";
  private final String PRM_CACHETIMEOUT = "CacheTimeOut";
  private final String PRM_URL = "URL";
  private final String PRM_PREFIX = "Prefix";

  public AssemblerContext context = AssemblerContext.getInstance();

  private String authCookieName;
  private String sesName;
  private String referSubStr;
  private int cacheTimeOut;
  private String url;
  private String prefix;

  public CommonAuthentication(ServletContext sc, HashMap p) {
    String tmp;
    authCookieName = getStr(p, PRM_AUTHCOOKIE);
    sesName = getStr(p, PRM_SESNAMEAUTH);
    referSubStr = getStr(p, PRM_REFERSUBSTR);
    tmp = getStr(p, PRM_CACHETIMEOUT);
    cacheTimeOut = Integer.parseInt(tmp);
    url = getStr(p, PRM_URL);
    prefix = getStr(p, PRM_PREFIX);
  }

  public void execute(RequestData data, String authID, String connID, boolean forceSSO, boolean decode, boolean forceValid) throws FatalProcessingException {
    javax.servlet.http.Cookie authCookie = (javax.servlet.http.Cookie)data.cookies.get(authCookieName);
    String cookieVal = (authCookie != null ? authCookie.getValue() : null);
    if ((forceSSO) & (cookieVal == null)) {
      throw new FatalProcessingException("Invalid Authentication (Cookie Missing)");
    }
    if (decode | forceValid) {
      AuthData auth = null;
      try {
        auth = decriptAuth(data, connID);
      }
      catch (AssemblerException er) {
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
  private AuthData decriptAuth(RequestData data, String connID) throws AssemblerException {
    HttpSession ses = data.session;
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
  private boolean isValid(RequestData data, AuthData auth) {
    String refer = data.request.getHeader("Referer");
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
  private AuthData readAuth(RequestData data, String connID) throws AssemblerException {
    ConnectionMananger cm = new ConnectionMananger();
    if (url == null) {
      return null;
    }
    HttpMethod method = cm.openRequest(data, false, connID, url);
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
    AuthData auth = new AuthData();
    Map authInfo = auth.getAuth();
    Header[] headers = method.getResponseHeaders();
    String name;
    boolean valid = false;
    for (int i = 0; i < headers.length; i++) {
      name = headers[i].getName();
      if (name.toUpperCase().startsWith(prefix)) {
        authInfo.put(name, headers[i].getValue());
        valid = true;
      }
    }
    cm.closeRequest(method);
    return (valid ? auth : null);
  }

}
