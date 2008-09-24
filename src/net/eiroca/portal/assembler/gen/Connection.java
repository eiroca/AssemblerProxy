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
 * Class Connection.
 *
 * @version $Revision$ $Date$
 */
public class Connection implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _ID.
   */
  private java.lang.String _ID;

  /**
   * Field _timeOut.
   */
  private int _timeOut;

  /**
   * keeps track of state for field: _timeOut
   */
  private boolean _has_timeOut;

  /**
   * Field _username.
   */
  private java.lang.String _username;

  /**
   * Field _password.
   */
  private java.lang.String _password;

  /**
   * Field _cookieList.
   */
  private java.util.Vector _cookieList;

  //----------------/
  //- Constructors -/
  //----------------/

  public Connection() {
    super();
    this._cookieList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vCookie
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCookie(
      final net.eiroca.portal.assembler.gen.Cookie vCookie) throws java.lang.IndexOutOfBoundsException {
    this._cookieList.addElement(vCookie);
  }

  /**
   *
   *
   * @param index
   * @param vCookie
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCookie(
      final int index,
      final net.eiroca.portal.assembler.gen.Cookie vCookie) throws java.lang.IndexOutOfBoundsException {
    this._cookieList.add(index, vCookie);
  }

  /**
   */
  public void deleteTimeOut(
      ) {
    this._has_timeOut = false;
  }

  /**
   * Method enumerateCookie.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.Cookie elements
   */
  public java.util.Enumeration enumerateCookie(
      ) {
    return this._cookieList.elements();
  }

  /**
   * Method getCookie.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.Cookie at the given index
   */
  public net.eiroca.portal.assembler.gen.Cookie getCookie(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._cookieList.size()) {
      throw new IndexOutOfBoundsException("getCookie: Index value '" + index + "' not in range [0.." + (this._cookieList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.Cookie)_cookieList.get(index);
  }

  /**
   * Method getCookie.Returns the contents of the collection in
   * an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.Cookie[] getCookie(
      ) {
    net.eiroca.portal.assembler.gen.Cookie[] array = new net.eiroca.portal.assembler.gen.Cookie[0];
    return (net.eiroca.portal.assembler.gen.Cookie[])this._cookieList.toArray(array);
  }

  /**
   * Method getCookieCount.
   *
   * @return the size of this collection
   */
  public int getCookieCount(
      ) {
    return this._cookieList.size();
  }

  /**
   * Returns the value of field 'ID'.
   *
   * @return the value of field 'ID'.
   */
  public java.lang.String getID(
      ) {
    return this._ID;
  }

  /**
   * Returns the value of field 'password'.
   *
   * @return the value of field 'Password'.
   */
  public java.lang.String getPassword(
      ) {
    return this._password;
  }

  /**
   * Returns the value of field 'timeOut'.
   *
   * @return the value of field 'TimeOut'.
   */
  public int getTimeOut(
      ) {
    return this._timeOut;
  }

  /**
   * Returns the value of field 'username'.
   *
   * @return the value of field 'Username'.
   */
  public java.lang.String getUsername(
      ) {
    return this._username;
  }

  /**
   * Method hasTimeOut.
   *
   * @return true if at least one TimeOut has been added
   */
  public boolean hasTimeOut(
      ) {
    return this._has_timeOut;
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
  public void removeAllCookie(
      ) {
    this._cookieList.clear();
  }

  /**
   * Method removeCookie.
   *
   * @param vCookie
   * @return true if the object was removed from the collection.
   */
  public boolean removeCookie(
      final net.eiroca.portal.assembler.gen.Cookie vCookie) {
    boolean removed = _cookieList.remove(vCookie);
    return removed;
  }

  /**
   * Method removeCookieAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.Cookie removeCookieAt(
      final int index) {
    java.lang.Object obj = this._cookieList.remove(index);
    return (net.eiroca.portal.assembler.gen.Cookie)obj;
  }

  /**
   *
   *
   * @param index
   * @param vCookie
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setCookie(
      final int index,
      final net.eiroca.portal.assembler.gen.Cookie vCookie) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._cookieList.size()) {
      throw new IndexOutOfBoundsException("setCookie: Index value '" + index + "' not in range [0.." + (this._cookieList.size() - 1) + "]");
    }

    this._cookieList.set(index, vCookie);
  }

  /**
   *
   *
   * @param vCookieArray
   */
  public void setCookie(
      final net.eiroca.portal.assembler.gen.Cookie[] vCookieArray) {
    //-- copy array
    _cookieList.clear();

    for (int i = 0; i < vCookieArray.length; i++) {
      this._cookieList.add(vCookieArray[i]);
    }
  }

  /**
   * Sets the value of field 'ID'.
   *
   * @param ID the value of field 'ID'.
   */
  public void setID(
      final java.lang.String ID) {
    this._ID = ID;
  }

  /**
   * Sets the value of field 'password'.
   *
   * @param password the value of field 'password'.
   */
  public void setPassword(
      final java.lang.String password) {
    this._password = password;
  }

  /**
   * Sets the value of field 'timeOut'.
   *
   * @param timeOut the value of field 'timeOut'.
   */
  public void setTimeOut(
      final int timeOut) {
    this._timeOut = timeOut;
    this._has_timeOut = true;
  }

  /**
   * Sets the value of field 'username'.
   *
   * @param username the value of field 'username'.
   */
  public void setUsername(
      final java.lang.String username) {
    this._username = username;
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
   * net.eiroca.portal.assembler.gen.Connection
   */
  public static net.eiroca.portal.assembler.gen.Connection unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Connection)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Connection.class, reader);
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
