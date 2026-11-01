package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import g5.k0;
import java.lang.reflect.Method;
import k3.k;
import m3.l;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public long A;
    public boolean B;
    public long C;
    public long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f19044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AudioTrack f19045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public l f19048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f19053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Method f19054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f19055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f19058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f19059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f19060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f19061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f19064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f19067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f19068z;

    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface a {
        void onInvalidLatency(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    public static boolean o(int i10) {
        return k0.f53108a < 23 && (i10 == 5 || i10 == 6);
    }

    public final boolean a() {
        return this.f19050h && ((AudioTrack) g5.a.e(this.f19045c)).getPlayState() == 2 && e() == 0;
    }

    public long d(boolean z10) {
        long jF;
        if (((AudioTrack) g5.a.e(this.f19045c)).getPlayState() == 3) {
            m();
        }
        long jNanoTime = System.nanoTime() / 1000;
        l lVar = (l) g5.a.e(this.f19048f);
        boolean zD = lVar.d();
        if (zD) {
            jF = b(lVar.b()) + (jNanoTime - lVar.c());
        } else {
            jF = this.f19063u == 0 ? f() : this.f19052j + jNanoTime;
            if (!z10) {
                jF = Math.max(0L, jF - this.f19055m);
            }
        }
        if (this.B != zD) {
            this.D = this.A;
            this.C = this.f19068z;
        }
        long j10 = jNanoTime - this.D;
        if (j10 < 1000000) {
            long j11 = this.C + j10;
            long j12 = (j10 * 1000) / 1000000;
            jF = ((jF * j12) + ((1000 - j12) * j11)) / 1000;
        }
        this.A = jNanoTime;
        this.f19068z = jF;
        this.B = zD;
        return jF;
    }

    public final long e() {
        AudioTrack audioTrack = (AudioTrack) g5.a.e(this.f19045c);
        if (this.f19064v != -9223372036854775807L) {
            return Math.min(this.f19067y, this.f19066x + ((((SystemClock.elapsedRealtime() * 1000) - this.f19064v) * ((long) this.f19049g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f19050h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f19061s = this.f19059q;
            }
            playbackHeadPosition += this.f19061s;
        }
        if (k0.f53108a <= 29) {
            if (playbackHeadPosition == 0 && this.f19059q > 0 && playState == 3) {
                if (this.f19065w == -9223372036854775807L) {
                    this.f19065w = SystemClock.elapsedRealtime();
                }
                return this.f19059q;
            }
            this.f19065w = -9223372036854775807L;
        }
        if (this.f19059q > playbackHeadPosition) {
            this.f19060r++;
        }
        this.f19059q = playbackHeadPosition;
        return playbackHeadPosition + (this.f19060r << 32);
    }

    public boolean i() {
        return ((AudioTrack) g5.a.e(this.f19045c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f19065w != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f19065w >= 200;
    }

    public boolean k(long j10) {
        a aVar;
        int playState = ((AudioTrack) g5.a.e(this.f19045c)).getPlayState();
        if (this.f19050h) {
            if (playState == 2) {
                this.f19056n = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f19056n;
        boolean zH = h(j10);
        this.f19056n = zH;
        if (z10 && !zH && playState != 1 && (aVar = this.f19043a) != null) {
            aVar.onUnderrun(this.f19047e, k.b(this.f19051i));
        }
        return true;
    }

    public final void l(long j10, long j11) {
        l lVar = (l) g5.a.e(this.f19048f);
        if (lVar.e(j10)) {
            long jC = lVar.c();
            long jB = lVar.b();
            if (Math.abs(jC - j10) > 5000000) {
                this.f19043a.onSystemTimeUsMismatch(jB, jC, j10, j11);
                lVar.f();
            } else if (Math.abs(b(jB) - j11) <= 5000000) {
                lVar.a();
            } else {
                this.f19043a.onPositionFramesMismatch(jB, jC, j10, j11);
                lVar.f();
            }
        }
    }

    public final void n(long j10) {
        Method method;
        if (!this.f19057o || (method = this.f19054l) == null || j10 - this.f19058p < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) k0.i((Integer) method.invoke(g5.a.e(this.f19045c), new Object[0]))).intValue()) * 1000) - this.f19051i;
            this.f19055m = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f19055m = jMax;
            if (jMax > 5000000) {
                this.f19043a.onInvalidLatency(jMax);
                this.f19055m = 0L;
            }
        } catch (Exception unused) {
            this.f19054l = null;
        }
        this.f19058p = j10;
    }

    public final void r() {
        this.f19052j = 0L;
        this.f19063u = 0;
        this.f19062t = 0;
        this.f19053k = 0L;
        this.A = 0L;
        this.D = 0L;
    }

    public void s(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f19045c = audioTrack;
        this.f19046d = i11;
        this.f19047e = i12;
        this.f19048f = new l(audioTrack);
        this.f19049g = audioTrack.getSampleRate();
        this.f19050h = o(i10);
        boolean zF0 = k0.f0(i10);
        this.f19057o = zF0;
        this.f19051i = zF0 ? b(i12 / i11) : -9223372036854775807L;
        this.f19059q = 0L;
        this.f19060r = 0L;
        this.f19061s = 0L;
        this.f19056n = false;
        this.f19064v = -9223372036854775807L;
        this.f19065w = -9223372036854775807L;
        this.f19058p = 0L;
        this.f19055m = 0L;
    }

    public void t() {
        ((l) g5.a.e(this.f19048f)).g();
    }

    public b(a aVar) {
        this.f19043a = (a) g5.a.e(aVar);
        if (k0.f53108a >= 18) {
            try {
                this.f19054l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f19044b = new long[10];
    }

    public final long b(long j10) {
        return (j10 * 1000000) / ((long) this.f19049g);
    }

    public int c(long j10) {
        return this.f19047e - ((int) (j10 - (e() * ((long) this.f19046d))));
    }

    public final long f() {
        return b(e());
    }

    public void g(long j10) {
        this.f19066x = e();
        this.f19064v = SystemClock.elapsedRealtime() * 1000;
        this.f19067y = j10;
    }

    public boolean h(long j10) {
        if (j10 <= e() && !a()) {
            return false;
        }
        return true;
    }

    public final void m() {
        long jF = f();
        if (jF == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f19053k >= 30000) {
            long[] jArr = this.f19044b;
            int i10 = this.f19062t;
            jArr[i10] = jF - jNanoTime;
            this.f19062t = (i10 + 1) % 10;
            int i11 = this.f19063u;
            if (i11 < 10) {
                this.f19063u = i11 + 1;
            }
            this.f19053k = jNanoTime;
            this.f19052j = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f19063u;
                if (i12 >= i13) {
                    break;
                }
                this.f19052j += this.f19044b[i12] / ((long) i13);
                i12++;
            }
        }
        if (this.f19050h) {
            return;
        }
        l(jNanoTime, jF);
        n(jNanoTime);
    }

    public boolean p() {
        r();
        if (this.f19064v == -9223372036854775807L) {
            ((l) g5.a.e(this.f19048f)).g();
            return true;
        }
        return false;
    }

    public void q() {
        r();
        this.f19045c = null;
        this.f19048f = null;
    }
}
