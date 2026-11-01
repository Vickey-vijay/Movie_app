package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class o01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg2 f80880b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o01)) {
            return false;
        }
        o01 o01Var = (o01) obj;
        return this.f80879a == o01Var.f80879a && ck.p.e(this.f80880b, o01Var.f80880b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f80879a) * 31;
        sg2 sg2Var = this.f80880b;
        return iHashCode + (sg2Var == null ? 0 : sg2Var.hashCode());
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f80879a + ", handledPackage=" + this.f80880b + ")";
    }

    public o01(boolean z10, sg2 sg2Var) {
        this.f80879a = z10;
        this.f80880b = sg2Var;
    }
}
