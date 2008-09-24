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
 * Class ScriptDescriptor.
 *
 * @version $Revision$ $Date$
 */
public class ScriptDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

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

  public ScriptDescriptor() {
    super();
    _xmlName = "Script";
    _elementDefinition = true;

    //-- set grouping compositor
    setCompositorAsSequence();
    org.exolab.castor.xml.util.XMLFieldDescriptorImpl desc = null;
    org.exolab.castor.mapping.FieldHandler handler = null;
    org.exolab.castor.xml.FieldValidator fieldValidator = null;
    //-- initialize attribute descriptors

    //-- initialize element descriptors

    //-- _scriptConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ScriptConfig.class, "_scriptConfig", "ScriptConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Script target = (Script)object;
        return target.getScriptConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Script target = (Script)object;
          target.setScriptConfig((net.eiroca.portal.assembler.gen.ScriptConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ScriptConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ScriptConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _scriptConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _scriptCache
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ScriptCache.class, "_scriptCache", "ScriptCache", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Script target = (Script)object;
        return target.getScriptCache();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Script target = (Script)object;
          target.setScriptCache((net.eiroca.portal.assembler.gen.ScriptCache)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ScriptCache();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ScriptCache");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _scriptCache
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _preProcessConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.PreProcessConfig.class, "_preProcessConfig", "PreProcessConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Script target = (Script)object;
        return target.getPreProcessConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Script target = (Script)object;
          target.setPreProcessConfig((net.eiroca.portal.assembler.gen.PreProcessConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.PreProcessConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.PreProcessConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _preProcessConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _resourceList
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.Resource.class, "_resourceList", "Resource", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Script target = (Script)object;
        return target.getResource();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Script target = (Script)object;
          target.addResource((net.eiroca.portal.assembler.gen.Resource)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
        try {
          Script target = (Script)object;
          target.removeAllResource();
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.Resource();
      }
    };
    desc.setSchemaType("list");
    desc.setComponentType("net.eiroca.portal.assembler.gen.Resource");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(true);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _resourceList
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _postProcessConfig
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.PostProcessConfig.class, "_postProcessConfig", "PostProcessConfig", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Script target = (Script)object;
        return target.getPostProcessConfig();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Script target = (Script)object;
          target.setPostProcessConfig((net.eiroca.portal.assembler.gen.PostProcessConfig)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.PostProcessConfig();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.PostProcessConfig");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _postProcessConfig
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
    }
    desc.setValidator(fieldValidator);
    //-- _scriptSerializer
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.ScriptSerializer.class, "_scriptSerializer", "ScriptSerializer", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Script target = (Script)object;
        return target.getScriptSerializer();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Script target = (Script)object;
          target.setScriptSerializer((net.eiroca.portal.assembler.gen.ScriptSerializer)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.ScriptSerializer();
      }
    };
    desc.setSchemaType("net.eiroca.portal.assembler.gen.ScriptSerializer");
    desc.setHandler(handler);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _scriptSerializer
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
    return net.eiroca.portal.assembler.gen.Script.class;
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
