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

import java.util.HashMap;
import net.eiroca.portal.assembler.helper.AssemblerContext;

public class APIClass {

  public AssemblerContext context = AssemblerContext.getInstance();

  public APIClass() {
  }

  protected String getStr(final HashMap p, final String param, final String def) {
    final String tmp = (String)p.get(param);
    if (tmp == null) {
      return def;
    }
    else {
      return tmp;
    }
  }

  protected String getStr(final HashMap p, final String param) {
    final String tmp = (String)p.get(param);
    if (tmp == null) {
      context.error(getClass().getName(), "Invalid Definition (Missing " + param + " param)", null);
      return null;
    }
    else {
      return tmp;
    }
  }

}
