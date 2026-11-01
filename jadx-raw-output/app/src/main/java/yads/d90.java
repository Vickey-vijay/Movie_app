package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class d90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y90 f76600a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d90) && ck.p.e(this.f76600a, ((d90) obj).f76600a);
    }

    public final int hashCode() {
        return this.f76600a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.f76600a + ")";
    }

    public d90(y90 y90Var) {
        this.f76600a = y90Var;
    }
}
