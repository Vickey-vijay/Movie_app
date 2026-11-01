package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.inmobi.media.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3079oa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f24971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f24972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nk.u f24975e;

    public ViewTreeObserverOnGlobalLayoutListenerC3079oa(FrameLayout frameLayout, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(frameLayout, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.f24971a = frameLayout;
        this.f24972b = interfaceC3028m9;
        this.f24975e = nk.w.a(mj.r.f64562a);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC3028m9 interfaceC3028m9 = this.f24972b;
            if (interfaceC3028m9 != null) {
                String str = AbstractC3278wa.f25629a;
                ck.p.i(str, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m9).a(str, "close called");
            }
            this.f24973c = F3.b(this.f24971a.getWidth() / J5.b());
            this.f24974d = F3.b(this.f24971a.getHeight() / J5.b());
            this.f24971a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            nk.j.d(A9.f22351c, null, null, new C3054na(this, null), 3, null);
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24972b;
            if (interfaceC3028m10 != null) {
                String str2 = AbstractC3278wa.f25629a;
                ck.p.i(str2, "access$getTAG$p(...)");
                ((C3053n9) interfaceC3028m10).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e10.getMessage());
            }
        }
    }
}
