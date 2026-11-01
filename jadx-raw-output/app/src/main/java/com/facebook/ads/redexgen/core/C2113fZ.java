package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2113fZ implements RQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C1520Qc A02;

    public C2113fZ(RS rs, ImageView imageView, C1520Qc c1520Qc) {
        this.A01 = rs;
        this.A00 = imageView;
        this.A02 = c1520Qc;
    }

    @Override // com.facebook.ads.redexgen.core.RQ
    public final void ADU(Drawable drawable) {
        C1520Qc.A0f(drawable, this.A00);
        this.A02.A1K(drawable);
    }
}
