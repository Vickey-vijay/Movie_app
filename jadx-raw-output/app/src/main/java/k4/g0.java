package k4;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes10.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5.b f62482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.t f62484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f62485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f62486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f62487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f62488g;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f62491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public e5.a f62492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public a f62493e;

        public a a() {
            this.f62492d = null;
            a aVar = this.f62493e;
            this.f62493e = null;
            return aVar;
        }

        public void b(e5.a aVar, a aVar2) {
            this.f62492d = aVar;
            this.f62493e = aVar2;
            this.f62491c = true;
        }

        public int c(long j10) {
            return ((int) (j10 - this.f62489a)) + this.f62492d.f52359b;
        }

        public a(long j10, int i10) {
            this.f62489a = j10;
            this.f62490b = j10 + ((long) i10);
        }
    }

    public final void a(long j10) {
        while (true) {
            a aVar = this.f62486e;
            if (j10 < aVar.f62490b) {
                return;
            } else {
                this.f62486e = aVar.f62493e;
            }
        }
    }

    public final void b(a aVar) {
        if (aVar.f62491c) {
            a aVar2 = this.f62487f;
            boolean z10 = aVar2.f62491c;
            int i10 = (z10 ? 1 : 0) + (((int) (aVar2.f62489a - aVar.f62489a)) / this.f62483b);
            e5.a[] aVarArr = new e5.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f62492d;
                aVar = aVar.a();
            }
            this.f62482a.b(aVarArr);
        }
    }

    public void c(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f62485d;
            if (j10 < aVar.f62490b) {
                break;
            }
            this.f62482a.a(aVar.f62492d);
            this.f62485d = this.f62485d.a();
        }
        if (this.f62486e.f62489a < aVar.f62489a) {
            this.f62486e = aVar;
        }
    }

    public void d(long j10) {
        this.f62488g = j10;
        if (j10 != 0) {
            a aVar = this.f62485d;
            if (j10 != aVar.f62489a) {
                while (this.f62488g > aVar.f62490b) {
                    aVar = aVar.f62493e;
                }
                a aVar2 = aVar.f62493e;
                b(aVar2);
                a aVar3 = new a(aVar.f62490b, this.f62483b);
                aVar.f62493e = aVar3;
                if (this.f62488g == aVar.f62490b) {
                    aVar = aVar3;
                }
                this.f62487f = aVar;
                if (this.f62486e == aVar2) {
                    this.f62486e = aVar3;
                    return;
                }
                return;
            }
        }
        b(this.f62485d);
        a aVar4 = new a(this.f62488g, this.f62483b);
        this.f62485d = aVar4;
        this.f62486e = aVar4;
        this.f62487f = aVar4;
    }

    public long e() {
        return this.f62488g;
    }

    public final void f(int i10) {
        long j10 = this.f62488g + ((long) i10);
        this.f62488g = j10;
        a aVar = this.f62487f;
        if (j10 == aVar.f62490b) {
            this.f62487f = aVar.f62493e;
        }
    }

    public final int g(int i10) {
        a aVar = this.f62487f;
        if (!aVar.f62491c) {
            aVar.b(this.f62482a.allocate(), new a(this.f62487f.f62490b, this.f62483b));
        }
        return Math.min(i10, (int) (this.f62487f.f62490b - this.f62488g));
    }

    public final void j(o3.e eVar, h0.a aVar) {
        long j10 = aVar.f62522b;
        int iE = 1;
        this.f62484c.H(1);
        i(j10, this.f62484c.f53154a, 1);
        long j11 = j10 + 1;
        byte b10 = this.f62484c.f53154a[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        o3.b bVar = eVar.f64968b;
        byte[] bArr = bVar.f64947a;
        if (bArr == null) {
            bVar.f64947a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        i(j11, bVar.f64947a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            this.f62484c.H(2);
            i(j12, this.f62484c.f53154a, 2);
            j12 += 2;
            iE = this.f62484c.E();
        }
        int i11 = iE;
        int[] iArr = bVar.f64950d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar.f64951e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            this.f62484c.H(i12);
            i(j12, this.f62484c.f53154a, i12);
            j12 += (long) i12;
            this.f62484c.L(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = this.f62484c.E();
                iArr4[i13] = this.f62484c.C();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f62521a - ((int) (j12 - aVar.f62522b));
        }
        q3.u.a aVar2 = aVar.f62523c;
        bVar.b(i11, iArr2, iArr4, aVar2.f66486b, bVar.f64947a, aVar2.f66485a, aVar2.f66487c, aVar2.f66488d);
        long j13 = aVar.f62522b;
        int i14 = (int) (j12 - j13);
        aVar.f62522b = j13 + ((long) i14);
        aVar.f62521a -= i14;
    }

    public void l() {
        b(this.f62485d);
        a aVar = new a(0L, this.f62483b);
        this.f62485d = aVar;
        this.f62486e = aVar;
        this.f62487f = aVar;
        this.f62488g = 0L;
        this.f62482a.trim();
    }

    public void m() {
        this.f62486e = this.f62485d;
    }

    public void o(g5.t tVar, int i10) {
        while (i10 > 0) {
            int iG = g(i10);
            a aVar = this.f62487f;
            tVar.h(aVar.f62492d.f52358a, aVar.c(this.f62488g), iG);
            i10 -= iG;
            f(iG);
        }
    }

    public g0(e5.b bVar) {
        this.f62482a = bVar;
        int individualAllocationLength = bVar.getIndividualAllocationLength();
        this.f62483b = individualAllocationLength;
        this.f62484c = new g5.t(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f62485d = aVar;
        this.f62486e = aVar;
        this.f62487f = aVar;
    }

    public final void h(long j10, ByteBuffer byteBuffer, int i10) {
        a(j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (this.f62486e.f62490b - j10));
            a aVar = this.f62486e;
            byteBuffer.put(aVar.f62492d.f52358a, aVar.c(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            a aVar2 = this.f62486e;
            if (j10 == aVar2.f62490b) {
                this.f62486e = aVar2.f62493e;
            }
        }
    }

    public final void i(long j10, byte[] bArr, int i10) {
        a(j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (this.f62486e.f62490b - j10));
            a aVar = this.f62486e;
            System.arraycopy(aVar.f62492d.f52358a, aVar.c(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            a aVar2 = this.f62486e;
            if (j10 == aVar2.f62490b) {
                this.f62486e = aVar2.f62493e;
            }
        }
    }

    public void k(o3.e eVar, h0.a aVar) {
        if (eVar.d()) {
            j(eVar, aVar);
        }
        if (eVar.hasSupplementalData()) {
            this.f62484c.H(4);
            i(aVar.f62522b, this.f62484c.f53154a, 4);
            int iC = this.f62484c.C();
            aVar.f62522b += 4;
            aVar.f62521a -= 4;
            eVar.b(iC);
            h(aVar.f62522b, eVar.f64969c, iC);
            aVar.f62522b += (long) iC;
            int i10 = aVar.f62521a - iC;
            aVar.f62521a = i10;
            eVar.g(i10);
            h(aVar.f62522b, eVar.f64972f, aVar.f62521a);
            return;
        }
        eVar.b(aVar.f62521a);
        h(aVar.f62522b, eVar.f64969c, aVar.f62521a);
    }

    public int n(q3.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
        int iG = g(i10);
        a aVar = this.f62487f;
        int i11 = hVar.read(aVar.f62492d.f52358a, aVar.c(this.f62488g), iG);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        f(i11);
        return i11;
    }
}
