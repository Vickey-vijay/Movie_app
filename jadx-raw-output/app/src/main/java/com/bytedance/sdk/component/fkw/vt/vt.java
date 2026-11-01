package com.bytedance.sdk.component.fkw.vt;

import com.bytedance.sdk.component.fkw.fkw;
import com.bytedance.sdk.component.fkw.jg;

/* JADX INFO: loaded from: classes8.dex */
public final class vt implements fkw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f11725lh;
    private String ouw;
    private boolean vt;
    private jg yu;

    @Override // com.bytedance.sdk.component.fkw.fkw
    public final boolean lh() {
        return this.f11725lh;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw
    public final String ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw
    public final boolean vt() {
        return this.vt;
    }

    public vt(String str, boolean z10, boolean z11, jg jgVar) {
        this.ouw = str;
        this.vt = z10;
        this.f11725lh = z11;
        this.yu = jgVar;
    }
}
