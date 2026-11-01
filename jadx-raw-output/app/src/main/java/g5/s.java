package g5;

/* JADX INFO: compiled from: ParsableBitArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f53150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53153d;

    public s() {
        this.f53150a = k0.f53113f;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f53152c, i11);
        int i12 = this.f53152c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f53150a;
        int i14 = this.f53151b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f53150a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f53150a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        q(i11);
        a();
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f53152c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f53152c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f53152c = i13;
            byte[] bArr = this.f53150a;
            int i14 = this.f53151b;
            this.f53151b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f53150a;
        int i15 = this.f53151b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f53152c = 0;
            this.f53151b = i15 + 1;
        }
        a();
        return i16;
    }

    public void m(byte[] bArr) {
        n(bArr, bArr.length);
    }

    public final void a() {
        int i10;
        int i11 = this.f53151b;
        a.f(i11 >= 0 && (i11 < (i10 = this.f53153d) || (i11 == i10 && this.f53152c == 0)));
    }

    public int b() {
        return ((this.f53153d - this.f53151b) * 8) - this.f53152c;
    }

    public void c() {
        if (this.f53152c == 0) {
            return;
        }
        this.f53152c = 0;
        this.f53151b++;
        a();
    }

    public int d() {
        a.f(this.f53152c == 0);
        return this.f53151b;
    }

    public int e() {
        return (this.f53151b * 8) + this.f53152c;
    }

    public boolean g() {
        boolean z10 = (this.f53150a[this.f53151b] & (128 >> this.f53152c)) != 0;
        p();
        return z10;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f53150a;
            int i13 = this.f53151b;
            int i14 = i13 + 1;
            this.f53151b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f53152c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f53152c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f53150a;
            int i18 = this.f53151b;
            this.f53151b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f53152c = i17 - 8;
        }
        int i19 = this.f53152c + i16;
        this.f53152c = i19;
        byte[] bArr4 = this.f53150a;
        int i20 = this.f53151b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f53152c = 0;
            this.f53151b = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? k0.L0(h(i10)) : k0.J0(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.f(this.f53152c == 0);
        System.arraycopy(this.f53150a, this.f53151b, bArr, i10, i11);
        this.f53151b += i11;
        a();
    }

    public void l(t tVar) {
        n(tVar.f53154a, tVar.d());
        o(tVar.c() * 8);
    }

    public void n(byte[] bArr, int i10) {
        this.f53150a = bArr;
        this.f53151b = 0;
        this.f53152c = 0;
        this.f53153d = i10;
    }

    public void o(int i10) {
        int i11 = i10 / 8;
        this.f53151b = i11;
        this.f53152c = i10 - (i11 * 8);
        a();
    }

    public void p() {
        int i10 = this.f53152c + 1;
        this.f53152c = i10;
        if (i10 == 8) {
            this.f53152c = 0;
            this.f53151b++;
        }
        a();
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f53151b + i11;
        this.f53151b = i12;
        int i13 = this.f53152c + (i10 - (i11 * 8));
        this.f53152c = i13;
        if (i13 > 7) {
            this.f53151b = i12 + 1;
            this.f53152c = i13 - 8;
        }
        a();
    }

    public void r(int i10) {
        a.f(this.f53152c == 0);
        this.f53151b += i10;
        a();
    }

    public s(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public s(byte[] bArr, int i10) {
        this.f53150a = bArr;
        this.f53153d = i10;
    }
}
