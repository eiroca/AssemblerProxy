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
 * Class ScriptConfigType.
 *
 * @version $Revision$ $Date$
 */
public class ScriptConfigType implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * Field _scriptEngineID.
   */
  private java.lang.String _scriptEngineID;

  /**
   * Field _scriptPath.
   */
  private java.lang.String _scriptPath;

  //----------------/
  //- Constructors -/
  //----------------/

  public ScriptConfigType() {
    super();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Returns the value of field 'scriptEngineID'.
   *
   * @return the value of field 'ScriptEngineID'.
   */
  public java.lang.String getScriptEngineID(
      ) {
    return _scriptEngineID;
  }

  /**
   * Returns the value of field 'scriptPath'.
   *
   * @return the value of field 'ScriptPath'.
   */
  public java.lang.String getScriptPath(
      ) {
    return _scriptPath;
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
   * Sets the value of field 'scriptEngineID'.
   *
   * @param scriptEngineID the value of field 'scriptEngineID'.
   */
  public void setScriptEngineID(
      final java.lang.String scriptEngineID) {
    _scriptEngineID = scriptEngineID;
  }

  /**
   * Sets the value of field 'scriptPath'.
   *
   * @param scriptPath the value of field 'scriptPath'.
   */
  public void setScriptPath(
      final java.lang.String scriptPath) {
    _scriptPath = scriptPath;
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
   * net.eiroca.portal.assembler.gen.ScriptConfigType
   */
  public static net.eiroca.portal.assembler.gen.ScriptConfigType unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.ScriptConfigType)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.ScriptConfigType.class, reader);
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
