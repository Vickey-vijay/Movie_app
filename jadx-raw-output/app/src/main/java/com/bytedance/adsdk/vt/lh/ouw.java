package com.bytedance.adsdk.vt.lh;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final PointF f11187lh;
    public final PointF ouw;
    public final PointF vt;

    public ouw() {
        this.ouw = new PointF();
        this.vt = new PointF();
        this.f11187lh = new PointF();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f11187lh.x), Float.valueOf(this.f11187lh.y), Float.valueOf(this.ouw.x), Float.valueOf(this.ouw.y), Float.valueOf(this.vt.x), Float.valueOf(this.vt.y));
    }

    public final void lh(float f10, float f11) {
        this.f11187lh.set(f10, f11);
    }

    public final void ouw(float f10, float f11) {
        this.ouw.set(f10, f11);
    }

    public final void vt(float f10, float f11) {
        this.vt.set(f10, f11);
    }

    public ouw(PointF pointF, PointF pointF2, PointF pointF3) {
        this.ouw = pointF;
        this.vt = pointF2;
        this.f11187lh = pointF3;
    }
}
