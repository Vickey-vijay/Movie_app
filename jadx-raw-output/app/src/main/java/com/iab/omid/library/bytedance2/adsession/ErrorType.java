package com.iab.omid.library.bytedance2.adsession;

/* JADX INFO: loaded from: classes2.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO("video");

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.errorType;
    }
}
