package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class R9 {
    public abstract S9 b(FeatureInfo featureInfo);

    public final S9 a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i10 = featureInfo.reqGlEsVersion;
        if (i10 == 0) {
            return b(featureInfo);
        }
        return new S9("openGlFeature", i10, (featureInfo.flags & 1) != 0);
    }
}
