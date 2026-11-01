package com.inmobi.media;

import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Pd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f23333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pd(Sd sd2, rj.c cVar) {
        super(2, cVar);
        this.f23333a = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Pd(this.f23333a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Pd(this.f23333a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        Sd sd2 = this.f23333a;
        if (sd2.f23506b.f23412b) {
            C2867fn c2867fn = sd2.f23514j;
            c2867fn.c();
            c2867fn.f24396g = -1;
            c2867fn.b();
            MediaPlayer mediaPlayer = this.f23333a.f23512h;
            ck.p.j(mediaPlayer, "<this>");
            try {
                mediaPlayer.seekTo(0);
            } catch (IllegalStateException unused) {
            }
            MediaPlayer mediaPlayer2 = this.f23333a.f23512h;
            ck.p.j(mediaPlayer2, "<this>");
            try {
                InMobiVideoBridge.MediaPlayerStart(mediaPlayer2);
            } catch (IllegalStateException unused2) {
            }
        } else {
            sd2.f23514j.c();
            C3284wg c3284wg = (C3284wg) this.f23333a.f23515k.f25112i.f23770d.getValue();
            c3284wg.f25651f.set(true);
            H6.a(c3284wg.f25650e);
            c3284wg.f25650e = null;
            this.f23333a.f23509e = EnumC3184sg.STATE_PLAYBACK_COMPLETED;
        }
        return mj.r.f64562a;
    }
}
