package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.ironsource.C3426d4;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3350z7 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2852f8 f25831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3350z7(rj.c cVar, N7 n10, C2852f8 c2852f8) {
        super(2, cVar);
        this.f25830a = n10;
        this.f25831b = c2852f8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3350z7(cVar, this.f25830a, this.f25831b);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3350z7((rj.c) obj2, this.f25830a, this.f25831b).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Surface surface;
        sj.a.f();
        kotlin.c.b(obj);
        this.f25830a.f23207l.set(EnumC3184sg.STATE_PREPARED);
        this.f25830a.f23211p.seekTo(0L);
        C3077o8 c3077o8 = this.f25830a.f23221z;
        if (!c3077o8.f24969g && (surface = c3077o8.f24967e) != null) {
            c3077o8.f24969g = true;
            c3077o8.f24964b.setVideoSurface(surface);
        }
        N7 n10 = this.f25830a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.f25831b.f24356b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.f25831b.f24355a);
        htmlVideoPlaybackState.setLatency(tj.a.e(System.currentTimeMillis() - this.f25830a.f23216u));
        htmlVideoPlaybackState.setMuted(this.f25830a.f23220y.f23493e);
        EnumC2952j8[] enumC2952j8Arr = EnumC2952j8.f24596a;
        htmlVideoPlaybackState.setState(C3426d4.i.f28564s);
        htmlVideoPlaybackState.setTime(this.f25830a.f23211p.getCurrentPosition() / 1000.0f);
        n10.a(new C2878g8(htmlVideoPlaybackState, this.f25831b.f24357c));
        return mj.r.f64562a;
    }
}
