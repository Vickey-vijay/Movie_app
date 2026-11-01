package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class qu2 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f81976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm0 f81977b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu2)) {
            return false;
        }
        qu2 qu2Var = (qu2) obj;
        return ck.p.e(this.f81976a, qu2Var.f81976a) && ck.p.e(this.f81977b, qu2Var.f81977b);
    }

    public final int hashCode() {
        return this.f81977b.hashCode() + (this.f81976a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.f81976a + ", environmentConfiguration=" + this.f81977b + ")";
    }

    public qu2(rd rdVar, jm0 jm0Var) {
        this.f81976a = rdVar;
        this.f81977b = jm0Var;
    }
}
