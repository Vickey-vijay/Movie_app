package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class i61 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f78501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f78502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f78504d;

    @Override // yads.vw2
    public final tw2 b(long j10) {
        if (!this.f78504d) {
            xw2 xw2Var = xw2.f84726c;
            return new tw2(xw2Var, xw2Var);
        }
        int iB = ib3.b(this.f78502b, j10, true);
        long[] jArr = this.f78502b;
        long j11 = jArr[iB];
        long[] jArr2 = this.f78501a;
        xw2 xw2Var2 = new xw2(j11, jArr2[iB]);
        if (j11 == j10 || iB == jArr.length - 1) {
            return new tw2(xw2Var2, xw2Var2);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var2, new xw2(jArr[i10], jArr2[i10]));
    }

    @Override // yads.vw2
    public final long c() {
        return this.f78503c;
    }

    public i61(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f78504d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f78501a = jArr3;
            long[] jArr4 = new long[i10];
            this.f78502b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f78501a = jArr;
            this.f78502b = jArr2;
        }
        this.f78503c = j10;
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f78504d;
    }
}
