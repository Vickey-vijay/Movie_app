package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes11.dex */
public final class rn {
    public ouw<?, Float> bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Matrix f11304cf;
    public ouw<Integer, Integer> fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final float[] f11305jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public yu f11306le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> f11307lh;
    private final Matrix mwh;
    public ouw<PointF, PointF> ouw;
    public ouw<?, Float> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public yu f11308ra;
    private final Matrix ryl;
    private final Matrix tlj = new Matrix();
    public ouw<?, PointF> vt;
    public ouw<Float, Float> yu;

    private void vt() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f11305jg[i10] = 0.0f;
        }
    }

    public final void ouw(com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        ouwVar.ouw(this.fkw);
        ouwVar.ouw(this.pno);
        ouwVar.ouw(this.bly);
        ouwVar.ouw(this.ouw);
        ouwVar.ouw(this.vt);
        ouwVar.ouw(this.f11307lh);
        ouwVar.ouw(this.yu);
        ouwVar.ouw(this.f11306le);
        ouwVar.ouw(this.f11308ra);
    }

    public rn(com.bytedance.adsdk.vt.lh.ouw.ryl rylVar) {
        ouw<PointF, PointF> ouwVarOuw;
        ouw<PointF, PointF> ouwVarOuw2;
        ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVarOuw3;
        ouw<Float, Float> ouwVarOuw4;
        yu yuVar;
        yu yuVar2;
        com.bytedance.adsdk.vt.lh.ouw.fkw fkwVar = rylVar.ouw;
        if (fkwVar == null) {
            ouwVarOuw = null;
        } else {
            ouwVarOuw = fkwVar.ouw();
        }
        this.ouw = ouwVarOuw;
        com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar = rylVar.vt;
        if (mwhVar == null) {
            ouwVarOuw2 = null;
        } else {
            ouwVarOuw2 = mwhVar.ouw();
        }
        this.vt = ouwVarOuw2;
        com.bytedance.adsdk.vt.lh.ouw.ra raVar = rylVar.f11190lh;
        if (raVar == null) {
            ouwVarOuw3 = null;
        } else {
            ouwVarOuw3 = raVar.ouw();
        }
        this.f11307lh = ouwVarOuw3;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar = rylVar.yu;
        if (vtVar == null) {
            ouwVarOuw4 = null;
        } else {
            ouwVarOuw4 = vtVar.ouw();
        }
        this.yu = ouwVarOuw4;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2 = rylVar.f11189le;
        if (vtVar2 == null) {
            yuVar = null;
        } else {
            yuVar = (yu) vtVar2.ouw();
        }
        this.f11306le = yuVar;
        if (yuVar != null) {
            this.f11304cf = new Matrix();
            this.ryl = new Matrix();
            this.mwh = new Matrix();
            this.f11305jg = new float[9];
        } else {
            this.f11304cf = null;
            this.ryl = null;
            this.mwh = null;
            this.f11305jg = null;
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar3 = rylVar.f11191ra;
        if (vtVar3 == null) {
            yuVar2 = null;
        } else {
            yuVar2 = (yu) vtVar3.ouw();
        }
        this.f11308ra = yuVar2;
        com.bytedance.adsdk.vt.lh.ouw.yu yuVar3 = rylVar.fkw;
        if (yuVar3 != null) {
            this.fkw = yuVar3.ouw();
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar4 = rylVar.pno;
        if (vtVar4 != null) {
            this.pno = vtVar4.ouw();
        } else {
            this.pno = null;
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar5 = rylVar.bly;
        if (vtVar5 != null) {
            this.bly = vtVar5.ouw();
        } else {
            this.bly = null;
        }
    }

    public final void ouw(ouw.InterfaceC0078ouw interfaceC0078ouw) {
        ouw<Integer, Integer> ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(interfaceC0078ouw);
        }
        ouw<?, Float> ouwVar2 = this.pno;
        if (ouwVar2 != null) {
            ouwVar2.ouw(interfaceC0078ouw);
        }
        ouw<?, Float> ouwVar3 = this.bly;
        if (ouwVar3 != null) {
            ouwVar3.ouw(interfaceC0078ouw);
        }
        ouw<PointF, PointF> ouwVar4 = this.ouw;
        if (ouwVar4 != null) {
            ouwVar4.ouw(interfaceC0078ouw);
        }
        ouw<?, PointF> ouwVar5 = this.vt;
        if (ouwVar5 != null) {
            ouwVar5.ouw(interfaceC0078ouw);
        }
        ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar6 = this.f11307lh;
        if (ouwVar6 != null) {
            ouwVar6.ouw(interfaceC0078ouw);
        }
        ouw<Float, Float> ouwVar7 = this.yu;
        if (ouwVar7 != null) {
            ouwVar7.ouw(interfaceC0078ouw);
        }
        yu yuVar = this.f11306le;
        if (yuVar != null) {
            yuVar.ouw(interfaceC0078ouw);
        }
        yu yuVar2 = this.f11308ra;
        if (yuVar2 != null) {
            yuVar2.ouw(interfaceC0078ouw);
        }
    }

    public final Matrix ouw() {
        PointF pointFLe;
        float fPno;
        PointF pointFLe2;
        this.tlj.reset();
        ouw<?, PointF> ouwVar = this.vt;
        if (ouwVar != null && (pointFLe2 = ouwVar.le()) != null) {
            float f10 = pointFLe2.x;
            if (f10 != 0.0f || pointFLe2.y != 0.0f) {
                this.tlj.preTranslate(f10, pointFLe2.y);
            }
        }
        ouw<Float, Float> ouwVar2 = this.yu;
        if (ouwVar2 != null) {
            if (ouwVar2 instanceof zih) {
                fPno = ouwVar2.le().floatValue();
            } else {
                fPno = ((yu) ouwVar2).pno();
            }
            if (fPno != 0.0f) {
                this.tlj.preRotate(fPno);
            }
        }
        yu yuVar = this.f11306le;
        if (yuVar != null) {
            yu yuVar2 = this.f11308ra;
            float fCos = yuVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-yuVar2.pno()) + 90.0f));
            yu yuVar3 = this.f11308ra;
            float fSin = yuVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-yuVar3.pno()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(yuVar.pno()));
            vt();
            float[] fArr = this.f11305jg;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f11304cf.setValues(fArr);
            vt();
            float[] fArr2 = this.f11305jg;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.ryl.setValues(fArr2);
            vt();
            float[] fArr3 = this.f11305jg;
            fArr3[0] = fCos;
            fArr3[1] = f11;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.mwh.setValues(fArr3);
            this.ryl.preConcat(this.f11304cf);
            this.mwh.preConcat(this.ryl);
            this.tlj.preConcat(this.mwh);
        }
        ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar3 = this.f11307lh;
        if (ouwVar3 != null) {
            com.bytedance.adsdk.vt.ra.lh lhVarLe = ouwVar3.le();
            float f12 = lhVarLe.ouw;
            if (f12 != 1.0f || lhVarLe.vt != 1.0f) {
                this.tlj.preScale(f12, lhVarLe.vt);
            }
        }
        ouw<PointF, PointF> ouwVar4 = this.ouw;
        if (ouwVar4 != null && (((pointFLe = ouwVar4.le()) != null && pointFLe.x != 0.0f) || pointFLe.y != 0.0f)) {
            this.tlj.preTranslate(-pointFLe.x, -pointFLe.y);
        }
        return this.tlj;
    }

    public final Matrix ouw(float f10) {
        ouw<?, PointF> ouwVar = this.vt;
        PointF pointFLe = ouwVar == null ? null : ouwVar.le();
        ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar2 = this.f11307lh;
        com.bytedance.adsdk.vt.ra.lh lhVarLe = ouwVar2 == null ? null : ouwVar2.le();
        this.tlj.reset();
        if (pointFLe != null) {
            this.tlj.preTranslate(pointFLe.x * f10, pointFLe.y * f10);
        }
        if (lhVarLe != null) {
            double d10 = f10;
            this.tlj.preScale((float) Math.pow(lhVarLe.ouw, d10), (float) Math.pow(lhVarLe.vt, d10));
        }
        ouw<Float, Float> ouwVar3 = this.yu;
        if (ouwVar3 != null) {
            float fFloatValue = ouwVar3.le().floatValue();
            ouw<PointF, PointF> ouwVar4 = this.ouw;
            PointF pointFLe2 = ouwVar4 != null ? ouwVar4.le() : null;
            this.tlj.preRotate(fFloatValue * f10, pointFLe2 == null ? 0.0f : pointFLe2.x, pointFLe2 != null ? pointFLe2.y : 0.0f);
        }
        return this.tlj;
    }
}
