package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import ik.k;
import nj.n;

/* JADX INFO: compiled from: LookupTableInterpolator.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    private final float stepSize;
    private final float[] values;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int iG = k.g((int) (n.N(this.values) * f10), this.values.length - 2);
        float f11 = this.stepSize;
        float f12 = (f10 - (iG * f11)) / f11;
        float[] fArr = this.values;
        float f13 = fArr[iG];
        return f13 + (f12 * (fArr[iG + 1] - f13));
    }

    public LookupTableInterpolator(float[] fArr) {
        this.values = fArr;
        this.stepSize = 1.0f / n.N(fArr);
    }
}
