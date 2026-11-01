package p;

import c5.c;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e5.i;
import g5.k0;
import k3.g0;
import k3.k;
import k3.p0;

/* JADX INFO: compiled from: MyDefaultLoadControl.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f65853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f65854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f65855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f65856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f65857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f65858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f65859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f65860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f65861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f65862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f65863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f65864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f65865m;

    public b() {
        this(new i(true, 65536));
    }

    public static boolean e(p0[] p0VarArr, c cVar) {
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (p0VarArr[i10].getTrackType() == 2 && cVar.a(i10) != null) {
                return true;
            }
        }
        return false;
    }

    public int c(p0[] p0VarArr, c cVar) {
        int iD = 0;
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (cVar.a(i10) != null) {
                iD += d(p0VarArr[i10].getTrackType());
            }
        }
        return iD;
    }

    public final void f(boolean z10) {
        this.f65863k = 0;
        this.f65864l = false;
        if (z10) {
            this.f65853a.d();
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
    public b(i iVar) {
        this(iVar, 10000, 20000, 20000, 2500, 5000, -1, true, 0, false);
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
        return this.f65853a;
    }

    @Override // k3.g0
    public long getBackBufferDurationUs() {
        return this.f65861i;
    }

    @Override // k3.g0
    public boolean retainBackBufferFromKeyframe() {
        return this.f65862j;
    }

    @Override // k3.g0
    public boolean shouldContinueLoading(long j10, float f10) {
        boolean z10 = true;
        boolean z11 = this.f65853a.c() >= this.f65863k;
        long jMin = this.f65865m ? this.f65855c : this.f65854b;
        if (f10 > 1.0f) {
            jMin = Math.min(k0.O(jMin, f10), this.f65856d);
        }
        if (j10 < jMin) {
            if (!this.f65860h && z11) {
                z10 = false;
            }
            this.f65864l = z10;
        } else if (j10 >= this.f65856d || z11) {
            this.f65864l = false;
        }
        return this.f65864l;
    }

    public b(i iVar, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, boolean z11) {
        b(i13, 0, "bufferForPlaybackMs", "0");
        b(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i10, i13, "minBufferAudioMs", "bufferForPlaybackMs");
        b(i11, i13, "minBufferVideoMs", "bufferForPlaybackMs");
        b(i10, i14, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        b(i11, i14, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        b(i12, i10, "maxBufferMs", "minBufferAudioMs");
        b(i12, i11, "maxBufferMs", "minBufferVideoMs");
        b(i16, 0, "backBufferDurationMs", "0");
        this.f65853a = iVar;
        this.f65854b = k.a(i10);
        this.f65855c = k.a(i11);
        this.f65856d = k.a(i12);
        this.f65857e = k.a(i13);
        this.f65858f = k.a(i14);
        this.f65859g = i15;
        this.f65860h = z10;
        this.f65861i = k.a(i16);
        this.f65862j = z11;
    }

    @Override // k3.g0
    public void a(p0[] p0VarArr, TrackGroupArray trackGroupArray, c cVar) {
        this.f65865m = e(p0VarArr, cVar);
        int iC = this.f65859g;
        if (iC == -1) {
            iC = c(p0VarArr, cVar);
        }
        this.f65863k = iC;
        this.f65853a.e(iC);
    }

    @Override // k3.g0
    public boolean shouldStartPlayback(long j10, float f10, boolean z10) {
        long j11;
        long jT = k0.T(j10, f10);
        if (z10) {
            j11 = this.f65858f;
        } else {
            j11 = this.f65857e;
        }
        if (j11 > 0 && jT < j11 && (this.f65860h || this.f65853a.c() < this.f65863k)) {
            return false;
        }
        return true;
    }
}
