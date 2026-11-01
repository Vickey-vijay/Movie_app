package com.yandex.div.internal.drawable;

/* JADX INFO: compiled from: LinearGradientDrawable.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LinearGradientDrawableKt {
    private static final float snap(float f10, float f11, float f12) {
        return Math.abs(f11 - f10) <= f12 ? f11 : f10;
    }

    public static /* synthetic */ float snap$default(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f12 = 1.0E-4f;
        }
        return snap(f10, f11, f12);
    }
}
