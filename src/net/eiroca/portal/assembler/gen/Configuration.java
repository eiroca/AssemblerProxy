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
 * Class Configuration.
 *
 * @version $Revision$ $Date$
 */
public class Configuration implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _adminConfig.
   */
  private net.eiroca.portal.assembler.gen.AdminConfig _adminConfig;

  /**
   * Field _accessConfig.
   */
  private net.eiroca.portal.assembler.gen.AccessConfig _accessConfig;

  /**
   * Field _cacheConfig.
   */
  private net.eiroca.portal.assembler.gen.CacheConfig _cacheConfig;

  /**
   * Field _authenticationConfig.
   */
  private net.eiroca.portal.assembler.gen.AuthenticationConfig _authenticationConfig;

  /**
   * Field _processorConfig.
   */
  private net.eiroca.portal.assembler.gen.ProcessorConfig _processorConfig;

  /**
   * Field _extractorConfig.
   */
  private net.eiroca.portal.assembler.gen.ExtractorConfig _extractorConfig;

  /**
   * Field _serializerConfig.
   */
  private net.eiroca.portal.assembler.gen.SerializerConfig _serializerConfig;

  /**
   * Field _scriptEngineConfig.
   */
  private net.eiroca.portal.assembler.gen.ScriptEngineConfig _scriptEngineConfig;

  //----------------/
  //- Constructors -/
  //----------------/

  public Configuration() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'accessConfig'.
   *
   * @return the value of field 'AccessConfig'.
   */
  public net.eiroca.portal.assembler.gen.AccessConfig getAccessConfig(
      ) {
    return this._accessConfig;
  }

  /**
   * Returns the value of field 'adminConfig'.
   *
   * @return the value of field 'AdminConfig'.
   */
  public net.eiroca.portal.assembler.gen.AdminConfig getAdminConfig(
      ) {
    return this._adminConfig;
  }

  /**
   * Returns the value of field 'authenticationConfig'.
   *
   * @return the value of field 'AuthenticationConfig'.
   */
  public net.eiroca.portal.assembler.gen.AuthenticationConfig getAuthenticationConfig(
      ) {
    return this._authenticationConfig;
  }

  /**
   * Returns the value of field 'cacheConfig'.
   *
   * @return the value of field 'CacheConfig'.
   */
  public net.eiroca.portal.assembler.gen.CacheConfig getCacheConfig(
      ) {
    return this._cacheConfig;
  }

  /**
   * Returns the value of field 'extractorConfig'.
   *
   * @return the value of field 'ExtractorConfig'.
   */
  public net.eiroca.portal.assembler.gen.ExtractorConfig getExtractorConfig(
      ) {
    return this._extractorConfig;
  }

  /**
   * Returns the value of field 'processorConfig'.
   *
   * @return the value of field 'ProcessorConfig'.
   */
  public net.eiroca.portal.assembler.gen.ProcessorConfig getProcessorConfig(
      ) {
    return this._processorConfig;
  }

  /**
   * Returns the value of field 'scriptEngineConfig'.
   *
   * @return the value of field 'ScriptEngineConfig'.
   */
  public net.eiroca.portal.assembler.gen.ScriptEngineConfig getScriptEngineConfig(
      ) {
    return this._scriptEngineConfig;
  }

  /**
   * Returns the value of field 'serializerConfig'.
   *
   * @return the value of field 'SerializerConfig'.
   */
  public net.eiroca.portal.assembler.gen.SerializerConfig getSerializerConfig(
      ) {
    return this._serializerConfig;
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
   * Sets the value of field 'accessConfig'.
   *
   * @param accessConfig the value of field 'accessConfig'.
   */
  public void setAccessConfig(
      final net.eiroca.portal.assembler.gen.AccessConfig accessConfig) {
    this._accessConfig = accessConfig;
  }

  /**
   * Sets the value of field 'adminConfig'.
   *
   * @param adminConfig the value of field 'adminConfig'.
   */
  public void setAdminConfig(
      final net.eiroca.portal.assembler.gen.AdminConfig adminConfig) {
    this._adminConfig = adminConfig;
  }

  /**
   * Sets the value of field 'authenticationConfig'.
   *
   * @param authenticationConfig the value of field
   * 'authenticationConfig'.
   */
  public void setAuthenticationConfig(
      final net.eiroca.portal.assembler.gen.AuthenticationConfig authenticationConfig) {
    this._authenticationConfig = authenticationConfig;
  }

  /**
   * Sets the value of field 'cacheConfig'.
   *
   * @param cacheConfig the value of field 'cacheConfig'.
   */
  public void setCacheConfig(
      final net.eiroca.portal.assembler.gen.CacheConfig cacheConfig) {
    this._cacheConfig = cacheConfig;
  }

  /**
   * Sets the value of field 'extractorConfig'.
   *
   * @param extractorConfig the value of field 'extractorConfig'.
   */
  public void setExtractorConfig(
      final net.eiroca.portal.assembler.gen.ExtractorConfig extractorConfig) {
    this._extractorConfig = extractorConfig;
  }

  /**
   * Sets the value of field 'processorConfig'.
   *
   * @param processorConfig the value of field 'processorConfig'.
   */
  public void setProcessorConfig(
      final net.eiroca.portal.assembler.gen.ProcessorConfig processorConfig) {
    this._processorConfig = processorConfig;
  }

  /**
   * Sets the value of field 'scriptEngineConfig'.
   *
   * @param scriptEngineConfig the value of field
   * 'scriptEngineConfig'.
   */
  public void setScriptEngineConfig(
      final net.eiroca.portal.assembler.gen.ScriptEngineConfig scriptEngineConfig) {
    this._scriptEngineConfig = scriptEngineConfig;
  }

  /**
   * Sets the value of field 'serializerConfig'.
   *
   * @param serializerConfig the value of field 'serializerConfig'
   */
  public void setSerializerConfig(
      final net.eiroca.portal.assembler.gen.SerializerConfig serializerConfig) {
    this._serializerConfig = serializerConfig;
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
   * net.eiroca.portal.assembler.gen.Configuration
   */
  public static net.eiroca.portal.assembler.gen.Configuration unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Configuration)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Configuration.class, reader);
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
