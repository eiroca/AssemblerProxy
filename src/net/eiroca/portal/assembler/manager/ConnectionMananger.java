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

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.eiroca.portal.assembler.exception.AssemblerException;
import net.eiroca.portal.assembler.gen.Connection;
import net.eiroca.portal.assembler.gen.Connections;
import net.eiroca.portal.assembler.gen.Cookie;
import net.eiroca.portal.assembler.helper.Utils;
import net.eiroca.portal.assembler.util.RequestData;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Gestione delle problematiche legate alla connessione
 */
public final class ConnectionMananger {
  private final Log log = LogFactory.getLog(this.getClass());

  public ConnectionMananger() {
  }

  /**
   * Restituisce la configurazione della connessione specificata
   * @param connID ID della connessione voluta
   * @return La configurazione della connessione richiesta
   * @throws AssemblerException Solleva una IllegalArgumentException se l'ID
   * non e' associato a nessuna configurazione
   */
  public Connection getConnection(final RequestData data, final String connID) throws AssemblerException {
    final Connections conns = data.appl.getConnections();
    Connection tmp = null;
    for (int i = 0; i < conns.getConnectionCount(); i++) {
      tmp = conns.getConnection(i);
      if (tmp.getID().equals(connID)) {
        return tmp;
      }
    }
    Utils.raiseError(false, data, "Bad Section Definition");
    return null;
  }

  /**
   * Esegue una richiesta verso un modulo esterno
   * @param data
   * @param res
   * @param cc
   * @param url
   * @return
   */
  public HttpMethod openRequest(final RequestData data, final boolean followRedirect, final String connID, final String url) throws AssemblerException {
    final Connection cc = getConnection(data, connID);
    //Recupera i dati del client equivalente
    final HttpClient client = getHttpClient(data, cc);
    final HttpState st = getHttpState(client);
    final HttpMethod method = getHttpMethod(data, followRedirect, url);
    final String domain = getDomain(method);
    //Copia header e cookie della richiesta originaria sulla richiesta fatta dal
    //Assembler
    copyHeader(method, data);
    copyCookie(data, cc, st, domain);
    //execute the method
    try {
      client.executeMethod(method);
    }
    catch (final HttpException he) {
      System.err.println("Http error connecting to '" + url + "'");
      System.err.println(he.getMessage());
      return null;
    }
    catch (final IOException ioe) {
      System.err.println("Unable to connect to '" + url + "'");
      return null;
    }
    //aggiorna i cookie del utente originario (nella risposta finale)
    updateCookie(method, data, cc, st);
    //Gestione degli HTTP Redirect
    final int status = method.getStatusCode();
    if ((status >= 300) && (status < 400)) {
      if (!followRedirect) {
        // Manda al utente originario (risposta finale) il redirect
        final Header locationHeader = method.getResponseHeader("location");
        if (locationHeader == null) {
          System.err.println("Invalid Redirect");
          return null;
        }
        final String location = locationHeader.getValue();
        try {
          data.response.setContentType("text/html");
          final PrintWriter out = data.response.getWriter();
          String body = method.getResponseBodyAsString();
          if ((body == null) || (body.equals(""))) {
            body = "<html><body>Redirected...</body></head>";
          }
          out.println(body);
          out.close();

          data.response.sendRedirect(location);
        }
        catch (final IOException e) {
          System.err.println("Invalid Redirect");
          return null;
        }
      }
    }
    return method;
  }

  /**
   * Chiude una richiesta in modo pulito
   * @param method
   */
  public void closeRequest(final HttpMethod method) {
    method.releaseConnection();
    method.recycle();
  }

  /**
   * Recupera dalla sessione (o crea) un HTTP Client per gestire le richieste
   * @param data
   * @param cc
   * @return
   */
  private HttpClient getHttpClient(final RequestData data, final Connection cc) {
    final String base = data.sys.getApplications().getSesNameHTTPClients();
    Map clients = (Map)data.session.getAttribute(base);
    if (clients == null) {
      clients = new HashMap();
    }
    HttpClient client;
    final String name = data.appl.getID() + "_" + cc.getID();
    client = (HttpClient)clients.get(name);
    if (client == null) {
      client = makeHttpClient(cc);
      clients.put(name, client);
      data.session.setAttribute(base, clients);
    }
    return client;
  }

  /**
   * Crea un nuovo HTTP client
   * @param cc
   * @return
   */
  private HttpClient makeHttpClient(final Connection cc) {
    //create a singular HttpClient object
    final HttpClient client = new HttpClient();
    //establish a connection within 5 seconds
    client.setConnectionTimeout(cc.getTimeOut());
    UsernamePasswordCredentials creds = null;
    if ((cc.getUsername() != null) && (cc.getPassword() != null)) {
      creds = new UsernamePasswordCredentials(cc.getUsername(), cc.getPassword());
    }
    //set username / password
    if (creds != null) {
      client.getState().setCredentials(null, null, creds);
    }
    return client;
  }

  /**
   * Prepara la richiesta da fare
   * @param data
   * @param res
   * @param url
   * @return
   */
  private HttpMethod getHttpMethod(final RequestData data, final boolean followRedirect, final String url) {
    HttpMethod method;
    // create a method object
    if (data.isPost) {
      method = new PostMethod(url);
      final Map par = data.request.getParameterMap();
      final NameValuePair[] prm = new NameValuePair[par.size()];
      final Iterator i = par.keySet().iterator();
      int cnt = 0;
      String name;
      String val = "";
      Object obj;
      while (i.hasNext()) {
        name = (String)i.next();

        obj = par.get(name);
        if (obj instanceof String[]) {
          final String[] vals = (String[])obj;
          if (vals.length == 1) {
            val = vals[0];
          }
          else {
            log.error("ConnectionManager.getHttpMethod() ==> Errore decodifica parametri della request ( " + " name : " + name + " lunghezza : " + vals.length + " -- content : " + vals.toString() + " -- class : " + vals.getClass() + " )");
          }
        }
        else if (obj instanceof String) {
          val = (String)obj;
        }
        else {
          log.error("ConnectionManager.getHttpMethod() ==> Errore decodifica parametri della request ( " + name + " : " + obj.toString() + " class : " + obj.getClass() + ")");
        }
        //val = (String) par.get(name);
        prm[cnt] = new NameValuePair(name, val);
        cnt++;
      }
      ((PostMethod)method).setRequestBody(prm);
    }
    else {
      method = new GetMethod(url);
    }
    method.setFollowRedirects(followRedirect);
    method.setStrictMode(false);
    return method;
  }

  /**
   * Recupera lo stato dell HTTP Client (cookie)
   * @param client
   * @return
   */
  private HttpState getHttpState(final HttpClient client) {
    final HttpState st = client.getState();
    st.purgeExpiredCookies();
    return st;
  }

  /**
   * Estra il dominio della richiesta che il Assembler andra' a fare
   * @param method
   * @return
   */
  private String getDomain(final HttpMethod method) {
    try {
      final URI dst = method.getURI();
      final int port = dst.getPort();
      final String host = dst.getHost();
      if (port == 80) {
        return host;
      }
      else {
        return host + ":" + port;
      }
    }
    catch (final URIException e) {
      log.error("getDomain: " + e.toString());
    }
    return null;
  }

  /**
   * Copia i cookie dalla richiesta originaria alla richiesta fatta dal Assembler
   * verso l'applicazione esterna
   * @param data
   * @param cc
   * @param st
   * @param domain
   */
  private void copyCookie(final RequestData data, final Connection cc, final HttpState st, final String domain) {
    org.apache.commons.httpclient.Cookie tmpCookie;
    final net.eiroca.portal.assembler.gen.Cookie[] cookies = cc.getCookie();
    for (final Cookie cookie : cookies) {
      final javax.servlet.http.Cookie c = (javax.servlet.http.Cookie)data.cookies.get(cookie.getSrcName());
      if (c != null) {
        tmpCookie = Utils.convertCookie(c);
        tmpCookie.setName(Utils.getEndName(cookie));
        tmpCookie.setDomain(domain);
        st.addCookie(tmpCookie);
      }
    }
  }

  /**
   * Copia gli header della richiesta originaria nella richiesta finale.
   * Vengono copiati sia gli header originari (ad esclusione di host) sia
   * quelli "fittizzi" dovuti all'inserimento dell'autenticazione.
   * @param method
   * @param data
   */
  private void copyHeader(final HttpMethod method, final RequestData data) {
    final Enumeration e = data.request.getHeaderNames();
    String name;
    String val;
    // Copia gli header originari
    boolean copy;
    while (e.hasMoreElements()) {
      name = (String)e.nextElement();
      copy = true;
      if (name.equalsIgnoreCase("Host")) {
        copy = false;
      }
      if (copy) {
        val = data.request.getHeader(name);
        method.setRequestHeader(name, val);
      }
    }
    // Copia gli header legati all'autenticazione
    if (data.auth != null) {
      final Map info = data.auth.getAuth();
      final Iterator i = info.keySet().iterator();
      while (i.hasNext()) {
        name = (String)i.next();
        val = (String)info.get(name);
        method.setRequestHeader(name, val);
      }
    }
  }

  /**
   * Aggiorna i cookie della risposta finale verso l'utente finale
   * @param method
   * @param data
   * @param cc
   * @param st
   */
  private void updateCookie(final HttpMethod method, final RequestData data, final Connection cc, final HttpState st) {
    if (method.getStatusCode() < 300) {
      final org.apache.commons.httpclient.Cookie[] stcook = st.getCookies();
      if (stcook != null) {
        String name;
        for (final org.apache.commons.httpclient.Cookie element : stcook) {
          name = element.getName();
          net.eiroca.portal.assembler.gen.Cookie cookConf = null;
          final net.eiroca.portal.assembler.gen.Cookie[] cook = cc.getCookie();
          for (final Cookie element2 : cook) {
            if (Utils.getEndName(element2).equals(name)) {
              cookConf = element2;
              break;
            }
          }
          if ((cookConf != null) && (cookConf.getAccess() == net.eiroca.portal.assembler.gen.types.CookieAccessType.GLOBAL)) {
            final javax.servlet.http.Cookie ccc = new javax.servlet.http.Cookie(cookConf.getSrcName(), element.getValue());
            data.response.addCookie(ccc);
          }
        }
      }
    }
  }

}
