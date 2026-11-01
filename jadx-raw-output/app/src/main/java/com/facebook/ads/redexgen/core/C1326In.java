package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1326In {
    public static byte[] A05;
    public static String[] A06 = {"8Hrr", "h", "0Fdee0wg4hsenc5DHvlvwY", "0vqFlF7HyuYg3TUYlVTMC9xVo", "FyWFMrZuY5MlICM", "PN9pA9f0QUy", "hrYl81FOJTp7gpX67gLzFhurxBV", "ujvsBGrB8Jik"};
    public final int A00;
    public final C1287Gz A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{40, 33, 47, 78, 124, 124, 122, 98, 102, 97, 104, 47, 78, 74, 92, 34, 76, 91, 93, 47, 108, 125, 118, 127, 123, 96, 47, 98, 96, 107, 106, 33, 38, 0, 19, 17, 25, 55, 28, 17, 0, 11, 2, 6, 27, 29, 28, 48, 29, 10, 95, 100, 121, 127, 122, 122, 101, 120, 126, 111, 110, ExifInterface.START_CODE, 122, 120, 101, 126, 111, 105, 126, 99, 101, 100, ExifInterface.START_CODE, 121, 105, 98, 111, 103, 111, ExifInterface.START_CODE, 126, 115, 122, 111, ExifInterface.START_CODE, 45, 115, 114, 115, 33, 41, 40, 41, 57, 60, 58, 49, 60, 120, 126, 117, 104};
    }

    static {
        A02();
    }

    public C1326In(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        C3M.A07((bArr2 == null) ^ (i10 == 0));
        this.A03 = z10;
        this.A02 = str;
        this.A00 = i10;
        this.A04 = bArr2;
        this.A01 = new C1287Gz(A00(str), bArr, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    public static int A00(String str) {
        byte b10;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 80))) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AnonymousClass44.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
            case 3046671:
                if (str.equals(A01(90, 4, 10))) {
                    b10 = 3;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AnonymousClass44.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
            case 3049879:
                if (str.equals(A01(94, 4, 31))) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                switch (b10) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AnonymousClass44.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
            case 3049895:
                String[] strArr = A06;
                if (strArr[6].length() != strArr[1].length()) {
                    A06[5] = "5D1VNf4Gt9Q";
                    if (str.equals(A01(98, 4, 91))) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    switch (b10) {
                        case 0:
                        case 1:
                            return 1;
                        case 2:
                        case 3:
                            return 2;
                        default:
                            AnonymousClass44.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                            return 1;
                    }
                }
                throw new RuntimeException();
            default:
                b10 = -1;
                switch (b10) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AnonymousClass44.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
        }
    }
}
