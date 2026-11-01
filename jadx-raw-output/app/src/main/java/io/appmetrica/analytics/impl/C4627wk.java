package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4627wk implements ServiceModuleReporterComponentContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4095bk f57895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4069ak f57896b;

    public final C4069ak a() {
        return this.f57896b;
    }

    public final C4095bk b() {
        return this.f57895a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f57896b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f57895a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4627wk(Y4 y10, C4437p4 c4437p4) {
        this.f57895a = new C4095bk(y10, null, 2, 0 == true ? 1 : 0);
        this.f57896b = new C4069ak(c4437p4);
    }
}
