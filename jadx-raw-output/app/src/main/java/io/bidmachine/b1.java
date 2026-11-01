package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.bidmachine.protobuf.sdk.App;

/* JADX INFO: compiled from: AppReleaseParams.java */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public void build(@NonNull Context context, @NonNull com.explorestack.protobuf.adcom.Context.App.Builder builder) {
        builder.setRelease(buildReleaseInfo(context));
    }

    public void build(@NonNull Context context, @NonNull App.Builder builder) {
        builder.setRelease(buildReleaseInfo(context));
    }

    @NonNull
    private com.explorestack.protobuf.adcom.Context.App.Release buildReleaseInfo(@NonNull Context context) {
        BuildInfo buildInfoObtain = BuildInfo.obtain(context);
        com.explorestack.protobuf.adcom.Context.App.Release.Builder builderNewBuilder = com.explorestack.protobuf.adcom.Context.App.Release.newBuilder();
        builderNewBuilder.setType(getBuildType(buildInfoObtain));
        String sha1Signature = buildInfoObtain.getSha1Signature(context);
        if (!TextUtils.isEmpty(sha1Signature)) {
            builderNewBuilder.setSignatureSHA1(sha1Signature);
        }
        String sha256Signature = buildInfoObtain.getSha256Signature(context);
        if (!TextUtils.isEmpty(sha256Signature)) {
            builderNewBuilder.setSignatureSHA256(sha256Signature);
        }
        return builderNewBuilder.build();
    }

    @NonNull
    private String getBuildType(@NonNull BuildInfo buildInfo) {
        if (buildInfo.isDebuggable()) {
            return "debug";
        }
        return "release";
    }
}
