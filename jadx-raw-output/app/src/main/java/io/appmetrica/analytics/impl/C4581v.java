package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4581v implements InterfaceC4606w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57780a;

    public C4581v(Context context) {
        this.f57780a = context;
    }

    public final String a() {
        C4105c4 c4105c4L = C4105c4.l();
        Context context = this.f57780a;
        N9 n10 = c4105c4L.f56455t;
        if (n10 == null) {
            synchronized (c4105c4L) {
                n10 = c4105c4L.f56455t;
                if (n10 == null) {
                    n10 = new N9(context);
                    c4105c4L.f56455t = n10;
                }
            }
        }
        Bundle applicationMetaData = n10.f55620d.getApplicationMetaData(n10.f55617a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
