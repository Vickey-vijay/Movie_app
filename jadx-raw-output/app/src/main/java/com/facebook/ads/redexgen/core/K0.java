package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC1761Zo {
    public final WeakReference<C09995h> A00;

    public K0(C09995h c09995h) {
        this.A00 = new WeakReference<>(c09995h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1761Zo
    public final void ADT(C1760Zn c1760Zn) {
        C09995h c09995h = this.A00.get();
        if (c09995h != null) {
            c09995h.A04 = c1760Zn.A00() != null;
            c09995h.A02();
        }
    }
}
