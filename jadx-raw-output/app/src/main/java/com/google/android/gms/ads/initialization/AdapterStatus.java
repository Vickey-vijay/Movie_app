package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public interface AdapterStatus {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
    public enum State {
        NOT_READY,
        READY
    }

    @NonNull
    String getDescription();

    @NonNull
    State getInitializationState();

    int getLatency();
}
