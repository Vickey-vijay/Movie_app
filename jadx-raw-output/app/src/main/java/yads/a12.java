package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class a12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f75362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v42 f75363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo2 f75364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75365d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a12)) {
            return false;
        }
        a12 a12Var = (a12) obj;
        return ck.p.e(this.f75362a, a12Var.f75362a) && this.f75363b == a12Var.f75363b && ck.p.e(this.f75364c, a12Var.f75364c) && this.f75365d == a12Var.f75365d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75365d) + ((this.f75364c.hashCode() + ((this.f75363b.hashCode() + (this.f75362a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.f75362a + ", nativeResponseType=" + this.f75363b + ", requestPolicy=" + this.f75364c + ", adsCount=" + this.f75365d + ")";
    }

    public a12(g9 g9Var, v42 v42Var, b12 b12Var, int i10) {
        this.f75362a = g9Var;
        this.f75363b = v42Var;
        this.f75364c = b12Var;
        this.f75365d = i10;
    }
}
