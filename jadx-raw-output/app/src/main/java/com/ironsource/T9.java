package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class T9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27683b;

    public final String a() {
        return this.f27682a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9)) {
            return false;
        }
        T9 t10 = (T9) obj;
        return ck.p.e(this.f27682a, t10.f27682a) && ck.p.e(this.f27683b, t10.f27683b);
    }

    public T9(String str, String str2) {
        ck.p.j(str, "advId");
        ck.p.j(str2, "advIdType");
        this.f27682a = str;
        this.f27683b = str2;
    }

    public final T9 a(String str, String str2) {
        ck.p.j(str, "advId");
        ck.p.j(str2, "advIdType");
        return new T9(str, str2);
    }

    public final String b() {
        return this.f27683b;
    }

    public final String c() {
        return this.f27682a;
    }

    public final String d() {
        return this.f27683b;
    }

    public int hashCode() {
        return (this.f27682a.hashCode() * 31) + this.f27683b.hashCode();
    }

    public String toString() {
        return "IronSourceAdvId(advId=" + this.f27682a + ", advIdType=" + this.f27683b + ")";
    }

    public static /* synthetic */ T9 a(T9 t10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = t10.f27682a;
        }
        if ((i10 & 2) != 0) {
            str2 = t10.f27683b;
        }
        return t10.a(str, str2);
    }
}
