package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1379Ko extends AbstractRunnableC1664Vt {
    public final WeakReference<C2050eX> A00;

    public C1379Ko(C2050eX c2050eX) {
        this.A00 = new WeakReference<>(c2050eX);
    }

    public C1379Ko(WeakReference<C2050eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        C2050eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
