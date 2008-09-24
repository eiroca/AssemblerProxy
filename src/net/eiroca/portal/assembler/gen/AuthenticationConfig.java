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
 * Class AuthenticationConfig.
 *
 * @version $Revision$ $Date$
 */
public class AuthenticationConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _authenticationDefList.
   */
  private java.util.Vector _authenticationDefList;

  //----------------/
  //- Constructors -/
  //----------------/

  public AuthenticationConfig() {
    super();
    this._authenticationDefList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vAuthenticationDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addAuthenticationDef(
      final net.eiroca.portal.assembler.gen.AuthenticationDef vAuthenticationDef) throws java.lang.IndexOutOfBoundsException {
    this._authenticationDefList.addElement(vAuthenticationDef);
  }

  /**
   *
   *
   * @param index
   * @param vAuthenticationDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addAuthenticationDef(
      final int index,
      final net.eiroca.portal.assembler.gen.AuthenticationDef vAuthenticationDef) throws java.lang.IndexOutOfBoundsException {
    this._authenticationDefList.add(index, vAuthenticationDef);
  }

  /**
   * Method enumerateAuthenticationDef.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.AuthenticationDef elements
   */
  public java.util.Enumeration enumerateAuthenticationDef(
      ) {
    return this._authenticationDefList.elements();
  }

  /**
   * Method getAuthenticationDef.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.AuthenticationDef at the
   * given index
   */
  public net.eiroca.portal.assembler.gen.AuthenticationDef getAuthenticationDef(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._authenticationDefList.size()) {
      throw new IndexOutOfBoundsException("getAuthenticationDef: Index value '" + index + "' not in range [0.." + (this._authenticationDefList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.AuthenticationDef)_authenticationDefList.get(index);
  }

  /**
   * Method getAuthenticationDef.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call.
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.AuthenticationDef[] getAuthenticationDef(
      ) {
    net.eiroca.portal.assembler.gen.AuthenticationDef[] array = new net.eiroca.portal.assembler.gen.AuthenticationDef[0];
    return (net.eiroca.portal.assembler.gen.AuthenticationDef[])this._authenticationDefList.toArray(array);
  }

  /**
   * Method getAuthenticationDefCount.
   *
   * @return the size of this collection
   */
  public int getAuthenticationDefCount(
      ) {
    return this._authenticationDefList.size();
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
  public void removeAllAuthenticationDef(
      ) {
    this._authenticationDefList.clear();
  }

  /**
   * Method removeAuthenticationDef.
   *
   * @param vAuthenticationDef
   * @return true if the object was removed from the collection.
   */
  public boolean removeAuthenticationDef(
      final net.eiroca.portal.assembler.gen.AuthenticationDef vAuthenticationDef) {
    boolean removed = _authenticationDefList.remove(vAuthenticationDef);
    return removed;
  }

  /**
   * Method removeAuthenticationDefAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.AuthenticationDef removeAuthenticationDefAt(
      final int index) {
    java.lang.Object obj = this._authenticationDefList.remove(index);
    return (net.eiroca.portal.assembler.gen.AuthenticationDef)obj;
  }

  /**
   *
   *
   * @param index
   * @param vAuthenticationDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setAuthenticationDef(
      final int index,
      final net.eiroca.portal.assembler.gen.AuthenticationDef vAuthenticationDef) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._authenticationDefList.size()) {
      throw new IndexOutOfBoundsException("setAuthenticationDef: Index value '" + index + "' not in range [0.." + (this._authenticationDefList.size() - 1) + "]");
    }

    this._authenticationDefList.set(index, vAuthenticationDef);
  }

  /**
   *
   *
   * @param vAuthenticationDefArray
   */
  public void setAuthenticationDef(
      final net.eiroca.portal.assembler.gen.AuthenticationDef[] vAuthenticationDefArray) {
    //-- copy array
    _authenticationDefList.clear();

    for (int i = 0; i < vAuthenticationDefArray.length; i++) {
      this._authenticationDefList.add(vAuthenticationDefArray[i]);
    }
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
   * net.eiroca.portal.assembler.gen.AuthenticationConfig
   */
  public static net.eiroca.portal.assembler.gen.AuthenticationConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.AuthenticationConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.AuthenticationConfig.class, reader);
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
