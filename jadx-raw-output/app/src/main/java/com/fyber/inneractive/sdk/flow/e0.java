package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f15354a;

    public e0(h0 h0Var) {
        this.f15354a = h0Var;
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f15354a.f15460m.get()) {
            IAlog.a("%s : onAdRequestFailed: spot is already destroyed", h0.a(this.f15354a));
            h0 h0Var = this.f15354a;
            p pVar = h0Var.f15459l;
            h0Var.a(h0Var.f15452e);
            return;
        }
        if (this.f15354a.f15449b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f15354a.a(inneractiveAdRequest, eVar);
            }
            h0 h0Var2 = this.f15354a;
            if (!h0Var2.f15457j) {
                g0 g0Var = h0Var2.f15456i;
                if (g0Var != null) {
                    g0Var.onAdRefreshFailed(h0Var2, inneractiveInfrastructureError.getErrorCode());
                    return;
                }
                return;
            }
            m mVar = h0Var2.f15455h;
            p pVar2 = h0Var2.f15459l;
            JSONArray jSONArrayB = null;
            com.fyber.inneractive.sdk.config.global.r rVar2 = pVar2 != null ? pVar2.f15560c : null;
            if (mVar != null && (rVar = mVar.f15560c) != null) {
                jSONArrayB = rVar.b();
            } else if (rVar2 != null) {
                jSONArrayB = rVar2.b();
            }
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, h0Var2.f15452e, eVar, jSONArrayB);
            h0 h0Var3 = this.f15354a;
            InneractiveAdSpot.RequestListener requestListener = h0Var3.f15449b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(h0Var3, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
