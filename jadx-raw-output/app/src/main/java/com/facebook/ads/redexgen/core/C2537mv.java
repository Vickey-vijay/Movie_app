package com.facebook.ads.redexgen.core;

import java.math.RoundingMode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2537mv implements InterfaceC10708d {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C2537mv(C10788o c10788o) {
        this.A02 = c10788o.A02;
        this.A01 = c10788o.A01;
        this.A05 = c10788o.A05;
        this.A04 = c10788o.A04;
        this.A03 = c10788o.A03;
        this.A00 = c10788o.A00;
    }

    public static int A00(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    private final int A01(int i10) {
        int iA00 = A00(i10);
        int maxByteRate = this.A03;
        return AD.A03((((long) maxByteRate) * ((long) iA00)) / 1000000);
    }

    private final int A02(int i10, int i11) {
        int bufferSizeUs;
        int i12 = this.A04;
        if (i10 == 5) {
            int bufferSizeUs2 = this.A00;
            i12 *= bufferSizeUs2;
        }
        if (i11 != -1) {
            bufferSizeUs = C9D.A00(i11, 8, RoundingMode.CEILING);
        } else {
            bufferSizeUs = A00(i10);
        }
        return AD.A03((((long) i12) * ((long) bufferSizeUs)) / 1000000);
    }

    public static int A03(int i10, int i11, int i12) {
        return AD.A03(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    private final int A04(int i10, int i11, int i12) {
        int maxAppBufferSize = this.A05 * i10;
        int targetBufferSize = this.A02;
        int minAppBufferSize = A03(targetBufferSize, i11, i12);
        int targetBufferSize2 = this.A01;
        return AbstractC09664a.A07(maxAppBufferSize, minAppBufferSize, A03(targetBufferSize2, i11, i12));
    }

    private final int A05(int i10, int i11, int i12, int i13, int i14, int i15) {
        switch (i12) {
            case 0:
                return A04(i10, i14, i13);
            case 1:
                return A01(i11);
            case 2:
                return A02(i11, i15);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10708d
    public final int A6x(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        int bufferSize = A05(i10, i11, i12, i13, i14, i15);
        return (((Math.max(i10, (int) (((double) bufferSize) * d10)) + i13) - 1) / i13) * i13;
    }
}
