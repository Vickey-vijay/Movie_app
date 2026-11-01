package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.flow.e0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f14874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e f14875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f14876c;

    public v(y yVar, c0 c0Var, com.fyber.inneractive.sdk.response.e eVar) {
        this.f14876c = yVar;
        this.f14874a = c0Var;
        this.f14875b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        InneractiveErrorCode inneractiveErrorCode;
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (eVar == null || exc != null) {
            String message = exc != null ? exc.getMessage() : "empty";
            com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f15849d.b(this.f14876c.f14882d);
            iVarB.f15863a.put(new com.fyber.inneractive.sdk.metrics.h(message), Long.valueOf(System.currentTimeMillis() - iVarB.f15865c));
            if (this.f14874a != null) {
                Exception exc2 = exc != null ? exc : new Exception("adm markup network result is empty");
                c0 c0Var = this.f14874a;
                this.f14876c.getClass();
                if (exc == null || !(exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a)) {
                    inneractiveErrorCode = ((exc instanceof k1) && ((k1) exc).f16038a == 404) ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.CONNECTION_ERROR;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
                }
                c0Var.a(exc2, inneractiveErrorCode, this.f14875b);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f15849d;
        com.fyber.inneractive.sdk.metrics.i iVarB2 = dVar.b(this.f14876c.f14882d);
        iVarB2.f15863a.put(new com.fyber.inneractive.sdk.metrics.h("success"), Long.valueOf(System.currentTimeMillis() - iVarB2.f15865c));
        c0 c0Var2 = this.f14874a;
        if (c0Var2 != null) {
            IAlog.a("%s : InneractiveAdSpotImpl data available", h0.a(c0Var2.f15346d));
            h0 h0Var = c0Var2.f15346d;
            com.fyber.inneractive.sdk.config.global.r rVar = c0Var2.f15344b;
            e0 e0Var = h0Var.f15451d;
            if (h0Var.f15460m.get()) {
                IAlog.a("%s: loadAdWithRetries: spot is already destroyed won't continue", IAlog.a(h0Var));
                h0Var.a(h0Var.f15452e);
                return;
            }
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.f15459l;
            if (pVar != null) {
                pVar.f15559b = e0Var;
                dVar.b(h0Var.f15448a).f15866d = System.currentTimeMillis();
                pVar.f15565g = eVar;
                if (!IAConfigManager.e()) {
                    IAConfigManager.addListener(pVar);
                    IAConfigManager.a();
                } else {
                    pVar.f15560c = rVar;
                    com.fyber.inneractive.sdk.network.p pVar2 = new com.fyber.inneractive.sdk.network.p(rVar, eVar, h0Var.f15448a, pVar);
                    pVar.f15561d = pVar2;
                    pVar2.c();
                }
            }
        }
    }
}
