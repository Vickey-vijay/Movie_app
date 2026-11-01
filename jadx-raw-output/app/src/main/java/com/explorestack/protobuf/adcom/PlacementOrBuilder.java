package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.AnyOrBuilder;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface PlacementOrBuilder extends MessageOrBuilder {
    boolean getAdmx();

    String getBadv(int i10);

    ByteString getBadvBytes(int i10);

    int getBadvCount();

    List<String> getBadvList();

    String getBapp(int i10);

    ByteString getBappBytes(int i10);

    int getBappCount();

    List<String> getBappList();

    CreativeAttribute getBattr(int i10);

    int getBattrCount();

    List<CreativeAttribute> getBattrList();

    int getBattrValue(int i10);

    List<Integer> getBattrValueList();

    String getBcat(int i10);

    ByteString getBcatBytes(int i10);

    int getBcatCount();

    List<String> getBcatList();

    CategoryTaxonomy getCattax();

    int getCattaxValue();

    boolean getCurlx();

    Placement.DisplayPlacement getDisplay();

    Placement.DisplayPlacementOrBuilder getDisplayOrBuilder();

    Struct getExt();

    StructOrBuilder getExtOrBuilder();

    Any getExtProto(int i10);

    int getExtProtoCount();

    List<Any> getExtProtoList();

    AnyOrBuilder getExtProtoOrBuilder(int i10);

    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

    boolean getReward();

    String getSdk();

    ByteString getSdkBytes();

    String getSdkver();

    ByteString getSdkverBytes();

    boolean getSecure();

    int getSsai();

    String getTagid();

    ByteString getTagidBytes();

    Placement.VideoPlacement getVideo();

    Placement.VideoPlacementOrBuilder getVideoOrBuilder();

    String getWlang(int i10);

    ByteString getWlangBytes(int i10);

    int getWlangCount();

    List<String> getWlangList();

    boolean hasDisplay();

    boolean hasExt();

    boolean hasVideo();
}
