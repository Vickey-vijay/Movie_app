package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2431lB implements GX {
    public static String[] A0E = {"CA5tgyD1ft6jPQScHcEKxijdDn8CpaAj", "rrvFpoycxrr9C", "qEVAWkTuIpwlYdd7u09", "zGu", "r98", "bvJEUCblPMa4rVVBIUxYNVrIzXUNKtA9", "0YPJWJVAuNzanCV2KA", "Ww61LKXhC9Y0aL9N3LYwjUph3RiaOuui"};
    public static final InterfaceC1263Gb A0F = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.lC
        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final GX[] A5F() {
            return C2431lB.A09();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1262Ga.A01(this, uri, map);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Metadata A05;
    public GY A06;
    public C1269Gh A07;
    public H1 A08;
    public C2433lD A09;
    public final C4J A0A;
    public final C1264Gc A0B;
    public final boolean A0C;
    public final byte[] A0D;

    public C2431lB() {
        this(0);
    }

    public C2431lB(int i10) {
        this.A0D = new byte[42];
        this.A0A = new C4J(new byte[32768], 0);
        this.A0C = (i10 & 1) != 0;
        this.A0B = new C1264Gc();
        this.A03 = 0;
    }

    private int A00(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        C3M.A01(this.A08);
        C3M.A01(this.A07);
        if (this.A09 != null && this.A09.A09()) {
            return this.A09.A06(interfaceC2443lN, c1281Gt);
        }
        long j10 = this.A04;
        if (A0E[2].length() == 19) {
            A0E[2] = "5vsaEOzV8f26KwvJg69";
            if (j10 == -1) {
                this.A04 = AbstractC1265Gd.A01(interfaceC2443lN, this.A07);
                return 0;
            }
            int iA0A = this.A0A.A0A();
            String[] strArr = A0E;
            if (strArr[6].length() != strArr[1].length()) {
                String[] strArr2 = A0E;
                strArr2[6] = "dF6ALNUNBXQAeyaZgj";
                strArr2[1] = "WrJkmBjBZcK3S";
                boolean z10 = false;
                if (iA0A < 32768) {
                    int currentLimit = 32768 - iA0A;
                    int i10 = interfaceC2443lN.read(this.A0A.A0l(), iA0A, currentLimit);
                    z10 = i10 == -1;
                    if (!z10) {
                        this.A0A.A0e(iA0A + i10);
                    } else {
                        int currentLimit2 = this.A0A.A07();
                        if (currentLimit2 == 0) {
                            A03();
                            return -1;
                        }
                    }
                }
                int iA09 = this.A0A.A09();
                int i11 = this.A00;
                int currentLimit3 = this.A02;
                if (i11 < currentLimit3) {
                    C4J c4j = this.A0A;
                    int i12 = this.A02;
                    int currentLimit4 = this.A00;
                    int i13 = i12 - currentLimit4;
                    int currentLimit5 = this.A0A.A07();
                    c4j.A0g(Math.min(i13, currentLimit5));
                }
                long jA01 = A01(this.A0A, z10);
                int iA010 = this.A0A.A09() - iA09;
                this.A0A.A0f(iA09);
                this.A08.AI7(this.A0A, iA010);
                int currentLimit6 = this.A00;
                this.A00 = currentLimit6 + iA010;
                if (jA01 != -1) {
                    A03();
                    String[] strArr3 = A0E;
                    String str = strArr3[6];
                    String str2 = strArr3[1];
                    int length = str.length();
                    int currentLimit7 = str2.length();
                    if (length != currentLimit7) {
                        String[] strArr4 = A0E;
                        strArr4[3] = "m1G";
                        strArr4[4] = "pgV";
                        this.A00 = 0;
                        this.A04 = jA01;
                    }
                }
                if (this.A0A.A07() < 16) {
                    int iA07 = this.A0A.A07();
                    System.arraycopy(this.A0A.A0l(), this.A0A.A09(), this.A0A.A0l(), 0, iA07);
                    this.A0A.A0f(0);
                    this.A0A.A0e(iA07);
                }
                return 0;
            }
        }
        throw new RuntimeException();
    }

    private long A01(C4J c4j, boolean z10) {
        boolean zA07;
        C3M.A01(this.A07);
        int iA09 = c4j.A09();
        while (iA09 <= frameOffset - 16) {
            c4j.A0f(iA09);
            if (AbstractC1265Gd.A07(c4j, this.A07, this.A01, this.A0B)) {
                c4j.A0f(iA09);
                return this.A0B.A00;
            }
            iA09++;
        }
        if (z10) {
            while (iA09 <= iA0A - frameOffset) {
                c4j.A0f(iA09);
                try {
                    zA07 = AbstractC1265Gd.A07(c4j, this.A07, this.A01, this.A0B);
                } catch (IndexOutOfBoundsException unused) {
                    zA07 = false;
                }
                int iA010 = c4j.A09();
                int frameOffset = c4j.A0A();
                if (iA010 > frameOffset) {
                    zA07 = false;
                }
                if (zA07) {
                    c4j.A0f(iA09);
                    return this.A0B.A00;
                }
                iA09++;
            }
            int frameOffset2 = c4j.A0A();
            c4j.A0f(frameOffset2);
        } else {
            c4j.A0f(iA09);
        }
        String[] strArr = A0E;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int frameOffset3 = str2.length();
        if (length != frameOffset3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "ocsB3wUrjHvCq2LiV7qRqPCVLxbY4c1N";
        strArr2[5] = "pwt2z55mSaXVkRisABTZleFgLF4gxvRK";
        return -1L;
    }

    private InterfaceC1284Gw A02(long j10, long j11) {
        C3M.A01(this.A07);
        if (this.A07.A0A != null) {
            return new C2440lK(this.A07, j10);
        }
        if (j11 != -1 && this.A07.A09 > 0) {
            this.A09 = new C2433lD(this.A07, this.A01, j10, j11);
            return this.A09.A07();
        }
        return new C2438lI(this.A07.A06());
    }

    private void A03() {
        ((H1) AbstractC09664a.A0f(this.A08)).AIA((this.A04 * 1000000) / ((long) ((C1269Gh) AbstractC09664a.A0f(this.A07)).A07), 1, this.A00, 0, null);
    }

    private void A04(InterfaceC2443lN interfaceC2443lN) throws IOException {
        this.A01 = AbstractC1267Gf.A00(interfaceC2443lN);
        ((GY) AbstractC09664a.A0f(this.A06)).AIN(A02(interfaceC2443lN.A8f(), interfaceC2443lN.A8G()));
        this.A03 = 5;
    }

    private void A05(InterfaceC2443lN interfaceC2443lN) throws IOException {
        interfaceC2443lN.AG9(this.A0D, 0, this.A0D.length);
        interfaceC2443lN.AI1();
        this.A03 = 2;
    }

    private void A06(InterfaceC2443lN interfaceC2443lN) throws IOException {
        this.A05 = AbstractC1267Gf.A02(interfaceC2443lN, !this.A0C);
        this.A03 = 1;
    }

    private void A07(InterfaceC2443lN interfaceC2443lN) throws IOException {
        boolean zA0B = false;
        C1266Ge metadataHolder = new C1266Ge(this.A07);
        while (!zA0B) {
            zA0B = AbstractC1267Gf.A0B(interfaceC2443lN, metadataHolder);
            this.A07 = (C1269Gh) AbstractC09664a.A0f(metadataHolder.A00);
        }
        C3M.A01(this.A07);
        this.A02 = Math.max(this.A07.A06, 6);
        ((H1) AbstractC09664a.A0f(this.A08)).A6W(this.A07.A08(this.A0D, this.A05));
        this.A03 = 4;
    }

    private void A08(InterfaceC2443lN interfaceC2443lN) throws IOException {
        AbstractC1267Gf.A09(interfaceC2443lN);
        this.A03 = 3;
    }

    public static /* synthetic */ GX[] A09() {
        return new GX[]{new C2431lB()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A06 = gy;
        this.A08 = gy.AJh(0, 1);
        gy.A6G();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        switch (this.A03) {
            case 0:
                A06(interfaceC2443lN);
                return 0;
            case 1:
                A05(interfaceC2443lN);
                return 0;
            case 2:
                A08(interfaceC2443lN);
                return 0;
            case 3:
                A07(interfaceC2443lN);
                return 0;
            case 4:
                A04(interfaceC2443lN);
                return 0;
            case 5:
                return A00(interfaceC2443lN, c1281Gt);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        if (j10 == 0) {
            this.A03 = 0;
        } else {
            C2433lD c2433lD = this.A09;
            if (A0E[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[3] = "FHi";
            strArr[4] = "3pT";
            if (c2433lD != null) {
                this.A09.A08(j11);
            }
        }
        this.A04 = j11 != 0 ? -1L : 0L;
        this.A00 = 0;
        this.A0A.A0d(0);
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2443lN interfaceC2443lN) throws IOException {
        AbstractC1267Gf.A01(interfaceC2443lN, false);
        return AbstractC1267Gf.A0A(interfaceC2443lN);
    }
}
