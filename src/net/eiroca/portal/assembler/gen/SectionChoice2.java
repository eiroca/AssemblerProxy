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
 * Class SectionChoice2.
 *
 * @version $Revision$ $Date$
 */
public class SectionChoice2 implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _errorRedirect.
   */
  private net.eiroca.portal.assembler.gen.ErrorRedirect _errorRedirect;

  /**
   * Field _errorScript.
   */
  private net.eiroca.portal.assembler.gen.ErrorScript _errorScript;

  //----------------/
  //- Constructors -/
  //----------------/

  public SectionChoice2() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'errorRedirect'.
   *
   * @return the value of field 'ErrorRedirect'.
   */
  public net.eiroca.portal.assembler.gen.ErrorRedirect getErrorRedirect(
      ) {
    return this._errorRedirect;
  }

  /**
   * Returns the value of field 'errorScript'.
   *
   * @return the value of field 'ErrorScript'.
   */
  public net.eiroca.portal.assembler.gen.ErrorScript getErrorScript(
      ) {
    return this._errorScript;
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
   * Sets the value of field 'errorRedirect'.
   *
   * @param errorRedirect the value of field 'errorRedirect'.
   */
  public void setErrorRedirect(
      final net.eiroca.portal.assembler.gen.ErrorRedirect errorRedirect) {
    this._errorRedirect = errorRedirect;
  }

  /**
   * Sets the value of field 'errorScript'.
   *
   * @param errorScript the value of field 'errorScript'.
   */
  public void setErrorScript(
      final net.eiroca.portal.assembler.gen.ErrorScript errorScript) {
    this._errorScript = errorScript;
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
   * net.eiroca.portal.assembler.gen.SectionChoice2
   */
  public static net.eiroca.portal.assembler.gen.SectionChoice2 unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.SectionChoice2)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.SectionChoice2.class, reader);
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
