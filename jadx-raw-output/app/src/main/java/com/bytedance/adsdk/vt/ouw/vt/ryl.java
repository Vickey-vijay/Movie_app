package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ryl extends ra<com.bytedance.adsdk.vt.ra.lh> {
    private final com.bytedance.adsdk.vt.ra.lh fkw;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        T t10;
        T t11 = ouwVar.vt;
        if (t11 == 0 || (t10 = ouwVar.f11336lh) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.vt.ra.lh lhVar = (com.bytedance.adsdk.vt.ra.lh) t11;
        com.bytedance.adsdk.vt.ra.lh lhVar2 = (com.bytedance.adsdk.vt.ra.lh) t10;
        if (this.yu != null) {
            ouwVar.pno.floatValue();
            lh();
            ra();
            throw null;
        }
        com.bytedance.adsdk.vt.ra.lh lhVar3 = this.fkw;
        float fOuw = com.bytedance.adsdk.vt.le.ra.ouw(lhVar.ouw, lhVar2.ouw, f10);
        float fOuw2 = com.bytedance.adsdk.vt.le.ra.ouw(lhVar.vt, lhVar2.vt, f10);
        lhVar3.ouw = fOuw;
        lhVar3.vt = fOuw2;
        return this.fkw;
    }

    public ryl(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.ra.lh>> list) {
        super(list);
        this.fkw = new com.bytedance.adsdk.vt.ra.lh();
    }
}
