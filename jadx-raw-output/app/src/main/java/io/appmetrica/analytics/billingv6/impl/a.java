package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import nj.s;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f54530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f54531b;

    public a(b bVar, BillingResult billingResult) {
        this.f54530a = bVar;
        this.f54531b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f54530a;
        BillingResult billingResult = this.f54531b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f54536e.onUpdateFinished();
            return;
        }
        for (String str : s.n("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f54532a;
            BillingClient billingClient = bVar.f54533b;
            UtilsProvider utilsProvider = bVar.f54534c;
            d dVar = bVar.f54535d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f54536e);
            dVar.f54541b.add(iVar);
            if (bVar.f54533b.isReady()) {
                bVar.f54533b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f54535d.a(iVar);
                bVar.f54536e.onUpdateFinished();
            }
        }
    }
}
