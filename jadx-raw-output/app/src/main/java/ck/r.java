package ck;

/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f6060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6061c;

    public r(Class<?> cls, String str) {
        p.j(cls, "jClass");
        p.j(str, "moduleName");
        this.f6060b = cls;
        this.f6061c = str;
    }

    @Override // ck.f
    public Class<?> a() {
        return this.f6060b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && p.e(a(), ((r) obj).a());
    }

    public String toString() {
        return a() + " (Kotlin reflection is not available)";
    }

    public int hashCode() {
        return a().hashCode();
    }
}
