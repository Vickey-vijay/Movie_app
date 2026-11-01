package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10426y extends AbstractC2223hQ {
    public C10426y(C1977dL c1977dL, NT nt) {
        super(c1977dL, nt);
    }

    private C2221hO A00(Runnable runnable) {
        return new C2221hO(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2223hQ
    public final AbstractC1430Mo A0I() {
        C2278iS successfullyLoadedAdapter = (C2278iS) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2223hQ
    public final void A0P() {
        C2278iS interstitialAdapter = (C2278iS) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2223hQ
    public final void A0R(MP mp, TE te2, TC tc2, NU nu) {
        C2278iS c2278iS = (C2278iS) mp;
        C2222hP c2222hP = new C2222hP(this, nu, c2278iS);
        A0H().postDelayed(c2222hP, te2.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2278iS.A0A(this.A0B, A00(c2222hP), nu, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
