package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class ld0 implements nq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l30 f79755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79757d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79760g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f79758e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f79754a = new byte[4096];

    public final boolean a(boolean z10, int i10) throws EOFException, InterruptedIOException {
        int i11 = this.f79759f + i10;
        byte[] bArr = this.f79758e;
        if (i11 > bArr.length) {
            int i12 = ib3.f78556a;
            this.f79758e = Arrays.copyOf(this.f79758e, Math.max(65536 + i11, Math.min(bArr.length * 2, i11 + 524288)));
        }
        int iA = this.f79760g - this.f79759f;
        while (iA < i10) {
            iA = a(this.f79758e, this.f79759f, i10, iA, z10);
            if (iA == -1) {
                return false;
            }
            this.f79760g = this.f79759f + iA;
        }
        this.f79759f += i10;
        return true;
    }

    @Override // yads.nq0
    public final void b(int i10) throws EOFException, InterruptedIOException {
        a(false, i10);
    }

    @Override // yads.nq0
    public final long c() {
        return this.f79757d + ((long) this.f79759f);
    }

    @Override // yads.nq0
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        a(bArr, i10, i11, false);
    }

    static {
        ho0.a("goog.exo.extractor");
    }

    public final int b(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.f79759f + i11;
        byte[] bArr2 = this.f79758e;
        if (i12 > bArr2.length) {
            int i13 = ib3.f78556a;
            this.f79758e = Arrays.copyOf(this.f79758e, Math.max(65536 + i12, Math.min(bArr2.length * 2, i12 + 524288)));
        }
        int i14 = this.f79760g;
        int i15 = this.f79759f;
        int i16 = i14 - i15;
        if (i16 == 0) {
            iMin = a(this.f79758e, i15, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f79760g += iMin;
        } else {
            iMin = Math.min(i11, i16);
        }
        System.arraycopy(this.f79758e, this.f79759f, bArr, i10, iMin);
        this.f79759f += iMin;
        return iMin;
    }

    public final int c(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f79760g, i10);
        d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f79754a;
            iMin = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.f79757d += (long) iMin;
        }
        return iMin;
    }

    public final void d(int i10) {
        int i11 = this.f79760g - i10;
        this.f79760g = i11;
        this.f79759f = 0;
        byte[] bArr = this.f79758e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f79758e = bArr2;
    }

    @Override // yads.nq0
    public final long getLength() {
        return this.f79756c;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int i12 = this.f79760g;
        int iA = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f79758e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            iA = a(bArr, i10, i11, 0, true);
        }
        if (iA != -1) {
            this.f79757d += (long) iA;
        }
        return iA;
    }

    public ld0(p30 p30Var, long j10, long j11) {
        this.f79755b = p30Var;
        this.f79757d = j10;
        this.f79756c = j11;
    }

    @Override // yads.nq0
    public final long a() {
        return this.f79757d;
    }

    @Override // yads.nq0
    public final void a(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    @Override // yads.nq0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iA;
        int i12 = this.f79760g;
        if (i12 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f79758e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        if (iA != -1) {
            this.f79757d += (long) iA;
        }
        return iA != -1;
    }

    @Override // yads.nq0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(z10, i11)) {
            return false;
        }
        System.arraycopy(this.f79758e, this.f79759f - i11, bArr, i10, i11);
        return true;
    }

    @Override // yads.nq0
    public final void b() {
        this.f79759f = 0;
    }

    @Override // yads.nq0
    public final void a(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f79760g, i10);
        d(iMin);
        int iA = iMin;
        while (iA < i10 && iA != -1) {
            iA = a(this.f79754a, -iA, Math.min(i10, this.f79754a.length + iA), iA, false);
        }
        if (iA != -1) {
            this.f79757d += (long) iA;
        }
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (!Thread.interrupted()) {
            int i13 = this.f79755b.read(bArr, i10 + i12, i11 - i12);
            if (i13 != -1) {
                return i12 + i13;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
