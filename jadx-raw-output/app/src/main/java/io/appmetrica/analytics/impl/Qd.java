package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Qd implements InterfaceC4531t {
    @Override // io.appmetrica.analytics.impl.InterfaceC4531t
    public final Map<String, String> a(Map<String, String> map) {
        map.put(AdRevenueConstants.LAYER_KEY, "native");
        return map;
    }
}
