package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2717a2;
import com.inmobi.media.EnumC2721a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C2717a2 extends AbstractC2995l1 implements Application.ActivityLifecycleCallbacks {
    public final String F;
    public final String G;
    public boolean H;
    public int I;
    public final C2743b2 J;

    public static final void a(C2717a2 c2717a2, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, int i10) {
        int iIndexOf = c2717a2.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
        try {
            AbstractC2871g1 abstractC2871g1M = c2717a2.m();
            C3053n9 c3053n9 = c2717a2.f24717i;
            if (c3053n9 != null) {
                String str = c2717a2.F;
                ck.p.i(str, "TAG");
                c3053n9.c(str, "callback onShowNextPodAd");
            }
            if (abstractC2871g1M != null) {
                abstractC2871g1M.a(i10, iIndexOf, gestureDetectorOnGestureListenerC2785ci);
            }
        } catch (Exception unused) {
            c2717a2.b(iIndexOf, false);
            c2717a2.e(iIndexOf);
        }
    }

    public static final void b(C2717a2 c2717a2) {
        try {
            if (c2717a2.f24710b == 7) {
                int i10 = c2717a2.I - 1;
                c2717a2.I = i10;
                if (i10 == 0) {
                    c2717a2.c((byte) 6);
                    AbstractC2871g1 abstractC2871g1M = c2717a2.m();
                    if (abstractC2871g1M != null) {
                        abstractC2871g1M.a();
                    }
                }
            }
        } catch (Exception e10) {
            C3053n9 c3053n9 = c2717a2.f24717i;
            if (c3053n9 != null) {
                String str = c2717a2.F;
                ck.p.i(str, "TAG");
                c3053n9.b(str, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final void c(C2717a2 c2717a2) {
        try {
            byte b10 = c2717a2.f24710b;
            if (b10 != 6) {
                if (b10 == 7) {
                    c2717a2.I++;
                    return;
                }
                return;
            }
            c2717a2.I++;
            c2717a2.c((byte) 7);
            C3053n9 c3053n9 = c2717a2.f24717i;
            if (c3053n9 != null) {
                String str = c2717a2.F;
                ck.p.i(str, "TAG");
                c3053n9.d(str, "AdUnit " + c2717a2 + " state - ACTIVE");
            }
            C3053n9 c3053n10 = c2717a2.f24717i;
            if (c3053n10 != null) {
                c3053n10.c(c2717a2.G, "Successfully displayed banner ad for placement Id : " + c2717a2.f24720l);
            }
            AbstractC2871g1 abstractC2871g1M = c2717a2.m();
            if (abstractC2871g1M != null) {
                c2717a2.a(abstractC2871g1M);
            }
        } catch (Exception e10) {
            C3053n9 c3053n11 = c2717a2.f24717i;
            if (c3053n11 != null) {
                String str2 = c2717a2.F;
                ck.p.i(str2, "TAG");
                c3053n11.b(str2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void d() {
        this.J.f24031a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final synchronized void e(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "onAdScreenDismissed " + this);
        }
        super.e(gestureDetectorOnGestureListenerC2785ci);
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.m5
                @Override // java.lang.Runnable
                public final void run() {
                    C2717a2.b(this.f5056b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public final synchronized void f(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "onAdScreenDisplayed " + this);
        }
        super.f(gestureDetectorOnGestureListenerC2785ci);
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.p5
                @Override // java.lang.Runnable
                public final void run() {
                    C2717a2.c(this.f5126b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public String l() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final GestureDetectorOnGestureListenerC2785ci q() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "htmlAdContainer getter " + this);
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (this.f24716h.size() <= 0 || this.f24724p >= this.f24716h.size()) ? null : (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(this.f24724p);
        if (this.f24720l.f25514j && gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.k();
        }
        return gestureDetectorOnGestureListenerC2785ci;
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final byte t() {
        return (byte) 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2717a2(Context context, C3243v0 c3243v0, Dk dk2) {
        super(context, c3243v0, dk2);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3243v0, "placement");
        String simpleName = C2717a2.class.getSimpleName();
        this.F = simpleName;
        this.G = "InMobi";
        this.J = new C2743b2();
        ck.p.i(simpleName, "TAG");
        long j10 = c3243v0.f25505a;
        a(context, c3243v0, dk2);
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void C() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "load " + this);
        }
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final boolean E() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 == null) {
            return false;
        }
        String str = this.F;
        ck.p.i(str, "TAG");
        c3053n9.c(str, "missingPrerequisitesForAd " + this);
        return false;
    }

    public boolean V() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "canProceedToLoad " + this);
        }
        E();
        byte b10 = this.f24710b;
        if (1 == b10 || 2 == b10) {
            Kb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                String str2 = this.F;
                ck.p.i(str2, "TAG");
                c3053n10.b(str2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.f24710b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != b10) {
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                c3053n11.c(this.G, "Fetching a Banner ad for placement id: " + this.f24720l);
            }
            D();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        C3053n9 c3053n12 = this.f24717i;
        if (c3053n12 != null) {
            String str3 = this.F;
            ck.p.i(str3, "TAG");
            c3053n12.b(str3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f24720l.f25505a);
        }
        return false;
    }

    public final void W() {
        Fn viewableAd;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "onPause " + this);
        }
        byte b10 = this.f24710b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC2785ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC2785ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 1);
        }
    }

    public final void X() {
        Fn viewableAd;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "onResume " + this);
        }
        byte b10 = this.f24710b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC2785ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC2785ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 0);
        }
    }

    public final void Y() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        if (contextN != null) {
            Ji.a(contextN, this);
        }
    }

    public final void Z() {
        AdConfig adConfig;
        if (ck.p.e(this.f24720l.f25510f, "AB") && (adConfig = this.f24711c) != null && adConfig.getSkipNetCheckHB()) {
            C3053n9 c3053n9 = this.f24717i;
            if (c3053n9 != null) {
                String str = this.F;
                ck.p.i(str, "TAG");
                c3053n9.a(str, "renderAd without internet check");
            }
            a0();
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            String str2 = this.F;
            ck.p.i(str2, "TAG");
            c3053n10.a(str2, "renderAd");
        }
        a(new bk.a() { // from class: b7.i5
            @Override // bk.a
            public final Object invoke() {
                return C2717a2.e(this.f4982b);
            }
        }, new bk.l() { // from class: b7.j5
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C2717a2.a(this.f5000b, (EnumC2721a6) obj);
            }
        });
    }

    public final void a0() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "renderAdPostInternetCheck");
        }
        try {
            if (M()) {
                return;
            }
            C3144r1 c3144r1 = this.f24734z;
            c3144r1.getClass();
            c3144r1.f25223g = SystemClock.elapsedRealtime();
            Handler handler = this.f24718j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7.o5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2717a2.f(this.f5101b);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                String str2 = this.F;
                ck.p.i(str2, "TAG");
                c3053n10.a(str2, "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void b0() {
        Application application;
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "unregisterLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        Activity activity = contextN instanceof Activity ? (Activity) contextN : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.AbstractC2836ei
    public void j(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onRenderViewVisible " + this);
        }
        super.j(gestureDetectorOnGestureListenerC2785ci);
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.l5
                @Override // java.lang.Runnable
                public final void run() {
                    C2717a2.d(this.f5037b);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final HashMap k() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "adSpecificRequestParams getter " + this);
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.H ? "1" : "0");
        map.put("mk-ad-slot", this.f24720l.f25512h);
        return map;
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void o(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "handleRenderViewSignaledAdReady " + this);
        }
        super.o(gestureDetectorOnGestureListenerC2785ci);
        if (this.f24727s && this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) > 0 && this.f24710b == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(this.f24724p);
            if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                gestureDetectorOnGestureListenerC2785ci2.a(true);
                return;
            }
            return;
        }
        if (this.f24710b != 2) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                String str2 = this.F;
                ck.p.i(str2, "TAG");
                c3053n10.a(str2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.f24710b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        C3053n9 c3053n11 = this.f24717i;
        if (c3053n11 != null) {
            String str3 = this.F;
            ck.p.i(str3, "TAG");
            c3053n11.d(str3, "AdUnit " + this + " state - READY");
        }
        C3144r1 c3144r1 = this.f24734z;
        c3144r1.getClass();
        c3144r1.f25225i = SystemClock.elapsedRealtime();
        P();
        S();
        C3053n9 c3053n12 = this.f24717i;
        if (c3053n12 != null) {
            c3053n12.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.f24720l);
        }
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            d(abstractC2871g1M);
        } else {
            C3053n9 c3053n13 = this.f24717i;
            if (c3053n13 != null) {
                String str4 = this.F;
                ck.p.i(str4, "TAG");
                c3053n13.b(str4, "AdUnit listener is null");
            }
        }
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onActivityDestroyed " + this);
        }
        Context contextN = n();
        if (ck.p.e(contextN, activity)) {
            ck.p.h(contextN, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextN).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(bundle, "outState");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onActivityStarted " + this);
        }
        if (ck.p.e(n(), activity)) {
            X();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "onActivityStopped " + this);
        }
        if (ck.p.e(n(), activity)) {
            W();
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void F() {
        AbstractC2871g1 abstractC2871g1M;
        super.F();
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            c3053n9.c(this.G, "Banner ad fetch successful for placement id: " + this.f24720l);
        }
        if (!ck.p.e(s(), CreativeInfo.f44315al) && !ck.p.e(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.f24710b == 2 && (abstractC2871g1M = m()) != null) {
            c(abstractC2871g1M);
        }
    }

    public static final void d(C2717a2 c2717a2) {
        try {
            if (c2717a2.f24710b == 4) {
                c2717a2.c((byte) 6);
                C3053n9 c3053n9 = c2717a2.f24717i;
                if (c3053n9 != null) {
                    String str = c2717a2.F;
                    ck.p.i(str, "TAG");
                    c3053n9.d(str, "AdUnit " + c2717a2 + " state - RENDERED");
                }
            }
        } catch (Exception e10) {
            C3053n9 c3053n10 = c2717a2.f24717i;
            if (c3053n10 != null) {
                String str2 = c2717a2.F;
                ck.p.i(str2, "TAG");
                c3053n10.b(str2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final mj.r e(C2717a2 c2717a2) {
        C3053n9 c3053n9 = c2717a2.f24717i;
        if (c3053n9 != null) {
            String str = c2717a2.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "loadWithRetry success");
        }
        c2717a2.a0();
        return mj.r.f64562a;
    }

    public static final void f(C2717a2 c2717a2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c2717a2.f24727s) {
            c2717a2.f24725q = System.currentTimeMillis();
            AdSet adSetR = c2717a2.r();
            if (adSetR != null && (ads = adSetR.getAds()) != null) {
                int i10 = 0;
                for (Object obj : ads) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        nj.s.u();
                    }
                    c2717a2.f24726r.add(Integer.valueOf(i10));
                    i10 = i11;
                }
            }
        }
        c2717a2.N();
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void q(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        int iIndexOf;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        if (this.f24727s && (iIndexOf = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci)) > this.f24724p && gestureDetectorOnGestureListenerC2785ci.I != Hn.VISIBLE) {
            this.f24726r.remove(Integer.valueOf(iIndexOf));
        } else {
            U();
            super.q(gestureDetectorOnGestureListenerC2785ci);
        }
    }

    @Override // com.inmobi.media.AbstractC2995l1
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, short s10) throws JSONException {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC2785ci, s10);
        if (this.f24727s) {
            int iIndexOf = this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci);
            a(iIndexOf, true);
            if (iIndexOf > 0 && this.f24710b == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(this.f24724p);
                if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                    gestureDetectorOnGestureListenerC2785ci2.a(false);
                }
            }
        }
        if (this.f24710b == 2) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                c3053n10.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.f24720l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.InterfaceC3268w0
    public final void b() {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "closeAll " + this);
        }
    }

    public final boolean b(int i10, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.c(str, "isInValidShowPodIndex " + i10 + com.ironsource.Z7.f27998r + this.f24726r + com.ironsource.Z7.f27998r + this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) + com.ironsource.Z7.f27998r + this + com.ironsource.Z7.f27998r);
        }
        if (!this.f24726r.contains(Integer.valueOf(i10)) || i10 <= this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci) || this.f24716h.get(i10) == null) {
            return true;
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) this.f24716h.get(i10);
        return (gestureDetectorOnGestureListenerC2785ci2 == null || gestureDetectorOnGestureListenerC2785ci2.B0) ? false : true;
    }

    public final void c(String str) {
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str2 = this.F;
            ck.p.i(str2, "TAG");
            c3053n9.c(str2, "setAdSize " + this);
        }
        C3243v0 c3243v0 = this.f24720l;
        ck.p.g(str);
        c3243v0.getClass();
        ck.p.j(str, "<set-?>");
        c3243v0.f25512h = str;
    }

    public final void b(boolean z10) {
        C3053n9 c3053n9;
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n10.a(str, "load " + this);
        }
        if (z10 && (c3053n9 = this.f24717i) != null) {
            c3053n9.c(this.G, "Initiating Banner refresh for placement id: " + this.f24720l);
        }
        this.H = z10;
        C();
    }

    @Override // com.inmobi.media.InterfaceC3268w0
    public final void a(int i10, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "loadPodAd " + this);
        }
        if (this.f24726r.contains(Integer.valueOf(i10)) && i10 > this.f24716h.indexOf(gestureDetectorOnGestureListenerC2785ci)) {
            this.f24723o = i10;
            Handler handler = this.f24718j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: b7.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2717a2.a(this.f5016b);
                    }
                });
                return;
            }
            return;
        }
        C3053n9 c3053n10 = this.f24717i;
        if (c3053n10 != null) {
            String str2 = this.F;
            ck.p.i(str2, "TAG");
            c3053n10.a(str2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.f24716h;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) arrayList.get(arrayList.indexOf(gestureDetectorOnGestureListenerC2785ci));
        if (gestureDetectorOnGestureListenerC2785ci2 != null) {
            gestureDetectorOnGestureListenerC2785ci2.a(false);
        }
    }

    public static final void a(C2717a2 c2717a2) {
        C3053n9 c3053n9 = c2717a2.f24717i;
        if (c3053n9 != null) {
            String str = c2717a2.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "start loading html ad");
        }
        c2717a2.N();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public static final mj.r a(C2717a2 c2717a2, EnumC2721a6 enumC2721a6) {
        short s10;
        ck.p.j(enumC2721a6, "it");
        C3053n9 c3053n9 = c2717a2.f24717i;
        if (c3053n9 != null) {
            String str = c2717a2.F;
            ck.p.i(str, "TAG");
            c3053n9.b(str, "loadWithRetry error - " + enumC2721a6);
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        ck.p.j(enumC2721a6, IronSourceConstants.EVENTS_ERROR_CODE);
        int iOrdinal = enumC2721a6.ordinal();
        if (iOrdinal == 0) {
            s10 = 2122;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s10 = 2123;
                    break;
                case 13:
                    s10 = 2124;
                    break;
                case 14:
                    s10 = 2125;
                    break;
                case 15:
                    s10 = 2126;
                    break;
                case 16:
                    s10 = 2127;
                    break;
                default:
                    s10 = 2122;
                    break;
            }
        } else {
            s10 = 2229;
        }
        c2717a2.a(inMobiAdRequestStatus, true, s10);
        return mj.r.f64562a;
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.InterfaceC3268w0
    public final void a(final int i10, final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Context context) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        C3053n9 c3053n9 = this.f24717i;
        if (c3053n9 != null) {
            String str = this.F;
            ck.p.i(str, "TAG");
            c3053n9.a(str, "showPodAdAtIndex " + this + " index - " + i10);
        }
        if (!this.f24727s) {
            C3053n9 c3053n10 = this.f24717i;
            if (c3053n10 != null) {
                String str2 = this.F;
                ck.p.i(str2, "TAG");
                c3053n10.b(str2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.f24716h;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) arrayList.get(arrayList.indexOf(gestureDetectorOnGestureListenerC2785ci));
            if (gestureDetectorOnGestureListenerC2785ci2 != null) {
                gestureDetectorOnGestureListenerC2785ci2.b(false);
                return;
            }
            return;
        }
        if (b(i10, gestureDetectorOnGestureListenerC2785ci)) {
            C3053n9 c3053n11 = this.f24717i;
            if (c3053n11 != null) {
                String str3 = this.F;
                ck.p.i(str3, "TAG");
                c3053n11.b(str3, "Cannot show an pod ad with invalid index passed");
            }
            ArrayList arrayList2 = this.f24716h;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci3 = (GestureDetectorOnGestureListenerC2785ci) arrayList2.get(arrayList2.indexOf(gestureDetectorOnGestureListenerC2785ci));
            if (gestureDetectorOnGestureListenerC2785ci3 != null) {
                gestureDetectorOnGestureListenerC2785ci3.b(false);
                return;
            }
            return;
        }
        super.a(i10, gestureDetectorOnGestureListenerC2785ci, context);
        Handler handler = this.f24718j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: b7.n5
                @Override // java.lang.Runnable
                public final void run() {
                    C2717a2.a(this.f5078b, gestureDetectorOnGestureListenerC2785ci, i10);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public void a(V1 v10) {
        ck.p.j(v10, "audioStatusInternal");
        AbstractC2871g1 abstractC2871g1M = m();
        if (abstractC2871g1M != null) {
            abstractC2871g1M.a(v10);
        }
        C2743b2 c2743b2 = this.J;
        c2743b2.getClass();
        ck.p.j(v10, "audioStatusInternal");
        if (!c2743b2.f24031a && v10 == V1.f23666e) {
            c2743b2.f24031a = true;
            W8 w10 = W8.f23730c;
            w10.f24331a = System.currentTimeMillis();
            w10.f24332b++;
        }
    }

    @Override // com.inmobi.media.AbstractC2836ei
    public void a(boolean z10) {
        W8 w10 = W8.f23730c;
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "banner_audio_pref_file");
        ck.p.j("user_mute_count", C3426d4.i.W);
        int i10 = eaA.f22577a.getInt("user_mute_count", 0);
        eaA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }

    @Override // com.inmobi.media.AbstractC2995l1, com.inmobi.media.AbstractC2836ei
    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, boolean z10) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        super.a(gestureDetectorOnGestureListenerC2785ci, z10);
        byte b10 = this.f24710b;
        short s10 = 2227;
        if (b10 != 4 && b10 != 6) {
            if (b10 == 7) {
                if (b10 == 7) {
                    s10 = z10 ? (short) 2224 : (short) 2223;
                }
                gestureDetectorOnGestureListenerC2785ci.a(z10, s10);
                return;
            }
            return;
        }
        if (b10 == 4) {
            s10 = z10 ? (short) 2220 : (short) 2219;
        } else if (b10 == 6) {
            s10 = z10 ? (short) 2222 : (short) 2221;
        }
        J();
        gestureDetectorOnGestureListenerC2785ci.a(z10, s10);
    }
}
