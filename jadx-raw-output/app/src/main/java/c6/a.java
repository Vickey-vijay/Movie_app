package c6;

import java.util.Arrays;

/* JADX INFO: compiled from: BitArray.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5655c;

    public a() {
        this.f5655c = 0;
        this.f5654b = new int[1];
    }

    public void s(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (g(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public static int[] o(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        f(this.f5655c + 1);
        if (z10) {
            int[] iArr = this.f5654b;
            int i10 = this.f5655c;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f5655c++;
    }

    public void b(a aVar) {
        int i10 = aVar.f5655c;
        f(this.f5655c + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.g(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        f(this.f5655c + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public void clear() {
        int length = this.f5654b.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f5654b[i10] = 0;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f5654b.clone(), this.f5655c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5655c == aVar.f5655c && Arrays.equals(this.f5654b, aVar.f5654b);
    }

    public final void f(int i10) {
        if (i10 > (this.f5654b.length << 5)) {
            int[] iArrO = o(i10);
            int[] iArr = this.f5654b;
            System.arraycopy(iArr, 0, iArrO, 0, iArr.length);
            this.f5654b = iArrO;
        }
    }

    public boolean g(int i10) {
        return ((1 << (i10 & 31)) & this.f5654b[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f5655c * 31) + Arrays.hashCode(this.f5654b);
    }

    public int[] i() {
        return this.f5654b;
    }

    public int j(int i10) {
        int i11 = this.f5655c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f5654b[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f5654b;
            if (i12 == iArr.length) {
                return this.f5655c;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 << 5) + Integer.numberOfTrailingZeros(i13), this.f5655c);
    }

    public int k(int i10) {
        int i11 = this.f5655c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f5654b[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f5654b;
            if (i12 == iArr.length) {
                return this.f5655c;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 << 5) + Integer.numberOfTrailingZeros(i13), this.f5655c);
    }

    public int l() {
        return this.f5655c;
    }

    public int m() {
        return (this.f5655c + 7) / 8;
    }

    public boolean n(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f5655c) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = (2 << (i15 >= i14 ? 31 & i12 : 31)) - (1 << (i15 > i13 ? 0 : i10 & 31));
            int i17 = this.f5654b[i15] & i16;
            if (!z10) {
                i16 = 0;
            }
            if (i17 != i16) {
                return false;
            }
            i15++;
        }
        return true;
    }

    public void p() {
        int[] iArr = new int[this.f5654b.length];
        int i10 = (this.f5655c - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = this.f5654b[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & 65535) << 16) | ((j14 >> 16) & 65535));
        }
        int i13 = this.f5655c;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f5654b = iArr;
    }

    public void q(int i10) {
        int[] iArr = this.f5654b;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void r(int i10, int i11) {
        this.f5654b[i10 / 32] = i11;
    }

    public void t(a aVar) {
        if (this.f5655c != aVar.f5655c) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f5654b;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f5654b[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f5655c;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f5655c; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(g(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public a(int i10) {
        this.f5655c = i10;
        this.f5654b = o(i10);
    }

    public a(int[] iArr, int i10) {
        this.f5654b = iArr;
        this.f5655c = i10;
    }
}
