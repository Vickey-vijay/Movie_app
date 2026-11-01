package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes5.dex */
public enum InneractiveMediationName {
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER("other");

    public final String key;

    public String getKey() {
        return this.key;
    }

    InneractiveMediationName(String str) {
        this.key = str;
    }
}
