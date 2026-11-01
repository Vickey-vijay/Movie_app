package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1143Bj implements InterfaceC2098fK {
    public final EnumC2090fC A00;
    public final AbstractC09151z A01;

    public AbstractC1143Bj(AbstractC09151z abstractC09151z, EnumC2090fC enumC2090fC) {
        this.A01 = abstractC09151z;
        this.A00 = enumC2090fC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2098fK
    public void A45(Map<InterfaceC2081f2, EnumC2103fP> map, Map<SyncModifiableBundle, EnumC2090fC> map2) {
        map2.put(null, this.A00);
    }
}
