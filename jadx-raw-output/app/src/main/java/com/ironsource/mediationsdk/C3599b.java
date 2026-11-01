package com.ironsource.mediationsdk;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3599b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u.d f29565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29568d;

    public final u.d a() {
        return this.f29565a;
    }

    public final boolean b() {
        return this.f29566b;
    }

    public final boolean c() {
        return this.f29567c;
    }

    public final boolean d() {
        return this.f29568d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3599b)) {
            return false;
        }
        C3599b c3599b = (C3599b) obj;
        return this.f29565a == c3599b.f29565a && this.f29566b == c3599b.f29566b && this.f29567c == c3599b.f29567c && this.f29568d == c3599b.f29568d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.f29565a.hashCode() * 31;
        boolean z10 = this.f29566b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.f29567c;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f29568d;
        return i11 + (z12 ? 1 : z12);
    }

    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f29565a + ", isRetryForMoreThan15Secs=" + this.f29566b + ", isDemandOnlyInitRequested=" + this.f29567c + ", isAdUnitInitRequested=" + this.f29568d + ")";
    }

    public C3599b(u.d dVar, boolean z10, boolean z11, boolean z12) {
        ck.p.j(dVar, "sdkState");
        this.f29565a = dVar;
        this.f29566b = z10;
        this.f29567c = z11;
        this.f29568d = z12;
    }

    public final C3599b a(u.d dVar, boolean z10, boolean z11, boolean z12) {
        ck.p.j(dVar, "sdkState");
        return new C3599b(dVar, z10, z11, z12);
    }

    public final u.d e() {
        return this.f29565a;
    }

    public final boolean f() {
        return this.f29568d;
    }

    public final boolean g() {
        return this.f29567c;
    }

    public final boolean h() {
        return this.f29566b;
    }

    public static /* synthetic */ C3599b a(C3599b c3599b, u.d dVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = c3599b.f29565a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3599b.f29566b;
        }
        if ((i10 & 4) != 0) {
            z11 = c3599b.f29567c;
        }
        if ((i10 & 8) != 0) {
            z12 = c3599b.f29568d;
        }
        return c3599b.a(dVar, z10, z11, z12);
    }
}
