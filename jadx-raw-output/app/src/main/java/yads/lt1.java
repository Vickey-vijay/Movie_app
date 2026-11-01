package yads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class lt1 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f79907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f79908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79909c;

    @Override // yads.zw2
    public final long a() {
        return -1L;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        return ib3.a(((Long) a(j10, this.f79907a, this.f79908b).second).longValue());
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = this.f79909c;
        int i10 = ib3.f78556a;
        Pair pairA = a(ib3.b(Math.max(0L, Math.min(j10, j11))), this.f79908b, this.f79907a);
        xw2 xw2Var = new xw2(ib3.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new tw2(xw2Var, xw2Var);
    }

    @Override // yads.vw2
    public final long c() {
        return this.f79909c;
    }

    public lt1(long j10, long[] jArr, long[] jArr2) {
        this.f79907a = jArr;
        this.f79908b = jArr2;
        this.f79909c = j10 == -9223372036854775807L ? ib3.a(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iB = ib3.b(jArr, j10, true);
        long j11 = jArr[iB];
        long j12 = jArr2[iB];
        int i10 = iB + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }
}
