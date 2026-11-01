package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fkw extends ra<com.bytedance.adsdk.vt.lh.vt.yu> {
    private final com.bytedance.adsdk.vt.lh.vt.yu fkw;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        com.bytedance.adsdk.vt.lh.vt.yu yuVar = this.fkw;
        com.bytedance.adsdk.vt.lh.vt.yu yuVar2 = (com.bytedance.adsdk.vt.lh.vt.yu) ouwVar.vt;
        com.bytedance.adsdk.vt.lh.vt.yu yuVar3 = (com.bytedance.adsdk.vt.lh.vt.yu) ouwVar.f11336lh;
        if (yuVar2.vt.length == yuVar3.vt.length) {
            for (int i10 = 0; i10 < yuVar2.vt.length; i10++) {
                yuVar.ouw[i10] = com.bytedance.adsdk.vt.le.ra.ouw(yuVar2.ouw[i10], yuVar3.ouw[i10], f10);
                yuVar.vt[i10] = com.bytedance.adsdk.vt.le.vt.ouw(f10, yuVar2.vt[i10], yuVar3.vt[i10]);
            }
            return this.fkw;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + yuVar2.vt.length + " vs " + yuVar3.vt.length + ")");
    }

    public fkw(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> list) {
        super(list);
        com.bytedance.adsdk.vt.lh.vt.yu yuVar = list.get(0).vt;
        int length = yuVar != null ? yuVar.vt.length : 0;
        this.fkw = new com.bytedance.adsdk.vt.lh.vt.yu(new float[length], new int[length]);
    }
}
