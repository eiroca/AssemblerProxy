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
 * Class PostProcessConfig.
 *
 * @version $Revision$ $Date$
 */
public class PostProcessConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  /**
   * Field _scriptPostProcessorList.
   */
  private final java.util.Vector _scriptPostProcessorList;

  //----------------/
  //- Constructors -/
  //----------------/

  public PostProcessConfig() {
    super();
    _scriptPostProcessorList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vScriptPostProcessor
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addScriptPostProcessor(
      final net.eiroca.portal.assembler.gen.ScriptPostProcessor vScriptPostProcessor) throws java.lang.IndexOutOfBoundsException {
    _scriptPostProcessorList.addElement(vScriptPostProcessor);
  }

  /**
   *
   *
   * @param index
   * @param vScriptPostProcessor
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addScriptPostProcessor(
      final int index,
      final net.eiroca.portal.assembler.gen.ScriptPostProcessor vScriptPostProcessor) throws java.lang.IndexOutOfBoundsException {
    _scriptPostProcessorList.add(index, vScriptPostProcessor);
  }

  /**
   * Method enumerateScriptPostProcessor.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.ScriptPostProcessor elements
   */
  public java.util.Enumeration enumerateScriptPostProcessor(
      ) {
    return _scriptPostProcessorList.elements();
  }

  /**
   * Method getScriptPostProcessor.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.ScriptPostProcessor at the
   * given index
   */
  public net.eiroca.portal.assembler.gen.ScriptPostProcessor getScriptPostProcessor(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _scriptPostProcessorList.size())) {
      throw new IndexOutOfBoundsException("getScriptPostProcessor: Index value '" + index + "' not in range [0.." + (_scriptPostProcessorList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.ScriptPostProcessor)_scriptPostProcessorList.get(index);
  }

  /**
   * Method getScriptPostProcessor.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call.
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.ScriptPostProcessor[] getScriptPostProcessor(
      ) {
    final net.eiroca.portal.assembler.gen.ScriptPostProcessor[] array = new net.eiroca.portal.assembler.gen.ScriptPostProcessor[0];
    return (net.eiroca.portal.assembler.gen.ScriptPostProcessor[])_scriptPostProcessorList.toArray(array);
  }

  /**
   * Method getScriptPostProcessorCount.
   *
   * @return the size of this collection
   */
  public int getScriptPostProcessorCount(
      ) {
    return _scriptPostProcessorList.size();
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
  public void removeAllScriptPostProcessor(
      ) {
    _scriptPostProcessorList.clear();
  }

  /**
   * Method removeScriptPostProcessor.
   *
   * @param vScriptPostProcessor
   * @return true if the object was removed from the collection.
   */
  public boolean removeScriptPostProcessor(
      final net.eiroca.portal.assembler.gen.ScriptPostProcessor vScriptPostProcessor) {
    final boolean removed = _scriptPostProcessorList.remove(vScriptPostProcessor);
    return removed;
  }

  /**
   * Method removeScriptPostProcessorAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.ScriptPostProcessor removeScriptPostProcessorAt(
      final int index) {
    final java.lang.Object obj = _scriptPostProcessorList.remove(index);
    return (net.eiroca.portal.assembler.gen.ScriptPostProcessor)obj;
  }

  /**
   *
   *
   * @param index
   * @param vScriptPostProcessor
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setScriptPostProcessor(
      final int index,
      final net.eiroca.portal.assembler.gen.ScriptPostProcessor vScriptPostProcessor) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _scriptPostProcessorList.size())) {
      throw new IndexOutOfBoundsException("setScriptPostProcessor: Index value '" + index + "' not in range [0.." + (_scriptPostProcessorList.size() - 1) + "]");
    }

    _scriptPostProcessorList.set(index, vScriptPostProcessor);
  }

  /**
   *
   *
   * @param vScriptPostProcessorArray
   */
  public void setScriptPostProcessor(
      final net.eiroca.portal.assembler.gen.ScriptPostProcessor[] vScriptPostProcessorArray) {
    //-- copy array
    _scriptPostProcessorList.clear();

    for (final ScriptPostProcessor element : vScriptPostProcessorArray) {
      _scriptPostProcessorList.add(element);
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
   * net.eiroca.portal.assembler.gen.PostProcessConfig
   */
  public static net.eiroca.portal.assembler.gen.PostProcessConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.PostProcessConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.PostProcessConfig.class, reader);
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
