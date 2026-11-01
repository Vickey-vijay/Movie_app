package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.factories.i;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public class InneractiveFullscreenUnitController extends s0 implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InneractiveFullScreenAdRewardedListener f15298b;
    public com.fyber.inneractive.sdk.interfaces.f mRenderer;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15297a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f15299c = new g(this);

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError() {
            super("Ad Expired");
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f15297a = false;
    }

    public void show(Activity activity) {
        if (activity == null) {
            IAlog.f("show() called with a null activity", new Object[0]);
            return;
        }
        if (this.f15297a) {
            IAlog.f("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
            return;
        }
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        x adContent = adSpot.getAdContent();
        com.fyber.inneractive.sdk.interfaces.f fVarB = null;
        if (adContent != null) {
            u uVar = u.IA_PUBLISHER_REQUESTED_SHOW;
            InneractiveAdRequest inneractiveAdRequest = adContent.f15746a;
            com.fyber.inneractive.sdk.response.e eVarB = adContent.b();
            JSONArray jSONArrayB = adContent.f15748c.b();
            w wVar = new w(eVarB);
            wVar.f16129c = uVar;
            wVar.f16127a = inneractiveAdRequest;
            wVar.f16130d = jSONArrayB;
            wVar.a((String) null);
        }
        if (!adSpot.isReady()) {
            InneractiveUnitController.EventsListener eventsListener = this.mEventsListener;
            if (eventsListener != null) {
                ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(adSpot, new AdExpiredError());
                return;
            }
            return;
        }
        if (this.mRenderer == null) {
            i iVar = com.fyber.inneractive.sdk.factories.h.f15326a;
            InneractiveAdSpot adSpot2 = getAdSpot();
            for (com.fyber.inneractive.sdk.factories.g gVar : iVar.f15327a) {
                if (gVar.a(adSpot2)) {
                    fVarB = gVar.b(adSpot2);
                    break;
                }
            }
            this.mRenderer = fVarB;
        }
        selectContentController();
        (adContent instanceof com.fyber.inneractive.sdk.dv.a ? new com.fyber.inneractive.sdk.display.b() : new com.fyber.inneractive.sdk.display.c()).a(activity, adSpot, adSpot.getLocalUniqueId());
        this.f15297a = true;
        com.fyber.inneractive.sdk.interfaces.f fVar = this.mRenderer;
        if (fVar != null) {
            fVar.a(this.f15299c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.mRenderer;
        if (fVar != null) {
            fVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f15298b;
    }

    public boolean isAvailable() {
        i0 i0Var = (i0) v.a(this.mAdSpot);
        return i0Var != null && i0Var.isReady();
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f15298b = inneractiveFullScreenAdRewardedListener;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.s0 s0Var = inneractiveAdSpot.getAdContent().f15749d;
        if (s0Var != null) {
            r0 r0Var = (r0) s0Var;
            if (r0Var.f15148e == null) {
                l0 l0Var = r0Var.f15146c;
                if (l0Var != null && UnitDisplayType.INTERSTITIAL.equals(l0Var.f15131b)) {
                    return true;
                }
                t0 t0Var = r0Var.f15149f;
                if (t0Var == null || (!UnitDisplayType.REWARDED.equals(t0Var.f15209j) && !UnitDisplayType.INTERSTITIAL.equals(t0Var.f15209j) && !UnitDisplayType.VERTICAL.equals(t0Var.f15209j))) {
                    return false;
                }
                return true;
            }
        }
        IAlog.f("%s : supports() called with unit config null", IAlog.a(this));
        return false;
    }
}
