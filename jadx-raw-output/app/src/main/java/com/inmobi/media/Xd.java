package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Xd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2729ae f23795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xd(C2729ae c2729ae, rj.c cVar) {
        super(2, cVar);
        this.f23795a = c2729ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Xd(this.f23795a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Xd(this.f23795a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        this.f23795a.f23998g.setActivated(false);
        this.f23795a.f23998g.setFocusable(false);
        MediaPlayer mediaPlayer = this.f23795a.f23994c;
        ck.p.j(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        this.f23795a.f23997f.a();
        return mj.r.f64562a;
    }
}
