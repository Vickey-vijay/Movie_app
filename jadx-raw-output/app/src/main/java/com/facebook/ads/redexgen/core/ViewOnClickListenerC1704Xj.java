package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1704Xj implements View.OnClickListener {
    public final /* synthetic */ N9 A00;
    public final /* synthetic */ C1620Ua A01;
    public final /* synthetic */ C1705Xk A02;
    public final /* synthetic */ InterfaceC1708Xn A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC1704Xj(C1705Xk c1705Xk, C1620Ua c1620Ua, InterfaceC1708Xn interfaceC1708Xn, String str, N9 n10) {
        this.A02 = c1705Xk;
        this.A01 = c1620Ua;
        this.A03 = interfaceC1708Xn;
        this.A04 = str;
        this.A00 = n10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1656Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A04(UZ.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A02(), true)) {
                this.A03.AAf(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                WN.A0O(new WN(), this.A02.A03, WQ.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th2) {
            AbstractC1656Vl.A00(th2, this);
        }
    }
}
