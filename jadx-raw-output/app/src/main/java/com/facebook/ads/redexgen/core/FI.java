package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FI implements InterfaceC1868bZ {
    public final /* synthetic */ FH A00;

    public FI(FH fh2) {
        this.A00 = fh2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1868bZ
    public final void AFm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1868bZ
    public final void AFo(View view) {
        AbstractC1330Ir abstractC1330Ir = (AbstractC1330Ir) view;
        abstractC1330Ir.A1R();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1330Ir.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
