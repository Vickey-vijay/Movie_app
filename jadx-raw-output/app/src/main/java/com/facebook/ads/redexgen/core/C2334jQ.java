package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2334jQ implements InterfaceC1383Ks<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1383Ks
    public final C1382Kr<File> A3p(File file, LA la2) {
        if (file.exists()) {
            return new C1382Kr<>(true, file);
        }
        return new C1382Kr<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1383Ks
    public final void A55(File file, LA la2) {
    }
}
