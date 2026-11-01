package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3203ta extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3253va f25378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f25379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f25380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203ta(C3253va c3253va, Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, rj.c cVar) {
        super(2, cVar);
        this.f25378a = c3253va;
        this.f25379b = ref$ObjectRef;
        this.f25380c = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3203ta(this.f25378a, this.f25379b, this.f25380c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3203ta) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, org.json.JSONObject] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            HtmlVideoPlaybackState playbackState = this.f25378a.f25558a.getPlaybackState();
            if (playbackState == null) {
                playbackState = new HtmlVideoPlaybackState();
            }
            Ref$ObjectRef ref$ObjectRef = this.f25379b;
            ck.p.j(playbackState, IconCompat.EXTRA_OBJ);
            ref$ObjectRef.element = AbstractC3029ma.a(playbackState, HtmlVideoPlaybackState.class);
            return mj.r.f64562a;
        } finally {
            this.f25380c.countDown();
        }
    }
}
