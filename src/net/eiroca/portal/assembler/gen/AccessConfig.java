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
 * Class AccessConfig.
 *
 * @version $Revision$ $Date$
 */
public class AccessConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _accessDefList.
   */
  private java.util.Vector _accessDefList;

  //----------------/
  //- Constructors -/
  //----------------/

  public AccessConfig() {
    super();
    this._accessDefList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vAccessDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addAccessDef(
      final net.eiroca.portal.assembler.gen.AccessDef vAccessDef) throws java.lang.IndexOutOfBoundsException {
    this._accessDefList.addElement(vAccessDef);
  }

  /**
   *
   *
   * @param index
   * @param vAccessDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addAccessDef(
      final int index,
      final net.eiroca.portal.assembler.gen.AccessDef vAccessDef) throws java.lang.IndexOutOfBoundsException {
    this._accessDefList.add(index, vAccessDef);
  }

  /**
   * Method enumerateAccessDef.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.AccessDef elements
   */
  public java.util.Enumeration enumerateAccessDef(
      ) {
    return this._accessDefList.elements();
  }

  /**
   * Method getAccessDef.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.AccessDef at the given index
   */
  public net.eiroca.portal.assembler.gen.AccessDef getAccessDef(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._accessDefList.size()) {
      throw new IndexOutOfBoundsException("getAccessDef: Index value '" + index + "' not in range [0.." + (this._accessDefList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.AccessDef)_accessDefList.get(index);
  }

  /**
   * Method getAccessDef.Returns the contents of the collection
   * in an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.AccessDef[] getAccessDef(
      ) {
    net.eiroca.portal.assembler.gen.AccessDef[] array = new net.eiroca.portal.assembler.gen.AccessDef[0];
    return (net.eiroca.portal.assembler.gen.AccessDef[])this._accessDefList.toArray(array);
  }

  /**
   * Method getAccessDefCount.
   *
   * @return the size of this collection
   */
  public int getAccessDefCount(
      ) {
    return this._accessDefList.size();
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
   * Method removeAccessDef.
   *
   * @param vAccessDef
   * @return true if the object was removed from the collection.
   */
  public boolean removeAccessDef(
      final net.eiroca.portal.assembler.gen.AccessDef vAccessDef) {
    boolean removed = _accessDefList.remove(vAccessDef);
    return removed;
  }

  /**
   * Method removeAccessDefAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.AccessDef removeAccessDefAt(
      final int index) {
    java.lang.Object obj = this._accessDefList.remove(index);
    return (net.eiroca.portal.assembler.gen.AccessDef)obj;
  }

  /**
   */
  public void removeAllAccessDef(
      ) {
    this._accessDefList.clear();
  }

  /**
   *
   *
   * @param index
   * @param vAccessDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setAccessDef(
      final int index,
      final net.eiroca.portal.assembler.gen.AccessDef vAccessDef) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._accessDefList.size()) {
      throw new IndexOutOfBoundsException("setAccessDef: Index value '" + index + "' not in range [0.." + (this._accessDefList.size() - 1) + "]");
    }

    this._accessDefList.set(index, vAccessDef);
  }

  /**
   *
   *
   * @param vAccessDefArray
   */
  public void setAccessDef(
      final net.eiroca.portal.assembler.gen.AccessDef[] vAccessDefArray) {
    //-- copy array
    _accessDefList.clear();

    for (int i = 0; i < vAccessDefArray.length; i++) {
      this._accessDefList.add(vAccessDefArray[i]);
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
   * net.eiroca.portal.assembler.gen.AccessConfig
   */
  public static net.eiroca.portal.assembler.gen.AccessConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.AccessConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.AccessConfig.class, reader);
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
