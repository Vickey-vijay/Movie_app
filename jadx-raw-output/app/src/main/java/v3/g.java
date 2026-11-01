package v3;

import androidx.annotation.Nullable;
import g5.k0;
import g5.m;
import g5.t;
import q3.q;
import q3.s;

/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f73039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f73040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f73042d;

    @Override // q3.s
    public boolean isSeekable() {
        return true;
    }

    @Nullable
    public static g a(long j10, long j11, q qVar, t tVar) {
        int iY;
        tVar.M(10);
        int iJ = tVar.j();
        if (iJ <= 0) {
            return null;
        }
        int i10 = qVar.f66473d;
        long jY0 = k0.y0(iJ, 1000000 * ((long) (i10 >= 32000 ? 1152 : 576)), i10);
        int iE = tVar.E();
        int iE2 = tVar.E();
        int iE3 = tVar.E();
        tVar.M(2);
        long j12 = j11 + ((long) qVar.f66472c);
        long[] jArr = new long[iE];
        long[] jArr2 = new long[iE];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iE) {
            int i12 = iE2;
            long j14 = j12;
            jArr[i11] = (((long) i11) * jY0) / ((long) iE);
            jArr2[i11] = Math.max(j13, j14);
            if (iE3 == 1) {
                iY = tVar.y();
            } else if (iE3 == 2) {
                iY = tVar.E();
            } else if (iE3 == 3) {
                iY = tVar.B();
            } else {
                if (iE3 != 4) {
                    return null;
                }
                iY = tVar.C();
            }
            j13 += (long) (iY * i12);
            i11++;
            j12 = j14;
            iE2 = i12;
        }
        if (j10 != -1 && j10 != j13) {
            m.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new g(jArr, jArr2, jY0, j13);
    }

    @Override // v3.f
    public long getDataEndPosition() {
        return this.f73042d;
    }

    @Override // q3.s
    public long getDurationUs() {
        return this.f73041c;
    }

    @Override // q3.s
    public s.a getSeekPoints(long j10) {
        int iH = k0.h(this.f73039a, j10, true, true);
        q3.t tVar = new q3.t(this.f73039a[iH], this.f73040b[iH]);
        if (tVar.f66483a >= j10 || iH == this.f73039a.length - 1) {
            return new s.a(tVar);
        }
        int i10 = iH + 1;
        return new s.a(tVar, new q3.t(this.f73039a[i10], this.f73040b[i10]));
    }

    @Override // v3.f
    public long getTimeUs(long j10) {
        return this.f73039a[k0.h(this.f73040b, j10, true, true)];
    }

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f73039a = jArr;
        this.f73040b = jArr2;
        this.f73041c = j10;
        this.f73042d = j11;
    }
}
