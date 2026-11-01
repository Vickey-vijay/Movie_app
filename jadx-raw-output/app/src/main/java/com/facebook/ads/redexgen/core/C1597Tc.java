package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1597Tc implements InterfaceC1630Uk {
    public WeakReference<C1520Qc> A00;

    public C1597Tc(C1520Qc c1520Qc) {
        this.A00 = new WeakReference<>(c1520Qc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1630Uk
    public final void AEW(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z10, false);
        }
    }
}
