package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7 f78927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7 f78928c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return this.f78926a == j7Var.f78926a && ck.p.e(this.f78927b, j7Var.f78927b) && this.f78928c == j7Var.f78928c;
    }

    public final long a() {
        return this.f78926a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f78926a) * 31;
        k7 k7Var = this.f78927b;
        int iHashCode2 = (iHashCode + (k7Var == null ? 0 : k7Var.hashCode())) * 31;
        l7 l7Var = this.f78928c;
        return iHashCode2 + (l7Var != null ? l7Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.f78926a + ", skip=" + this.f78927b + ", transitionPolicy=" + this.f78928c + ")";
    }

    public j7(long j10, k7 k7Var, l7 l7Var) {
        this.f78926a = j10;
        this.f78927b = k7Var;
        this.f78928c = l7Var;
    }
}
