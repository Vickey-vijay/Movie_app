package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27622b;

    /* JADX WARN: Multi-variable type inference failed */
    public Sc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.f27621a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sc)) {
            return false;
        }
        Sc sc2 = (Sc) obj;
        return this.f27621a == sc2.f27621a && this.f27622b == sc2.f27622b;
    }

    public Sc(boolean z10, int i10) {
        this.f27621a = z10;
        this.f27622b = i10;
    }

    public final Sc a(boolean z10, int i10) {
        return new Sc(z10, i10);
    }

    public final int b() {
        return this.f27622b;
    }

    public final int c() {
        return this.f27622b;
    }

    public final boolean d() {
        return this.f27621a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f27621a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return (r10 * 31) + Integer.hashCode(this.f27622b);
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f27621a + ", flags=" + this.f27622b + ")";
    }

    public static /* synthetic */ Sc a(Sc sc2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = sc2.f27621a;
        }
        if ((i11 & 2) != 0) {
            i10 = sc2.f27622b;
        }
        return sc2.a(z10, i10);
    }

    public /* synthetic */ Sc(boolean z10, int i10, int i11, ck.i iVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 805306368 : i10);
    }
}
