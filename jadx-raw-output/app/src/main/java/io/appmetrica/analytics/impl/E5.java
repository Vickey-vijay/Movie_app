package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: loaded from: classes2.dex */
public final class E5 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F5 f55159a;

    public E5(F5 f10) {
        this.f55159a = f10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i10 = D5.f55131a[activityEvent.ordinal()];
        if (i10 == 1) {
            this.f55159a.f55220b.resumeSession();
        } else {
            if (i10 != 2) {
                return;
            }
            this.f55159a.f55220b.pauseSession();
        }
    }
}
