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

import net.eiroca.portal.assembler.gen.*;

/**
 * Class DelegateDefTypeDescriptor.
 *
 * @version $Revision$ $Date$
 */
public class DelegateDefTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field _elementDefinition.
   */
  private boolean _elementDefinition;

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

  public DelegateDefTypeDescriptor() {
    super();
    _xmlName = "DelegateDefType";
    _elementDefinition = false;

    //-- set grouping compositor
    setCompositorAsSequence();
    org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
    org.exolab.castor.mapping.FieldHandler handler = null;
    org.exolab.castor.xml.FieldValidator fieldValidator = null;
    //-- initialize attribute descriptors

    //-- _ID
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_ID", "ID", org.exolab.castor.xml.NodeType.Attribute);
    desc.setImmutable(true);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        DelegateDefType target = (DelegateDefType)object;
        return target.getID();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          DelegateDefType target = (DelegateDefType)object;
          target.setID((java.lang.String)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return null;
      }
    };
    desc.setSchemaType("string");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _ID
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
      org.exolab.castor.xml.validators.StringValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.StringValidator();
      fieldValidator.setValidator(typeValidator);
      typeValidator.setWhiteSpace("preserve");
    }
    desc.setValidator(fieldValidator);
    //-- _className
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_className", "ClassName", org.exolab.castor.xml.NodeType.Attribute);
    desc.setImmutable(true);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        DelegateDefType target = (DelegateDefType)object;
        return target.getClassName();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          DelegateDefType target = (DelegateDefType)object;
          target.setClassName((java.lang.String)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return null;
      }
    };
    desc.setSchemaType("string");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _className
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
      org.exolab.castor.xml.validators.StringValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.StringValidator();
      fieldValidator.setValidator(typeValidator);
      typeValidator.setWhiteSpace("preserve");
    }
    desc.setValidator(fieldValidator);
    //-- initialize element descriptors

    //-- _defParamList
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.DefParam.class, "_defParamList", "DefParam", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        DelegateDefType target = (DelegateDefType)object;
        return target.getDefParam();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          DelegateDefType target = (DelegateDefType)object;
          target.addDefParam((net.eiroca.portal.assembler.gen.DefParam)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
        try {
          DelegateDefType target = (DelegateDefType)object;
          target.removeAllDefParam();
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.DefParam();
      }
    };
    desc.setSchemaType("list");
    desc.setComponentType("net.eiroca.portal.assembler.gen.DefParam");
    desc.setHandler(handler);
    desc.setMultivalued(true);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _defParamList
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(0);
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
  public org.exolab.castor.mapping.FieldDescriptor getIdentity(
      ) {
    return _identity;
  }

  /**
   * Method getJavaClass.
   *
   * @return the Java class represented by this descriptor.
   */
  public java.lang.Class getJavaClass(
      ) {
    return net.eiroca.portal.assembler.gen.DelegateDefType.class;
  }

  /**
   * Method getNameSpacePrefix.
   *
   * @return the namespace prefix to use when marshaling as XML.
   */
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
  public org.exolab.castor.xml.TypeValidator getValidator(
      ) {
    return this;
  }

  /**
   * Method getXMLName.
   *
   * @return the XML Name for the Class being described.
   */
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
  public boolean isElementDefinition(
      ) {
    return _elementDefinition;
  }

}
