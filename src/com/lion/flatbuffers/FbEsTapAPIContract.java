// automatically generated by the FlatBuffers compiler, do not modify

package com.lion.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FbEsTapAPIContract extends Table {
  public static FbEsTapAPIContract getRootAsFbEsTapAPIContract(ByteBuffer _bb) { return getRootAsFbEsTapAPIContract(_bb, new FbEsTapAPIContract()); }
  public static FbEsTapAPIContract getRootAsFbEsTapAPIContract(ByteBuffer _bb, FbEsTapAPIContract obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FbEsTapAPIContract __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public FbEsTapAPICommodity Commodity() { return Commodity(new FbEsTapAPICommodity()); }
  public FbEsTapAPICommodity Commodity(FbEsTapAPICommodity obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String ContractNo1() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ContractNo1AsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String StrikePrice1() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer StrikePrice1AsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public byte CallOrPutFlag1() { int o = __offset(10); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public String ContractNo2() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ContractNo2AsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public String StrikePrice2() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer StrikePrice2AsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public byte CallOrPutFlag2() { int o = __offset(16); return o != 0 ? bb.get(o + bb_pos) : 0; }

  public static int createFbEsTapAPIContract(FlatBufferBuilder builder,
      int CommodityOffset,
      int ContractNo1Offset,
      int StrikePrice1Offset,
      byte CallOrPutFlag1,
      int ContractNo2Offset,
      int StrikePrice2Offset,
      byte CallOrPutFlag2) {
    builder.startObject(7);
    FbEsTapAPIContract.addStrikePrice2(builder, StrikePrice2Offset);
    FbEsTapAPIContract.addContractNo2(builder, ContractNo2Offset);
    FbEsTapAPIContract.addStrikePrice1(builder, StrikePrice1Offset);
    FbEsTapAPIContract.addContractNo1(builder, ContractNo1Offset);
    FbEsTapAPIContract.addCommodity(builder, CommodityOffset);
    FbEsTapAPIContract.addCallOrPutFlag2(builder, CallOrPutFlag2);
    FbEsTapAPIContract.addCallOrPutFlag1(builder, CallOrPutFlag1);
    return FbEsTapAPIContract.endFbEsTapAPIContract(builder);
  }

  public static void startFbEsTapAPIContract(FlatBufferBuilder builder) { builder.startObject(7); }
  public static void addCommodity(FlatBufferBuilder builder, int CommodityOffset) { builder.addOffset(0, CommodityOffset, 0); }
  public static void addContractNo1(FlatBufferBuilder builder, int ContractNo1Offset) { builder.addOffset(1, ContractNo1Offset, 0); }
  public static void addStrikePrice1(FlatBufferBuilder builder, int StrikePrice1Offset) { builder.addOffset(2, StrikePrice1Offset, 0); }
  public static void addCallOrPutFlag1(FlatBufferBuilder builder, byte CallOrPutFlag1) { builder.addByte(3, CallOrPutFlag1, 0); }
  public static void addContractNo2(FlatBufferBuilder builder, int ContractNo2Offset) { builder.addOffset(4, ContractNo2Offset, 0); }
  public static void addStrikePrice2(FlatBufferBuilder builder, int StrikePrice2Offset) { builder.addOffset(5, StrikePrice2Offset, 0); }
  public static void addCallOrPutFlag2(FlatBufferBuilder builder, byte CallOrPutFlag2) { builder.addByte(6, CallOrPutFlag2, 0); }
  public static int endFbEsTapAPIContract(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

