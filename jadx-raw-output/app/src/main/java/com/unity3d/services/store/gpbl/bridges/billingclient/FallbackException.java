package com.unity3d.services.store.gpbl.bridges.billingclient;

/* JADX INFO: compiled from: FallbackException.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FallbackException extends Exception {
    private final int detectedVersion;

    public final int getDetectedVersion() {
        return this.detectedVersion;
    }

    public FallbackException(int i10) {
        this.detectedVersion = i10;
    }
}
