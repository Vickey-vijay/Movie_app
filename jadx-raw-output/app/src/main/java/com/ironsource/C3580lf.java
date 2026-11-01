package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3580lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N3 f29409b;

    public C3580lf(int i10, N3 n10) {
        ck.p.j(n10, Ne.f27158n1);
        this.f29408a = i10;
        this.f29409b = n10;
    }

    public final int a() {
        return this.f29408a;
    }

    public final N3 b() {
        return this.f29409b;
    }

    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f29408a + ", unit=" + this.f29409b + ")";
    }
}
