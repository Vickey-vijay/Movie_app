package com.yandex.div.core.animation;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: ReverseInterpolator.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ReverseInterpolatorKt {
    public static final Interpolator reversed(Interpolator interpolator) {
        return new ReverseInterpolator(interpolator);
    }
}
