package yads;

/* JADX INFO: loaded from: classes6.dex */
@xk.f
public final class t50 {
    public static final s50 Companion = new s50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f82884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f82885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f82886d;

    public /* synthetic */ t50(int i10, boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        if (15 != (i10 & 15)) {
            bl.o1.a(i10, 15, r50.f82102a.getDescriptor());
        }
        this.f82883a = z10;
        this.f82884b = bool;
        this.f82885c = bool2;
        this.f82886d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return this.f82883a == t50Var.f82883a && ck.p.e(this.f82884b, t50Var.f82884b) && ck.p.e(this.f82885c, t50Var.f82885c) && this.f82886d == t50Var.f82886d;
    }

    public t50(boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        this.f82883a = z10;
        this.f82884b = bool;
        this.f82885c = bool2;
        this.f82886d = z11;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f82883a) * 31;
        Boolean bool = this.f82884b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f82885c;
        return Boolean.hashCode(this.f82886d) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.f82883a + ", ageRestrictedUser=" + this.f82884b + ", hasUserConsent=" + this.f82885c + ", hasCmpValue=" + this.f82886d + ")";
    }
}
