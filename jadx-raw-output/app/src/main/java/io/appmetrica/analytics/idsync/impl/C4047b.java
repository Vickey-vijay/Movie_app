package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4047b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f54857a;

    @Override // io.appmetrica.analytics.idsync.impl.t
    public final boolean a() {
        return this.f54857a.getActiveNetworkTypeProvider().getNetworkType(this.f54857a.getContext()) == NetworkType.CELL;
    }

    public C4047b(ServiceContext serviceContext) {
        this.f54857a = serviceContext;
    }
}
