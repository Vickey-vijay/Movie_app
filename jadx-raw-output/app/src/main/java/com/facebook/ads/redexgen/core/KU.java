package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KU {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C4R A07 = new C4R(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C4J A06 = new C4J();

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, 20, 50, 40, 45, 38, -33, 19, 8, 12, 4, 30, 20, 13, 18, 4, 19, -33, 40, 45, 50, 51, 36, 32, 35, -19, 18, 55, 63, ExifInterface.START_CODE, 53, 50, 45, -23, 45, 62, 59, ExifInterface.START_CODE, 61, 50, 56, 55, 3, -23, 22, 57, 10, 59, 56, 39, 58, 47, 53, 52, 24, 43, 39, ExifInterface.START_CODE, 43, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC2443lN interfaceC2443lN) {
        this.A06.A0i(AbstractC09664a.A07);
        this.A03 = true;
        interfaceC2443lN.AI1();
        return 0;
    }

    private int A01(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        int iMin = (int) Math.min(20000L, interfaceC2443lN.A8G());
        if (interfaceC2443lN.A8f() != 0) {
            c1281Gt.A00 = 0;
            return 1;
        }
        C4J c4j = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch == 30) {
            throw new RuntimeException();
        }
        A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
        c4j.A0d(iMin);
        interfaceC2443lN.AI1();
        interfaceC2443lN.AG9(this.A06.A0l(), 0, iMin);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        long jA8G = interfaceC2443lN.A8G();
        int iMin = (int) Math.min(20000L, jA8G);
        long j10 = jA8G - ((long) iMin);
        long searchStartPosition = interfaceC2443lN.A8f();
        if (searchStartPosition != j10) {
            c1281Gt.A00 = j10;
            return 1;
        }
        this.A06.A0d(iMin);
        interfaceC2443lN.AI1();
        interfaceC2443lN.AG9(this.A06.A0l(), 0, iMin);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
    }

    private long A04(C4J c4j) {
        int iA0A = c4j.A0A();
        for (int iA09 = c4j.A09(); iA09 < searchStartPosition; iA09++) {
            int searchEndPosition = A03(c4j.A0l(), iA09);
            if (searchEndPosition == 442) {
                int searchStartPosition = iA09 + 4;
                c4j.A0f(searchStartPosition);
                long jA06 = A06(c4j);
                if (jA06 != -9223372036854775807L) {
                    return jA06;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A05(C4J c4j) {
        int iA09 = c4j.A09();
        int searchStartPosition = c4j.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= iA09; nextStartCode--) {
            int searchEndPosition = A03(c4j.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c4j.A0f(searchStartPosition2);
                long jA06 = A06(c4j);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                if (jA06 != -9223372036854775807L) {
                    return jA06;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long A06(C4J c4j) {
        int iA09 = c4j.A09();
        if (c4j.A07() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c4j.A0k(bArr, 0, originalPosition);
        c4j.A0f(iA09);
        if (A0A(bArr)) {
            return A07(bArr);
        }
        return -9223372036854775807L;
    }

    public static long A07(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        if (!this.A05) {
            return A02(interfaceC2443lN, c1281Gt);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(interfaceC2443lN);
        }
        if (!this.A04) {
            return A01(interfaceC2443lN, c1281Gt);
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(interfaceC2443lN);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AnonymousClass44.A07(A08(45, 16, 119), A08(27, 18, 122) + this.A00 + A08(0, 27, 112));
            this.A00 = -9223372036854775807L;
        }
        return A00(interfaceC2443lN);
    }

    public final long A0C() {
        return this.A00;
    }

    public final C4R A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
