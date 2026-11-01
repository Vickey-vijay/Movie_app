package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class vt extends ra<Integer> {
    private int vt(com.bytedance.adsdk.vt.ra.ouw<Integer> ouwVar, float f10) {
        if (ouwVar.vt == null || ouwVar.f11336lh == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.yu == null) {
            return com.bytedance.adsdk.vt.le.vt.ouw(com.bytedance.adsdk.vt.le.ra.vt(f10, 0.0f, 1.0f), ouwVar.vt.intValue(), ouwVar.f11336lh.intValue());
        }
        ouwVar.pno.floatValue();
        lh();
        ra();
        throw null;
    }

    public vt(List<com.bytedance.adsdk.vt.ra.ouw<Integer>> list) {
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
