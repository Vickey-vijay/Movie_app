package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class fkw implements lh {
    private final com.bytedance.adsdk.vt.lh.ouw.vt bly;
    public final com.bytedance.adsdk.vt.lh.ouw.le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.le f11201le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.lh f11202lh;
    public final ra ouw;
    public final boolean pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f11203ra;
    private final com.bytedance.adsdk.vt.lh.ouw.vt tlj;
    public final Path.FillType vt;
    public final com.bytedance.adsdk.vt.lh.ouw.yu yu;

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.pno(blyVar, raVar, ouwVar, this);
    }

    public fkw(String str, ra raVar, Path.FillType fillType, com.bytedance.adsdk.vt.lh.ouw.lh lhVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, com.bytedance.adsdk.vt.lh.ouw.le leVar, com.bytedance.adsdk.vt.lh.ouw.le leVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, boolean z10) {
        this.ouw = raVar;
        this.vt = fillType;
        this.f11202lh = lhVar;
        this.yu = yuVar;
        this.fkw = leVar;
        this.f11201le = leVar2;
        this.f11203ra = str;
        this.bly = vtVar;
        this.tlj = vtVar2;
        this.pno = z10;
    }
}
