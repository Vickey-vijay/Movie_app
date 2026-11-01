package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f58423a;

    public f0(g0 g0Var) {
        this.f58423a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i10 = e0.f58422a[activityEvent.ordinal()];
        try {
            if (i10 == 1) {
                C4719n c4719n = this.f58423a.f58428e;
                if (c4719n == null || !c4719n.f58450a) {
                    return;
                }
                this.f58423a.f58427d = false;
                g0 g0Var = this.f58423a;
                g0Var.f58426c.postDelayed(g0Var.f58429f, 0L);
            } else if (i10 != 2) {
            } else {
                this.f58423a.f58427d = true;
            }
        } catch (Throwable unused) {
        }
    }
}
