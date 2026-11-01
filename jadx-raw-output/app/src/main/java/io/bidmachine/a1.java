package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.utils.ProtoUtils;

/* JADX INFO: compiled from: AppParams.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    @NonNull
    private final b1 appReleaseParams;

    public void build(@NonNull Context context, @NonNull com.explorestack.protobuf.adcom.Context.App.Builder builder) {
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            builder.setBundle(packageName);
        }
        String appVersion = Utils.getAppVersion(context);
        if (!TextUtils.isEmpty(appVersion)) {
            builder.setVer(appVersion);
        }
        String appName = Utils.getAppName(context);
        if (!TextUtils.isEmpty(appName)) {
            builder.setName(appName);
        }
        this.appReleaseParams.build(context, builder);
    }

    public a1(@NonNull b1 b1Var) {
        this.appReleaseParams = b1Var;
    }

    public void build(@NonNull Context context, @NonNull App.Builder builder) {
        String appVersion = Utils.getAppVersion(context);
        if (!TextUtils.isEmpty(appVersion)) {
            builder.setAppVer(appVersion);
        }
        String appName = Utils.getAppName(context);
        if (!TextUtils.isEmpty(appName)) {
            builder.setAppName(appName);
        }
        builder.setInstallTime(ProtoUtils.msToProtobufTimestamp(k4.getInstallTimeMs()));
        builder.setFirstLaunchTime(ProtoUtils.msToProtobufTimestamp(j2.get().obtainFirstLaunchTimeMs(context)));
        this.appReleaseParams.build(context, builder);
    }
}
