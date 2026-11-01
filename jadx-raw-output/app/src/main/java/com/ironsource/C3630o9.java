package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3630o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30354c;

    public C3630o9() {
        this(null, 0, null, 7, null);
    }

    public final String a() {
        return this.f30352a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3630o9)) {
            return false;
        }
        C3630o9 c3630o9 = (C3630o9) obj;
        return ck.p.e(this.f30352a, c3630o9.f30352a) && this.f30353b == c3630o9.f30353b && ck.p.e(this.f30354c, c3630o9.f30354c);
    }

    public C3630o9(String str, int i10, String str2) {
        ck.p.j(str, "instanceId");
        this.f30352a = str;
        this.f30353b = i10;
        this.f30354c = str2;
    }

    public final C3630o9 a(String str, int i10, String str2) {
        ck.p.j(str, "instanceId");
        return new C3630o9(str, i10, str2);
    }

    public final int b() {
        return this.f30353b;
    }

    public final String c() {
        return this.f30354c;
    }

    public final String d() {
        return this.f30354c;
    }

    public final String e() {
        return this.f30352a;
    }

    public final int f() {
        return this.f30353b;
    }

    public int hashCode() {
        int iHashCode = ((this.f30352a.hashCode() * 31) + Integer.hashCode(this.f30353b)) * 31;
        String str = this.f30354c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstanceInformation(instanceId=" + this.f30352a + ", instanceType=" + this.f30353b + ", dynamicDemandSourceId=" + this.f30354c + ")";
    }

    public static /* synthetic */ C3630o9 a(C3630o9 c3630o9, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c3630o9.f30352a;
        }
        if ((i11 & 2) != 0) {
            i10 = c3630o9.f30353b;
        }
        if ((i11 & 4) != 0) {
            str2 = c3630o9.f30354c;
        }
        return c3630o9.a(str, i10, str2);
    }

    public /* synthetic */ C3630o9(String str, int i10, String str2, int i11, ck.i iVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }
}
