package g5;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f53154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53156c;

    public t() {
        this.f53154a = k0.f53113f;
    }

    public void G() {
        this.f53155b = 0;
        this.f53156c = 0;
    }

    public void I(byte[] bArr) {
        J(bArr, bArr.length);
    }

    public long A() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
        this.f53155b = i13 + 1;
        return j11 | (((long) bArr[i13]) & 255);
    }

    public int B() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f53155b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int E() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f53155b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public long F() {
        int i10;
        int i11;
        long j10 = this.f53154a[this.f53155b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f53154a[this.f53155b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f53155b += i11;
        return j10;
    }

    public void J(byte[] bArr, int i10) {
        this.f53154a = bArr;
        this.f53156c = i10;
        this.f53155b = 0;
    }

    public void K(int i10) {
        a.a(i10 >= 0 && i10 <= this.f53154a.length);
        this.f53156c = i10;
    }

    public void L(int i10) {
        a.a(i10 >= 0 && i10 <= this.f53156c);
        this.f53155b = i10;
    }

    public void M(int i10) {
        L(this.f53155b + i10);
    }

    public int a() {
        return this.f53156c - this.f53155b;
    }

    public int b() {
        return this.f53154a.length;
    }

    public int c() {
        return this.f53155b;
    }

    public int d() {
        return this.f53156c;
    }

    public char e() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int f() {
        return this.f53154a[this.f53155b] & 255;
    }

    public void g(s sVar, int i10) {
        h(sVar.f53150a, 0, i10);
        sVar.o(0);
    }

    public void h(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f53154a, this.f53155b, bArr, i10, i11);
        this.f53155b += i11;
    }

    public int j() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f53155b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int k() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f53155b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int m() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f53155b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long n() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f53155b = i17 + 1;
        return j15 | ((((long) bArr[i17]) & 255) << 56);
    }

    public long o() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        this.f53155b = i13 + 1;
        return j11 | ((((long) bArr[i13]) & 255) << 24);
    }

    public int q() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f53155b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long r() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f53155b = i17 + 1;
        return j15 | (((long) bArr[i17]) & 255);
    }

    public String t(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f53155b;
        int i12 = (i11 + i10) - 1;
        String strA = k0.A(this.f53154a, i11, (i12 >= this.f53156c || this.f53154a[i12] != 0) ? i10 : i10 - 1);
        this.f53155b += i10;
        return strA;
    }

    public short u() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f53155b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String v(int i10) {
        return w(i10, Charset.forName("UTF-8"));
    }

    public String w(int i10, Charset charset) {
        String str = new String(this.f53154a, this.f53155b, i10, charset);
        this.f53155b += i10;
        return str;
    }

    public int y() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        this.f53155b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int z() {
        byte[] bArr = this.f53154a;
        int i10 = this.f53155b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f53155b = i11 + 1 + 2;
        return i12;
    }

    public t(int i10) {
        this.f53154a = new byte[i10];
        this.f53156c = i10;
    }

    public int C() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException("Top bit not zero: " + iJ);
    }

    public long D() {
        long jR = r();
        if (jR >= 0) {
            return jR;
        }
        throw new IllegalStateException("Top bit not zero: " + jR);
    }

    public void H(int i10) {
        byte[] bArr;
        if (b() < i10) {
            bArr = new byte[i10];
        } else {
            bArr = this.f53154a;
        }
        J(bArr, i10);
    }

    public double i() {
        return Double.longBitsToDouble(r());
    }

    @Nullable
    public String l() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f53155b;
        while (i10 < this.f53156c && !k0.g0(this.f53154a[i10])) {
            i10++;
        }
        int i11 = this.f53155b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f53154a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f53155b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f53154a;
        int i12 = this.f53155b;
        String strA = k0.A(bArr2, i12, i10 - i12);
        this.f53155b = i10;
        int i13 = this.f53156c;
        if (i10 == i13) {
            return strA;
        }
        byte[] bArr3 = this.f53154a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f53155b = i14;
            if (i14 == i13) {
                return strA;
            }
        }
        int i15 = this.f53155b;
        if (bArr3[i15] == 10) {
            this.f53155b = i15 + 1;
        }
        return strA;
    }

    public int p() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        throw new IllegalStateException("Top bit not zero: " + iM);
    }

    @Nullable
    public String s() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f53155b;
        while (i10 < this.f53156c && this.f53154a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f53154a;
        int i11 = this.f53155b;
        String strA = k0.A(bArr, i11, i10 - i11);
        this.f53155b = i10;
        if (i10 < this.f53156c) {
            this.f53155b = i10 + 1;
        }
        return strA;
    }

    public int x() {
        return (y() << 21) | (y() << 14) | (y() << 7) | y();
    }

    public t(byte[] bArr) {
        this.f53154a = bArr;
        this.f53156c = bArr.length;
    }

    public t(byte[] bArr, int i10) {
        this.f53154a = bArr;
        this.f53156c = i10;
    }
}
