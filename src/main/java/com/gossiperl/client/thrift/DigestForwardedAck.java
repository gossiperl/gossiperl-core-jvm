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

public class DigestForwardedAck implements org.apache.thrift.TBase<DigestForwardedAck, DigestForwardedAck._Fields>, java.io.Serializable, Cloneable, Comparable<DigestForwardedAck> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DigestForwardedAck");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REPLY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("reply_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SECRET_FIELD_DESC = new org.apache.thrift.protocol.TField("secret", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DigestForwardedAckStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DigestForwardedAckTupleSchemeFactory());
  }

  public String name; // required
  public String reply_id; // required
  public String secret; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    REPLY_ID((short)2, "reply_id"),
    SECRET((short)3, "secret");

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
        case 2: // REPLY_ID
          return REPLY_ID;
        case 3: // SECRET
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPLY_ID, new org.apache.thrift.meta_data.FieldMetaData("reply_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECRET, new org.apache.thrift.meta_data.FieldMetaData("secret", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DigestForwardedAck.class, metaDataMap);
  }

  public DigestForwardedAck() {
  }

  public DigestForwardedAck(
    String name,
    String reply_id,
    String secret)
  {
    this();
    this.name = name;
    this.reply_id = reply_id;
    this.secret = secret;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DigestForwardedAck(DigestForwardedAck other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetReply_id()) {
      this.reply_id = other.reply_id;
    }
    if (other.isSetSecret()) {
      this.secret = other.secret;
    }
  }

  public DigestForwardedAck deepCopy() {
    return new DigestForwardedAck(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.reply_id = null;
    this.secret = null;
  }

  public String getName() {
    return this.name;
  }

  public DigestForwardedAck setName(String name) {
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

  public String getReply_id() {
    return this.reply_id;
  }

  public DigestForwardedAck setReply_id(String reply_id) {
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

  public String getSecret() {
    return this.secret;
  }

  public DigestForwardedAck setSecret(String secret) {
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

    case REPLY_ID:
      if (value == null) {
        unsetReply_id();
      } else {
        setReply_id((String)value);
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

    case REPLY_ID:
      return getReply_id();

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
    case REPLY_ID:
      return isSetReply_id();
    case SECRET:
      return isSetSecret();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DigestForwardedAck)
      return this.equals((DigestForwardedAck)that);
    return false;
  }

  public boolean equals(DigestForwardedAck that) {
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

    boolean this_present_reply_id = true && this.isSetReply_id();
    boolean that_present_reply_id = true && that.isSetReply_id();
    if (this_present_reply_id || that_present_reply_id) {
      if (!(this_present_reply_id && that_present_reply_id))
        return false;
      if (!this.reply_id.equals(that.reply_id))
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
  public int compareTo(DigestForwardedAck other) {
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
    StringBuilder sb = new StringBuilder("DigestForwardedAck(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
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
    if (reply_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'reply_id' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DigestForwardedAckStandardSchemeFactory implements SchemeFactory {
    public DigestForwardedAckStandardScheme getScheme() {
      return new DigestForwardedAckStandardScheme();
    }
  }

  private static class DigestForwardedAckStandardScheme extends StandardScheme<DigestForwardedAck> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DigestForwardedAck struct) throws org.apache.thrift.TException {
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
          case 2: // REPLY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reply_id = iprot.readString();
              struct.setReply_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SECRET
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DigestForwardedAck struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.reply_id != null) {
        oprot.writeFieldBegin(REPLY_ID_FIELD_DESC);
        oprot.writeString(struct.reply_id);
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

  private static class DigestForwardedAckTupleSchemeFactory implements SchemeFactory {
    public DigestForwardedAckTupleScheme getScheme() {
      return new DigestForwardedAckTupleScheme();
    }
  }

  private static class DigestForwardedAckTupleScheme extends TupleScheme<DigestForwardedAck> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DigestForwardedAck struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeString(struct.reply_id);
      oprot.writeString(struct.secret);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DigestForwardedAck struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.reply_id = iprot.readString();
      struct.setReply_idIsSet(true);
      struct.secret = iprot.readString();
      struct.setSecretIsSet(true);
    }
  }

}

