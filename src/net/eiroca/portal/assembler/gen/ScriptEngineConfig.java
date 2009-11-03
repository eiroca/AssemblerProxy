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
 * Class ScriptEngineConfig.
 *
 * @version $Revision$ $Date$
 */
public class ScriptEngineConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  /**
   * Field _scriptEngineDefList.
   */
  private final java.util.Vector _scriptEngineDefList;

  //----------------/
  //- Constructors -/
  //----------------/

  public ScriptEngineConfig() {
    super();
    _scriptEngineDefList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vScriptEngineDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addScriptEngineDef(
      final net.eiroca.portal.assembler.gen.ScriptEngineDef vScriptEngineDef) throws java.lang.IndexOutOfBoundsException {
    _scriptEngineDefList.addElement(vScriptEngineDef);
  }

  /**
   *
   *
   * @param index
   * @param vScriptEngineDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addScriptEngineDef(
      final int index,
      final net.eiroca.portal.assembler.gen.ScriptEngineDef vScriptEngineDef) throws java.lang.IndexOutOfBoundsException {
    _scriptEngineDefList.add(index, vScriptEngineDef);
  }

  /**
   * Method enumerateScriptEngineDef.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.ScriptEngineDef elements
   */
  public java.util.Enumeration enumerateScriptEngineDef(
      ) {
    return _scriptEngineDefList.elements();
  }

  /**
   * Method getScriptEngineDef.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.ScriptEngineDef at the given
   * index
   */
  public net.eiroca.portal.assembler.gen.ScriptEngineDef getScriptEngineDef(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _scriptEngineDefList.size())) {
      throw new IndexOutOfBoundsException("getScriptEngineDef: Index value '" + index + "' not in range [0.." + (_scriptEngineDefList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.ScriptEngineDef)_scriptEngineDefList.get(index);
  }

  /**
   * Method getScriptEngineDef.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call.
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.ScriptEngineDef[] getScriptEngineDef(
      ) {
    final net.eiroca.portal.assembler.gen.ScriptEngineDef[] array = new net.eiroca.portal.assembler.gen.ScriptEngineDef[0];
    return (net.eiroca.portal.assembler.gen.ScriptEngineDef[])_scriptEngineDefList.toArray(array);
  }

  /**
   * Method getScriptEngineDefCount.
   *
   * @return the size of this collection
   */
  public int getScriptEngineDefCount(
      ) {
    return _scriptEngineDefList.size();
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
  public void removeAllScriptEngineDef(
      ) {
    _scriptEngineDefList.clear();
  }

  /**
   * Method removeScriptEngineDef.
   *
   * @param vScriptEngineDef
   * @return true if the object was removed from the collection.
   */
  public boolean removeScriptEngineDef(
      final net.eiroca.portal.assembler.gen.ScriptEngineDef vScriptEngineDef) {
    final boolean removed = _scriptEngineDefList.remove(vScriptEngineDef);
    return removed;
  }

  /**
   * Method removeScriptEngineDefAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.ScriptEngineDef removeScriptEngineDefAt(
      final int index) {
    final java.lang.Object obj = _scriptEngineDefList.remove(index);
    return (net.eiroca.portal.assembler.gen.ScriptEngineDef)obj;
  }

  /**
   *
   *
   * @param index
   * @param vScriptEngineDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setScriptEngineDef(
      final int index,
      final net.eiroca.portal.assembler.gen.ScriptEngineDef vScriptEngineDef) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _scriptEngineDefList.size())) {
      throw new IndexOutOfBoundsException("setScriptEngineDef: Index value '" + index + "' not in range [0.." + (_scriptEngineDefList.size() - 1) + "]");
    }

    _scriptEngineDefList.set(index, vScriptEngineDef);
  }

  /**
   *
   *
   * @param vScriptEngineDefArray
   */
  public void setScriptEngineDef(
      final net.eiroca.portal.assembler.gen.ScriptEngineDef[] vScriptEngineDefArray) {
    //-- copy array
    _scriptEngineDefList.clear();

    for (final ScriptEngineDef element : vScriptEngineDefArray) {
      _scriptEngineDefList.add(element);
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
   * net.eiroca.portal.assembler.gen.ScriptEngineConfig
   */
  public static net.eiroca.portal.assembler.gen.ScriptEngineConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.ScriptEngineConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.ScriptEngineConfig.class, reader);
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
