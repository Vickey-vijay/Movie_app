package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1110Ab extends AbstractC2618oF<Object> {
    public final /* synthetic */ int A00;

    public C1110Ab(final int val$expectedKeys) {
        this.A00 = val$expectedKeys;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2618oF
    public final <K, V> Map<K, Collection<V>> A04() {
        return AbstractC2635oY.A00(this.A00);
    }
}
