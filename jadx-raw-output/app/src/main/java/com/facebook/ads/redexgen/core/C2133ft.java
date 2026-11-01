package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2133ft extends AbstractRunnableC1651Vg {
    public final /* synthetic */ C2130fq A00;

    public C2133ft(C2130fq c2130fq) {
        this.A00 = c2130fq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1651Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
