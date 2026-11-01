package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class n73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e73 f80583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f80585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f80586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f80588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f80589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f80590h;

    public final int a(long j10) {
        for (int iA = ib3.a(this.f80588f, j10, true); iA < this.f80588f.length; iA++) {
            if ((this.f80589g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }

    public n73(e73 e73Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ni.a(z11);
        ni.a(iArr2.length == jArr2.length);
        this.f80583a = e73Var;
        this.f80585c = jArr;
        this.f80586d = iArr;
        this.f80587e = i10;
        this.f80588f = jArr2;
        this.f80589g = iArr2;
        this.f80590h = j10;
        this.f80584b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }
}
