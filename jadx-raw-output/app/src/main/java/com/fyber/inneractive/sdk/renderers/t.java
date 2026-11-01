package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.iab.omid.library.fyber.adsession.AdSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends p0 {
    public v1 E;
    public com.fyber.inneractive.sdk.external.g I;
    public a1 J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s f18410w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public IAmraidWebViewController f18412y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18411x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18413z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public UnitDisplayType F = UnitDisplayType.INTERSTITIAL;
    public boolean G = false;
    public boolean H = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean P() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        s0 s0Var;
        super.a(eVar, activity);
        com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
        l0 l0Var = (xVar == null || (s0Var = ((q0) xVar).f15749d) == null) ? null : ((r0) s0Var).f15146c;
        if (l0Var == null) {
            IAlog.f("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f15579i : null;
        this.f18412y = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f18682b == null) {
            IAlog.f("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        ((q0) xVar).f();
        this.F = l0Var.f15131b;
        this.f18413z = false;
        this.A = false;
        this.J = new a1(this.f15332a);
        this.f15566k = eVar;
        IAmraidWebViewController iAmraidWebViewController2 = this.f18412y;
        if (iAmraidWebViewController2 == null) {
            IAlog.f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f15333b);
            return;
        }
        iAmraidWebViewController2.a(eVar.getCloseButton(), com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton);
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((q0) this.f15333b).f15747b;
        int i10 = fVar.f18436e;
        int i11 = fVar.f18437f;
        boolean z10 = (i10 == 300 && i11 == 250) || (i10 == 600 && i11 == 500);
        this.B = z10;
        if (z10) {
            this.f18412y.setAdDefaultSize(com.fyber.inneractive.sdk.util.o.a(i10), com.fyber.inneractive.sdk.util.o.a(i11));
        }
        if (this.f18410w == null) {
            this.f18410w = new s(this);
        }
        this.f18412y.setListener(this.f18410w);
        InneractiveAdSpot inneractiveAdSpot = this.f15332a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            com.fyber.inneractive.sdk.flow.x adContent = this.f15332a.getAdContent();
            com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(activity, false, adContent.f15746a, adContent.b(), adContent.f15748c);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ia_identifier_overlay);
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar.f15447d;
            iFyberAdIdentifier.f18536k = corner;
            iFyberAdIdentifier.a(viewGroup);
            viewGroup.setVisibility(0);
            this.f18412y.a(viewGroup, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
        }
        R();
        IAmraidWebViewController iAmraidWebViewController3 = this.f18412y;
        ViewGroup layout = this.f15566k.getLayout();
        InneractiveAdRequest inneractiveAdRequest = ((q0) this.f15333b).f15746a;
        iAmraidWebViewController3.a(layout, (ViewGroup.LayoutParams) null);
        this.f18413z = true;
        if (this.F == UnitDisplayType.REWARDED) {
            v1 v1Var = new v1(TimeUnit.SECONDS, IAConfigManager.O.f15026u.f15195b.a("rewarded_mraid_delay", 31, 30));
            this.E = v1Var;
            v1Var.f18631e = new r(this);
            t1 t1Var = new t1(v1Var);
            v1Var.f18629c = t1Var;
            v1Var.f18630d = false;
            t1Var.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean K() {
        return !this.B && this.f18412y.X;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int M() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
        if (xVar == null || (rVar = ((q0) xVar).f15748c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f15333b).f15748c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int N() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
        if (xVar == null || (rVar = ((q0) xVar).f15748c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f15333b).f15748c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long O() {
        int iB;
        com.fyber.inneractive.sdk.response.e eVar;
        int iMin = 5;
        if (this.F == UnitDisplayType.REWARDED) {
            iB = IAConfigManager.O.f15026u.f15195b.a("rewarded_mraid_delay", 31, 30);
            IAlog.a("%sGetting rewarded total delay of %d seconds", IAlog.a(this), Integer.valueOf(iB));
        } else {
            com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.O.f15026u;
            if (sVar == null) {
                iB = 5;
            } else {
                com.fyber.inneractive.sdk.config.o oVar = sVar.f15195b;
                int iB2 = oVar.b("mraid_x_delay_v2", 5, 0);
                com.fyber.inneractive.sdk.config.l lVarA = oVar.a("int_configuration");
                if (lVarA != null && lVarA.f15129a.containsKey("close_d")) {
                    try {
                        iB = lVarA.f15129a.containsKey("close_d") ? Integer.parseInt((String) lVarA.f15129a.get("close_d")) : 5;
                    } catch (Throwable unused) {
                    }
                    if (iB < 0 || iB > 30) {
                        iB = 5;
                    }
                    this.f15575t = true;
                } else if (this.F == UnitDisplayType.INTERSTITIAL) {
                    CreativeType creativeType = CreativeType.PLAYABLE;
                    com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
                    if (creativeType.equals((xVar == null || (eVar = ((q0) xVar).f15747b) == null) ? null : ((com.fyber.inneractive.sdk.response.f) eVar).M)) {
                        iB = oVar.b("d_ad_int_pl", iB2, 5);
                    } else {
                        iB = iB2;
                    }
                } else {
                    iB = iB2;
                }
            }
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (C()) {
                Integer numA = ((com.fyber.inneractive.sdk.config.global.features.c) ((q0) this.f15333b).f15748c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("skip_time_sec");
                int iIntValue = numA != null ? numA.intValue() : 5;
                if (iIntValue >= 0 && iIntValue <= 8) {
                    iMin = iIntValue;
                }
            } else {
                iMin = Math.min(iB, 5);
            }
            iB = Math.min(iMin, iB);
        }
        return iB * 1000;
    }

    public final void R() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.f15333b == null || (iAmraidWebViewController = this.f18412y) == null) {
            IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController.f18682b;
        if (mVar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mVar.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void b(boolean z10) {
        if (!K()) {
            if (z10) {
                this.f15576u.a((String) null);
            } else {
                com.fyber.inneractive.sdk.util.a aVar = this.f15576u;
                aVar.f18557d = 0L;
                aVar.f18558e = 0L;
                aVar.f18559f = 0L;
                aVar.f18555b = false;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f15566k;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f18412y;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f18413z && !this.A && (eventsListener = this.f15334c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f15332a);
        }
        this.f18410w = null;
        v1 v1Var = this.E;
        if (v1Var != null) {
            v1Var.f18631e = null;
            this.E = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f18412y;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.f15831a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void l() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        InneractiveUnitController.EventsListener eventsListener;
        if (this.F == UnitDisplayType.REWARDED && this.G) {
            Q();
        }
        if (!this.A && (eventsListener = this.f15334c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f15332a);
        }
        a1 a1Var = this.J;
        if (a1Var != null && a1Var.f18561b != 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - a1Var.f18561b) - a1Var.f18563d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            long millis = timeUnit.toMillis(jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
            Locale locale = Locale.US;
            String str = seconds + "." + millis;
            a1Var.f18561b = 0L;
            a1Var.f18562c = 0L;
            a1Var.f18563d = 0L;
            InneractiveAdSpot inneractiveAdSpot = a1Var.f18560a;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.INTERSTITIAL_VIEW_TIME;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f15746a : null;
            com.fyber.inneractive.sdk.response.e eVarB = adContent != null ? adContent.b() : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f15748c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f16129c = uVar;
            wVar.f16127a = inneractiveAdRequest;
            wVar.f16130d = jSONArrayB;
            wVar.a("time", str);
            wVar.a((String) null);
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f15332a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof i0)) {
            return;
        }
        ((i0) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean v() {
        boolean z10;
        if (this.f15566k == null) {
            z10 = true;
        } else if (this.F == UnitDisplayType.REWARDED) {
            if (this.G) {
                Q();
            }
            z10 = this.G;
        } else {
            z10 = this.f15571p;
        }
        if (!z10) {
            return true;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f15566k;
        if (eVar == null) {
            return false;
        }
        eVar.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        IAmraidWebViewController iAmraidWebViewController = this.f18412y;
        return c(iAmraidWebViewController != null ? iAmraidWebViewController.f18682b : null);
    }

    public final void Q() {
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.H) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.I != null) {
            com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY);
            com.fyber.inneractive.sdk.external.g gVar = this.I;
            i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(gVar.f15320a.mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f15320a.f15298b;
            if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.f18412y;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.D) {
            J();
        }
        this.H = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void n() {
        v1 v1Var;
        super.n();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f18630d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            if (a1Var.f18561b == 0) {
                a1Var.f18561b = System.currentTimeMillis();
            }
            if (a1Var.f18562c > 0) {
                a1Var.f18563d += System.currentTimeMillis() - a1Var.f18562c;
                a1Var.f18562c = 0L;
            }
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f15576u;
        if (aVar.f18555b && aVar.f18558e > 0) {
            aVar.f18559f += System.currentTimeMillis() - aVar.f18558e;
            aVar.f18558e = 0L;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void s() {
        v1 v1Var;
        super.s();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f18630d = true;
            t1 t1Var = v1Var.f18629c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            a1Var.f18562c = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f15576u;
        if (aVar.f18555b) {
            aVar.f18558e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
        R();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j10) {
        if (this.F == UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.f15575t) {
            return j10;
        }
        long j11 = 13;
        try {
            j11 = Long.parseLong(IAConfigManager.O.f15026u.f15195b.a("mraid_x_fallback_delay", Long.toString(13L)));
        } catch (Throwable unused) {
        }
        return j11 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.I = gVar;
    }
}
