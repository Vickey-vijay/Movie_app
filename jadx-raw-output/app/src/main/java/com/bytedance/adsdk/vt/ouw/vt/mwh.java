package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.vt.ouw.ouw.th;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class mwh extends ouw<com.bytedance.adsdk.vt.lh.vt.jg, Path> {
    public List<th> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.lh.vt.jg f11297le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final Path f11298ra;

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Path ouw(com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.jg> ouwVar, float f10) {
        com.bytedance.adsdk.vt.lh.vt.jg jgVar = ouwVar.vt;
        com.bytedance.adsdk.vt.lh.vt.jg jgVar2 = ouwVar.f11336lh;
        com.bytedance.adsdk.vt.lh.vt.jg jgVar3 = this.f11297le;
        if (jgVar3.vt == null) {
            jgVar3.vt = new PointF();
        }
        jgVar3.f11204lh = jgVar.f11204lh || jgVar2.f11204lh;
        if (jgVar.ouw.size() != jgVar2.ouw.size()) {
            com.bytedance.adsdk.vt.le.yu.vt("Curves must have the same number of control points. Shape 1: " + jgVar.ouw.size() + "\tShape 2: " + jgVar2.ouw.size());
        }
        int iMin = Math.min(jgVar.ouw.size(), jgVar2.ouw.size());
        if (jgVar3.ouw.size() < iMin) {
            for (int size = jgVar3.ouw.size(); size < iMin; size++) {
                jgVar3.ouw.add(new com.bytedance.adsdk.vt.lh.ouw());
            }
        } else if (jgVar3.ouw.size() > iMin) {
            for (int size2 = jgVar3.ouw.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.vt.lh.ouw> list = jgVar3.ouw;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = jgVar.vt;
        PointF pointF2 = jgVar2.vt;
        jgVar3.ouw(com.bytedance.adsdk.vt.le.ra.ouw(pointF.x, pointF2.x, f10), com.bytedance.adsdk.vt.le.ra.ouw(pointF.y, pointF2.y, f10));
        for (int size3 = jgVar3.ouw.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.vt.lh.ouw ouwVar2 = jgVar.ouw.get(size3);
            com.bytedance.adsdk.vt.lh.ouw ouwVar3 = jgVar2.ouw.get(size3);
            PointF pointF3 = ouwVar2.ouw;
            PointF pointF4 = ouwVar2.vt;
            PointF pointF5 = ouwVar2.f11187lh;
            PointF pointF6 = ouwVar3.ouw;
            PointF pointF7 = ouwVar3.vt;
            PointF pointF8 = ouwVar3.f11187lh;
            jgVar3.ouw.get(size3).ouw(com.bytedance.adsdk.vt.le.ra.ouw(pointF3.x, pointF6.x, f10), com.bytedance.adsdk.vt.le.ra.ouw(pointF3.y, pointF6.y, f10));
            jgVar3.ouw.get(size3).vt(com.bytedance.adsdk.vt.le.ra.ouw(pointF4.x, pointF7.x, f10), com.bytedance.adsdk.vt.le.ra.ouw(pointF4.y, pointF7.y, f10));
            jgVar3.ouw.get(size3).lh(com.bytedance.adsdk.vt.le.ra.ouw(pointF5.x, pointF8.x, f10), com.bytedance.adsdk.vt.le.ra.ouw(pointF5.y, pointF8.y, f10));
        }
        com.bytedance.adsdk.vt.lh.vt.jg jgVarOuw = this.f11297le;
        List<th> list2 = this.fkw;
        if (list2 != null) {
            for (int size4 = list2.size() - 1; size4 >= 0; size4--) {
                jgVarOuw = this.fkw.get(size4).ouw(jgVarOuw);
            }
        }
        com.bytedance.adsdk.vt.le.ra.ouw(jgVarOuw, this.f11298ra);
        return this.f11298ra;
    }

    public mwh(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.jg>> list) {
        super(list);
        this.f11297le = new com.bytedance.adsdk.vt.lh.vt.jg();
        this.f11298ra = new Path();
    }
}
