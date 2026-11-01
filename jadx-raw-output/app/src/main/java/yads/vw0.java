package yads;

/* JADX INFO: loaded from: classes7.dex */
@xk.f
public final class vw0 {
    public static final uw0 Companion = new uw0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx0 f84023a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw0) && ck.p.e(this.f84023a, ((vw0) obj).f84023a);
    }

    public /* synthetic */ vw0(int i10, dx0 dx0Var) {
        if (1 != (i10 & 1)) {
            bl.o1.a(i10, 1, tw0.f83214a.getDescriptor());
        }
        this.f84023a = dx0Var;
    }

    public final int hashCode() {
        dx0 dx0Var = this.f84023a;
        if (dx0Var == null) {
            return 0;
        }
        return dx0Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.f84023a + ")";
    }
}
