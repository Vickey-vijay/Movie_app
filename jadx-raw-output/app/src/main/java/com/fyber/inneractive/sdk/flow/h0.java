package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.Z7;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 implements i0, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InneractiveAdSpot.RequestListener f15449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f15450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f15451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f15452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f15453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f15454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f15455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f15456i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f15459l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15457j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15458k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f15460m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f15461n = new Object();

    public static String a(h0 h0Var) {
        h0Var.getClass();
        return IAlog.a(h0Var);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = (s0) inneractiveUnitController;
            s0Var.setAdSpot(this);
            if (this.f15454g.size() > 0) {
                for (InneractiveUnitController inneractiveUnitController2 : new HashSet(this.f15454g)) {
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f15454g.add(s0Var);
            if (this.f15452e != null) {
                for (s0 s0Var2 : this.f15454g) {
                    if (s0Var2.supports(this)) {
                        this.f15453f = s0Var2;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final x getAdContent() {
        return this.f15452e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f15450c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.f15448a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return IAConfigManager.O.f15018m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return IAConfigManager.O.f15017l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return IAConfigManager.O.f15019n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f15450c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f15453f;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final boolean isReady() {
        boolean z10;
        x xVar;
        x xVar2 = this.f15452e;
        if (xVar2 == null) {
            return false;
        }
        if (xVar2.b() != null) {
            com.fyber.inneractive.sdk.response.e eVarB = this.f15452e.b();
            eVarB.getClass();
            if (eVarB.f18432a < System.currentTimeMillis()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10 && (xVar = this.f15452e) != null) {
            com.fyber.inneractive.sdk.response.e eVarB2 = xVar.b();
            if (!this.f15458k && eVarB2 != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - eVarB2.f18434c);
                long j10 = eVarB2.f18433b;
                long j11 = minutes - j10;
                IAlog.a("Firing Event 802 - AdExpired - time passed- " + j11 + ", sessionTimeOut - " + j10, new Object[0]);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = xVar.f15746a;
                JSONArray jSONArrayB = xVar.f15748c.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB2);
                wVar.f16128b = tVar;
                wVar.f16127a = inneractiveAdRequest;
                wVar.f16130d = jSONArrayB;
                JSONObject jSONObject = new JSONObject();
                Long lValueOf = Long.valueOf(j11);
                try {
                    jSONObject.put("time_passed", lValueOf);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", lValueOf);
                }
                Long lValueOf2 = Long.valueOf(j10);
                try {
                    jSONObject.put("timeout", lValueOf2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "timeout", lValueOf2);
                }
                wVar.f16132f.put(jSONObject);
                wVar.a((String) null);
                this.f15458k = true;
            }
        }
        return !z10 && this.f15452e.e();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
        if (this.f15460m.get()) {
            IAlog.a("%s : loadAd: spot is already destroyed", IAlog.a(this));
            a(this.f15452e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl Start load ad process", IAlog.a(this));
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f15449b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f15449b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f15449b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d.f15849d.a(this.f15448a).c();
        String str2 = this.f15448a;
        this.f15459l = new p(str2);
        if (this.f15451d == null) {
            this.f15451d = new e0(this);
        }
        com.fyber.inneractive.sdk.bidder.adm.y yVar = new com.fyber.inneractive.sdk.bidder.adm.y(str, str2);
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        c0 c0Var = new c0(this, yVar, rVarA, str);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f15806a) {
            Application application = com.fyber.inneractive.sdk.util.o.f18599a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.bidder.adm.t(yVar, c0Var, rVarA));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = this.f15453f;
            if (s0Var != null && s0Var.equals(inneractiveUnitController)) {
                this.f15453f.destroy();
                this.f15453f = null;
            }
            this.f15454g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    public h0() {
        String string = UUID.randomUUID().toString();
        this.f15448a = string;
        this.f15454g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", IAlog.a(this), string);
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(g0 g0Var) {
        this.f15456i = g0Var;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        IAlog.a("%sInneractiveAdSpotImpl spot destroy: %s", IAlog.a(this), this.f15448a);
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            this.f15460m.set(true);
            Iterator it = this.f15454g.iterator();
            while (it.hasNext()) {
                ((InneractiveUnitController) it.next()).destroy();
            }
            this.f15454g.clear();
            a((x) null);
            this.f15449b = null;
            a();
            InneractiveAdSpotManager.get().removeSpot(this);
            return;
        }
        com.fyber.inneractive.sdk.util.r.f18607b.post(new d0(this));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        InneractiveAdRequest inneractiveAdRequest2;
        boolean z10;
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f15449b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f15450c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.f15449b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f15449b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        if (inneractiveAdRequest != null) {
            inneractiveAdRequest2 = inneractiveAdRequest;
        } else {
            inneractiveAdRequest2 = this.f15450c;
        }
        String str = this.f15448a;
        inneractiveAdRequest2.f15701b = str;
        com.fyber.inneractive.sdk.metrics.d.f15849d.a(str).c();
        if (this.f15454g.isEmpty()) {
            IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
            if (this.f15449b != null) {
                if (inneractiveAdRequest == null) {
                    inneractiveAdRequest = this.f15450c;
                }
                a(inneractiveAdRequest, null);
                this.f15449b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        IAConfigManager.b();
        m mVar = this.f15455h;
        if (mVar != null) {
            if (inneractiveAdRequest == null && this.f15450c != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            l lVar = mVar.f15480g;
            if (lVar != null) {
                IAConfigManager.removeListener(lVar);
            }
            com.fyber.inneractive.sdk.network.m mVar2 = mVar.f15561d;
            if (mVar2 != null) {
                mVar2.a();
                mVar.f15561d = null;
            }
            mVar.a(z10);
            mVar.f15559b = null;
        }
        if (inneractiveAdRequest != null) {
            InneractiveAdRequest inneractiveAdRequest3 = this.f15450c;
            if (inneractiveAdRequest3 != null) {
                inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
            }
            this.f15450c = inneractiveAdRequest;
            x xVar = this.f15452e;
            if (xVar != null) {
                xVar.destroy();
                this.f15457j = true;
            }
            Iterator it = this.f15454g.iterator();
            do {
                if (!it.hasNext()) {
                    this.f15450c.f15700a = false;
                    break;
                }
            } while (!(((s0) it.next()) instanceof InneractiveFullscreenUnitController));
        }
        this.f15455h = new m(this.f15448a);
        if (this.f15451d == null) {
            this.f15451d = new e0(this);
        }
        IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.f15455h);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f15806a) {
            Application application = com.fyber.inneractive.sdk.util.o.f18599a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        m mVar3 = this.f15455h;
        if (mVar3 != null) {
            InneractiveAdRequest inneractiveAdRequest4 = this.f15450c;
            mVar3.f15559b = this.f15451d;
            if (IAConfigManager.e()) {
                mVar3.c(inneractiveAdRequest4);
                return;
            }
            l lVar2 = new l(mVar3, inneractiveAdRequest4);
            mVar3.f15480g = lVar2;
            IAConfigManager.addListener(lVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.f15449b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        x xVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar2 = this.f15452e;
        if (xVar2 != null) {
            if (xVar2.c() && (xVar = this.f15452e) != null && !xVar.f15750e) {
                String string = Arrays.toString(Thread.currentThread().getStackTrace());
                IAlog.a("Firing Event 803 - Stack trace - %s", string);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_DESTROYED_WITHOUT_SHOW;
                x xVar3 = this.f15452e;
                InneractiveAdRequest inneractiveAdRequest = xVar3.f15746a;
                com.fyber.inneractive.sdk.response.e eVarB = xVar3.b();
                m mVar = this.f15455h;
                p pVar = this.f15459l;
                com.fyber.inneractive.sdk.config.global.r rVar2 = pVar != null ? pVar.f15560c : null;
                if (mVar != null && (rVar = mVar.f15560c) != null) {
                    jSONArrayB = rVar.b();
                } else {
                    jSONArrayB = rVar2 != null ? rVar2.b() : null;
                }
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                wVar.f16128b = tVar;
                wVar.f16127a = inneractiveAdRequest;
                wVar.f16130d = jSONArrayB;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(Z7.f27985e, string);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", Z7.f27985e, string);
                }
                wVar.f16132f.put(jSONObject);
                wVar.a((String) null);
            }
            this.f15452e.destroy();
            this.f15452e = null;
        }
        this.f15453f = null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.response.e eVar2;
        if (inneractiveAdRequest == null || inneractiveAdRequest.getSelectedUnitConfig() == null) {
            unitDisplayType = null;
        } else if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f15146c != null) {
            unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f15146c.f15131b;
        } else if (((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f15149f != null) {
            unitDisplayType = ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f15149f.f15209j;
        } else {
            unitDisplayType = null;
        }
        x xVar = this.f15452e;
        com.fyber.inneractive.sdk.response.e eVar3 = (xVar == null || (eVar2 = xVar.f15747b) == null) ? eVar : eVar2;
        String str = this.f15448a;
        if (unitDisplayType == null && eVar3 != null) {
            unitDisplayType = eVar3.f18447p;
        }
        UnitDisplayType unitDisplayType2 = unitDisplayType;
        x xVar2 = this.f15452e;
        new com.fyber.inneractive.sdk.metrics.c(eVar3, inneractiveAdRequest, str, unitDisplayType2, xVar2 != null ? xVar2.f15748c.b() : null).a();
    }

    public final void a(x xVar) {
        synchronized (this.f15461n) {
            p pVar = this.f15459l;
            if (pVar != null) {
                pVar.a(true);
                pVar.f15559b = null;
                this.f15459l = null;
            }
            m mVar = this.f15455h;
            if (mVar != null) {
                l lVar = mVar.f15480g;
                if (lVar != null) {
                    IAConfigManager.removeListener(lVar);
                }
                com.fyber.inneractive.sdk.network.m mVar2 = mVar.f15561d;
                if (mVar2 != null) {
                    mVar2.a();
                    mVar.f15561d = null;
                }
                mVar.a(true);
                mVar.f15559b = null;
                this.f15455h = null;
            }
            if (xVar != null) {
                xVar.destroy();
            }
        }
    }
}
