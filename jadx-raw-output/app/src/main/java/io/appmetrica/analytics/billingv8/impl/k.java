package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f54620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.a f54621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f54622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f54624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f54625f;

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f54620a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }

    public k(UtilsProvider utilsProvider, bk.a aVar, List list, List list2, d dVar, n nVar) {
        this.f54620a = utilsProvider;
        this.f54621b = aVar;
        this.f54622c = list;
        this.f54623d = list2;
        this.f54624e = dVar;
        this.f54625f = nVar;
    }
}
