package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class Wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N3 f27839b;

    public Wc(long j10, N3 n10) {
        ck.p.j(n10, Ne.f27158n1);
        this.f27838a = j10;
        this.f27839b = n10;
    }

    public final long a() {
        return this.f27838a;
    }

    public final N3 b() {
        return this.f27839b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f27838a + " unit=" + this.f27839b + ")";
    }

    public /* synthetic */ Wc(long j10, N3 n10, int i10, ck.i iVar) {
        this(j10, (i10 & 2) != 0 ? N3.Second : n10);
    }
}
