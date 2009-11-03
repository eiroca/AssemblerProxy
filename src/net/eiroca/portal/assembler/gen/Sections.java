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
 * Class Sections.
 *
 * @version $Revision$ $Date$
 */
public class Sections implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  /**
   * Field _sectionList.
   */
  private final java.util.Vector _sectionList;

  //----------------/
  //- Constructors -/
  //----------------/

  public Sections() {
    super();
    _sectionList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vSection
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addSection(
      final net.eiroca.portal.assembler.gen.Section vSection) throws java.lang.IndexOutOfBoundsException {
    _sectionList.addElement(vSection);
  }

  /**
   *
   *
   * @param index
   * @param vSection
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addSection(
      final int index,
      final net.eiroca.portal.assembler.gen.Section vSection) throws java.lang.IndexOutOfBoundsException {
    _sectionList.add(index, vSection);
  }

  /**
   * Method enumerateSection.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.Section elements
   */
  public java.util.Enumeration enumerateSection(
      ) {
    return _sectionList.elements();
  }

  /**
   * Method getSection.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.Section at the given index
   */
  public net.eiroca.portal.assembler.gen.Section getSection(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _sectionList.size())) {
      throw new IndexOutOfBoundsException("getSection: Index value '" + index + "' not in range [0.." + (_sectionList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.Section)_sectionList.get(index);
  }

  /**
   * Method getSection.Returns the contents of the collection in
   * an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.Section[] getSection(
      ) {
    final net.eiroca.portal.assembler.gen.Section[] array = new net.eiroca.portal.assembler.gen.Section[0];
    return (net.eiroca.portal.assembler.gen.Section[])_sectionList.toArray(array);
  }

  /**
   * Method getSectionCount.
   *
   * @return the size of this collection
   */
  public int getSectionCount(
      ) {
    return _sectionList.size();
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
  public void removeAllSection(
      ) {
    _sectionList.clear();
  }

  /**
   * Method removeSection.
   *
   * @param vSection
   * @return true if the object was removed from the collection.
   */
  public boolean removeSection(
      final net.eiroca.portal.assembler.gen.Section vSection) {
    final boolean removed = _sectionList.remove(vSection);
    return removed;
  }

  /**
   * Method removeSectionAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.Section removeSectionAt(
      final int index) {
    final java.lang.Object obj = _sectionList.remove(index);
    return (net.eiroca.portal.assembler.gen.Section)obj;
  }

  /**
   *
   *
   * @param index
   * @param vSection
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setSection(
      final int index,
      final net.eiroca.portal.assembler.gen.Section vSection) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _sectionList.size())) {
      throw new IndexOutOfBoundsException("setSection: Index value '" + index + "' not in range [0.." + (_sectionList.size() - 1) + "]");
    }

    _sectionList.set(index, vSection);
  }

  /**
   *
   *
   * @param vSectionArray
   */
  public void setSection(
      final net.eiroca.portal.assembler.gen.Section[] vSectionArray) {
    //-- copy array
    _sectionList.clear();

    for (final Section element : vSectionArray) {
      _sectionList.add(element);
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
   * net.eiroca.portal.assembler.gen.Sections
   */
  public static net.eiroca.portal.assembler.gen.Sections unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Sections)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Sections.class, reader);
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
