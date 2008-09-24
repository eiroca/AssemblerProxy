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
 * Class Applications.
 *
 * @version $Revision$ $Date$
 */
public class Applications implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _sesNameHTTPClients.
   */
  private java.lang.String _sesNameHTTPClients;

  /**
   * Field _applicationList.
   */
  private java.util.Vector _applicationList;

  //----------------/
  //- Constructors -/
  //----------------/

  public Applications() {
    super();
    this._applicationList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vApplication
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addApplication(
      final net.eiroca.portal.assembler.gen.Application vApplication) throws java.lang.IndexOutOfBoundsException {
    this._applicationList.addElement(vApplication);
  }

  /**
   *
   *
   * @param index
   * @param vApplication
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addApplication(
      final int index,
      final net.eiroca.portal.assembler.gen.Application vApplication) throws java.lang.IndexOutOfBoundsException {
    this._applicationList.add(index, vApplication);
  }

  /**
   * Method enumerateApplication.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.Application elements
   */
  public java.util.Enumeration enumerateApplication(
      ) {
    return this._applicationList.elements();
  }

  /**
   * Method getApplication.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.Application at the given inde
   */
  public net.eiroca.portal.assembler.gen.Application getApplication(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._applicationList.size()) {
      throw new IndexOutOfBoundsException("getApplication: Index value '" + index + "' not in range [0.." + (this._applicationList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.Application)_applicationList.get(index);
  }

  /**
   * Method getApplication.Returns the contents of the collection
   * in an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.Application[] getApplication(
      ) {
    net.eiroca.portal.assembler.gen.Application[] array = new net.eiroca.portal.assembler.gen.Application[0];
    return (net.eiroca.portal.assembler.gen.Application[])this._applicationList.toArray(array);
  }

  /**
   * Method getApplicationCount.
   *
   * @return the size of this collection
   */
  public int getApplicationCount(
      ) {
    return this._applicationList.size();
  }

  /**
   * Returns the value of field 'sesNameHTTPClients'.
   *
   * @return the value of field 'SesNameHTTPClients'.
   */
  public java.lang.String getSesNameHTTPClients(
      ) {
    return this._sesNameHTTPClients;
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
   */
  public void removeAllApplication(
      ) {
    this._applicationList.clear();
  }

  /**
   * Method removeApplication.
   *
   * @param vApplication
   * @return true if the object was removed from the collection.
   */
  public boolean removeApplication(
      final net.eiroca.portal.assembler.gen.Application vApplication) {
    boolean removed = _applicationList.remove(vApplication);
    return removed;
  }

  /**
   * Method removeApplicationAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.Application removeApplicationAt(
      final int index) {
    java.lang.Object obj = this._applicationList.remove(index);
    return (net.eiroca.portal.assembler.gen.Application)obj;
  }

  /**
   *
   *
   * @param index
   * @param vApplication
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setApplication(
      final int index,
      final net.eiroca.portal.assembler.gen.Application vApplication) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._applicationList.size()) {
      throw new IndexOutOfBoundsException("setApplication: Index value '" + index + "' not in range [0.." + (this._applicationList.size() - 1) + "]");
    }

    this._applicationList.set(index, vApplication);
  }

  /**
   *
   *
   * @param vApplicationArray
   */
  public void setApplication(
      final net.eiroca.portal.assembler.gen.Application[] vApplicationArray) {
    //-- copy array
    _applicationList.clear();

    for (int i = 0; i < vApplicationArray.length; i++) {
      this._applicationList.add(vApplicationArray[i]);
    }
  }

  /**
   * Sets the value of field 'sesNameHTTPClients'.
   *
   * @param sesNameHTTPClients the value of field
   * 'sesNameHTTPClients'.
   */
  public void setSesNameHTTPClients(
      final java.lang.String sesNameHTTPClients) {
    this._sesNameHTTPClients = sesNameHTTPClients;
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
   * net.eiroca.portal.assembler.gen.Applications
   */
  public static net.eiroca.portal.assembler.gen.Applications unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Applications)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Applications.class, reader);
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
