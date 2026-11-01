package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v1 f15055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f15056d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f15058f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15053a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15054b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f15057e = new Handler(Looper.getMainLooper(), new b(this));

    public final void a() {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        s sVar = iAConfigManager.f15026u;
        if (!sVar.f15197d) {
            sVar.f15196c.add(this);
        }
        v1 v1Var = new v1(TimeUnit.MINUTES, iAConfigManager.f15026u.f15195b.a("session_duration", 30, 1));
        this.f15055c = v1Var;
        v1Var.f18631e = this.f15058f;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        v1 v1Var = this.f15055c;
        if (v1Var != null) {
            v1Var.f18630d = false;
            v1Var.f18632f = 0L;
            t1 t1Var = v1Var.f18629c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            v1 v1Var2 = new v1(TimeUnit.MINUTES, oVar.a("session_duration", 30, 1), this.f15055c.f18632f);
            this.f15055c = v1Var2;
            v1Var2.f18631e = this.f15058f;
        }
        sVar.f15196c.remove(this);
    }

    public e(x0 x0Var) {
        c cVar = new c(this);
        this.f15058f = new d(this);
        this.f15056d = x0Var;
        Application application = com.fyber.inneractive.sdk.util.o.f18599a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }
}
