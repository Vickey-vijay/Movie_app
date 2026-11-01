package com.facebook.ads.redexgen.core;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2354jk implements KJ {
    public static String[] A0C = {"sfI6nyeMmjCQTVuCF4qtLy1yjQ", "oMMkuqn3AEHt3nTJ2MOQ2D2uSIMoL5hR", "njiJ7f0cFz7yvYhslZfI3p6AsrETAKAq", "CO", "QYzjeJ7DBautBSe7mq0LOiDdFPwmAbmn", "JPkUATb4vKYtG67zqSLtKl3hIns3qHla", "LddklOggznimrifNDzyDRJC2bK2Jwwl3", "KQOf5F07mNCBpldsJ3B6cw89YczO0oD4"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public H1 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final C4J A09;
    public final C1273Gl A0A;
    public final String A0B;

    public C2354jk() {
        this(null);
    }

    public C2354jk(String str) {
        this.A02 = 0;
        this.A09 = new C4J(4);
        this.A09.A0l()[0] = -1;
        this.A0A = new C1273Gl();
        this.A04 = -9223372036854775807L;
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    private void A00(C4J c4j) {
        boolean z10;
        byte[] bArrA0l = c4j.A0l();
        int iA0A = c4j.A0A();
        for (int iA09 = c4j.A09(); iA09 < iA0A; iA09++) {
            int startOffset = bArrA0l[iA09];
            boolean z11 = (startOffset & 255) == 255;
            if (this.A08) {
                int startOffset2 = bArrA0l[iA09];
                if ((startOffset2 & 224) == 224) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            this.A08 = z11;
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[4];
            int startOffset3 = str.charAt(11);
            if (startOffset3 != str2.charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "cXytat7P8iKtLP6TqIlLVzlvPDaZG4kX";
            strArr2[4] = "jOC7bwxKPNAtckDXCFNPXzZbhL30f8uL";
            if (z10) {
                c4j.A0f(iA09 + 1);
                this.A08 = false;
                this.A09.A0l()[1] = bArrA0l[iA09];
                this.A00 = 2;
                this.A02 = 1;
                return;
            }
        }
        c4j.A0f(iA0A);
    }

    @RequiresNonNull({"output"})
    private void A01(C4J c4j) {
        int iMin = Math.min(c4j.A07(), this.A01 - this.A00);
        this.A05.AI7(c4j, iMin);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + iMin;
        int i10 = this.A00;
        int bytesToRead2 = this.A01;
        if (i10 < bytesToRead2) {
            return;
        }
        if (this.A04 != -9223372036854775807L) {
            H1 h10 = this.A05;
            String[] strArr = A0C;
            String str = strArr[5];
            String str2 = strArr[6];
            int iCharAt = str.charAt(20);
            int bytesToRead3 = str2.charAt(20);
            if (iCharAt == bytesToRead3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[2] = "FJBco80YTxCtRjQ9gQqQy4qETqBIMl0G";
            strArr2[7] = "R9O1kZ0wfg8ZyFlwYf0hmCttc3ths7ud";
            h10.AIA(this.A04, 1, this.A01, 0, null);
            this.A04 += this.A03;
        }
        this.A00 = 0;
        this.A02 = 0;
    }

    @RequiresNonNull({"output"})
    private void A02(C4J c4j) {
        int iMin = Math.min(c4j.A07(), 4 - this.A00);
        byte[] bArrA0l = this.A09.A0l();
        int bytesToRead = this.A00;
        c4j.A0k(bArrA0l, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        if (bytesToRead3 < 4) {
            return;
        }
        this.A09.A0f(0);
        C1273Gl c1273Gl = this.A0A;
        int bytesToRead4 = this.A09.A0C();
        if (!c1273Gl.A00(bytesToRead4)) {
            this.A00 = 0;
            this.A02 = 1;
            return;
        }
        int bytesToRead5 = this.A0A.A02;
        this.A01 = bytesToRead5;
        if (!this.A07) {
            int bytesToRead6 = this.A0A.A04;
            long j10 = ((long) bytesToRead6) * 1000000;
            int bytesToRead7 = this.A0A.A03;
            this.A03 = j10 / ((long) bytesToRead7);
            C2D c2dA0h = new C2D().A0y(this.A06).A11(this.A0A.A06).A0h(4096);
            int bytesToRead8 = this.A0A.A01;
            C2D c2dA0b = c2dA0h.A0b(bytesToRead8);
            int bytesToRead9 = this.A0A.A03;
            this.A05.A6W(c2dA0b.A0m(bytesToRead9).A10(this.A0B).A14());
            this.A07 = true;
        }
        this.A09.A0f(0);
        this.A05.AI7(this.A09, 4);
        this.A02 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        C3M.A02(this.A05);
        while (c4j.A07() > 0) {
            switch (this.A02) {
                case 0:
                    A00(c4j);
                    break;
                case 1:
                    A02(c4j);
                    break;
                case 2:
                    A01(c4j);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1369Ke c1369Ke) {
        c1369Ke.A05();
        this.A06 = c1369Ke.A04();
        this.A05 = gy.AJh(c1369Ke.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A04 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}
