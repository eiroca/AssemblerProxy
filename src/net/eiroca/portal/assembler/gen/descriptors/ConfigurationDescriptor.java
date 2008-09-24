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
 * Class ConfigurationDescriptor.
 *
 * @version $Revision$ $Date$
 */
public class ConfigurationDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

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

  public ConfigurationDescriptor() {
    super();
    _xmlName = "Configuration";
    _elementDefinition = true;

    //-- set grouping compositor
    setCompositorAsSequence();
    org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
    org.exolab.castor.mapping.FieldHandler handler = null;
    org.exolab.castor.xml.FieldValidator fieldValidator = null;
    //-- initialize attribute descriptors

    //-- initialize element descriptors

    //-- _adminConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.AdminConfig.class, "_adminConfig", "AdminConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getAdminConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setAdminConfig((net.eiroca.portal.assembler.gen.AdminConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.AdminConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.AdminConfig");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _adminConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _accessConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.AccessConfig.class, "_accessConfig", "AccessConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getAccessConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setAccessConfig((net.eiroca.portal.assembler.gen.AccessConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.AccessConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.AccessConfig");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _accessConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _cacheConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.CacheConfig.class, "_cacheConfig", "CacheConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getCacheConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setCacheConfig((net.eiroca.portal.assembler.gen.CacheConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.CacheConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.CacheConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _cacheConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _authenticationConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.AuthenticationConfig.class, "_authenticationConfig", "AuthenticationConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getAuthenticationConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setAuthenticationConfig((net.eiroca.portal.assembler.gen.AuthenticationConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.AuthenticationConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.AuthenticationConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _authenticationConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _processorConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ProcessorConfig.class, "_processorConfig", "ProcessorConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getProcessorConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setProcessorConfig((net.eiroca.portal.assembler.gen.ProcessorConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ProcessorConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ProcessorConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _processorConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _extractorConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ExtractorConfig.class, "_extractorConfig", "ExtractorConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getExtractorConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setExtractorConfig((net.eiroca.portal.assembler.gen.ExtractorConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ExtractorConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ExtractorConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _extractorConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _serializerConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.SerializerConfig.class, "_serializerConfig", "SerializerConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getSerializerConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setSerializerConfig((net.eiroca.portal.assembler.gen.SerializerConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.SerializerConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.SerializerConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _serializerConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _scriptEngineConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ScriptEngineConfig.class, "_scriptEngineConfig", "ScriptEngineConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Configuration target = (Configuration)object;
        return target.getScriptEngineConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Configuration target = (Configuration)object;
          target.setScriptEngineConfig((net.eiroca.portal.assembler.gen.ScriptEngineConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ScriptEngineConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ScriptEngineConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _scriptEngineConfig
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
    return net.eiroca.portal.assembler.gen.Configuration.class;
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
