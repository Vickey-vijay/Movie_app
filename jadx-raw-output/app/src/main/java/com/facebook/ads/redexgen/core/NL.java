package com.facebook.ads.redexgen.core;

import android.R;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NL extends AbstractRunnableC1664Vt {
    public final /* synthetic */ Y0 A00;

    public NL(Y0 y10) {
        this.A00 = y10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
