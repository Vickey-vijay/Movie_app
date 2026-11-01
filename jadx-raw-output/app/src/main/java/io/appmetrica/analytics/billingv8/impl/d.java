package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f54593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f54594b = new LinkedHashSet();

    public final void a(Object obj) {
        this.f54594b.remove(obj);
        if (this.f54594b.size() == 0) {
            this.f54593a.endConnection();
        }
    }

    public d(BillingClient billingClient) {
        this.f54593a = billingClient;
    }
}
