package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes9.dex */
public enum mwh {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    public final int yu;

    public static mwh ouw(int i10) {
        if (i10 == 0) {
            return NO_WRAP;
        }
        if (i10 == 1) {
            return WRAP;
        }
        if (i10 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    mwh(int i10) {
        this.yu = i10;
    }

    public static mwh ouw(String str) {
        str.hashCode();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
