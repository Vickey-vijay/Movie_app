package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2341jX implements GX {
    public static byte[] A0J;
    public static String[] A0K = {"3dZ2NVLPQqqn6A0EUODs8QMiUtGNdx7Z", "xuFjaEC88iswWSp8XVRYQuG7fGDdMX6m", "rjdehGUhBmpCCREwTfVtgF2pvaVk7Y4r", "d6Khp0uOfqWTO1N40QwEt8A6fbOPCRXM", "7DUxEGbk65Je624GBbCgY3TRasgIHugx", "67QtD18zbra6Hv1RLsjBMCgdjZH6dqot", "3juCdNiTPJNnKT5EWnyWnOXcFndGfbid", "ecCIYKwUzA4Q5tjuLJWmpRk8GBJuqhXU"};
    public static final InterfaceC1263Gb A0L;
    public int A00;
    public int A01;
    public int A02;
    public GY A03;
    public C2345jb A04;
    public InterfaceC1370Kf A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final SparseArray<InterfaceC1370Kf> A0B;
    public final SparseBooleanArray A0C;
    public final SparseBooleanArray A0D;
    public final SparseIntArray A0E;
    public final C4J A0F;
    public final KY A0G;
    public final InterfaceC1367Kc A0H;
    public final List<C4R> A0I;

    public static String A0D(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0K[5].charAt(9) == '6') {
                throw new RuntimeException();
            }
            A0K[5] = "URhJNiPfEIrBtOuckipDqR7YK4paNHr3";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 30);
            i13++;
        }
    }

    public static void A0G() {
        A0J = new byte[]{64, 98, 109, 109, 108, 119, 35, 101, 106, 109, 103, 35, 112, 122, 109, 96, 35, 97, 122, 119, 102, 45, 35, 78, 108, 112, 119, 35, 111, 106, 104, 102, 111, 122, 35, 109, 108, 119, 35, 98, 35, 87, 113, 98, 109, 112, 115, 108, 113, 119, 35, 80, 119, 113, 102, 98, 110, 45};
    }

    static {
        A0G();
        A0L = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.ja
            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final GX[] A5F() {
                return C2341jX.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1262Ga.A01(this, uri, map);
            }
        };
    }

    public C2341jX() {
        this(0);
    }

    public C2341jX(int i10) {
        this(1, i10, 112800);
    }

    public C2341jX(int i10, int i11, int i12) {
        this(i10, new C4R(0L), new C2363jt(i11), i12);
    }

    public C2341jX(int i10, C4R c4r, InterfaceC1367Kc interfaceC1367Kc, int i11) {
        this.A0H = (InterfaceC1367Kc) C3M.A01(interfaceC1367Kc);
        this.A0A = i11;
        this.A09 = i10;
        if (i10 == 1 || i10 == 2) {
            this.A0I = Collections.singletonList(c4r);
        } else {
            this.A0I = new ArrayList();
            this.A0I.add(c4r);
        }
        this.A0F = new C4J(new byte[9400], 0);
        this.A0C = new SparseBooleanArray();
        this.A0D = new SparseBooleanArray();
        this.A0B = new SparseArray<>();
        this.A0E = new SparseIntArray();
        this.A0G = new KY(i11);
        this.A03 = GY.A00;
        this.A01 = -1;
        A0F();
    }

    private int A00() throws C09222i {
        int iA09 = this.A0F.A09();
        int limit = this.A0F.A0A();
        int iA00 = AbstractC1371Kg.A00(this.A0F.A0l(), iA09, limit);
        this.A0F.A0f(iA00);
        int endOfPacket = iA00 + 188;
        if (endOfPacket > limit) {
            int i10 = this.A00;
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[6];
            int limit2 = str.charAt(22);
            int searchStart = str2.charAt(22);
            if (limit2 == searchStart) {
                throw new RuntimeException();
            }
            A0K[3] = "oFbhmyTyFkRbH7nwLSukkKpVMF9MBiPP";
            this.A00 = i10 + (iA00 - iA09);
            if (this.A09 == 2 && this.A00 > 376) {
                throw C09222i.A01(A0D(0, 58, 29), null);
            }
        } else {
            this.A00 = 0;
        }
        return endOfPacket;
    }

    public static /* synthetic */ int A02(C2341jX c2341jX) {
        int i10 = c2341jX.A02;
        c2341jX.A02 = i10 + 1;
        return i10;
    }

    private void A0F() {
        this.A0C.clear();
        this.A0B.clear();
        SparseArray<InterfaceC1370Kf> sparseArrayA5I = this.A0H.A5I();
        int size = sparseArrayA5I.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray<InterfaceC1370Kf> sparseArray = this.A0B;
            int initialPayloadReadersSize = A0K[7].charAt(31);
            if (initialPayloadReadersSize != 85) {
                throw new RuntimeException();
            }
            A0K[5] = "Ni66o4kKOCTyHVW4880FmErKiABvWzx3";
            int initialPayloadReadersSize2 = sparseArrayA5I.keyAt(i10);
            sparseArray.put(initialPayloadReadersSize2, sparseArrayA5I.valueAt(i10));
        }
        this.A0B.put(0, new C2347jd(new C2343jZ(this)));
        this.A05 = null;
    }

    private void A0H(long j10) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A0G.A08() != -9223372036854775807L) {
                this.A04 = new C2345jb(this.A0G.A09(), this.A0G.A08(), j10, this.A01, this.A0A);
                this.A03.AIN(this.A04.A07());
            } else {
                this.A03.AIN(new C2438lI(this.A0G.A08()));
            }
        }
    }

    private boolean A0I(int i10) {
        return this.A09 == 2 || this.A08 || !this.A0D.get(i10, false);
    }

    private boolean A0J(InterfaceC2443lN interfaceC2443lN) throws IOException {
        byte[] bArrA0l = this.A0F.A0l();
        if (9400 - this.A0F.A09() < 188) {
            int bytesLeft = this.A0F.A07();
            if (bytesLeft > 0) {
                System.arraycopy(bArrA0l, this.A0F.A09(), bArrA0l, 0, bytesLeft);
            }
            this.A0F.A0j(bArrA0l, bytesLeft);
        }
        while (this.A0F.A07() < 188) {
            int iA0A = this.A0F.A0A();
            int limit = interfaceC2443lN.read(bArrA0l, iA0A, 9400 - iA0A);
            if (limit == -1) {
                return false;
            }
            this.A0F.A0e(iA0A + limit);
        }
        return true;
    }

    public static /* synthetic */ GX[] A0M() {
        return new GX[]{new C2341jX()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A03 = gy;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        InterfaceC1370Kf payloadReader;
        int i10;
        long jA8G = interfaceC2443lN.A8G();
        if (this.A08) {
            if (((jA8G == -1 || this.A09 == 2) ? false : true) && !this.A0G.A0A()) {
                return this.A0G.A07(interfaceC2443lN, c1281Gt, this.A01);
            }
            A0H(jA8G);
            if (this.A07) {
                this.A07 = false;
                AIM(0L, 0L);
                if (interfaceC2443lN.A8f() != 0) {
                    c1281Gt.A00 = 0L;
                    return 1;
                }
            }
            C2345jb c2345jb = this.A04;
            if (A0K[3].charAt(3) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[0] = "sDiEMLnvjhOTPJNI7EdeGtcVnMMFmFVg";
            strArr[6] = "irXGtuFGajwAGmxrojJd4OjCXPAtU7cs";
            if (c2345jb != null && this.A04.A09()) {
                return this.A04.A06(interfaceC2443lN, c1281Gt);
            }
        }
        boolean zA0J = A0J(interfaceC2443lN);
        if (A0K[5].charAt(9) == '6') {
            throw new RuntimeException();
        }
        A0K[3] = "pbqhdVjd4r56PJWJm8ke7L1TPhAXhQlh";
        if (!zA0J) {
            return -1;
        }
        int iA00 = A00();
        int iA0A = this.A0F.A0A();
        if (iA00 > iA0A) {
            return 0;
        }
        int iA0C = this.A0F.A0C();
        if ((8388608 & iA0C) == 0) {
            int limit = 0 | ((4194304 & iA0C) != 0 ? 1 : 0);
            int packetHeaderFlags = (2096896 & iA0C) >> 8;
            int tsPacketHeader = (iA0C & 32) != 0 ? 1 : 0;
            if ((iA0C & 16) != 0) {
                payloadReader = this.A0B.get(packetHeaderFlags);
            } else {
                payloadReader = null;
            }
            if (payloadReader == null) {
                this.A0F.A0f(iA00);
                return 0;
            }
            if (this.A09 != 2) {
                int i11 = iA0C & 15;
                int i12 = this.A0E.get(packetHeaderFlags, i11 - 1);
                this.A0E.put(packetHeaderFlags, i11);
                if (i12 == i11) {
                    this.A0F.A0f(iA00);
                    return 0;
                }
                if (i11 != ((i12 + 1) & 15)) {
                    payloadReader.AIL();
                }
            }
            if (tsPacketHeader != 0) {
                int iA0I = this.A0F.A0I();
                if ((this.A0F.A0I() & 64) != 0) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                limit |= i10;
                this.A0F.A0g(iA0I - 1);
            }
            boolean z10 = this.A08;
            if (A0I(packetHeaderFlags)) {
                this.A0F.A0e(iA00);
                payloadReader.A53(this.A0F, limit);
                this.A0F.A0e(iA0A);
            }
            if (this.A09 != 2 && !z10 && this.A08 && jA8G != -1) {
                this.A07 = true;
            }
            this.A0F.A0f(iA00);
            return 0;
        }
        this.A0F.A0f(iA00);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        C3M.A08(this.A09 != 2);
        int size = this.A0I.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4R c4r = this.A0I.get(i10);
            boolean z10 = c4r.A04() == -9223372036854775807L;
            if (!z10) {
                long jA02 = c4r.A02();
                if (jA02 != -9223372036854775807L) {
                    String[] strArr = A0K;
                    if (strArr[0].charAt(22) == strArr[6].charAt(22)) {
                        throw new RuntimeException();
                    }
                    A0K[1] = "xsireMETvYUgN4sfQ27n1BF88Hpbgatm";
                    if (jA02 == 0 || jA02 == j11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                c4r.A07(j11);
            }
        }
        if (A0K[3].charAt(3) == 'h') {
            A0K[5] = "QQ4ASPHg1MFvfTvzRH6TwvvGrvMhPJon";
            if (j11 != 0 && this.A04 != null) {
                this.A04.A08(j11);
            }
            this.A0F.A0d(0);
            this.A0E.clear();
            for (int i11 = 0; i11 < this.A0B.size(); i11++) {
                this.A0B.valueAt(i11).AIL();
            }
            this.A00 = 0;
            if (A0K[5].charAt(9) != '6') {
                String[] strArr2 = A0K;
                strArr2[0] = "GowRIOwCagyGa1SkNIlwyA0nrp7kipic";
                strArr2[6] = "k5JpOZ1RkOAyzQMCpU3mmbngvjfdQ1X3";
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2443lN interfaceC2443lN) throws IOException {
        byte[] bArrA0l = this.A0F.A0l();
        interfaceC2443lN.AG9(bArrA0l, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            boolean isSyncBytePatternCorrect = true;
            for (int i11 = 0; i11 < 5; i11++) {
                int startPosCandidate = bArrA0l[(i11 * 188) + i10];
                if (startPosCandidate != 71) {
                    isSyncBytePatternCorrect = false;
                    break;
                }
            }
            if (isSyncBytePatternCorrect) {
                interfaceC2443lN.AJJ(i10);
                return true;
            }
        }
        return false;
    }
}
