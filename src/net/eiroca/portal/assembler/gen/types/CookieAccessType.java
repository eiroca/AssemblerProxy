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
 * Class CookieAccessType.
 *
 * @version $Revision$ $Date$
 */
public class CookieAccessType implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * The GLOBAL type
   */
  public static final int GLOBAL_TYPE = 0;

  /**
   * The instance of the GLOBAL type
   */
  public static final CookieAccessType GLOBAL = new CookieAccessType(GLOBAL_TYPE, "GLOBAL");

  /**
   * The READONLY type
   */
  public static final int READONLY_TYPE = 1;

  /**
   * The instance of the READONLY type
   */
  public static final CookieAccessType READONLY = new CookieAccessType(READONLY_TYPE, "READONLY");

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

  private CookieAccessType(final int type, final java.lang.String value) {
    super();
    this.type = type;
    this.stringValue = value;
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Method enumerate.Returns an enumeration of all possible
   * instances of CookieAccessType
   *
   * @return an Enumeration over all possible instances of
   * CookieAccessType
   */
  public static java.util.Enumeration enumerate(
      ) {
    return _memberTable.elements();
  }

  /**
   * Method getType.Returns the type of this CookieAccessType
   *
   * @return the type of this CookieAccessType
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
    members.put("GLOBAL", GLOBAL);
    members.put("READONLY", READONLY);
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
   * CookieAccessType
   *
   * @return the String representation of this CookieAccessType
   */
  public java.lang.String toString(
      ) {
    return this.stringValue;
  }

  /**
   * Method valueOf.Returns a new CookieAccessType based on the
   * given String value.
   *
   * @param string
   * @return the CookieAccessType value of parameter 'string'
   */
  public static net.eiroca.portal.assembler.gen.types.CookieAccessType valueOf(
      final java.lang.String string) {
    java.lang.Object obj = null;
    if (string != null) {
      obj = _memberTable.get(string);
    }
    if (obj == null) {
      String err = "" + string + " is not a valid CookieAccessType";
      throw new IllegalArgumentException(err);
    }
    return (CookieAccessType)obj;
  }

}
