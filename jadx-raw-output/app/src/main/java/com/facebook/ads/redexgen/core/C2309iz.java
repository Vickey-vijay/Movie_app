package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2309iz implements InterfaceC09854t {
    public InterfaceC1404Ln A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C2309iz A00(InterfaceC1404Ln interfaceC1404Ln) {
        this.A02 = interfaceC1404Ln;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09854t
    public final C2308iy A59() {
        return new C2308iy((InterfaceC1404Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
