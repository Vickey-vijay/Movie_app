package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2233ha implements InterfaceC1548Re {
    public final /* synthetic */ NH A00;

    public C2233ha(NH nh2) {
        this.A00 = nh2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1548Re
    public final void ACM() {
        this.A00.A04.ACG();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1548Re
    public final void ACN() {
        this.A00.A04.ACF(AdError.CACHE_ERROR);
    }
}
