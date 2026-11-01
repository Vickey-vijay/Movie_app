package v3;

import androidx.annotation.Nullable;
import g5.k0;
import g5.m;
import g5.t;
import q3.q;
import q3.s;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f73046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f73047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final long[] f73048f;

    public h(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public h(long j10, int i10, long j11, long j12, @Nullable long[] jArr) {
        this.f73043a = j10;
        this.f73044b = i10;
        this.f73045c = j11;
        this.f73048f = jArr;
        this.f73046d = j12;
        this.f73047e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Nullable
    public static h a(long j10, long j11, q qVar, t tVar) {
        int iC;
        int i10 = qVar.f66476g;
        int i11 = qVar.f66473d;
        int iJ = tVar.j();
        if ((iJ & 1) != 1 || (iC = tVar.C()) == 0) {
            return null;
        }
        long jY0 = k0.y0(iC, ((long) i10) * 1000000, i11);
        if ((iJ & 6) != 6) {
            return new h(j11, qVar.f66472c, jY0);
        }
        long jA = tVar.A();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = tVar.y();
        }
        if (j10 != -1) {
            long j12 = j11 + jA;
            if (j10 != j12) {
                m.h("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new h(j11, qVar.f66472c, jY0, jA, jArr);
    }

    public final long b(int i10) {
        return (this.f73045c * ((long) i10)) / 100;
    }

    @Override // v3.f
    public long getDataEndPosition() {
        return this.f73047e;
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f73045c;
    }

    @Override // v3.f
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f73043a;
        if (!isSeekable() || j11 <= this.f73044b) {
            return 0L;
        }
        long[] jArr = (long[]) g5.a.e(this.f73048f);
        double d10 = (j11 * 256.0d) / this.f73046d;
        int iH = k0.h(jArr, (long) d10, true, true);
        long jB = b(iH);
        long j12 = jArr[iH];
        int i10 = iH + 1;
        long jB2 = b(i10);
        long j13 = iH == 99 ? 256L : jArr[i10];
        return jB + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jB2 - jB));
    }

    @Override // q3.s
    public boolean isSeekable() {
        return this.f73048f != null;
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        double d10;
        if (!isSeekable()) {
            return new s.a(new q3.t(0L, this.f73043a + ((long) this.f73044b)));
        }
        long jR = k0.r(j10, 0L, this.f73045c);
        double d11 = (jR * 100.0d) / this.f73045c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) g5.a.e(this.f73048f);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        return new s.a(new q3.t(jR, this.f73043a + k0.r(Math.round((d12 / 256.0d) * this.f73046d), this.f73044b, this.f73046d - 1)));
    }
}
