package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.webkit.Profile;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3150r7;
import com.inmobi.media.GestureDetectorOnGestureListenerC2785ci;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3150r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f25240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Df f25241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f25242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f25244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f25245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f25246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25247h;

    public final void a(final Df df2) {
        ck.p.j(df2, "orientation");
        ck.p.j(df2, "orientation");
        this.f25241b = df2;
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25245f;
        ck.p.h(gestureDetectorOnGestureListenerC2785ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        gestureDetectorOnGestureListenerC2785ci.getWebViewFactory().a(new bk.l() { // from class: b7.ea
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C3150r7.a(df2, (GestureDetectorOnGestureListenerC2785ci) obj);
            }
        });
    }

    public C3150r7(WeakReference weakReference, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, RelativeLayout relativeLayout) {
        ck.p.j(weakReference, "activityRef");
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "adContainer");
        ck.p.j(relativeLayout, "adBackgroundView");
        ck.p.j(relativeLayout, "adBackgroundView");
        this.f25240a = relativeLayout;
        this.f25241b = Ef.a(J5.g());
        this.f25242c = 1.0f;
        this.f25244e = weakReference;
        this.f25245f = gestureDetectorOnGestureListenerC2785ci;
        this.f25246g = relativeLayout;
    }

    public final void b() {
        Activity activity = (Activity) this.f25244e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f22323e) {
            try {
                B fullScreenEventsListener = this.f25245f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    Vh vh2 = (Vh) fullScreenEventsListener;
                    InterfaceC3028m9 interfaceC3028m9 = vh2.f23709a.f24162i;
                    if (interfaceC3028m9 != null) {
                        String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
                        ck.p.i(str, "access$getTAG$cp(...)");
                        ((C3053n9) interfaceC3028m9).a(str, com.ironsource.Mf.f27063m);
                    }
                    if (ck.p.e(Profile.DEFAULT_PROFILE_NAME, vh2.f23709a.getViewState())) {
                        vh2.f23709a.setAndUpdateViewState("Hidden");
                    }
                    vh2.f23709a.W();
                    mj.r rVar = mj.r.f64562a;
                }
            } catch (Exception e10) {
                e10.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                mj.r rVar2 = mj.r.f64562a;
            }
        } else {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25245f;
            ck.p.h(gestureDetectorOnGestureListenerC2785ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC2785ci.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC2785ci.m();
            } catch (Exception e11) {
                e11.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.f22317k;
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f25245f;
            ck.p.j(gestureDetectorOnGestureListenerC2785ci2, "container");
            InMobiAdActivity.f22317k.remove(gestureDetectorOnGestureListenerC2785ci2.hashCode());
        }
        this.f25245f.b();
    }

    public final void c() {
        I5 i10;
        RelativeLayout.LayoutParams layoutParams;
        if (this.f25242c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f25240a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.f25243d) {
            L5 l10 = J5.f22893a;
            Context context = this.f25240a.getContext();
            ck.p.i(context, "getContext(...)");
            i10 = J5.b(context);
        } else {
            L5 l11 = J5.f22893a;
            Context context2 = this.f25240a.getContext();
            ck.p.i(context2, "getContext(...)");
            ck.p.j(context2, GAMConfig.KEY_CONTEXT);
            Display displayA = J5.a(context2);
            if (displayA == null) {
                i10 = J5.f22894b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getMetrics(displayMetrics);
                i10 = new I5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i11 = i10.f22845a;
        Objects.toString(this.f25241b);
        if (Ef.b(this.f25241b)) {
            layoutParams = new RelativeLayout.LayoutParams(ek.b.c(i10.f22845a * this.f25242c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, ek.b.c(i10.f22846b * this.f25242c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f25240a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.f25246g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Fn viewableAd = this.f25245f.getViewableAd();
        View viewC = viewableAd != null ? viewableAd.c() : null;
        if (viewC != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewC);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.f25246g.getContext());
            relativeLayout.addView(viewC, new RelativeLayout.LayoutParams(-1, -1));
            this.f25246g.addView(relativeLayout, layoutParams);
            this.f25245f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f25245f.getPlacementType()) {
            try {
                HashMap map = new HashMap();
                Fn viewableAd = this.f25245f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(map);
                }
            } catch (Exception e10) {
                e10.getMessage();
                B fullScreenEventsListener = this.f25245f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((Vh) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25245f;
        if (!(gestureDetectorOnGestureListenerC2785ci instanceof GestureDetectorOnGestureListenerC2785ci)) {
            gestureDetectorOnGestureListenerC2785ci = null;
        }
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2785ci.getWebViewFactory().a(new bk.l() { // from class: b7.fa
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C3150r7.a((GestureDetectorOnGestureListenerC2785ci) obj);
            }
        });
        if (gestureDetectorOnGestureListenerC2785ci.K) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2785ci.m();
        } catch (Exception e10) {
            e10.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public static final mj.r a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "it");
        gestureDetectorOnGestureListenerC2785ci.r();
        return mj.r.f64562a;
    }

    public static final mj.r a(Df df2, GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "it");
        gestureDetectorOnGestureListenerC2785ci.b(df2);
        return mj.r.f64562a;
    }
}
