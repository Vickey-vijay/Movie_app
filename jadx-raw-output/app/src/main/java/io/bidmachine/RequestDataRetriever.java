package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.utils.ProtoUtils;

/* JADX INFO: loaded from: classes9.dex */
public class RequestDataRetriever {
    @NonNull
    public static Context collectContext(@NonNull android.content.Context context, @NonNull j2 j2Var, @NonNull w5 w5Var, @NonNull TargetingParams targetingParams, @Nullable SessionAdParams sessionAdParams, @Nullable ConnectionType connectionType, @Nullable AdsType adsType) {
        Context.Builder builderNewBuilder = Context.newBuilder();
        Context.App.Builder builderNewBuilder2 = Context.App.newBuilder();
        Publisher publisher = j2Var.getPublisher();
        if (publisher != null) {
            publisher.build(builderNewBuilder2);
        }
        j2Var.getAppParams().build(context, builderNewBuilder2);
        targetingParams.build(builderNewBuilder2);
        App.Builder builderNewBuilder3 = App.newBuilder();
        targetingParams.fillAppExtension(builderNewBuilder3);
        builderNewBuilder3.setInstallTime(ProtoUtils.msToProtobufTimestamp(k4.getInstallTimeMs()));
        builderNewBuilder3.setFirstLaunchTime(ProtoUtils.msToProtobufTimestamp(j2Var.obtainFirstLaunchTimeMs(context)));
        builderNewBuilder2.addExtProto(Any.pack(builderNewBuilder3.build()));
        builderNewBuilder.setApp(builderNewBuilder2);
        BlockedParams blockedParams = targetingParams.getBlockedParams();
        if (blockedParams != null) {
            Context.Restrictions.Builder builderNewBuilder4 = Context.Restrictions.newBuilder();
            blockedParams.build(builderNewBuilder4);
            builderNewBuilder.setRestrictions(builderNewBuilder4);
        }
        Context.User.Builder builderNewBuilder5 = Context.User.newBuilder();
        w5Var.build(builderNewBuilder5);
        if (w5Var.canSendUserInfo()) {
            targetingParams.build(builderNewBuilder5);
        }
        Struct.Builder builderNewBuilder6 = Struct.newBuilder();
        if (sessionAdParams != null) {
            sessionAdParams.fillUserExtension(builderNewBuilder6);
        }
        j2Var.getSessionParams().build(context, builderNewBuilder5, adsType);
        if (builderNewBuilder6.getFieldsCount() > 0) {
            builderNewBuilder5.setExt(builderNewBuilder6.build());
        }
        builderNewBuilder.setUser(builderNewBuilder5);
        Context.Regs.Builder builderNewBuilder7 = Context.Regs.newBuilder();
        w5Var.build(builderNewBuilder7);
        builderNewBuilder.setRegs(builderNewBuilder7);
        j2Var.getDeviceParams().build(context, builderNewBuilder, targetingParams, j2Var.getTargetingParams(), w5Var, connectionType);
        return builderNewBuilder.build();
    }
}
