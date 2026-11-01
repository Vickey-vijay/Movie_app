package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class D9 extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2987ki f22512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3126q7 f22513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3053n9 f22514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22515g;

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        View viewB;
        C3053n9 c3053n9 = this.f22514f;
        if (c3053n9 != null) {
            String str = this.f22515g;
            ck.p.i(str, "tag");
            c3053n9.a(str, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.f22512d.setFriendlyViews(map);
        C3053n9 c3053n10 = this.f22514f;
        if (c3053n10 != null) {
            String str2 = this.f22515g;
            ck.p.i(str2, "tag");
            c3053n10.a(str2, "startTrackingVisibility");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f22687a;
        C2987ki c2987ki = gestureDetectorOnGestureListenerC2785ci instanceof C2987ki ? (C2987ki) gestureDetectorOnGestureListenerC2785ci : null;
        if (c2987ki == null) {
            return;
        }
        C3126q7 c3126q7 = this.f22513e;
        View viewB2 = b();
        if (viewB2 == null || (viewB = b()) == null) {
            return;
        }
        c3126q7.a(viewB2, viewB, c2987ki.getVISIBILITY_CHANGE_LISTENER(), this.f22689c.getViewability(), true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D9(C2987ki c2987ki, C2987ki c2987ki2, C3126q7 c3126q7, C3053n9 c3053n9) {
        super(c2987ki);
        ck.p.j(c2987ki, "container");
        ck.p.j(c2987ki2, "renderView");
        ck.p.j(c3126q7, "htmlAdTracker");
        this.f22512d = c2987ki2;
        this.f22513e = c3126q7;
        this.f22514f = c3053n9;
        this.f22515g = D9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        this.f22688b = new WeakReference(this.f22512d);
        return this.f22512d;
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        C3053n9 c3053n9 = this.f22514f;
        if (c3053n9 != null) {
            String str = this.f22515g;
            ck.p.i(str, "tag");
            c3053n9.a(str, "stopTrackingForImpression");
        }
        C3053n9 c3053n10 = this.f22514f;
        if (c3053n10 != null) {
            String str2 = this.f22515g;
            ck.p.i(str2, "tag");
            c3053n10.a(str2, "stopTrackingForVisibility");
        }
        C3126q7 c3126q7 = this.f22513e;
        View viewB = b();
        if (viewB == null) {
            return;
        }
        c3126q7.b(viewB);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        ck.p.j(view, "childView");
        ck.p.j(friendlyObstructionPurpose, "obstructionCode");
        C3053n9 c3053n9 = this.f22514f;
        if (c3053n9 != null) {
            String str = this.f22515g;
            ck.p.i(str, "tag");
            c3053n9.a(str, "addFriendlyView - childView: " + view + ", obstructionCode: " + friendlyObstructionPurpose);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f22512d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(view, friendlyObstructionPurpose);
        }
        U exposureTracker = this.f22512d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        ck.p.j(view, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f22512d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(view);
        }
        U exposureTracker = this.f22512d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        C3053n9 c3053n9 = this.f22514f;
        if (c3053n9 != null) {
            String str = this.f22515g;
            ck.p.i(str, "tag");
            c3053n9.a(str, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f22513e.a();
                return;
            }
            if (b10 == 1) {
                C3126q7 c3126q7 = this.f22513e;
                InterfaceC3028m9 interfaceC3028m9 = c3126q7.f25151f;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).c("HtmlAdTracker", "onActivityStopped");
                }
                J8 j10 = c3126q7.f25152g;
                if (j10 != null) {
                    ck.p.i(j10.f22907d, "TAG");
                    j10.f22906c.a();
                    j10.f22908e.removeCallbacksAndMessages(null);
                    j10.f22905b.clear();
                }
                T7 t10 = c3126q7.f25153h;
                if (t10 != null) {
                    t10.d();
                    return;
                }
                return;
            }
            if (b10 == 2) {
                C3126q7 c3126q8 = this.f22513e;
                InterfaceC3028m9 interfaceC3028m10 = c3126q8.f25151f;
                if (interfaceC3028m10 != null) {
                    ((C3053n9) interfaceC3028m10).c("HtmlAdTracker", "onActivityDestroyed");
                }
                J8 j11 = c3126q8.f25152g;
                if (j11 != null) {
                    j11.f22904a.clear();
                    j11.f22905b.clear();
                    j11.f22906c.a();
                    j11.f22908e.removeMessages(0);
                    j11.f22906c.b();
                }
                c3126q8.f25152g = null;
                T7 t11 = c3126q8.f25153h;
                if (t11 != null) {
                    t11.b();
                }
                c3126q8.f25153h = null;
                return;
            }
            ck.p.i(this.f22515g, "tag");
        } catch (Exception e10) {
            C3053n9 c3053n10 = this.f22514f;
            if (c3053n10 != null) {
                String str2 = this.f22515g;
                ck.p.i(str2, "tag");
                c3053n10.b(str2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        C3053n9 c3053n9 = this.f22514f;
        if (c3053n9 != null) {
            String str = this.f22515g;
            ck.p.i(str, "tag");
            c3053n9.a(str, "destroy");
        }
        if (b() != null) {
            C3053n9 c3053n10 = this.f22514f;
            if (c3053n10 != null) {
                String str2 = this.f22515g;
                ck.p.i(str2, "tag");
                c3053n10.a(str2, "stopTrackingForVisibility");
            }
            C3126q7 c3126q7 = this.f22513e;
            View viewB = b();
            if (viewB != null) {
                c3126q7.b(viewB);
            }
        }
        WeakReference weakReference = this.f22688b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
