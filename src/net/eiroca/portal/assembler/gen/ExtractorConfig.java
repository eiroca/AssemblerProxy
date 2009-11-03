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
 * Class ExtractorConfig.
 *
 * @version $Revision$ $Date$
 */
public class ExtractorConfig implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  /**
   * Field _extractorDefList.
   */
  private final java.util.Vector _extractorDefList;

  //----------------/
  //- Constructors -/
  //----------------/

  public ExtractorConfig() {
    super();
    _extractorDefList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vExtractorDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addExtractorDef(
      final net.eiroca.portal.assembler.gen.ExtractorDef vExtractorDef) throws java.lang.IndexOutOfBoundsException {
    _extractorDefList.addElement(vExtractorDef);
  }

  /**
   *
   *
   * @param index
   * @param vExtractorDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addExtractorDef(
      final int index,
      final net.eiroca.portal.assembler.gen.ExtractorDef vExtractorDef) throws java.lang.IndexOutOfBoundsException {
    _extractorDefList.add(index, vExtractorDef);
  }

  /**
   * Method enumerateExtractorDef.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.ExtractorDef elements
   */
  public java.util.Enumeration enumerateExtractorDef(
      ) {
    return _extractorDefList.elements();
  }

  /**
   * Method getExtractorDef.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.ExtractorDef at the given
   * index
   */
  public net.eiroca.portal.assembler.gen.ExtractorDef getExtractorDef(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _extractorDefList.size())) {
      throw new IndexOutOfBoundsException("getExtractorDef: Index value '" + index + "' not in range [0.." + (_extractorDefList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.ExtractorDef)_extractorDefList.get(index);
  }

  /**
   * Method getExtractorDef.Returns the contents of the
   * collection in an Array.  <p>Note:  Just in case the
   * collection contents are changing in another thread, we pass
   * a 0-length Array of the correct type into the API call.
   * This way we <i>know</i> that the Array returned is of
   * exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.ExtractorDef[] getExtractorDef(
      ) {
    final net.eiroca.portal.assembler.gen.ExtractorDef[] array = new net.eiroca.portal.assembler.gen.ExtractorDef[0];
    return (net.eiroca.portal.assembler.gen.ExtractorDef[])_extractorDefList.toArray(array);
  }

  /**
   * Method getExtractorDefCount.
   *
   * @return the size of this collection
   */
  public int getExtractorDefCount(
      ) {
    return _extractorDefList.size();
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
  public void removeAllExtractorDef(
      ) {
    _extractorDefList.clear();
  }

  /**
   * Method removeExtractorDef.
   *
   * @param vExtractorDef
   * @return true if the object was removed from the collection.
   */
  public boolean removeExtractorDef(
      final net.eiroca.portal.assembler.gen.ExtractorDef vExtractorDef) {
    final boolean removed = _extractorDefList.remove(vExtractorDef);
    return removed;
  }

  /**
   * Method removeExtractorDefAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.ExtractorDef removeExtractorDefAt(
      final int index) {
    final java.lang.Object obj = _extractorDefList.remove(index);
    return (net.eiroca.portal.assembler.gen.ExtractorDef)obj;
  }

  /**
   *
   *
   * @param index
   * @param vExtractorDef
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setExtractorDef(
      final int index,
      final net.eiroca.portal.assembler.gen.ExtractorDef vExtractorDef) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _extractorDefList.size())) {
      throw new IndexOutOfBoundsException("setExtractorDef: Index value '" + index + "' not in range [0.." + (_extractorDefList.size() - 1) + "]");
    }

    _extractorDefList.set(index, vExtractorDef);
  }

  /**
   *
   *
   * @param vExtractorDefArray
   */
  public void setExtractorDef(
      final net.eiroca.portal.assembler.gen.ExtractorDef[] vExtractorDefArray) {
    //-- copy array
    _extractorDefList.clear();

    for (final ExtractorDef element : vExtractorDefArray) {
      _extractorDefList.add(element);
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
   * net.eiroca.portal.assembler.gen.ExtractorConfig
   */
  public static net.eiroca.portal.assembler.gen.ExtractorConfig unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.ExtractorConfig)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.ExtractorConfig.class, reader);
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
