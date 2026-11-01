package yads;

/* JADX INFO: loaded from: classes11.dex */
@xk.f
public final class gi2 {
    public static final fi2 Companion = new fi2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f77815a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi2) && Double.compare(this.f77815a, ((gi2) obj).f77815a) == 0;
    }

    public /* synthetic */ gi2(int i10, double d10) {
        if (1 != (i10 & 1)) {
            bl.o1.a(i10, 1, ei2.f77086a.getDescriptor());
        }
        this.f77815a = d10;
    }

    public final int hashCode() {
        return Double.hashCode(this.f77815a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.f77815a + ")";
    }
}
