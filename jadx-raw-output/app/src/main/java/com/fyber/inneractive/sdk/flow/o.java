package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o implements com.fyber.inneractive.sdk.interfaces.a, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f15558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f15559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f15560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.m f15561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15563f = false;

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (IAlog.f18551a <= 3) {
            Thread.dumpStack();
        }
        IAlog.e("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.f15559b != null) {
            if (eVar != null && eVar.f18440i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f18440i + ": " + eVar.f18441j));
            }
            ((e0) this.f15559b).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    public void b(InneractiveAdRequest inneractiveAdRequest) {
    }

    public final com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f15558a;
        if (cVar == null) {
            return null;
        }
        k kVar = (k) cVar;
        x xVar = kVar.f15465c;
        return xVar != null ? xVar.b() : kVar.f15464b;
    }

    public o(String str) {
        this.f15562e = str;
    }

    public String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a(InneractiveAdRequest inneractiveAdRequest) {
        x xVar;
        com.fyber.inneractive.sdk.response.e eVar;
        s0 s0Var;
        IAlog.e("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f15558a;
        if (cVar != null) {
            n nVar = this.f15559b;
            if (nVar == null || (xVar = ((k) cVar).f15465c) == null) {
                IAlog.b("%sgot onAdLoaded! but content or listener is null", d());
            } else {
                e0 e0Var = (e0) nVar;
                if (e0Var.f15354a.f15460m.get()) {
                    IAlog.a("%s: onAdLoaded: spot is already destroyed", h0.a(e0Var.f15354a));
                    h0 h0Var = e0Var.f15354a;
                    p pVar = h0Var.f15459l;
                    h0Var.a(xVar);
                } else {
                    h0 h0Var2 = e0Var.f15354a;
                    if (!h0Var2.f15457j && (s0Var = h0Var2.f15453f) != null && s0Var.supportsRefresh()) {
                        if (e0Var.f15354a.f15453f.canRefreshAd()) {
                            h0 h0Var3 = e0Var.f15354a;
                            h0Var3.f15452e = xVar;
                            xVar.f15746a = inneractiveAdRequest;
                            g0 g0Var = h0Var3.f15456i;
                            if (g0Var != null) {
                                g0Var.onAdRefreshed(h0Var3);
                            } else {
                                s0 s0Var2 = h0Var3.f15453f;
                                if (s0Var2 instanceof InneractiveAdViewUnitController) {
                                    ((InneractiveAdViewUnitController) s0Var2).onAdRefreshed(h0Var3);
                                }
                            }
                        } else {
                            IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", h0.a(e0Var.f15354a));
                            h0 h0Var4 = e0Var.f15354a;
                            h0Var4.f15456i.onAdRefreshFailed(h0Var4, InneractiveErrorCode.CANCELLED);
                        }
                    } else {
                        h0 h0Var5 = e0Var.f15354a;
                        h0Var5.f15452e = xVar;
                        xVar.f15746a = inneractiveAdRequest;
                        Iterator it = h0Var5.f15454g.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                s0 s0Var3 = (s0) it.next();
                                if (s0Var3.supports(h0Var5)) {
                                    h0Var5.f15453f = s0Var3;
                                    h0 h0Var6 = e0Var.f15354a;
                                    InneractiveAdSpot.RequestListener requestListener = h0Var6.f15449b;
                                    if (requestListener != null) {
                                        if (requestListener instanceof InneractiveAdSpot.NativeAdRequestListener) {
                                            InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                            s0 s0Var4 = h0Var6.f15453f;
                                            if ((xVar instanceof w0) && (s0Var4 instanceof NativeAdUnitController)) {
                                                w0 w0Var = (w0) xVar;
                                                w0Var.f15743v = (NativeAdUnitController) s0Var4;
                                                nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(h0Var6, w0Var);
                                            } else {
                                                IAlog.b("%s: Invalid native response: controller or/and content mismatch", IAlog.a(h0Var6));
                                                nativeAdRequestListener.onInneractiveFailedAdRequest(h0Var6, InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                            }
                                        } else {
                                            requestListener.onInneractiveSuccessfulAdRequest(h0Var6);
                                        }
                                    }
                                    e0Var.f15354a.f15457j = false;
                                }
                            } else {
                                IAlog.a("%sCannot find appropriate unit controller for unit: %s", h0.a(e0Var.f15354a), e0Var.f15354a.f15452e.f15749d);
                                m mVar = e0Var.f15354a.f15455h;
                                com.fyber.inneractive.sdk.response.e eVarC = mVar != null ? mVar.c() : null;
                                e0Var.a(inneractiveAdRequest, eVarC, new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.COULD_NOT_SELECT_UNIT_CONTROLLER, new Exception("Cannot find appropriate unit controller for unit: " + e0Var.f15354a.f15452e.f15749d)));
                                h0 h0Var7 = e0Var.f15354a;
                                h0Var7.f15452e = null;
                                h0Var7.f15457j = false;
                            }
                        }
                    }
                    String str = e0Var.f15354a.f15448a;
                    com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f15849d;
                    dVar.a(str).e();
                    dVar.a(str).b();
                    h0 h0Var8 = e0Var.f15354a;
                    x xVar2 = h0Var8.f15452e;
                    if (xVar2 != null && (eVar = xVar2.f15747b) != null && eVar.f18447p != null) {
                        x xVar3 = h0Var8.f15452e;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3.f15747b;
                        new com.fyber.inneractive.sdk.metrics.c(eVar2, h0Var8.f15450c, h0Var8.f15448a, eVar2.f18447p, xVar3.f15748c.b()).a();
                    }
                }
            }
            this.f15558a = null;
        }
        b(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        x xVar;
        IAlog.e("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f15558a;
        InneractiveAdRequest inneractiveAdRequest = (cVar == null || (xVar = ((k) cVar).f15465c) == null) ? null : xVar.f15746a;
        com.fyber.inneractive.sdk.response.e eVarC = c();
        IAlog.e("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        n nVar = this.f15559b;
        if (nVar != null) {
            ((e0) nVar).a(inneractiveAdRequest, eVarC, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
            a(inneractiveAdRequest, eVarC);
        }
    }

    public void a(boolean z10) {
        this.f15563f = true;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f15558a;
        if (cVar == null || !z10) {
            return;
        }
        cVar.cancel();
        x xVar = ((k) this.f15558a).f15465c;
        if (xVar != null) {
            xVar.destroy();
        }
        this.f15558a = null;
    }
}
