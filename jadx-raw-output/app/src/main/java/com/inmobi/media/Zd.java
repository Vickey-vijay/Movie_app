package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Zd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2729ae f23909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zd(C2729ae c2729ae, rj.c cVar) {
        super(2, cVar);
        this.f23909a = c2729ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Zd(this.f23909a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Zd(this.f23909a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        if (this.f23909a.f23997f.d()) {
            C2729ae c2729ae = this.f23909a;
            MediaPlayer mediaPlayer = c2729ae.f23994c;
            ck.p.j(mediaPlayer, "<this>");
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException unused) {
            }
            c2729ae.a(c2729ae.f24002k, c2729ae.f24001j);
            P4.a(c2729ae.f23996e, c2729ae.f23993b, new S1(1.0f, false));
            c2729ae.f24000i = false;
        } else {
            this.f23909a.a();
        }
        return mj.r.f64562a;
    }
}
