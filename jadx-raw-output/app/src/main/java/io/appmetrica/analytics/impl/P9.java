package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class P9 extends R9 {
    @Override // io.appmetrica.analytics.impl.R9
    @TargetApi(24)
    public final S9 b(@NonNull FeatureInfo featureInfo) {
        return new S9(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
