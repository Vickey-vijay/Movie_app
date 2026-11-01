package com.facebook.ads.redexgen.core;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2360jq implements KJ {
    public static byte[] A0G;
    public static String[] A0H = {"cAtU07tvAHmpQwteCa8pEQH5gF5iUcfh", "Hjeg7grS71Jm6r5NKbmR8o7Al25NvLrB", "8TbkpeEOwiN436cBQhp4NSePMq1Z0ZNp", "wFA3Sleqv", "yws6lvEdJf3TdH9okNAymdfPd8aH69ii", "xvx7jE251jeLUpmQ5JTTtAODp7RTPAZj", "flKrm8KbmQNj7vJDUwRTOfFPMCPuTaKn", "2PQM5lIFNms8BVmrvHkuPmbcHqu7a2gR"};
    public static final double[] A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public H1 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C4J A0B;
    public final KK A0C;
    public final KS A0D;
    public final C1372Kh A0E;
    public final boolean[] A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<C2654or, Long> A00(KK kk2, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(kk2.A02, kk2.A00);
        int i10 = bArrCopyOf[4] & 255;
        int i11 = bArrCopyOf[5] & 255;
        int i12 = (i10 << 4) | (i11 >> 4);
        int i13 = ((i11 & 15) << 8) | (bArrCopyOf[6] & 255);
        float f10 = 1.0f;
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                float f11 = i13 * 4;
                float f12 = i12 * 3;
                if (A0H[2].charAt(3) == 'k') {
                    A0H[1] = "IKG5315UEoYuWi8w79ZvxkF28jax6fmF";
                    f10 = f11 / f12;
                    break;
                }
                throw new RuntimeException();
            case 3:
                f10 = (i13 * 16) / (i12 * 9);
                break;
            case 4:
                f10 = (i13 * 121) / (i12 * 100);
                break;
        }
        C2654or c2654orA14 = new C2D().A0y(str).A11(A01(0, 11, 62)).A0r(i12).A0f(i13).A0Y(f10).A12(Collections.singletonList(bArrCopyOf)).A14();
        long j10 = 0;
        int i14 = (bArrCopyOf[7] & 15) - 1;
        if (i14 >= 0 && i14 < A0I.length) {
            double d10 = A0I[i14];
            int i15 = kk2.A01;
            int i16 = (bArrCopyOf[i15 + 9] & 96) >> 5;
            int i17 = bArrCopyOf[i15 + 9] & 31;
            if (i16 != i17) {
                double d11 = i16;
                if (A0H[2].charAt(3) == 'k') {
                    String[] strArr = A0H;
                    strArr[5] = "rAMAKKtXIRKmVhmwxuLKv06bcSnWRDth";
                    strArr[7] = "TlBzrdA8FTcPVEmXq7DzDEHR3QnpW5Am";
                    d10 *= (d11 + 1.0d) / ((double) (i17 + 1));
                }
                throw new RuntimeException();
            }
            j10 = (long) (1000000.0d / d10);
        }
        return Pair.create(c2654orA14, Long.valueOf(j10));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {50, 45, 32, 33, 43, 107, 41, 52, 33, 35, 118};
        if (A0H[4].charAt(19) != 'y') {
            throw new RuntimeException();
        }
        A0H[2] = "5b4kHrs0qMccPUXJRINIqLrMs4aEtqXr";
        A0G = bArr;
    }

    static {
        A02();
        A0I = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public C2360jq() {
        this(null);
    }

    public C2360jq(C1372Kh c1372Kh) {
        this.A0E = c1372Kh;
        this.A0F = new boolean[4];
        this.A0C = new KK(128);
        if (c1372Kh != null) {
            this.A0D = new KS(178, 128);
            this.A0B = new C4J();
        } else {
            this.A0D = null;
            this.A0B = null;
        }
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        long j10;
        C3M.A02(this.A05);
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        byte[] bArrA0l = c4j.A0l();
        this.A04 += (long) c4j.A07();
        this.A05.AI7(c4j, c4j.A07());
        while (true) {
            int iA04 = AbstractC1278Gq.A04(bArrA0l, iA09, iA0A, this.A0F);
            if (iA04 == iA0A) {
                boolean z10 = this.A07;
                String[] strArr = A0H;
                if (strArr[6].length() == strArr[3].length()) {
                    break;
                }
                A0H[1] = "ooUhAAd1UFU3ZsdgbXiiZIdc17zvx9JT";
                if (!z10) {
                    this.A0C.A01(bArrA0l, iA09, iA0A);
                }
                if (this.A0D != null) {
                    this.A0D.A02(bArrA0l, iA09, iA0A);
                    return;
                }
                return;
            }
            int i10 = c4j.A0l()[iA04 + 3] & 255;
            int i11 = iA04 - iA09;
            if (!this.A07) {
                if (i11 > 0) {
                    this.A0C.A01(bArrA0l, iA09, iA04);
                }
                if (this.A0C.A02(i10, i11 < 0 ? -i11 : 0)) {
                    Pair<C2654or, Long> pairA00 = A00(this.A0C, (String) C3M.A01(this.A06));
                    this.A05.A6W((C2654or) pairA00.first);
                    this.A00 = ((Long) pairA00.second).longValue();
                    this.A07 = true;
                }
            }
            if (this.A0D != null) {
                int i12 = 0;
                if (i11 > 0) {
                    this.A0D.A02(bArrA0l, iA09, iA04);
                } else {
                    i12 = -i11;
                }
                if (this.A0D.A04(i12)) {
                    ((C4J) AbstractC09664a.A0f(this.A0B)).A0j(this.A0D.A01, AbstractC1278Gq.A02(this.A0D.A01, this.A0D.A00));
                    ((C1372Kh) AbstractC09664a.A0f(this.A0E)).A02(this.A03, this.A0B);
                }
                if (i10 == 178 && c4j.A0l()[iA04 + 2] == 1) {
                    this.A0D.A01(i10);
                }
            }
            if (i10 == 0 || i10 == 179) {
                int i13 = iA0A - iA04;
                long j11 = -9223372036854775807L;
                if (this.A08) {
                    boolean z11 = this.A07;
                    if (A0H[2].charAt(3) == 'k') {
                        A0H[4] = "I3q7BGa2d1yxMNRbgKUy1FZhwbtqEBv0";
                        if (z11) {
                            if (this.A03 != -9223372036854775807L) {
                                j11 = -9223372036854775807L;
                                this.A05.AIA(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i13, i13, null);
                            }
                        }
                    } else if (z11) {
                        if (this.A03 != -9223372036854775807L) {
                            j11 = -9223372036854775807L;
                            this.A05.AIA(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i13, i13, null);
                        }
                    }
                }
                boolean z12 = this.A0A;
                String[] strArr2 = A0H;
                if (strArr2[6].length() == strArr2[3].length()) {
                    break;
                }
                A0H[1] = "M1cTpkEI0lqbwMedLRZ4APYv7Db9TSYf";
                if (!z12 || this.A08) {
                    this.A02 = this.A04 - ((long) i13);
                    if (this.A01 != j11) {
                        j10 = this.A01;
                    } else if (this.A03 != j11) {
                        long j12 = this.A03;
                        if (A0H[0].charAt(10) != 'm') {
                            j10 = this.A00 + j12;
                        } else {
                            A0H[0] = "FNyxia2DuWmH1fHrZAJ70vL24BcjBrNj";
                            j10 = this.A00 + j12;
                        }
                    } else {
                        j10 = j11;
                    }
                    this.A03 = j10;
                    this.A09 = false;
                    this.A01 = j11;
                    this.A0A = true;
                }
                this.A08 = i10 == 0;
            } else if (i10 == 184) {
                this.A09 = true;
            }
            iA09 = iA04 + 3;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1369Ke c1369Ke) {
        c1369Ke.A05();
        this.A06 = c1369Ke.A04();
        this.A05 = gy.AJh(c1369Ke.A03(), 2);
        if (this.A0E != null) {
            this.A0E.A03(gy, c1369Ke);
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        AbstractC1278Gq.A0H(this.A0F);
        this.A0C.A00();
        if (this.A0D != null) {
            KS ks = this.A0D;
            if (A0H[1].length() != 32) {
                throw new RuntimeException();
            }
            A0H[0] = "joVCJevLOtmtIagsqVBvfxemqq2mA7LA";
            ks.A00();
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }
}
