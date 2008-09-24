/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package net.eiroca.portal.assembler.gen;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.*;

/**
 * Class Cookie.
 *
 * @version $Revision$ $Date$
 */
public class Cookie implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _access.
   */
  private net.eiroca.portal.assembler.gen.types.CookieAccessType _access;

  /**
   * Field _srcName.
   */
  private java.lang.String _srcName;

  /**
   * Field _endName.
   */
  private java.lang.String _endName;

  //----------------/
  //- Constructors -/
  //----------------/

  public Cookie() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'access'.
   *
   * @return the value of field 'Access'.
   */
  public net.eiroca.portal.assembler.gen.types.CookieAccessType getAccess(
      ) {
    return this._access;
  }

  /**
   * Returns the value of field 'endName'.
   *
   * @return the value of field 'EndName'.
   */
  public java.lang.String getEndName(
      ) {
    return this._endName;
  }

  /**
   * Returns the value of field 'srcName'.
   *
   * @return the value of field 'SrcName'.
   */
  public java.lang.String getSrcName(
      ) {
    return this._srcName;
  }

  /**
   * Method isValid.
   *
   * @return true if this object is valid according to the schema
   */
  public boolean isValid(
      ) {
    try {
      validate();
    }
    catch (org.exolab.castor.xml.ValidationException vex) {
      return false;
    }
    return true;
  }

  /**
   *
   *
   * @param out
   * @throws org.exolab.castor.xml.MarshalException if object is
   * null or if any SAXException is thrown during marshaling
   * @throws org.exolab.castor.xml.ValidationException if this
   * object is an invalid instance according to the schema
   */
  public void marshal(
      final java.io.Writer out) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    Marshaller.marshal(this, out);
  }

  /**
   *
   *
   * @param handler
   * @throws java.io.IOException if an IOException occurs during
   * marshaling
   * @throws org.exolab.castor.xml.ValidationException if this
   * object is an invalid instance according to the schema
   * @throws org.exolab.castor.xml.MarshalException if object is
   * null or if any SAXException is thrown during marshaling
   */
  public void marshal(
      final org.xml.sax.ContentHandler handler) throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    Marshaller.marshal(this, handler);
  }

  /**
   * Sets the value of field 'access'.
   *
   * @param access the value of field 'access'.
   */
  public void setAccess(
      final net.eiroca.portal.assembler.gen.types.CookieAccessType access) {
    this._access = access;
  }

  /**
   * Sets the value of field 'endName'.
   *
   * @param endName the value of field 'endName'.
   */
  public void setEndName(
      final java.lang.String endName) {
    this._endName = endName;
  }

  /**
   * Sets the value of field 'srcName'.
   *
   * @param srcName the value of field 'srcName'.
   */
  public void setSrcName(
      final java.lang.String srcName) {
    this._srcName = srcName;
  }

  /**
   * Method unmarshal.
   *
   * @param reader
   * @throws org.exolab.castor.xml.MarshalException if object is
   * null or if any SAXException is thrown during marshaling
   * @throws org.exolab.castor.xml.ValidationException if this
   * object is an invalid instance according to the schema
   * @return the unmarshaled net.eiroca.portal.assembler.gen.Cooki
   */
  public static net.eiroca.portal.assembler.gen.Cookie unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Cookie)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Cookie.class, reader);
  }

  /**
   *
   *
   * @throws org.exolab.castor.xml.ValidationException if this
   * object is an invalid instance according to the schema
   */
  public void validate(
      ) throws org.exolab.castor.xml.ValidationException {
    org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
    validator.validate(this);
  }

}
