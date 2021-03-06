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
import java.text.MessageFormat;
import java.util.StringTokenizer;
import javax.servlet.http.HttpServletRequest;
import net.eiroca.portal.assembler.exception.IllegalRequestException;

/**
 * Clase che contiene le informazioni presenti sugli URL di invocazione del
 * Assembler.
 * Lo schema del path URL gestiti sono del tipo:<br/>
 * /AppName/AppRights/AppSection/Apppath?AppQueryString
 */

public final class RequestInfo implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private String appName;
  private String appRights;
  private String appSection;
  private String appPath;
  private String appQueryString;

  /**
   * Crea l'oggetto e lo popola in base ai valori presenti nella richiesta
   * @param request HTTPRequest da usare
   * @param isPost se true la richiesta e' un Post
   * @throws IllegalRequestException Viene sollevato in caso che l'URL non sia
   * conforme allo schema definito a livello di specifiche
   */
  public RequestInfo(final HttpServletRequest request, final boolean isPost) throws IllegalRequestException {
    decodeRequest(request);
  }

  /**
   * popola l'oggetto in base ai valori presenti nella richiesta
   * @param request HTTPRequest da usare
   * @param isPost se true la richiesta e' un Post
   * @throws IllegalRequestException Viene sollevato in caso che l'URL non sia
   * conforme allo schema definito a livello di specifiche
   */
  protected void decodeRequest(final HttpServletRequest request) throws IllegalRequestException {
    final String path = request.getPathInfo();
    if (path == null) {
      RequestInfo.runError("Missing Path");
    }
    final StringTokenizer st = new StringTokenizer(path, "/");
    if (!st.hasMoreElements()) {
      RequestInfo.runError("Missing Application Name");
    }
    appName = st.nextToken();
    if (!st.hasMoreElements()) {
      RequestInfo.runError("Missing Application Rights");
    }
    appRights = st.nextToken();
    if (!st.hasMoreElements()) {
      RequestInfo.runError("Missing Application Section");
    }
    appSection = st.nextToken();
    if (st.hasMoreElements()) {
      final StringBuffer tmpPath = new StringBuffer();
      boolean first = true;
      while (st.hasMoreElements()) {
        if (!first) {
          tmpPath.append('/');
        }
        else {
          first = false;
        }
        tmpPath.append(st.nextToken());
      }
      appPath = tmpPath.toString();
    }
    appQueryString = request.getQueryString();
    if (appQueryString == null) {
      appQueryString = "";
    }
  }

  /**
   * Solleva una IllegalRequestException
   * @param Msg
   * @throws IllegalRequestException
   */
  private static final void runError(final String Msg) throws IllegalRequestException {
    throw new IllegalRequestException(Msg);
  }

  public String getAppName() {
    return appName;
  }

  public String getAppPath() {
    return appPath;
  }

  public String getAppQueryString() {
    return appQueryString;
  }

  public String getAppRights() {
    return appRights;
  }

  public String getAppSection() {
    return appSection;
  }

  public void appendParam(final String param) {
    if (appQueryString == null) {
      appQueryString = param;
    }
    else {
      appQueryString = appQueryString + "&" + param;
    }
  }

  /**
   * Converte l'oggetto in una stringa stampabile
   * @return
   */
  @Override
  public String toString() {
    return MessageFormat.format("/{0}/{1} [Rights={2};AppPath={3};QueryString={4}]", new Object[] {appName, appSection, appRights, appPath, appQueryString});
  }

}
