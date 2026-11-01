package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface AppOrBuilder extends MessageOrBuilder {
    String getAppName();

    ByteString getAppNameBytes();

    String getAppVer();

    ByteString getAppVerBytes();

    Timestamp getFirstLaunchTime();

    TimestampOrBuilder getFirstLaunchTimeOrBuilder();

    String getFmwname();

    ByteString getFmwnameBytes();

    Timestamp getInstallTime();

    TimestampOrBuilder getInstallTimeOrBuilder();

    com.explorestack.protobuf.adcom.Context.App.Release getRelease();

    com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder getReleaseOrBuilder();

    String getStorecat();

    ByteString getStorecatBytes();

    String getStoresubcat(int i10);

    ByteString getStoresubcatBytes(int i10);

    int getStoresubcatCount();

    List<String> getStoresubcatList();

    boolean hasFirstLaunchTime();

    boolean hasInstallTime();

    boolean hasRelease();
}
