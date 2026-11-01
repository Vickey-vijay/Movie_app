package com.bytedance.adsdk.vt.lh.vt;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rn implements lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f11214lh;
    public final String ouw;
    public final List<lh> vt;

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.yu(blyVar, ouwVar, this, raVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.ouw + "' Shapes: " + Arrays.toString(this.vt.toArray()) + '}';
    }

    public rn(String str, List<lh> list, boolean z10) {
        this.ouw = str;
        this.vt = list;
        this.f11214lh = z10;
    }
}
