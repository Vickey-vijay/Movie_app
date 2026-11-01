package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p03 f79321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r03 f79322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79323c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.f79321a == k7Var.f79321a && this.f79322b == k7Var.f79322b && this.f79323c == k7Var.f79323c;
    }

    public final int hashCode() {
        p03 p03Var = this.f79321a;
        int iHashCode = (p03Var == null ? 0 : p03Var.hashCode()) * 31;
        r03 r03Var = this.f79322b;
        return Long.hashCode(this.f79323c) + ((iHashCode + (r03Var != null ? r03Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdPodSkip(transitionStrategy=" + this.f79321a + ", visibility=" + this.f79322b + ", delay=" + this.f79323c + ")";
    }

    public k7(p03 p03Var, r03 r03Var, long j10) {
        this.f79321a = p03Var;
        this.f79322b = r03Var;
        this.f79323c = j10;
    }
}
