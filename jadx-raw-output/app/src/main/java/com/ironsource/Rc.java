package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27553b;

    public Rc(String str, String str2) {
        ck.p.j(str, "url");
        this.f27552a = str;
        this.f27553b = str2;
    }

    public final String a() {
        return this.f27552a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc2 = (Rc) obj;
        return ck.p.e(this.f27552a, rc2.f27552a) && ck.p.e(this.f27553b, rc2.f27553b);
    }

    public /* synthetic */ Rc(String str, String str2, int i10, ck.i iVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public final Rc a(String str, String str2) {
        ck.p.j(str, "url");
        return new Rc(str, str2);
    }

    public final String b() {
        return this.f27553b;
    }

    public final String c() {
        return this.f27553b;
    }

    public final String d() {
        return this.f27552a;
    }

    public int hashCode() {
        int iHashCode = this.f27552a.hashCode() * 31;
        String str = this.f27553b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OpenUrl(url=" + this.f27552a + ", packageName=" + this.f27553b + ")";
    }

    public static /* synthetic */ Rc a(Rc rc2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rc2.f27552a;
        }
        if ((i10 & 2) != 0) {
            str2 = rc2.f27553b;
        }
        return rc2.a(str, str2);
    }
}
