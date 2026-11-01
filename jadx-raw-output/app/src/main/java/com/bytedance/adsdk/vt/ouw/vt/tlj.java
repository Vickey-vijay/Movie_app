package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj extends ra<PointF> {
    private final PointF fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final float[] f11309le;
    private bly pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final PathMeasure f11310ra;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        bly blyVar = (bly) ouwVar;
        Path path = blyVar.ouw;
        if (path == null) {
            return (PointF) ouwVar.vt;
        }
        if (this.yu != null) {
            blyVar.pno.floatValue();
            lh();
            ra();
            throw null;
        }
        if (this.pno != blyVar) {
            this.f11310ra.setPath(path, false);
            this.pno = blyVar;
        }
        PathMeasure pathMeasure = this.f11310ra;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f11309le, null);
        PointF pointF = this.fkw;
        float[] fArr = this.f11309le;
        pointF.set(fArr[0], fArr[1]);
        return this.fkw;
    }

    public tlj(List<? extends com.bytedance.adsdk.vt.ra.ouw<PointF>> list) {
        super(list);
        this.fkw = new PointF();
        this.f11309le = new float[2];
        this.f11310ra = new PathMeasure();
    }
}
