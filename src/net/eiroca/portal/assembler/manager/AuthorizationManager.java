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

import javax.servlet.ServletContext;
import net.eiroca.portal.assembler.api.IAuthentication;
import net.eiroca.portal.assembler.exception.AssemblerException;
import net.eiroca.portal.assembler.exception.FatalProcessingException;
import net.eiroca.portal.assembler.gen.AccessDef;
import net.eiroca.portal.assembler.gen.AuthenticationMode;
import net.eiroca.portal.assembler.util.RequestData;

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
  public void checkAuth(final ServletContext sc, final RequestData data) throws AssemblerException {
    final AuthenticationMode authMode = data.appl.getAuthenticationMode();
    if (authMode != null) {
      final AccessDef access = data.access;
      final IAuthentication authMethod = data.context.getAuthenticationClass(sc, authMode.getAuthenticationID());
      final String connID = authMode.getConnectionID();
      authMethod.execute(data, authMode.getAuthenticationID(), connID, access.getForceSSO(), access.getDecode(), access.getForceValid());
    }
  }

}
