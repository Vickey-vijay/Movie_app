package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4676yj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f58032a;

    public C4676yj(ECommerceEvent eCommerceEvent) {
        this.f58032a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportECommerce(this.f58032a);
    }
}
