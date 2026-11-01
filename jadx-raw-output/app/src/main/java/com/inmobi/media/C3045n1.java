package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3045n1 extends kotlin.coroutines.a implements nk.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3070o1 f24867a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3045n1(nk.i0.b bVar, C3070o1 c3070o1) {
        super(bVar);
        this.f24867a = c3070o1;
    }

    @Override // nk.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        C3053n9 c3053n9 = this.f24867a.f24939c;
        if (c3053n9 != null) {
            c3053n9.b("AdUnitManager", "Exception: " + mj.d.b(th2));
        }
        mj.g gVar = P9.f23321a;
        P9.a(new L2(th2));
    }
}
