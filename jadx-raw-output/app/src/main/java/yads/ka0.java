package yads;

/* JADX INFO: loaded from: classes8.dex */
@xk.f
public final class ka0 {
    public static final ja0 Companion = new ja0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79349b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return ck.p.e(this.f79348a, ka0Var.f79348a) && ck.p.e(this.f79349b, ka0Var.f79349b);
    }

    public /* synthetic */ ka0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            bl.o1.a(i10, 3, ia0.f78542a.getDescriptor());
        }
        this.f79348a = str;
        this.f79349b = str2;
    }

    public final int hashCode() {
        return this.f79349b.hashCode() + (this.f79348a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCurrency(name=" + this.f79348a + ", symbol=" + this.f79349b + ")";
    }
}
