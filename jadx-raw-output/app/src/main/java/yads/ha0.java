package yads;

/* JADX INFO: loaded from: classes3.dex */
@xk.f
public final class ha0 {
    public static final ga0 Companion = new ga0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f78152b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return ck.p.e(this.f78151a, ha0Var.f78151a) && Double.compare(this.f78152b, ha0Var.f78152b) == 0;
    }

    public /* synthetic */ ha0(int i10, String str, double d10) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, fa0.f77340a.getDescriptor());
        }
        this.f78151a = str;
        this.f78152b = d10;
    }

    public final double a() {
        return this.f78152b;
    }

    public final String b() {
        return this.f78151a;
    }

    public final int hashCode() {
        return Double.hashCode(this.f78152b) + (this.f78151a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.f78151a + ", minCpm=" + this.f78152b + ")";
    }
}
