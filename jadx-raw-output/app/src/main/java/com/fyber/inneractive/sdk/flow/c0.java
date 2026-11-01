package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y f15343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f15344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f15346d;

    public final void a() {
        com.fyber.inneractive.sdk.config.global.q qVar;
        com.fyber.inneractive.sdk.config.global.b bVar;
        com.fyber.inneractive.sdk.config.global.k kVar;
        com.fyber.inneractive.sdk.config.global.l lVar;
        com.fyber.inneractive.sdk.config.global.q qVar2;
        IAlog.a("%s : InneractiveAdSpotImpl markup data available", h0.a(this.f15346d));
        if (this.f15346d.f15460m.get()) {
            h0 h0Var = this.f15346d;
            p pVar = h0Var.f15459l;
            h0Var.a(h0Var.f15452e);
            return;
        }
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f15343a.f14879a;
        if (admParametersOuterClass$AdmParameters != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f15344b;
            List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            rVar.getClass();
            com.fyber.inneractive.sdk.config.global.a aVar = IAConfigManager.O.f15031z;
            aVar.getClass();
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : rVar.f15109b.values()) {
                if (hVar != null && (lVar = aVar.f15075a) != null && (qVar2 = (com.fyber.inneractive.sdk.config.global.q) lVar.f15103a.get(hVar.f15090b)) != null) {
                    hVar.f15105a = qVar2.f15105a;
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            com.fyber.inneractive.sdk.config.global.a aVar2 = IAConfigManager.O.f15031z;
            aVar2.f15076b = rVar;
            for (com.fyber.inneractive.sdk.config.global.features.h hVar2 : rVar.f15109b.values()) {
                for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    String identifier = experiment.getIdentifier();
                    String variant = experiment.getVariant();
                    com.fyber.inneractive.sdk.config.global.l lVar2 = aVar2.f15075a;
                    if (lVar2 != null && (qVar = (com.fyber.inneractive.sdk.config.global.q) lVar2.f15103a.get(hVar2.f15090b)) != null && (bVar = (com.fyber.inneractive.sdk.config.global.b) qVar.f15107c.get(identifier)) != null) {
                        Iterator it = bVar.f15079c.iterator();
                        do {
                            if (!it.hasNext()) {
                                kVar = null;
                                break;
                            }
                            kVar = (com.fyber.inneractive.sdk.config.global.k) it.next();
                        } while (!kVar.f15101b.equals(variant));
                        hVar2.f15091c.put(bVar.f15077a, bVar);
                        if (kVar != null) {
                            hVar2.f15092d.put(bVar.f15077a, kVar);
                        }
                    }
                }
            }
        }
    }

    public c0(h0 h0Var, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        this.f15346d = h0Var;
        this.f15343a = yVar;
        this.f15344b = rVar;
        this.f15345c = str;
    }

    public final void a(Exception exc, InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) {
        i iVar;
        com.fyber.inneractive.sdk.network.t tVar;
        if (this.f15346d.f15460m.get()) {
            IAlog.a("%s : onResponseDataError: spot is already destroyed won't continue", h0.a(this.f15346d));
            h0 h0Var = this.f15346d;
            p pVar = h0Var.f15459l;
            h0Var.a(h0Var.f15452e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl data error", h0.a(this.f15346d));
        com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
        this.f15346d.getClass();
        if (exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a) {
            iVar = i.NATIVE_AD_PARSING_ERROR;
        } else {
            iVar = i.ADM_FETCH_FAILED;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, iVar);
        e0 e0Var = this.f15346d.f15451d;
        if (e0Var != null) {
            e0Var.a(null, eVar, inneractiveInfrastructureError);
        }
        p pVar2 = this.f15346d.f15459l;
        if (pVar2 != null) {
            IAlog.e("%sgot handleFailedLoading! with: %s", pVar2.d(), inneractiveInfrastructureError);
            n nVar = pVar2.f15559b;
            if (nVar != null) {
                ((e0) nVar).a(null, eVar, inneractiveInfrastructureError);
            }
            if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
                pVar2.a(null, eVar);
            }
        }
        h0 h0Var2 = this.f15346d;
        String str = this.f15345c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f15344b;
        h0Var2.getClass();
        int i10 = f0.f15443a[inneractiveErrorCode.ordinal()];
        if (i10 == 1 || i10 == 2) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_MARKUP_FETCHING_ERROR;
        } else if (i10 != 3) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_PARSING_ERROR;
        } else {
            tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_INVALID_NATIVE_RESPONSE;
        }
        if (eVar != null) {
            eVar.D = false;
        }
        String name = exc.getClass().getName();
        if (exc instanceof k1) {
            name = "NetworkStackException";
        }
        JSONArray jSONArrayB = rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f16128b = tVar;
        wVar.f16127a = null;
        wVar.f16130d = jSONArrayB;
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        xVar.a(name, "exception").a(exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : exc, "message");
        InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
        if (inneractiveErrorCode == inneractiveErrorCode2 && exc.getCause() != null && exc.getCause().getCause() != null) {
            xVar.a(exc.getCause().getCause().getMessage(), "reason");
        } else if (inneractiveErrorCode != inneractiveErrorCode2) {
            xVar.a(str, "admPayload");
        }
        wVar.f16132f.put(xVar.f16134a);
        wVar.a((String) null);
    }
}
