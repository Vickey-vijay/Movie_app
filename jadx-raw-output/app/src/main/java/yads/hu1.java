package yads;

/* JADX INFO: loaded from: classes2.dex */
@xk.f
public final class hu1 {
    public static final gu1 Companion = new gu1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mu1 f78381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu1 f78382b;

    public /* synthetic */ hu1(int i10, mu1 mu1Var, pu1 pu1Var) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, fu1.f77496a.getDescriptor());
        }
        this.f78381a = mu1Var;
        this.f78382b = pu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu1)) {
            return false;
        }
        hu1 hu1Var = (hu1) obj;
        return ck.p.e(this.f78381a, hu1Var.f78381a) && ck.p.e(this.f78382b, hu1Var.f78382b);
    }

    public hu1(mu1 mu1Var, pu1 pu1Var) {
        this.f78381a = mu1Var;
        this.f78382b = pu1Var;
    }

    public final int hashCode() {
        int iHashCode = this.f78381a.hashCode() * 31;
        pu1 pu1Var = this.f78382b;
        return iHashCode + (pu1Var == null ? 0 : pu1Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.f78381a + ", response=" + this.f78382b + ")";
    }
}
