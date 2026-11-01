package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MU {
    public static MP A00;

    public final MP A00(final C1977dL c1977dL, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (MT.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C7L();
            case 2:
                if (U7.A1N(c1977dL)) {
                    return new C7K();
                }
                return new C7L();
            case 3:
                return new C2278iS();
            case 4:
                return new C2273iN(c1977dL);
            case 5:
                return new C2273iN(c1977dL) { // from class: com.facebook.ads.redexgen.X.7F
                    @Override // com.facebook.ads.redexgen.core.C2273iN, com.facebook.ads.redexgen.core.MP
                    public final AdPlacementType A8c() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C7B();
            default:
                return null;
        }
    }
}
