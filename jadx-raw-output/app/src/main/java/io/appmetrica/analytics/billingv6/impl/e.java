package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f54542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f54543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f54544c;

    public e(f fVar, BillingResult billingResult, List list) {
        this.f54542a = fVar;
        this.f54543b = billingResult;
        this.f54544c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f54542a;
        BillingResult billingResult = this.f54543b;
        List list = this.f54544c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f54551g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f54547c;
            bk.a aVar = fVar.f54548d;
            List list2 = fVar.f54549e;
            d dVar = fVar.f54550f;
            k kVar = new k(utilsProvider, aVar, list2, list, dVar, fVar.f54551g);
            dVar.f54541b.add(kVar);
            if (fVar.f54546b.isReady()) {
                fVar.f54546b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f54545a).build(), kVar);
            } else {
                fVar.f54550f.a(kVar);
                fVar.f54551g.onUpdateFinished();
            }
        }
        f fVar2 = this.f54542a;
        fVar2.f54550f.a(fVar2);
    }
}
