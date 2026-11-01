package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC1263Gb {
    public static final InterfaceC1263Gb A00 = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.lL
        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final GX[] A5F() {
            return AbstractC1262Ga.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1262Ga.A01(this, uri, map);
        }
    };

    GX[] A5F();

    GX[] A5G(Uri uri, Map<String, List<String>> map);
}
