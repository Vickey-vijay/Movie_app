package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1688Wt implements SS {
    public static C1688Wt A07;
    public static byte[] A08;
    public LL A00;
    public SJ A01;
    public SR A02;
    public InterfaceC1576Sh A03;
    public TP A04;
    public InterfaceC1624Ue A05;
    public InterfaceC1147Bn A06;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{15, 13, 13, 18, 13, 17, 14, 58, 13, 31, 45, 45, 35, 41, 40, -38, 30, 27, 46, 27, -38, 35, 40, 35, 46, 35, 27, 38, 35, 52, 31, 30, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1951cu c1951cu) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1951cu);
        this.A06 = A05(c1951cu, this.A03, A03(c1951cu));
        A09(c1951cu, A00(c1951cu, this.A06));
        A0A(c1951cu, this.A06);
        A0B(c1951cu, this.A06);
        if (this.A06 != null) {
            this.A06.A6V();
        }
    }

    public static InterfaceC1553Rj A00(C1951cu c1951cu, InterfaceC1147Bn interfaceC1147Bn) {
        if (!U7.A1m(c1951cu) || interfaceC1147Bn == null) {
            return null;
        }
        return AbstractC1554Rk.A00().A00(interfaceC1147Bn);
    }

    public static InterfaceC1576Sh A01(C1951cu c1951cu) {
        return AbstractC1577Si.A00().A00(c1951cu, new YJ());
    }

    public static synchronized C1688Wt A02() {
        if (A07 == null) {
            A07 = new C1688Wt();
        }
        return A07;
    }

    public static InterfaceC2056ed A03(C1951cu c1951cu) {
        if (!U7.A1i(c1951cu)) {
            return null;
        }
        return C2074ev.A01(c1951cu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.SS
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC1147Bn A97() {
        return this.A06;
    }

    public static InterfaceC1147Bn A05(C1951cu c1951cu, InterfaceC1576Sh interfaceC1576Sh, InterfaceC2056ed interfaceC2056ed) {
        if (!U7.A2e(c1951cu) || interfaceC2056ed == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC2096fI.A00().A00(c1951cu, interfaceC1576Sh, interfaceC2056ed, VZ.A04(c1951cu), new X8(new VR(c1951cu, A06(0, 0, 9), null, V6.A08, 0, new VB(), X7.A01(U7.A0N(c1951cu)), null, null, new C2209hB()), c1951cu), C2094fG.A00().A00());
    }

    public static void A08() {
        VF.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C1951cu c1951cu, InterfaceC1553Rj interfaceC1553Rj) {
        if (!U7.A1m(c1951cu) || interfaceC1553Rj == null) {
            return;
        }
        AbstractC1551Rh.A00().A00(interfaceC1553Rj, c1951cu);
    }

    public static void A0A(C1951cu c1951cu, InterfaceC1147Bn interfaceC1147Bn) {
        if (!U7.A0m(c1951cu) || interfaceC1147Bn == null) {
            return;
        }
        new S4(c1951cu, interfaceC1147Bn, new S5(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1951cu c1951cu, InterfaceC1147Bn interfaceC1147Bn) {
        if (interfaceC1147Bn == null) {
            return;
        }
        UB.A00(c1951cu, interfaceC1147Bn);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final US A6f(C1951cu c1951cu) {
        return VG.A01(c1951cu);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SR A6w(SQ sq) {
        if (this.A02 == null) {
            this.A02 = new XI(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SJ A78() {
        if (this.A01 == null) {
            this.A01 = new C2000di();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC1576Sh A7d(SQ sq) {
        if (this.A03 == null) {
            this.A03 = A01(sq.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC1589Su A7f(SQ sq) {
        return new C1750Zd(sq);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized ST A7p(final SQ sq) {
        return new YI(sq) { // from class: com.facebook.ads.redexgen.X.6K
            @Override // com.facebook.ads.redexgen.core.ST
            public final boolean A9e() {
                return CM.A09();
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ABq() {
                TK.A06(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACE() {
                TK.A07(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACe(C1951cu c1951cu) {
                AbstractC1453Nl.A01(c1951cu);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized LL A84(SQ sq) {
        if (!U7.A13(sq)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = LM.A00().A00(new YH(sq));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SV A8q(SQ sq) {
        return new XN(sq);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final C1951cu A8r(Context context) {
        C1951cu sdkContext = SP.A00();
        if (sdkContext == null) {
            C1951cu sdkContext2 = new C1951cu(context, this);
            SP.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC1624Ue A8s(C1951cu c1951cu) {
        if (this.A05 == null) {
            this.A05 = new VO(c1951cu);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized TP A8y() {
        if (this.A04 == null) {
            this.A04 = new TP();
            A08();
        }
        return this.A04;
    }
}
