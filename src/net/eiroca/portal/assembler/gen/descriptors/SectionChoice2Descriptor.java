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

import net.eiroca.portal.assembler.gen.SectionChoice2;

/**
 * Class SectionChoice2Descriptor.
 *
 * @version $Revision$ $Date$
 */
public class SectionChoice2Descriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

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

  public SectionChoice2Descriptor() {
    super();
    _elementDefinition = false;

    //-- set grouping compositor
    setCompositorAsChoice();
    org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
    org.exolab.castor.mapping.FieldHandler handler = null;
    org.exolab.castor.xml.FieldValidator fieldValidator = null;
    //-- initialize attribute descriptors

    //-- initialize element descriptors

    //-- _errorRedirect
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ErrorRedirect.class, "_errorRedirect", "ErrorRedirect", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final SectionChoice2 target = (SectionChoice2)object;
        return target.getErrorRedirect();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final SectionChoice2 target = (SectionChoice2)object;
          target.setErrorRedirect((net.eiroca.portal.assembler.gen.ErrorRedirect)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ErrorRedirect();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ErrorRedirect");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _errorRedirect
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _errorScript
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ErrorScript.class, "_errorScript", "ErrorScript", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final SectionChoice2 target = (SectionChoice2)object;
        return target.getErrorScript();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final SectionChoice2 target = (SectionChoice2)object;
          target.setErrorScript((net.eiroca.portal.assembler.gen.ErrorScript)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ErrorScript();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ErrorScript");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _errorScript
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
    return net.eiroca.portal.assembler.gen.SectionChoice2.class;
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
