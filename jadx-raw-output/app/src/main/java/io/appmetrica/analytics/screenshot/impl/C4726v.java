package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4726v implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f58460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f58461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C4716k f58462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f58463d;

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C4718m c4718m) {
        this.f58462c = c4718m != null ? c4718m.f58449c : null;
        this.f58463d.f58410c = this.f58462c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    public C4726v(ClientContext clientContext, U u10) {
        this.f58460a = clientContext;
        this.f58461b = u10;
        this.f58463d = new Z(clientContext, new C4723s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f58460a.getActivityLifecycleRegistry().registerListener(new C4725u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
