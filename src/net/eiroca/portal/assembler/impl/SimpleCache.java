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
package net.eiroca.portal.assembler.impl;

import java.util.HashMap;
import javax.servlet.ServletContext;
import net.eiroca.portal.assembler.api.ICache;
import net.eiroca.portal.assembler.exception.AssemblerException;
import net.eiroca.portal.assembler.util.APIClass;
import net.eiroca.portal.assembler.util.RequestData;

public class SimpleCache extends APIClass implements ICache {

  public SimpleCache(final ServletContext sc, final HashMap p) {
  }

  public String getCacheKey(final RequestData data, final String localKey) throws AssemblerException {
    // Verifica se e' in cache e se e' usabile
    if ((data.sameSection)) {
      final String sesnam = "CACHE/" + data.ri.getAppName() + "/" + data.ri.getAppSection() + localKey;
      return sesnam;
    }
    return null;
  }

  public Object get(final RequestData data, final String key) {
    return data.session.getAttribute(key);
  }

  public void put(final RequestData data, final String key, final Object o) {
    if (o == null) {
      data.session.removeAttribute(key);
    }
    else {
      data.session.setAttribute(key, o);
    }
  }

}
