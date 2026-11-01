package yads;

/* JADX INFO: loaded from: classes8.dex */
@xk.f
public final class ih2 {
    public static final hh2 Companion = new hh2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh2 f78658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gi2 f78659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ai2 f78660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78661e;

    public /* synthetic */ ih2(int i10, String str, qh2 qh2Var, gi2 gi2Var, ai2 ai2Var, String str2) {
        if (31 != (i10 & 31)) {
            bl.o1.a(i10, 31, gh2.f77804a.getDescriptor());
        }
        this.f78657a = str;
        this.f78658b = qh2Var;
        this.f78659c = gi2Var;
        this.f78660d = ai2Var;
        this.f78661e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih2)) {
            return false;
        }
        ih2 ih2Var = (ih2) obj;
        return ck.p.e(this.f78657a, ih2Var.f78657a) && ck.p.e(this.f78658b, ih2Var.f78658b) && ck.p.e(this.f78659c, ih2Var.f78659c) && ck.p.e(this.f78660d, ih2Var.f78660d) && ck.p.e(this.f78661e, ih2Var.f78661e);
    }

    public ih2(String str, qh2 qh2Var, gi2 gi2Var, ai2 ai2Var, String str2) {
        this.f78657a = str;
        this.f78658b = qh2Var;
        this.f78659c = gi2Var;
        this.f78660d = ai2Var;
        this.f78661e = str2;
    }

    public final int hashCode() {
        int iHashCode = this.f78657a.hashCode() * 31;
        qh2 qh2Var = this.f78658b;
        int iHashCode2 = (iHashCode + (qh2Var == null ? 0 : qh2Var.hashCode())) * 31;
        gi2 gi2Var = this.f78659c;
        int iHashCode3 = (this.f78660d.hashCode() + ((iHashCode2 + (gi2Var == null ? 0 : gi2Var.hashCode())) * 31)) * 31;
        String str = this.f78661e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PrefetchedMediationInfo(adapter=" + this.f78657a + ", networkWinner=" + this.f78658b + ", revenue=" + this.f78659c + ", result=" + this.f78660d + ", networkAdInfo=" + this.f78661e + ")";
    }
}
