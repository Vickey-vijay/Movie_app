package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f58424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f58425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f58426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f58427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C4719n f58428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f58429f = new d0(this);

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C4718m c4718m) {
        this.f58428e = c4718m != null ? c4718m.f58448b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    public g0(ClientContext clientContext, U u10) {
        this.f58424a = clientContext;
        this.f58425b = u10;
        this.f58426c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f58424a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
