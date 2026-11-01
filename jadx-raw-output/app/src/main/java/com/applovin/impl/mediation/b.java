package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a.InterfaceC0039a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f8193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f8194c;

    public void a() {
        this.f8194c.a();
        this.f8193b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(c3 c3Var) {
        h hVarA;
        if (c3Var == null || (hVarA = c3Var.A()) == null || !c3Var.w().compareAndSet(false, true)) {
            return;
        }
        t2.e(hVarA.c(), c3Var);
    }

    public b(com.applovin.impl.sdk.k kVar) {
        this.f8192a = kVar;
        this.f8193b = new a(kVar);
        this.f8194c = new c(kVar, this);
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(c3 c3Var) {
        c(c3Var);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0039a
    public void b(final c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f8445b.c(c3Var);
            }
        }, c3Var.m0());
    }

    public void e(c3 c3Var) {
        long jN0 = c3Var.n0();
        if (jN0 >= 0) {
            this.f8194c.a(c3Var, jN0);
        }
        if (c3Var.x0() || c3Var.y0()) {
            this.f8193b.a(c3Var, this);
        }
    }
}
