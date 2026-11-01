package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1615Tv implements InterfaceC1761Zo {
    public final /* synthetic */ TD A00;

    public C1615Tv(TD td2) {
        this.A00 = td2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1761Zo
    public final void ADT(C1760Zn c1760Zn) {
        this.A00.A0D.set(c1760Zn.A00() != null);
        if (this.A00.A0E.get() && this.A00.A02 != null) {
            this.A00.A02.AEW(c1760Zn.A00() != null);
        }
    }
}
