package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1738Yr implements View.OnClickListener {
    public final /* synthetic */ O6 A00;
    public final /* synthetic */ C1728Yh A01;
    public final /* synthetic */ LU A02;

    public ViewOnClickListenerC1738Yr(LU lu, C1728Yh c1728Yh, O6 o10) {
        this.A02 = lu;
        this.A01 = c1728Yh;
        this.A00 = o10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AEP(this.A00);
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
