package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes10.dex */
public enum ryl {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    public final int yu;

    public static ryl ouw(int i10) {
        if (i10 == 0) {
            return STATIC;
        }
        if (i10 == 1) {
            return RELATIVE;
        }
        if (i10 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    ryl(int i10) {
        this.yu = i10;
    }

    public static ryl ouw(String str) {
        str.hashCode();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
