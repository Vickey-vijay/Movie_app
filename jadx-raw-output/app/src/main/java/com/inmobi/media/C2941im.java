package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2941im implements qk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qk.c f24568a;

    public C2941im(qk.c cVar) {
        this.f24568a = cVar;
    }

    @Override // qk.c
    public final Object collect(qk.d dVar, rj.c cVar) {
        Object objCollect = this.f24568a.collect(new C2917hm(dVar), cVar);
        return objCollect == sj.a.f() ? objCollect : mj.r.f64562a;
    }
}
