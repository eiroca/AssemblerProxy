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
import java.util.*;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.logging.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.helper.*;
import net.eiroca.portal.assembler.util.*;

/**
 * Gestione delle problematiche legate alla connessione
 */
public final class ConnectionMananger {
  private Log log = LogFactory.getLog(this.getClass());

  public ConnectionMananger() {
  }

  /**
   * Restituisce la configurazione della connessione specificata
   * @param connID ID della connessione voluta
   * @return La configurazione della connessione richiesta
   * @throws AssemblerException Solleva una IllegalArgumentException se l'ID
   * non e' associato a nessuna configurazione
   */
  public Connection getConnection(RequestData data, String connID) throws AssemblerException {
    Connections conns = data.appl.getConnections();
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
  public HttpMethod openRequest(RequestData data, boolean followRedirect, String connID, String url) throws AssemblerException {
    Connection cc = getConnection(data, connID);
    //Recupera i dati del client equivalente
    HttpClient client = getHttpClient(data, cc);
    HttpState st = getHttpState(client);
    HttpMethod method = getHttpMethod(data, followRedirect, url);
    String domain = getDomain(method);
    //Copia header e cookie della richiesta originaria sulla richiesta fatta dal
    //Assembler
    copyHeader(method, data);
    copyCookie(data, cc, st, domain);
    //execute the method
    try {
      client.executeMethod(method);
    }
    catch (HttpException he) {
      System.err.println("Http error connecting to '" + url + "'");
      System.err.println(he.getMessage());
      return null;
    }
    catch (IOException ioe) {
      System.err.println("Unable to connect to '" + url + "'");
      return null;
    }
    //aggiorna i cookie del utente originario (nella risposta finale)
    updateCookie(method, data, cc, st);
    //Gestione degli HTTP Redirect
    int status = method.getStatusCode();
    if ((status >= 300) && (status < 400)) {
      if (!followRedirect) {
        // Manda al utente originario (risposta finale) il redirect
        Header locationHeader = method.getResponseHeader("location");
        if (locationHeader == null) {
          System.err.println("Invalid Redirect");
          return null;
        }
        String location = locationHeader.getValue();
        try {
          data.response.setContentType("text/html");
          PrintWriter out = data.response.getWriter();
          String body = method.getResponseBodyAsString();
          if ((body == null) || (body.equals(""))) {
            body = "<html><body>Redirected...</body></head>";
          }
          out.println(body);
          out.close();

          data.response.sendRedirect(location);
        }
        catch (IOException e) {
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
  public void closeRequest(HttpMethod method) {
    method.releaseConnection();
    method.recycle();
  }

  /**
   * Recupera dalla sessione (o crea) un HTTP Client per gestire le richieste
   * @param data
   * @param cc
   * @return
   */
  private HttpClient getHttpClient(RequestData data, Connection cc) {
    String base = data.sys.getApplications().getSesNameHTTPClients();
    Map clients = (Map)data.session.getAttribute(base);
    if (clients == null) {
      clients = new HashMap();
    }
    HttpClient client;
    String name = data.appl.getID() + "_" + cc.getID();
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
  private HttpClient makeHttpClient(Connection cc) {
    //create a singular HttpClient object
    HttpClient client = new HttpClient();
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
  private HttpMethod getHttpMethod(RequestData data, boolean followRedirect, String url) {
    HttpMethod method;
    // create a method object
    if (data.isPost) {
      method = new PostMethod(url);
      Map par = data.request.getParameterMap();
      NameValuePair[] prm = new NameValuePair[par.size()];
      Iterator i = par.keySet().iterator();
      int cnt = 0;
      String name;
      String val = "";
      Object obj;
      while (i.hasNext()) {
        name = (String)i.next();

        obj = par.get(name);
        if (obj instanceof String[]) {
          String[] vals = (String[])obj;
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
  private HttpState getHttpState(HttpClient client) {
    HttpState st = client.getState();
    st.purgeExpiredCookies();
    return st;
  }

  /**
   * Estra il dominio della richiesta che il Assembler andra' a fare
   * @param method
   * @return
   */
  private String getDomain(HttpMethod method) {
    try {
      URI dst = method.getURI();
      int port = dst.getPort();
      String host = dst.getHost();
      if (port == 80) {
        return host;
      }
      else {
        return host + ":" + port;
      }
    }
    catch (URIException e) {
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
  private void copyCookie(RequestData data, Connection cc, HttpState st, String domain) {
    org.apache.commons.httpclient.Cookie tmpCookie;
    net.eiroca.portal.assembler.gen.Cookie[] cookies = cc.getCookie();
    for (int i = 0; i < cookies.length; i++) {
      net.eiroca.portal.assembler.gen.Cookie cookie = cookies[i];
      javax.servlet.http.Cookie c = (javax.servlet.http.Cookie)data.cookies.get(cookie.getSrcName());
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
  private void copyHeader(HttpMethod method, RequestData data) {
    Enumeration e = data.request.getHeaderNames();
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
      Map info = data.auth.getAuth();
      Iterator i = info.keySet().iterator();
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
  private void updateCookie(HttpMethod method, RequestData data, Connection cc, HttpState st) {
    if (method.getStatusCode() < 300) {
      org.apache.commons.httpclient.Cookie[] stcook = st.getCookies();
      if (stcook != null) {
        String name;
        for (int i = 0; i < stcook.length; i++) {
          name = stcook[i].getName();
          net.eiroca.portal.assembler.gen.Cookie cookConf = null;
          net.eiroca.portal.assembler.gen.Cookie[] cook = cc.getCookie();
          for (int j = 0; j < cook.length; j++) {
            if (Utils.getEndName(cook[j]).equals(name)) {
              cookConf = cook[j];
              break;
            }
          }
          if ((cookConf != null) && (cookConf.getAccess() == net.eiroca.portal.assembler.gen.types.CookieAccessType.GLOBAL)) {
            javax.servlet.http.Cookie ccc = new javax.servlet.http.Cookie(cookConf.getSrcName(), stcook[i].getValue());
            data.response.addCookie(ccc);
          }
        }
      }
    }
  }

}
