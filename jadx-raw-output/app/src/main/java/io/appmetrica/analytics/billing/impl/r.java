package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f54461a;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t fromModel(RemoteBillingConfig remoteBillingConfig) {
        t tVar = new t();
        tVar.f54466a = remoteBillingConfig.getEnabled();
        BillingConfig config = remoteBillingConfig.getConfig();
        tVar.f54467b = config != null ? this.f54461a.fromModel(config) : null;
        return tVar;
    }

    public r(g gVar) {
        this.f54461a = gVar;
    }

    public /* synthetic */ r(g gVar, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new g() : gVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig toModel(t tVar) {
        boolean z10 = tVar.f54466a;
        g gVar = this.f54461a;
        s sVar = tVar.f54467b;
        gVar.getClass();
        return new RemoteBillingConfig(z10, new BillingConfig(sVar.f54463a, sVar.f54464b));
    }
}
