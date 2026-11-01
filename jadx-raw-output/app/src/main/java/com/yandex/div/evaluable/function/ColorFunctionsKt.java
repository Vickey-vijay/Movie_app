package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ColorFunctionsKt {
    public static final double toColorFloatComponentValue(int i10) throws IllegalArgumentException {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 256) {
            z10 = true;
        }
        if (z10) {
            return ((double) i10) / ((double) 255.0f);
        }
        throw new IllegalArgumentException("Value out of channel range 0..255");
    }

    public static final int toColorIntComponentValue(double d10) throws IllegalArgumentException {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d10 * ((double) 255.0f)) + ((double) 0.5f));
    }
}
