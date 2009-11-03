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
 * Class SectionChoice.
 *
 * @version $Revision$ $Date$
 */
public class SectionChoice implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Field _script.
   */
  private net.eiroca.portal.assembler.gen.Script _script;

  /**
   * Field _copy.
   */
  private net.eiroca.portal.assembler.gen.Copy _copy;

  //----------------/
  //- Constructors -/
  //----------------/

  public SectionChoice() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'copy'.
   *
   * @return the value of field 'Copy'.
   */
  public net.eiroca.portal.assembler.gen.Copy getCopy(
      ) {
    return _copy;
  }

  /**
   * Returns the value of field 'script'.
   *
   * @return the value of field 'Script'.
   */
  public net.eiroca.portal.assembler.gen.Script getScript(
      ) {
    return _script;
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
   * Sets the value of field 'copy'.
   *
   * @param copy the value of field 'copy'.
   */
  public void setCopy(
      final net.eiroca.portal.assembler.gen.Copy copy) {
    _copy = copy;
  }

  /**
   * Sets the value of field 'script'.
   *
   * @param script the value of field 'script'.
   */
  public void setScript(
      final net.eiroca.portal.assembler.gen.Script script) {
    _script = script;
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
   * net.eiroca.portal.assembler.gen.SectionChoice
   */
  public static net.eiroca.portal.assembler.gen.SectionChoice unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.SectionChoice)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.SectionChoice.class, reader);
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
