package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26839c;

    public final long a() {
        return this.f26837a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ia)) {
            return false;
        }
        Ia ia2 = (Ia) obj;
        return this.f26837a == ia2.f26837a && this.f26838b == ia2.f26838b && this.f26839c == ia2.f26839c;
    }

    public final Ia a(long j10, long j11, boolean z10) {
        return new Ia(j10, j11, z10);
    }

    public final long b() {
        return this.f26838b;
    }

    public final boolean c() {
        return this.f26839c;
    }

    public final long d() {
        return this.f26837a;
    }

    public final long e() {
        return this.f26838b;
    }

    public final boolean f() {
        return this.f26839c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f26837a) * 31) + Long.hashCode(this.f26838b)) * 31;
        boolean z10 = this.f26839c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.f26837a + ", visibilityCheckerInterval=" + this.f26838b + ", isAutoRefreshEnabled=" + this.f26839c + ")";
    }

    public Ia(long j10, long j11, boolean z10) {
        this.f26837a = j10;
        this.f26838b = j11;
        this.f26839c = z10;
    }

    public static /* synthetic */ Ia a(Ia ia2, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = ia2.f26837a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = ia2.f26838b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            z10 = ia2.f26839c;
        }
        return ia2.a(j12, j13, z10);
    }
}
