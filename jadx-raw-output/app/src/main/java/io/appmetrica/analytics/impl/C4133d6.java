package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4133d6 extends Qg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f56568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4624wh f56569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4513s6 f56570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L1 f56571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4414o6 f56572j;

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4674yh
    public final synchronized void a() {
        if (this.f58031c) {
            return;
        }
        this.f58031c = true;
        String strA = this.f56570h.f57650a.a();
        L1 l10 = this.f56571i;
        Context context = this.f56568f;
        l10.getClass();
        ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
        if (ck.p.e(strA, serviceInfo != null ? serviceInfo.processName : null)) {
            this.f56572j.a(this.f56569g);
        } else {
            this.f58029a.c();
            this.f58031c = false;
            super.a();
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4674yh
    public final boolean c() {
        this.f56572j.a(this.f56569g);
        return false;
    }

    public C4133d6(Context context, C4433p0 c4433p0, InterfaceC4070al interfaceC4070al, C4624wh c4624wh) {
        super(c4433p0, interfaceC4070al, c4624wh);
        this.f56568f = context;
        this.f56569g = c4624wh;
        this.f56570h = C4105c4.l().i();
        this.f56571i = C4105c4.l().f();
        this.f56572j = new C4414o6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4674yh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return mj.r.f64562a;
    }
}
