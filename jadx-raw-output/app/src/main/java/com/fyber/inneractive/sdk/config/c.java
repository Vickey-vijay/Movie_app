package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15036a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public c(e eVar) {
        this.f15036a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f15036a.f15057e.hasMessages(123) || this.f15036a.f15053a.get()) {
            return;
        }
        this.f15036a.f15057e.sendEmptyMessageDelayed(123, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.fyber.inneractive.sdk.cache.session.g gVar;
        this.f15036a.f15057e.removeMessages(123);
        e eVar = this.f15036a;
        if (eVar.f15053a.compareAndSet(true, false)) {
            if (eVar.f15054b) {
                IAlog.a("onActivityResumed: restartSession", new Object[0]);
                eVar.f15054b = false;
                x0 x0Var = eVar.f15056d;
                if (x0Var != null) {
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = x0Var.f15221a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.cache.session.i iVar = eVar2.f14948a;
                        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) iVar.f14958a.get(cVar)) != null && gVar.f14954a != 0) {
                                eVar2.a(cVar, gVar);
                            }
                        }
                        com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.c.NONE));
                    }
                    eVar.f15056d.f15223c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                    eVar.f15056d.f15222b.clear();
                }
            }
            v1 v1Var = eVar.f15055c;
            if (v1Var != null) {
                v1Var.f18630d = false;
                v1Var.f18632f = 0L;
                t1 t1Var = v1Var.f18629c;
                if (t1Var != null) {
                    t1Var.removeMessages(1932593528);
                }
            }
        }
    }
}
