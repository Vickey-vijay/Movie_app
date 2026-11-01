package yads;

/* JADX INFO: loaded from: classes10.dex */
@xk.f
public final class p50 {
    public static final o50 Companion = new o50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81257b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return ck.p.e(this.f81256a, p50Var.f81256a) && ck.p.e(this.f81257b, p50Var.f81257b);
    }

    public /* synthetic */ p50(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, n50.f80560a.getDescriptor());
        }
        this.f81256a = str;
        this.f81257b = str2;
    }

    public final int hashCode() {
        return this.f81257b.hashCode() + (this.f81256a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelBiddingParameter(name=" + this.f81256a + ", value=" + this.f81257b + ")";
    }
}
