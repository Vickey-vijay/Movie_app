package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2239hi implements InterfaceC1548Re {
    public final /* synthetic */ AbstractC2252hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1977dL A03;
    public final /* synthetic */ boolean A04;

    public C2239hi(NH nh2, C1977dL c1977dL, boolean z10, AbstractC2252hy abstractC2252hy, NG ng2) {
        this.A02 = nh2;
        this.A03 = c1977dL;
        this.A04 = z10;
        this.A00 = abstractC2252hy;
        this.A01 = ng2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1548Re
    public final void ACM() {
        if (U7.A1l(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC1889bu.A01(this.A03, this.A00, 1, new C2240hj(this)));
        } else {
            this.A01.ACG();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1548Re
    public final void ACN() {
        this.A01.ACF(AdError.CACHE_ERROR);
    }
}
