package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4095bk implements ServiceComponentModuleReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f56426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4577uk f56427b;

    public C4095bk(Y4 y10, C4577uk c4577uk) {
        this.f56426a = y10;
        this.f56427b = c4577uk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f56427b.getClass();
        this.f56426a.a(C4577uk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C4095bk(Y4 y10, C4577uk c4577uk, int i10, ck.i iVar) {
        this(y10, (i10 & 2) != 0 ? new C4577uk() : c4577uk);
    }
}
