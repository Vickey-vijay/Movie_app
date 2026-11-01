package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class oq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81127b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq1)) {
            return false;
        }
        oq1 oq1Var = (oq1) obj;
        return ck.p.e(this.f81126a, oq1Var.f81126a) && ck.p.e(this.f81127b, oq1Var.f81127b);
    }

    public final int hashCode() {
        return this.f81127b.hashCode() + (this.f81126a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationAdapterSignature(format=" + this.f81126a + ", className=" + this.f81127b + ")";
    }

    public oq1(String str, String str2) {
        this.f81126a = str;
        this.f81127b = str2;
    }
}
