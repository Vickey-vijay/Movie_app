package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2531mp implements C5J {
    public static byte[] A00;
    public static final boolean A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{32, 39, 53, 35, 35, 36, 54, 47, 58, 22, 26, 1, 20, 21};
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    static {
        boolean z10;
        A01();
        if (A00(8, 6, 91).equals(AbstractC09664a.A05)) {
            if (!A00(4, 4, 66).equals(AbstractC09664a.A06)) {
                if (!A00(0, 4, 65).equals(AbstractC09664a.A06)) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        A01 = z10;
    }
}
