package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4444pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f57501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f57502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC4469qb f57503c;

    public static void a(Handler handler, J2 j10, Runnable runnable) {
        handler.removeCallbacks(runnable, j10.f55378b.f55335b.getApiKey());
        handler.postAtTime(runnable, j10.f55378b.f55335b.getApiKey(), SystemClock.uptimeMillis() + ((long) (((Integer) WrapUtils.getOrDefault(j10.f55378b.f55335b.getSessionTimeout(), 10)).intValue() * 500)));
    }

    public C4444pb(Handler handler, J2 j10) {
        this.f57501a = handler;
        this.f57502b = j10;
        this.f57503c = new RunnableC4469qb(handler, j10);
    }
}
