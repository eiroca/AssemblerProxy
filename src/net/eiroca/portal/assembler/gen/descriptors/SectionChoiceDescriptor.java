/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id$
 */

package net.eiroca.portal.assembler.gen.descriptors;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import net.eiroca.portal.assembler.gen.SectionChoice;

/**
 * Class SectionChoiceDescriptor.
 *
 * @version $Revision$ $Date$
 */
public class SectionChoiceDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _elementDefinition.
   */
  private final boolean _elementDefinition;

  /**
   * Field _nsPrefix.
   */
  private java.lang.String _nsPrefix;

  /**
   * Field _nsURI.
   */
  private java.lang.String _nsURI;

  /**
   * Field _xmlName.
   */
  private java.lang.String _xmlName;

  /**
   * Field _identity.
   */
  private org.exolab.castor.xml.XMLFieldDescriptor _identity;

  //----------------/
  //- Constructors -/
  //----------------/

  public SectionChoiceDescriptor() {
    super();
    _elementDefinition = false;

    //-- set grouping compositor
    setCompositorAsChoice();
    org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
    org.exolab.castor.mapping.FieldHandler handler = null;
    org.exolab.castor.xml.FieldValidator fieldValidator = null;
    //-- initialize attribute descriptors

    //-- initialize element descriptors

    //-- _script
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.Script.class, "_script", "Script", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final SectionChoice target = (SectionChoice)object;
        return target.getScript();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final SectionChoice target = (SectionChoice)object;
          target.setScript((net.eiroca.portal.assembler.gen.Script)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.Script();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.Script");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _script
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _copy
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.Copy.class, "_copy", "Copy", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final SectionChoice target = (SectionChoice)object;
        return target.getCopy();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final SectionChoice target = (SectionChoice)object;
          target.setCopy((net.eiroca.portal.assembler.gen.Copy)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.Copy();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.Copy");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _copy
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Method getAccessMode.
   *
   * @return the access mode specified for this class.
   */
  @Override
  public org.exolab.castor.mapping.AccessMode getAccessMode(
      ) {
    return null;
  }

  /**
   * Method getIdentity.
   *
   * @return the identity field, null if this class has no
   * identity.
   */
  @Override
  public org.exolab.castor.mapping.FieldDescriptor getIdentity(
      ) {
    return _identity;
  }

  /**
   * Method getJavaClass.
   *
   * @return the Java class represented by this descriptor.
   */
  @Override
  public java.lang.Class getJavaClass(
      ) {
    return net.eiroca.portal.assembler.gen.SectionChoice.class;
  }

  /**
   * Method getNameSpacePrefix.
   *
   * @return the namespace prefix to use when marshaling as XML.
   */
  @Override
  public java.lang.String getNameSpacePrefix(
      ) {
    return _nsPrefix;
  }

  /**
   * Method getNameSpaceURI.
   *
   * @return the namespace URI used when marshaling and
   * unmarshaling as XML.
   */
  @Override
  public java.lang.String getNameSpaceURI(
      ) {
    return _nsURI;
  }

  /**
   * Method getValidator.
   *
   * @return a specific validator for the class described by this
   * ClassDescriptor.
   */
  @Override
  public org.exolab.castor.xml.TypeValidator getValidator(
      ) {
    return this;
  }

  /**
   * Method getXMLName.
   *
   * @return the XML Name for the Class being described.
   */
  @Override
  public java.lang.String getXMLName(
      ) {
    return _xmlName;
  }

  /**
   * Method isElementDefinition.
   *
   * @return true if XML schema definition of this Class is that
   * of a global
   * element or element with anonymous type definition.
   */
  @Override
  public boolean isElementDefinition(
      ) {
    return _elementDefinition;
  }

}
