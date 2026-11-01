package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum pno {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int yu;

    public static pno ouw(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    pno(int i10) {
        this.yu = i10;
    }
}
