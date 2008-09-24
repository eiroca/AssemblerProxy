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
 * Class Script.
 *
 * @version $Revision$ $Date$
 */
public class Script implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _scriptConfig.
   */
  private net.eiroca.portal.assembler.gen.ScriptConfig _scriptConfig;

  /**
   * Field _scriptCache.
   */
  private net.eiroca.portal.assembler.gen.ScriptCache _scriptCache;

  /**
   * Field _preProcessConfig.
   */
  private net.eiroca.portal.assembler.gen.PreProcessConfig _preProcessConfig;

  /**
   * Field _resourceList.
   */
  private java.util.Vector _resourceList;

  /**
   * Field _postProcessConfig.
   */
  private net.eiroca.portal.assembler.gen.PostProcessConfig _postProcessConfig;

  /**
   * Field _scriptSerializer.
   */
  private net.eiroca.portal.assembler.gen.ScriptSerializer _scriptSerializer;

  //----------------/
  //- Constructors -/
  //----------------/

  public Script() {
    super();
    this._resourceList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vResource
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addResource(
      final net.eiroca.portal.assembler.gen.Resource vResource) throws java.lang.IndexOutOfBoundsException {
    this._resourceList.addElement(vResource);
  }

  /**
   *
   *
   * @param index
   * @param vResource
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addResource(
      final int index,
      final net.eiroca.portal.assembler.gen.Resource vResource) throws java.lang.IndexOutOfBoundsException {
    this._resourceList.add(index, vResource);
  }

  /**
   * Method enumerateResource.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.Resource elements
   */
  public java.util.Enumeration enumerateResource(
      ) {
    return this._resourceList.elements();
  }

  /**
   * Returns the value of field 'postProcessConfig'.
   *
   * @return the value of field 'PostProcessConfig'.
   */
  public net.eiroca.portal.assembler.gen.PostProcessConfig getPostProcessConfig(
      ) {
    return this._postProcessConfig;
  }

  /**
   * Returns the value of field 'preProcessConfig'.
   *
   * @return the value of field 'PreProcessConfig'.
   */
  public net.eiroca.portal.assembler.gen.PreProcessConfig getPreProcessConfig(
      ) {
    return this._preProcessConfig;
  }

  /**
   * Method getResource.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.Resource at the given index
   */
  public net.eiroca.portal.assembler.gen.Resource getResource(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._resourceList.size()) {
      throw new IndexOutOfBoundsException("getResource: Index value '" + index + "' not in range [0.." + (this._resourceList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.Resource)_resourceList.get(index);
  }

  /**
   * Method getResource.Returns the contents of the collection in
   * an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.Resource[] getResource(
      ) {
    net.eiroca.portal.assembler.gen.Resource[] array = new net.eiroca.portal.assembler.gen.Resource[0];
    return (net.eiroca.portal.assembler.gen.Resource[])this._resourceList.toArray(array);
  }

  /**
   * Method getResourceCount.
   *
   * @return the size of this collection
   */
  public int getResourceCount(
      ) {
    return this._resourceList.size();
  }

  /**
   * Returns the value of field 'scriptCache'.
   *
   * @return the value of field 'ScriptCache'.
   */
  public net.eiroca.portal.assembler.gen.ScriptCache getScriptCache(
      ) {
    return this._scriptCache;
  }

  /**
   * Returns the value of field 'scriptConfig'.
   *
   * @return the value of field 'ScriptConfig'.
   */
  public net.eiroca.portal.assembler.gen.ScriptConfig getScriptConfig(
      ) {
    return this._scriptConfig;
  }

  /**
   * Returns the value of field 'scriptSerializer'.
   *
   * @return the value of field 'ScriptSerializer'.
   */
  public net.eiroca.portal.assembler.gen.ScriptSerializer getScriptSerializer(
      ) {
    return this._scriptSerializer;
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
  public void removeAllResource(
      ) {
    this._resourceList.clear();
  }

  /**
   * Method removeResource.
   *
   * @param vResource
   * @return true if the object was removed from the collection.
   */
  public boolean removeResource(
      final net.eiroca.portal.assembler.gen.Resource vResource) {
    boolean removed = _resourceList.remove(vResource);
    return removed;
  }

  /**
   * Method removeResourceAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.Resource removeResourceAt(
      final int index) {
    java.lang.Object obj = this._resourceList.remove(index);
    return (net.eiroca.portal.assembler.gen.Resource)obj;
  }

  /**
   * Sets the value of field 'postProcessConfig'.
   *
   * @param postProcessConfig the value of field
   * 'postProcessConfig'.
   */
  public void setPostProcessConfig(
      final net.eiroca.portal.assembler.gen.PostProcessConfig postProcessConfig) {
    this._postProcessConfig = postProcessConfig;
  }

  /**
   * Sets the value of field 'preProcessConfig'.
   *
   * @param preProcessConfig the value of field 'preProcessConfig'
   */
  public void setPreProcessConfig(
      final net.eiroca.portal.assembler.gen.PreProcessConfig preProcessConfig) {
    this._preProcessConfig = preProcessConfig;
  }

  /**
   *
   *
   * @param index
   * @param vResource
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setResource(
      final int index,
      final net.eiroca.portal.assembler.gen.Resource vResource) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._resourceList.size()) {
      throw new IndexOutOfBoundsException("setResource: Index value '" + index + "' not in range [0.." + (this._resourceList.size() - 1) + "]");
    }

    this._resourceList.set(index, vResource);
  }

  /**
   *
   *
   * @param vResourceArray
   */
  public void setResource(
      final net.eiroca.portal.assembler.gen.Resource[] vResourceArray) {
    //-- copy array
    _resourceList.clear();

    for (int i = 0; i < vResourceArray.length; i++) {
      this._resourceList.add(vResourceArray[i]);
    }
  }

  /**
   * Sets the value of field 'scriptCache'.
   *
   * @param scriptCache the value of field 'scriptCache'.
   */
  public void setScriptCache(
      final net.eiroca.portal.assembler.gen.ScriptCache scriptCache) {
    this._scriptCache = scriptCache;
  }

  /**
   * Sets the value of field 'scriptConfig'.
   *
   * @param scriptConfig the value of field 'scriptConfig'.
   */
  public void setScriptConfig(
      final net.eiroca.portal.assembler.gen.ScriptConfig scriptConfig) {
    this._scriptConfig = scriptConfig;
  }

  /**
   * Sets the value of field 'scriptSerializer'.
   *
   * @param scriptSerializer the value of field 'scriptSerializer'
   */
  public void setScriptSerializer(
      final net.eiroca.portal.assembler.gen.ScriptSerializer scriptSerializer) {
    this._scriptSerializer = scriptSerializer;
  }

  /**
   * Method unmarshal.
   *
   * @param reader
   * @throws org.exolab.castor.xml.MarshalException if object is
   * null or if any SAXException is thrown during marshaling
   * @throws org.exolab.castor.xml.ValidationException if this
   * object is an invalid instance according to the schema
   * @return the unmarshaled net.eiroca.portal.assembler.gen.Scrip
   */
  public static net.eiroca.portal.assembler.gen.Script unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Script)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Script.class, reader);
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
