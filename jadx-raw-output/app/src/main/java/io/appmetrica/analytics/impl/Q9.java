package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Q9 extends R9 {
    @Override // io.appmetrica.analytics.impl.R9
    public final S9 b(@NonNull FeatureInfo featureInfo) {
        return new S9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
