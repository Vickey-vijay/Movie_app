package yads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public final class ib2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f78552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78555d;

    public ib2() {
        this.f78552a = ib3.f78561f;
    }

    public final void a() {
        int i10 = this.f78553b;
        if (i10 >= 0) {
            int i11 = this.f78555d;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f78554c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int b() {
        return ((this.f78555d - this.f78553b) * 8) - this.f78554c;
    }

    public final int c() {
        if (this.f78554c == 0) {
            return this.f78553b;
        }
        throw new IllegalStateException();
    }

    public final int d() {
        return (this.f78553b * 8) + this.f78554c;
    }

    public final long f() {
        int iA = a(4);
        int iA2 = a(32);
        int i10 = ib3.f78556a;
        return ((((long) iA) & 4294967295L) << 32) | (((long) iA2) & 4294967295L);
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        this.f78553b = i11;
        this.f78554c = i10 - (i11 * 8);
        a();
    }

    public final void d(int i10) {
        if (this.f78554c != 0) {
            throw new IllegalStateException();
        }
        this.f78553b += i10;
        a();
    }

    public final boolean e() {
        boolean z10 = (this.f78552a[this.f78553b] & (128 >> this.f78554c)) != 0;
        g();
        return z10;
    }

    public final void g() {
        int i10 = this.f78554c + 1;
        this.f78554c = i10;
        if (i10 == 8) {
            this.f78554c = 0;
            this.f78553b++;
        }
        a();
    }

    public ib2(int i10, byte[] bArr) {
        this.f78552a = bArr;
        this.f78555d = i10;
    }

    public final int a(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f78554c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f78554c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f78554c = i13;
            byte[] bArr = this.f78552a;
            int i14 = this.f78553b;
            this.f78553b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f78552a;
        int i15 = this.f78553b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f78554c = 0;
            this.f78553b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void c(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f78553b + i11;
        this.f78553b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f78554c;
        this.f78554c = i13;
        if (i13 > 7) {
            this.f78553b = i12 + 1;
            this.f78554c = i13 - 8;
        }
        a();
    }

    public ib2(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final void a(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f78552a;
            int i13 = this.f78553b;
            int i14 = i13 + 1;
            this.f78553b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f78554c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f78554c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f78552a;
            int i18 = this.f78553b;
            this.f78553b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f78554c = i17 - 8;
        }
        int i19 = this.f78554c + i16;
        this.f78554c = i19;
        byte[] bArr4 = this.f78552a;
        int i20 = this.f78553b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f78554c = 0;
            this.f78553b = i20 + 1;
        }
        a();
    }

    public final String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        if (this.f78554c == 0) {
            System.arraycopy(this.f78552a, this.f78553b, bArr, 0, i10);
            this.f78553b += i10;
            a();
            return new String(bArr, charset);
        }
        throw new IllegalStateException();
    }

    public final void a(int i10, byte[] bArr) {
        this.f78552a = bArr;
        this.f78553b = 0;
        this.f78554c = 0;
        this.f78555d = i10;
    }
}
