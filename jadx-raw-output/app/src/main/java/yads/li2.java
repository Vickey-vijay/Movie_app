package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class li2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz2 f79803b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        return ck.p.e(this.f79802a, li2Var.f79802a) && ck.p.e(this.f79803b, li2Var.f79803b);
    }

    public final int hashCode() {
        return this.f79803b.hashCode() + (this.f79802a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.f79802a + ", size=" + this.f79803b + ")";
    }

    public li2(String str, yz2 yz2Var) {
        this.f79802a = str;
        this.f79803b = yz2Var;
    }
}
