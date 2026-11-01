package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s fromModel(BillingConfig billingConfig) {
        s sVar = new s();
        sVar.f54463a = billingConfig.getSendFrequencySeconds();
        sVar.f54464b = billingConfig.getFirstCollectingInappMaxAgeSeconds();
        return sVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        s sVar = (s) obj;
        return new BillingConfig(sVar.f54463a, sVar.f54464b);
    }

    public final BillingConfig a(s sVar) {
        return new BillingConfig(sVar.f54463a, sVar.f54464b);
    }
}
