package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f25938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25940c;

    public final C3621o0 a() {
        return this.f25938a;
    }

    public final String b() {
        return this.f25939b;
    }

    public abstract boolean d();

    public Aa(C3621o0 c3621o0) {
        ck.p.j(c3621o0, "adTools");
        this.f25938a = c3621o0;
        this.f25939b = "";
    }

    public final void a(String str) {
        ck.p.j(str, "<set-?>");
        this.f25939b = str;
    }

    public final void b(Runnable runnable) {
        ck.p.j(runnable, "callback");
        this.f25938a.e(runnable);
    }

    public final boolean c() {
        return this.f25940c;
    }

    public final void a(boolean z10) {
        this.f25940c = z10;
    }

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        this.f25938a.d(runnable);
    }

    public final void a(C3476g0 c3476g0) {
        ck.p.j(c3476g0, "adProperties");
        this.f25938a.e().a(new C0(this.f25938a, c3476g0, null, 4, null));
    }
}
