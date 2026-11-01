package yads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class jb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78968c;

    public jb2() {
        this.f78966a = ib3.f78561f;
    }

    public final void a(int i10) {
        byte[] bArr = this.f78966a;
        if (i10 > bArr.length) {
            this.f78966a = Arrays.copyOf(bArr, i10);
        }
    }

    public final int b() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 8);
        this.f78967b = i10 + 4;
        return (bArr[i12] & 255) | i13;
    }

    public final String c() {
        int i10 = this.f78968c;
        int i11 = this.f78967b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f78968c) {
            byte b10 = this.f78966a[i11];
            int i12 = ib3.f78556a;
            if (b10 == 10 || b10 == 13) {
                break;
            }
            i11++;
        }
        int i13 = this.f78967b;
        if (i11 - i13 >= 3) {
            byte[] bArr = this.f78966a;
            if (bArr[i13] == -17 && bArr[i13 + 1] == -69 && bArr[i13 + 2] == -65) {
                this.f78967b = i13 + 3;
            }
        }
        byte[] bArr2 = this.f78966a;
        int i14 = this.f78967b;
        String strA = ib3.a(bArr2, i14, i11 - i14);
        this.f78967b = i11;
        int i15 = this.f78968c;
        if (i11 == i15) {
            return strA;
        }
        byte[] bArr3 = this.f78966a;
        if (bArr3[i11] == 13) {
            int i16 = i11 + 1;
            this.f78967b = i16;
            if (i16 == i15) {
                return strA;
            }
        }
        int i17 = this.f78967b;
        if (bArr3[i17] == 10) {
            this.f78967b = i17 + 1;
        }
        return strA;
    }

    public final int d() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 16);
        this.f78967b = i10 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public final long e() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 7;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        this.f78967b = i10 + 8;
        return ((((long) bArr[i11]) & 255) << 56) | j10;
    }

    public final String b(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f78967b;
        int i12 = (i11 + i10) - 1;
        String strA = ib3.a(this.f78966a, i11, (i12 >= this.f78968c || this.f78966a[i12] != 0) ? i10 : i10 - 1);
        this.f78967b += i10;
        return strA;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f78966a.length) {
            throw new IllegalArgumentException();
        }
        this.f78968c = i10;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 > this.f78968c) {
            throw new IllegalArgumentException();
        }
        this.f78967b = i10;
    }

    public final short f() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f78967b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long g() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 3;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16);
        this.f78967b = i10 + 4;
        return ((((long) bArr[i11]) & 255) << 24) | j10;
    }

    public final int h() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f78967b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long i() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        this.f78967b = i10 + 8;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final String j() {
        int i10 = this.f78968c;
        int i11 = this.f78967b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f78968c && this.f78966a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f78966a;
        int i12 = this.f78967b;
        String strA = ib3.a(bArr, i12, i11 - i12);
        this.f78967b = i11;
        if (i11 >= this.f78968c) {
            return strA;
        }
        this.f78967b = i11 + 1;
        return strA;
    }

    public final short k() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f78967b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final int m() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        this.f78967b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long n() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 3;
        long j10 = ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i10 + 1]) & 255) << 16) | ((((long) bArr[i10 + 2]) & 255) << 8);
        this.f78967b = i10 + 4;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public final int o() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
        this.f78967b = i10 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public final int r() {
        byte[] bArr = this.f78966a;
        int i10 = this.f78967b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f78967b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long s() {
        int i10;
        int i11;
        long j10 = this.f78966a[this.f78967b];
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
            byte b10 = this.f78966a[this.f78967b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f78967b += i11;
        return j10;
    }

    public jb2(int i10) {
        this.f78966a = new byte[i10];
        this.f78968c = i10;
    }

    public final byte[] a() {
        return this.f78966a;
    }

    public final int l() {
        return (m() << 21) | (m() << 14) | (m() << 7) | m();
    }

    public final int p() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(mg2.a("Top bit not zero: ", iB));
    }

    public final long q() {
        long jI = i();
        if (jI >= 0) {
            return jI;
        }
        throw new IllegalStateException("Top bit not zero: " + jI);
    }

    public final void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f78966a, this.f78967b, bArr, i10, i11);
        this.f78967b += i11;
    }

    public jb2(int i10, byte[] bArr) {
        this.f78966a = bArr;
        this.f78968c = i10;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.f78966a = bArr;
        this.f78968c = length;
        this.f78967b = 0;
    }

    public jb2(byte[] bArr) {
        this.f78966a = bArr;
        this.f78968c = bArr.length;
    }

    public final String a(int i10, Charset charset) {
        String str = new String(this.f78966a, this.f78967b, i10, charset);
        this.f78967b += i10;
        return str;
    }

    public final void c(int i10) {
        byte[] bArr = this.f78966a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        this.f78966a = bArr;
        this.f78968c = i10;
        this.f78967b = 0;
    }
}
