package com.facebook.ads.redexgen.core;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4J {
    public static byte[] A03;
    public static String[] A04 = {"RlBAQ9etSzb6rKOU0OwTULVtudJYJZp0", "XAmGWsEC26u1mjqUpAPP", "gKAOne2sLRpvkAzkWDtxdYOHT1y3K7xN", "iu", "f0TxnfWyKi4JtHzbatu6pF78XF274ljv", "5Aw1jR83b8etF7", "lH1Eai5bIm9O9MK22LfAWzb", "DxY4VOe5grYAJX95lLrlpegM3yyEwSTm"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{64, 103, 127, 104, 101, 96, 109, 41, 92, 93, 79, 36, 49, 41, 122, 108, 120, 124, 108, 103, 106, 108, 41, 106, 102, 103, 125, 96, 103, 124, 104, 125, 96, 102, 103, 41, 107, 112, 125, 108, 51, 41, 88, 127, 103, 112, 125, 120, 117, 49, 68, 69, 87, 60, 41, 49, 98, 116, 96, 100, 116, 127, 114, 116, 49, 119, 120, 99, 98, 101, 49, 115, 104, 101, 116, 43, 49, 2, 57, 38, 118, 52, 63, 34, 118, 56, 57, 34, 118, 44, 51, 36, 57, 108, 118, 38, 29, 0, 6, 3, 3, 28, 1, 7, 22, 23, 83, 16, 27, 18, 1, 0, 22, 7, 73, 83};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = MetaExoPlayerCustomizedCollections.A05(AbstractC2286ia.A02, AbstractC2286ia.A06, AbstractC2286ia.A03, AbstractC2286ia.A04, AbstractC2286ia.A05);
    }

    public C4J() {
        this.A00 = AbstractC09664a.A07;
    }

    public C4J(int i10) {
        this.A00 = new byte[i10];
        this.A01 = i10;
    }

    public C4J(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C4J(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
    }

    private char A00(Charset charset, char[] cArr) {
        char cA01;
        int i10;
        if ((charset.equals(AbstractC2286ia.A06) || charset.equals(AbstractC2286ia.A02)) && A07() >= 1) {
            cA01 = AbstractC2088fA.A01(AbstractC2709q6.A00(this.A00[this.A02]));
            i10 = 1;
        } else if ((charset.equals(AbstractC2286ia.A03) || charset.equals(AbstractC2286ia.A04)) && A07() >= 2) {
            cA01 = AbstractC2088fA.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i10 = 2;
        } else {
            if (!charset.equals(AbstractC2286ia.A05) || A07() < 2) {
                return (char) 0;
            }
            cA01 = AbstractC2088fA.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i10 = 2;
        }
        if (!AbstractC2088fA.A04(cArr, cA01)) {
            return (char) 0;
        }
        this.A02 += i10;
        char character = AbstractC2088fA.A01(cA01);
        return character;
    }

    private int A01(Charset charset) {
        int i10;
        if (charset.equals(AbstractC2286ia.A06) || charset.equals(AbstractC2286ia.A02)) {
            i10 = 1;
        } else if (charset.equals(AbstractC2286ia.A03) || charset.equals(AbstractC2286ia.A05) || charset.equals(AbstractC2286ia.A04)) {
            i10 = 2;
        } else {
            throw new IllegalArgumentException(A03(95, 21, 50) + charset);
        }
        for (int i11 = this.A02; i11 < i - (i10 - 1); i11 += i10) {
            if ((charset.equals(AbstractC2286ia.A06) || charset.equals(AbstractC2286ia.A02)) && AbstractC09664a.A16(this.A00[i11])) {
                return i11;
            }
            if ((charset.equals(AbstractC2286ia.A03) || charset.equals(AbstractC2286ia.A04)) && this.A00[i11] == 0 && AbstractC09664a.A16(this.A00[i11 + 1])) {
                return i11;
            }
            if (charset.equals(AbstractC2286ia.A05) && this.A00[i11 + 1] == 0 && AbstractC09664a.A16(this.A00[i11])) {
                return i11;
            }
        }
        int stride = this.A01;
        return stride;
    }

    private final String A02(char c10) {
        if (A07() == 0) {
            return null;
        }
        int i10 = this.A02;
        while (i10 < stringLimit) {
            int stringLimit = this.A00[i10];
            if (stringLimit == c10) {
                break;
            }
            i10++;
        }
        byte[] bArr = this.A00;
        int i11 = this.A02;
        int stringLimit2 = this.A02;
        String strA0r = AbstractC09664a.A0r(bArr, i11, i10 - stringLimit2);
        this.A02 = i10;
        int i12 = this.A02;
        int stringLimit3 = this.A01;
        if (i12 < stringLimit3) {
            int stringLimit4 = this.A02;
            this.A02 = stringLimit4 + 1;
        }
        return strA0r;
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & 255;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | (bArr4[i16] & 255);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = ((bArr[i10] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & 255);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | ((bArr4[i16] & 255) << 24);
    }

    public final int A0F() {
        int iA0E = A0E();
        if (iA0E >= 0) {
            return iA0E;
        }
        throw new IllegalStateException(A03(77, 18, 23) + iA0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | ((bArr2[i12] & 255) << 8);
    }

    public final int A0H() {
        int b10 = A0I();
        int b11 = A0I();
        int b12 = A0I();
        int b13 = A0I();
        int b14 = (b10 << 21) | (b11 << 14);
        int b15 = b12 << 7;
        return b14 | b15 | b13;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | (bArr2[i12] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i13;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & 255);
    }

    public final int A0L() {
        int iA0C = A0C();
        if (iA0C >= 0) {
            return iA0C;
        }
        throw new IllegalStateException(A03(77, 18, 23) + iA0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | (bArr2[i12] & 255);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j11 = j10 | ((((long) bArr2[i11]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j12 = j11 | ((((long) bArr3[i12]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        long j13 = j12 | ((((long) bArr4[i13]) & 255) << 24);
        byte[] bArr5 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        long j14 = j13 | ((((long) bArr5[i14]) & 255) << 32);
        byte[] bArr6 = this.A00;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        long j15 = j14 | ((((long) bArr6[i15]) & 255) << 40);
        byte[] bArr7 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        long j16 = j15 | ((((long) bArr7[i16]) & 255) << 48);
        byte[] bArr8 = this.A00;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return j16 | ((255 & ((long) bArr8[i17])) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j11 = j10 | ((((long) bArr2[i11]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j12 = j11 | ((((long) bArr3[i12]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return j12 | ((255 & ((long) bArr4[i13])) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j11 = j10 | ((((long) bArr2[i11]) & 255) << 48);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j12 = j11 | ((((long) bArr3[i12]) & 255) << 40);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        long j13 = j12 | ((((long) bArr4[i13]) & 255) << 32);
        byte[] bArr5 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        long j14 = j13 | ((((long) bArr5[i14]) & 255) << 24);
        byte[] bArr6 = this.A00;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        long j15 = j14 | ((((long) bArr6[i15]) & 255) << 16);
        byte[] bArr7 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        long j16 = j15 | ((((long) bArr7[i16]) & 255) << 8);
        byte[] bArr8 = this.A00;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return j16 | (255 & ((long) bArr8[i17]));
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j11 = j10 | ((((long) bArr2[i11]) & 255) << 16);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j12 = j11 | ((((long) bArr3[i12]) & 255) << 8);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return j12 | (255 & ((long) bArr4[i13]));
    }

    public final long A0R() {
        long jA0P = A0P();
        if (jA0P >= 0) {
            return jA0P;
        }
        throw new IllegalStateException(A03(77, 18, 23) + jA0P);
    }

    public final long A0S() {
        int i10 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j10 = bArr[length];
        int i11 = 7;
        while (true) {
            if (A04[3].length() == 11) {
                throw new RuntimeException();
            }
            A04[0] = "oMNWSgm03bScuVXxVZmUeRStw4NVi0TN";
            if (i11 < 0) {
                break;
            }
            int length2 = 1 << i11;
            long value = length2;
            if ((value & j10) == 0) {
                if (i11 < 6) {
                    int length3 = 1 << i11;
                    j10 &= (long) (length3 - 1);
                    i10 = 7 - i11;
                    break;
                }
                if (i11 != 7) {
                    break;
                }
                i10 = 1;
                break;
            }
            i11--;
        }
        if (i10 != 0) {
            int i12 = 1;
            while (i12 < i10) {
                byte[] bArr2 = this.A00;
                int length4 = this.A02;
                byte b10 = bArr2[length4 + i12];
                if ((b10 & 192) == 128) {
                    int length5 = b10 & 63;
                    j10 = (j10 << 6) | ((long) length5);
                    if (A04[3].length() != 11) {
                        A04[2] = "QkYn4WhdN3Bc00ITVAtZ7M0H0JKEG2qx";
                        i12++;
                    } else {
                        i12++;
                    }
                } else {
                    throw new NumberFormatException(A03(0, 42, 72) + j10);
                }
            }
            int length6 = this.A02;
            this.A02 = length6 + i10;
            return j10;
        }
        throw new NumberFormatException(A03(42, 35, 80) + j10);
    }

    public final String A0T() {
        return A0Y(AbstractC2286ia.A06);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i10) {
        if (i10 == 0) {
            return A03(0, 0, 97);
        }
        int i11 = i10;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i10) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i11--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String strA0r = AbstractC09664a.A0r(bArr, stringLength4, i11);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i10;
        return strA0r;
    }

    public final String A0W(int i10) {
        return A0X(i10, AbstractC2286ia.A06);
    }

    public final String A0X(int i10, Charset charset) {
        String str = new String(this.A00, this.A02, i10, charset);
        this.A02 += i10;
        return str;
    }

    public final String A0Y(Charset charset) {
        C3M.A09(A05.contains(charset), A03(95, 21, 50) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC2286ia.A02)) {
            A0Z();
        }
        int iA01 = A01(charset);
        int lineLimit = this.A02;
        String strA0X = A0X(iA01 - lineLimit, charset);
        int i10 = this.A02;
        int lineLimit2 = this.A01;
        if (i10 == lineLimit2) {
            return strA0X;
        }
        A05(charset);
        return strA0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC2286ia.A06;
        }
        if (A07() >= 2) {
            if (this.A00[this.A02] == -2) {
                byte[] bArr = this.A00;
                int i10 = this.A02;
                if (A04[0].charAt(23) != 't') {
                    throw new RuntimeException();
                }
                A04[1] = "9QZAaK9H1E15SkUu26Oe";
                if (bArr[i10 + 1] == -1) {
                    this.A02 += 2;
                    return AbstractC2286ia.A04;
                }
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC2286ia.A05;
            }
            return null;
        }
        return null;
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) (i11 | ((bArr2[i12] & 255) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) (i11 | (bArr2[i12] & 255));
    }

    public final void A0c(int i10) {
        if (i10 > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i10);
        }
    }

    public final void A0d(int i10) {
        A0j(A08() < i10 ? new byte[i10] : this.A00, i10);
        String[] strArr = A04;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A04[3] = "3F79npZxDc4PfqkC8vfulVLdM";
    }

    public final void A0e(int i10) {
        C3M.A07(i10 >= 0 && i10 <= this.A00.length);
        this.A01 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final void A0f(int i10) {
        boolean z10;
        if (i10 >= 0) {
            int i11 = this.A01;
            String[] strArr = A04;
            if (strArr[4].charAt(20) != strArr[7].charAt(20)) {
                throw new RuntimeException();
            }
            A04[3] = "UMwuHioqOI4Z";
            if (i10 <= i11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        C3M.A07(z10);
        this.A02 = i10;
    }

    public final void A0g(int i10) {
        A0f(this.A02 + i10);
    }

    public final void A0h(C4I c4i, int i10) {
        A0k(c4i.A00, 0, i10);
        c4i.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.A00, this.A02, bArr, i10, i11);
        this.A02 += i11;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}
