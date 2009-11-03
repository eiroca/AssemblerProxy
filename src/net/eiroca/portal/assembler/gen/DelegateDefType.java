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
 * Class DelegateDefType.
 *
 * @version $Revision$ $Date$
 */
public class DelegateDefType implements java.io.Serializable {

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
   * Field _className.
   */
  private java.lang.String _className;

  /**
   * Field _defParamList.
   */
  private final java.util.Vector _defParamList;

  //----------------/
  //- Constructors -/
  //----------------/

  public DelegateDefType() {
    super();
    _defParamList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vDefParam
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addDefParam(
      final net.eiroca.portal.assembler.gen.DefParam vDefParam) throws java.lang.IndexOutOfBoundsException {
    _defParamList.addElement(vDefParam);
  }

  /**
   *
   *
   * @param index
   * @param vDefParam
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addDefParam(
      final int index,
      final net.eiroca.portal.assembler.gen.DefParam vDefParam) throws java.lang.IndexOutOfBoundsException {
    _defParamList.add(index, vDefParam);
  }

  /**
   * Method enumerateDefParam.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.DefParam elements
   */
  public java.util.Enumeration enumerateDefParam(
      ) {
    return _defParamList.elements();
  }

  /**
   * Returns the value of field 'className'.
   *
   * @return the value of field 'ClassName'.
   */
  public java.lang.String getClassName(
      ) {
    return _className;
  }

  /**
   * Method getDefParam.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.DefParam at the given index
   */
  public net.eiroca.portal.assembler.gen.DefParam getDefParam(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _defParamList.size())) {
      throw new IndexOutOfBoundsException("getDefParam: Index value '" + index + "' not in range [0.." + (_defParamList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.DefParam)_defParamList.get(index);
  }

  /**
   * Method getDefParam.Returns the contents of the collection in
   * an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.DefParam[] getDefParam(
      ) {
    final net.eiroca.portal.assembler.gen.DefParam[] array = new net.eiroca.portal.assembler.gen.DefParam[0];
    return (net.eiroca.portal.assembler.gen.DefParam[])_defParamList.toArray(array);
  }

  /**
   * Method getDefParamCount.
   *
   * @return the size of this collection
   */
  public int getDefParamCount(
      ) {
    return _defParamList.size();
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
   */
  public void removeAllDefParam(
      ) {
    _defParamList.clear();
  }

  /**
   * Method removeDefParam.
   *
   * @param vDefParam
   * @return true if the object was removed from the collection.
   */
  public boolean removeDefParam(
      final net.eiroca.portal.assembler.gen.DefParam vDefParam) {
    final boolean removed = _defParamList.remove(vDefParam);
    return removed;
  }

  /**
   * Method removeDefParamAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.DefParam removeDefParamAt(
      final int index) {
    final java.lang.Object obj = _defParamList.remove(index);
    return (net.eiroca.portal.assembler.gen.DefParam)obj;
  }

  /**
   * Sets the value of field 'className'.
   *
   * @param className the value of field 'className'.
   */
  public void setClassName(
      final java.lang.String className) {
    _className = className;
  }

  /**
   *
   *
   * @param index
   * @param vDefParam
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setDefParam(
      final int index,
      final net.eiroca.portal.assembler.gen.DefParam vDefParam) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _defParamList.size())) {
      throw new IndexOutOfBoundsException("setDefParam: Index value '" + index + "' not in range [0.." + (_defParamList.size() - 1) + "]");
    }

    _defParamList.set(index, vDefParam);
  }

  /**
   *
   *
   * @param vDefParamArray
   */
  public void setDefParam(
      final net.eiroca.portal.assembler.gen.DefParam[] vDefParamArray) {
    //-- copy array
    _defParamList.clear();

    for (final DefParam element : vDefParamArray) {
      _defParamList.add(element);
    }
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
   * net.eiroca.portal.assembler.gen.DelegateDefType
   */
  public static net.eiroca.portal.assembler.gen.DelegateDefType unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.DelegateDefType)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.DelegateDefType.class, reader);
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
