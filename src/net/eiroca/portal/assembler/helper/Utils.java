package net.eiroca.portal.assembler.helper;

import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.util.*;

/**
 * Classe che contiene metodi "static" di utilita'
 */
public final class Utils {

  /**
   * Converte un cookie nel formato javax.servlet in un cookie in formato
   * org.apache.httpclient
   * @param ck cookie da convertire (non deve essere nullo)
   * @return cookie convertito
   */
  public static final org.apache.commons.httpclient.Cookie convertCookie(javax.servlet.http.Cookie ck) {
    return new org.apache.commons.httpclient.Cookie(
        ck.getDomain() == null ? "" : ck.getDomain(),
        ck.getName(),
        ck.getValue(),
        ck.getPath() == null ? "/" : ck.getPath(),
        ck.getMaxAge(),
        ck.getSecure()
        );
  }

  /**
   * Converte un cookie nel formato org.apache.httpclient in un cookie in formato
   * javax.servlet
   * @param ck cookie da convertire (non deve essere nullo)
   * @return cookie convertito
   */
  public static final javax.servlet.http.Cookie convertCookie(org.apache.commons.httpclient.Cookie ck) {
    return new javax.servlet.http.Cookie(ck.getName(), ck.getValue());
  }

  /**
   * Solleva un exception.
   * @param fatal se True solleva una FatalProcessing altrimenti una IllegalRequest
   * @param data Informazioni sulla richiesta che ha generato il problema, puo' essere null
   * @param msg Messaggio da usare nell'eccezzione
   * @throws AssemblerException Exception generata
   */
  public static final void raiseError(boolean fatal, RequestData data, String msg) throws AssemblerException {
    StringBuffer err = new StringBuffer(msg);
    if (data != null) {
      if (data.ri != null) {
        err.append(" (");
        err.append(data.ri.getAppName());
        err.append('/');
        err.append(data.ri.getAppSection());
        err.append(')');
      }
    }
    if (fatal) {
      throw new FatalProcessingException(err.toString());
    }
    else {
      throw new IllegalRequestException(err.toString());
    }
  }

  /**
   * Restituisce l'endName di un cookie leggendole dal file xml di
   * configurazione. Se nel file di configurazione l'attributo manca viene
   * restituito il srcName.
   * @param cookie Configurazione del cookie
   * @return EndName se != null o SrcName altrimenti
   */
  public static final String getEndName(net.eiroca.portal.assembler.gen.Cookie cookie) {
    String tmp = cookie.getEndName();
    return (tmp == null ? cookie.getSrcName() : tmp);
  }

}
