package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public final class Of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27296a;

    /* JADX WARN: Multi-variable type inference failed */
    public Of() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f27296a;
    }

    public final String b() {
        return this.f27296a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Of) && ck.p.e(this.f27296a, ((Of) obj).f27296a);
    }

    public Of(String str) {
        this.f27296a = str;
    }

    public final Of a(String str) {
        return new Of(str);
    }

    public final void b(String str) {
        this.f27296a = str;
    }

    public int hashCode() {
        String str = this.f27296a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f27296a + ")";
    }

    public /* synthetic */ Of(String str, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Of a(Of of2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = of2.f27296a;
        }
        return of2.a(str);
    }
}
