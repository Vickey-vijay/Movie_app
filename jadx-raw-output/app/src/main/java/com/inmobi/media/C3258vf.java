package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3258vf extends En {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f25570g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fn f25571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2845f1 f25572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3028m9 f25573f;

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession;
        ck.p.j(view, "childView");
        ck.p.j(friendlyObstructionPurpose, "obstructionCode");
        InterfaceC3028m9 interfaceC3028m9 = this.f25573f;
        if (interfaceC3028m9 != null) {
            ck.p.i("vf", "TAG");
            ((C3053n9) interfaceC3028m9).a("vf", "addFriendlyView with obstruction code: " + friendlyObstructionPurpose);
        }
        InterfaceC2845f1 interfaceC2845f1 = this.f25572e;
        if (interfaceC2845f1 != null) {
            C2959jf c2959jf = (C2959jf) interfaceC2845f1;
            ck.p.j(view, "childView");
            ck.p.j(friendlyObstructionPurpose, "obstructionCode");
            if (C2959jf.a(c2959jf.f24612e) && (adSession = c2959jf.f24613f) != null) {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
            }
        }
        this.f25571d.a(view, friendlyObstructionPurpose);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3258vf(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Fn fn2, InterfaceC2845f1 interfaceC2845f1, InterfaceC3028m9 interfaceC3028m9) {
        super(gestureDetectorOnGestureListenerC2785ci);
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "adContainer");
        ck.p.j(fn2, "mViewableAd");
        this.f25571d = fn2;
        this.f25572e = interfaceC2845f1;
        this.f25573f = interfaceC3028m9;
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f25571d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3028m9 interfaceC3028m9 = this.f25573f;
        if (interfaceC3028m9 != null) {
            ck.p.i("vf", "TAG");
            ((C3053n9) interfaceC3028m9).c("vf", "inflateView called");
        }
        return this.f25571d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        try {
            InterfaceC3028m9 interfaceC3028m9 = this.f25573f;
            if (interfaceC3028m9 != null) {
                ck.p.i("vf", "TAG");
                ((C3053n9) interfaceC3028m9).a("vf", "stopTrackingForImpression");
            }
            InterfaceC2845f1 interfaceC2845f1 = this.f25572e;
            if (interfaceC2845f1 != null) {
                C2959jf c2959jf = (C2959jf) interfaceC2845f1;
                if (C2959jf.a(c2959jf.f24612e, (byte) 2)) {
                    AdSession adSession = c2959jf.f24613f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c2959jf.f24613f = null;
                    c2959jf.f24612e = (byte) 3;
                }
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25573f;
            if (interfaceC3028m10 != null) {
                ck.p.i("vf", "TAG");
                ((C3053n9) interfaceC3028m10).b("vf", "Exception in stopTrackingForImpression with message : " + e10.getMessage());
            }
        } finally {
            this.f25571d.d();
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        AdSession adSession;
        ck.p.j(view, "childView");
        InterfaceC2845f1 interfaceC2845f1 = this.f25572e;
        if (interfaceC2845f1 != null) {
            C2959jf c2959jf = (C2959jf) interfaceC2845f1;
            ck.p.j(view, "childView");
            if (C2959jf.a(c2959jf.f24612e) && (adSession = c2959jf.f24613f) != null) {
                adSession.removeFriendlyObstruction(view);
            }
        }
        this.f25571d.a(view);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3028m9 interfaceC3028m9 = this.f25573f;
        if (interfaceC3028m9 != null) {
            ck.p.i("vf", "TAG");
            ((C3053n9) interfaceC3028m9).a("vf", "startTrackingForImpression");
        }
        try {
            if (this.f22689c.getViewability().getOmidConfig().isOmidEnabled()) {
                Bf.f22423a.getClass();
                if (Omid.isActive()) {
                    View viewB = this.f25571d.b();
                    WebView webView = viewB instanceof WebView ? (WebView) viewB : null;
                    if (webView != null) {
                        InterfaceC3028m9 interfaceC3028m10 = this.f25573f;
                        if (interfaceC3028m10 != null) {
                            ck.p.i("vf", "TAG");
                            ((C3053n9) interfaceC3028m10).a("vf", "creating OMSDK session");
                        }
                        InterfaceC2845f1 interfaceC2845f1 = this.f25572e;
                        if (interfaceC2845f1 != null) {
                            ((C2959jf) interfaceC2845f1).a(webView, map);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f25573f;
            if (interfaceC3028m11 != null) {
                ck.p.i("vf", "TAG");
                ((C3053n9) interfaceC3028m11).b("vf", "Exception in startTrackingForImpression with message : " + e10.getMessage());
            }
        } finally {
            this.f25571d.a(map);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f25571d.a(context, b10);
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f25573f;
        if (interfaceC3028m9 != null) {
            ck.p.i("vf", "TAG");
            ((C3053n9) interfaceC3028m9).c("vf", "destroy");
        }
        WeakReference weakReference = this.f22688b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.f25572e = null;
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f25573f;
            if (interfaceC3028m10 != null) {
                ck.p.i("vf", "TAG");
                ((C3053n9) interfaceC3028m10).a("vf", "Exception in destroy with message", e10);
            }
        } finally {
            this.f25571d.a();
        }
    }
}
