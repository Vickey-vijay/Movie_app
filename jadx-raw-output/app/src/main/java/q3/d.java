package q3;

import g5.k0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f66439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f66440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f66441d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66444g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f66442e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f66438a = new byte[4096];

    public final void a(int i10) {
        if (i10 != -1) {
            this.f66441d += (long) i10;
        }
    }

    @Override // q3.h
    public boolean advancePeekPosition(int i10, boolean z10) throws InterruptedException, IOException {
        b(i10);
        int iC = this.f66444g - this.f66443f;
        while (iC < i10) {
            iC = c(this.f66442e, this.f66443f, i10, iC, z10);
            if (iC == -1) {
                return false;
            }
            this.f66444g = this.f66443f + iC;
        }
        this.f66443f += i10;
        return true;
    }

    @Override // q3.h
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f66442e, this.f66443f - i11, bArr, i10, i11);
        return true;
    }

    @Override // q3.h
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        int iD = d(bArr, i10, i11);
        while (iD < i11 && iD != -1) {
            iD = c(bArr, i10, i11, iD, z10);
        }
        a(iD);
        return iD != -1;
    }

    @Override // q3.h
    public void resetPeekPosition() {
        this.f66443f = 0;
    }

    @Override // q3.h
    public void skipFully(int i10) throws InterruptedException, IOException {
        f(i10, false);
    }

    public final void b(int i10) {
        int i11 = this.f66443f + i10;
        byte[] bArr = this.f66442e;
        if (i11 > bArr.length) {
            this.f66442e = Arrays.copyOf(this.f66442e, k0.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int d(byte[] bArr, int i10, int i11) {
        int i12 = this.f66444g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f66442e, 0, bArr, i10, iMin);
        g(iMin);
        return iMin;
    }

    public final int e(int i10) {
        int iMin = Math.min(this.f66444g, i10);
        g(iMin);
        return iMin;
    }

    public final void g(int i10) {
        int i11 = this.f66444g - i10;
        this.f66444g = i11;
        this.f66443f = 0;
        byte[] bArr = this.f66442e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f66442e = bArr2;
    }

    @Override // q3.h
    public long getLength() {
        return this.f66440c;
    }

    @Override // q3.h
    public long getPeekPosition() {
        return this.f66441d + ((long) this.f66443f);
    }

    @Override // q3.h
    public long getPosition() {
        return this.f66441d;
    }

    public d(com.google.android.exoplayer2.upstream.a aVar, long j10, long j11) {
        this.f66439b = aVar;
        this.f66441d = j10;
        this.f66440c = j11;
    }

    public final int c(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int i13 = this.f66439b.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + i13;
        }
        throw new InterruptedException();
    }

    public boolean f(int i10, boolean z10) throws InterruptedException, IOException {
        int iE = e(i10);
        while (iE < i10 && iE != -1) {
            iE = c(this.f66438a, -iE, Math.min(i10, this.f66438a.length + iE), iE, z10);
        }
        a(iE);
        if (iE != -1) {
            return true;
        }
        return false;
    }

    @Override // q3.h
    public int peek(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int iMin;
        b(i11);
        int i12 = this.f66444g;
        int i13 = this.f66443f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = c(this.f66442e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f66444g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f66442e, this.f66443f, bArr, i10, iMin);
        this.f66443f += iMin;
        return iMin;
    }

    @Override // q3.h
    public void peekFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // q3.h
    public int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int iD = d(bArr, i10, i11);
        if (iD == 0) {
            iD = c(bArr, i10, i11, 0, true);
        }
        a(iD);
        return iD;
    }

    @Override // q3.h
    public int skip(int i10) throws InterruptedException, IOException {
        int iE = e(i10);
        if (iE == 0) {
            byte[] bArr = this.f66438a;
            iE = c(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        a(iE);
        return iE;
    }

    @Override // q3.h
    public void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // q3.h
    public void advancePeekPosition(int i10) throws InterruptedException, IOException {
        advancePeekPosition(i10, false);
    }
}
