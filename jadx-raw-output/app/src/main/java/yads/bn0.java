package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class bn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cn0 f75908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75909b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return this.f75908a == bn0Var.f75908a && ck.p.e(this.f75909b, bn0Var.f75909b);
    }

    public final int hashCode() {
        return this.f75909b.hashCode() + (this.f75908a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.f75908a + ", value=" + this.f75909b + ")";
    }

    public bn0(cn0 cn0Var, String str) {
        this.f75908a = cn0Var;
        this.f75909b = str;
    }
}
