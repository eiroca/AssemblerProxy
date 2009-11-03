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
 * Class Assembler.
 *
 * @version $Revision$ $Date$
 */
public class Assembler implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Field _version.
   */
  private java.lang.String _version;

  /**
   * Field _description.
   */
  private java.lang.String _description;

  /**
   * Field _configuration.
   */
  private net.eiroca.portal.assembler.gen.Configuration _configuration;

  /**
   * Field _applications.
   */
  private net.eiroca.portal.assembler.gen.Applications _applications;

  //----------------/
  //- Constructors -/
  //----------------/

  public Assembler() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'applications'.
   *
   * @return the value of field 'Applications'.
   */
  public net.eiroca.portal.assembler.gen.Applications getApplications(
      ) {
    return _applications;
  }

  /**
   * Returns the value of field 'configuration'.
   *
   * @return the value of field 'Configuration'.
   */
  public net.eiroca.portal.assembler.gen.Configuration getConfiguration(
      ) {
    return _configuration;
  }

  /**
   * Returns the value of field 'description'.
   *
   * @return the value of field 'Description'.
   */
  public java.lang.String getDescription(
      ) {
    return _description;
  }

  /**
   * Returns the value of field 'version'.
   *
   * @return the value of field 'Version'.
   */
  public java.lang.String getVersion(
      ) {
    return _version;
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
   * Sets the value of field 'applications'.
   *
   * @param applications the value of field 'applications'.
   */
  public void setApplications(
      final net.eiroca.portal.assembler.gen.Applications applications) {
    _applications = applications;
  }

  /**
   * Sets the value of field 'configuration'.
   *
   * @param configuration the value of field 'configuration'.
   */
  public void setConfiguration(
      final net.eiroca.portal.assembler.gen.Configuration configuration) {
    _configuration = configuration;
  }

  /**
   * Sets the value of field 'description'.
   *
   * @param description the value of field 'description'.
   */
  public void setDescription(
      final java.lang.String description) {
    _description = description;
  }

  /**
   * Sets the value of field 'version'.
   *
   * @param version the value of field 'version'.
   */
  public void setVersion(
      final java.lang.String version) {
    _version = version;
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
   * net.eiroca.portal.assembler.gen.Assembler
   */
  public static net.eiroca.portal.assembler.gen.Assembler unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Assembler)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Assembler.class, reader);
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
