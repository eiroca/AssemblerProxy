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

import java.util.Hashtable;

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
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * The GLOBAL type
   */
  public static final int GLOBAL_TYPE = 0;

  /**
   * The instance of the GLOBAL type
   */
  public static final CookieAccessType GLOBAL = new CookieAccessType(CookieAccessType.GLOBAL_TYPE, "GLOBAL");

  /**
   * The READONLY type
   */
  public static final int READONLY_TYPE = 1;

  /**
   * The instance of the READONLY type
   */
  public static final CookieAccessType READONLY = new CookieAccessType(CookieAccessType.READONLY_TYPE, "READONLY");

  /**
   * Field _memberTable.
   */
  private static java.util.Hashtable _memberTable = CookieAccessType.init();

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
    stringValue = value;
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
    return CookieAccessType._memberTable.elements();
  }

  /**
   * Method getType.Returns the type of this CookieAccessType
   *
   * @return the type of this CookieAccessType
   */
  public int getType(
      ) {
    return type;
  }

  /**
   * Method init.
   *
   * @return the initialized Hashtable for the member table
   */
  private static java.util.Hashtable init(
      ) {
    final Hashtable members = new Hashtable();
    members.put("GLOBAL", CookieAccessType.GLOBAL);
    members.put("READONLY", CookieAccessType.READONLY);
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
    return CookieAccessType.valueOf(stringValue);
  }

  /**
   * Method toString.Returns the String representation of this
   * CookieAccessType
   *
   * @return the String representation of this CookieAccessType
   */
  @Override
  public java.lang.String toString(
      ) {
    return stringValue;
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
      obj = CookieAccessType._memberTable.get(string);
    }
    if (obj == null) {
      final String err = "" + string + " is not a valid CookieAccessType";
      throw new IllegalArgumentException(err);
    }
    return (CookieAccessType)obj;
  }

}
