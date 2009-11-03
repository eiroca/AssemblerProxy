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
 * Class Section.
 *
 * @version $Revision$ $Date$
 */
public class Section implements java.io.Serializable {

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
   * Field _sectionChoice.
   */
  private net.eiroca.portal.assembler.gen.SectionChoice _sectionChoice;

  /**
   * Field _sectionChoice2.
   */
  private net.eiroca.portal.assembler.gen.SectionChoice2 _sectionChoice2;

  //----------------/
  //- Constructors -/
  //----------------/

  public Section() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

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
   * Returns the value of field 'sectionChoice'.
   *
   * @return the value of field 'SectionChoice'.
   */
  public net.eiroca.portal.assembler.gen.SectionChoice getSectionChoice(
      ) {
    return _sectionChoice;
  }

  /**
   * Returns the value of field 'sectionChoice2'.
   *
   * @return the value of field 'SectionChoice2'.
   */
  public net.eiroca.portal.assembler.gen.SectionChoice2 getSectionChoice2(
      ) {
    return _sectionChoice2;
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
   * Sets the value of field 'ID'.
   *
   * @param ID the value of field 'ID'.
   */
  public void setID(
      final java.lang.String ID) {
    _ID = ID;
  }

  /**
   * Sets the value of field 'sectionChoice'.
   *
   * @param sectionChoice the value of field 'sectionChoice'.
   */
  public void setSectionChoice(
      final net.eiroca.portal.assembler.gen.SectionChoice sectionChoice) {
    _sectionChoice = sectionChoice;
  }

  /**
   * Sets the value of field 'sectionChoice2'.
   *
   * @param sectionChoice2 the value of field 'sectionChoice2'.
   */
  public void setSectionChoice2(
      final net.eiroca.portal.assembler.gen.SectionChoice2 sectionChoice2) {
    _sectionChoice2 = sectionChoice2;
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
   * net.eiroca.portal.assembler.gen.Section
   */
  public static net.eiroca.portal.assembler.gen.Section unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Section)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Section.class, reader);
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
