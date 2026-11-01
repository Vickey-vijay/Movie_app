package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2759bi extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f24075a;

    @Override // com.inmobi.media.uo
    public final boolean a() {
        return !ck.p.e("Hidden", this.f24075a.getViewState());
    }

    public C2759bi(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f24075a = gestureDetectorOnGestureListenerC2785ci;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df df2, wo woVar) {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci;
        ck.p.j(df2, "orientation");
        ck.p.j(woVar, "finalInsets");
        this.f24075a.a(df2, woVar);
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f24075a;
        gestureDetectorOnGestureListenerC2785ci2.getClass();
        woVar.getClass();
        ck.p.j(df2, "orientation");
        vo voVar = (vo) woVar.f25675a.get(df2);
        if (voVar == null) {
            return;
        }
        if (voVar.f25598b == 0 && voVar.f25599c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC2785ci2.setCloseAssetArea(voVar);
        mj.g gVar = AbstractC3211ti.f25397a;
        ck.p.j(gestureDetectorOnGestureListenerC2785ci2, "<this>");
        if (ck.p.e(gestureDetectorOnGestureListenerC2785ci2.getRoute().f22535b, "default")) {
            gestureDetectorOnGestureListenerC2785ci = gestureDetectorOnGestureListenerC2785ci2;
        } else {
            ko webViewFactory = gestureDetectorOnGestureListenerC2785ci2.getWebViewFactory();
            webViewFactory.getClass();
            ck.p.j("default", "id");
            gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) webViewFactory.f24705b.get("default");
        }
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
            vo voVar2 = gestureDetectorOnGestureListenerC2785ci2.f24153d1;
            ck.p.j(voVar2, "insets");
            View viewFindViewById = gestureDetectorOnGestureListenerC2785ci.getRootView().findViewById(65531);
            C2949j5 c2949j5 = viewFindViewById instanceof C2949j5 ? (C2949j5) viewFindViewById : null;
            if (c2949j5 == null) {
                return;
            }
            View viewFindViewById2 = gestureDetectorOnGestureListenerC2785ci.getRootView().findViewById(65531);
            C2949j5 c2949j6 = viewFindViewById2 instanceof C2949j5 ? (C2949j5) viewFindViewById2 : null;
            if (c2949j6 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c2949j5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c2949j6.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, voVar2.f25598b, voVar2.f25599c, 0);
            layoutParams4.setMargins(0, voVar2.f25598b, voVar2.f25599c, 0);
        }
    }
}
