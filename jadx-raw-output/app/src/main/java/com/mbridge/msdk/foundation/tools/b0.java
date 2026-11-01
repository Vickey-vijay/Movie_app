package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: FastBuffer.java */
/* JADX INFO: loaded from: classes10.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f35245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char[] f35247c;

    public b0(int i10) {
        this(new byte[i10], 0);
    }

    public static int b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                i11++;
            } else if (cCharAt < 2048) {
                i11 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i11 += 3;
            } else {
                i10 = i12 + 1;
                i11 += 4;
            }
            i10 = i12;
        }
        return i11;
    }

    public static int f(int i10) {
        if ((i10 >> 7) == 0) {
            return 1;
        }
        if ((i10 >> 14) == 0) {
            return 2;
        }
        if ((i10 >> 21) == 0) {
            return 3;
        }
        return (i10 >> 28) == 0 ? 4 : 5;
    }

    public byte a() {
        byte[] bArr = this.f35245a;
        int i10 = this.f35246b;
        this.f35246b = i10 + 1;
        return bArr[i10];
    }

    public float c() {
        return Float.intBitsToFloat(d());
    }

    public long d(int i10) {
        byte[] bArr = this.f35245a;
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
        return j13 | ((((long) bArr[i15]) & 255) << 40) | ((255 & ((long) bArr[i16])) << 48) | (((long) bArr[i16 + 1]) << 56);
    }

    public long e() {
        long jD = d(this.f35246b);
        this.f35246b += 8;
        return jD;
    }

    public int g() {
        byte[] bArr = this.f35245a;
        int i10 = this.f35246b;
        int i11 = i10 + 1;
        this.f35246b = i11;
        byte b10 = bArr[i10];
        if ((b10 >> 7) == 0) {
            return b10;
        }
        int i12 = i11 + 1;
        this.f35246b = i12;
        int i13 = (b10 & 127) | (bArr[i11] << 7);
        if ((i13 >> 14) == 0) {
            return i13;
        }
        int i14 = i12 + 1;
        this.f35246b = i14;
        int i15 = (i13 & 16383) | (bArr[i12] << 14);
        if ((i15 >> 21) == 0) {
            return i15;
        }
        int i16 = i14 + 1;
        this.f35246b = i16;
        int i17 = (i15 & 2097151) | (bArr[i14] << 21);
        if ((i17 >> 28) == 0) {
            return i17;
        }
        this.f35246b = i16 + 1;
        return (bArr[i16] << 28) | (i17 & 268435455);
    }

    public b0(byte[] bArr, int i10) {
        this.f35247c = null;
        this.f35245a = bArr;
        this.f35246b = i10;
    }

    private char[] c(int i10) {
        char[] cArr = this.f35247c;
        if (cArr == null) {
            if (i10 <= 256) {
                this.f35247c = new char[256];
            } else {
                this.f35247c = new char[2048];
            }
        } else if (cArr.length < i10) {
            this.f35247c = new char[2048];
        }
        return this.f35247c;
    }

    public long a(int i10, int i11) {
        long jD = 0;
        if (i11 <= 0) {
            return 0L;
        }
        int i12 = i11 >> 3;
        int i13 = i11 & 7;
        int i14 = 0;
        int i15 = i10;
        for (int i16 = 0; i16 < i12; i16++) {
            jD ^= d(i15);
            i15 += 8;
        }
        int i17 = i13 << 3;
        while (i14 < i17) {
            jD ^= (((long) this.f35245a[i15]) & 255) << i14;
            i14 += 8;
            i15++;
        }
        int i18 = (i10 & 7) << 3;
        return (jD >>> (64 - i18)) | (jD << i18);
    }

    public int d() {
        byte[] bArr = this.f35245a;
        int i10 = this.f35246b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f35246b = i14 + 1;
        return (bArr[i14] << 24) | i15;
    }

    public short f() {
        byte[] bArr = this.f35245a;
        int i10 = this.f35246b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f35246b = i11 + 1;
        return (short) ((bArr[i11] << 8) | i12);
    }

    public void h(int i10) {
        this.f35246b = c(this.f35246b, i10);
    }

    public byte[] b(int i10) {
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f35245a, this.f35246b, bArr, 0, i10);
        this.f35246b += i10;
        return bArr;
    }

    public String e(int i10) {
        if (i10 < 0) {
            return null;
        }
        if (i10 == 0) {
            return "";
        }
        String strA = a(i10);
        this.f35246b += i10;
        return strA;
    }

    private String a(int i10) {
        if (i10 > 2048) {
            return new String(this.f35245a, this.f35246b, i10, StandardCharsets.UTF_8);
        }
        char[] cArrC = c(i10);
        byte[] bArr = this.f35245a;
        int i11 = this.f35246b;
        int i12 = i10 + i11;
        int i13 = 0;
        while (i11 < i12) {
            int i14 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 > 0) {
                cArrC[i13] = (char) b10;
                i11 = i14;
                i13++;
            } else if (b10 < -32) {
                cArrC[i13] = (char) (((b10 & 31) << 6) | (bArr[i14] & 63));
                i11 = i14 + 1;
                i13++;
            } else if (b10 < -16) {
                int i15 = i14 + 1;
                cArrC[i13] = (char) (((b10 & 15) << 12) | ((bArr[i14] & 63) << 6) | (bArr[i15] & 63));
                i11 = i15 + 1;
                i13++;
            } else {
                int i16 = i14 + 1;
                int i17 = i16 + 1;
                int i18 = ((b10 & 7) << 18) | ((bArr[i14] & 63) << 12) | ((bArr[i16] & 63) << 6) | (bArr[i17] & 63);
                int i19 = i13 + 1;
                cArrC[i13] = (char) ((i18 >>> 10) + 55232);
                i13 = i19 + 1;
                cArrC[i19] = (char) ((i18 & 1023) + 56320);
                i11 = i17 + 1;
            }
        }
        if (i11 <= i12) {
            return new String(cArrC, 0, i13);
        }
        throw new IllegalArgumentException("Invalid String");
    }

    public b0(byte[] bArr) {
        this(bArr, 0);
    }

    public double b() {
        return Double.longBitsToDouble(e());
    }

    public void g(int i10) {
        byte[] bArr = this.f35245a;
        int i11 = this.f35246b;
        int i12 = i11 + 1;
        bArr[i11] = (byte) i10;
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i10 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i10 >> 16);
        this.f35246b = i14 + 1;
        bArr[i14] = (byte) (i10 >> 24);
    }

    public void b(int i10, int i11) {
        byte[] bArr = this.f35245a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        bArr[i13] = (byte) (i11 >> 16);
        bArr[i13 + 1] = (byte) (i11 >> 24);
    }

    public void c(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        a(str);
    }

    public int c(int i10, int i11) {
        while ((i11 & (-128)) != 0) {
            this.f35245a[i10] = (byte) ((i11 & 127) | 128);
            i11 >>>= 7;
            i10++;
        }
        int i12 = i10 + 1;
        this.f35245a[i10] = (byte) i11;
        return i12;
    }

    public final void a(byte b10) {
        byte[] bArr = this.f35245a;
        int i10 = this.f35246b;
        this.f35246b = i10 + 1;
        bArr[i10] = b10;
    }

    public void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f35245a, this.f35246b, length);
            this.f35246b += length;
        }
    }

    public void a(long j10) {
        a(this.f35246b, j10);
        this.f35246b += 8;
    }

    public void a(int i10, long j10) {
        byte[] bArr = this.f35245a;
        int i11 = i10 + 1;
        bArr[i10] = (byte) j10;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j10 >> 8);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j10 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j10 >> 24);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j10 >> 32);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j10 >> 40);
        bArr[i16] = (byte) (j10 >> 48);
        bArr[i16 + 1] = (byte) (j10 >> 56);
    }

    public void a(short s10) {
        byte[] bArr = this.f35245a;
        int i10 = this.f35246b;
        int i11 = i10 + 1;
        bArr[i10] = (byte) s10;
        this.f35246b = i11 + 1;
        bArr[i11] = (byte) (s10 >> 8);
    }

    private void a(String str) {
        byte[] bArr = this.f35245a;
        int i10 = this.f35246b;
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                bArr[i10] = (byte) cCharAt;
                i11 = i12;
                i10++;
            } else if (cCharAt < 2048) {
                int i13 = i10 + 1;
                bArr[i10] = (byte) ((cCharAt >>> 6) | 192);
                i10 = i13 + 1;
                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                i11 = i12;
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                int i14 = i12 + 1;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i12)) - 56613888;
                int i15 = i10 + 1;
                bArr[i10] = (byte) ((iCharAt >>> 18) | 240);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i10 = i17 + 1;
                bArr[i17] = (byte) ((iCharAt & 63) | 128);
                i11 = i14;
            } else {
                int i18 = i10 + 1;
                bArr[i10] = (byte) ((cCharAt >>> '\f') | 224);
                int i19 = i18 + 1;
                bArr[i18] = (byte) (((cCharAt >>> 6) & 63) | 128);
                bArr[i19] = (byte) ((cCharAt & '?') | 128);
                i11 = i12;
                i10 = i19 + 1;
            }
        }
        this.f35246b = i10;
    }
}
