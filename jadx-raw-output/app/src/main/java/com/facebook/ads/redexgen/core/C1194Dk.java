package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1194Dk extends AbstractC1600Tf<DQ> {
    public final /* synthetic */ C09483i A00;

    public C1194Dk(C09483i c09483i) {
        this.A00 = c09483i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1600Tf
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DQ dq) {
        if (!this.A00.A02) {
            this.A00.A02 = true;
        } else {
            this.A00.A0d();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1600Tf
    public final Class<DQ> A01() {
        return DQ.class;
    }
}
