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
 * Class ProcessorConfig.
 *
 * @version $Revision$ $Date$
 */
public class ProcessorConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _processorDefList.
   */
  private java.util.Vector _processorDefList;

  //----------------/
  //- Constructors -/
  //----------------/

  public ProcessorConfig() {
    super();
    this._processorDefList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vProcessorDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addProcessorDef(
      final net.eiroca.portal.assembler.gen.ProcessorDef vProcessorDef) throws java.lang.IndexOutOfBoundsException {
    this._processorDefList.addElement(vProcessorDef);
  }

  /**
   *
   *
   * @param index
   * @param vProcessorDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addProcessorDef(
      final int index,
      final net.eiroca.portal.assembler.gen.ProcessorDef vProcessorDef) throws java.lang.IndexOutOfBoundsException {
    this._processorDefList.add(index, vProcessorDef);
  }

  /**
   * Method enumerateProcessorDef.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.ProcessorDef elements
   */
  public java.util.Enumeration enumerateProcessorDef(
      ) {
    return this._processorDefList.elements();
  }

  /**
   * Method getProcessorDef.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.ProcessorDef at the given
   * index
   */
  public net.eiroca.portal.assembler.gen.ProcessorDef getProcessorDef(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._processorDefList.size()) {
      throw new IndexOutOfBoundsException("getProcessorDef: Index value '" + index + "' not in range [0.." + (this._processorDefList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.ProcessorDef)_processorDefList.get(index);
  }

  /**
   * Method getProcessorDef.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call.
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.ProcessorDef[] getProcessorDef(
      ) {
    net.eiroca.portal.assembler.gen.ProcessorDef[] array = new net.eiroca.portal.assembler.gen.ProcessorDef[0];
    return (net.eiroca.portal.assembler.gen.ProcessorDef[])this._processorDefList.toArray(array);
  }

  /**
   * Method getProcessorDefCount.
   *
   * @return the size of this collection
   */
  public int getProcessorDefCount(
      ) {
    return this._processorDefList.size();
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
  public void removeAllProcessorDef(
      ) {
    this._processorDefList.clear();
  }

  /**
   * Method removeProcessorDef.
   *
   * @param vProcessorDef
   * @return true if the object was removed from the collection.
   */
  public boolean removeProcessorDef(
      final net.eiroca.portal.assembler.gen.ProcessorDef vProcessorDef) {
    boolean removed = _processorDefList.remove(vProcessorDef);
    return removed;
  }

  /**
   * Method removeProcessorDefAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.ProcessorDef removeProcessorDefAt(
      final int index) {
    java.lang.Object obj = this._processorDefList.remove(index);
    return (net.eiroca.portal.assembler.gen.ProcessorDef)obj;
  }

  /**
   *
   *
   * @param index
   * @param vProcessorDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setProcessorDef(
      final int index,
      final net.eiroca.portal.assembler.gen.ProcessorDef vProcessorDef) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if (index < 0 || index >= this._processorDefList.size()) {
      throw new IndexOutOfBoundsException("setProcessorDef: Index value '" + index + "' not in range [0.." + (this._processorDefList.size() - 1) + "]");
    }

    this._processorDefList.set(index, vProcessorDef);
  }

  /**
   *
   *
   * @param vProcessorDefArray
   */
  public void setProcessorDef(
      final net.eiroca.portal.assembler.gen.ProcessorDef[] vProcessorDefArray) {
    //-- copy array
    _processorDefList.clear();

    for (int i = 0; i < vProcessorDefArray.length; i++) {
      this._processorDefList.add(vProcessorDefArray[i]);
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
   * net.eiroca.portal.assembler.gen.ProcessorConfig
   */
  public static net.eiroca.portal.assembler.gen.ProcessorConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.ProcessorConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.ProcessorConfig.class, reader);
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
