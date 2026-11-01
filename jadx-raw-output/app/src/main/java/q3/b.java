package q3;

import g5.k0;
import java.util.Arrays;

/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f66427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f66428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f66429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f66430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f66431f;

    @Override // q3.s
    public boolean isSeekable() {
        return true;
    }

    public int a(long j10) {
        return k0.h(this.f66430e, j10, true, true);
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f66431f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f66426a + ", sizes=" + Arrays.toString(this.f66427b) + ", offsets=" + Arrays.toString(this.f66428c) + ", timeUs=" + Arrays.toString(this.f66430e) + ", durationsUs=" + Arrays.toString(this.f66429d) + ")";
    }

    public b(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f66427b = iArr;
        this.f66428c = jArr;
        this.f66429d = jArr2;
        this.f66430e = jArr3;
        int length = iArr.length;
        this.f66426a = length;
        if (length > 0) {
            this.f66431f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f66431f = 0L;
        }
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        int iA = a(j10);
        t tVar = new t(this.f66430e[iA], this.f66428c[iA]);
        if (tVar.f66483a < j10 && iA != this.f66426a - 1) {
            int i10 = iA + 1;
            return new s.a(tVar, new t(this.f66430e[i10], this.f66428c[i10]));
        }
        return new s.a(tVar);
    }
}
