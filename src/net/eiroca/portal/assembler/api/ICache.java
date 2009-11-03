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
package net.eiroca.portal.assembler.api;

import net.eiroca.portal.assembler.exception.AssemblerException;
import net.eiroca.portal.assembler.util.RequestData;

public interface ICache {

  public String getCacheKey(RequestData data, String localKey) throws AssemblerException;

  public Object get(RequestData data, String key);

  public void put(RequestData data, String key, Object o);

}
