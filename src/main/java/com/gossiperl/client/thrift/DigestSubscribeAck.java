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

public class DigestSubscribeAck implements org.apache.thrift.TBase<DigestSubscribeAck, DigestSubscribeAck._Fields>, java.io.Serializable, Cloneable, Comparable<DigestSubscribeAck> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DigestSubscribeAck");

  private static final org.apache.thrift.protocol.TField HEARTBEAT_FIELD_DESC = new org.apache.thrift.protocol.TField("heartbeat", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField REPLY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("reply_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EVENT_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("event_types", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DigestSubscribeAckStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DigestSubscribeAckTupleSchemeFactory());
  }

  public long heartbeat; // required
  public String reply_id; // required
  public List<String> event_types; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEARTBEAT((short)1, "heartbeat"),
    REPLY_ID((short)2, "reply_id"),
    EVENT_TYPES((short)3, "event_types");

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
        case 1: // HEARTBEAT
          return HEARTBEAT;
        case 2: // REPLY_ID
          return REPLY_ID;
        case 3: // EVENT_TYPES
          return EVENT_TYPES;
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
    tmpMap.put(_Fields.HEARTBEAT, new org.apache.thrift.meta_data.FieldMetaData("heartbeat", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REPLY_ID, new org.apache.thrift.meta_data.FieldMetaData("reply_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EVENT_TYPES, new org.apache.thrift.meta_data.FieldMetaData("event_types", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DigestSubscribeAck.class, metaDataMap);
  }

  public DigestSubscribeAck() {
  }

  public DigestSubscribeAck(
    long heartbeat,
    String reply_id,
    List<String> event_types)
  {
    this();
    this.heartbeat = heartbeat;
    setHeartbeatIsSet(true);
    this.reply_id = reply_id;
    this.event_types = event_types;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DigestSubscribeAck(DigestSubscribeAck other) {
    __isset_bitfield = other.__isset_bitfield;
    this.heartbeat = other.heartbeat;
    if (other.isSetReply_id()) {
      this.reply_id = other.reply_id;
    }
    if (other.isSetEvent_types()) {
      List<String> __this__event_types = new ArrayList<String>(other.event_types);
      this.event_types = __this__event_types;
    }
  }

  public DigestSubscribeAck deepCopy() {
    return new DigestSubscribeAck(this);
  }

  @Override
  public void clear() {
    setHeartbeatIsSet(false);
    this.heartbeat = 0;
    this.reply_id = null;
    this.event_types = null;
  }

  public long getHeartbeat() {
    return this.heartbeat;
  }

  public DigestSubscribeAck setHeartbeat(long heartbeat) {
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

  public String getReply_id() {
    return this.reply_id;
  }

  public DigestSubscribeAck setReply_id(String reply_id) {
    this.reply_id = reply_id;
    return this;
  }

  public void unsetReply_id() {
    this.reply_id = null;
  }

  /** Returns true if field reply_id is set (has been assigned a value) and false otherwise */
  public boolean isSetReply_id() {
    return this.reply_id != null;
  }

  public void setReply_idIsSet(boolean value) {
    if (!value) {
      this.reply_id = null;
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

  public DigestSubscribeAck setEvent_types(List<String> event_types) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEARTBEAT:
      if (value == null) {
        unsetHeartbeat();
      } else {
        setHeartbeat((Long)value);
      }
      break;

    case REPLY_ID:
      if (value == null) {
        unsetReply_id();
      } else {
        setReply_id((String)value);
      }
      break;

    case EVENT_TYPES:
      if (value == null) {
        unsetEvent_types();
      } else {
        setEvent_types((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEARTBEAT:
      return Long.valueOf(getHeartbeat());

    case REPLY_ID:
      return getReply_id();

    case EVENT_TYPES:
      return getEvent_types();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEARTBEAT:
      return isSetHeartbeat();
    case REPLY_ID:
      return isSetReply_id();
    case EVENT_TYPES:
      return isSetEvent_types();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DigestSubscribeAck)
      return this.equals((DigestSubscribeAck)that);
    return false;
  }

  public boolean equals(DigestSubscribeAck that) {
    if (that == null)
      return false;

    boolean this_present_heartbeat = true;
    boolean that_present_heartbeat = true;
    if (this_present_heartbeat || that_present_heartbeat) {
      if (!(this_present_heartbeat && that_present_heartbeat))
        return false;
      if (this.heartbeat != that.heartbeat)
        return false;
    }

    boolean this_present_reply_id = true && this.isSetReply_id();
    boolean that_present_reply_id = true && that.isSetReply_id();
    if (this_present_reply_id || that_present_reply_id) {
      if (!(this_present_reply_id && that_present_reply_id))
        return false;
      if (!this.reply_id.equals(that.reply_id))
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DigestSubscribeAck other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(isSetReply_id()).compareTo(other.isSetReply_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReply_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reply_id, other.reply_id);
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
    StringBuilder sb = new StringBuilder("DigestSubscribeAck(");
    boolean first = true;

    sb.append("heartbeat:");
    sb.append(this.heartbeat);
    first = false;
    if (!first) sb.append(", ");
    sb.append("reply_id:");
    if (this.reply_id == null) {
      sb.append("null");
    } else {
      sb.append(this.reply_id);
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'heartbeat' because it's a primitive and you chose the non-beans generator.
    if (reply_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'reply_id' was not present! Struct: " + toString());
    }
    if (event_types == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'event_types' was not present! Struct: " + toString());
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

  private static class DigestSubscribeAckStandardSchemeFactory implements SchemeFactory {
    public DigestSubscribeAckStandardScheme getScheme() {
      return new DigestSubscribeAckStandardScheme();
    }
  }

  private static class DigestSubscribeAckStandardScheme extends StandardScheme<DigestSubscribeAck> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DigestSubscribeAck struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEARTBEAT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.heartbeat = iprot.readI64();
              struct.setHeartbeatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REPLY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reply_id = iprot.readString();
              struct.setReply_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EVENT_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.event_types = new ArrayList<String>(_list32.size);
                for (int _i33 = 0; _i33 < _list32.size; ++_i33)
                {
                  String _elem34;
                  _elem34 = iprot.readString();
                  struct.event_types.add(_elem34);
                }
                iprot.readListEnd();
              }
              struct.setEvent_typesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DigestSubscribeAck struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HEARTBEAT_FIELD_DESC);
      oprot.writeI64(struct.heartbeat);
      oprot.writeFieldEnd();
      if (struct.reply_id != null) {
        oprot.writeFieldBegin(REPLY_ID_FIELD_DESC);
        oprot.writeString(struct.reply_id);
        oprot.writeFieldEnd();
      }
      if (struct.event_types != null) {
        oprot.writeFieldBegin(EVENT_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.event_types.size()));
          for (String _iter35 : struct.event_types)
          {
            oprot.writeString(_iter35);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DigestSubscribeAckTupleSchemeFactory implements SchemeFactory {
    public DigestSubscribeAckTupleScheme getScheme() {
      return new DigestSubscribeAckTupleScheme();
    }
  }

  private static class DigestSubscribeAckTupleScheme extends TupleScheme<DigestSubscribeAck> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DigestSubscribeAck struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.heartbeat);
      oprot.writeString(struct.reply_id);
      {
        oprot.writeI32(struct.event_types.size());
        for (String _iter36 : struct.event_types)
        {
          oprot.writeString(_iter36);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DigestSubscribeAck struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.heartbeat = iprot.readI64();
      struct.setHeartbeatIsSet(true);
      struct.reply_id = iprot.readString();
      struct.setReply_idIsSet(true);
      {
        org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.event_types = new ArrayList<String>(_list37.size);
        for (int _i38 = 0; _i38 < _list37.size; ++_i38)
        {
          String _elem39;
          _elem39 = iprot.readString();
          struct.event_types.add(_elem39);
        }
      }
      struct.setEvent_typesIsSet(true);
    }
  }

}

