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

import net.eiroca.portal.assembler.gen.ResourceType;

/**
 * Class ResourceTypeDescriptor.
 *
 * @version $Revision$ $Date$
 */
public class ResourceTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

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
  private final java.lang.String _xmlName;

  /**
   * Field _identity.
   */
  private org.exolab.castor.xml.XMLFieldDescriptor _identity;

  //----------------/
  //- Constructors -/
  //----------------/

  public ResourceTypeDescriptor() {
    super();
    _xmlName = "ResourceType";
    _elementDefinition = false;

    //-- set grouping compositor
    setCompositorAsSequence();
    org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
    org.exolab.castor.mapping.FieldHandler handler = null;
    org.exolab.castor.xml.FieldValidator fieldValidator = null;
    //-- initialize attribute descriptors

    //-- _URLMode
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.types.ResourceTypeURLModeType.class, "_URLMode", "URLMode", org.exolab.castor.xml.NodeType.Attribute);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final ResourceType target = (ResourceType)object;
        return target.getURLMode();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final ResourceType target = (ResourceType)object;
          target.setURLMode((net.eiroca.portal.assembler.gen.types.ResourceTypeURLModeType)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return null;
      }
    };
    handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(net.eiroca.portal.assembler.gen.types.ResourceTypeURLModeType.class, handler);
    desc.setImmutable(true);
    desc.setSchemaType("ResourceTypeURLModeType");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _URLMode
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _URL
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_URL", "URL", org.exolab.castor.xml.NodeType.Attribute);
    desc.setImmutable(true);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final ResourceType target = (ResourceType)object;
        return target.getURL();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final ResourceType target = (ResourceType)object;
          target.setURL((java.lang.String)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return null;
      }
    };
    desc.setSchemaType("string");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _URL
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
      org.exolab.castor.xml.validators.StringValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.StringValidator();
      fieldValidator.setValidator(typeValidator);
      typeValidator.setWhiteSpace("preserve");
    }
    desc.setValidator(fieldValidator);
    //-- _followRedirect
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_followRedirect", "FollowRedirect", org.exolab.castor.xml.NodeType.Attribute);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final ResourceType target = (ResourceType)object;
        if (!target.hasFollowRedirect()) {
          return null;
        }
        return (target.getFollowRedirect() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final ResourceType target = (ResourceType)object;
          // ignore null values for non optional primitives
          if (value == null) {
            return;
          }

          target.setFollowRedirect(((java.lang.Boolean)value).booleanValue());
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return null;
      }
    };
    desc.setSchemaType("boolean");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _followRedirect
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
      org.exolab.castor.xml.validators.BooleanValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
      fieldValidator.setValidator(typeValidator);
    }
    desc.setValidator(fieldValidator);
    //-- _ignoreError
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_ignoreError", "IgnoreError", org.exolab.castor.xml.NodeType.Attribute);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final ResourceType target = (ResourceType)object;
        if (!target.hasIgnoreError()) {
          return null;
        }
        return (target.getIgnoreError() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final ResourceType target = (ResourceType)object;
          // ignore null values for non optional primitives
          if (value == null) {
            return;
          }

          target.setIgnoreError(((java.lang.Boolean)value).booleanValue());
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return null;
      }
    };
    desc.setSchemaType("boolean");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _ignoreError
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
      org.exolab.castor.xml.validators.BooleanValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
      fieldValidator.setValidator(typeValidator);
    }
    desc.setValidator(fieldValidator);
    //-- _connectionID
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_connectionID", "ConnectionID", org.exolab.castor.xml.NodeType.Attribute);
    desc.setImmutable(true);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final ResourceType target = (ResourceType)object;
        return target.getConnectionID();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final ResourceType target = (ResourceType)object;
          target.setConnectionID((java.lang.String)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return null;
      }
    };
    desc.setSchemaType("string");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _connectionID
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

    //-- _resourceCache
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ResourceCache.class, "_resourceCache", "ResourceCache", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final ResourceType target = (ResourceType)object;
        return target.getResourceCache();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final ResourceType target = (ResourceType)object;
          target.setResourceCache((net.eiroca.portal.assembler.gen.ResourceCache)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ResourceCache();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ResourceCache");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _resourceCache
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _resourceExtractor
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ResourceExtractor.class, "_resourceExtractor", "ResourceExtractor", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      @Override
      public java.lang.Object getValue(final java.lang.Object object) throws IllegalStateException {
        final ResourceType target = (ResourceType)object;
        return target.getResourceExtractor();
      }

      @Override
      public void setValue(final java.lang.Object object, final java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          final ResourceType target = (ResourceType)object;
          target.setResourceExtractor((net.eiroca.portal.assembler.gen.ResourceExtractor)value);
        }
        catch (final java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      @Override
      public java.lang.Object newInstance(final java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ResourceExtractor();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ResourceExtractor");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _resourceExtractor
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
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
    return net.eiroca.portal.assembler.gen.ResourceType.class;
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
