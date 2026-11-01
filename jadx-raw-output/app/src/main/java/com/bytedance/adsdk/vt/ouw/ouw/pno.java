package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class pno implements cf, fkw, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    private final RectF bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.lh.vt.ra f11260cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> f11261jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> f11262ko;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final boolean f11264lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> mwh;
    public float ouw;
    private final Paint pno;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final Path f11265ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> f11266rn;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final int f11267th;
    private final List<mwh> tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f11268vm;
    private final String vt;
    private final com.bytedance.adsdk.vt.lh.lh.ouw yu;
    private com.bytedance.adsdk.vt.ouw.vt.zih zih;
    private com.bytedance.adsdk.vt.ouw.vt.lh zin;
    private final LongSparseArray<LinearGradient> fkw = new LongSparseArray<>();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f11263le = new LongSparseArray<>();

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.f11268vm.invalidateSelf();
    }

    private int vt() {
        int iRound = Math.round(this.f11261jg.ra() * this.f11267th);
        int iRound2 = Math.round(this.f11262ko.ra() * this.f11267th);
        int iRound3 = Math.round(this.ryl.ra() * this.f11267th);
        int i10 = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            lh lhVar = list2.get(i10);
            if (lhVar instanceof mwh) {
                this.tlj.add((mwh) lhVar);
            }
        }
    }

    public pno(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.fkw fkwVar) {
        Path path = new Path();
        this.f11265ra = path;
        this.pno = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.bly = new RectF();
        this.tlj = new ArrayList();
        this.ouw = 0.0f;
        this.yu = ouwVar;
        this.vt = fkwVar.f11203ra;
        this.f11264lh = fkwVar.pno;
        this.f11268vm = blyVar;
        this.f11260cf = fkwVar.ouw;
        path.setFillType(fkwVar.vt);
        this.f11267th = (int) (raVar.ouw() / 32.0f);
        com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ouwVarOuw = fkwVar.f11202lh.ouw();
        this.ryl = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw2 = fkwVar.yu.ouw();
        this.mwh = ouwVarOuw2;
        ouwVarOuw2.ouw(this);
        ouwVar.ouw(ouwVarOuw2);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw3 = fkwVar.fkw.ouw();
        this.f11261jg = ouwVarOuw3;
        ouwVarOuw3.ouw(this);
        ouwVar.ouw(ouwVarOuw3);
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw4 = fkwVar.f11201le.ouw();
        this.f11262ko = ouwVarOuw4;
        ouwVarOuw4.ouw(this);
        ouwVar.ouw(ouwVarOuw4);
        if (ouwVar.vt() != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw5 = ouwVar.vt().ouw.ouw();
            this.qbp = ouwVarOuw5;
            ouwVarOuw5.ouw(this);
            ouwVar.ouw(this.qbp);
        }
        if (ouwVar.lh() != null) {
            this.zin = new com.bytedance.adsdk.vt.ouw.vt.lh(this, ouwVar, ouwVar.lh());
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i10) {
        RadialGradient radialGradient;
        if (this.f11264lh) {
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("GradientFillContent#draw");
        this.f11265ra.reset();
        for (int i11 = 0; i11 < this.tlj.size(); i11++) {
            this.f11265ra.addPath(this.tlj.get(i11).yu(), matrix);
        }
        this.f11265ra.computeBounds(this.bly, false);
        if (this.f11260cf == com.bytedance.adsdk.vt.lh.vt.ra.LINEAR) {
            long jVt = vt();
            radialGradient = this.fkw.get(jVt);
            if (radialGradient == null) {
                PointF pointFLe = this.f11261jg.le();
                PointF pointFLe2 = this.f11262ko.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe = this.ryl.le();
                LinearGradient linearGradient = new LinearGradient(pointFLe.x, pointFLe.y, pointFLe2.x, pointFLe2.y, ouw(yuVarLe.vt), yuVarLe.ouw, Shader.TileMode.CLAMP);
                this.fkw.put(jVt, linearGradient);
                radialGradient = linearGradient;
            }
        } else {
            long jVt2 = vt();
            radialGradient = this.f11263le.get(jVt2);
            if (radialGradient == null) {
                PointF pointFLe3 = this.f11261jg.le();
                PointF pointFLe4 = this.f11262ko.le();
                com.bytedance.adsdk.vt.lh.vt.yu yuVarLe2 = this.ryl.le();
                int[] iArrOuw = ouw(yuVarLe2.vt);
                float[] fArr = yuVarLe2.ouw;
                float f10 = pointFLe3.x;
                float f11 = pointFLe3.y;
                float fHypot = (float) Math.hypot(pointFLe4.x - f10, pointFLe4.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f10, f11, fHypot, iArrOuw, fArr, Shader.TileMode.CLAMP);
                this.f11263le.put(jVt2, (RadialGradient) radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.pno.setShader(radialGradient);
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.f11266rn;
        if (ouwVar != null) {
            this.pno.setColorFilter(ouwVar.le());
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar2 = this.qbp;
        if (ouwVar2 != null) {
            float fFloatValue = ouwVar2.le().floatValue();
            if (fFloatValue == 0.0f) {
                this.pno.setMaskFilter(null);
            } else if (fFloatValue != this.ouw) {
                this.pno.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.ouw = fFloatValue;
        }
        com.bytedance.adsdk.vt.ouw.vt.lh lhVar = this.zin;
        if (lhVar != null) {
            lhVar.ouw(this.pno);
        }
        this.pno.setAlpha(com.bytedance.adsdk.vt.le.ra.ouw((int) ((((i10 / 255.0f) * this.mwh.le().intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f11265ra, this.pno);
        com.bytedance.adsdk.vt.fkw.vt("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        this.f11265ra.reset();
        for (int i10 = 0; i10 < this.tlj.size(); i10++) {
            this.f11265ra.addPath(this.tlj.get(i10).yu(), matrix);
        }
        this.f11265ra.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] ouw(int[] iArr) {
        if (this.zih == null) {
            return iArr;
        }
        throw null;
    }
}
