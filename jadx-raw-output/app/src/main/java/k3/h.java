package k3;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes8.dex */
public class h implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5.i f62130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f62133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f62134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f62135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f62136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f62138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f62139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f62140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f62142m;

    public h() {
        this(new e5.i(true, 65536));
    }

    public static boolean e(p0[] p0VarArr, c5.c cVar) {
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (p0VarArr[i10].getTrackType() == 2 && cVar.a(i10) != null) {
                return true;
            }
        }
        return false;
    }

    public int c(p0[] p0VarArr, c5.c cVar) {
        int iD = 0;
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (cVar.a(i10) != null) {
                iD += d(p0VarArr[i10].getTrackType());
            }
        }
        return iD;
    }

    public final void f(boolean z10) {
        this.f62140k = 0;
        this.f62141l = false;
        if (z10) {
            this.f62130a.d();
        }
    }

    @Override // k3.g0
    public void onPrepared() {
        f(false);
    }

    @Override // k3.g0
    public void onReleased() {
        f(true);
    }

    @Override // k3.g0
    public void onStopped() {
        f(true);
    }

    @Deprecated
    public h(e5.i iVar) {
        this(iVar, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    public static void b(int i10, int i11, String str, String str2) {
        g5.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    public static int d(int i10) {
        switch (i10) {
            case 0:
                return 36438016;
            case 1:
                return C.DEFAULT_AUDIO_BUFFER_SIZE;
            case 2:
                return 32768000;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // k3.g0
    public e5.b getAllocator() {
        return this.f62130a;
    }

    @Override // k3.g0
    public long getBackBufferDurationUs() {
        return this.f62138i;
    }

    @Override // k3.g0
    public boolean retainBackBufferFromKeyframe() {
        return this.f62139j;
    }

    @Override // k3.g0
    public boolean shouldContinueLoading(long j10, float f10) {
        boolean z10 = true;
        boolean z11 = this.f62130a.c() >= this.f62140k;
        long jMin = this.f62142m ? this.f62132c : this.f62131b;
        if (f10 > 1.0f) {
            jMin = Math.min(g5.k0.O(jMin, f10), this.f62133d);
        }
        if (j10 < jMin) {
            if (!this.f62137h && z11) {
                z10 = false;
            }
            this.f62141l = z10;
        } else if (j10 >= this.f62133d || z11) {
            this.f62141l = false;
        }
        return this.f62141l;
    }

    public h(e5.i iVar, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, boolean z11) {
        b(i13, 0, "bufferForPlaybackMs", "0");
        b(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i10, i13, "minBufferAudioMs", "bufferForPlaybackMs");
        b(i11, i13, "minBufferVideoMs", "bufferForPlaybackMs");
        b(i10, i14, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        b(i11, i14, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        b(i12, i10, "maxBufferMs", "minBufferAudioMs");
        b(i12, i11, "maxBufferMs", "minBufferVideoMs");
        b(i16, 0, "backBufferDurationMs", "0");
        this.f62130a = iVar;
        this.f62131b = k.a(i10);
        this.f62132c = k.a(i11);
        this.f62133d = k.a(i12);
        this.f62134e = k.a(i13);
        this.f62135f = k.a(i14);
        this.f62136g = i15;
        this.f62137h = z10;
        this.f62138i = k.a(i16);
        this.f62139j = z11;
    }

    @Override // k3.g0
    public void a(p0[] p0VarArr, TrackGroupArray trackGroupArray, c5.c cVar) {
        this.f62142m = e(p0VarArr, cVar);
        int iC = this.f62136g;
        if (iC == -1) {
            iC = c(p0VarArr, cVar);
        }
        this.f62140k = iC;
        this.f62130a.e(iC);
    }

    @Override // k3.g0
    public boolean shouldStartPlayback(long j10, float f10, boolean z10) {
        long j11;
        long jT = g5.k0.T(j10, f10);
        if (z10) {
            j11 = this.f62135f;
        } else {
            j11 = this.f62134e;
        }
        if (j11 > 0 && jT < j11 && (this.f62137h || this.f62130a.c() < this.f62140k)) {
            return false;
        }
        return true;
    }
}
