package w3;

import g5.k0;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f73487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f73489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f73490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f73492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f73493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f73494h;

    public int a(long j10) {
        for (int iH = k0.h(this.f73492f, j10, true, false); iH >= 0; iH--) {
            if ((this.f73493g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iE = k0.e(this.f73492f, j10, true, false); iE < this.f73492f.length; iE++) {
            if ((this.f73493g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }

    public o(l lVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        g5.a.a(z11);
        g5.a.a(iArr2.length == jArr2.length);
        this.f73487a = lVar;
        this.f73489c = jArr;
        this.f73490d = iArr;
        this.f73491e = i10;
        this.f73492f = jArr2;
        this.f73493g = iArr2;
        this.f73494h = j10;
        this.f73488b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }
}
