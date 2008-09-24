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
 * Class SerializerConfig.
 *
 * @version $Revision$ $Date$
 */
public class SerializerConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _serializerDefList.
   */
  private java.util.Vector _serializerDefList;

  //----------------/
  //- Constructors -/
  //----------------/

  public SerializerConfig() {
    super();
    this._serializerDefList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vSerializerDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addSerializerDef(
      final net.eiroca.portal.assembler.gen.SerializerDef vSerializerDef) throws java.lang.IndexOutOfBoundsException {
    this._serializerDefList.addElement(vSerializerDef);
  }

  /**
   *
   *
   * @param index
   * @param vSerializerDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addSerializerDef(
      final int index,
      final net.eiroca.portal.assembler.gen.SerializerDef vSerializerDef) throws java.lang.IndexOutOfBoundsException {
    this._serializerDefList.add(index, vSerializerDef);
  }

  /**
   * Method enumerateSerializerDef.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.SerializerDef elements
   */
  public java.util.Enumeration enumerateSerializerDef(
      ) {
    return this._serializerDefList.elements();
  }

  /**
   * Method getSerializerDef.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.SerializerDef at the given
   * index
   */
  public net.eiroca.portal.assembler.gen.SerializerDef getSerializerDef(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._serializerDefList.size()) {
      throw new IndexOutOfBoundsException("getSerializerDef: Index value '" + index + "' not in range [0.." + (this._serializerDefList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.SerializerDef)_serializerDefList.get(index);
  }

  /**
   * Method getSerializerDef.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call.
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.SerializerDef[] getSerializerDef(
      ) {
    net.eiroca.portal.assembler.gen.SerializerDef[] array = new net.eiroca.portal.assembler.gen.SerializerDef[0];
    return (net.eiroca.portal.assembler.gen.SerializerDef[])this._serializerDefList.toArray(array);
  }

  /**
   * Method getSerializerDefCount.
   *
   * @return the size of this collection
   */
  public int getSerializerDefCount(
      ) {
    return this._serializerDefList.size();
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
  public void removeAllSerializerDef(
      ) {
    this._serializerDefList.clear();
  }

  /**
   * Method removeSerializerDef.
   *
   * @param vSerializerDef
   * @return true if the object was removed from the collection.
   */
  public boolean removeSerializerDef(
      final net.eiroca.portal.assembler.gen.SerializerDef vSerializerDef) {
    boolean removed = _serializerDefList.remove(vSerializerDef);
    return removed;
  }

  /**
   * Method removeSerializerDefAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.SerializerDef removeSerializerDefAt(
      final int index) {
    java.lang.Object obj = this._serializerDefList.remove(index);
    return (net.eiroca.portal.assembler.gen.SerializerDef)obj;
  }

  /**
   *
   *
   * @param index
   * @param vSerializerDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setSerializerDef(
      final int index,
      final net.eiroca.portal.assembler.gen.SerializerDef vSerializerDef) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._serializerDefList.size()) {
      throw new IndexOutOfBoundsException("setSerializerDef: Index value '" + index + "' not in range [0.." + (this._serializerDefList.size() - 1) + "]");
    }

    this._serializerDefList.set(index, vSerializerDef);
  }

  /**
   *
   *
   * @param vSerializerDefArray
   */
  public void setSerializerDef(
      final net.eiroca.portal.assembler.gen.SerializerDef[] vSerializerDefArray) {
    //-- copy array
    _serializerDefList.clear();

    for (int i = 0; i < vSerializerDefArray.length; i++) {
      this._serializerDefList.add(vSerializerDefArray[i]);
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
   * net.eiroca.portal.assembler.gen.SerializerConfig
   */
  public static net.eiroca.portal.assembler.gen.SerializerConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.SerializerConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.SerializerConfig.class, reader);
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
