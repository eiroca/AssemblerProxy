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

  private int maxSeqErr = -1;
  private int maxSeqSuc = -1;

  public final static int ST_UNKNOWN = 0;
  public final static int ST_OK = 1;
  public final static int ST_ERROR = 2;

  private int status = ST_UNKNOWN;

  public CounterInfo() {
  }

  /** Check if there is a status change.
   * @param err If true the last events was an error
   * @return The new state of the counter
   */
  private final int checkError(boolean err) {
    if (err) {
      switch (status) {
        case ST_UNKNOWN: {
          errSeq++;
          sucSeq = 0;
          if (errSeq > maxSeqErr) {
            status = ST_ERROR;
            errSeq = 0;
          }
        }
        case ST_OK: {
          status = ST_UNKNOWN;
          errSeq = 1;
          if (errSeq > maxSeqErr) {
            status = ST_ERROR;
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
            status = ST_OK;
            sucSeq = 0;
          }
        }
        case ST_OK: {
        }
        case ST_ERROR: {
          status = ST_UNKNOWN;
          sucSeq = 1;
          if (sucSeq > maxSeqSuc) {
            status = ST_OK;
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
  public synchronized int touch(boolean err) {
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
