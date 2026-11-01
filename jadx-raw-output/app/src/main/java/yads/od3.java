package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class od3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81009d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od3)) {
            return false;
        }
        od3 od3Var = (od3) obj;
        return this.f81007b == od3Var.f81007b && this.f81008c == od3Var.f81008c && this.f81009d == od3Var.f81009d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(od3 od3Var) {
        int i10 = this.f81007b;
        int i11 = od3Var.f81007b;
        if (i10 != i11) {
            return ck.p.l(i10, i11);
        }
        int i12 = this.f81008c;
        int i13 = od3Var.f81008c;
        return i12 != i13 ? ck.p.l(i12, i13) : ck.p.l(this.f81009d, od3Var.f81009d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81009d) + nd3.a(this.f81008c, Integer.hashCode(this.f81007b) * 31, 31);
    }

    public final String toString() {
        return this.f81007b + "." + this.f81008c + "." + this.f81009d;
    }

    public od3(int i10, int i11, int i12) {
        this.f81007b = i10;
        this.f81008c = i11;
        this.f81009d = i12;
    }
}
