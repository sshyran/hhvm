/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStructField23Patch implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MyStructField23Patch");
  private static final TField ASSIGN_FIELD_DESC = new TField("assign", TType.MAP, (short)1);
  private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);
  private static final TField ADD_FIELD_DESC = new TField("add", TType.MAP, (short)5);
  private static final TField PUT_FIELD_DESC = new TField("put", TType.MAP, (short)9);

  /**
   * Assigns a value. If set, all other operations are ignored.
   */
  public final Map<String,String> assign;
  /**
   * Clears a value. Applies first.
   */
  public final Boolean clear;
  /**
   * Add the given values, if the keys are not already present. Applies forth.
   */
  public final Map<String,String> add;
  /**
   * Adds or replaces the given key/value pairs. Applies fifth.
   */
  public final Map<String,String> put;
  public static final int ASSIGN = 1;
  public static final int CLEAR = 2;
  public static final int ADD = 5;
  public static final int PUT = 9;

  public MyStructField23Patch(
      Map<String,String> assign,
      Boolean clear,
      Map<String,String> add,
      Map<String,String> put) {
    this.assign = assign;
    this.clear = clear;
    this.add = add;
    this.put = put;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStructField23Patch(MyStructField23Patch other) {
    if (other.isSetAssign()) {
      this.assign = TBaseHelper.deepCopy(other.assign);
    } else {
      this.assign = null;
    }
    if (other.isSetClear()) {
      this.clear = TBaseHelper.deepCopy(other.clear);
    } else {
      this.clear = null;
    }
    if (other.isSetAdd()) {
      this.add = TBaseHelper.deepCopy(other.add);
    } else {
      this.add = null;
    }
    if (other.isSetPut()) {
      this.put = TBaseHelper.deepCopy(other.put);
    } else {
      this.put = null;
    }
  }

  public MyStructField23Patch deepCopy() {
    return new MyStructField23Patch(this);
  }

  /**
   * Assigns a value. If set, all other operations are ignored.
   */
  public Map<String,String> getAssign() {
    return this.assign;
  }

  // Returns true if field assign is set (has been assigned a value) and false otherwise
  public boolean isSetAssign() {
    return this.assign != null;
  }

  /**
   * Clears a value. Applies first.
   */
  public Boolean isClear() {
    return this.clear;
  }

  // Returns true if field clear is set (has been assigned a value) and false otherwise
  public boolean isSetClear() {
    return this.clear != null;
  }

  /**
   * Add the given values, if the keys are not already present. Applies forth.
   */
  public Map<String,String> getAdd() {
    return this.add;
  }

  // Returns true if field add is set (has been assigned a value) and false otherwise
  public boolean isSetAdd() {
    return this.add != null;
  }

  /**
   * Adds or replaces the given key/value pairs. Applies fifth.
   */
  public Map<String,String> getPut() {
    return this.put;
  }

  // Returns true if field put is set (has been assigned a value) and false otherwise
  public boolean isSetPut() {
    return this.put != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStructField23Patch))
      return false;
    MyStructField23Patch that = (MyStructField23Patch)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetAssign(), that.isSetAssign(), this.assign, that.assign)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetClear(), that.isSetClear(), this.clear, that.clear)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetAdd(), that.isSetAdd(), this.add, that.add)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPut(), that.isSetPut(), this.put, that.put)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {assign, clear, add, put});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static MyStructField23Patch deserialize(TProtocol iprot) throws TException {
    Map<String,String> tmp_assign = null;
    Boolean tmp_clear = null;
    Map<String,String> tmp_add = null;
    Map<String,String> tmp_put = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case ASSIGN:
          if (__field.type == TType.MAP) {
            {
              TMap _map37 = iprot.readMapBegin();
              tmp_assign = new HashMap<String,String>(Math.max(0, 2*_map37.size));
              for (int _i38 = 0; 
                   (_map37.size < 0) ? iprot.peekMap() : (_i38 < _map37.size); 
                   ++_i38)
              {
                String _key39;
                String _val40;
                _key39 = iprot.readString();
                _val40 = iprot.readString();
                tmp_assign.put(_key39, _val40);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CLEAR:
          if (__field.type == TType.BOOL) {
            tmp_clear = iprot.readBool();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ADD:
          if (__field.type == TType.MAP) {
            {
              TMap _map41 = iprot.readMapBegin();
              tmp_add = new HashMap<String,String>(Math.max(0, 2*_map41.size));
              for (int _i42 = 0; 
                   (_map41.size < 0) ? iprot.peekMap() : (_i42 < _map41.size); 
                   ++_i42)
              {
                String _key43;
                String _val44;
                _key43 = iprot.readString();
                _val44 = iprot.readString();
                tmp_add.put(_key43, _val44);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PUT:
          if (__field.type == TType.MAP) {
            {
              TMap _map45 = iprot.readMapBegin();
              tmp_put = new HashMap<String,String>(Math.max(0, 2*_map45.size));
              for (int _i46 = 0; 
                   (_map45.size < 0) ? iprot.peekMap() : (_i46 < _map45.size); 
                   ++_i46)
              {
                String _key47;
                String _val48;
                _key47 = iprot.readString();
                _val48 = iprot.readString();
                tmp_put.put(_key47, _val48);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    MyStructField23Patch _that;
    _that = new MyStructField23Patch(
      tmp_assign
      ,tmp_clear
      ,tmp_add
      ,tmp_put
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.assign != null) {
      if (isSetAssign()) {
        oprot.writeFieldBegin(ASSIGN_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.assign.size()));
          for (Map.Entry<String, String> _iter49 : this.assign.entrySet())          {
            oprot.writeString(_iter49.getKey());
            oprot.writeString(_iter49.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.clear != null) {
      oprot.writeFieldBegin(CLEAR_FIELD_DESC);
      oprot.writeBool(this.clear);
      oprot.writeFieldEnd();
    }
    if (this.add != null) {
      oprot.writeFieldBegin(ADD_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.add.size()));
        for (Map.Entry<String, String> _iter50 : this.add.entrySet())        {
          oprot.writeString(_iter50.getKey());
          oprot.writeString(_iter50.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.put != null) {
      oprot.writeFieldBegin(PUT_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.put.size()));
        for (Map.Entry<String, String> _iter51 : this.put.entrySet())        {
          oprot.writeString(_iter51.getKey());
          oprot.writeString(_iter51.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

