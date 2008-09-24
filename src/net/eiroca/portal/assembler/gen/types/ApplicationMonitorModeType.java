/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package net.eiroca.portal.assembler.gen.types;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.*;

/**
 * Class ApplicationMonitorModeType.
 *
 * @version $Revision$ $Date$
 */
public class ApplicationMonitorModeType implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * The WARNING type
   */
  public static final int WARNING_TYPE = 0;

  /**
   * The instance of the WARNING type
   */
  public static final ApplicationMonitorModeType WARNING = new ApplicationMonitorModeType(WARNING_TYPE, "WARNING");

  /**
   * The ERROR type
   */
  public static final int ERROR_TYPE = 1;

  /**
   * The instance of the ERROR type
   */
  public static final ApplicationMonitorModeType ERROR = new ApplicationMonitorModeType(ERROR_TYPE, "ERROR");

  /**
   * The CRITICAL type
   */
  public static final int CRITICAL_TYPE = 2;

  /**
   * The instance of the CRITICAL type
   */
  public static final ApplicationMonitorModeType CRITICAL = new ApplicationMonitorModeType(CRITICAL_TYPE, "CRITICAL");

  /**
   * Field _memberTable.
   */
  private static java.util.Hashtable _memberTable = init();

  /**
   * Field type.
   */
  private final int type;

  /**
   * Field stringValue.
   */
  private java.lang.String stringValue = null;

  //----------------/
  //- Constructors -/
  //----------------/

  private ApplicationMonitorModeType(final int type, final java.lang.String value) {
    super();
    this.type = type;
    this.stringValue = value;
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Method enumerate.Returns an enumeration of all possible
   * instances of ApplicationMonitorModeType
   *
   * @return an Enumeration over all possible instances of
   * ApplicationMonitorModeType
   */
  public static java.util.Enumeration enumerate(
      ) {
    return _memberTable.elements();
  }

  /**
   * Method getType.Returns the type of this
   * ApplicationMonitorModeType
   *
   * @return the type of this ApplicationMonitorModeType
   */
  public int getType(
      ) {
    return this.type;
  }

  /**
   * Method init.
   *
   * @return the initialized Hashtable for the member table
   */
  private static java.util.Hashtable init(
      ) {
    Hashtable members = new Hashtable();
    members.put("WARNING", WARNING);
    members.put("ERROR", ERROR);
    members.put("CRITICAL", CRITICAL);
    return members;
  }

  /**
   * Method readResolve. will be called during deserialization to
   * replace the deserialized object with the correct constant
   * instance.
   *
   * @return this deserialized object
   */
  private java.lang.Object readResolve(
      ) {
    return valueOf(this.stringValue);
  }

  /**
   * Method toString.Returns the String representation of this
   * ApplicationMonitorModeType
   *
   * @return the String representation of this
   * ApplicationMonitorModeType
   */
  public java.lang.String toString(
      ) {
    return this.stringValue;
  }

  /**
   * Method valueOf.Returns a new ApplicationMonitorModeType
   * based on the given String value.
   *
   * @param string
   * @return the ApplicationMonitorModeType value of parameter
   * 'string'
   */
  public static net.eiroca.portal.assembler.gen.types.ApplicationMonitorModeType valueOf(
      final java.lang.String string) {
    java.lang.Object obj = null;
    if (string != null) {
      obj = _memberTable.get(string);
    }
    if (obj == null) {
      String err = "" + string + " is not a valid ApplicationMonitorModeType";
      throw new IllegalArgumentException(err);
    }
    return (ApplicationMonitorModeType)obj;
  }

}
