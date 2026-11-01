package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1851bI extends AbstractRunnableC1664Vt {
    public final /* synthetic */ C1951cu A00;

    public C1851bI(C1951cu c1951cu) {
        this.A00 = c1951cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        for (C1585Sq c1585Sq : C1584Sp.A02()) {
            C1584Sp.A0A(this.A00, c1585Sq.A02(), c1585Sq.A00(), c1585Sq.A01(), false);
        }
        C1584Sp.A02().clear();
    }
}
