package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Ph implements InterfaceC2943j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23341a;

    public Ph(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f23341a = gestureDetectorOnGestureListenerC2785ci;
    }

    public final void a(Float f10) {
        this.f23341a.g("window.mraidview.broadcastEvent('audioVolumeChange', " + f10 + ");");
    }
}
