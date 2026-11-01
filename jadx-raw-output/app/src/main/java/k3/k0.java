package k3;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k4.r.a f62194n = new k4.r.a(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f62195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4.r.a f62196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f62198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f62199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ExoPlaybackException f62200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackGroupArray f62202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c5.e f62203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k4.r.a f62204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile long f62205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f62206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f62207m;

    public k0(v0 v0Var, k4.r.a aVar, long j10, long j11, int i10, @Nullable ExoPlaybackException exoPlaybackException, boolean z10, TrackGroupArray trackGroupArray, c5.e eVar, k4.r.a aVar2, long j12, long j13, long j14) {
        this.f62195a = v0Var;
        this.f62196b = aVar;
        this.f62197c = j10;
        this.f62198d = j11;
        this.f62199e = i10;
        this.f62200f = exoPlaybackException;
        this.f62201g = z10;
        this.f62202h = trackGroupArray;
        this.f62203i = eVar;
        this.f62204j = aVar2;
        this.f62205k = j12;
        this.f62206l = j13;
        this.f62207m = j14;
    }

    public static k0 h(long j10, c5.e eVar) {
        v0 v0Var = v0.f62325a;
        k4.r.a aVar = f62194n;
        return new k0(v0Var, aVar, j10, -9223372036854775807L, 1, null, false, TrackGroupArray.f19434e, eVar, aVar, j10, 0L, j10);
    }

    @CheckResult
    public k0 a(boolean z10) {
        return new k0(this.f62195a, this.f62196b, this.f62197c, this.f62198d, this.f62199e, this.f62200f, z10, this.f62202h, this.f62203i, this.f62204j, this.f62205k, this.f62206l, this.f62207m);
    }

    @CheckResult
    public k0 b(k4.r.a aVar) {
        return new k0(this.f62195a, this.f62196b, this.f62197c, this.f62198d, this.f62199e, this.f62200f, this.f62201g, this.f62202h, this.f62203i, aVar, this.f62205k, this.f62206l, this.f62207m);
    }

    @CheckResult
    public k0 c(k4.r.a aVar, long j10, long j11, long j12) {
        return new k0(this.f62195a, aVar, j10, aVar.b() ? j11 : -9223372036854775807L, this.f62199e, this.f62200f, this.f62201g, this.f62202h, this.f62203i, this.f62204j, this.f62205k, j12, j10);
    }

    @CheckResult
    public k0 d(@Nullable ExoPlaybackException exoPlaybackException) {
        return new k0(this.f62195a, this.f62196b, this.f62197c, this.f62198d, this.f62199e, exoPlaybackException, this.f62201g, this.f62202h, this.f62203i, this.f62204j, this.f62205k, this.f62206l, this.f62207m);
    }

    @CheckResult
    public k0 e(int i10) {
        return new k0(this.f62195a, this.f62196b, this.f62197c, this.f62198d, i10, this.f62200f, this.f62201g, this.f62202h, this.f62203i, this.f62204j, this.f62205k, this.f62206l, this.f62207m);
    }

    @CheckResult
    public k0 f(v0 v0Var) {
        return new k0(v0Var, this.f62196b, this.f62197c, this.f62198d, this.f62199e, this.f62200f, this.f62201g, this.f62202h, this.f62203i, this.f62204j, this.f62205k, this.f62206l, this.f62207m);
    }

    @CheckResult
    public k0 g(TrackGroupArray trackGroupArray, c5.e eVar) {
        return new k0(this.f62195a, this.f62196b, this.f62197c, this.f62198d, this.f62199e, this.f62200f, this.f62201g, trackGroupArray, eVar, this.f62204j, this.f62205k, this.f62206l, this.f62207m);
    }

    public k4.r.a i(boolean z10, v0.c cVar, v0.b bVar) {
        if (this.f62195a.q()) {
            return f62194n;
        }
        int iA = this.f62195a.a(z10);
        int i10 = this.f62195a.n(iA, cVar).f62341i;
        int iB = this.f62195a.b(this.f62196b.f62602a);
        long j10 = -1;
        if (iB != -1 && iA == this.f62195a.f(iB, bVar).f62328c) {
            j10 = this.f62196b.f62605d;
        }
        return new k4.r.a(this.f62195a.m(i10), j10);
    }
}
