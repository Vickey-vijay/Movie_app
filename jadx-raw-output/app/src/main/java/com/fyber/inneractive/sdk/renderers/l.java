package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.mraid.f0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.ironsource.G5;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends com.fyber.inneractive.sdk.flow.b0 implements com.fyber.inneractive.sdk.interfaces.d, com.fyber.inneractive.sdk.util.a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InneractiveAdViewUnitController f18379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAmraidWebViewController f18380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f18381n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f18383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f18384q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f18386s;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f18392y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18378k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18382o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f18385r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18387t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f18388u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18389v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18390w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18391x = false;

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof q0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        return this.f18380m.f18705d0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int A() {
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f18682b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f18380m.f18706e0) : com.fyber.inneractive.sdk.util.o.c(this.f18380m.f18682b.getHeight());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int B() {
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f18682b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f18380m.f18705d0) : com.fyber.inneractive.sdk.util.o.c(this.f18380m.f18682b.getWidth());
        }
        return -1;
    }

    public final void K() {
        if (this.f18386s != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(this.f18386s);
            this.f18386s = null;
        }
    }

    public final void L() {
        d dVar = this.f18392y;
        if (dVar != null) {
            dVar.f18366g = false;
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar.f18369j);
        }
        if (this.f18380m != null) {
            K();
            com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
            if (xVar != null) {
                ((q0) xVar).destroy();
            }
            this.f18380m = null;
            this.f15333b = null;
            ViewGroup viewGroup = this.f18383p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f18384q);
            }
            j jVar = this.f18384q;
            if (jVar != null) {
                jVar.removeAllViews();
                this.f18384q = null;
            }
        }
        this.f18389v = false;
    }

    public final int M() {
        l0 l0Var;
        int iIntValue;
        int i10 = this.f18387t;
        if (i10 == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i10 <= 0) {
            s0 s0Var = this.f15332a.getAdContent().f15749d;
            if (s0Var != null && (l0Var = ((r0) s0Var).f15146c) != null) {
                Integer num = l0Var.f15130a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.f18387t));
        iIntValue = this.f18387t;
        return iIntValue * 1000;
    }

    public final void N() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f18682b == null) {
            return;
        }
        IAlog.a("%srefreshing ad", IAlog.a(this));
        if ((!this.f18380m.p() || this.f18380m.N == f0.RESIZED) && (inneractiveAdViewUnitController = this.f18379l) != null) {
            this.f18385r = 0L;
            inneractiveAdViewUnitController.refreshAd();
        }
    }

    public final void O() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.f18682b) == null || !mVar.getIsVisible() || this.f18385r == 0 || this.f18380m.p() || this.f18380m.N == f0.RESIZED) {
            return;
        }
        if (!this.f18390w) {
            if (this.f18378k < System.currentTimeMillis() - this.f18385r) {
                this.f18388u = 1L;
            } else {
                this.f18388u = this.f18378k - (System.currentTimeMillis() - this.f18385r);
            }
        }
        IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.f18388u));
        a(false, this.f18388u);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        j jVar;
        l0 l0Var;
        UnitDisplayType unitDisplayType;
        InneractiveAdSpot inneractiveAdSpot = this.f15332a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f18382o = false;
        this.f15336e = false;
        if (viewGroup != null) {
            this.f18383p = viewGroup;
            this.f18379l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f18391x) {
            L();
            if (!(this.f15332a.getAdContent() instanceof q0)) {
                IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f15332a.getAdContent());
                return;
            }
            this.f15333b = (q0) this.f15332a.getAdContent();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f15333b;
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f15579i : null;
        this.f18380m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f18381n == null) {
                this.f18381n = new h(this);
            }
            iAmraidWebViewController.setListener(this.f18381n);
            q0 q0Var = (q0) this.f15333b;
            InneractiveAdRequest inneractiveAdRequest = q0Var.f15746a;
            s0 s0Var = q0Var.f15749d;
            if (s0Var == null || (l0Var = ((r0) s0Var).f15146c) == null || (unitDisplayType = l0Var.f15131b) == null || !unitDisplayType.isFullscreenUnit()) {
                this.f18384q = new j(this.f18383p.getContext(), 0.0f);
                q0 q0Var2 = (q0) this.f15333b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) q0Var2.f15747b;
                h1 h1VarA = a(fVar.f18436e, fVar.f18437f, q0Var2.f15749d);
                this.f18380m.setAdDefaultSize(h1VarA.f18583a, h1VarA.f18584b);
                IAmraidWebViewController iAmraidWebViewController2 = this.f18380m;
                com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.f18682b;
                if (mVar != null || com.fyber.inneractive.sdk.util.o.f18599a == null) {
                    ViewParent parent = mVar != null ? mVar.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(mVar);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(h1VarA.f18583a, h1VarA.f18584b);
                    layoutParams.addRule(new int[]{13}[0]);
                    this.f18380m.a(this.f18384q, layoutParams);
                    this.f18383p.addView(this.f18384q);
                    j jVar2 = this.f18384q;
                    ViewGroup.LayoutParams layoutParams2 = jVar2.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    jVar2.setLayoutParams(layoutParams2);
                    InneractiveAdSpot inneractiveAdSpot2 = this.f15332a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.f18383p) != null) {
                        Context context = viewGroup2.getContext();
                        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, this.f15332a.getAdContent().f15746a, this.f15332a.getAdContent().b(), this.f15332a.getAdContent().f15748c);
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, this.f18383p, false);
                        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        IFyberAdIdentifier iFyberAdIdentifier = gVar.f15447d;
                        iFyberAdIdentifier.f18536k = corner;
                        iFyberAdIdentifier.a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        IAmraidWebViewController iAmraidWebViewController3 = this.f18380m;
                        if (iAmraidWebViewController3 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController3.f18682b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && z() != null) {
                            ViewGroup.LayoutParams layoutParams3 = z().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController4 = this.f18380m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController4.a(viewGroup4, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
                        }
                    }
                } else if (this.f18391x) {
                    FrameLayout frameLayout = new FrameLayout(this.f18383p.getContext());
                    frameLayout.setBackgroundResource(R.color.ia_blank_background);
                    this.f18383p.removeAllViews();
                    this.f18383p.addView(frameLayout, new FrameLayout.LayoutParams(h1VarA.f18583a, h1VarA.f18584b, 17));
                } else {
                    this.f18391x = true;
                    iAmraidWebViewController2.f18682b = iAmraidWebViewController2.a(((q0) this.f15333b).f15748c);
                    try {
                        iAmraidWebViewController2.h();
                        DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(iAmraidWebViewController2.f18682b, iAmraidWebViewController2.f18696p, iAmraidWebViewController2.f18697q, "text/html", G5.N, null);
                    } catch (Throwable unused) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f18383p.getContext());
                        frameLayout2.setBackgroundResource(R.color.ia_blank_background);
                        this.f18383p.removeAllViews();
                        this.f18383p.addView(frameLayout2, new FrameLayout.LayoutParams(h1VarA.f18583a, h1VarA.f18584b, 17));
                    }
                }
            } else {
                j jVar3 = new j(this.f18383p.getContext(), 1.5f);
                this.f18384q = jVar3;
                this.f18380m.a(jVar3, new ViewGroup.LayoutParams(-1, -1));
                this.f18383p.addView(this.f18384q, new ViewGroup.LayoutParams(-2, -2));
            }
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f15333b;
            com.fyber.inneractive.sdk.response.f fVar2 = xVar2 != null ? (com.fyber.inneractive.sdk.response.f) ((q0) xVar2).f15747b : null;
            if (fVar2 != null && (jVar = this.f18384q) != null) {
                d dVar = new d(fVar2, jVar, new g(this));
                this.f18392y = dVar;
                dVar.f18367h = false;
                dVar.f18363d = 1;
                dVar.f18364e = 0.0f;
                int i10 = fVar2.f18453v;
                if (i10 >= 1) {
                    dVar.f18363d = Math.min(i10, 100);
                }
                float f10 = fVar2.f18454w;
                if (f10 >= -1.0f) {
                    dVar.f18364e = f10;
                }
                if (dVar.f18364e >= 0.0f) {
                    IAlog.a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    dVar.f18362c = 0.0f;
                    dVar.f18365f = System.currentTimeMillis();
                    dVar.f18366g = true;
                    dVar.a();
                }
            }
        } else {
            IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", xVar);
        }
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.f18635a;
        if (b0Var.f18564a.contains(this)) {
            return;
        }
        b0Var.f18564a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f18383p);
    }

    public final void c(boolean z10) {
        if (this.f18386s != null) {
            this.f18390w = z10;
            K();
            this.f18388u = this.f18378k - (System.currentTimeMillis() - this.f18385r);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.f18388u), Long.valueOf(this.f18378k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.p() || this.f18380m.N == f0.RESIZED) ? false : true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        return this.f18380m.f18706e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        d dVar = this.f18392y;
        if (dVar != null) {
            dVar.f18366g = false;
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar.f18369j);
        }
        j jVar = this.f18384q;
        if (jVar != null) {
            jVar.removeAllViews();
            this.f18384q = null;
        }
        ViewGroup viewGroup = this.f18383p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f18383p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.f18682b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        K();
        L();
        this.f18381n = null;
        com.fyber.inneractive.sdk.util.z.f18635a.f18564a.remove(this);
        i iVar = this.f18386s;
        if (iVar != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(iVar);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
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

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.f18380m;
        if (iAmraidWebViewController != null && (mVar = iAmraidWebViewController.f18682b) != null) {
            if (mVar.getIsVisible() && !com.fyber.inneractive.sdk.util.z.f18635a.f18565b && !this.f18380m.p() && this.f18380m.N != f0.RESIZED) {
                IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
                long jM = M();
                this.f18378k = jM;
                if (jM != 0) {
                    a(false, 10000L);
                    return;
                }
                return;
            }
            IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
            this.f18388u = 1L;
        }
    }

    public final void a(boolean z10, long j10) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.m mVar;
        if (!TextUtils.isEmpty(this.f15332a.getMediationNameString()) || j10 == 0 || (this.f15332a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.f18387t == -1 || (iAmraidWebViewController = this.f18380m) == null || (mVar = iAmraidWebViewController.f18682b) == null) {
            return;
        }
        if (!mVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.f18385r = System.currentTimeMillis();
        this.f18378k = z10 ? this.f18378k : j10;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j10), Long.valueOf(this.f18378k));
        if (j10 > 1) {
            i iVar = this.f18386s;
            if (iVar != null) {
                com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(iVar);
            }
            K();
            i iVar2 = new i(this);
            this.f18386s = iVar2;
            com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(iVar2, j10);
            return;
        }
        N();
    }

    public static h1 a(int i10, int i11, s0 s0Var) {
        int iA;
        int iA2;
        l0 l0Var;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i10), Integer.valueOf(i11));
        if (i10 > 0 && i11 > 0) {
            iA = com.fyber.inneractive.sdk.util.o.a(i10);
            iA2 = com.fyber.inneractive.sdk.util.o.a(i11);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (s0Var != null && (l0Var = ((r0) s0Var).f15146c) != null) {
                unitDisplayType = l0Var.f15131b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                iA = com.fyber.inneractive.sdk.util.o.a(k.RECTANGLE_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.k.m()) {
                iA = com.fyber.inneractive.sdk.util.o.a(k.BANNER_TABLET_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.BANNER_TABLET_HEIGHT.value);
            } else {
                iA = com.fyber.inneractive.sdk.util.o.a(k.BANNER_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.BANNER_HEIGHT.value);
            }
        }
        IAlog.e("View layout params: final scaled width and height: %d, %d", Integer.valueOf(iA), Integer.valueOf(iA2));
        return new h1(iA, iA2);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
        this.f18387t = i10;
    }
}
