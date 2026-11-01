package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class Mc implements InterfaceC4530sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f55575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f55576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f55577d;

    @Override // io.appmetrica.analytics.impl.InterfaceC4530sn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Lc a() {
        Lc lc2;
        lc2 = (Lc) this.f55577d.getData();
        if (lc2 == null || this.f55577d.shouldUpdateData()) {
            lc2 = new Lc(this.f55575b.hasNecessaryPermissions(this.f55574a) ? this.f55576c.getNetworkType() : "unknown");
            this.f55577d.setData(lc2);
        }
        return lc2;
    }

    public Mc(Context context) {
        PermissionResolutionStrategy alwaysAllowPermissionStrategy;
        this.f55574a = context;
        if (AndroidUtils.isApiAchieved(29)) {
            alwaysAllowPermissionStrategy = new SinglePermissionStrategy(C4418oa.k().j(), "android.permission.READ_PHONE_STATE");
        } else {
            alwaysAllowPermissionStrategy = new AlwaysAllowPermissionStrategy();
        }
        this.f55575b = alwaysAllowPermissionStrategy;
        this.f55576c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f55577d = new CachedDataProvider.CachedData(millis, millis * ((long) 2), "mobile-connection");
    }
}
