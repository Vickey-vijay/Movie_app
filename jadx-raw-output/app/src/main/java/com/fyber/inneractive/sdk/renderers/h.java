package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.internal.special.SpecialsBridge;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements com.fyber.inneractive.sdk.web.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f18375a;

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        s0 s0Var;
        l0 l0Var;
        l lVar = this.f18375a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(lVar));
        ViewGroup viewGroup = this.f18375a.f18383p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.o.f18599a : this.f18375a.f18383p.getContext();
        if (context != null) {
            l lVar2 = this.f18375a;
            if (lVar2.f15337f) {
                com.fyber.inneractive.sdk.flow.x xVar = lVar2.f15333b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f15747b : null;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.flow.b0.a(eVar);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f18375a.f15333b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).f15749d) != null && (l0Var = ((r0) s0Var).f15146c) != null) {
                    com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, l0Var.f15131b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
                }
                return this.f18375a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
            }
        }
        return new com.fyber.inneractive.sdk.util.d0(g0.FAILED, new Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z10) {
    }

    public h(l lVar) {
        this.f18375a = lVar;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b() {
        this.f18375a.c(true);
        l lVar = this.f18375a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(lVar));
        l lVar2 = this.f18375a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f15334c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdResized(lVar2.f15332a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        l lVar = this.f18375a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(lVar));
        l lVar2 = this.f18375a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f15334c;
        if (eventsListener != null) {
            SpecialsBridge.fyberOnAdExpanded((InneractiveAdViewEventsListener) eventsListener, lVar2.f15332a);
        }
        l lVar3 = this.f18375a;
        lVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(lVar3));
        this.f18375a.c(true);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        l lVar = this.f18375a;
        lVar.a(lVar.y(), false, Float.NaN, Float.NaN);
        this.f18375a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        l lVar = this.f18375a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(lVar));
        l lVar2 = this.f18375a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f15334c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(lVar2.f15332a);
        }
        this.f18375a.O();
        l lVar3 = this.f18375a;
        lVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(lVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f18375a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        l lVar = this.f18375a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(lVar));
        ViewGroup viewGroup = this.f18375a.f18383p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        l lVar2 = this.f18375a;
        if (!lVar2.f18389v) {
            com.fyber.inneractive.sdk.network.b0.a(lVar2.f18383p.getContext(), str, str2, this.f18375a.f15333b);
            l lVar3 = this.f18375a;
            lVar3.f18389v = true;
            IAlog.a("%sreporting auto redirect", IAlog.a(lVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(lVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z10) {
        s0 s0Var;
        l0 l0Var;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar;
        l lVar = this.f18375a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(lVar), Boolean.valueOf(z10));
        if (z10) {
            l lVar2 = this.f18375a;
            if (!lVar2.f18382o) {
                IAlog.a("%sonShownForTheFirstTime called", IAlog.a(lVar2));
                com.fyber.inneractive.sdk.flow.x xVar = lVar2.f15333b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f15747b : null;
                if (eVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = lVar2.f18380m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    lVar2.b(eVar);
                    lVar2.G();
                }
                long jM = lVar2.M();
                lVar2.f18378k = jM;
                if (jM != 0) {
                    lVar2.a(true, jM);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = lVar2.f15333b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).f15749d) != null && (l0Var = ((r0) s0Var).f15146c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    if (l0Var.f15131b == UnitDisplayType.MRECT) {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY;
                    } else {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                    }
                    com.fyber.inneractive.sdk.flow.b0.a(aVar, cVar);
                }
                this.f18375a.f18382o = true;
                return;
            }
            d dVar = lVar2.f18392y;
            if (dVar != null && !dVar.f18367h && !dVar.f18366g && dVar.f18365f != 0) {
                dVar.f18365f = 0L;
                dVar.f18366g = true;
                dVar.a();
            }
            this.f18375a.O();
            return;
        }
        d dVar2 = this.f18375a.f18392y;
        if (dVar2 != null && dVar2.f18366g) {
            dVar2.f18366g = false;
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(dVar2.f18369j);
        }
        this.f18375a.c(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        Context contextA = com.fyber.inneractive.sdk.util.o.a(this.f18375a.z());
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(contextA, str);
        if (zStartRichMediaIntent) {
            l lVar = this.f18375a;
            if (lVar.f15334c != null) {
                lVar.a(contextA, false, Float.NaN, Float.NaN);
            }
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        l lVar = this.f18375a;
        InneractiveUnitController.EventsListener eventsListener = lVar.f15334c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(lVar.f15332a, mraidVideoFailedToDisplayError);
        }
    }
}
