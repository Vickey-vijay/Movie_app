package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1371Kg {
    public static String[] A00 = {"zHvJnNiJi0M", "FniiyLS950t5mTu4QlbfX1TrXuc", "I7PZw93cjLP5IpZ6BbWCD", "9iobBdNwIxtUK2g", "LhRCEY8vP1M7TerIjGAXS82kM3fiu", "vMv2t0fFsfhvwPnbOb52fPF3dg3aW", "XvTrrYiBPPp7CW1", "g12euaG6mbsrKt48m9yyXN0g2MG"};

    public static int A00(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long A01(C4J c4j, int i10, int i11) {
        c4j.A0f(i10);
        if (c4j.A07() < 5) {
            return -9223372036854775807L;
        }
        int pid = c4j.A0C();
        int tsPacketHeader = 8388608 & pid;
        if (tsPacketHeader != 0) {
            return -9223372036854775807L;
        }
        int tsPacketHeader2 = 2096896 & pid;
        if ((tsPacketHeader2 >> 8) != i11) {
            return -9223372036854775807L;
        }
        int tsPacketHeader3 = pid & 32;
        int tsPacketHeader4 = tsPacketHeader3 != 0 ? 1 : 0;
        if (tsPacketHeader4 == 0) {
            return -9223372036854775807L;
        }
        int tsPacketHeader5 = c4j.A0I();
        if (tsPacketHeader5 >= 7) {
            int tsPacketHeader6 = c4j.A07();
            if (tsPacketHeader6 >= 7) {
                int tsPacketHeader7 = c4j.A0I();
                if ((tsPacketHeader7 & 16) == 16) {
                    byte[] bArr = new byte[6];
                    int tsPacketHeader8 = bArr.length;
                    c4j.A0k(bArr, 0, tsPacketHeader8);
                    long jA02 = A02(bArr);
                    String[] strArr = A00;
                    String str = strArr[4];
                    String str2 = strArr[5];
                    int pid2 = str.length();
                    int tsPacketHeader9 = str2.length();
                    if (pid2 != tsPacketHeader9) {
                        throw new RuntimeException();
                    }
                    A00[2] = "oAb2qjZGj";
                    return jA02;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long A02(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    public static boolean A03(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = i14 * 188;
            String[] strArr = A00;
            String str = strArr[3];
            String str2 = strArr[6];
            int i16 = str.length();
            int consecutiveSyncByteCount = str2.length();
            if (i16 != consecutiveSyncByteCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[3] = "Qn38sx03S77VT5y";
            strArr2[6] = "gfX0N6dqp84BCDo";
            int i17 = i15 + i12;
            if (i17 < i10 || i17 >= i11) {
                i13 = 0;
            } else {
                int i18 = bArr[i17];
                if (i18 != 71) {
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
