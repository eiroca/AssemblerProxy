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

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Classe che gestisce le informazioni di autenticazioni gestite dal Assembler.
 */

public final class AuthData implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private final long authTime;

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

  public void setAuth(final HashMap auth) {
    this.auth = auth;
  }

  /**
   * Converte le informazioni di autenticazione in una stringa stampabile
   * @return
   */
  @Override
  public String toString() {
    final StringBuffer out = new StringBuffer();
    out.append("[");
    final Iterator i = auth.keySet().iterator();
    boolean first = true;
    while (i.hasNext()) {
      if (first) {
        first = false;
      }
      else {
        out.append(',');
      }
      final Object name = i.next();
      final Object val = auth.get(name);
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
