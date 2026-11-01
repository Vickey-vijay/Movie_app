package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3321y3;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3321y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f25768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3028m9 f25771d;

    public final void a(final vo voVar) {
        Handler handler;
        ck.p.j(voVar, "insets");
        final ViewGroup viewGroup = (ViewGroup) this.f25768a.getRootView().findViewById(65534);
        if (viewGroup == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: b7.mc
            @Override // java.lang.Runnable
            public final void run() {
                C3321y3.a(this.f5066b, viewGroup, voVar);
            }
        });
    }

    public C3321y3(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, boolean z10, boolean z11, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        this.f25768a = gestureDetectorOnGestureListenerC2785ci;
        this.f25769b = z10;
        this.f25770c = z11;
        this.f25771d = interfaceC3028m9;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    public static final void a(C3321y3 c3321y3, ViewGroup viewGroup, vo voVar) {
        InterfaceC3028m9 interfaceC3028m9;
        mj.r rVar;
        Fn viewableAd;
        Fn viewableAd2;
        Pair pairA = c3321y3.a();
        View.OnClickListener onClickListener = (View.OnClickListener) pairA.component1();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pairA.component2();
        mj.r rVar2 = null;
        if (c3321y3.f25769b) {
            View viewFindViewById = viewGroup != null ? viewGroup.findViewById(65532) : null;
            if (viewFindViewById != null) {
                InterfaceC3028m9 interfaceC3028m10 = c3321y3.f25771d;
                if (interfaceC3028m10 != null) {
                    ((C3053n9) interfaceC3028m10).c("CloseButtonHandler", "Close button already present, not adding again");
                }
                c3321y3.a(viewFindViewById);
            } else {
                Context context = c3321y3.f25768a.getContext();
                ck.p.i(context, "getContext(...)");
                View c2949j5 = new C2949j5(context, (byte) 0, c3321y3.f25771d);
                c2949j5.setId(65532);
                C3298x5.f25687a.getClass();
                if (C3298x5.v()) {
                    c2949j5.setElevation(1.7014117E38f);
                }
                c2949j5.setOnClickListener(onClickListener);
                c3321y3.a(c2949j5);
                if (viewGroup != null) {
                    viewGroup.addView(c2949j5, layoutParams);
                }
                layoutParams.setMargins(0, voVar.f25598b, voVar.f25599c, 0);
            }
        } else {
            View viewFindViewById2 = c3321y3.f25768a.getRootView().findViewById(65532);
            if (viewFindViewById2 != null) {
                ko webViewFactory = c3321y3.f25768a.getWebViewFactory();
                webViewFactory.getClass();
                ck.p.j("default", "id");
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) webViewFactory.f24705b.get("default");
                if (gestureDetectorOnGestureListenerC2785ci != null && (viewableAd = gestureDetectorOnGestureListenerC2785ci.getViewableAd()) != null) {
                    viewableAd.a(viewFindViewById2);
                }
                ViewParent parent = viewFindViewById2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewFindViewById2);
                    rVar = mj.r.f64562a;
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    interfaceC3028m9 = c3321y3.f25771d;
                    if (interfaceC3028m9 != null) {
                        ((C3053n9) interfaceC3028m9).c("CloseButtonHandler", "Close button not present, not removing");
                        mj.r rVar3 = mj.r.f64562a;
                    }
                }
            } else {
                interfaceC3028m9 = c3321y3.f25771d;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).c("CloseButtonHandler", "Close button not present, not removing");
                    mj.r rVar4 = mj.r.f64562a;
                }
            }
        }
        if (c3321y3.f25770c) {
            View viewFindViewById3 = viewGroup != null ? viewGroup.findViewById(65531) : null;
            if (viewFindViewById3 != null) {
                InterfaceC3028m9 interfaceC3028m11 = c3321y3.f25771d;
                if (interfaceC3028m11 != null) {
                    ((C3053n9) interfaceC3028m11).c("CloseButtonHandler", "Close region already present, not adding again");
                }
                c3321y3.a(viewFindViewById3);
                return;
            }
            Context context2 = c3321y3.f25768a.getContext();
            ck.p.i(context2, "getContext(...)");
            View c2949j6 = new C2949j5(context2, (byte) 1, c3321y3.f25771d);
            c2949j6.setId(65531);
            C3298x5.f25687a.getClass();
            if (C3298x5.v()) {
                c2949j6.setElevation(1.7014117E38f);
            }
            c2949j6.setOnClickListener(onClickListener);
            c3321y3.a(c2949j6);
            if (viewGroup != null) {
                viewGroup.addView(c2949j6, layoutParams);
            }
            layoutParams.setMargins(0, voVar.f25598b, voVar.f25599c, 0);
            return;
        }
        View viewFindViewById4 = c3321y3.f25768a.getRootView().findViewById(65531);
        if (viewFindViewById4 != null) {
            ko webViewFactory2 = c3321y3.f25768a.getWebViewFactory();
            webViewFactory2.getClass();
            ck.p.j("default", "id");
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = (GestureDetectorOnGestureListenerC2785ci) webViewFactory2.f24705b.get("default");
            if (gestureDetectorOnGestureListenerC2785ci2 != null && (viewableAd2 = gestureDetectorOnGestureListenerC2785ci2.getViewableAd()) != null) {
                viewableAd2.a(viewFindViewById4);
            }
            ViewParent parent2 = viewFindViewById4.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(viewFindViewById4);
                rVar2 = mj.r.f64562a;
            }
            if (rVar2 != null) {
                return;
            }
        }
        InterfaceC3028m9 interfaceC3028m12 = c3321y3.f25771d;
        if (interfaceC3028m12 != null) {
            ((C3053n9) interfaceC3028m12).c("CloseButtonHandler", "Close region not present, not removing");
            mj.r rVar5 = mj.r.f64562a;
        }
    }

    public final void a(View view) {
        Fn viewableAd;
        ko webViewFactory = this.f25768a.getWebViewFactory();
        webViewFactory.getClass();
        ck.p.j("default", "id");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) webViewFactory.f24705b.get("default");
        if (gestureDetectorOnGestureListenerC2785ci == null || (viewableAd = gestureDetectorOnGestureListenerC2785ci.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final Pair a() {
        float f10 = J5.d().f23061c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: b7.nc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3321y3.a(this.f5086b, view);
            }
        };
        int i10 = (int) (50 * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(11);
        return mj.h.a(onClickListener, layoutParams);
    }

    public static final void a(C3321y3 c3321y3, View view) {
        try {
            c3321y3.f25768a.m();
        } catch (Exception e10) {
            e10.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
