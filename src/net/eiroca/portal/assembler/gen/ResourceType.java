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
 * Class ResourceType.
 *
 * @version $Revision$ $Date$
 */
public class ResourceType implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Field _URLMode.
   */
  private net.eiroca.portal.assembler.gen.types.ResourceTypeURLModeType _URLMode;

  /**
   * Field _URL.
   */
  private java.lang.String _URL;

  /**
   * Field _followRedirect.
   */
  private boolean _followRedirect;

  /**
   * keeps track of state for field: _followRedirect
   */
  private boolean _has_followRedirect;

  /**
   * Field _ignoreError.
   */
  private boolean _ignoreError;

  /**
   * keeps track of state for field: _ignoreError
   */
  private boolean _has_ignoreError;

  /**
   * Field _connectionID.
   */
  private java.lang.String _connectionID;

  /**
   * Field _resourceCache.
   */
  private net.eiroca.portal.assembler.gen.ResourceCache _resourceCache;

  /**
   * Field _resourceExtractor.
   */
  private net.eiroca.portal.assembler.gen.ResourceExtractor _resourceExtractor;

  //----------------/
  //- Constructors -/
  //----------------/

  public ResourceType() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   */
  public void deleteFollowRedirect(
      ) {
    _has_followRedirect = false;
  }

  /**
   */
  public void deleteIgnoreError(
      ) {
    _has_ignoreError = false;
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
   * Returns the value of field 'followRedirect'.
   *
   * @return the value of field 'FollowRedirect'.
   */
  public boolean getFollowRedirect(
      ) {
    return _followRedirect;
  }

  /**
   * Returns the value of field 'ignoreError'.
   *
   * @return the value of field 'IgnoreError'.
   */
  public boolean getIgnoreError(
      ) {
    return _ignoreError;
  }

  /**
   * Returns the value of field 'resourceCache'.
   *
   * @return the value of field 'ResourceCache'.
   */
  public net.eiroca.portal.assembler.gen.ResourceCache getResourceCache(
      ) {
    return _resourceCache;
  }

  /**
   * Returns the value of field 'resourceExtractor'.
   *
   * @return the value of field 'ResourceExtractor'.
   */
  public net.eiroca.portal.assembler.gen.ResourceExtractor getResourceExtractor(
      ) {
    return _resourceExtractor;
  }

  /**
   * Returns the value of field 'URL'.
   *
   * @return the value of field 'URL'.
   */
  public java.lang.String getURL(
      ) {
    return _URL;
  }

  /**
   * Returns the value of field 'URLMode'.
   *
   * @return the value of field 'URLMode'.
   */
  public net.eiroca.portal.assembler.gen.types.ResourceTypeURLModeType getURLMode(
      ) {
    return _URLMode;
  }

  /**
   * Method hasFollowRedirect.
   *
   * @return true if at least one FollowRedirect has been added
   */
  public boolean hasFollowRedirect(
      ) {
    return _has_followRedirect;
  }

  /**
   * Method hasIgnoreError.
   *
   * @return true if at least one IgnoreError has been added
   */
  public boolean hasIgnoreError(
      ) {
    return _has_ignoreError;
  }

  /**
   * Returns the value of field 'followRedirect'.
   *
   * @return the value of field 'FollowRedirect'.
   */
  public boolean isFollowRedirect(
      ) {
    return _followRedirect;
  }

  /**
   * Returns the value of field 'ignoreError'.
   *
   * @return the value of field 'IgnoreError'.
   */
  public boolean isIgnoreError(
      ) {
    return _ignoreError;
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
   * Sets the value of field 'connectionID'.
   *
   * @param connectionID the value of field 'connectionID'.
   */
  public void setConnectionID(
      final java.lang.String connectionID) {
    _connectionID = connectionID;
  }

  /**
   * Sets the value of field 'followRedirect'.
   *
   * @param followRedirect the value of field 'followRedirect'.
   */
  public void setFollowRedirect(
      final boolean followRedirect) {
    _followRedirect = followRedirect;
    _has_followRedirect = true;
  }

  /**
   * Sets the value of field 'ignoreError'.
   *
   * @param ignoreError the value of field 'ignoreError'.
   */
  public void setIgnoreError(
      final boolean ignoreError) {
    _ignoreError = ignoreError;
    _has_ignoreError = true;
  }

  /**
   * Sets the value of field 'resourceCache'.
   *
   * @param resourceCache the value of field 'resourceCache'.
   */
  public void setResourceCache(
      final net.eiroca.portal.assembler.gen.ResourceCache resourceCache) {
    _resourceCache = resourceCache;
  }

  /**
   * Sets the value of field 'resourceExtractor'.
   *
   * @param resourceExtractor the value of field
   * 'resourceExtractor'.
   */
  public void setResourceExtractor(
      final net.eiroca.portal.assembler.gen.ResourceExtractor resourceExtractor) {
    _resourceExtractor = resourceExtractor;
  }

  /**
   * Sets the value of field 'URL'.
   *
   * @param URL the value of field 'URL'.
   */
  public void setURL(
      final java.lang.String URL) {
    _URL = URL;
  }

  /**
   * Sets the value of field 'URLMode'.
   *
   * @param URLMode the value of field 'URLMode'.
   */
  public void setURLMode(
      final net.eiroca.portal.assembler.gen.types.ResourceTypeURLModeType URLMode) {
    _URLMode = URLMode;
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
   * net.eiroca.portal.assembler.gen.ResourceType
   */
  public static net.eiroca.portal.assembler.gen.ResourceType unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.ResourceType)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.ResourceType.class, reader);
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
