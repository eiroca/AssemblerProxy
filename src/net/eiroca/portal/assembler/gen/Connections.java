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
 * Class Connections.
 *
 * @version $Revision$ $Date$
 */
public class Connections implements java.io.Serializable {

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  /**
   * Field _connectionList.
   */
  private final java.util.Vector _connectionList;

  //----------------/
  //- Constructors -/
  //----------------/

  public Connections() {
    super();
    _connectionList = new java.util.Vector();
  }

  //-----------/
  //- Methods -/
  //-----------/

  /**
   *
   *
   * @param vConnection
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addConnection(
      final net.eiroca.portal.assembler.gen.Connection vConnection) throws java.lang.IndexOutOfBoundsException {
    _connectionList.addElement(vConnection);
  }

  /**
   *
   *
   * @param index
   * @param vConnection
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addConnection(
      final int index,
      final net.eiroca.portal.assembler.gen.Connection vConnection) throws java.lang.IndexOutOfBoundsException {
    _connectionList.add(index, vConnection);
  }

  /**
   * Method enumerateConnection.
   *
   * @return an Enumeration over all
   * net.eiroca.portal.assembler.gen.Connection elements
   */
  public java.util.Enumeration enumerateConnection(
      ) {
    return _connectionList.elements();
  }

  /**
   * Method getConnection.
   *
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the
   * net.eiroca.portal.assembler.gen.Connection at the given index
   */
  public net.eiroca.portal.assembler.gen.Connection getConnection(
      final int index) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _connectionList.size())) {
      throw new IndexOutOfBoundsException("getConnection: Index value '" + index + "' not in range [0.." + (_connectionList.size() - 1) + "]");
    }

    return (net.eiroca.portal.assembler.gen.Connection)_connectionList.get(index);
  }

  /**
   * Method getConnection.Returns the contents of the collection
   * in an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   *
   * @return this collection as an Array
   */
  public net.eiroca.portal.assembler.gen.Connection[] getConnection(
      ) {
    final net.eiroca.portal.assembler.gen.Connection[] array = new net.eiroca.portal.assembler.gen.Connection[0];
    return (net.eiroca.portal.assembler.gen.Connection[])_connectionList.toArray(array);
  }

  /**
   * Method getConnectionCount.
   *
   * @return the size of this collection
   */
  public int getConnectionCount(
      ) {
    return _connectionList.size();
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
  public void removeAllConnection(
      ) {
    _connectionList.clear();
  }

  /**
   * Method removeConnection.
   *
   * @param vConnection
   * @return true if the object was removed from the collection.
   */
  public boolean removeConnection(
      final net.eiroca.portal.assembler.gen.Connection vConnection) {
    final boolean removed = _connectionList.remove(vConnection);
    return removed;
  }

  /**
   * Method removeConnectionAt.
   *
   * @param index
   * @return the element removed from the collection
   */
  public net.eiroca.portal.assembler.gen.Connection removeConnectionAt(
      final int index) {
    final java.lang.Object obj = _connectionList.remove(index);
    return (net.eiroca.portal.assembler.gen.Connection)obj;
  }

  /**
   *
   *
   * @param index
   * @param vConnection
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void setConnection(
      final int index,
      final net.eiroca.portal.assembler.gen.Connection vConnection) throws java.lang.IndexOutOfBoundsException {
    // check bounds for index
    if ((index < 0) || (index >= _connectionList.size())) {
      throw new IndexOutOfBoundsException("setConnection: Index value '" + index + "' not in range [0.." + (_connectionList.size() - 1) + "]");
    }

    _connectionList.set(index, vConnection);
  }

  /**
   *
   *
   * @param vConnectionArray
   */
  public void setConnection(
      final net.eiroca.portal.assembler.gen.Connection[] vConnectionArray) {
    //-- copy array
    _connectionList.clear();

    for (final Connection element : vConnectionArray) {
      _connectionList.add(element);
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
   * net.eiroca.portal.assembler.gen.Connections
   */
  public static net.eiroca.portal.assembler.gen.Connections unmarshal(
      final java.io.Reader reader) throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
    return (net.eiroca.portal.assembler.gen.Connections)Unmarshaller.unmarshal(net.eiroca.portal.assembler.gen.Connections.class, reader);
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
