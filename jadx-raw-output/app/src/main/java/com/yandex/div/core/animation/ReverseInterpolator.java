package com.yandex.div.core.animation;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: ReverseInterpolator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ReverseInterpolator implements Interpolator {
    private final Interpolator base;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.base.getInterpolation(1.0f - f10);
    }

    public ReverseInterpolator(Interpolator interpolator) {
        this.base = interpolator;
    }
}
