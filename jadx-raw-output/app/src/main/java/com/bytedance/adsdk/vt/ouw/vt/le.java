package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class le extends ra<Integer> {
    private int vt(com.bytedance.adsdk.vt.ra.ouw<Integer> ouwVar, float f10) {
        Integer num = ouwVar.vt;
        if (num == null || ouwVar.f11336lh == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.yu != null) {
            ouwVar.pno.floatValue();
            lh();
            ra();
            throw null;
        }
        if (ouwVar.f11332cf == 784923401) {
            ouwVar.f11332cf = num.intValue();
        }
        int i10 = ouwVar.f11332cf;
        if (ouwVar.ryl == 784923401) {
            ouwVar.ryl = ouwVar.f11336lh.intValue();
        }
        return com.bytedance.adsdk.vt.le.ra.ouw(i10, ouwVar.ryl, f10);
    }

    public le(List<com.bytedance.adsdk.vt.ra.ouw<Integer>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        return Integer.valueOf(vt(ouwVar, f10));
    }

    public final int pno() {
        return vt(vt(), yu());
    }
}
