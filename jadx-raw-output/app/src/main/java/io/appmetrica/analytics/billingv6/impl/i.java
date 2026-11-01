package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f54558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f54559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f54560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f54562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f54563f;

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f54560c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f54558a = billingConfig;
        this.f54559b = billingClient;
        this.f54560c = utilsProvider;
        this.f54561d = str;
        this.f54562e = dVar;
        this.f54563f = nVar;
    }
}
