package com.bytedance.adsdk.vt.lh.vt;

import com.bytedance.adsdk.vt.ouw.ouw.zin;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;

/* JADX INFO: loaded from: classes5.dex */
public final class th implements lh {
    public final com.bytedance.adsdk.vt.lh.ouw.vt fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final boolean f11216le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f11217lh;
    public final String ouw;
    public final ouw vt;
    public final com.bytedance.adsdk.vt.lh.ouw.vt yu;

    public enum ouw {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static ouw ouw(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new zin(ouwVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f11217lh + ", end: " + this.yu + ", offset: " + this.fkw + h.f44172e;
    }

    public th(String str, ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar3, boolean z10) {
        this.ouw = str;
        this.vt = ouwVar;
        this.f11217lh = vtVar;
        this.yu = vtVar2;
        this.fkw = vtVar3;
        this.f11216le = z10;
    }
}
