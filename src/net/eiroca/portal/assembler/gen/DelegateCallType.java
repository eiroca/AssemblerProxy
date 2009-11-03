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
 * Class DelegateCallType.
 *
 * @version $Revision$ $Date$
 */
public class DelegateCallType implements java.io.Serializable {

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
   * Field _callParamList.
   */
  private final java.util.Vector _callParamList;

  //----------------/
  //- Constructors -/
  //----------------/

  public DelegateCallType() {
    super();
    _callParamList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vCallParam
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCallParam(
      final net.eiroca.portal.assembler.gen.CallParam vCallParam) throws java.lang.IndexOutOfBoundsException {
    _callParamList.addElement(vCallParam);
  }

  /**
   *
   *
   * @param index
   * @param vCallParam
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCallParam(
      final int index,
      final net.eiroca.portal.assembler.gen.CallParam vCallParam) throws java.lang.IndexOutOfBoundsException {
    _callParamList.add(index, vCallParam);
  }

  /**
   * Method enumerateCallParam.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.CallParam elements
   */
  public java.util.Enumeration enumerateCallParam(
      ) {
    return _callParamList.elements();
  }

  /**
   * Method getCallParam.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.CallParam at the given index
   */
  public net.eiroca.portal.assembler.gen.CallParam getCallParam(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _callParamList.size())) {
      throw new IndexOutOfBoundsException("getCallParam: Index value '" + index + "' not in range [0.." + (_callParamList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.CallParam)_callParamList.get(index);
  }

  /**
   * Method getCallParam.Returns the contents of the collection
   * in an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.CallParam[] getCallParam(
      ) {
    final net.eiroca.portal.assembler.gen.CallParam[] array = new net.eiroca.portal.assembler.gen.CallParam[0];
    return (net.eiroca.portal.assembler.gen.CallParam[])_callParamList.toArray(array);
  }

  /**
   * Method getCallParamCount.
   *
   * @return the size of this collection
   */
  public int getCallParamCount(
      ) {
    return _callParamList.size();
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
  public void removeAllCallParam(
      ) {
    _callParamList.clear();
  }

  /**
   * Method removeCallParam.
   *
   * @param vCallParam
   * @return true if the object was removed from the collection.
   */
  public boolean removeCallParam(
      final net.eiroca.portal.assembler.gen.CallParam vCallParam) {
    final boolean removed = _callParamList.remove(vCallParam);
    return removed;
  }

  /**
   * Method removeCallParamAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.CallParam removeCallParamAt(
      final int index) {
    final java.lang.Object obj = _callParamList.remove(index);
    return (net.eiroca.portal.assembler.gen.CallParam)obj;
  }

  /**
   *
   *
   * @param index
   * @param vCallParam
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setCallParam(
      final int index,
      final net.eiroca.portal.assembler.gen.CallParam vCallParam) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _callParamList.size())) {
      throw new IndexOutOfBoundsException("setCallParam: Index value '" + index + "' not in range [0.." + (_callParamList.size() - 1) + "]");
    }

    _callParamList.set(index, vCallParam);
  }

  /**
   *
   *
   * @param vCallParamArray
   */
  public void setCallParam(
      final net.eiroca.portal.assembler.gen.CallParam[] vCallParamArray) {
    //-- copy array
    _callParamList.clear();

    for (final CallParam element : vCallParamArray) {
      _callParamList.add(element);
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
   * net.eiroca.portal.assembler.gen.DelegateCallType
   */
  public static net.eiroca.portal.assembler.gen.DelegateCallType unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.DelegateCallType)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.DelegateCallType.class, reader);
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
