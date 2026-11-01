package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes7.dex */
public final class Uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23650a;

    public Uh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        this.f23650a = gestureDetectorOnGestureListenerC2785ci;
    }

    public final void a(C2749b8 c2749b8) {
        ck.p.j(c2749b8, "error");
        InterfaceC3028m9 interfaceC3028m9 = this.f23650a.f24162i;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) c2749b8.f24047b));
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f23650a;
        EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_PLAYBACK_ERROR;
        ck.p.j(c2749b8, IconCompat.EXTRA_OBJ);
        gestureDetectorOnGestureListenerC2785ci.a(enumC3102p8, AbstractC3029ma.a(c2749b8, c2749b8.getClass()));
    }
}
