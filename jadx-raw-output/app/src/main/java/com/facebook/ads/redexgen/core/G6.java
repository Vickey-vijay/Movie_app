package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class G6 implements InterfaceC1673Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC1664Vt A01;
    public final /* synthetic */ G2 A02;
    public final /* synthetic */ C1180Cw A03;

    public G6(G2 g10, int i10, C1180Cw c1180Cw, AbstractRunnableC1664Vt abstractRunnableC1664Vt) {
        this.A02 = g10;
        this.A00 = i10;
        this.A03 = c1180Cw;
        this.A01 = abstractRunnableC1664Vt;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1673Wc
    public final void ACp() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1673Wc
    public final void AEn(float f10) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f10 / this.A00)));
        if (this.A03 != null) {
            C1180Cw c1180Cw = this.A03;
            float percentage = this.A00;
            c1180Cw.A07((int) ((percentage - f10) * 1000.0f));
        }
    }
}
