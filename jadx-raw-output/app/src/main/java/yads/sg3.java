package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class sg3 extends ug3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be3 f82642a;

    public sg3(be3 be3Var) {
        super(0);
        this.f82642a = be3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg3) && ck.p.e(this.f82642a, ((sg3) obj).f82642a);
    }

    public final int hashCode() {
        return this.f82642a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f82642a + ")";
    }
}
