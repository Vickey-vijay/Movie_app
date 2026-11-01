package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ko implements cf, mwh, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f11246cf;
    private final com.bytedance.adsdk.vt.bly fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> f11247le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f11248lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> f11249ra;
    private final boolean yu;
    private final Path ouw = new Path();
    private final RectF vt = new RectF();
    private final vt bly = new vt();
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> tlj = null;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x002d A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            lh lhVar = list.get(i10);
            if (lhVar instanceof zin) {
                zin zinVar = (zin) lhVar;
                if (zinVar.vt == com.bytedance.adsdk.vt.lh.vt.th.ouw.SIMULTANEOUSLY) {
                    this.bly.ouw(zinVar);
                    zinVar.ouw(this);
                } else if (lhVar instanceof zih) {
                    this.tlj = ((zih) lhVar).ouw;
                }
            } else if (lhVar instanceof zih) {
                this.tlj = ((zih) lhVar).ouw;
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar;
        if (this.f11246cf) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.yu) {
            this.f11246cf = true;
            return this.ouw;
        }
        PointF pointFLe = this.f11249ra.le();
        float f10 = pointFLe.x / 2.0f;
        float f11 = pointFLe.y / 2.0f;
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = this.pno;
        float fPno = ouwVar2 == null ? 0.0f : ((com.bytedance.adsdk.vt.ouw.vt.yu) ouwVar2).pno();
        if (fPno == 0.0f && (ouwVar = this.tlj) != null) {
            fPno = Math.min(ouwVar.le().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fPno > fMin) {
            fPno = fMin;
        }
        PointF pointFLe2 = this.f11247le.le();
        this.ouw.moveTo(pointFLe2.x + f10, (pointFLe2.y - f11) + fPno);
        this.ouw.lineTo(pointFLe2.x + f10, (pointFLe2.y + f11) - fPno);
        if (fPno > 0.0f) {
            RectF rectF = this.vt;
            float f12 = pointFLe2.x;
            float f13 = fPno * 2.0f;
            float f14 = pointFLe2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.ouw.arcTo(this.vt, 0.0f, 90.0f, false);
        }
        this.ouw.lineTo((pointFLe2.x - f10) + fPno, pointFLe2.y + f11);
        if (fPno > 0.0f) {
            RectF rectF2 = this.vt;
            float f15 = pointFLe2.x;
            float f16 = pointFLe2.y;
            float f17 = fPno * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.ouw.arcTo(this.vt, 90.0f, 90.0f, false);
        }
        this.ouw.lineTo(pointFLe2.x - f10, (pointFLe2.y - f11) + fPno);
        if (fPno > 0.0f) {
            RectF rectF3 = this.vt;
            float f18 = pointFLe2.x;
            float f19 = pointFLe2.y;
            float f20 = fPno * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.ouw.arcTo(this.vt, 180.0f, 90.0f, false);
        }
        this.ouw.lineTo((pointFLe2.x + f10) - fPno, pointFLe2.y - f11);
        if (fPno > 0.0f) {
            RectF rectF4 = this.vt;
            float f21 = pointFLe2.x;
            float f22 = fPno * 2.0f;
            float f23 = pointFLe2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.ouw.arcTo(this.vt, 270.0f, 90.0f, false);
        }
        this.ouw.close();
        this.bly.ouw(this.ouw);
        this.f11246cf = true;
        return this.ouw;
    }

    public ko(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.cf cfVar) {
        this.f11248lh = cfVar.ouw;
        this.yu = cfVar.fkw;
        this.fkw = blyVar;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw = cfVar.vt.ouw();
        this.f11247le = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = cfVar.f11200lh.ouw();
        this.f11249ra = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = cfVar.yu.ouw();
        this.pno = ouwVarOuw3;
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.f11246cf = false;
        this.fkw.invalidateSelf();
    }
}
