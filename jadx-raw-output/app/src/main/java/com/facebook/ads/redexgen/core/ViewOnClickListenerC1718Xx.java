package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1718Xx implements View.OnClickListener {
    public final /* synthetic */ C1459Nr A00;

    public ViewOnClickListenerC1718Xx(C1459Nr c1459Nr) {
        this.A00 = c1459Nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A01 != null && this.A00.A02.A02()) {
                this.A00.A01.ACC(this.A00);
            }
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
