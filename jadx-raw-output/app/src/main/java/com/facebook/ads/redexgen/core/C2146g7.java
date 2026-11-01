package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2146g7 implements QI {
    public final /* synthetic */ C10246g A00;

    public C2146g7(C10246g c10246g) {
        this.A00 = c10246g;
    }

    @Override // com.facebook.ads.redexgen.core.QI
    public final void ACK(AbstractC1524Qg abstractC1524Qg) {
        abstractC1524Qg.A0d(true);
        if (abstractC1524Qg.A06 != null && abstractC1524Qg.A07 == null) {
            abstractC1524Qg.A06 = null;
        }
        abstractC1524Qg.A07 = null;
        if (!abstractC1524Qg.A0G() && !this.A00.A1x(abstractC1524Qg.A0H) && abstractC1524Qg.A0i()) {
            this.A00.removeDetachedView(abstractC1524Qg.A0H, false);
        }
    }
}
