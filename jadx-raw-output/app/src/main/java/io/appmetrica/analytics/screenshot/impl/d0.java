package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f58420a;

    public d0(g0 g0Var) {
        this.f58420a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C4719n c4719n, ActivityManager activityManager) {
        Object next;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = nj.s.k();
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ck.p.e(((ActivityManager.RunningServiceInfo) next).process, "com.android.systemui:screenshot"));
        if (((ActivityManager.RunningServiceInfo) next) != null) {
            ((C4728x) g0Var.f58425b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f58426c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c4719n.f58451b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C4719n c4719n = this.f58420a.f58428e;
        if (this.f58420a.f58427d || c4719n == null || !c4719n.f58450a) {
            return;
        }
        Context context = this.f58420a.f58424a.getContext();
        final g0 g0Var = this.f58420a;
        SystemServiceUtils.accessSystemServiceByNameSafely(context, ActivityChooserModel.ATTRIBUTE_ACTIVITY, "running service screenshot captor", "ActivityManager", new FunctionWithThrowable() { // from class: cf.b
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return d0.a(g0Var, this, c4719n, (ActivityManager) obj);
            }
        });
    }
}
