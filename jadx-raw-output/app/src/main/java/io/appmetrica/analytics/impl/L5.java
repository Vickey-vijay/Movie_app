package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* JADX INFO: loaded from: classes6.dex */
public final class L5 implements K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4286j5 f55507a;

    @Override // io.appmetrica.analytics.impl.K5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C4286j5 getAdRevenueProcessorsHolder() {
        return this.f55507a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f55507a;
    }

    public L5(C4286j5 c4286j5) {
        this.f55507a = c4286j5;
    }
}
