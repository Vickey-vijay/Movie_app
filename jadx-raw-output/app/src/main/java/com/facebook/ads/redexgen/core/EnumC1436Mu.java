package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC1436Mu {
    A04(A01(23, 14, 118)),
    A05(A01(37, 9, 3));

    public static byte[] A01;
    public static String[] A02 = {"wiqydbsLJDwKBvl8t", "43d9HmwIqa0UmHFIq", "pggHvImyjq29EoPdIbNPEyFQYY47zx5L", "Y7HVzfyHvrAyRWnGs1HIvpl", "hbOUIe", "Z6uWuqD1EDiaZecfB", "H4uwq6", "uO2zzJUzM8GpymnowP"};
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A02;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A02[7] = "YRQbc7SZzU6A3uauK9TIi077IJfJ6";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-84, -72, -73, -67, -82, -63, -67, -66, -86, -75, -56, -86, -71, -71, -30, -45, ExifInterface.MARKER_EOI, -41, -15, -30, ExifInterface.MARKER_APP1, -27, -26, 20, 32, 31, 37, 22, 41, 37, 38, 18, 29, 16, 18, 33, 33, -82, -97, -91, -93, -99, -82, -83, -79, -78};
        String[] strArr = A02;
        if (strArr[3].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "ja6ocK";
        strArr2[4] = "zrwWzc";
    }

    static {
        A02();
    }

    EnumC1436Mu(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static EnumC1436Mu A00(String str) {
        byte b10;
        switch (str.hashCode()) {
            case 883765328:
                if (!str.equals(A01(37, 9, 3))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 1434358835:
                boolean zEquals = str.equals(A01(23, 14, 118));
                if (A02[7].length() == 12) {
                    String[] strArr = A02;
                    strArr[3] = "XJGJWrBy1UqGLv6Rhel9amw";
                    strArr[1] = "eBE1kZuIIDAbDWtcc";
                    if (!zEquals) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                } else {
                    A02[7] = "bogI3bwqsUF49nq3u6zYPkLLi";
                    if (!zEquals) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return A04;
            default:
                EnumC1436Mu enumC1436Mu = A05;
                if (A02[2].charAt(22) == 'a') {
                    throw new RuntimeException();
                }
                A02[7] = "wI7Mn7kKRaTG8Mvy9wZ";
                return enumC1436Mu;
        }
    }
}
