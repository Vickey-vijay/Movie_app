package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2116fc extends AbstractRunnableC1651Vg {
    public final /* synthetic */ C2115fb A00;

    public C2116fc(C2115fb c2115fb) {
        this.A00 = c2115fb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1651Vg
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
