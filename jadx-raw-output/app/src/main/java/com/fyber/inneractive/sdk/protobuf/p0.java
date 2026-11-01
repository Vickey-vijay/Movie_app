package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes10.dex */
public enum p0 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    public final boolean a() {
        return this.isList;
    }

    p0(boolean z10) {
        this.isList = z10;
    }
}
