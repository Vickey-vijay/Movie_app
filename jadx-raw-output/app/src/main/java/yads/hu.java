package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class hu implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f78375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f78376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f78377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f78378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f78379f;

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iB = ib3.b(this.f78378e, j10, true);
        long[] jArr = this.f78378e;
        long j11 = jArr[iB];
        long[] jArr2 = this.f78376c;
        xw2 xw2Var = new xw2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == this.f78374a - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var, new xw2(jArr[i10], jArr2[i10]));
    }

    @Override // yads.vw2
    public final long c() {
        return this.f78379f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f78374a + ", sizes=" + Arrays.toString(this.f78375b) + ", offsets=" + Arrays.toString(this.f78376c) + ", timeUs=" + Arrays.toString(this.f78378e) + ", durationsUs=" + Arrays.toString(this.f78377d) + ")";
    }

    public hu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f78375b = iArr;
        this.f78376c = jArr;
        this.f78377d = jArr2;
        this.f78378e = jArr3;
        int length = iArr.length;
        this.f78374a = length;
        if (length > 0) {
            int i10 = length - 1;
            this.f78379f = jArr2[i10] + jArr3[i10];
        } else {
            this.f78379f = 0L;
        }
    }
}
