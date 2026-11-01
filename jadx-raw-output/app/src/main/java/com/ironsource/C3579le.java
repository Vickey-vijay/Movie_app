package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3579le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3737ue f29407a;

    public C3579le(C3737ue c3737ue) {
        ck.p.j(c3737ue, "sdkInitResponse");
        this.f29407a = c3737ue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3579le(C3579le c3579le) {
        this(c3579le.f29407a);
        ck.p.j(c3579le, "sdkConfig");
    }

    public final K1 a() {
        return this.f29407a.a().b().d();
    }

    public final D1 b() {
        return this.f29407a.a().b().b();
    }

    public final Q5 c() {
        return this.f29407a.b();
    }

    public final Ne d() {
        return this.f29407a.c();
    }

    public final Hb e() {
        return this.f29407a.a().b().f();
    }

    public final Ne.a f() {
        Ne.a aVarI = this.f29407a.c().i();
        ck.p.i(aVarI, "sdkInitResponse.fullResponse.origin");
        return aVarI;
    }

    public final C3737ue g() {
        return this.f29407a;
    }
}
