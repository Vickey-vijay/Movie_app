package com.inmobi.media;

import android.media.MediaPlayer;
import com.inmobi.media.C2867fn;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2867fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaPlayer f24390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.l0 f24391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qk.k f24393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f24395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24396g;

    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:68:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final Object a(C2867fn c2867fn, ContinuationImpl continuationImpl) throws Throwable {
        C2816dn c2816dn;
        boolean zIsPlaying;
        int currentPosition;
        Object objEmit;
        int i10;
        Object objEmit2;
        int i11;
        Object objEmit3;
        c2867fn.getClass();
        if (continuationImpl instanceof C2816dn) {
            c2816dn = (C2816dn) continuationImpl;
            int i12 = c2816dn.f24268e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c2816dn.f24268e = i12 - Integer.MIN_VALUE;
            } else {
                c2816dn = new C2816dn(c2867fn, continuationImpl);
            }
        } else {
            c2816dn = new C2816dn(c2867fn, continuationImpl);
        }
        Object obj = c2816dn.f24266c;
        Object objF = sj.a.f();
        int i13 = c2816dn.f24268e;
        if (i13 == 0) {
            kotlin.c.b(obj);
            MediaPlayer mediaPlayer = c2867fn.f24390a;
            ck.p.j(mediaPlayer, "<this>");
            try {
                zIsPlaying = mediaPlayer.isPlaying();
            } catch (IllegalStateException unused) {
                zIsPlaying = false;
            }
            if (zIsPlaying) {
                currentPosition = c2867fn.f24390a.getCurrentPosition();
                int duration = c2867fn.f24390a.getDuration();
                if (duration == -1) {
                    return mj.r.f64562a;
                }
                int i14 = duration > 0 ? (currentPosition * 100) / duration : 0;
                if (c2867fn.f24396g == 4 && i14 < 25) {
                    c2867fn.f24396g = -1;
                }
                c2816dn.f24264a = currentPosition;
                c2816dn.f24265b = i14;
                c2816dn.f24268e = 1;
                if (c2867fn.f24396g >= 0) {
                    objEmit = mj.r.f64562a;
                } else {
                    c2867fn.f24396g = 0;
                    objEmit = c2867fn.f24393d.emit(new C2992kn(duration), c2816dn);
                    if (objEmit != sj.a.f()) {
                        objEmit = mj.r.f64562a;
                    }
                }
                if (objEmit == objF) {
                    return objF;
                }
                i10 = i14;
                c2816dn.f24264a = currentPosition;
                c2816dn.f24265b = i10;
                c2816dn.f24268e = 2;
                if (c2867fn.a(i10, 25, 1)) {
                    c2867fn.f24396g = 1;
                    objEmit2 = c2867fn.f24393d.emit(C3315xm.f25742a, c2816dn);
                    if (objEmit2 != sj.a.f()) {
                        objEmit2 = mj.r.f64562a;
                    }
                } else if (c2867fn.a(i10, 50, 2)) {
                    c2867fn.f24396g = 2;
                    objEmit2 = c2867fn.f24393d.emit(C2942in.f24569a, c2816dn);
                    if (objEmit2 != sj.a.f()) {
                        objEmit2 = mj.r.f64562a;
                    }
                } else if (c2867fn.a(i10, 75, 3)) {
                    c2867fn.f24396g = 3;
                    objEmit2 = c2867fn.f24393d.emit(C3166rn.f25283a, c2816dn);
                    if (objEmit2 != sj.a.f()) {
                        objEmit2 = mj.r.f64562a;
                    }
                } else {
                    objEmit2 = mj.r.f64562a;
                }
                if (objEmit2 == objF) {
                    return objF;
                }
                i11 = currentPosition;
                c2816dn.f24268e = 3;
                if (c2867fn.f24396g != 4) {
                    objEmit3 = mj.r.f64562a;
                } else {
                    objEmit3 = mj.r.f64562a;
                }
                if (objEmit3 == objF) {
                    return objF;
                }
            }
        } else if (i13 == 1) {
            i10 = c2816dn.f24265b;
            int i15 = c2816dn.f24264a;
            kotlin.c.b(obj);
            currentPosition = i15;
            c2816dn.f24264a = currentPosition;
            c2816dn.f24265b = i10;
            c2816dn.f24268e = 2;
            if (c2867fn.a(i10, 25, 1)) {
                c2867fn.f24396g = 1;
                objEmit2 = c2867fn.f24393d.emit(C3315xm.f25742a, c2816dn);
                if (objEmit2 != sj.a.f()) {
                    objEmit2 = mj.r.f64562a;
                }
            } else if (c2867fn.a(i10, 50, 2)) {
                c2867fn.f24396g = 2;
                objEmit2 = c2867fn.f24393d.emit(C2942in.f24569a, c2816dn);
                if (objEmit2 != sj.a.f()) {
                    objEmit2 = mj.r.f64562a;
                }
            } else if (c2867fn.a(i10, 75, 3)) {
                c2867fn.f24396g = 3;
                objEmit2 = c2867fn.f24393d.emit(C3166rn.f25283a, c2816dn);
                if (objEmit2 != sj.a.f()) {
                    objEmit2 = mj.r.f64562a;
                }
            } else {
                objEmit2 = mj.r.f64562a;
            }
            if (objEmit2 == objF) {
                return objF;
            }
            i11 = currentPosition;
            c2816dn.f24268e = 3;
            if (c2867fn.f24396g != 4) {
                objEmit3 = mj.r.f64562a;
            } else {
                objEmit3 = mj.r.f64562a;
            }
            if (objEmit3 == objF) {
                return objF;
            }
        } else if (i13 == 2) {
            i10 = c2816dn.f24265b;
            i11 = c2816dn.f24264a;
            kotlin.c.b(obj);
            c2816dn.f24268e = 3;
            if (c2867fn.f24396g != 4 || (objEmit3 = c2867fn.f24393d.emit(new Xm(i11, i10), c2816dn)) != sj.a.f()) {
                objEmit3 = mj.r.f64562a;
            }
            if (objEmit3 == objF) {
                return objF;
            }
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return mj.r.f64562a;
    }

    public C2867fn(MediaPlayer mediaPlayer, nk.l0 l0Var, long j10, qk.k kVar) {
        ck.p.j(mediaPlayer, "mediaPlayer");
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(kVar, "progressEvents");
        this.f24390a = mediaPlayer;
        this.f24391b = l0Var;
        this.f24392c = j10;
        this.f24393d = kVar;
        this.f24394e = new AtomicBoolean(false);
        this.f24396g = -1;
    }

    public final void b() {
        if (this.f24394e.getAndSet(true)) {
            return;
        }
        this.f24395f = nk.j.d(this.f24391b, null, null, new C2841en(this, null), 3, null);
        a();
    }

    public final void c() {
        if (this.f24394e.getAndSet(false)) {
            this.f24390a.setOnCompletionListener(null);
            H6.a(this.f24395f);
            this.f24395f = null;
        }
    }

    public final void a() {
        this.f24390a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: b7.z6
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C2867fn.a(this.f5276b, mediaPlayer);
            }
        });
    }

    public static final void a(C2867fn c2867fn, MediaPlayer mediaPlayer) {
        c2867fn.f24396g = 4;
        nk.j.d(c2867fn.f24391b, null, null, new C2790cn(c2867fn, null), 3, null);
    }

    public final boolean a(int i10, int i11, int i12) {
        return i12 >= -1 && i12 <= 4 && i10 >= i11 && this.f24396g == i12 - 1;
    }
}
