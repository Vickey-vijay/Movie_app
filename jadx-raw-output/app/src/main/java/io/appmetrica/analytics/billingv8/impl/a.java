package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import nj.s;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f54583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f54584b;

    public a(b bVar, BillingResult billingResult) {
        this.f54583a = bVar;
        this.f54584b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f54583a;
        BillingResult billingResult = this.f54584b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f54589e.onUpdateFinished();
            return;
        }
        if (!bVar.f54586b.isReady()) {
            bVar.f54589e.onUpdateFinished();
            return;
        }
        for (String str : s.n("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f54585a;
            BillingClient billingClient = bVar.f54586b;
            UtilsProvider utilsProvider = bVar.f54587c;
            d dVar = bVar.f54588d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f54589e);
            dVar.f54594b.add(iVar);
            bVar.f54586b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), iVar);
        }
    }
}
