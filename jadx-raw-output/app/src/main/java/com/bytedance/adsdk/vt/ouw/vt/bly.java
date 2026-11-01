package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public final class bly extends com.bytedance.adsdk.vt.ra.ouw<PointF> {

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ra.ouw<PointF> f11291ko;
    public Path ouw;

    public bly(com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar) {
        super(raVar, ouwVar.vt, ouwVar.f11336lh, ouwVar.yu, ouwVar.fkw, ouwVar.f11335le, ouwVar.f11337ra, ouwVar.pno);
        this.f11291ko = ouwVar;
        ouw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ouw() {
        T t10;
        T t11;
        T t12 = this.f11336lh;
        boolean z10 = (t12 == 0 || (t11 = this.vt) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.vt;
        if (t13 == 0 || (t10 = this.f11336lh) == 0 || z10) {
            return;
        }
        com.bytedance.adsdk.vt.ra.ouw<PointF> ouwVar = this.f11291ko;
        this.ouw = com.bytedance.adsdk.vt.le.pno.ouw((PointF) t13, (PointF) t10, ouwVar.mwh, ouwVar.f11333jg);
    }
}
