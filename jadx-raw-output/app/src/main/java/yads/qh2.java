package yads;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class qh2 {
    public static final ph2 Companion = new ph2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81853b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh2)) {
            return false;
        }
        qh2 qh2Var = (qh2) obj;
        return ck.p.e(this.f81852a, qh2Var.f81852a) && ck.p.e(this.f81853b, qh2Var.f81853b);
    }

    public /* synthetic */ qh2(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, oh2.f81046a.getDescriptor());
        }
        this.f81852a = str;
        this.f81853b = str2;
    }

    public final int hashCode() {
        return this.f81853b.hashCode() + (this.f81852a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchedMediationNetworkWinner(networkName=" + this.f81852a + ", networkAdUnit=" + this.f81853b + ")";
    }
}
