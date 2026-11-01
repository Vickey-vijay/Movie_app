package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC1664Vt {
    public final /* synthetic */ C1331Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C1331Is c1331Is, boolean z10) {
        this.A00 = c1331Is;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        AbstractC1707Xm abstractC1707XmA0C = this.A00.A0c.A0C();
        if (abstractC1707XmA0C == null) {
            return;
        }
        abstractC1707XmA0C.setPageDetailsVisible((this.A01 || abstractC1707XmA0C.A0B()) ? false : true);
        abstractC1707XmA0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
