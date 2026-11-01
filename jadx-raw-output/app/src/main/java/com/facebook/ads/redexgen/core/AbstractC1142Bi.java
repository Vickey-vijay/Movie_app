package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1142Bi implements InterfaceC2098fK {
    public final By A00;
    public final EnumC2103fP A01;

    public AbstractC1142Bi(By by, EnumC2103fP enumC2103fP) {
        this.A00 = by;
        this.A01 = enumC2103fP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2098fK
    public void A45(Map<InterfaceC2081f2, EnumC2103fP> map, Map<SyncModifiableBundle, EnumC2090fC> map2) {
        map.put(this.A00, this.A01);
    }
}
