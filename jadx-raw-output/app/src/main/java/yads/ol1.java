package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class ol1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl1 f81097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl1 f81098b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1Var = (ol1) obj;
        return ck.p.e(this.f81097a, ol1Var.f81097a) && ck.p.e(this.f81098b, ol1Var.f81098b);
    }

    public final int hashCode() {
        int iHashCode = this.f81097a.hashCode() * 31;
        kl1 kl1Var = this.f81098b;
        return iHashCode + (kl1Var == null ? 0 : kl1Var.hashCode());
    }

    public final String toString() {
        return "MediaFileWithFallback(target=" + this.f81097a + ", fallback=" + this.f81098b + ")";
    }

    public ol1(kl1 kl1Var, kl1 kl1Var2) {
        this.f81097a = kl1Var;
        this.f81098b = kl1Var2;
    }
}
