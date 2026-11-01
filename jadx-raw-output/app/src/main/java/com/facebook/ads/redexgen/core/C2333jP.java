package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2333jP implements InterfaceC1383Ks<String> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1383Ks
    public final C1382Kr<String> A3p(File file, LA la2) {
        String strA05 = LB.A05(file);
        return new C1382Kr<>(strA05 != null, strA05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1383Ks
    public final void A55(File file, LA la2) {
    }
}
