package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class Dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f22549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22550b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dn)) {
            return false;
        }
        Dn dn2 = (Dn) obj;
        return ck.p.e(this.f22549a, dn2.f22549a) && this.f22550b == dn2.f22550b;
    }

    public Dn(nk.l0 l0Var, int i10) {
        ck.p.j(l0Var, "coroutineScope");
        this.f22549a = l0Var;
        this.f22550b = i10;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22550b) + (this.f22549a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.f22549a + ", impressionMinDuration=" + this.f22550b + ")";
    }
}
