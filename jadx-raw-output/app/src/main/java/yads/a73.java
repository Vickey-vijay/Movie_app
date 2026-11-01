package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class a73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt2 f75432b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a73)) {
            return false;
        }
        a73 a73Var = (a73) obj;
        return ck.p.e(this.f75431a, a73Var.f75431a) && this.f75432b == a73Var.f75432b;
    }

    public final int hashCode() {
        String str = this.f75431a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        kt2 kt2Var = this.f75432b;
        return iHashCode + (kt2Var != null ? kt2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.f75431a + ", stubReason=" + this.f75432b + ")";
    }

    public a73(String str, kt2 kt2Var) {
        this.f75431a = str;
        this.f75432b = kt2Var;
    }
}
