package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1408Lr implements InterfaceC1788aH {
    public final /* synthetic */ C1393Lc A00;

    public C1408Lr(C1393Lc c1393Lc) {
        this.A00 = c1393Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1788aH
    public final void ACI() {
        if (this.A00.A0V()) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1788aH
    public final void AE7() {
        this.A00.A0F = false;
        this.A00.A0O.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1788aH
    public final void AE8() {
        this.A00.A0F = true;
        this.A00.A0O.A06();
    }
}
