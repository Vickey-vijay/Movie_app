package com.bytedance.adsdk.vt.lh.vt;

/* JADX INFO: loaded from: classes9.dex */
public final class pno {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.yu f11211lh;
    public final ouw ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.pno vt;
    public final boolean yu;

    public enum ouw {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public pno(ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.pno pnoVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, boolean z10) {
        this.ouw = ouwVar;
        this.vt = pnoVar;
        this.f11211lh = yuVar;
        this.yu = z10;
    }
}
