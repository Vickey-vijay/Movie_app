package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class pu2 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f81605a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu2) && ck.p.e(this.f81605a, ((pu2) obj).f81605a);
    }

    public final int hashCode() {
        return this.f81605a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f81605a + ")";
    }

    public pu2(l4 l4Var) {
        this.f81605a = l4Var;
    }
}
