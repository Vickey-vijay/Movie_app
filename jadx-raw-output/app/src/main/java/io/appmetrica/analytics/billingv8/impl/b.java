package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f54585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f54586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f54587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f54588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f54589e;

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f54587c.getWorkerExecutor().execute(new a(this, billingResult));
    }

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f54585a = billingConfig;
        this.f54586b = billingClient;
        this.f54587c = billingLibraryMonitor$updateBilling$1;
        this.f54588d = dVar;
        this.f54589e = nVar;
    }
}
