package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.y0;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f15332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f15333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveUnitController.EventsListener f15334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15335d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15336e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15337f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f15338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.click.r f15339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f15340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f15341j;

    public int A() {
        return -1;
    }

    public int B() {
        return -1;
    }

    public boolean D() {
        return false;
    }

    public boolean F() {
        return this instanceof com.fyber.inneractive.sdk.renderers.a0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:66:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135 A[LOOP:0: B:70:0x012f->B:72:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:82:0x0195  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b9  */
    public final com.fyber.inneractive.sdk.util.d0 a(Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z10, com.fyber.inneractive.sdk.click.o oVar) {
        String queryParameter;
        String strReplace;
        boolean z11;
        com.fyber.inneractive.sdk.click.r rVar;
        x xVar;
        com.fyber.inneractive.sdk.web.v0 v0VarA;
        x xVar2;
        boolean z12;
        x xVar3;
        com.fyber.inneractive.sdk.click.r rVar2;
        x xVar4;
        com.fyber.inneractive.sdk.ignite.m mVar;
        InneractiveAdSpot inneractiveAdSpot;
        String localUniqueId;
        Iterator it;
        h1 h1Var;
        boolean z13;
        if (!z10 && (!this.f15337f || this.f15335d)) {
            String str2 = this.f15335d ? "external/browser is already open" : "click is in grace period";
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - %s", str2);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception(str2));
        }
        if (context != null) {
            IAlog.a("%sBlocking clicks until grace has ended", IAlog.a(this));
            this.f15337f = false;
            Runnable runnable = this.f15338g;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(runnable);
            }
            a0 a0Var = new a0(this);
            this.f15338g = a0Var;
            com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(a0Var, 1000L);
        }
        a(context, z10, g1Var.f18579a, g1Var.f18580b);
        if (TextUtils.isEmpty(str)) {
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - is empty", new Object[0]);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("empty url"));
        }
        x xVar5 = this.f15333b;
        if (xVar5 != null && xVar5.b() != null && this.f15333b.b().a()) {
            com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
            if (hVar.f15785f) {
                hVar.a((q0.a) null);
            }
        }
        this.f15340i = new z(this, g1Var, gVar, oVar);
        if (TextUtils.isEmpty(str)) {
            queryParameter = null;
        } else {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme == null || !scheme.equals("fybernativebrowser") || host == null || !host.equals("navigate")) {
                queryParameter = null;
            } else {
                queryParameter = uri.getQueryParameter("url");
            }
        }
        String scheme2 = !TextUtils.isEmpty(str) ? Uri.parse(str).getScheme() : null;
        if (TextUtils.isEmpty(queryParameter)) {
            strReplace = str;
            if (!strReplace.contains("FYBER_OPEN_BROWSER")) {
                z11 = true;
            }
            if (strReplace.contains("[IS_CTA_CLICK]")) {
                if (D() || gVar != com.fyber.inneractive.sdk.util.g.VIDEO_CTA) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                strReplace = strReplace.replace("[IS_CTA_CLICK]", String.valueOf(z13));
            }
            if (z() != null) {
                x();
            }
            rVar = this.f15339h;
            if (rVar != null) {
                rVar.f14997e = true;
                it = rVar.f15001i.iterator();
                while (it.hasNext()) {
                    ((com.fyber.inneractive.sdk.click.a) it.next()).cancel();
                }
                rVar.f15001i.clear();
                h1Var = rVar.f15000h;
                if (h1Var != null) {
                    h1Var.f16085a = true;
                }
                rVar.f14996d = null;
                this.f15339h = null;
            }
            com.fyber.inneractive.sdk.click.r rVar3 = new com.fyber.inneractive.sdk.click.r(z11);
            rVar3.f15001i.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z11, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
            this.f15339h = rVar3;
            xVar = this.f15333b;
            if (xVar != null) {
                v0VarA = xVar.a();
            } else {
                v0VarA = null;
            }
            if (v0VarA != null) {
                v0VarA.f18769i = this;
            }
            xVar2 = this.f15333b;
            if (xVar2 == null && xVar2.a(g1Var.f18581c, gVar)) {
                z12 = true;
            } else {
                z12 = false;
            }
            xVar3 = this.f15333b;
            if (xVar3 != null && xVar3.b() != null) {
                this.f15333b.f();
            }
            rVar2 = this.f15339h;
            if (rVar2 != null) {
                z zVar = this.f15340i;
                xVar4 = this.f15333b;
                if (xVar4 != null || xVar4.b() == null) {
                    mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
                } else {
                    mVar = this.f15333b.b().H;
                }
                com.fyber.inneractive.sdk.ignite.m mVar2 = mVar;
                inneractiveAdSpot = this.f15332a;
                if (inneractiveAdSpot != null) {
                    localUniqueId = inneractiveAdSpot.getLocalUniqueId();
                } else {
                    localUniqueId = null;
                }
                rVar2.a(context, strReplace, zVar, v0VarA, z12, mVar2, localUniqueId);
            }
            com.fyber.inneractive.sdk.util.g0 g0Var = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
            context.getClass();
            return new com.fyber.inneractive.sdk.util.d0(g0Var, null);
        }
        strReplace = queryParameter;
        z11 = false;
        if (strReplace.contains("[IS_CTA_CLICK]")) {
            if (D()) {
                z13 = false;
            } else {
                z13 = false;
            }
            strReplace = strReplace.replace("[IS_CTA_CLICK]", String.valueOf(z13));
        }
        if (z() != null) {
            x();
        }
        rVar = this.f15339h;
        if (rVar != null) {
            rVar.f14997e = true;
            it = rVar.f15001i.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).cancel();
            }
            rVar.f15001i.clear();
            h1Var = rVar.f15000h;
            if (h1Var != null) {
                h1Var.f16085a = true;
            }
            rVar.f14996d = null;
            this.f15339h = null;
        }
        com.fyber.inneractive.sdk.click.r rVar4 = new com.fyber.inneractive.sdk.click.r(z11);
        rVar4.f15001i.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z11, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
        this.f15339h = rVar4;
        xVar = this.f15333b;
        if (xVar != null) {
            v0VarA = xVar.a();
        } else {
            v0VarA = null;
        }
        if (v0VarA != null) {
            v0VarA.f18769i = this;
        }
        xVar2 = this.f15333b;
        if (xVar2 == null) {
            z12 = false;
        } else {
            z12 = false;
        }
        xVar3 = this.f15333b;
        if (xVar3 != null) {
            this.f15333b.f();
        }
        rVar2 = this.f15339h;
        if (rVar2 != null) {
            z zVar2 = this.f15340i;
            xVar4 = this.f15333b;
            if (xVar4 != null) {
                mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
            } else {
                mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
            }
            com.fyber.inneractive.sdk.ignite.m mVar3 = mVar;
            inneractiveAdSpot = this.f15332a;
            if (inneractiveAdSpot != null) {
                localUniqueId = inneractiveAdSpot.getLocalUniqueId();
            } else {
                localUniqueId = null;
            }
            rVar2.a(context, strReplace, zVar2, v0VarA, z12, mVar3, localUniqueId);
        }
        com.fyber.inneractive.sdk.util.g0 g0Var2 = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
        context.getClass();
        return new com.fyber.inneractive.sdk.util.d0(g0Var2, null);
    }

    public final void b(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f18442k;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.e("%sfiring impression!", IAlog.a(this));
        IAlog.d("AD_IMPRESSION", new Object[0]);
        z0.b(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public void d(View view) {
    }

    public void e(View view) {
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f15335d) {
            this.f15335d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.f15334c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.f15334c.onAdWillCloseInternalBrowser(this.f15332a);
        }
    }

    public abstract View z();

    public final boolean C() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar = this.f15333b;
        if (xVar != null && (rVar = xVar.f15748c) != null && rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.f15333b.f15748c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar.getClass();
            if (new ArrayList(cVar.f15091c.values()).size() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean E() {
        x xVar = this.f15333b;
        if (xVar != null) {
            return xVar.c();
        }
        return true;
    }

    public final void H() {
        if (this.f15334c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.f15334c.onAdWillOpenExternalApp(this.f15332a);
        }
    }

    public final void J() {
        x xVar = this.f15333b;
        if (xVar == null || xVar.b() == null) {
            return;
        }
        String str = this.f15333b.b().f18448q;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.e("%sfiring rewarded completion!", IAlog.a(this));
        IAlog.d("AD_REWARDED_COMPLETION", new Object[0]);
        z0.b(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.f15335d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.f15335d = false;
        }
        Runnable runnable = this.f15338g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(runnable);
            this.f15338g = null;
        }
        this.f15333b = null;
        this.f15334c = null;
        this.f15332a = null;
        if (this.f15339h != null) {
            I();
            com.fyber.inneractive.sdk.click.r rVar = this.f15339h;
            rVar.f14997e = true;
            Iterator it = rVar.f15001i.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).cancel();
            }
            rVar.f15001i.clear();
            h1 h1Var = rVar.f15000h;
            if (h1Var != null) {
                h1Var.f16085a = true;
            }
            rVar.f14996d = null;
            this.f15339h = null;
            this.f15340i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f15332a = inneractiveAdSpot;
        this.f15333b = inneractiveAdSpot.getAdContent();
        this.f15334c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public final com.fyber.inneractive.sdk.ignite.m p() {
        x xVar = this.f15333b;
        return (xVar == null || !xVar.d() || this.f15333b.b() == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : this.f15333b.b().H;
    }

    public final void G() {
        com.fyber.inneractive.sdk.response.e eVarB;
        String advertiserDomain;
        Context contextY = y();
        if (!this.f15336e && this.f15334c != null) {
            IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
            this.f15334c.onAdImpression(this.f15332a);
            x xVar = this.f15333b;
            if (xVar != null && (eVarB = xVar.b()) != null) {
                IAConfigManager iAConfigManager = IAConfigManager.O;
                com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager.f15029x;
                if (x0Var != null) {
                    UnitDisplayType unitDisplayType = eVarB.f18447p;
                    ImpressionData impressionData = eVarB.f18451t;
                    if (impressionData != null) {
                        advertiserDomain = impressionData.getAdvertiserDomain();
                    } else {
                        advertiserDomain = null;
                    }
                    x0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", advertiserDomain);
                    x0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVarB.A);
                    if (this.f15333b.isVideoAd()) {
                        x0Var.a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                        x0Var.a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                    }
                    x0Var.a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
                }
                y0 y0Var = iAConfigManager.A;
                com.fyber.inneractive.sdk.config.s0 s0Var = this.f15333b.f15749d;
                ImpressionData impressionData2 = eVarB.f18451t;
                if (s0Var != null) {
                    OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.f18634a;
                    if (onGlobalImpressionDataListener != null) {
                        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                        SpecialsBridge.fyberOnImpression(onGlobalImpressionDataListener, r0Var.f15145b, r0Var.f15144a, impressionData2);
                    }
                } else {
                    y0Var.getClass();
                }
                InneractiveUnitController.EventsListener eventsListener = this.f15334c;
                if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                    ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f15332a, eVarB.f18451t);
                } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                    ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f15332a, eVarB.f18451t);
                }
                com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(contextY);
                if (bVarA == null) {
                    bVarA = null;
                }
                String str = eVarB.f18444m;
                if (!TextUtils.isEmpty(str) && bVarA != null) {
                    bVarA.a(str, null);
                }
            }
            this.f15336e = true;
        }
    }

    public void I() {
        View viewZ = z();
        if (viewZ != null && this.f15341j != null && viewZ.getParent() != null && (viewZ.getParent() instanceof ViewGroup)) {
            viewZ.getLayoutParams();
            ((ViewGroup) viewZ.getParent()).removeView(this.f15341j);
            e(this.f15341j);
            this.f15341j = null;
        }
    }

    public final Context c(View view) {
        View view2;
        View[] viewArr = {view, z()};
        for (int i10 = 0; i10 < 2; i10++) {
            view2 = viewArr[i10];
            if (view2 != null) {
                return com.fyber.inneractive.sdk.util.o.a(view2);
            }
        }
        view2 = null;
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        H();
    }

    public void u() {
        G();
    }

    public void x() {
        View viewZ = z();
        if (viewZ != null && viewZ.getParent() != null && (viewZ.getParent() instanceof ViewGroup) && this.f15341j == null) {
            View viewInflate = View.inflate(viewZ.getContext(), R.layout.ia_layout_click_overlay, null);
            this.f15341j = viewInflate;
            if (viewInflate != null) {
                ((ViewGroup) viewZ.getParent()).addView(this.f15341j, viewZ.getLayoutParams());
                d(this.f15341j);
            }
        }
    }

    public Context y() {
        return com.fyber.inneractive.sdk.util.o.a(z());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b9  */
    public final void b(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        boolean z10;
        boolean z11;
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.config.global.r rVar2;
        com.fyber.inneractive.sdk.config.global.r rVar3;
        x xVar = this.f15333b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f15746a : null;
        com.fyber.inneractive.sdk.response.e eVarB = xVar != null ? xVar.b() : null;
        x xVar2 = this.f15333b;
        JSONArray jSONArrayB = (xVar2 == null || (rVar3 = xVar2.f15748c) == null) ? null : rVar3.b();
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FYBER_SUCCESS_CLICK;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
        wVar.f16129c = uVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArrayB;
        com.fyber.inneractive.sdk.network.x xVar3 = new com.fyber.inneractive.sdk.network.x();
        int iB = B();
        int iA = A();
        long j10 = bVar.f14964e;
        if (j10 != 0) {
            xVar3.a(Long.valueOf(j10), "time_passed");
        }
        JSONArray jSONArray = new JSONArray();
        for (com.fyber.inneractive.sdk.click.j jVar : bVar.f14965f) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", jVar.f14982a);
                jSONObject.put("success", jVar.f14983b);
                jSONObject.put("opened_by", jVar.f14984c);
                jSONObject.put("reason", jVar.f14985d);
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        xVar3.a(jSONArray, "urls");
        xVar3.a(gVar, "origin");
        if (gVar == com.fyber.inneractive.sdk.util.g.FMP_ENDCARD) {
            xVar3.a(gVar.a(), "version");
        }
        if (g1Var != null && g1Var.f18581c) {
            xVar3.a(Boolean.TRUE, "is_auto_click");
        }
        boolean z12 = false;
        if (g1Var != null) {
            if (g1Var.f18579a > 0.0f && g1Var.f18580b > 0.0f) {
                int iB2 = E() ? iB : com.fyber.inneractive.sdk.util.o.b(iB);
                float f10 = iB2 == 0 ? 0.0f : g1Var.f18579a / iB2;
                int iB3 = E() ? iA : com.fyber.inneractive.sdk.util.o.b(iA);
                float f11 = iB3 != 0 ? g1Var.f18580b / iB3 : 0.0f;
                IAlog.a("Point location -  x - %.2f , y- %.2f", Float.valueOf(f10), Float.valueOf(f11));
                E();
                Locale locale = Locale.ENGLISH;
                com.fyber.inneractive.sdk.network.x xVarA = xVar3.a(String.format(locale, "%.2f", Float.valueOf(f10)), "td_x");
                E();
                xVarA.a(String.format(locale, "%.2f", Float.valueOf(f11)), "td_y");
            }
        }
        if (E() || F()) {
            xVar3.a(com.fyber.inneractive.sdk.util.o.c() == 1 ? "p" : "l", "o");
        } else if (iB > 0 || iA > 0) {
            xVar3.a(Integer.valueOf(iB), "b_w");
            xVar3.a(Integer.valueOf(iA), "b_h");
        }
        x xVar4 = this.f15333b;
        com.fyber.inneractive.sdk.config.global.features.d dVar = (xVar4 == null || (rVar2 = xVar4.f15748c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.d) rVar2.a(com.fyber.inneractive.sdk.config.global.features.d.class);
        if (dVar == null) {
            z10 = false;
        } else {
            com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f15089e;
            if (aVar != null ? aVar.f15870d : false) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            if (com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD.equals(gVar) || com.fyber.inneractive.sdk.util.g.VIDEO_CTA.equals(gVar)) {
                z12 = true;
            } else if (com.fyber.inneractive.sdk.util.g.VIDEO_CLICK.equals(gVar)) {
                x xVar5 = this.f15333b;
                com.fyber.inneractive.sdk.config.global.features.u uVar2 = (xVar5 == null || (rVar = xVar5.f15748c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class);
                if (uVar2 == null) {
                    z11 = false;
                } else {
                    Boolean boolC = uVar2.c("show_cta");
                    if (boolC != null ? boolC.booleanValue() : true) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            xVar3.a(IAConfigManager.O.f15020o, "cta_lng");
        }
        wVar.f16132f.put(xVar3.f16134a);
        wVar.a((String) null);
    }

    public static void a(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f18443l;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.d("AD_CLICKED", new Object[0]);
        z0.b(str);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        b(bVar, g1Var, gVar);
    }

    public final void a(String str, com.fyber.inneractive.sdk.click.q qVar) {
        com.fyber.inneractive.sdk.response.e eVarB;
        JSONArray jSONArrayB;
        InneractiveAdRequest inneractiveAdRequest;
        x xVar = this.f15333b;
        if (xVar != null) {
            eVarB = xVar.b();
            x xVar2 = this.f15333b;
            inneractiveAdRequest = xVar2.f15746a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar2.f15748c;
            jSONArrayB = rVar != null ? rVar.b() : null;
        } else {
            eVarB = null;
            jSONArrayB = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
        wVar.f16129c = uVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArrayB;
        wVar.a("url", str).a("fallback", (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((String) null);
    }

    public final void a(Context context, boolean z10, float f10, float f11) {
        com.fyber.inneractive.sdk.response.e eVarB;
        if (z10) {
            IAlog.a("%s : will not notify click on fallback", IAlog.a(this));
            return;
        }
        if (this.f15334c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.f15334c.onAdClicked(this.f15332a);
        }
        x xVar = this.f15333b;
        if (xVar == null || (eVarB = xVar.b()) == null) {
            return;
        }
        IAConfigManager.O.f15029x.a(eVarB.f18447p, "LAST_CLICKED", "1");
        com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(context);
        if (bVarA == null) {
            bVarA = null;
        }
        String str = eVarB.f18445n;
        Float fValueOf = Float.valueOf(f10);
        Float fValueOf2 = Float.valueOf(f11);
        if (!fValueOf.isNaN() && !fValueOf2.isNaN() && f10 >= 0.0f && f11 >= 0.0f) {
            MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f10, f11, 0);
            if (TextUtils.isEmpty(str) || bVarA == null) {
                return;
            }
            bVarA.a(str, motionEventObtain);
            return;
        }
        if (TextUtils.isEmpty(str) || bVarA == null) {
            return;
        }
        bVarA.a(str, null);
    }

    public final void a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        x xVar = this.f15333b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.f15746a : null, xVar != null ? xVar.b() : null);
        if (this.f15334c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.f15334c.onAdEnteredErrorState(this.f15332a, webViewRendererProcessHasGoneError);
        }
    }

    public static void a(com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        com.fyber.inneractive.sdk.cache.session.e eVar = IAConfigManager.O.f15029x.f15221a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
    }
}
