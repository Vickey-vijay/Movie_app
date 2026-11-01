package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1744Yx implements View.OnClickListener {
    public final /* synthetic */ C1728Yh A00;
    public final /* synthetic */ LS A01;

    public ViewOnClickListenerC1744Yx(LS ls, C1728Yh c1728Yh) {
        this.A01 = ls;
        this.A00 = c1728Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AEC(O4.A04);
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
