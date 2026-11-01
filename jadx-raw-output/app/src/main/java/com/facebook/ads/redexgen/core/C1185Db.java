package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1185Db implements InterfaceC1991dZ {
    public final View A00;
    public final C1977dL A01;

    public C1185Db(C1977dL c1977dL, View view) {
        this.A01 = c1977dL;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1991dZ
    public final double A9N() {
        C2051eY result = C2050eX.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
