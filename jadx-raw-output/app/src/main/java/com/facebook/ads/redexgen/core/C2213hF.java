package com.facebook.ads.redexgen.core;

import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2213hF extends AbstractRunnableC1651Vg {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AbstractC2211hD A01;

    public C2213hF(AbstractC2211hD abstractC2211hD, Message message) {
        this.A01 = abstractC2211hD;
        this.A00 = message;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1651Vg
    public final void A01() {
        this.A01.A05.A9b(this.A00);
    }
}
