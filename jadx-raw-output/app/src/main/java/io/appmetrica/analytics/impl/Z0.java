package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class Z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f56262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56263b;

    public Z0(C4558u1 c4558u1, ECommerceEvent eCommerceEvent) {
        this.f56263b = c4558u1;
        this.f56262a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f56263b).reportECommerce(this.f56262a);
    }
}
