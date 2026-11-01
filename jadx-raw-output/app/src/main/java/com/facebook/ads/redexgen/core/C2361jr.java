package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2361jr implements KJ {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public final List<C1365Ka> A04;
    public final H1[] A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, -49, 4, 22, 2, 19, 21, 2, 19};
    }

    public C2361jr(List<C1365Ka> list) {
        this.A04 = list;
        this.A05 = new H1[list.size()];
    }

    private boolean A02(C4J c4j, int i10) {
        if (c4j.A07() == 0) {
            return false;
        }
        if (c4j.A0I() != i10) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c4j, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c4j, 0)) {
                return;
            }
            int iA09 = c4j.A09();
            int iA07 = c4j.A07();
            for (H1 h10 : this.A05) {
                c4j.A0f(iA09);
                h10.AI7(c4j, iA07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + iA07;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1369Ke c1369Ke) {
        for (int i10 = 0; i10 < i; i10++) {
            C1365Ka c1365Ka = this.A04.get(i10);
            c1369Ke.A05();
            H1 h1AJh = gy.AJh(c1369Ke.A03(), 3);
            h1AJh.A6W(new C2D().A0y(c1369Ke.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(c1365Ka.A02)).A10(c1365Ka.A01).A14());
            this.A05[i10] = h1AJh;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
        if (this.A03) {
            if (this.A02 != -9223372036854775807L) {
                for (H1 h10 : this.A05) {
                    h10.AIA(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j10 != -9223372036854775807L) {
            this.A02 = j10;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A03 = false;
        this.A02 = -9223372036854775807L;
    }
}
