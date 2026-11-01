package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class o70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y90 f80955b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && ck.p.e(this.f80955b, ((o70) obj).f80955b);
    }

    public final int hashCode() {
        return this.f80955b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.f80955b + ")";
    }

    public o70(y90 y90Var) {
        super(y90Var.c(), 0);
        this.f80955b = y90Var;
    }
}
