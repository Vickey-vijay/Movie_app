package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2222hP extends AbstractRunnableC1664Vt {
    public final /* synthetic */ C2278iS A00;
    public final /* synthetic */ NU A01;
    public final /* synthetic */ C10426y A02;

    public C2222hP(C10426y c10426y, NU nu, C2278iS c2278iS) {
        this.A02 = c10426y;
        this.A01 = nu;
        this.A00 = c2278iS;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        V1 v1A00 = V1.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5Y(v1A00.A03().getErrorCode(), v1A00.A04());
        this.A02.A07.A0G(v1A00);
    }
}
