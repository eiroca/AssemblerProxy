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
