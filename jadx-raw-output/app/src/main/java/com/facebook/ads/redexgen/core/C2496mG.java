package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2496mG implements EN {
    public long A00;
    public long A01;
    public C2496mG A02;
    public EM A03;

    public C2496mG(long j10, int i10) {
        A02(j10, i10);
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A01)) + this.A03.A00;
    }

    public final C2496mG A01() {
        this.A03 = null;
        C2496mG c2496mG = this.A02;
        this.A02 = null;
        return c2496mG;
    }

    public final void A02(long j10, int i10) {
        C3M.A08(this.A03 == null);
        this.A01 = j10;
        this.A00 = ((long) i10) + j10;
    }

    public final void A03(EM em2, C2496mG c2496mG) {
        this.A03 = em2;
        this.A02 = c2496mG;
    }

    @Override // com.facebook.ads.redexgen.core.EN
    public final EM A6m() {
        return (EM) C3M.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.EN
    public final C2496mG AC3() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
