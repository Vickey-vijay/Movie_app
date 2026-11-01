package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2494mE implements H1 {
    public static byte[] A0Y;
    public static String[] A0Z = {"85R60pw", "bhfqNyhgsMMcgxDZV18ZYvPWnAETveJ8", "tBTQ49uE8lCvjdowyQOxeOaVlddkkQsD", "cRYvTCVhA9B6pxggP4HMUODB0FrVm2He", "qWsUB7mYWdY8z", "PljQg4leV4XdGi9pMhsrxdm25IT3iHNc", "UH2NGYtrpmiPe", "fmnhpkR"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A08;

    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public Uri A0A;
    public C2654or A0B;
    public C2654or A0C;
    public C2654or A0D;
    public C9G A0E;
    public InterfaceC1171Cn A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final C9P A0T;
    public final C9U A0U;
    public final C1167Cj A0V;
    public final C1169Cl A0W = new C1169Cl();
    public int A01 = 1000;
    public int[] A0P = new int[this.A01];
    public long[] A0Q = new long[this.A01];
    public long[] A0R = new long[this.A01];
    public int[] A0N = new int[this.A01];
    public int[] A0O = new int[this.A01];
    public C1287Gz[] A0S = new C1287Gz[this.A01];
    public final D2<C1170Cm> A0X = new D2<>(new C3X() { // from class: com.facebook.ads.redexgen.X.mF
        @Override // com.facebook.ads.redexgen.core.C3X
        public final void A31(Object obj) {
            ((C1170Cm) obj).A01.AGr();
        }
    });
    public long A09 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A0L = true;
    public boolean A0M = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized int A03(C6N c6n, C2576nY c2576nY, boolean z10, boolean z11, C1169Cl c1169Cl) {
        c2576nY.A04 = false;
        if (!A0K()) {
            if (!z11 && !this.A0G) {
                if (this.A0D == null || (!z10 && this.A0D == this.A0B)) {
                    return -3;
                }
                A0H((C2654or) C3M.A01(this.A0D), c6n);
                return -5;
            }
            c2576nY.A02(4);
            return -4;
        }
        C2654or c2654or = this.A0X.A01(A0O()).A00;
        if (z10 || c2654or != this.A0B) {
            A0H(c2654or, c6n);
            return -5;
        }
        int iA00 = A00(this.A03);
        if (!A0L(iA00)) {
            c2576nY.A04 = true;
            return -3;
        }
        c2576nY.A02(this.A0N[iA00]);
        c2576nY.A01 = this.A0R[iA00];
        if (c2576nY.A01 < this.A09) {
            c2576nY.A00(Integer.MIN_VALUE);
        }
        c1169Cl.A00 = this.A0O[iA00];
        c1169Cl.A01 = this.A0Q[iA00];
        c1169Cl.A02 = this.A0S[iA00];
        return -4;
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Y, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0Y = new byte[]{35, 74, 57, 70, 70, 61, 56, 61, 66, 59, -12, 73, 66, 57, 76, 68, 57, 55, 72, 57, 56, -12, 66, 67, 66, 1, 71, 77, 66, 55, -12, 71, 53, 65, 68, 64, 57, -12, 58, 67, 70, -12, 58, 67, 70, 65, 53, 72, 14, -12, -62, -48, -36, -33, -37, -44, -64, -28, -44, -28, -44};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0G(long j10, int i10, long j11, int i11, C1287Gz c1287Gz) {
        if (this.A02 > 0) {
            int iA00 = A00(this.A02 - 1);
            C3M.A07(this.A0Q[iA00] + ((long) this.A0O[iA00]) <= j11);
        }
        this.A0G = (536870912 & i10) != 0;
        this.A07 = Math.max(this.A07, j10);
        int iA01 = A00(this.A02);
        this.A0R[iA01] = j10;
        this.A0Q[iA01] = j11;
        this.A0O[iA01] = i11;
        this.A0N[iA01] = i10;
        this.A0S[iA01] = c1287Gz;
        this.A0P[iA01] = this.A05;
        if (this.A0X.A06() || !this.A0X.A00().A00.equals(this.A0D)) {
            this.A0X.A05(A0P(), new C1170Cm((C2654or) C3M.A01(this.A0D), this.A0U != null ? this.A0U.AGJ(this.A0T, this.A0D) : C9T.A00));
        }
        this.A02++;
        if (this.A02 == this.A01) {
            int i12 = this.A01 + 1000;
            int[] iArr = new int[i12];
            long[] jArr = new long[i12];
            long[] jArr2 = new long[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            C1287Gz[] c1287GzArr = new C1287Gz[i12];
            int i13 = this.A01 - this.A04;
            System.arraycopy(this.A0Q, this.A04, jArr, 0, i13);
            System.arraycopy(this.A0R, this.A04, jArr2, 0, i13);
            System.arraycopy(this.A0N, this.A04, iArr2, 0, i13);
            System.arraycopy(this.A0O, this.A04, iArr3, 0, i13);
            System.arraycopy(this.A0S, this.A04, c1287GzArr, 0, i13);
            System.arraycopy(this.A0P, this.A04, iArr, 0, i13);
            int i14 = this.A04;
            System.arraycopy(this.A0Q, 0, jArr, i13, i14);
            System.arraycopy(this.A0R, 0, jArr2, i13, i14);
            System.arraycopy(this.A0N, 0, iArr2, i13, i14);
            System.arraycopy(this.A0O, 0, iArr3, i13, i14);
            System.arraycopy(this.A0S, 0, c1287GzArr, i13, i14);
            System.arraycopy(this.A0P, 0, iArr, i13, i14);
            this.A0Q = jArr;
            this.A0R = jArr2;
            this.A0N = iArr2;
            this.A0O = iArr3;
            this.A0S = c1287GzArr;
            this.A0P = iArr;
            this.A04 = 0;
            this.A01 = i12;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized long A0S() {
        return this.A02 == 0 ? Long.MIN_VALUE : this.A0R[this.A04];
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ int AI5(AnonymousClass20 anonymousClass20, int i10, boolean z10) {
        return AbstractC1286Gy.A00(this, anonymousClass20, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ void AI7(C4J c4j, int i10) {
        AbstractC1286Gy.A01(this, c4j, i10);
    }

    static {
        A0E();
    }

    public C2494mE(EO eo2, C9U c9u, C9P c9p) {
        this.A0U = c9u;
        this.A0T = c9p;
        this.A0V = new C1167Cj(eo2);
    }

    private int A00(int i10) {
        int i11 = this.A04 + i10;
        int relativeIndex = this.A01;
        if (i11 < relativeIndex) {
            return i11;
        }
        int relativeIndex2 = this.A01;
        return i11 - relativeIndex2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001f A[EDGE_INSN: B:18:0x001f->B:11:0x001f BREAK  A[LOOP:0: B:3:0x0002->B:15:0x0027], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    private int A01(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11 && this.A0R[i10] <= j10; i13++) {
            if (z10) {
                int sampleCountToTarget = this.A0N[i10];
                if ((sampleCountToTarget & 1) != 0) {
                    i12 = i13;
                    if (this.A0R[i10] == j10) {
                        break;
                    }
                }
            } else {
                i12 = i13;
                if (this.A0R[i10] == j10) {
                    break;
                    break;
                }
            }
            i10++;
            int sampleCountToTarget2 = this.A01;
            if (i10 == sampleCountToTarget2) {
                i10 = 0;
            }
        }
        return i12;
    }

    private int A02(long j10) {
        int i10 = this.A02;
        int count = this.A02;
        int iA00 = A00(count - 1);
        while (i10 > count && this.A0R[iA00] >= j10) {
            i10--;
            iA00--;
            if (iA00 == -1) {
                int i11 = this.A01;
                String[] strArr = A0Z;
                String str = strArr[5];
                String str2 = strArr[2];
                int relativeSampleIndex = str.charAt(3);
                int count2 = str2.charAt(3);
                if (relativeSampleIndex != count2) {
                    throw new RuntimeException();
                }
                A0Z[1] = "AmG8zl9kQR5zaFQB0ENdPerRnzM6g9Ua";
                iA00 = i11 - 1;
            }
        }
        return i10;
    }

    private synchronized long A04() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A06(this.A02);
    }

    private final synchronized long A05() {
        return Math.max(this.A06, A08(this.A03));
    }

    private long A06(int i10) {
        this.A06 = Math.max(this.A06, A08(i10));
        this.A02 -= i10;
        this.A00 += i10;
        this.A04 += i10;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i10;
        if (this.A03 < 0) {
            this.A03 = 0;
        }
        this.A0X.A04(this.A00);
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i11 = relativeLastDiscardIndex - 1;
            long j10 = this.A0Q[i11];
            int relativeLastDiscardIndex2 = this.A0O[i11];
            return j10 + ((long) relativeLastDiscardIndex2);
        }
        return this.A0Q[this.A04];
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    private long A07(int i10) {
        boolean z10;
        int iA0P = A0P() - i10;
        boolean z11 = false;
        if (iA0P >= 0) {
            int i11 = this.A02;
            int discardCount = this.A03;
            if (iA0P <= i11 - discardCount) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        C3M.A07(z10);
        int discardCount2 = this.A02;
        this.A02 = discardCount2 - iA0P;
        long j10 = this.A06;
        int discardCount3 = this.A02;
        this.A07 = Math.max(j10, A08(discardCount3));
        if (iA0P == 0) {
            boolean z12 = this.A0G;
            String[] strArr = A0Z;
            String str = strArr[0];
            String str2 = strArr[7];
            int length = str.length();
            int discardCount4 = str2.length();
            if (length != discardCount4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[4] = "9q2py6RZjKVKU";
            strArr2[6] = "N5i42TN5jvK54";
            if (z12) {
                z11 = true;
            }
        }
        this.A0G = z11;
        this.A0X.A03(i10);
        int discardCount5 = this.A02;
        if (discardCount5 != 0) {
            int discardCount6 = this.A02;
            int relativeLastWriteIndex = A00(discardCount6 - 1);
            long j11 = this.A0Q[relativeLastWriteIndex];
            int discardCount7 = this.A0O[relativeLastWriteIndex];
            return j11 + ((long) discardCount7);
        }
        return 0L;
    }

    private long A08(int i10) {
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        long jMax = Long.MIN_VALUE;
        int iA00 = A00(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.A0R[iA00]);
            int i12 = this.A0N[iA00];
            if ((i12 & 1) != 0) {
                break;
            }
            iA00--;
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
            }
        }
        return jMax;
    }

    private synchronized long A09(long j10, boolean z10, boolean z11) {
        if (this.A02 != 0 && j10 >= this.A0R[this.A04]) {
            int iA01 = A01(this.A04, (!z11 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j10, z10);
            if (iA01 == -1) {
                return -1L;
            }
            return A06(iA01);
        }
        return -1L;
    }

    private final C2654or A0A(C2654or c2654or) {
        if (this.A08 != 0 && c2654or.A0M != Long.MAX_VALUE) {
            return c2654or.A07().A0s(c2654or.A0M + this.A08).A14();
        }
        return c2654or;
    }

    public static C2494mE A0B(EO eo2, C9U c9u, C9P c9p) {
        return new C2494mE(eo2, (C9U) C3M.A01(c9u), (C9P) C3M.A01(c9p));
    }

    private void A0D() {
        if (this.A0E != null) {
            this.A0E.AGs(this.A0T);
            this.A0E = null;
            this.A0B = null;
        }
    }

    private synchronized void A0F() {
        this.A03 = 0;
        this.A0V.A0B();
    }

    private void A0H(C2654or c2654or, C6N c6n) {
        C2654or c2654orA08;
        boolean z10 = this.A0B == null;
        DrmInitData newDrmInitData = z10 ? null : this.A0B.A0O;
        this.A0B = c2654or;
        DrmInitData oldDrmInitData = c2654or.A0O;
        if (this.A0U != null) {
            c2654orA08 = c2654or.A08(this.A0U.A7O(c2654or));
        } else {
            c2654orA08 = c2654or;
        }
        c6n.A00 = c2654orA08;
        c6n.A01 = this.A0E;
        if (this.A0U == null) {
            return;
        }
        if (!z10) {
            boolean zA1E = AbstractC09664a.A1E(newDrmInitData, oldDrmInitData);
            String[] strArr = A0Z;
            if (strArr[5].charAt(3) != strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[5] = "kvzQNhfSOapIkFZHH0bucpMR2mlOE4Ro";
            strArr2[2] = "pNWQqJuQrvmashmvXYzFnQ0x9nljUjVN";
            if (zA1E) {
                return;
            }
        }
        if (Looper.myLooper() == null) {
            return;
        }
        C9G c9g = this.A0E;
        this.A0E = this.A0U.A34(this.A0T, c2654or);
        c6n.A01 = this.A0E;
        if (c9g != null) {
            c9g.AGs(this.A0T);
        }
    }

    private final void A0J(boolean z10) {
        this.A0V.A0A();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0M = true;
        this.A09 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A0G = false;
        this.A0X.A02();
        if (z10) {
            this.A0C = null;
            this.A0D = null;
            this.A0L = true;
        }
    }

    private boolean A0K() {
        return this.A03 != this.A02;
    }

    private boolean A0L(int i10) {
        return this.A0E == null || this.A0E.A92() == 4 || ((this.A0N[i10] & 1073741824) == 0 && this.A0E.AGH());
    }

    private synchronized boolean A0M(long j10) {
        boolean z10 = true;
        if (this.A02 == 0) {
            if (j10 <= this.A06) {
                z10 = false;
            }
            return z10;
        }
        if (A05() >= j10) {
            return false;
        }
        int iA02 = A02(j10);
        int retainCount = this.A00;
        A07(retainCount + iA02);
        return true;
    }

    private synchronized boolean A0N(C2654or c2654or) {
        this.A0L = false;
        if (AbstractC09664a.A1E(c2654or, this.A0D)) {
            return false;
        }
        if (!this.A0X.A06() && this.A0X.A00().A00.equals(c2654or)) {
            this.A0D = this.A0X.A00().A00;
        } else {
            this.A0D = c2654or;
        }
        this.A0J = AbstractC09212h.A0G(this.A0D.A0W, this.A0D.A0R);
        this.A0H = false;
        return true;
    }

    public final int A0O() {
        return this.A00 + this.A03;
    }

    public final int A0P() {
        return this.A00 + this.A02;
    }

    public final synchronized int A0Q(long j10, boolean z10) {
        int iA00 = A00(this.A03);
        if (A0K() && j10 >= this.A0R[iA00]) {
            if (j10 > this.A07 && z10) {
                int i10 = this.A02;
                int relativeReadIndex = this.A03;
                return i10 - relativeReadIndex;
            }
            int i11 = this.A02;
            int relativeReadIndex2 = this.A03;
            int offset = A01(iA00, i11 - relativeReadIndex2, j10, true);
            if (offset == -1) {
                return 0;
            }
            return offset;
        }
        return 0;
    }

    public final int A0R(C6N c6n, C2576nY c2576nY, int i10, boolean z10) {
        int iA03 = A03(c6n, c2576nY, (i10 & 2) != 0, z10, this.A0W);
        if (iA03 == -4 && !c2576nY.A05()) {
            int result = i10 & 1;
            boolean z11 = result != 0;
            int result2 = i10 & 4;
            if (result2 == 0) {
                if (z11) {
                    this.A0V.A0E(c2576nY, this.A0W);
                } else {
                    this.A0V.A0F(c2576nY, this.A0W);
                }
            }
            if (!z11) {
                int result3 = this.A03;
                this.A03 = result3 + 1;
            }
        }
        return iA03;
    }

    public final synchronized long A0T() {
        return this.A07;
    }

    public final synchronized C2654or A0U() {
        return this.A0L ? null : this.A0D;
    }

    public final void A0V() {
        this.A0V.A0C(A04());
    }

    public final void A0W() throws IOException {
        if (this.A0E == null || this.A0E.A92() != 1) {
        } else {
            throw ((C9E) C3M.A01(this.A0E.A7s()));
        }
    }

    public final void A0X() {
        A0V();
        A0D();
    }

    public final void A0Y() {
        A0J(true);
        A0D();
    }

    public final void A0Z() {
        A0J(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public final synchronized void A0a(int i10) {
        boolean z10;
        if (i10 >= 0) {
            if (this.A03 + i10 <= this.A02) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3M.A07(z10);
            this.A03 += i10;
        } else {
            z10 = false;
            C3M.A07(z10);
            this.A03 += i10;
        }
        throw th;
    }

    public final void A0b(long j10) {
        this.A09 = j10;
    }

    public final void A0c(long j10, boolean z10, boolean z11) {
        this.A0V.A0C(A09(j10, z10, z11));
    }

    public final void A0d(InterfaceC1171Cn interfaceC1171Cn) {
        this.A0F = interfaceC1171Cn;
    }

    public final synchronized boolean A0e() {
        return this.A0G;
    }

    public final synchronized boolean A0f(long j10, boolean z10) {
        A0F();
        int iA00 = A00(this.A03);
        if (!A0K() || j10 < this.A0R[iA00] || (j10 > this.A07 && !z10)) {
            return false;
        }
        int i10 = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(iA00, i10 - relativeReadIndex, j10, true);
        if (offset == -1) {
            return false;
        }
        this.A09 = j10;
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return true;
    }

    public final synchronized boolean A0g(boolean z10) {
        boolean z11 = true;
        if (!A0K()) {
            if (!z10 && !this.A0G && (this.A0D == null || this.A0D == this.A0B)) {
                z11 = false;
            }
            return z11;
        }
        if (this.A0X.A01(A0O()).A00 != this.A0B) {
            return true;
        }
        return A0L(A00(this.A03));
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void A6W(C2654or c2654or) {
        C2654or c2654orA0A = A0A(c2654or);
        this.A0K = false;
        this.A0C = c2654or;
        boolean upstreamFormatChanged = A0N(c2654orA0A);
        if (this.A0F != null && upstreamFormatChanged) {
            this.A0F.AFb(c2654orA0A);
        }
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final int AI6(AnonymousClass20 anonymousClass20, int i10, boolean z10, int i11) throws IOException {
        return this.A0V.A08(anonymousClass20, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AI8(C4J c4j, int i10, int i11) {
        this.A0V.A0D(c4j, i10);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    @Override // com.facebook.ads.redexgen.core.H1
    public final void AIA(long j10, int i10, int i11, int flags, C1287Gz c1287Gz) {
        long jA09;
        int i12 = i10;
        if (this.A0K) {
            A6W((C2654or) C3M.A02(this.A0C));
        }
        boolean z10 = (i12 & 1) != 0;
        if (this.A0M) {
            if (!z10) {
                return;
            } else {
                this.A0M = false;
            }
        }
        long j11 = j10 + this.A08;
        if (this.A0J) {
            if (j11 < this.A09) {
                return;
            }
            if ((i12 & 1) == 0) {
                if (!this.A0H) {
                    AnonymousClass44.A07(A0C(50, 11, 13), A0C(0, 50, 114) + this.A0D);
                    this.A0H = true;
                }
                i12 |= 1;
            }
        }
        if (this.A0I) {
            if (!z10) {
                return;
            }
            boolean zA0M = A0M(j11);
            String[] strArr = A0Z;
            String str = strArr[0];
            String str2 = strArr[7];
            int length = str.length();
            int flags2 = str2.length();
            if (length == flags2) {
                A0Z[3] = "Q9ljdKDjpshc47nqlMYBFO0YDotnOqX8";
                if (!zA0M) {
                    return;
                }
                this.A0I = false;
                jA09 = this.A0V.A09();
                if (A0Z[1].charAt(24) == 'n') {
                    A0Z[3] = "281h4YOhy96mUgaRFHojQOWi7hgLUzVm";
                    A0G(j11, i12, (jA09 - ((long) i11)) - ((long) flags), i11, c1287Gz);
                    return;
                }
            }
        } else {
            jA09 = this.A0V.A09();
            if (A0Z[1].charAt(24) == 'n') {
                A0Z[3] = "281h4YOhy96mUgaRFHojQOWi7hgLUzVm";
                A0G(j11, i12, (jA09 - ((long) i11)) - ((long) flags), i11, c1287Gz);
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.H1
    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public final void AJu(Uri uri) {
        this.A0A = uri;
    }
}
