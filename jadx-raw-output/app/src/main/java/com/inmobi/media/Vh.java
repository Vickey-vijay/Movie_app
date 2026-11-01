package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Vh implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23709a;

    public Vh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f23709a = gestureDetectorOnGestureListenerC2785ci;
    }

    public final void a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f23709a.f24162i;
        if (interfaceC3028m9 != null) {
            String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).a(str, "onAdScreenDisplayFailed");
        }
        this.f23709a.getListener().c();
    }

    public final void b() {
        InterfaceC3028m9 interfaceC3028m9 = this.f23709a.f24162i;
        if (interfaceC3028m9 != null) {
            String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f23709a;
        if (gestureDetectorOnGestureListenerC2785ci.f24145b == 0) {
            gestureDetectorOnGestureListenerC2785ci.P = false;
        }
        gestureDetectorOnGestureListenerC2785ci.getListener().f(this.f23709a);
    }
}
