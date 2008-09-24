package net.eiroca.portal.assembler.manager;

import javax.servlet.*;

import net.eiroca.portal.assembler.api.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.util.*;

/**
 * Gestione delle problematiche legate all'autenticazione
 */
public final class AuthorizationManager {

  public AuthorizationManager() {
  }

  /**
   * Esegue i comandi di autenticazione richiesti associati all'appRights
   * usato. In particolare esegue il contollo su "forceCookie", esegue
   * il comando di "decodeCookie" e l'eventuale verifica richiesta con
   * "forceValid"
   * @param data Richiesta da processare
   * @throws FatalProcessingException Viene sollevata l'eccezzione se i
   * controlli richiesti falliscono
   */
  public void checkAuth(ServletContext sc, RequestData data) throws AssemblerException {
    AuthenticationMode authMode = data.appl.getAuthenticationMode();
    if (authMode != null) {
      AccessDef access = data.access;
      IAuthentication authMethod = data.context.getAuthenticationClass(sc, authMode.getAuthenticationID());
      String connID = authMode.getConnectionID();
      authMethod.execute(data, authMode.getAuthenticationID(), connID, access.getForceSSO(), access.getDecode(), access.getForceValid());
    }
  }

}
