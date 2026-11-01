package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class fd3 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f77358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f77359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f77360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77361d;

    @Override // yads.zw2
    public final long a() {
        return this.f77361d;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        return this.f77358a[ib3.b(this.f77359b, j10, true)];
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iB = ib3.b(this.f77358a, j10, true);
        long[] jArr = this.f77358a;
        long j11 = jArr[iB];
        long[] jArr2 = this.f77359b;
        xw2 xw2Var = new xw2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == jArr.length - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var, new xw2(jArr[i10], jArr2[i10]));
    }

    @Override // yads.vw2
    public final long c() {
        return this.f77360c;
    }

    public fd3(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f77358a = jArr;
        this.f77359b = jArr2;
        this.f77360c = j10;
        this.f77361d = j11;
    }
}
