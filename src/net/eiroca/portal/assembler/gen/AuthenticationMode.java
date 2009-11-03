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

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AuthenticationMode.
 *
 * @version $Revision$ $Date$
 */
public class AuthenticationMode implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Field _connectionID.
   */
  private java.lang.String _connectionID;

  /**
   * Field _authenticationID.
   */
  private java.lang.String _authenticationID;

  //----------------/
  //- Constructors -/
  //----------------/

  public AuthenticationMode() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'authenticationID'.
   *
   * @return the value of field 'AuthenticationID'.
   */
  public java.lang.String getAuthenticationID(
      ) {
    return _authenticationID;
  }

  /**
   * Returns the value of field 'connectionID'.
   *
   * @return the value of field 'ConnectionID'.
   */
  public java.lang.String getConnectionID(
      ) {
    return _connectionID;
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
    catch (final org.exolab.castor.xml.ValidationException vex) {
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
   * Sets the value of field 'authenticationID'.
   *
   * @param authenticationID the value of field 'authenticationID'
   */
  public void setAuthenticationID(
      final java.lang.String authenticationID) {
    _authenticationID = authenticationID;
  }

  /**
   * Sets the value of field 'connectionID'.
   *
   * @param connectionID the value of field 'connectionID'.
   */
  public void setConnectionID(
      final java.lang.String connectionID) {
    _connectionID = connectionID;
  }

  /**
   * Method unmarshal.
   *
   * @param reader
   * @throws org.exolab.castor.xml.MarshalException if object is
   * null or if any SAXException is thrown during marshaling
   * @throws org.exolab.castor.xml.ValidationException if this
   * object is an invalid instance according to the schema
   * @return the unmarshaled
   * net.eiroca.portal.assembler.gen.AuthenticationMode
   */
  public static net.eiroca.portal.assembler.gen.AuthenticationMode unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.AuthenticationMode)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.AuthenticationMode.class, reader);
  }

  /**
   *
   *
   * @throws org.exolab.castor.xml.ValidationException if this
   * object is an invalid instance according to the schema
   */
  public void validate(
      ) throws org.exolab.castor.xml.ValidationException {
    final org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
    validator.validate(this);
  }

}
