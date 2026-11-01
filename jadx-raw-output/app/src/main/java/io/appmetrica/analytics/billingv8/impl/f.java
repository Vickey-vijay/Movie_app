package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements ProductDetailsResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f54599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f54600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk.a f54601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f54602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f54603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f54604g;

    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f54600c.getWorkerExecutor().execute(new e(this, billingResult, queryProductDetailsResult));
    }

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f54598a = str;
        this.f54599b = billingClient;
        this.f54600c = utilsProvider;
        this.f54601d = hVar;
        this.f54602e = list;
        this.f54603f = dVar;
        this.f54604g = nVar;
    }
}
