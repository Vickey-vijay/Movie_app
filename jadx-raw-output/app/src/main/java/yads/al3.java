package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class al3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75561b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al3)) {
            return false;
        }
        al3 al3Var = (al3) obj;
        return this.f75560a == al3Var.f75560a && this.f75561b == al3Var.f75561b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75561b) + (Integer.hashCode(this.f75560a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f75560a + ", height=" + this.f75561b + ")";
    }

    public al3(int i10, int i11) {
        this.f75560a = i10;
        this.f75561b = i11;
    }
}
