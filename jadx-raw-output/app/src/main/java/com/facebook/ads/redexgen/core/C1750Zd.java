package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1750Zd implements InterfaceC1589Su {
    public final SQ A00;

    public C1750Zd(SQ sq) {
        this.A00 = sq;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void A4A(Throwable th2) {
        C1584Sp.A0E(th2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void A9v(String str) {
        C1623Ud.A08(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void A9w(String str) {
        C1623Ud.A09(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void AAy(String str, int i10, C1591Sw c1591Sw) {
        C1584Sp.A06(this.A00, str, i10, c1591Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void AAz(String str, int i10, C1591Sw c1591Sw) {
        C1584Sp.A06(this.A00, str, i10, c1591Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void ABI(long j10, long j11, long j12, long j13, int i10, Exception exc) {
        T0.A03(this.A00, j10, j11, j12, j13, i10, exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void ABR(String str, int i10, C1591Sw c1591Sw) {
        C1584Sp.A07(this.A00, str, i10, c1591Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void ABZ(String str, int i10, C1591Sw c1591Sw) {
        C1584Sp.A08(this.A00, str, i10, c1591Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1589Su
    public final void ABq() {
        this.A00.A04().ABq();
    }
}
