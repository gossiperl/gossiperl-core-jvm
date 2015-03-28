/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.gossiperl.client.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DigestSubscribe implements org.apache.thrift.TBase<DigestSubscribe, DigestSubscribe._Fields>, java.io.Serializable, Cloneable, Comparable<DigestSubscribe> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DigestSubscribe");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HEARTBEAT_FIELD_DESC = new org.apache.thrift.protocol.TField("heartbeat", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EVENT_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("event_types", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField SECRET_FIELD_DESC = new org.apache.thrift.protocol.TField("secret", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DigestSubscribeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DigestSubscribeTupleSchemeFactory());
  }

  public String name; // required
  public long heartbeat; // required
  public String id; // required
  public List<String> event_types; // required
  public String secret; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    HEARTBEAT((short)2, "heartbeat"),
    ID((short)3, "id"),
    EVENT_TYPES((short)4, "event_types"),
    SECRET((short)5, "secret");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // HEARTBEAT
          return HEARTBEAT;
        case 3: // ID
          return ID;
        case 4: // EVENT_TYPES
          return EVENT_TYPES;
        case 5: // SECRET
          return SECRET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HEARTBEAT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEARTBEAT, new org.apache.thrift.meta_data.FieldMetaData("heartbeat", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EVENT_TYPES, new org.apache.thrift.meta_data.FieldMetaData("event_types", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SECRET, new org.apache.thrift.meta_data.FieldMetaData("secret", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DigestSubscribe.class, metaDataMap);
  }

  public DigestSubscribe() {
  }

  public DigestSubscribe(
    String name,
    long heartbeat,
    String id,
    List<String> event_types,
    String secret)
  {
    this();
    this.name = name;
    this.heartbeat = heartbeat;
    setHeartbeatIsSet(true);
    this.id = id;
    this.event_types = event_types;
    this.secret = secret;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DigestSubscribe(DigestSubscribe other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.heartbeat = other.heartbeat;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetEvent_types()) {
      List<String> __this__event_types = new ArrayList<String>(other.event_types);
      this.event_types = __this__event_types;
    }
    if (other.isSetSecret()) {
      this.secret = other.secret;
    }
  }

  public DigestSubscribe deepCopy() {
    return new DigestSubscribe(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setHeartbeatIsSet(false);
    this.heartbeat = 0;
    this.id = null;
    this.event_types = null;
    this.secret = null;
  }

  public String getName() {
    return this.name;
  }

  public DigestSubscribe setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public long getHeartbeat() {
    return this.heartbeat;
  }

  public DigestSubscribe setHeartbeat(long heartbeat) {
    this.heartbeat = heartbeat;
    setHeartbeatIsSet(true);
    return this;
  }

  public void unsetHeartbeat() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HEARTBEAT_ISSET_ID);
  }

  /** Returns true if field heartbeat is set (has been assigned a value) and false otherwise */
  public boolean isSetHeartbeat() {
    return EncodingUtils.testBit(__isset_bitfield, __HEARTBEAT_ISSET_ID);
  }

  public void setHeartbeatIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HEARTBEAT_ISSET_ID, value);
  }

  public String getId() {
    return this.id;
  }

  public DigestSubscribe setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public int getEvent_typesSize() {
    return (this.event_types == null) ? 0 : this.event_types.size();
  }

  public java.util.Iterator<String> getEvent_typesIterator() {
    return (this.event_types == null) ? null : this.event_types.iterator();
  }

  public void addToEvent_types(String elem) {
    if (this.event_types == null) {
      this.event_types = new ArrayList<String>();
    }
    this.event_types.add(elem);
  }

  public List<String> getEvent_types() {
    return this.event_types;
  }

  public DigestSubscribe setEvent_types(List<String> event_types) {
    this.event_types = event_types;
    return this;
  }

  public void unsetEvent_types() {
    this.event_types = null;
  }

  /** Returns true if field event_types is set (has been assigned a value) and false otherwise */
  public boolean isSetEvent_types() {
    return this.event_types != null;
  }

  public void setEvent_typesIsSet(boolean value) {
    if (!value) {
      this.event_types = null;
    }
  }

  public String getSecret() {
    return this.secret;
  }

  public DigestSubscribe setSecret(String secret) {
    this.secret = secret;
    return this;
  }

  public void unsetSecret() {
    this.secret = null;
  }

  /** Returns true if field secret is set (has been assigned a value) and false otherwise */
  public boolean isSetSecret() {
    return this.secret != null;
  }

  public void setSecretIsSet(boolean value) {
    if (!value) {
      this.secret = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case HEARTBEAT:
      if (value == null) {
        unsetHeartbeat();
      } else {
        setHeartbeat((Long)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case EVENT_TYPES:
      if (value == null) {
        unsetEvent_types();
      } else {
        setEvent_types((List<String>)value);
      }
      break;

    case SECRET:
      if (value == null) {
        unsetSecret();
      } else {
        setSecret((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case HEARTBEAT:
      return Long.valueOf(getHeartbeat());

    case ID:
      return getId();

    case EVENT_TYPES:
      return getEvent_types();

    case SECRET:
      return getSecret();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case HEARTBEAT:
      return isSetHeartbeat();
    case ID:
      return isSetId();
    case EVENT_TYPES:
      return isSetEvent_types();
    case SECRET:
      return isSetSecret();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DigestSubscribe)
      return this.equals((DigestSubscribe)that);
    return false;
  }

  public boolean equals(DigestSubscribe that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_heartbeat = true;
    boolean that_present_heartbeat = true;
    if (this_present_heartbeat || that_present_heartbeat) {
      if (!(this_present_heartbeat && that_present_heartbeat))
        return false;
      if (this.heartbeat != that.heartbeat)
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_event_types = true && this.isSetEvent_types();
    boolean that_present_event_types = true && that.isSetEvent_types();
    if (this_present_event_types || that_present_event_types) {
      if (!(this_present_event_types && that_present_event_types))
        return false;
      if (!this.event_types.equals(that.event_types))
        return false;
    }

    boolean this_present_secret = true && this.isSetSecret();
    boolean that_present_secret = true && that.isSetSecret();
    if (this_present_secret || that_present_secret) {
      if (!(this_present_secret && that_present_secret))
        return false;
      if (!this.secret.equals(that.secret))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DigestSubscribe other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeartbeat()).compareTo(other.isSetHeartbeat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeartbeat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.heartbeat, other.heartbeat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEvent_types()).compareTo(other.isSetEvent_types());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEvent_types()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.event_types, other.event_types);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecret()).compareTo(other.isSetSecret());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecret()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secret, other.secret);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DigestSubscribe(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("heartbeat:");
    sb.append(this.heartbeat);
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("event_types:");
    if (this.event_types == null) {
      sb.append("null");
    } else {
      sb.append(this.event_types);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("secret:");
    if (this.secret == null) {
      sb.append("null");
    } else {
      sb.append(this.secret);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'heartbeat' because it's a primitive and you chose the non-beans generator.
    if (id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }
    if (event_types == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'event_types' was not present! Struct: " + toString());
    }
    if (secret == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'secret' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DigestSubscribeStandardSchemeFactory implements SchemeFactory {
    public DigestSubscribeStandardScheme getScheme() {
      return new DigestSubscribeStandardScheme();
    }
  }

  private static class DigestSubscribeStandardScheme extends StandardScheme<DigestSubscribe> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DigestSubscribe struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEARTBEAT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.heartbeat = iprot.readI64();
              struct.setHeartbeatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EVENT_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.event_types = new ArrayList<String>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  String _elem18;
                  _elem18 = iprot.readString();
                  struct.event_types.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setEvent_typesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SECRET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.secret = iprot.readString();
              struct.setSecretIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHeartbeat()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'heartbeat' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DigestSubscribe struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HEARTBEAT_FIELD_DESC);
      oprot.writeI64(struct.heartbeat);
      oprot.writeFieldEnd();
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.event_types != null) {
        oprot.writeFieldBegin(EVENT_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.event_types.size()));
          for (String _iter19 : struct.event_types)
          {
            oprot.writeString(_iter19);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.secret != null) {
        oprot.writeFieldBegin(SECRET_FIELD_DESC);
        oprot.writeString(struct.secret);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DigestSubscribeTupleSchemeFactory implements SchemeFactory {
    public DigestSubscribeTupleScheme getScheme() {
      return new DigestSubscribeTupleScheme();
    }
  }

  private static class DigestSubscribeTupleScheme extends TupleScheme<DigestSubscribe> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DigestSubscribe struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeI64(struct.heartbeat);
      oprot.writeString(struct.id);
      {
        oprot.writeI32(struct.event_types.size());
        for (String _iter20 : struct.event_types)
        {
          oprot.writeString(_iter20);
        }
      }
      oprot.writeString(struct.secret);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DigestSubscribe struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.heartbeat = iprot.readI64();
      struct.setHeartbeatIsSet(true);
      struct.id = iprot.readString();
      struct.setIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.event_types = new ArrayList<String>(_list21.size);
        for (int _i22 = 0; _i22 < _list21.size; ++_i22)
        {
          String _elem23;
          _elem23 = iprot.readString();
          struct.event_types.add(_elem23);
        }
      }
      struct.setEvent_typesIsSet(true);
      struct.secret = iprot.readString();
      struct.setSecretIsSet(true);
    }
  }

}

