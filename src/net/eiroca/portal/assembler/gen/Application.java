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
 * Class Application.
 *
 * @version $Revision$ $Date$
 */
public class Application implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _ID.
   */
  private java.lang.String _ID;

  /**
   * Field _displayName.
   */
  private java.lang.String _displayName;

  /**
   * Field _authHeaderPrefix.
   */
  private java.lang.String _authHeaderPrefix;

  /**
   * Field _monitorMode.
   */
  private net.eiroca.portal.assembler.gen.types.ApplicationMonitorModeType _monitorMode;

  /**
   * Field _connections.
   */
  private net.eiroca.portal.assembler.gen.Connections _connections;

  /**
   * Field _authenticationMode.
   */
  private net.eiroca.portal.assembler.gen.AuthenticationMode _authenticationMode;

  /**
   * Field _sections.
   */
  private net.eiroca.portal.assembler.gen.Sections _sections;

  //----------------/
  //- Constructors -/
  //----------------/

  public Application() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'authHeaderPrefix'.
   *
   * @return the value of field 'AuthHeaderPrefix'.
   */
  public java.lang.String getAuthHeaderPrefix(
      ) {
    return this._authHeaderPrefix;
  }

  /**
   * Returns the value of field 'authenticationMode'.
   *
   * @return the value of field 'AuthenticationMode'.
   */
  public net.eiroca.portal.assembler.gen.AuthenticationMode getAuthenticationMode(
      ) {
    return this._authenticationMode;
  }

  /**
   * Returns the value of field 'connections'.
   *
   * @return the value of field 'Connections'.
   */
  public net.eiroca.portal.assembler.gen.Connections getConnections(
      ) {
    return this._connections;
  }

  /**
   * Returns the value of field 'displayName'.
   *
   * @return the value of field 'DisplayName'.
   */
  public java.lang.String getDisplayName(
      ) {
    return this._displayName;
  }

  /**
   * Returns the value of field 'ID'.
   *
   * @return the value of field 'ID'.
   */
  public java.lang.String getID(
      ) {
    return this._ID;
  }

  /**
   * Returns the value of field 'monitorMode'.
   *
   * @return the value of field 'MonitorMode'.
   */
  public net.eiroca.portal.assembler.gen.types.ApplicationMonitorModeType getMonitorMode(
      ) {
    return this._monitorMode;
  }

  /**
   * Returns the value of field 'sections'.
   *
   * @return the value of field 'Sections'.
   */
  public net.eiroca.portal.assembler.gen.Sections getSections(
      ) {
    return this._sections;
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
   * Sets the value of field 'authHeaderPrefix'.
   *
   * @param authHeaderPrefix the value of field 'authHeaderPrefix'
   */
  public void setAuthHeaderPrefix(
      final java.lang.String authHeaderPrefix) {
    this._authHeaderPrefix = authHeaderPrefix;
  }

  /**
   * Sets the value of field 'authenticationMode'.
   *
   * @param authenticationMode the value of field
   * 'authenticationMode'.
   */
  public void setAuthenticationMode(
      final net.eiroca.portal.assembler.gen.AuthenticationMode authenticationMode) {
    this._authenticationMode = authenticationMode;
  }

  /**
   * Sets the value of field 'connections'.
   *
   * @param connections the value of field 'connections'.
   */
  public void setConnections(
      final net.eiroca.portal.assembler.gen.Connections connections) {
    this._connections = connections;
  }

  /**
   * Sets the value of field 'displayName'.
   *
   * @param displayName the value of field 'displayName'.
   */
  public void setDisplayName(
      final java.lang.String displayName) {
    this._displayName = displayName;
  }

  /**
   * Sets the value of field 'ID'.
   *
   * @param ID the value of field 'ID'.
   */
  public void setID(
      final java.lang.String ID) {
    this._ID = ID;
  }

  /**
   * Sets the value of field 'monitorMode'.
   *
   * @param monitorMode the value of field 'monitorMode'.
   */
  public void setMonitorMode(
      final net.eiroca.portal.assembler.gen.types.ApplicationMonitorModeType monitorMode) {
    this._monitorMode = monitorMode;
  }

  /**
   * Sets the value of field 'sections'.
   *
   * @param sections the value of field 'sections'.
   */
  public void setSections(
      final net.eiroca.portal.assembler.gen.Sections sections) {
    this._sections = sections;
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
   * net.eiroca.portal.assembler.gen.Application
   */
  public static net.eiroca.portal.assembler.gen.Application unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Application)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Application.class, reader);
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
