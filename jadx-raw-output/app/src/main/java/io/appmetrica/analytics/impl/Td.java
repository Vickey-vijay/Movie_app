package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* JADX INFO: loaded from: classes4.dex */
public final class Td implements ServiceNetworkContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4209g5 f55921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55922b = new Cdo().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4553tl f55923c = new C4553tl();

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f55921a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f55923c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C4418oa.I.z();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f55922b;
    }

    public Td(Context context) {
        this.f55921a = new C4209g5(new C4463q5(context), new C4476qi(C4418oa.k().h()));
    }
}
