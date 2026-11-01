package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26435c;

    public final String a() {
        return this.f26433a;
    }

    public final String b() {
        return this.f26434b;
    }

    public final String c() {
        return this.f26435c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e10 = (E3) obj;
        return ck.p.e(this.f26433a, e10.f26433a) && ck.p.e(this.f26434b, e10.f26434b) && ck.p.e(this.f26435c, e10.f26435c);
    }

    public E3(String str, String str2, String str3) {
        ck.p.j(str, "cachedAppKey");
        ck.p.j(str2, "cachedUserId");
        ck.p.j(str3, "cachedSettings");
        this.f26433a = str;
        this.f26434b = str2;
        this.f26435c = str3;
    }

    public final E3 a(String str, String str2, String str3) {
        ck.p.j(str, "cachedAppKey");
        ck.p.j(str2, "cachedUserId");
        ck.p.j(str3, "cachedSettings");
        return new E3(str, str2, str3);
    }

    public final void b(String str) {
        ck.p.j(str, "<set-?>");
        this.f26435c = str;
    }

    public final void c(String str) {
        ck.p.j(str, "<set-?>");
        this.f26434b = str;
    }

    public final String d() {
        return this.f26433a;
    }

    public final String e() {
        return this.f26435c;
    }

    public final String f() {
        return this.f26434b;
    }

    public int hashCode() {
        return (((this.f26433a.hashCode() * 31) + this.f26434b.hashCode()) * 31) + this.f26435c.hashCode();
    }

    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f26433a + ", cachedUserId=" + this.f26434b + ", cachedSettings=" + this.f26435c + ")";
    }

    public static /* synthetic */ E3 a(E3 e10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = e10.f26433a;
        }
        if ((i10 & 2) != 0) {
            str2 = e10.f26434b;
        }
        if ((i10 & 4) != 0) {
            str3 = e10.f26435c;
        }
        return e10.a(str, str2, str3);
    }

    public final void a(String str) {
        ck.p.j(str, "<set-?>");
        this.f26433a = str;
    }
}
