package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f54567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.a f54568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f54569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f54571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f54572f;

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f54567a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }

    public k(UtilsProvider utilsProvider, bk.a aVar, List list, List list2, d dVar, n nVar) {
        this.f54567a = utilsProvider;
        this.f54568b = aVar;
        this.f54569c = list;
        this.f54570d = list2;
        this.f54571e = dVar;
        this.f54572f = nVar;
    }
}
