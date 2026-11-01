package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FM implements InterfaceC1936cf {
    public final /* synthetic */ YY A00;
    public final /* synthetic */ FL A01;
    public final /* synthetic */ C1956cz A02;

    public FM(FL fl2, C1956cz c1956cz, YY yy) {
        this.A01 = fl2;
        this.A02 = c1956cz;
        this.A00 = yy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1936cf
    public final void AHo() {
        this.A01.A09();
        this.A01.A03 = this.A01.A05(this.A02, this.A00);
        if (this.A01.A01 != null && this.A01.A00 != null) {
            this.A01.A03.AAl(this.A01.A01, this.A01.A02, this.A01.A00);
        }
    }
}
