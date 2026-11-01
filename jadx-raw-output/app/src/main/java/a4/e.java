package a4;

import g5.k0;
import q3.s;
import q3.t;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3480e;

    @Override // q3.s
    public boolean isSeekable() {
        return true;
    }

    public final long a(long j10) {
        return k0.y0(j10 * ((long) this.f3477b), 1000000L, this.f3476a.f3469c);
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f3480e;
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        long jR = k0.r((((long) this.f3476a.f3469c) * j10) / (((long) this.f3477b) * 1000000), 0L, this.f3479d - 1);
        long j11 = this.f3478c + (((long) this.f3476a.f3471e) * jR);
        long jA = a(jR);
        t tVar = new t(jA, j11);
        if (jA >= j10 || jR == this.f3479d - 1) {
            return new s.a(tVar);
        }
        long j12 = jR + 1;
        return new s.a(tVar, new t(a(j12), this.f3478c + (((long) this.f3476a.f3471e) * j12)));
    }

    public e(c cVar, int i10, long j10, long j11) {
        this.f3476a = cVar;
        this.f3477b = i10;
        this.f3478c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f3471e);
        this.f3479d = j12;
        this.f3480e = a(j12);
    }
}
