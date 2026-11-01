package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class Sh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f55866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55867b;

    public Sh(C4248hi c4248hi, ECommerceEvent eCommerceEvent) {
        this.f55867b = c4248hi;
        this.f55866a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55867b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportECommerce(this.f55866a);
    }
}
