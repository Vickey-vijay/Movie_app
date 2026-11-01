package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3597me implements L8, L8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3579le f29510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29511b;

    @Override // com.ironsource.L8
    public C3379ab a() {
        C3579le c3579le = this.f29510a;
        if (c3579le != null) {
            return new C3379ab(c3579le);
        }
        return null;
    }

    @Override // com.ironsource.L8.a
    public void d() {
        this.f29511b = true;
    }

    @Override // com.ironsource.L8.a
    public void a(C3579le c3579le) {
        ck.p.j(c3579le, "sdkConfig");
        this.f29510a = c3579le;
    }

    @Override // com.ironsource.L8
    public Q9 b() {
        C3579le c3579le = this.f29510a;
        if (c3579le != null) {
            return new Q9(c3579le);
        }
        return null;
    }

    @Override // com.ironsource.L8
    public boolean c() {
        return this.f29511b;
    }
}
