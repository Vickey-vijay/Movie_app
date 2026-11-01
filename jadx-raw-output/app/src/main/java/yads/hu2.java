package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class hu2 implements iu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt2 f78383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f78384b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu2)) {
            return false;
        }
        hu2 hu2Var = (hu2) obj;
        return ck.p.e(this.f78383a, hu2Var.f78383a) && this.f78384b == hu2Var.f78384b;
    }

    public final int hashCode() {
        return this.f78384b.hashCode() + (this.f78383a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.f78383a + ", configurationSource=" + this.f78384b + ")";
    }

    public hu2(nt2 nt2Var, xy xyVar) {
        this.f78383a = nt2Var;
        this.f78384b = xyVar;
    }
}
