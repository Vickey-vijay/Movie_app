package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2413kh implements IL {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C4J A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{65, 77, 30, 25, 30, 23, 77, 30, 12, 0, 29, 1, 8, 77, 30, 4, 23, 8, 87, 77, 70, 115, 104, 106, 87, 102, 117, 116, 98, 117, 116, 9, 61, 44, 33, 39, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 104, 37, 33, 59, 37, 41, 60, 43, 32, 102, 104, 59, 60, 59, 44, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 114, 104, 25, 13, 28, 17, 23, 87, 10, 25, 15};
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public C2413kh(C2414ki c2414ki, C2654or c2654or) {
        this.A02 = c2414ki.A00;
        this.A02.A0f(12);
        int iA0L = this.A02.A0L();
        if (A00(77, 9, 20).equals(c2654or.A0W)) {
            int i10 = c2654or.A0C;
            int fixedSampleSize = c2654or.A06;
            int iA06 = AbstractC09664a.A06(i10, fixedSampleSize);
            if (iA0L != 0) {
                int fixedSampleSize2 = iA0L % iA06;
                if (fixedSampleSize2 != 0) {
                    AnonymousClass44.A07(A00(20, 11, 107), A00(31, 46, 36) + iA06 + A00(0, 20, 1) + iA0L);
                    iA0L = iA06;
                }
            } else {
                AnonymousClass44.A07(A00(20, 11, 107), A00(31, 46, 36) + iA06 + A00(0, 20, 1) + iA0L);
                iA0L = iA06;
            }
        }
        this.A00 = iA0L == 0 ? -1 : iA0L;
        int fixedSampleSize3 = this.A02.A0L();
        this.A01 = fixedSampleSize3;
    }

    @Override // com.facebook.ads.redexgen.core.IL
    public final int A82() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.IL
    public final int A8n() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.IL
    public final int AGi() {
        return this.A00 == -1 ? this.A02.A0L() : this.A00;
    }
}
