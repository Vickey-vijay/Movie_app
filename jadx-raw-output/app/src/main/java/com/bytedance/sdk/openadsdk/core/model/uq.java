package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.fak;

/* JADX INFO: loaded from: classes3.dex */
public final class uq {
    public boolean bly;
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f12834le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f12835lh;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f12836ra;
    public long tlj;
    public long vt;
    public long yu;
    public fak ouw = fak.vt();

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private fak f12833cf = fak.vt();

    public final void ouw(fak fakVar, fak fakVar2, int i10, fak fakVar3) {
        this.vt = fakVar.ouw(this.ouw);
        this.f12835lh = fakVar2.ouw(fakVar);
        this.yu = i10;
        this.fkw = fakVar3.ouw(fakVar2);
    }

    public final void ouw(fak fakVar) {
        this.f12833cf = fakVar;
        this.f12834le = fakVar.ouw(this.ouw);
    }
}
