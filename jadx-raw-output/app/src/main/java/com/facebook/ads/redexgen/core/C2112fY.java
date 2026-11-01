package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2112fY extends AbstractRunnableC1664Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C1520Qc A02;

    public C2112fY(RS rs, C1520Qc c1520Qc, Drawable drawable) {
        this.A01 = rs;
        this.A02 = c1520Qc;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
