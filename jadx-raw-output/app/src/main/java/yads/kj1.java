package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj1 f79428b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return this.f79427a == kj1Var.f79427a && this.f79428b == kj1Var.f79428b;
    }

    public final int hashCode() {
        return this.f79428b.hashCode() + (Integer.hashCode(this.f79427a) * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.f79427a + ", mode=" + this.f79428b + ")";
    }

    public kj1(int i10, lj1 lj1Var) {
        this.f79427a = i10;
        this.f79428b = lj1Var;
    }
}
