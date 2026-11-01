package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4553tl implements SimpleNetworkApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f57734a = new CacheControlHttpsConnectionPerformer(((Bl) C4418oa.k().z()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f57734a.performConnection(str, new C4181f3(networkClientWithCacheControl));
    }
}
