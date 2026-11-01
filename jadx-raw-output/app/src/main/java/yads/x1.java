package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f84404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f84405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9 f84406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu2 f84407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w02 f84408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qf0 f84410g;

    public x1(v9 v9Var, d4 d4Var, z9 z9Var, lu2 lu2Var, w02 w02Var, int i10, qf0 qf0Var) {
        this.f84404a = v9Var;
        this.f84405b = d4Var;
        this.f84406c = z9Var;
        this.f84407d = lu2Var;
        this.f84408e = w02Var;
        this.f84409f = i10;
        this.f84410g = qf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return ck.p.e(this.f84404a, x1Var.f84404a) && ck.p.e(this.f84405b, x1Var.f84405b) && ck.p.e(this.f84406c, x1Var.f84406c) && ck.p.e(this.f84407d, x1Var.f84407d) && ck.p.e(this.f84408e, x1Var.f84408e) && this.f84409f == x1Var.f84409f && ck.p.e(this.f84410g, x1Var.f84410g);
    }

    public final int hashCode() {
        int iHashCode = (this.f84407d.hashCode() + ((this.f84406c.hashCode() + ((this.f84405b.hashCode() + (this.f84404a.hashCode() * 31)) * 31)) * 31)) * 31;
        w02 w02Var = this.f84408e;
        int iA = nd3.a(this.f84409f, (iHashCode + (w02Var == null ? 0 : w02Var.hashCode())) * 31, 31);
        qf0 qf0Var = this.f84410g;
        return iA + (qf0Var != null ? qf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.f84404a + ", adConfiguration=" + this.f84405b + ", adResultReceiver=" + this.f84406c + ", sdkEnvironmentModule=" + this.f84407d + ", nativeAd=" + this.f84408e + ", requestedOrientation=" + this.f84409f + ", delegatedActivityLaunchInfo=" + this.f84410g + ")";
    }

    public /* synthetic */ x1(v9 v9Var, d4 d4Var, z9 z9Var, lu2 lu2Var, w02 w02Var, int i10, qf0 qf0Var, int i11) {
        this(v9Var, d4Var, z9Var, lu2Var, (i11 & 16) != 0 ? null : w02Var, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? null : qf0Var);
    }
}
