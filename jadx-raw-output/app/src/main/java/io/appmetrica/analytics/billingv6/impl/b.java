package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f54532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f54533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f54534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f54535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f54536e;

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f54534c.getWorkerExecutor().execute(new a(this, billingResult));
    }

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f54532a = billingConfig;
        this.f54533b = billingClient;
        this.f54534c = billingLibraryMonitor$updateBilling$1;
        this.f54535d = dVar;
        this.f54536e = nVar;
    }
}
