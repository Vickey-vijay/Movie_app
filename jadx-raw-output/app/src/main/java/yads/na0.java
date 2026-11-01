package yads;

/* JADX INFO: loaded from: classes5.dex */
@xk.f
public final class na0 {
    public static final ma0 Companion = new ma0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80613b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return ck.p.e(this.f80612a, na0Var.f80612a) && ck.p.e(this.f80613b, na0Var.f80613b);
    }

    public /* synthetic */ na0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, la0.f79737a.getDescriptor());
        }
        this.f80612a = str;
        this.f80613b = str2;
    }

    public final int hashCode() {
        return this.f80613b.hashCode() + (this.f80612a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallParameter(name=" + this.f80612a + ", value=" + this.f80613b + ")";
    }
}
