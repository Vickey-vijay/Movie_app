package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4709d implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f58416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f58417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C4715j f58418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mj.g f58419d = kotlin.b.a(new C4706a(this));

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C4718m c4718m) {
        this.f58418c = c4718m != null ? c4718m.f58447a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    public static final Activity.ScreenCaptureCallback d(C4709d c4709d) {
        return (Activity.ScreenCaptureCallback) c4709d.f58419d.getValue();
    }

    public C4709d(ClientContext clientContext, U u10) {
        this.f58416a = clientContext;
        this.f58417b = u10;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f58416a.getActivityLifecycleRegistry().registerListener(new C4708c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
