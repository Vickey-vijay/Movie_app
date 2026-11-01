package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.Path;

/* JADX INFO: loaded from: classes8.dex */
public final class ko implements lh {
    public final boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final boolean f11205le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.ouw f11206lh;
    public final Path.FillType ouw;
    public final String vt;
    public final com.bytedance.adsdk.vt.lh.ouw.yu yu;

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.ra(blyVar, ouwVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f11205le + '}';
    }

    public ko(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, boolean z11) {
        this.vt = str;
        this.f11205le = z10;
        this.ouw = fillType;
        this.f11206lh = ouwVar;
        this.yu = yuVar;
        this.fkw = z11;
    }
}
