package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements ProductDetailsResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f54546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f54547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk.a f54548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f54549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f54550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f54551g;

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f54547c.getWorkerExecutor().execute(new e(this, billingResult, list));
    }

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f54545a = str;
        this.f54546b = billingClient;
        this.f54547c = utilsProvider;
        this.f54548d = hVar;
        this.f54549e = list;
        this.f54550f = dVar;
        this.f54551g = nVar;
    }
}
