package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f54540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f54541b = new LinkedHashSet();

    public final void a(Object obj) {
        this.f54541b.remove(obj);
        if (this.f54541b.size() == 0) {
            this.f54540a.endConnection();
        }
    }

    public d(BillingClient billingClient) {
        this.f54540a = billingClient;
    }
}
