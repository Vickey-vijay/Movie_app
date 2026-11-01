package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements BillingInfoSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceComponentModuleReporter f54447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f54448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f54449c;

    public j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar) {
        this.f54447a = serviceComponentModuleReporter;
        this.f54448b = executor;
        this.f54449c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f54447a;
        ServiceModuleCounterReport.Builder builderWithType = ServiceModuleCounterReport.INSTANCE.newBuilder().withType(40976);
        jVar.f54449c.getClass();
        serviceComponentModuleReporter.handleReport(builderWithType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<? extends ProductInfo> list) {
        for (final ProductInfo productInfo : list) {
            this.f54448b.execute(new Runnable() { // from class: ye.a
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(this.f85744b, productInfo);
                }
            });
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i10, ck.i iVar) {
        this(serviceComponentModuleReporter, executor, (i10 & 4) != 0 ? new o() : oVar);
    }
}
