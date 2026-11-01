package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class u extends a implements ValueCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.vast.a f15427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.d f15428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewGroup f15431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f15432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f15433i;

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
        i1 i1Var = e().f16200a;
        if (i1Var != null) {
            i1Var.a(false);
        }
    }

    public q d() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        ViewGroup viewGroup = this.f15431g;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.f15430f) {
            return null;
        }
        i1 i1Var = e().f16200a;
        com.fyber.inneractive.sdk.web.m mVar = i1Var == null ? null : i1Var.f18682b;
        if (mVar == null) {
            return null;
        }
        ViewGroup viewGroupA = a.a(mVar);
        this.f15431g = viewGroupA;
        return viewGroupA;
    }

    public final com.fyber.inneractive.sdk.player.controller.d e() {
        com.fyber.inneractive.sdk.player.controller.d dVar = this.f15428d;
        if (dVar == null) {
            b bVar = this.f15356b;
            dVar = new com.fyber.inneractive.sdk.player.controller.d(bVar.f15359c.f15752a, this.f15427c, bVar.i(), d());
            x0 x0Var = this.f15356b.f15359c;
            i1 i1Var = dVar.f16200a;
            if (i1Var != null) {
                if (i1Var.f18699s == null) {
                    i1Var.setAdContent(x0Var.f15753b);
                }
                if (i1Var.f18698r == null) {
                    i1Var.setAdRequest(x0Var.f15754c);
                }
                if (i1Var.f18700t == null) {
                    i1Var.setAdResponse(x0Var.f15755d);
                }
            }
            this.f15428d = dVar;
        }
        return dVar;
    }

    public boolean f() {
        com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.O.f15026u;
        return sVar != null && sVar.f15195b.a(false, "dt_plbl");
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            IAlog.a("%s Playable detected: %s", this.f15355a, str);
            try {
                this.f15356b.a(new JSONArray(str));
            } catch (JSONException e10) {
                IAlog.f("%s invalid playable detection method: %s", this.f15355a, e10.getMessage());
            }
        }
        this.f15356b.m();
    }

    public u(b bVar) {
        super(bVar);
        this.f15430f = false;
        this.f15432h = new AtomicBoolean(false);
        this.f15433i = new s(this);
        x0 x0Var = bVar.f15359c;
        t0 t0Var = x0Var.f15753b;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f15754c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f15755d;
        this.f15427c = new com.fyber.inneractive.sdk.flow.vast.a(gVar.f18447p, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.f18436e, gVar.f18437f, t0Var.f15749d);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a
    public final void c() {
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f16200a;
        if (i1Var != null) {
            UnitDisplayType unitDisplayType = dVarE.f16202c;
            if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType)) {
                UnitDisplayType.VERTICAL.equals(unitDisplayType);
            }
            i1Var.l();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        a();
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f16200a;
        if (i1Var != null) {
            i1Var.e();
            dVarE.f16200a = null;
        }
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        com.fyber.inneractive.sdk.web.g tVar;
        String str = this.f15429e;
        if (!TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.player.controller.d dVarE = e();
            if (aVar == null) {
                tVar = this.f15433i;
            } else {
                tVar = new t(this, aVar);
            }
            dVarE.a(str, tVar, !(this instanceof p));
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("End-Card HTML not loaded", "No template");
    }
}
