package com.google.common.collect;

/* JADX INFO: loaded from: classes10.dex */
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    public final boolean inclusive;

    public static BoundType forBoolean(boolean z10) {
        return z10 ? CLOSED : OPEN;
    }

    BoundType(boolean z10) {
        this.inclusive = z10;
    }
}
