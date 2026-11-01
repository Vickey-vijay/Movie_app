package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EV implements InterfaceC2075ew {
    public final /* synthetic */ C1974dI A00;

    public EV(C1974dI c1974dI) {
        this.A00 = c1974dI;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2075ew
    public final void AGQ() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2075ew
    public final void AGS(C2077ey c2077ey) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c2077ey != null && c2077ey.A00()) {
            this.A00.A02.A4b(this.A00.A03.A8x());
        } else {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }
}
