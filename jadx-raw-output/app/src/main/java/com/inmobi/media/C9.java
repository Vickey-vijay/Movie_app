package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class C9 extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gn f22458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3126q7 f22459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3028m9 f22460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22461g;

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3028m9 interfaceC3028m9 = this.f22460f;
        if (interfaceC3028m9 != null) {
            String str = this.f22461g;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        View viewB = this.f22458d.b();
        if (viewB != null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f22460f;
            if (interfaceC3028m10 != null) {
                String str2 = this.f22461g;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).a(str2, "start tracking");
            }
            AdConfig.ViewabilityConfig viewability = this.f22689c.getViewability();
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f22687a;
            ck.p.h(gestureDetectorOnGestureListenerC2785ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC2785ci.setFriendlyViews(map);
            C3126q7 c3126q7 = this.f22459e;
            c3126q7.getClass();
            ck.p.j(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            ck.p.j(viewB, "token");
            ck.p.j(viewability, "viewabilityConfig");
            InterfaceC3028m9 interfaceC3028m11 = c3126q7.f25151f;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (c3126q7.f25146a == 0) {
                InterfaceC3028m9 interfaceC3028m12 = c3126q7.f25151f;
                if (interfaceC3028m12 != null) {
                    ((C3053n9) interfaceC3028m12).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (ck.p.e(c3126q7.f25147b, "video") || ck.p.e(c3126q7.f25147b, "audio")) {
                InterfaceC3028m9 interfaceC3028m13 = c3126q7.f25151f;
                if (interfaceC3028m13 != null) {
                    ((C3053n9) interfaceC3028m13).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                J8 j8A = c3126q7.a(c3126q7.f25146a, viewability);
                InterfaceC3028m9 interfaceC3028m14 = c3126q7.f25151f;
                if (interfaceC3028m14 != null) {
                    ((C3053n9) interfaceC3028m14).c("HtmlAdTracker", "impression tracker add view");
                }
                int i10 = c3126q7.f25149d;
                int i11 = c3126q7.f25148c;
                ck.p.j(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                ck.p.j(viewB, "token");
                H8 h10 = (H8) j8A.f22904a.get(viewB);
                if (!ck.p.e(h10 != null ? h10.f22788a : null, viewB)) {
                    ck.p.j(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    j8A.f22904a.remove(viewB);
                    j8A.f22905b.remove(viewB);
                    j8A.f22906c.a(viewB);
                    j8A.f22904a.put(viewB, new H8(viewB, i10, i11));
                    T7 t10 = j8A.f22906c;
                    t10.getClass();
                    ck.p.j(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    t10.a(viewB, viewB, viewB, i10);
                }
            }
            this.f22459e.a(viewB, viewB, gestureDetectorOnGestureListenerC2785ci.getVISIBILITY_CHANGE_LISTENER(), viewability, false);
            this.f22458d.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Gn gn2, C3126q7 c3126q7, InterfaceC3028m9 interfaceC3028m9) {
        super(gestureDetectorOnGestureListenerC2785ci);
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "container");
        ck.p.j(gn2, "mViewableAd");
        ck.p.j(c3126q7, "htmlAdTracker");
        this.f22458d = gn2;
        this.f22459e = c3126q7;
        this.f22460f = interfaceC3028m9;
        this.f22461g = C9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f22458d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        return this.f22458d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        InterfaceC3028m9 interfaceC3028m9 = this.f22460f;
        if (interfaceC3028m9 != null) {
            String str = this.f22461g;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "stopTrackingForImpression");
        }
        View viewB = this.f22458d.b();
        if (viewB != null) {
            this.f22459e.a(viewB);
            this.f22458d.getClass();
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        ck.p.j(view, "childView");
        ck.p.j(friendlyObstructionPurpose, "obstructionCode");
        if (view instanceof C2987ki) {
            InterfaceC3028m9 interfaceC3028m9 = this.f22460f;
            if (interfaceC3028m9 != null) {
                String str = this.f22461g;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).a(str, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f22460f;
        if (interfaceC3028m10 != null) {
            String str2 = this.f22461g;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "Adding friendly view: " + view.getClass().getSimpleName() + " with obstruction code: " + friendlyObstructionPurpose);
        }
        this.f22458d.a(view, friendlyObstructionPurpose);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        ck.p.j(view, "childView");
        if (view instanceof C2987ki) {
            return;
        }
        this.f22458d.a(view);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        InterfaceC3028m9 interfaceC3028m9 = this.f22460f;
        if (interfaceC3028m9 != null) {
            String str = this.f22461g;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f22459e.a();
            } else if (b10 == 1) {
                C3126q7 c3126q7 = this.f22459e;
                InterfaceC3028m9 interfaceC3028m10 = c3126q7.f25151f;
                if (interfaceC3028m10 != null) {
                    ((C3053n9) interfaceC3028m10).c("HtmlAdTracker", "onActivityStopped");
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
                }
            } else if (b10 == 2) {
                C3126q7 c3126q8 = this.f22459e;
                InterfaceC3028m9 interfaceC3028m11 = c3126q8.f25151f;
                if (interfaceC3028m11 != null) {
                    ((C3053n9) interfaceC3028m11).c("HtmlAdTracker", "onActivityDestroyed");
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
            } else {
                ck.p.i(this.f22461g, "TAG");
            }
            this.f22458d.getClass();
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m12 = this.f22460f;
            if (interfaceC3028m12 != null) {
                String str2 = this.f22461g;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m12).b(str2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
        } finally {
            this.f22458d.getClass();
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f22460f;
        if (interfaceC3028m9 != null) {
            String str = this.f22461g;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "destroy");
        }
        View viewB = this.f22458d.b();
        if (viewB != null) {
            this.f22459e.a(viewB);
            this.f22459e.b(viewB);
        }
        WeakReference weakReference = this.f22688b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference weakReference2 = this.f22458d.f22688b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }
}
