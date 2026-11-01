package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;

/* JADX INFO: loaded from: classes6.dex */
public final class L3 implements I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L5 f55498b = new L5(new C4286j5());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4156e4 f55499c = new C4156e4(C4105c4.l().b(getContext()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4086bb f55500d = new C4086bb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4407o f55501e = C4105c4.l().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J3 f55502f = new J3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rc f55503g = new Rc();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K3 f55504h = new K3();

    @Override // io.appmetrica.analytics.impl.I5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final K5 getModuleAdRevenueContext() {
        return this.f55498b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f55501e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f55502f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f55503g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f55499c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f55497a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f55500d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f55498b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f55504h;
    }

    public L3(Context context) {
        this.f55497a = context;
    }
}
