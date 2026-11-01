package com.fyber.inneractive.sdk.measurement;

/* JADX INFO: loaded from: classes11.dex */
public enum i {
    VERIFICATION_RESOURCE_REJECTED(1),
    VERIFICATION_NOT_SUPPORTED(2),
    ERROR_DURING_RESOURCE_LOAD(3);

    public int mReason;

    i(int i10) {
        this.mReason = i10;
    }
}
