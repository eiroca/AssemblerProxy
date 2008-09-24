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

import java.io.*;
import java.util.*;
import javax.servlet.*;

import org.apache.commons.httpclient.*;
import net.eiroca.portal.assembler.gen.*;
import net.eiroca.portal.assembler.util.*;

public class TAGExtractor extends AbstractExtractor {

  public TAGExtractor(ServletContext sc, HashMap p) {
    super(sc, p);
  }

  /**
   * Estrae i pezzi delle sezioni dalla risposta
   * @param res
   * @param method
   * @return
   */
  public final Map decodeSections(Resource res, HttpMethod method) {
    Map secs = new HashMap();
    String result = null;
    try {
      result = method.getResponseBodyAsString();
    }
    catch (IOException ex) {
    }
    int start;
    int end;
    // Gestione delle sezioni di tipo TAG based
    int last = 0;
    while (last < result.length()) {
      start = result.indexOf("<!-- BEGIN SECTION:", last);
      if (start != -1) {
        StringBuffer name = new StringBuffer();
        start = start + 20;
        while (result.charAt(start) != ' ') {
          name.append(result.charAt(start));
          start++;
        }
        end = result.indexOf("<!-- END SECTION", start);
        if (end != -1) {
          String finalName = prefix + name.toString();
          String out = result.substring(start + 4, end);
          secs.put(finalName, out);
          last = end + 16;
        }
        else {
          break;
        }
      }
      else {
        break;
      }
    }
    return (secs.size() > 0 ? secs : null);
  }

}
