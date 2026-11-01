package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jg {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11204lh;
    public final List<com.bytedance.adsdk.vt.lh.ouw> ouw;
    public PointF vt;

    public jg(PointF pointF, boolean z10, List<com.bytedance.adsdk.vt.lh.ouw> list) {
        this.vt = pointF;
        this.f11204lh = z10;
        this.ouw = new ArrayList(list);
    }

    public final void ouw(float f10, float f11) {
        if (this.vt == null) {
            this.vt = new PointF();
        }
        this.vt.set(f10, f11);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.ouw.size() + "closed=" + this.f11204lh + '}';
    }

    public jg() {
        this.ouw = new ArrayList();
    }
}
