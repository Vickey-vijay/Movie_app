package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class yz2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85157c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz2)) {
            return false;
        }
        yz2 yz2Var = (yz2) obj;
        return this.f85156b == yz2Var.f85156b && this.f85157c == yz2Var.f85157c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yz2 yz2Var = (yz2) obj;
        return ck.p.l(this.f85156b * this.f85157c, yz2Var.f85156b * yz2Var.f85157c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85157c) + (Integer.hashCode(this.f85156b) * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f85156b + ", height=" + this.f85157c + ")";
    }

    public yz2(int i10, int i11) {
        this.f85156b = i10;
        this.f85157c = i11;
    }
}
