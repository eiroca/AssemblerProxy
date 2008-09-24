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
 * Class PreProcessConfig.
 *
 * @version $Revision$ $Date$
 */
public class PreProcessConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _scriptPreProcessorList.
   */
  private java.util.Vector _scriptPreProcessorList;

  //----------------/
  //- Constructors -/
  //----------------/

  public PreProcessConfig() {
    super();
    this._scriptPreProcessorList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vScriptPreProcessor
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addScriptPreProcessor(
      final net.eiroca.portal.assembler.gen.ScriptPreProcessor vScriptPreProcessor) throws java.lang.IndexOutOfBoundsException {
    this._scriptPreProcessorList.addElement(vScriptPreProcessor);
  }

  /**
   *
   *
   * @param index
   * @param vScriptPreProcessor
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addScriptPreProcessor(
      final int index,
      final net.eiroca.portal.assembler.gen.ScriptPreProcessor vScriptPreProcessor) throws java.lang.IndexOutOfBoundsException {
    this._scriptPreProcessorList.add(index, vScriptPreProcessor);
  }

  /**
   * Method enumerateScriptPreProcessor.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.ScriptPreProcessor elements
   */
  public java.util.Enumeration enumerateScriptPreProcessor(
      ) {
    return this._scriptPreProcessorList.elements();
  }

  /**
   * Method getScriptPreProcessor.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.ScriptPreProcessor at the
   * given index
   */
  public net.eiroca.portal.assembler.gen.ScriptPreProcessor getScriptPreProcessor(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._scriptPreProcessorList.size()) {
      throw new IndexOutOfBoundsException("getScriptPreProcessor: Index value '" + index + "' not in range [0.." + (this._scriptPreProcessorList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.ScriptPreProcessor)_scriptPreProcessorList.get(index);
  }

  /**
   * Method getScriptPreProcessor.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call.
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.ScriptPreProcessor[] getScriptPreProcessor(
      ) {
    net.eiroca.portal.assembler.gen.ScriptPreProcessor[] array = new net.eiroca.portal.assembler.gen.ScriptPreProcessor[0];
    return (net.eiroca.portal.assembler.gen.ScriptPreProcessor[])this._scriptPreProcessorList.toArray(array);
  }

  /**
   * Method getScriptPreProcessorCount.
   *
   * @return the size of this collection
   */
  public int getScriptPreProcessorCount(
      ) {
    return this._scriptPreProcessorList.size();
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
  public void removeAllScriptPreProcessor(
      ) {
    this._scriptPreProcessorList.clear();
  }

  /**
   * Method removeScriptPreProcessor.
   *
   * @param vScriptPreProcessor
   * @return true if the object was removed from the collection.
   */
  public boolean removeScriptPreProcessor(
      final net.eiroca.portal.assembler.gen.ScriptPreProcessor vScriptPreProcessor) {
    boolean removed = _scriptPreProcessorList.remove(vScriptPreProcessor);
    return removed;
  }

  /**
   * Method removeScriptPreProcessorAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.ScriptPreProcessor removeScriptPreProcessorAt(
      final int index) {
    java.lang.Object obj = this._scriptPreProcessorList.remove(index);
    return (net.eiroca.portal.assembler.gen.ScriptPreProcessor)obj;
  }

  /**
   *
   *
   * @param index
   * @param vScriptPreProcessor
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setScriptPreProcessor(
      final int index,
      final net.eiroca.portal.assembler.gen.ScriptPreProcessor vScriptPreProcessor) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._scriptPreProcessorList.size()) {
      throw new IndexOutOfBoundsException("setScriptPreProcessor: Index value '" + index + "' not in range [0.." + (this._scriptPreProcessorList.size() - 1) + "]");
    }

    this._scriptPreProcessorList.set(index, vScriptPreProcessor);
  }

  /**
   *
   *
   * @param vScriptPreProcessorArray
   */
  public void setScriptPreProcessor(
      final net.eiroca.portal.assembler.gen.ScriptPreProcessor[] vScriptPreProcessorArray) {
    //-- copy array
    _scriptPreProcessorList.clear();

    for (int i = 0; i < vScriptPreProcessorArray.length; i++) {
      this._scriptPreProcessorList.add(vScriptPreProcessorArray[i]);
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
   * net.eiroca.portal.assembler.gen.PreProcessConfig
   */
  public static net.eiroca.portal.assembler.gen.PreProcessConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.PreProcessConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.PreProcessConfig.class, reader);
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
