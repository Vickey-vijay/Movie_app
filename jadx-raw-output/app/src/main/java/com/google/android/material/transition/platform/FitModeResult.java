package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
class FitModeResult {
    public final float currentEndHeight;
    public final float currentEndWidth;
    public final float currentStartHeight;
    public final float currentStartWidth;
    public final float endScale;
    public final float startScale;

    public FitModeResult(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.startScale = f10;
        this.endScale = f11;
        this.currentStartWidth = f12;
        this.currentStartHeight = f13;
        this.currentEndWidth = f14;
        this.currentEndHeight = f15;
    }
}
