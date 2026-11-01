package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GR {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, ExifInterface.MARKER_APP1, -35, -47, -16, -27, -24, -36, -12, -14, -7, -7, -14, -9, -16, -87, -5, -18, -10, -22, -14, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, -50, -46, -87, -41, -54, -43, -87, -2, -9, -14, -3, -73};
    }

    public static int A00(C4J c4j) {
        int i10 = 0;
        while (value != 0) {
            int b10 = c4j.A0I();
            i10 += b10;
            if (b10 != 255) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j10, C4J c4j, H1[] h1Arr) {
        while (true) {
            if (c4j.A07() > 1) {
                int iA00 = A00(c4j);
                int iA01 = A00(c4j);
                int iA09 = c4j.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c4j.A07();
                    if (iA01 > payloadType) {
                        AnonymousClass44.A07(A01(0, 7, 3), A01(7, 45, 16));
                        iA09 = c4j.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int userIdentifier = c4j.A0I();
                        int providerCode = c4j.A0M();
                        int countryCode = 0;
                        if (providerCode == 49) {
                            countryCode = c4j.A0C();
                        }
                        int iA0I = c4j.A0I();
                        if (providerCode == 47) {
                            c4j.A0g(1);
                        }
                        int i10 = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && iA0I == 3) ? 1 : 0;
                        if (providerCode == 49) {
                            int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                            i10 &= userDataTypeCode;
                        }
                        if (i10 != 0) {
                            A04(j10, c4j, h1Arr);
                        }
                    }
                } else {
                    AnonymousClass44.A07(A01(0, 7, 3), A01(7, 45, 16));
                    iA09 = c4j.A0A();
                }
                c4j.A0f(iA09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j10, C4J c4j, H1[] h1Arr) {
        int firstByte = c4j.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c4j.A0g(1);
        int i10 = (firstByte & 31) * 3;
        int iA09 = c4j.A09();
        for (H1 h10 : h1Arr) {
            c4j.A0f(iA09);
            h10.AI7(c4j, i10);
            if (j10 != -9223372036854775807L) {
                h10.AIA(j10, 1, i10, 0, null);
            }
        }
    }
}
