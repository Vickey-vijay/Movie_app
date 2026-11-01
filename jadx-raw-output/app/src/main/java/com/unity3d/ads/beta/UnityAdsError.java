package com.unity3d.ads.beta;

import ck.p;

/* JADX INFO: compiled from: UnityAdsError.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class UnityAdsError {
    private final int code;
    private final String message;

    public UnityAdsError(int i10, String str) {
        p.j(str, "message");
        this.code = i10;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
