package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4708c implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4709d f58415a;

    public C4708c(C4709d c4709d) {
        this.f58415a = c4709d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i10 = AbstractC4707b.f58414a[activityEvent.ordinal()];
        try {
            if (i10 == 1) {
                C4715j c4715j = this.f58415a.f58418c;
                if (c4715j == null || !c4715j.f58434a) {
                } else {
                    activity.registerScreenCaptureCallback(this.f58415a.f58416a.getContext().getMainExecutor(), C4709d.d(this.f58415a));
                }
            } else if (i10 != 2) {
            } else {
                activity.unregisterScreenCaptureCallback(C4709d.d(this.f58415a));
            }
        } catch (Throwable unused) {
        }
    }
}
