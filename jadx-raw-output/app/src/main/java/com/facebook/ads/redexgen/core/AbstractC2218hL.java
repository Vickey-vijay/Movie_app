package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2218hL implements InterfaceC1421Me {
    public C1520Qc A00;

    public final void A00(C1520Qc c1520Qc) {
        this.A00 = c1520Qc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1421Me
    public final void AEG(C2273iN c2273iN) {
        if (this.A00 != null && this.A00.A16() != null) {
            this.A00.A16().ACD();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1421Me
    public final void AEI(C2273iN c2273iN) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1421Me
    public final void AEK(C2273iN c2273iN, V1 v10) {
    }
}
