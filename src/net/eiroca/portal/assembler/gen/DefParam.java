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
 * Class DefParam.
 *
 * @version $Revision$ $Date$
 */
public class DefParam implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Field _name.
   */
  private java.lang.String _name;

  /**
   * Field _value.
   */
  private java.lang.String _value;

  //----------------/
  //- Constructors -/
  //----------------/

  public DefParam() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'name'.
   *
   * @return the value of field 'Name'.
   */
  public java.lang.String getName(
      ) {
    return _name;
  }

  /**
   * Returns the value of field 'value'.
   *
   * @return the value of field 'Value'.
   */
  public java.lang.String getValue(
      ) {
    return _value;
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
   * Sets the value of field 'name'.
   *
   * @param name the value of field 'name'.
   */
  public void setName(
      final java.lang.String name) {
    _name = name;
  }

  /**
   * Sets the value of field 'value'.
   *
   * @param value the value of field 'value'.
   */
  public void setValue(
      final java.lang.String value) {
    _value = value;
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
   * net.eiroca.portal.assembler.gen.DefParam
   */
  public static net.eiroca.portal.assembler.gen.DefParam unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.DefParam)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.DefParam.class, reader);
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
