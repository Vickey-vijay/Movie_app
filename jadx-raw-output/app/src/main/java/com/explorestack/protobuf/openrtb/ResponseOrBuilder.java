package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.AnyOrBuilder;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ResponseOrBuilder extends MessageOrBuilder {
    String getBidid();

    ByteString getBididBytes();

    String getCdata();

    ByteString getCdataBytes();

    String getCur();

    ByteString getCurBytes();

    Struct getExt();

    StructOrBuilder getExtOrBuilder();

    Any getExtProto(int i10);

    int getExtProtoCount();

    List<Any> getExtProtoList();

    AnyOrBuilder getExtProtoOrBuilder(int i10);

    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

    String getId();

    ByteString getIdBytes();

    NoBidReason getNbr();

    int getNbrValue();

    Response.Seatbid getSeatbid(int i10);

    int getSeatbidCount();

    List<Response.Seatbid> getSeatbidList();

    Response.SeatbidOrBuilder getSeatbidOrBuilder(int i10);

    List<? extends Response.SeatbidOrBuilder> getSeatbidOrBuilderList();

    boolean hasExt();
}
