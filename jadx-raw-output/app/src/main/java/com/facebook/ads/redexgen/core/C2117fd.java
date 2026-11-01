package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2117fd extends AbstractRunnableC1651Vg {
    public final /* synthetic */ C2114fa A00;
    public final /* synthetic */ V1 A01;

    public C2117fd(C2114fa c2114fa, V1 v10) {
        this.A00 = c2114fa;
        this.A01 = v10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1651Vg
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(WT.A00(this.A01));
        }
    }
}
