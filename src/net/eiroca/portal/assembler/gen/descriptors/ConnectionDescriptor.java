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
 * Class ConnectionDescriptor.
 *
 * @version $Revision$ $Date$
 */
public class ConnectionDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {

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

  public ConnectionDescriptor() {
    super();
    _xmlName = "Connection";
    _elementDefinition = true;

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
        Connection target = (Connection)object;
        return target.getID();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Connection target = (Connection)object;
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
    //-- _timeOut
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_timeOut", "TimeOut", org.exolab.castor.xml.NodeType.Attribute);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Connection target = (Connection)object;
        if (!target.hasTimeOut()) {
          return null;
        }
        return new java.lang.Integer(target.getTimeOut());
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Connection target = (Connection)object;
          // ignore null values for non optional primitives
          if (value == null) {
            return;
          }

          target.setTimeOut(((java.lang.Integer)value).intValue());
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return null;
      }
    };
    desc.setSchemaType("int");
    desc.setHandler(handler);
    desc.setRequired(true);
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _timeOut
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    fieldValidator.setMinOccurs(1);
    { //-- local scope
      org.exolab.castor.xml.validators.IntValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.IntValidator();
      fieldValidator.setValidator(typeValidator);
      typeValidator.setMinInclusive( -2147483648);
      typeValidator.setMaxInclusive(2147483647);
    }
    desc.setValidator(fieldValidator);
    //-- _username
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_username", "Username", org.exolab.castor.xml.NodeType.Attribute);
    desc.setImmutable(true);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Connection target = (Connection)object;
        return target.getUsername();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Connection target = (Connection)object;
          target.setUsername((java.lang.String)value);
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
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _username
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
      org.exolab.castor.xml.validators.StringValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.StringValidator();
      fieldValidator.setValidator(typeValidator);
      typeValidator.setWhiteSpace("preserve");
    }
    desc.setValidator(fieldValidator);
    //-- _password
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_password", "Password", org.exolab.castor.xml.NodeType.Attribute);
    desc.setImmutable(true);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Connection target = (Connection)object;
        return target.getPassword();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Connection target = (Connection)object;
          target.setPassword((java.lang.String)value);
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
    desc.setMultivalued(false);
    addFieldDescriptor(desc);

    //-- validation code for: _password
    fieldValidator = new org.exolab.castor.xml.FieldValidator();
    { //-- local scope
      org.exolab.castor.xml.validators.StringValidator typeValidator;
      typeValidator = new org.exolab.castor.xml.validators.StringValidator();
      fieldValidator.setValidator(typeValidator);
      typeValidator.setWhiteSpace("preserve");
    }
    desc.setValidator(fieldValidator);
    //-- initialize element descriptors

    //-- _cookieList
    desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(net.eiroca.portal.assembler.gen.Cookie.class, "_cookieList", "Cookie", org.exolab.castor.xml.NodeType.Element);
    handler = new org.exolab.castor.xml.XMLFieldHandler() {
      public java.lang.Object getValue(java.lang.Object object) throws IllegalStateException {
        Connection target = (Connection)object;
        return target.getCookie();
      }

      public void setValue(java.lang.Object object, java.lang.Object value) throws IllegalStateException, IllegalArgumentException {
        try {
          Connection target = (Connection)object;
          target.addCookie((net.eiroca.portal.assembler.gen.Cookie)value);
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
        try {
          Connection target = (Connection)object;
          target.removeAllCookie();
        }
        catch (java.lang.Exception ex) {
          throw new IllegalStateException(ex.toString());
        }
      }

      public java.lang.Object newInstance(java.lang.Object parent) {
        return new net.eiroca.portal.assembler.gen.Cookie();
      }
    };
    desc.setSchemaType("list");
    desc.setComponentType("net.eiroca.portal.assembler.gen.Cookie");
    desc.setHandler(handler);
    desc.setMultivalued(true);
    addFieldDescriptor(desc);
    addSequenceElement(desc);

    //-- validation code for: _cookieList
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
    return net.eiroca.portal.assembler.gen.Connection.class;
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
