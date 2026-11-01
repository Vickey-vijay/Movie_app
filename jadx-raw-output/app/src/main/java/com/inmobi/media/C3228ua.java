package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3228ua extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3253va f25450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f25451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3228ua(C3253va c3253va, VideoViewPosition videoViewPosition, String str, rj.c cVar) {
        super(2, cVar);
        this.f25450a = c3253va;
        this.f25451b = videoViewPosition;
        this.f25452c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3228ua(this.f25450a, this.f25451b, this.f25452c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3228ua) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f25450a.f25558a;
        VideoViewPosition videoViewPosition = this.f25451b;
        String str = this.f25452c;
        gestureDetectorOnGestureListenerC2785ci.getClass();
        ck.p.j(videoViewPosition, "videoViewPosition");
        C3251v8 c3251v8 = gestureDetectorOnGestureListenerC2785ci.Y0;
        if (c3251v8 != null) {
            ck.p.j(videoViewPosition, "newVideoViewPosition");
            if (!c3251v8.f25545g.get()) {
                EnumC3176s8[] enumC3176s8Arr = {EnumC3176s8.LOADED, EnumC3176s8.PLAYING, EnumC3176s8.PAUSED, EnumC3176s8.COMPLETED};
                EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
                if (C3251v8.a(c3251v8, enumC3176s8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    c3251v8.f25549k.a(videoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC2785ci.a(EnumC3102p8.VIDEO_PLAYER_POSITION_UPDATED, str);
        } else {
            EnumC3102p8 enumC3102p8 = EnumC3102p8.VIDEO_COMMAND_ERROR;
            EnumC2723a8[] enumC2723a8Arr2 = EnumC2723a8.f23967a;
            X7 x10 = new X7((Object) str);
            ck.p.j(x10, IconCompat.EXTRA_OBJ);
            gestureDetectorOnGestureListenerC2785ci.a(enumC3102p8, AbstractC3029ma.a(x10, X7.class));
        }
        return mj.r.f64562a;
    }
}
