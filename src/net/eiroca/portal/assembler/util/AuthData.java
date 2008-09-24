package net.eiroca.portal.assembler.util;

import java.io.*;
import java.util.*;

/**
 * Classe che gestisce le informazioni di autenticazioni gestite dal Assembler.
 */

public final class AuthData implements Serializable {

  private long authTime;

  private HashMap auth = new HashMap();

  public AuthData() {
    authTime = System.currentTimeMillis();
  }

  /**
   * Restituisce un HashMap con le informazioni di autenticazione
   * @return
   */
  public HashMap getAuth() {
    return auth;
  }

  public void setAuth(HashMap auth) {
    this.auth = auth;
  }

  /**
   * Converte le informazioni di autenticazione in una stringa stampabile
   * @return
   */
  public String toString() {
    StringBuffer out = new StringBuffer();
    out.append("[");
    Iterator i = auth.keySet().iterator();
    boolean first = true;
    while (i.hasNext()) {
      if (first) {
        first = false;
      }
      else {
        out.append(',');
      }
      Object name = (String)i.next();
      Object val = auth.get(name);
      out.append(name + "=" + val);
    }
    out.append("]");
    return out.toString();

  }

  /**
   * Restituisce quando e' stata popolate le informazioni di autenticazione
   * @return tempo in millisecondi
   */
  public long getAuthTime() {
    return authTime;
  }

}