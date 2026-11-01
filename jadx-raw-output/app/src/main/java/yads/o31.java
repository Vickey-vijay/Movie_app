package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class o31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80924b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o31)) {
            return false;
        }
        o31 o31Var = (o31) obj;
        return this.f80923a == o31Var.f80923a && this.f80924b == o31Var.f80924b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80924b) + (Integer.hashCode(this.f80923a) * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f80923a + ", height=" + this.f80924b + ")";
    }

    public o31(int i10, int i11) {
        this.f80923a = i10;
        this.f80924b = i11;
    }
}
