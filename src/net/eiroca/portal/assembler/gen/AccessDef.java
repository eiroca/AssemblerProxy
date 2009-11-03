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
 * Class AccessDef.
 *
 * @version $Revision$ $Date$
 */
public class AccessDef implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Field _ID.
   */
  private java.lang.String _ID;

  /**
   * Field _forceSSO.
   */
  private boolean _forceSSO;

  /**
   * keeps track of state for field: _forceSSO
   */
  private boolean _has_forceSSO;

  /**
   * Field _decode.
   */
  private boolean _decode;

  /**
   * keeps track of state for field: _decode
   */
  private boolean _has_decode;

  /**
   * Field _forceValid.
   */
  private boolean _forceValid;

  /**
   * keeps track of state for field: _forceValid
   */
  private boolean _has_forceValid;

  //----------------/
  //- Constructors -/
  //----------------/

  public AccessDef() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   */
  public void deleteDecode(
      ) {
    _has_decode = false;
  }

  /**
   */
  public void deleteForceSSO(
      ) {
    _has_forceSSO = false;
  }

  /**
   */
  public void deleteForceValid(
      ) {
    _has_forceValid = false;
  }

  /**
   * Returns the value of field 'decode'.
   *
   * @return the value of field 'Decode'.
   */
  public boolean getDecode(
      ) {
    return _decode;
  }

  /**
   * Returns the value of field 'forceSSO'.
   *
   * @return the value of field 'ForceSSO'.
   */
  public boolean getForceSSO(
      ) {
    return _forceSSO;
  }

  /**
   * Returns the value of field 'forceValid'.
   *
   * @return the value of field 'ForceValid'.
   */
  public boolean getForceValid(
      ) {
    return _forceValid;
  }

  /**
   * Returns the value of field 'ID'.
   *
   * @return the value of field 'ID'.
   */
  public java.lang.String getID(
      ) {
    return _ID;
  }

  /**
   * Method hasDecode.
   *
   * @return true if at least one Decode has been added
   */
  public boolean hasDecode(
      ) {
    return _has_decode;
  }

  /**
   * Method hasForceSSO.
   *
   * @return true if at least one ForceSSO has been added
   */
  public boolean hasForceSSO(
      ) {
    return _has_forceSSO;
  }

  /**
   * Method hasForceValid.
   *
   * @return true if at least one ForceValid has been added
   */
  public boolean hasForceValid(
      ) {
    return _has_forceValid;
  }

  /**
   * Returns the value of field 'decode'.
   *
   * @return the value of field 'Decode'.
   */
  public boolean isDecode(
      ) {
    return _decode;
  }

  /**
   * Returns the value of field 'forceSSO'.
   *
   * @return the value of field 'ForceSSO'.
   */
  public boolean isForceSSO(
      ) {
    return _forceSSO;
  }

  /**
   * Returns the value of field 'forceValid'.
   *
   * @return the value of field 'ForceValid'.
   */
  public boolean isForceValid(
      ) {
    return _forceValid;
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
   * Sets the value of field 'decode'.
   *
   * @param decode the value of field 'decode'.
   */
  public void setDecode(
      final boolean decode) {
    _decode = decode;
    _has_decode = true;
  }

  /**
   * Sets the value of field 'forceSSO'.
   *
   * @param forceSSO the value of field 'forceSSO'.
   */
  public void setForceSSO(
      final boolean forceSSO) {
    _forceSSO = forceSSO;
    _has_forceSSO = true;
  }

  /**
   * Sets the value of field 'forceValid'.
   *
   * @param forceValid the value of field 'forceValid'.
   */
  public void setForceValid(
      final boolean forceValid) {
    _forceValid = forceValid;
    _has_forceValid = true;
  }

  /**
   * Sets the value of field 'ID'.
   *
   * @param ID the value of field 'ID'.
   */
  public void setID(
      final java.lang.String ID) {
    _ID = ID;
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
   * net.eiroca.portal.assembler.gen.AccessDef
   */
  public static net.eiroca.portal.assembler.gen.AccessDef unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.AccessDef)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.AccessDef.class, reader);
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
