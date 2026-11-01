package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ouw implements cf, fkw, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f11253cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f11254jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> f11255ko;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f11257lh;
    private final List<com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float>> mwh;
    public final com.bytedance.adsdk.vt.lh.lh.ouw ouw;
    private final com.bytedance.adsdk.vt.bly pno;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f11259rn;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Integer> ryl;
    private final float[] tlj;
    public final Paint vt;
    private com.bytedance.adsdk.vt.ouw.vt.lh zih;
    private final PathMeasure yu = new PathMeasure();
    private final Path fkw = new Path();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Path f11256le = new Path();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final RectF f11258ra = new RectF();
    private final List<C0077ouw> bly = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.ouw.ouw.ouw$ouw, reason: collision with other inner class name */
    public static final class C0077ouw {
        public final List<mwh> ouw;
        public final zin vt;

        public /* synthetic */ C0077ouw(zin zinVar, byte b10) {
            this(zinVar);
        }

        private C0077ouw(zin zinVar) {
            this.ouw = new ArrayList();
            this.vt = zinVar;
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.pno.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        C0077ouw c0077ouw = null;
        zin zinVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            lh lhVar = list.get(size);
            if (lhVar instanceof zin) {
                zin zinVar2 = (zin) lhVar;
                if (zinVar2.vt == com.bytedance.adsdk.vt.lh.vt.th.ouw.INDIVIDUALLY) {
                    zinVar = zinVar2;
                }
            }
        }
        if (zinVar != null) {
            zinVar.ouw(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            lh lhVar2 = list2.get(size2);
            byte b10 = 0;
            if (lhVar2 instanceof zin) {
                zin zinVar3 = (zin) lhVar2;
                if (zinVar3.vt == com.bytedance.adsdk.vt.lh.vt.th.ouw.INDIVIDUALLY) {
                    if (c0077ouw != null) {
                        this.bly.add(c0077ouw);
                    }
                    C0077ouw c0077ouw2 = new C0077ouw(zinVar3, b10);
                    zinVar3.ouw(this);
                    c0077ouw = c0077ouw2;
                } else if (!(lhVar2 instanceof mwh)) {
                    if (c0077ouw == null) {
                        c0077ouw = new C0077ouw(zinVar, b10);
                    }
                    c0077ouw.ouw.add((mwh) lhVar2);
                }
            } else if (!(lhVar2 instanceof mwh)) {
                if (c0077ouw == null) {
                    c0077ouw = new C0077ouw(zinVar, b10);
                }
                c0077ouw.ouw.add((mwh) lhVar2);
            }
        }
        if (c0077ouw != null) {
            this.bly.add(c0077ouw);
        }
    }

    public ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, List<com.bytedance.adsdk.vt.lh.ouw.vt> list, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2) {
        com.bytedance.adsdk.vt.ouw.ouw ouwVar2 = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.vt = ouwVar2;
        this.f11257lh = 0.0f;
        this.pno = blyVar;
        this.ouw = ouwVar;
        ouwVar2.setStyle(Paint.Style.STROKE);
        ouwVar2.setStrokeCap(cap);
        ouwVar2.setStrokeJoin(join);
        ouwVar2.setStrokeMiter(f10);
        this.ryl = yuVar.ouw();
        this.f11253cf = vtVar.ouw();
        if (vtVar2 == null) {
            this.f11254jg = null;
        } else {
            this.f11254jg = vtVar2.ouw();
        }
        this.mwh = new ArrayList(list.size());
        this.tlj = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.mwh.add(list.get(i10).ouw());
        }
        ouwVar.ouw(this.ryl);
        ouwVar.ouw(this.f11253cf);
        for (int i11 = 0; i11 < this.mwh.size(); i11++) {
            ouwVar.ouw(this.mwh.get(i11));
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar3 = this.f11254jg;
        if (ouwVar3 != null) {
            ouwVar.ouw(ouwVar3);
        }
        this.ryl.ouw(this);
        this.f11253cf.ouw(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.mwh.get(i12).ouw(this);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar4 = this.f11254jg;
        if (ouwVar4 != null) {
            ouwVar4.ouw(this);
        }
        if (ouwVar.vt() != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = ouwVar.vt().ouw.ouw();
            this.f11259rn = ouwVarOuw;
            ouwVarOuw.ouw(this);
            ouwVar.ouw(this.f11259rn);
        }
        if (ouwVar.lh() != null) {
            this.zih = new com.bytedance.adsdk.vt.ouw.vt.lh(this, ouwVar, ouwVar.lh());
        }
    }

    public void ouw(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#draw");
        if (com.bytedance.adsdk.vt.le.pno.vt(matrix)) {
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#draw");
            return;
        }
        this.vt.setAlpha(com.bytedance.adsdk.vt.le.ra.ouw((int) ((((i10 / 255.0f) * ((com.bytedance.adsdk.vt.ouw.vt.le) this.ryl).pno()) / 100.0f) * 255.0f)));
        this.vt.setStrokeWidth(((com.bytedance.adsdk.vt.ouw.vt.yu) this.f11253cf).pno() * com.bytedance.adsdk.vt.le.pno.ouw(matrix));
        if (this.vt.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#draw");
            return;
        }
        com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#applyDashPattern");
        if (this.mwh.isEmpty()) {
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#applyDashPattern");
        } else {
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw(matrix);
            for (int i11 = 0; i11 < this.mwh.size(); i11++) {
                this.tlj[i11] = this.mwh.get(i11).le().floatValue();
                if (i11 % 2 == 0) {
                    float[] fArr = this.tlj;
                    if (fArr[i11] < 1.0f) {
                        fArr[i11] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.tlj;
                    if (fArr2[i11] < 0.1f) {
                        fArr2[i11] = 0.1f;
                    }
                }
                float[] fArr3 = this.tlj;
                fArr3[i11] = fArr3[i11] * fOuw;
            }
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar = this.f11254jg;
            this.vt.setPathEffect(new DashPathEffect(this.tlj, ouwVar == null ? 0.0f : ouwVar.le().floatValue() * fOuw));
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#applyDashPattern");
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar2 = this.f11255ko;
        if (ouwVar2 != null) {
            this.vt.setColorFilter(ouwVar2.le());
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar3 = this.f11259rn;
        if (ouwVar3 != null) {
            float fFloatValue = ouwVar3.le().floatValue();
            if (fFloatValue == 0.0f) {
                this.vt.setMaskFilter(null);
            } else if (fFloatValue != this.f11257lh) {
                this.vt.setMaskFilter(this.ouw.vt(fFloatValue));
            }
            this.f11257lh = fFloatValue;
        }
        com.bytedance.adsdk.vt.ouw.vt.lh lhVar = this.zih;
        if (lhVar != null) {
            lhVar.ouw(this.vt);
        }
        for (int i12 = 0; i12 < this.bly.size(); i12++) {
            C0077ouw c0077ouw = this.bly.get(i12);
            if (c0077ouw.vt != null) {
                ouw(canvas, c0077ouw, matrix);
            } else {
                com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#buildPath");
                this.fkw.reset();
                for (int size = c0077ouw.ouw.size() - 1; size >= 0; size--) {
                    this.fkw.addPath(c0077ouw.ouw.get(size).yu(), matrix);
                }
                com.bytedance.adsdk.vt.fkw.vt("StrokeContent#buildPath");
                com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#drawPath");
                canvas.drawPath(this.fkw, this.vt);
                com.bytedance.adsdk.vt.fkw.vt("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.vt.fkw.vt("StrokeContent#draw");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    private void ouw(Canvas canvas, C0077ouw c0077ouw, Matrix matrix) {
        float f10;
        float f11;
        float fMin;
        com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#applyTrimPath");
        if (c0077ouw.vt == null) {
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#applyTrimPath");
            return;
        }
        this.fkw.reset();
        for (int size = c0077ouw.ouw.size() - 1; size >= 0; size--) {
            this.fkw.addPath(c0077ouw.ouw.get(size).yu(), matrix);
        }
        float fFloatValue = c0077ouw.vt.f11289lh.le().floatValue() / 100.0f;
        float fFloatValue2 = c0077ouw.vt.yu.le().floatValue() / 100.0f;
        float fFloatValue3 = c0077ouw.vt.fkw.le().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.fkw, this.vt);
            com.bytedance.adsdk.vt.fkw.vt("StrokeContent#applyTrimPath");
            return;
        }
        this.yu.setPath(this.fkw, false);
        float length = this.yu.getLength();
        while (this.yu.nextContour()) {
            length += this.yu.getLength();
        }
        float f12 = fFloatValue3 * length;
        float f13 = (fFloatValue * length) + f12;
        float f14 = 1.0f;
        float fMin2 = Math.min((fFloatValue2 * length) + f12, (f13 + length) - 1.0f);
        int size2 = c0077ouw.ouw.size() - 1;
        float f15 = 0.0f;
        while (size2 >= 0) {
            this.f11256le.set(c0077ouw.ouw.get(size2).yu());
            this.f11256le.transform(matrix);
            this.yu.setPath(this.f11256le, false);
            float length2 = this.yu.getLength();
            if (fMin2 > length) {
                float f16 = fMin2 - length;
                if (f16 >= f15 + length2 || f15 >= f16) {
                    f10 = f15 + length2;
                    if (f10 < f13 && f15 <= fMin2) {
                        if (f10 > fMin2 || f13 >= f15) {
                            f11 = f13 < f15 ? 0.0f : (f13 - f15) / length2;
                            fMin = fMin2 > f10 ? f14 : (fMin2 - f15) / length2;
                        } else {
                            canvas.drawPath(this.f11256le, this.vt);
                        }
                    }
                } else {
                    f11 = f13 > length ? (f13 - length) / length2 : 0.0f;
                    fMin = Math.min(f16 / length2, f14);
                }
                com.bytedance.adsdk.vt.le.pno.ouw(this.f11256le, f11, fMin, 0.0f);
                canvas.drawPath(this.f11256le, this.vt);
            } else {
                f10 = f15 + length2;
                if (f10 < f13) {
                }
            }
            f15 += length2;
            size2--;
            f14 = 1.0f;
        }
        com.bytedance.adsdk.vt.fkw.vt("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        com.bytedance.adsdk.vt.fkw.ouw("StrokeContent#getBounds");
        this.fkw.reset();
        for (int i10 = 0; i10 < this.bly.size(); i10++) {
            C0077ouw c0077ouw = this.bly.get(i10);
            for (int i11 = 0; i11 < c0077ouw.ouw.size(); i11++) {
                this.fkw.addPath(c0077ouw.ouw.get(i11).yu(), matrix);
            }
        }
        this.fkw.computeBounds(this.f11258ra, false);
        float fPno = ((com.bytedance.adsdk.vt.ouw.vt.yu) this.f11253cf).pno();
        RectF rectF2 = this.f11258ra;
        float f10 = fPno / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f11258ra);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.vt.fkw.vt("StrokeContent#getBounds");
    }
}
