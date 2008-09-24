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

import java.util.*;
import javax.servlet.*;

import net.eiroca.portal.assembler.api.*;
import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.util.*;

public class SimpleCache extends APIClass implements ICache {

  public SimpleCache(ServletContext sc, HashMap p) {
  }

  public String getCacheKey(RequestData data, String localKey) throws AssemblerException {
    // Verifica se e' in cache e se e' usabile
    if ((data.sameSection)) {
      String sesnam = "CACHE/" + data.ri.getAppName() + "/" + data.ri.getAppSection() + localKey;
      return sesnam;
    }
    return null;
  }

  public Object get(RequestData data, String key) {
    return data.session.getAttribute(key);
  }

  public void put(RequestData data, String key, Object o) {
    if (o == null) {
      data.session.removeAttribute(key);
    }
    else {
      data.session.setAttribute(key, o);
    }
  }

}
