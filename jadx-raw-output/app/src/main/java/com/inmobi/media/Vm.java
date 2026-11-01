package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Vm implements qk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.l f23716a;

    public Vm(qk.l lVar) {
        this.f23716a = lVar;
    }

    @Override // qk.c
    public final Object collect(qk.d dVar, rj.c cVar) {
        Object objCollect = this.f23716a.collect(new Um(dVar), cVar);
        return objCollect == sj.a.f() ? objCollect : mj.r.f64562a;
    }
}
