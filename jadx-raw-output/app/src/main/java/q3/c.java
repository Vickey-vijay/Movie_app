package q3;

import g5.k0;

/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f66435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f66437f;

    public static long c(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f66436e)) / 8000000;
        int i10 = this.f66434c;
        return this.f66433b + k0.r((j11 / ((long) i10)) * ((long) i10), 0L, this.f66435d - ((long) i10));
    }

    public long b(long j10) {
        return c(j10, this.f66433b, this.f66436e);
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f66437f;
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        if (this.f66435d == -1) {
            return new s.a(new t(0L, this.f66433b));
        }
        long jA = a(j10);
        long jB = b(jA);
        t tVar = new t(jB, jA);
        if (jB < j10) {
            int i10 = this.f66434c;
            if (((long) i10) + jA < this.f66432a) {
                long j11 = jA + ((long) i10);
                return new s.a(tVar, new t(b(j11), j11));
            }
        }
        return new s.a(tVar);
    }

    @Override // q3.s
    public boolean isSeekable() {
        return this.f66435d != -1;
    }

    public c(long j10, long j11, int i10, int i11) {
        this.f66432a = j10;
        this.f66433b = j11;
        this.f66434c = i11 == -1 ? 1 : i11;
        this.f66436e = i10;
        if (j10 == -1) {
            this.f66435d = -1L;
            this.f66437f = -9223372036854775807L;
        } else {
            this.f66435d = j10 - j11;
            this.f66437f = c(j10, j11, i10);
        }
    }
}
