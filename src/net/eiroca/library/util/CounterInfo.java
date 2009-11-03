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
package net.eiroca.library.util;

/** The class implements a counter of "errors" and "successes". The counter
 * has a state that changes according the occourences of the errors and successes.
 */

public class CounterInfo {

  private long lastError = 0;
  private long lastSuccess = 0;

  private long errCount = 0;
  private long errSeq = 0;

  private long sucCount = 0;
  private long sucSeq = 0;

  private final int maxSeqErr = -1;
  private final int maxSeqSuc = -1;

  public final static int ST_UNKNOWN = 0;
  public final static int ST_OK = 1;
  public final static int ST_ERROR = 2;

  private int status = CounterInfo.ST_UNKNOWN;

  public CounterInfo() {
  }

  /** Check if there is a status change.
   * @param err If true the last events was an error
   * @return The new state of the counter
   */
  private final int checkError(final boolean err) {
    if (err) {
      switch (status) {
        case ST_UNKNOWN: {
          errSeq++;
          sucSeq = 0;
          if (errSeq > maxSeqErr) {
            status = CounterInfo.ST_ERROR;
            errSeq = 0;
          }
        }
        case ST_OK: {
          status = CounterInfo.ST_UNKNOWN;
          errSeq = 1;
          if (errSeq > maxSeqErr) {
            status = CounterInfo.ST_ERROR;
            errSeq = 0;
          }
        }
        case ST_ERROR: {
        }
      }
    }
    else {
      switch (status) {
        case ST_UNKNOWN: {
          sucSeq++;
          errSeq = 0;
          if (sucSeq > maxSeqSuc) {
            status = CounterInfo.ST_OK;
            sucSeq = 0;
          }
        }
        case ST_OK: {
        }
        case ST_ERROR: {
          status = CounterInfo.ST_UNKNOWN;
          sucSeq = 1;
          if (sucSeq > maxSeqSuc) {
            status = CounterInfo.ST_OK;
            sucSeq = 0;
          }
        }
      }
    }
    return status;
  }

  /**Increments the counter according to the given parameter and checks if
   * the state must change.
   * @param err If true the events is an error
   * @return The state of the counter
   */
  public synchronized int touch(final boolean err) {
    if (err) {
      lastError = System.currentTimeMillis();
      errCount++;
    }
    else {
      lastSuccess = System.currentTimeMillis();
      sucCount++;
    }
    return checkError(err);
  }

  @Override
  public String toString() {
    return "State (" + status + ") Error=" + errCount + " Success=" + sucCount;
  }

  public int getStatus() {
    return status;
  }

  public long getLastError() {
    return lastError;
  }

  public long getLastSuccess() {
    return lastSuccess;
  }

}
