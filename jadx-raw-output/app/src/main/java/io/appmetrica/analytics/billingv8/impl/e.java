package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f54595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f54596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f54597c;

    public e(f fVar, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f54595a = fVar;
        this.f54596b = billingResult;
        this.f54597c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f54595a;
        BillingResult billingResult = this.f54596b;
        List productDetailsList = this.f54597c.getProductDetailsList();
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || productDetailsList.isEmpty()) {
            fVar.f54604g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f54600c;
            bk.a aVar = fVar.f54601d;
            List list = fVar.f54602e;
            d dVar = fVar.f54603f;
            k kVar = new k(utilsProvider, aVar, list, productDetailsList, dVar, fVar.f54604g);
            dVar.f54594b.add(kVar);
            if (fVar.f54599b.isReady()) {
                fVar.f54599b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f54598a).build(), kVar);
            } else {
                fVar.f54603f.a(kVar);
                fVar.f54604g.onUpdateFinished();
            }
        }
        f fVar2 = this.f54595a;
        fVar2.f54603f.a(fVar2);
    }
}
