package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IAmraidWebViewController f15579i;

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f15749d;
        if (s0Var == null || (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f15146c) == null || (unitDisplayType = l0Var.f15131b) == null) {
            return false;
        }
        return unitDisplayType.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        AdSession adSession;
        if (this.f15726g != null && c()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f15726g;
            v0Var.f18785y = true;
            v0Var.D = false;
            v0Var.f18762b.f15787h.remove(v0Var);
            v0Var.f18769i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f15726g = null;
        }
        IAmraidWebViewController iAmraidWebViewController = this.f15579i;
        if (iAmraidWebViewController != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f15831a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f15831a = null;
                eVar.f15832b = null;
            }
            this.f15579i.e();
            this.f15579i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        IAmraidWebViewController iAmraidWebViewController = this.f15579i;
        return (iAmraidWebViewController == null || iAmraidWebViewController.f18682b == null) ? false : true;
    }

    public q0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
    }
}
