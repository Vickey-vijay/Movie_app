package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3395b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private W f28224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28227f;

    public final String a() {
        return this.f28222a;
    }

    public final String b() {
        return this.f28223b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3395b9)) {
            return false;
        }
        C3395b9 c3395b9 = (C3395b9) obj;
        return ck.p.e(this.f28222a, c3395b9.f28222a) && ck.p.e(this.f28223b, c3395b9.f28223b);
    }

    public C3395b9(String str, String str2) {
        ck.p.j(str, "appKey");
        ck.p.j(str2, "userId");
        this.f28222a = str;
        this.f28223b = str2;
    }

    public final C3395b9 a(String str, String str2) {
        ck.p.j(str, "appKey");
        ck.p.j(str2, "userId");
        return new C3395b9(str, str2);
    }

    public final void b(String str) {
        this.f28226e = str;
    }

    public final boolean c() {
        return this.f28225d;
    }

    public final String d() {
        return this.f28222a;
    }

    public final W e() {
        return this.f28224c;
    }

    public final String f() {
        return this.f28227f;
    }

    public final String g() {
        return this.f28226e;
    }

    public final String h() {
        return this.f28223b;
    }

    public int hashCode() {
        return (this.f28222a.hashCode() * 31) + this.f28223b.hashCode();
    }

    public String toString() {
        return "InitConfig(appKey=" + this.f28222a + ", userId=" + this.f28223b + ")";
    }

    public static /* synthetic */ C3395b9 a(C3395b9 c3395b9, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3395b9.f28222a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3395b9.f28223b;
        }
        return c3395b9.a(str, str2);
    }

    public final void a(W w10) {
        this.f28224c = w10;
    }

    public final void a(boolean z10) {
        this.f28225d = z10;
    }

    public final void a(String str) {
        this.f28227f = str;
    }

    public final <T> T a(Kb<C3395b9, T> kb2) {
        ck.p.j(kb2, "mapper");
        return kb2.a(this);
    }
}
