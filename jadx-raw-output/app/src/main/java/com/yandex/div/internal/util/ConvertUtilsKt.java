package com.yandex.div.internal.util;

/* JADX INFO: compiled from: ConvertUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ConvertUtilsKt {
    public static final Boolean toBoolean(Number number) {
        return number instanceof Double ? toBoolean(number.doubleValue()) : toBoolean(number.intValue());
    }

    public static final Boolean toBoolean(int i10) {
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        if (i10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final Boolean toBoolean(double d10) {
        if (d10 == 0.0d) {
            return Boolean.FALSE;
        }
        if (d10 == 1.0d) {
            return Boolean.TRUE;
        }
        return null;
    }
}
