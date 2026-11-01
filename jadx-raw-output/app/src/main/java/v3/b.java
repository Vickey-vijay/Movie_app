package v3;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import g5.k0;
import k3.k;
import q3.s;
import q3.t;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f73018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f73019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73020c;

    public static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int iH = k0.h(jArr, j10, true, true);
        long j11 = jArr[iH];
        long j12 = jArr2[iH];
        int i10 = iH + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // v3.f
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // q3.s
    public boolean isSeekable() {
        return true;
    }

    public static b a(long j10, MlltFrame mlltFrame) {
        int length = mlltFrame.f19329f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (mlltFrame.f19327d + mlltFrame.f19329f[i12]);
            j11 += (long) (mlltFrame.f19328e + mlltFrame.f19330g[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j11;
        }
        return new b(jArr, jArr2);
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f73020c;
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        Pair<Long, Long> pairB = b(k.b(k0.r(j10, 0L, this.f73020c)), this.f73019b, this.f73018a);
        return new s.a(new t(k.a(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // v3.f
    public long getTimeUs(long j10) {
        return k.a(((Long) b(j10, this.f73018a, this.f73019b).second).longValue());
    }

    public b(long[] jArr, long[] jArr2) {
        this.f73018a = jArr;
        this.f73019b = jArr2;
        this.f73020c = k.a(jArr2[jArr2.length - 1]);
    }
}
