package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class r90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82148c;

    public r90(String str, String str2, String str3) {
        super(0);
        this.f82146a = str;
        this.f82147b = str2;
        this.f82148c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return ck.p.e(this.f82146a, r90Var.f82146a) && ck.p.e(this.f82147b, r90Var.f82147b) && ck.p.e(this.f82148c, r90Var.f82148c);
    }

    public final int hashCode() {
        return this.f82148c.hashCode() + k4.a(this.f82147b, this.f82146a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnit(name=" + this.f82146a + ", format=" + this.f82147b + ", id=" + this.f82148c + ")";
    }
}
