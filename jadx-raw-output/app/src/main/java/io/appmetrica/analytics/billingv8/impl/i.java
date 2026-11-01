package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f54611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f54612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f54613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f54615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f54616f;

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f54613c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f54611a = billingConfig;
        this.f54612b = billingClient;
        this.f54613c = utilsProvider;
        this.f54614d = str;
        this.f54615e = dVar;
        this.f54616f = nVar;
    }
}
