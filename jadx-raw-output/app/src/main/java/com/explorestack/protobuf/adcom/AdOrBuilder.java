package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.AnyOrBuilder;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface AdOrBuilder extends MessageOrBuilder {
    String getAdomain(int i10);

    ByteString getAdomainBytes(int i10);

    int getAdomainCount();

    List<String> getAdomainList();

    Ad.Audit getAudit();

    Ad.AuditOrBuilder getAuditOrBuilder();

    String getBundle(int i10);

    ByteString getBundleBytes(int i10);

    int getBundleCount();

    List<String> getBundleList();

    String getCat(int i10);

    ByteString getCatBytes(int i10);

    int getCatCount();

    List<String> getCatList();

    CategoryTaxonomy getCattax();

    int getCattaxValue();

    Ad.Display getDisplay();

    Ad.DisplayOrBuilder getDisplayOrBuilder();

    Struct getExt();

    StructOrBuilder getExtOrBuilder();

    Any getExtProto(int i10);

    int getExtProtoCount();

    List<Any> getExtProtoList();

    AnyOrBuilder getExtProtoOrBuilder(int i10);

    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

    String getId();

    ByteString getIdBytes();

    String getInit();

    ByteString getInitBytes();

    String getIurl();

    ByteString getIurlBytes();

    String getLang();

    ByteString getLangBytes();

    String getLastmod();

    ByteString getLastmodBytes();

    MediaRating getMrating();

    int getMratingValue();

    boolean getSecure();

    Ad.Video getVideo();

    Ad.VideoOrBuilder getVideoOrBuilder();

    boolean hasAudit();

    boolean hasDisplay();

    boolean hasExt();

    boolean hasVideo();
}
