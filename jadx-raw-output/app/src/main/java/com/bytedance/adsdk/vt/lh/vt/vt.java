package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes4.dex */
public final class vt implements lh {
    public final boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.le f11229lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> vt;
    public final boolean yu;

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.le(blyVar, ouwVar, this);
    }

    public vt(String str, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar, com.bytedance.adsdk.vt.lh.ouw.le leVar, boolean z10, boolean z11) {
        this.ouw = str;
        this.vt = mwhVar;
        this.f11229lh = leVar;
        this.yu = z10;
        this.fkw = z11;
    }
}
