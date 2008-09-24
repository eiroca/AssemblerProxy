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
 * Class CacheConfig.
 *
 * @version $Revision$ $Date$
 */
public class CacheConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _cacheDefList.
   */
  private java.util.Vector _cacheDefList;

  //----------------/
  //- Constructors -/
  //----------------/

  public CacheConfig() {
    super();
    this._cacheDefList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vCacheDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCacheDef(
      final net.eiroca.portal.assembler.gen.CacheDef vCacheDef) throws java.lang.IndexOutOfBoundsException {
    this._cacheDefList.addElement(vCacheDef);
  }

  /**
   *
   *
   * @param index
   * @param vCacheDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addCacheDef(
      final int index,
      final net.eiroca.portal.assembler.gen.CacheDef vCacheDef) throws java.lang.IndexOutOfBoundsException {
    this._cacheDefList.add(index, vCacheDef);
  }

  /**
   * Method enumerateCacheDef.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.CacheDef elements
   */
  public java.util.Enumeration enumerateCacheDef(
      ) {
    return this._cacheDefList.elements();
  }

  /**
   * Method getCacheDef.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.CacheDef at the given index
   */
  public net.eiroca.portal.assembler.gen.CacheDef getCacheDef(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._cacheDefList.size()) {
      throw new IndexOutOfBoundsException("getCacheDef: Index value '" + index + "' not in range [0.." + (this._cacheDefList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.CacheDef)_cacheDefList.get(index);
  }

  /**
   * Method getCacheDef.Returns the contents of the collection in
   * an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.CacheDef[] getCacheDef(
      ) {
    net.eiroca.portal.assembler.gen.CacheDef[] array = new net.eiroca.portal.assembler.gen.CacheDef[0];
    return (net.eiroca.portal.assembler.gen.CacheDef[])this._cacheDefList.toArray(array);
  }

  /**
   * Method getCacheDefCount.
   *
   * @return the size of this collection
   */
  public int getCacheDefCount(
      ) {
    return this._cacheDefList.size();
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
  public void removeAllCacheDef(
      ) {
    this._cacheDefList.clear();
  }

  /**
   * Method removeCacheDef.
   *
   * @param vCacheDef
   * @return true if the object was removed from the collection.
   */
  public boolean removeCacheDef(
      final net.eiroca.portal.assembler.gen.CacheDef vCacheDef) {
    boolean removed = _cacheDefList.remove(vCacheDef);
    return removed;
  }

  /**
   * Method removeCacheDefAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.CacheDef removeCacheDefAt(
      final int index) {
    java.lang.Object obj = this._cacheDefList.remove(index);
    return (net.eiroca.portal.assembler.gen.CacheDef)obj;
  }

  /**
   *
   *
   * @param index
   * @param vCacheDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setCacheDef(
      final int index,
      final net.eiroca.portal.assembler.gen.CacheDef vCacheDef) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._cacheDefList.size()) {
      throw new IndexOutOfBoundsException("setCacheDef: Index value '" + index + "' not in range [0.." + (this._cacheDefList.size() - 1) + "]");
    }

    this._cacheDefList.set(index, vCacheDef);
  }

  /**
   *
   *
   * @param vCacheDefArray
   */
  public void setCacheDef(
      final net.eiroca.portal.assembler.gen.CacheDef[] vCacheDefArray) {
    //-- copy array
    _cacheDefList.clear();

    for (int i = 0; i < vCacheDefArray.length; i++) {
      this._cacheDefList.add(vCacheDefArray[i]);
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
   * net.eiroca.portal.assembler.gen.CacheConfig
   */
  public static net.eiroca.portal.assembler.gen.CacheConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.CacheConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.CacheConfig.class, reader);
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
