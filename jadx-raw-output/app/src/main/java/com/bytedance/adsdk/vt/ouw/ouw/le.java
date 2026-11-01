package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class le implements cf, mwh, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.lh.vt.vt f11250le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f11251lh;
    private boolean pno;
    private final String vt;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> yu;
    private final Path ouw = new Path();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final vt f11252ra = new vt();

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            lh lhVar = list.get(i10);
            if (lhVar instanceof zin) {
                zin zinVar = (zin) lhVar;
                if (zinVar.vt == com.bytedance.adsdk.vt.lh.vt.th.ouw.SIMULTANEOUSLY) {
                    this.f11252ra.ouw(zinVar);
                    zinVar.ouw(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        if (this.pno) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.f11250le.fkw) {
            this.pno = true;
            return this.ouw;
        }
        PointF pointFLe = this.yu.le();
        float f10 = pointFLe.x / 2.0f;
        float f11 = pointFLe.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.ouw.reset();
        if (this.f11250le.yu) {
            float f14 = -f11;
            this.ouw.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.ouw.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.ouw.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.ouw.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.ouw.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.ouw.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.ouw.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.ouw.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.ouw.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.ouw.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFLe2 = this.fkw.le();
        this.ouw.offset(pointFLe2.x, pointFLe2.y);
        this.ouw.close();
        this.f11252ra.ouw(this.ouw);
        this.pno = true;
        return this.ouw;
    }

    public le(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.vt vtVar) {
        this.vt = vtVar.ouw;
        this.f11251lh = blyVar;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw = vtVar.f11229lh.ouw();
        this.yu = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = vtVar.vt.ouw();
        this.fkw = ouwVarOuw2;
        this.f11250le = vtVar;
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.pno = false;
        this.f11251lh.invalidateSelf();
    }
}
