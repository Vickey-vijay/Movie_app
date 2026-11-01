package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class jj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kj1 f79067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj1 f79068b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj1)) {
            return false;
        }
        jj1 jj1Var = (jj1) obj;
        return ck.p.e(this.f79067a, jj1Var.f79067a) && ck.p.e(this.f79068b, jj1Var.f79068b);
    }

    public final int hashCode() {
        return this.f79068b.hashCode() + (this.f79067a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.f79067a + ", height=" + this.f79068b + ")";
    }

    public jj1(kj1 kj1Var, kj1 kj1Var2) {
        this.f79067a = kj1Var;
        this.f79068b = kj1Var2;
    }
}
