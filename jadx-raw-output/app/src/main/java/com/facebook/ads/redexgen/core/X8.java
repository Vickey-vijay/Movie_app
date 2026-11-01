package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X8 implements InterfaceC2095fH {
    public final /* synthetic */ C1951cu A00;
    public final /* synthetic */ VR A01;

    public X8(VR vr, C1951cu c1951cu) {
        this.A01 = vr;
        this.A00 = c1951cu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2095fH
    public final Map<String, String> A7r() {
        return this.A01.A0A(TY.A00().A01(this.A00, true).A06());
    }
}
