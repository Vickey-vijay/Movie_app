package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: loaded from: classes5.dex */
public final class N9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Wm f55618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X2 f55619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f55620d;

    public N9(Context context, Wm wm2, X2 x10, SafePackageManager safePackageManager) {
        this.f55617a = context;
        this.f55618b = wm2;
        this.f55619c = x10;
        this.f55620d = safePackageManager;
    }

    public N9(Context context) {
        this(context, new Wm(context, "io.appmetrica.analytics.build_id"), new X2(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
