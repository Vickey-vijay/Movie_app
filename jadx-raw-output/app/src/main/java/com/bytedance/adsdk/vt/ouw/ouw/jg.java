package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jg implements cf, mwh, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f11240cf;
    private final boolean fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f11242ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final boolean f11243le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f11244lh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> mwh;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> f11245ra;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ryl;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> tlj;
    private final String vt;
    private final com.bytedance.adsdk.vt.lh.vt.tlj.ouw yu;
    private final Path ouw = new Path();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final vt f11241jg = new vt();

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            lh lhVar = list.get(i10);
            if (lhVar instanceof zin) {
                zin zinVar = (zin) lhVar;
                if (zinVar.vt == com.bytedance.adsdk.vt.lh.vt.th.ouw.SIMULTANEOUSLY) {
                    this.f11241jg.ouw(zinVar);
                    zinVar.ouw(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.ouw.ouw.jg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[com.bytedance.adsdk.vt.lh.vt.tlj.ouw.values().length];
            ouw = iArr;
            try {
                iArr[com.bytedance.adsdk.vt.lh.vt.tlj.ouw.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.vt.tlj.ouw.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        float fSin;
        float f10;
        double d10;
        float fCos;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f11242ko) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.fkw) {
            this.f11242ko = true;
            return this.ouw;
        }
        int i10 = AnonymousClass1.ouw[this.yu.ordinal()];
        float f15 = 0.0f;
        if (i10 == 1) {
            float fFloatValue = this.f11245ra.le().floatValue();
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar = this.bly;
            double radians = Math.toRadians((ouwVar != null ? ouwVar.le().floatValue() : 0.0d) - 90.0d);
            double d11 = fFloatValue;
            float f16 = (float) (6.283185307179586d / d11);
            if (this.f11243le) {
                f16 *= -1.0f;
            }
            float f17 = f16 / 2.0f;
            float f18 = fFloatValue - ((int) fFloatValue);
            if (f18 != 0.0f) {
                radians += (double) ((1.0f - f18) * f17);
            }
            float fFloatValue2 = this.f11240cf.le().floatValue();
            float fFloatValue3 = this.tlj.le().floatValue();
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = this.ryl;
            float fFloatValue4 = ouwVar2 != null ? ouwVar2.le().floatValue() / 100.0f : 0.0f;
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar3 = this.mwh;
            float fFloatValue5 = ouwVar3 != null ? ouwVar3.le().floatValue() / 100.0f : 0.0f;
            if (f18 != 0.0f) {
                float f19 = ((fFloatValue2 - fFloatValue3) * f18) + fFloatValue3;
                double d12 = f19;
                f11 = f19;
                fCos = (float) (d12 * Math.cos(radians));
                float fSin2 = (float) (d12 * Math.sin(radians));
                this.ouw.moveTo(fCos, fSin2);
                d10 = radians + ((double) ((f16 * f18) / 2.0f));
                f10 = f17;
                fSin = fSin2;
            } else {
                double d13 = fFloatValue2;
                float fCos2 = (float) (d13 * Math.cos(radians));
                fSin = (float) (d13 * Math.sin(radians));
                this.ouw.moveTo(fCos2, fSin);
                f10 = f17;
                d10 = radians + ((double) f10);
                fCos = fCos2;
                f11 = 0.0f;
            }
            double dCeil = Math.ceil(d11) * 2.0d;
            float f20 = fCos;
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                double d14 = i11;
                if (d14 >= dCeil) {
                    break;
                }
                float f21 = z10 ? fFloatValue2 : fFloatValue3;
                float f22 = (f11 == 0.0f || d14 != dCeil - 2.0d) ? f10 : (f16 * f18) / 2.0f;
                double d15 = (f11 == 0.0f || d14 != dCeil - 1.0d) ? f21 : f11;
                double d16 = dCeil;
                float fCos3 = (float) (d15 * Math.cos(d10));
                float fSin3 = (float) (d15 * Math.sin(d10));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.ouw.lineTo(fCos3, fSin3);
                    f12 = fFloatValue2;
                    f13 = fFloatValue5;
                    f14 = fFloatValue4;
                } else {
                    f12 = fFloatValue2;
                    double dAtan2 = (float) (Math.atan2(fSin, f20) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    f13 = fFloatValue5;
                    f14 = fFloatValue4;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f23 = z10 ? f14 : f13;
                    float f24 = z10 ? f13 : f14;
                    float f25 = (z10 ? fFloatValue3 : f12) * f23 * 0.47829f;
                    float f26 = fCos4 * f25;
                    float f27 = f25 * fSin4;
                    float f28 = (z10 ? f12 : fFloatValue3) * f24 * 0.47829f;
                    float f29 = fCos5 * f28;
                    float f30 = f28 * fSin5;
                    if (f18 != 0.0f) {
                        if (i11 == 0) {
                            f26 *= f18;
                            f27 *= f18;
                        } else if (d14 == d16 - 1.0d) {
                            f29 *= f18;
                            f30 *= f18;
                        }
                    }
                    this.ouw.cubicTo(f20 - f26, fSin - f27, fCos3 + f29, fSin3 + f30, fCos3, fSin3);
                }
                d10 += (double) f22;
                z10 = !z10;
                i11++;
                f20 = fCos3;
                fSin = fSin3;
                fFloatValue2 = f12;
                f16 = f16;
                f10 = f10;
                fFloatValue4 = f14;
                fFloatValue5 = f13;
                dCeil = d16;
            }
            PointF pointFLe = this.pno.le();
            this.ouw.offset(pointFLe.x, pointFLe.y);
            this.ouw.close();
        } else if (i10 == 2) {
            int iFloor = (int) Math.floor(this.f11245ra.le().floatValue());
            com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar4 = this.bly;
            double radians2 = Math.toRadians((ouwVar4 != null ? ouwVar4.le().floatValue() : 0.0d) - 90.0d);
            double d17 = iFloor;
            float fFloatValue6 = this.mwh.le().floatValue() / 100.0f;
            float fFloatValue7 = this.f11240cf.le().floatValue();
            double d18 = fFloatValue7;
            float fCos6 = (float) (d18 * Math.cos(radians2));
            float fSin6 = (float) (d18 * Math.sin(radians2));
            this.ouw.moveTo(fCos6, fSin6);
            double d19 = (float) (6.283185307179586d / d17);
            double d20 = radians2 + d19;
            double dCeil2 = Math.ceil(d17);
            float f31 = fCos6;
            int i12 = 0;
            while (i12 < dCeil2) {
                float fCos7 = (float) (Math.cos(d20) * d18);
                double d21 = dCeil2;
                float fSin7 = (float) (d18 * Math.sin(d20));
                if (fFloatValue6 != f15) {
                    double dAtan4 = (float) (Math.atan2(fSin6, f31) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f32 = fFloatValue7 * fFloatValue6 * 0.25f;
                    this.ouw.cubicTo(f31 - (fCos8 * f32), fSin6 - (fSin8 * f32), fCos7 + (((float) Math.cos(dAtan5)) * f32), fSin7 + (f32 * ((float) Math.sin(dAtan5))), fCos7, fSin7);
                } else {
                    this.ouw.lineTo(fCos7, fSin7);
                }
                d20 += d19;
                i12++;
                f31 = fCos7;
                fSin6 = fSin7;
                dCeil2 = d21;
                d18 = d18;
                f15 = 0.0f;
            }
            PointF pointFLe2 = this.pno.le();
            this.ouw.offset(pointFLe2.x, pointFLe2.y);
            this.ouw.close();
        }
        this.ouw.close();
        this.f11241jg.ouw(this.ouw);
        this.f11242ko = true;
        return this.ouw;
    }

    public jg(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.tlj tljVar) {
        this.f11244lh = blyVar;
        this.vt = tljVar.ouw;
        com.bytedance.adsdk.vt.lh.vt.tlj.ouw ouwVar2 = tljVar.vt;
        this.yu = ouwVar2;
        this.fkw = tljVar.tlj;
        this.f11243le = tljVar.f11219cf;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = tljVar.f11221lh.ouw();
        this.f11245ra = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = tljVar.yu.ouw();
        this.pno = ouwVarOuw2;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = tljVar.fkw.ouw();
        this.bly = ouwVarOuw3;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw4 = tljVar.f11222ra.ouw();
        this.f11240cf = ouwVarOuw4;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw5 = tljVar.bly.ouw();
        this.mwh = ouwVarOuw5;
        com.bytedance.adsdk.vt.lh.vt.tlj.ouw ouwVar3 = com.bytedance.adsdk.vt.lh.vt.tlj.ouw.STAR;
        if (ouwVar2 == ouwVar3) {
            this.tlj = tljVar.f11220le.ouw();
            this.ryl = tljVar.pno.ouw();
        } else {
            this.tlj = null;
            this.ryl = null;
        }
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVar.ouw(ouwVarOuw3);
        ouwVar.ouw(ouwVarOuw4);
        ouwVar.ouw(ouwVarOuw5);
        if (ouwVar2 == ouwVar3) {
            ouwVar.ouw(this.tlj);
            ouwVar.ouw(this.ryl);
        }
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
        ouwVarOuw3.ouw(this);
        ouwVarOuw4.ouw(this);
        ouwVarOuw5.ouw(this);
        if (ouwVar2 == ouwVar3) {
            this.tlj.ouw(this);
            this.ryl.ouw(this);
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.f11242ko = false;
        this.f11244lh.invalidateSelf();
    }
}
