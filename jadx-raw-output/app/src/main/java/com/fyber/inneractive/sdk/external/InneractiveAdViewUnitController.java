package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.flow.g0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.r0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class InneractiveAdViewUnitController extends s0 implements g0, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f15293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f15295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15296d;
    public int mAdContentHeight;
    public int mAdContentWidth;

    public InneractiveAdViewUnitController() {
        this.f15294b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f15296d = 0;
        this.f15293a = new HashSet();
    }

    public final void a() {
        this.f15294b = true;
        Iterator it = new HashSet(this.f15293a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f15293a.clear();
        this.f15295c = null;
        super.destroy();
    }

    public void refreshAd() {
        IAlog.a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof r0)) {
            return;
        }
        ((r0) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return true;
    }

    public int getAdContentHeight() {
        int iO;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f15293a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iO = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).o()) > 0) {
                return iO;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int iE;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f15293a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iE = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).e()) > 0) {
                return iE;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        com.fyber.inneractive.sdk.interfaces.f fVarB;
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        for (com.fyber.inneractive.sdk.factories.g gVar : com.fyber.inneractive.sdk.factories.h.f15326a.f15327a) {
            if (gVar.a(inneractiveAdSpot)) {
                fVarB = gVar.b(inneractiveAdSpot);
                this.f15293a.add(fVarB);
                return fVarB;
            }
        }
        fVarB = null;
        this.f15293a.add(fVarB);
        return fVarB;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f15293a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).q();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.interfaces.d dVar;
        Iterator it = new HashSet(this.f15293a).iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (dVar != null) {
            dVar.a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof h0) {
                int i10 = IAlog.f18551a;
                IAlog.d("%s %s", "AD_REFRESH", ((h0) inneractiveAdSpot).f15455h.f15561d.b());
            }
        } catch (Exception unused) {
        }
        IAlog.a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void unbindView(View view) {
        if (this.f15295c != view) {
            IAlog.f("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f15295c, view);
        } else {
            this.f15295c = null;
        }
        IAlog.a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f15293a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(view)) {
                    IAlog.a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    dVar.t();
                    this.f15293a.remove(dVar);
                    return;
                }
            }
        }
    }

    public void bindView(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.interfaces.d dVarA;
        IAlog.a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f15293a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(viewGroup)) {
                    dVar.m();
                    IAlog.a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), dVar);
                    return;
                }
            }
        }
        this.f15295c = viewGroup;
        Iterator it = com.fyber.inneractive.sdk.factories.b.f15322a.f15323a.iterator();
        while (true) {
            if (it.hasNext()) {
                com.fyber.inneractive.sdk.factories.a aVar = (com.fyber.inneractive.sdk.factories.a) it.next();
                if (aVar.a(adSpot)) {
                    dVarA = aVar.a();
                    break;
                }
            } else {
                dVarA = null;
                break;
            }
        }
        int i10 = this.f15296d;
        if (i10 != 0) {
            dVarA.a(i10);
        }
        if (dVarA != null) {
            dVarA.initialize(adSpot);
            selectContentController();
            dVarA.a(viewGroup);
            this.f15293a.add(dVarA);
            IAlog.a("%sPPPP bindView created renderer %s", logPrefix(), dVarA);
            return;
        }
        IAlog.f("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        Iterator it = this.f15293a.iterator();
        while (it.hasNext()) {
            if (!((InneractiveAdRenderer) it.next()).canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            a();
        } else {
            r.f18607b.post(new f(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) inneractiveAdSpot.getAdContent().f15749d;
        if (r0Var.f15148e != null) {
            return false;
        }
        l0 l0Var = r0Var.f15146c;
        if (l0Var != null) {
            if (UnitDisplayType.BANNER.equals(l0Var.f15131b) || UnitDisplayType.MRECT.equals(l0Var.f15131b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(l0Var.f15131b)) {
                if (inneractiveAdSpot.getCurrentProcessedRequest() == null || !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen()) {
                    return false;
                }
                return true;
            }
        }
        t0 t0Var = r0Var.f15149f;
        if (t0Var == null || (!UnitDisplayType.LANDSCAPE.equals(t0Var.f15209j) && !UnitDisplayType.SQUARE.equals(t0Var.f15209j) && !UnitDisplayType.MRECT.equals(t0Var.f15209j))) {
            return false;
        }
        return true;
    }

    public void unbindFullscreenRenderer(com.fyber.inneractive.sdk.interfaces.f fVar) {
        WeakReference<i0> weakReference;
        IAlog.a("%sremoving full screen ad renderer %s", logPrefix(), fVar);
        HashSet hashSet = this.f15293a;
        if (hashSet != null) {
            hashSet.remove(fVar);
        }
        if (!this.f15294b) {
            for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f15293a)) {
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).r();
                    if (this.mEventsListener != null && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i10) {
        this();
        if (i10 >= 30) {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i10));
            this.f15296d = i10;
        } else {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i10), 30);
            this.f15296d = 30;
        }
    }

    public InneractiveAdViewUnitController(boolean z10) {
        this();
        if (z10) {
            this.f15296d = -1;
        }
    }
}
