package androidx.webkit.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public interface ConditionallySupportedFeature {
    @NonNull
    String getPublicFeatureName();

    boolean isSupported();
}
