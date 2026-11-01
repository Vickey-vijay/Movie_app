package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class h92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c83 f78125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb3 f78126b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h92)) {
            return false;
        }
        h92 h92Var = (h92) obj;
        return ck.p.e(this.f78125a, h92Var.f78125a) && ck.p.e(this.f78126b, h92Var.f78126b);
    }

    public final int hashCode() {
        return this.f78126b.hashCode() + (this.f78125a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f78125a + ", validationResult=" + this.f78126b + ")";
    }

    public h92(c83 c83Var, qb3 qb3Var) {
        this.f78125a = c83Var;
        this.f78126b = qb3Var;
    }
}
