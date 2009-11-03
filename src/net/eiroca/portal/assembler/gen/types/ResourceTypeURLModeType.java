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
 * Class ResourceTypeURLModeType.
 *
 * @version $Revision$ $Date$
 */
public class ResourceTypeURLModeType implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * The DIRECT type
   */
  public static final int DIRECT_TYPE = 0;

  /**
   * The instance of the DIRECT type
   */
  public static final ResourceTypeURLModeType DIRECT = new ResourceTypeURLModeType(ResourceTypeURLModeType.DIRECT_TYPE, "DIRECT");

  /**
   * The PROCESS type
   */
  public static final int PROCESS_TYPE = 1;

  /**
   * The instance of the PROCESS type
   */
  public static final ResourceTypeURLModeType PROCESS = new ResourceTypeURLModeType(ResourceTypeURLModeType.PROCESS_TYPE, "PROCESS");

  /**
   * Field _memberTable.
   */
  private static java.util.Hashtable _memberTable = ResourceTypeURLModeType.init();

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

  private ResourceTypeURLModeType(final int type, final java.lang.String value) {
    super();
    this.type = type;
    stringValue = value;
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Method enumerate.Returns an enumeration of all possible
   * instances of ResourceTypeURLModeType
   *
   * @return an Enumeration over all possible instances of
   * ResourceTypeURLModeType
   */
  public static java.util.Enumeration enumerate(
      ) {
    return ResourceTypeURLModeType._memberTable.elements();
  }

  /**
   * Method getType.Returns the type of this
   * ResourceTypeURLModeType
   *
   * @return the type of this ResourceTypeURLModeType
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
    members.put("DIRECT", ResourceTypeURLModeType.DIRECT);
    members.put("PROCESS", ResourceTypeURLModeType.PROCESS);
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
    return ResourceTypeURLModeType.valueOf(stringValue);
  }

  /**
   * Method toString.Returns the String representation of this
   * ResourceTypeURLModeType
   *
   * @return the String representation of this
   * ResourceTypeURLModeType
   */
  @Override
  public java.lang.String toString(
      ) {
    return stringValue;
  }

  /**
   * Method valueOf.Returns a new ResourceTypeURLModeType based
   * on the given String value.
   *
   * @param string
   * @return the ResourceTypeURLModeType value of parameter
   * 'string'
   */
  public static net.eiroca.portal.assembler.gen.types.ResourceTypeURLModeType valueOf(
      final java.lang.String string) {
    java.lang.Object obj = null;
    if (string != null) {
      obj = ResourceTypeURLModeType._memberTable.get(string);
    }
    if (obj == null) {
      final String err = "" + string + " is not a valid ResourceTypeURLModeType";
      throw new IllegalArgumentException(err);
    }
    return (ResourceTypeURLModeType)obj;
  }

}
