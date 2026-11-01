package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class zk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85468b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) obj;
        return this.f85467a == zk3Var.f85467a && this.f85468b == zk3Var.f85468b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85468b) + (Integer.hashCode(this.f85467a) * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f85467a + ", height=" + this.f85468b + ")";
    }

    public zk3(int i10, int i11) {
        this.f85467a = i10;
        this.f85468b = i11;
    }
}
