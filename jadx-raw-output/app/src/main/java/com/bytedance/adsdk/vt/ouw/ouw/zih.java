package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zih implements th, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final String f11287lh;
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouw;
    private final com.bytedance.adsdk.vt.bly vt;
    private com.bytedance.adsdk.vt.lh.vt.jg yu;

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.vt.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
    }

    private static int ouw(int i10, int i11) {
        return i10 - (vt(i10, i11) * i11);
    }

    private static int vt(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    public zih(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.mwh mwhVar) {
        this.vt = blyVar;
        this.f11287lh = mwhVar.ouw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = mwhVar.vt.ouw();
        this.ouw = ouwVarOuw;
        ouwVar.ouw(ouwVarOuw);
        ouwVarOuw.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.th
    public final com.bytedance.adsdk.vt.lh.vt.jg ouw(com.bytedance.adsdk.vt.lh.vt.jg jgVar) {
        PointF pointF;
        int i10;
        boolean z10;
        PointF pointF2;
        com.bytedance.adsdk.vt.lh.vt.jg jgVar2 = jgVar;
        List<com.bytedance.adsdk.vt.lh.ouw> list = jgVar2.ouw;
        if (list.size() <= 2) {
            return jgVar2;
        }
        float fFloatValue = this.ouw.le().floatValue();
        if (fFloatValue == 0.0f) {
            return jgVar2;
        }
        List<com.bytedance.adsdk.vt.lh.ouw> list2 = jgVar2.ouw;
        boolean z11 = jgVar2.f11204lh;
        int size = list2.size() - 1;
        int i11 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.vt.lh.ouw ouwVar = list2.get(size);
            com.bytedance.adsdk.vt.lh.ouw ouwVar2 = list2.get(ouw(size - 1, list2.size()));
            if (size == 0 && !z11) {
                pointF2 = jgVar2.vt;
            } else {
                pointF2 = ouwVar2.f11187lh;
            }
            i11 = (((size != 0 || z11) ? ouwVar2.vt : pointF2).equals(pointF2) && ouwVar.ouw.equals(pointF2) && !(!jgVar2.f11204lh && size == 0 && size == list2.size() - 1)) ? i11 + 2 : i11 + 1;
            size--;
        }
        com.bytedance.adsdk.vt.lh.vt.jg jgVar3 = this.yu;
        if (jgVar3 == null || jgVar3.ouw.size() != i11) {
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(new com.bytedance.adsdk.vt.lh.ouw());
            }
            this.yu = new com.bytedance.adsdk.vt.lh.vt.jg(new PointF(0.0f, 0.0f), false, arrayList);
        }
        com.bytedance.adsdk.vt.lh.vt.jg jgVar4 = this.yu;
        jgVar4.f11204lh = z11;
        PointF pointF3 = jgVar2.vt;
        jgVar4.ouw(pointF3.x, pointF3.y);
        List<com.bytedance.adsdk.vt.lh.ouw> list3 = jgVar4.ouw;
        boolean z12 = jgVar2.f11204lh;
        int i13 = 0;
        int i14 = 0;
        while (i13 < list.size()) {
            com.bytedance.adsdk.vt.lh.ouw ouwVar3 = list.get(i13);
            com.bytedance.adsdk.vt.lh.ouw ouwVar4 = list.get(ouw(i13 - 1, list.size()));
            com.bytedance.adsdk.vt.lh.ouw ouwVar5 = list.get(ouw(i13 - 2, list.size()));
            if (i13 == 0 && !z12) {
                pointF = jgVar2.vt;
            } else {
                pointF = ouwVar4.f11187lh;
            }
            PointF pointF4 = (i13 != 0 || z12) ? ouwVar4.vt : pointF;
            PointF pointF5 = ouwVar3.ouw;
            PointF pointF6 = ouwVar5.f11187lh;
            PointF pointF7 = ouwVar3.f11187lh;
            boolean z13 = !jgVar2.f11204lh && i13 == 0 && i13 == list.size() + (-1);
            if (pointF4.equals(pointF) && pointF5.equals(pointF) && !z13) {
                float f10 = pointF.x;
                float f11 = f10 - pointF6.x;
                float f12 = pointF.y;
                float f13 = f12 - pointF6.y;
                float f14 = pointF7.x - f10;
                float f15 = pointF7.y - f12;
                float fHypot = (float) Math.hypot(f11, f13);
                i10 = i13;
                float fHypot2 = (float) Math.hypot(f14, f15);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f16 = pointF.x;
                float f17 = ((pointF6.x - f16) * fMin) + f16;
                float f18 = pointF.y;
                float f19 = ((pointF6.y - f18) * fMin) + f18;
                float f20 = ((pointF7.x - f16) * fMin2) + f16;
                float f21 = ((pointF7.y - f18) * fMin2) + f18;
                float f22 = f17 - ((f17 - f16) * 0.5519f);
                float f23 = f19 - ((f19 - f18) * 0.5519f);
                float f24 = f20 - ((f20 - f16) * 0.5519f);
                float f25 = f21 - ((f21 - f18) * 0.5519f);
                com.bytedance.adsdk.vt.lh.ouw ouwVar6 = list3.get(ouw(i14 - 1, list3.size()));
                com.bytedance.adsdk.vt.lh.ouw ouwVar7 = list3.get(i14);
                ouwVar6.vt(f17, f19);
                ouwVar6.lh(f17, f19);
                if (i10 == 0) {
                    jgVar4.ouw(f17, f19);
                }
                ouwVar7.ouw(f22, f23);
                int i15 = i14 + 1;
                com.bytedance.adsdk.vt.lh.ouw ouwVar8 = list3.get(i15);
                ouwVar7.vt(f24, f25);
                ouwVar7.lh(f20, f21);
                ouwVar8.ouw(f20, f21);
                z10 = true;
                i14 = i15 + 1;
            } else {
                i10 = i13;
                z10 = true;
                com.bytedance.adsdk.vt.lh.ouw ouwVar9 = list3.get(ouw(i14 - 1, list3.size()));
                com.bytedance.adsdk.vt.lh.ouw ouwVar10 = list3.get(i14);
                PointF pointF8 = ouwVar4.vt;
                ouwVar9.vt(pointF8.x, pointF8.y);
                PointF pointF9 = ouwVar4.f11187lh;
                ouwVar9.lh(pointF9.x, pointF9.y);
                PointF pointF10 = ouwVar3.ouw;
                ouwVar10.ouw(pointF10.x, pointF10.y);
                i14++;
            }
            i13 = i10 + 1;
            jgVar2 = jgVar;
            z12 = z12;
            list = list;
        }
        return jgVar4;
    }
}
