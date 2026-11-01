package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends k implements com.fyber.inneractive.sdk.player.s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f15696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f15698o = new t(this);

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        InneractiveVideoError inneractiveVideoError;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (this.f15696m != null) {
            com.fyber.inneractive.sdk.response.e eVar = this.f15464b;
            if (eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).O) == null) {
                inneractiveVideoError = null;
            } else {
                inneractiveVideoError = bVar.f15875d.size() == 0 ? new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, null) : new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, null);
            }
            this.f15696m.a(inneractiveVideoError, null, true);
        }
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(this.f15474l);
        this.f15473k.a();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        IAlog.a(IAlog.a(this) + "start called", new Object[0]);
        a(this.f15469g, (com.fyber.inneractive.sdk.response.g) this.f15464b, this.f15463a, this);
    }

    public final com.fyber.inneractive.sdk.player.ui.remote.g j() {
        com.fyber.inneractive.sdk.player.a aVar;
        com.fyber.inneractive.sdk.player.ui.remote.g gVar;
        com.fyber.inneractive.sdk.player.t tVar = this.f15696m;
        if (tVar == null || (aVar = tVar.f18044f) == null || (gVar = ((com.fyber.inneractive.sdk.player.n) aVar).f18030u) == null) {
            return null;
        }
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(this.f15474l);
        this.f15473k.a();
    }

    public final void a(Exception exc, String str, boolean z10) {
        HashMap map = new HashMap();
        map.put(UnifiedMediationParams.KEY_DESCRIPTION, str);
        if (exc != null) {
            map.put("exception", exc.getMessage());
        }
        if (j() != null) {
            j().f18119a.a();
        }
        com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR.name(), this.f15697n, this.f15463a, this.f15464b, map, Boolean.valueOf(z10));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.r.f18606a.execute(new e(new f(this.f15464b, this.f15463a, "send_failed_vast_creatives", this.f15469g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.player.s sVar) {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration;
        String str;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        com.fyber.inneractive.sdk.config.s0 s0VarF = f();
        if (s0VarF == null && gVar != null) {
            s0VarF = com.fyber.inneractive.sdk.config.a.a(gVar.f18446o);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = null;
        com.fyber.inneractive.sdk.model.vast.b bVar3 = gVar == null ? null : gVar.O;
        if (bVar3 != null && bVar3.f15875d.size() < bVar3.f15880i) {
            bVar3.f15875d.clear();
            bVar3.f15878g.clear();
            bVar3.f15875d.addAll(bVar3.f15882k);
            bVar3.f15878g.addAll(bVar3.f15883l);
        }
        t0 t0Var = new t0(s0VarF, rVar, gVar, inneractiveAdRequest);
        this.f15465c = t0Var;
        com.fyber.inneractive.sdk.player.t tVar2 = new com.fyber.inneractive.sdk.player.t(gVar, inneractiveAdRequest, t0Var, sVar);
        this.f15696m = tVar2;
        t0 t0Var2 = (t0) this.f15465c;
        t0Var2.f15694i = tVar2;
        t0Var2.f15751f = this.f15470h;
        this.f15697n = bVar3 != null ? bVar3.f15885n : null;
        tVar2.f18043e = null;
        if (gVar != null && (bVar2 = gVar.O) != null) {
            tVar2.f18043e = (com.fyber.inneractive.sdk.model.vast.r) bVar2.f15875d.poll();
        }
        if (tVar2.f18043e == null) {
            InneractiveVideoError.Error playerError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i10 = com.fyber.inneractive.sdk.player.r.f18038a[playerError.ordinal()];
            if (i10 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i10 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i10 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i10 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i10 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest2 = tVar2.f18040b;
            com.fyber.inneractive.sdk.response.g gVar2 = tVar2.f18041c;
            JSONArray jSONArrayB = tVar2.f18046h.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar2);
            wVar.f16128b = tVar;
            wVar.f16127a = inneractiveAdRequest2;
            wVar.f16130d = jSONArrayB;
            wVar.a((String) null);
            sVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VAST_NO_MEDIA_FILES));
        } else {
            try {
                tVar2.f18044f = tVar2.f18039a.a();
            } catch (Throwable th2) {
                tVar2.f18042d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CREATE_FLOW_MANAGER, th2));
            }
            com.fyber.inneractive.sdk.player.a aVar = tVar2.f18044f;
            if (aVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
                com.fyber.inneractive.sdk.measurement.e eVar = nVar.f17966d;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.measurement.f fVar = new com.fyber.inneractive.sdk.measurement.f();
                    ArrayList arrayList = nVar.f18025p.f15876e;
                    t0 t0Var3 = nVar.f17964b;
                    try {
                        try {
                            CreativeType creativeType = CreativeType.VIDEO;
                            ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                            Owner owner = Owner.NATIVE;
                            adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                        } catch (Throwable th3) {
                            fVar.a(th3);
                            adSessionConfigurationCreateAdSessionConfiguration = null;
                        }
                        ArrayList arrayListA = fVar.a(arrayList);
                        Partner partner = eVar.f15810e;
                        if (partner != null && (str = eVar.f15807b) != null) {
                            try {
                                adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, arrayListA, "", "");
                            } catch (Throwable th4) {
                                fVar.a(th4);
                            }
                        }
                        AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
                        fVar.f15815a = adSessionCreateAdSession;
                        fVar.f15816b = AdEvents.createAdEvents(adSessionCreateAdSession);
                        fVar.f15817c = MediaEvents.createMediaEvents(fVar.f15815a);
                        fVar.f15815a.start();
                        fVar.f15820f = t0Var3;
                    } catch (Throwable th5) {
                        fVar.a(th5);
                    }
                    nVar.f17967e = fVar;
                    nVar.f17968f = new com.fyber.inneractive.sdk.player.p(fVar);
                }
                if (nVar.f17967e == null && (bVar = nVar.f18025p) != null) {
                    for (com.fyber.inneractive.sdk.measurement.h hVar : bVar.f15876e) {
                        com.fyber.inneractive.sdk.measurement.i iVar = com.fyber.inneractive.sdk.measurement.i.ERROR_DURING_RESOURCE_LOAD;
                        com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_VERIFICATION_NOT_EXECUTED;
                        com.fyber.inneractive.sdk.player.n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar), iVar), xVar);
                    }
                }
            }
            tVar2.a();
        }
        if (TextUtils.isEmpty(this.f15697n)) {
            return;
        }
        IAConfigManager.O.f15024s.a(new com.fyber.inneractive.sdk.network.v0(this.f15698o, com.fyber.inneractive.sdk.util.o.f18599a, new com.fyber.inneractive.sdk.cache.l(this.f15697n)));
    }
}
