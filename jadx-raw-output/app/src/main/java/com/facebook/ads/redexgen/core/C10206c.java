package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10206c {
    public static String[] A0B = {"ytES6GjYCCZeLRsctY", "", "JAF1Tg0UjyffIggj5BNMmxVlRkgdhjMr", "rlk3ZCySajOx3", "MCGN0v", "", "6TmcGiXQ57FFOBCo2j", "Z1k2a4cknNke6aCh8ssxRFJ66FmodiBm"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C6Y A04;
    public C6Y A05;
    public C6Y A06;
    public Object A07;
    public boolean A08;
    public final C2625oN A09 = new C2625oN();
    public final C2623oL A0A = new C2623oL();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2501mL A06(Timeline timeline, Object obj, long j10, long j11, C2625oN c2625oN) {
        timeline.A0J(obj, c2625oN);
        int iA08 = c2625oN.A08(j10);
        return iA08 == -1 ? new C2501mL(obj, j11) : new C2501mL(obj, iA08, c2625oN.A05(iA08), j11);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C6Z A0I(Timeline timeline, C6Z c6z) {
        long jA0A;
        long j10 = c6z.A01;
        boolean zA08 = A08(timeline, c6z.A04, j10);
        boolean zA09 = A09(timeline, c6z.A04, zA08);
        timeline.A0J(c6z.A04.A04, this.A09);
        if (c6z.A04.A00()) {
            jA0A = this.A09.A0E(c6z.A04.A00, c6z.A04.A01);
        } else {
            jA0A = j10 == Long.MIN_VALUE ? this.A09.A0A() : j10;
        }
        return new C6Z(c6z.A04, c6z.A03, j10, c6z.A02, jA0A, zA08, zA09);
    }

    private long A00(Timeline timeline, Object obj) {
        int oldFrontPeriodIndex;
        int holderWindowIndex = timeline.A0J(obj, this.A09).A00;
        if (this.A07 != null && (oldFrontPeriodIndex = timeline.A0A(this.A07)) != -1) {
            int windowIndex = timeline.A0H(oldFrontPeriodIndex, this.A09).A00;
            if (windowIndex == holderWindowIndex) {
                return this.A03;
            }
        }
        for (C6Y mediaPeriodHolder = A0D(); mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.A0I()) {
            if (mediaPeriodHolder.A08.equals(obj)) {
                return mediaPeriodHolder.A00.A04.A03;
            }
        }
        for (C6Y c6yA0D = A0D(); c6yA0D != null; c6yA0D = c6yA0D.A0I()) {
            int iA0A = timeline.A0A(c6yA0D.A08);
            if (iA0A != -1) {
                int windowIndex2 = timeline.A0H(iA0A, this.A09).A00;
                if (windowIndex2 == holderWindowIndex) {
                    return c6yA0D.A00.A04.A03;
                }
            }
        }
        long j10 = this.A02;
        this.A02 = 1 + j10;
        return j10;
    }

    private C6Z A01(Timeline timeline, C6Y c6y, long j10) {
        long jLongValue;
        C10206c c10206c = this;
        C6Z c6z = c6y.A00;
        if (c6z.A07) {
            int iA0A = timeline.A0A(c6z.A04.A04);
            C2625oN c2625oN = c10206c.A09;
            C2623oL c2623oL = c10206c.A0A;
            int currentPeriodIndex = c10206c.A01;
            int iA09 = timeline.A09(iA0A, c2625oN, c2623oL, currentPeriodIndex, c10206c.A08);
            if (iA09 == -1) {
                return null;
            }
            int i10 = timeline.A0I(iA09, c10206c.A09, true).A00;
            Object obj = c10206c.A09.A04;
            long j11 = c6z.A04.A03;
            if (timeline.A0K(i10, c10206c.A0A).A00 == iA09) {
                Pair<Object, Long> defaultPosition = timeline.A0F(c10206c.A0A, c10206c.A09, i10, -9223372036854775807L, Math.max(0L, (c6y.A0B() + c6z.A00) - j10));
                if (defaultPosition == null) {
                    return null;
                }
                obj = defaultPosition.first;
                jLongValue = ((Long) defaultPosition.second).longValue();
                C6Y c6yA0I = c6y.A0I();
                if (c6yA0I != null && c6yA0I.A08.equals(obj)) {
                    j11 = c6yA0I.A00.A04.A03;
                    c10206c = this;
                } else {
                    c10206c = this;
                    j11 = c10206c.A02;
                    long startPositionUs = 1 + j11;
                    String[] strArr = A0B;
                    if (strArr[6].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    A0B[0] = "5yy5YdDharfiXP";
                    c10206c.A02 = startPositionUs;
                }
            } else {
                jLongValue = 0;
            }
            return A02(timeline, A06(timeline, obj, jLongValue, j11, c10206c.A09), jLongValue, jLongValue);
        }
        C2501mL c2501mL = c6z.A04;
        timeline.A0J(c2501mL.A04, c10206c.A09);
        if (c2501mL.A00()) {
            int i11 = c2501mL.A00;
            int iA04 = c10206c.A09.A04(i11);
            if (iA04 != -1) {
                int iA06 = c10206c.A09.A06(i11, c2501mL.A01);
                if (iA06 < iA04) {
                    if (!c10206c.A09.A0I(i11, iA06)) {
                        return null;
                    }
                    return A03(timeline, c2501mL.A04, i11, iA06, c6z.A02, c2501mL.A03);
                }
                return A04(timeline, c2501mL.A04, c6z.A02, c2501mL.A03);
            }
            String[] strArr2 = A0B;
            if (strArr2[5].length() != strArr2[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0B;
            strArr3[5] = "";
            strArr3[1] = "";
            return null;
        }
        if (c6z.A01 != Long.MIN_VALUE) {
            int iA08 = c10206c.A09.A08(c6z.A01);
            if (iA08 == -1) {
                return A04(timeline, c2501mL.A04, c6z.A01, c2501mL.A03);
            }
            int iA05 = c10206c.A09.A05(iA08);
            if (!c10206c.A09.A0I(iA08, iA05)) {
                return null;
            }
            return A03(timeline, c2501mL.A04, iA08, iA05, c6z.A01, c2501mL.A03);
        }
        int iA03 = c10206c.A09.A03();
        if (iA03 == 0) {
            return null;
        }
        int i12 = iA03 - 1;
        if (A0B[7].charAt(7) == 'k') {
            A0B[0] = "u0JZC9rSowd61rcMlDOlOE";
            if (c10206c.A09.A0D(i12) != Long.MIN_VALUE) {
                return null;
            }
        } else if (c10206c.A09.A0D(i12) != Long.MIN_VALUE) {
            return null;
        }
        if (c10206c.A09.A0H(i12)) {
            return null;
        }
        int iA07 = c10206c.A09.A05(i12);
        if (!c10206c.A09.A0I(i12, iA07)) {
            return null;
        }
        return A03(timeline, c2501mL.A04, i12, iA07, c10206c.A09.A0A(), c2501mL.A03);
    }

    private C6Z A02(Timeline timeline, C2501mL c2501mL, long j10, long j11) {
        timeline.A0J(c2501mL.A04, this.A09);
        if (c2501mL.A00()) {
            if (!this.A09.A0I(c2501mL.A00, c2501mL.A01)) {
                return null;
            }
            return A03(timeline, c2501mL.A04, c2501mL.A00, c2501mL.A01, j10, c2501mL.A03);
        }
        return A04(timeline, c2501mL.A04, j11, c2501mL.A03);
    }

    private C6Z A03(Timeline timeline, Object obj, int i10, int i11, long startPositionUs, long j10) {
        long jA09;
        C2501mL c2501mL = new C2501mL(obj, i10, i11, j10);
        boolean zA08 = A08(timeline, c2501mL, Long.MIN_VALUE);
        boolean zA09 = A09(timeline, c2501mL, zA08);
        long jA0E = timeline.A0J(c2501mL.A04, this.A09).A0E(c2501mL.A00, c2501mL.A01);
        if (i11 == this.A09.A05(i10)) {
            C2625oN c2625oN = this.A09;
            if (A0B[0].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "btiW32P1CxlKUaykVb";
            strArr[4] = "aD0NnH";
            jA09 = c2625oN.A09();
        } else {
            jA09 = 0;
        }
        return new C6Z(c2501mL, jA09, Long.MIN_VALUE, startPositionUs, jA0E, zA08, zA09);
    }

    private C6Z A04(Timeline timeline, Object obj, long j10, long j11) {
        long jA0D;
        long jA0A;
        C2501mL c2501mL = new C2501mL(obj, j11);
        timeline.A0J(c2501mL.A04, this.A09);
        int iA07 = this.A09.A07(j10);
        if (iA07 == -1) {
            jA0D = Long.MIN_VALUE;
        } else {
            C2625oN c2625oN = this.A09;
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "hcjC8Oe5bspAHclLrN";
            strArr2[4] = "7U4c4Z";
            jA0D = c2625oN.A0D(iA07);
        }
        boolean isLastInTimeline = A08(timeline, c2501mL, jA0D);
        boolean zA09 = A09(timeline, c2501mL, isLastInTimeline);
        if (jA0D == Long.MIN_VALUE) {
            jA0A = this.A09.A0A();
        } else {
            jA0A = jA0D;
        }
        return new C6Z(c2501mL, j10, jA0D, -9223372036854775807L, jA0A, isLastInTimeline, zA09);
    }

    private C6Z A05(C10416x c10416x) {
        return A02(c10416x.A03, c10416x.A05, c10416x.A01, c10416x.A02);
    }

    private boolean A07(Timeline timeline) {
        C6Y nextMediaPeriodHolder = A0D();
        if (nextMediaPeriodHolder == null) {
            return true;
        }
        int iA0A = timeline.A0A(nextMediaPeriodHolder.A08);
        if (A0B[3].length() != 26) {
            A0B[0] = "XXauRi";
            while (true) {
                iA0A = timeline.A09(iA0A, this.A09, this.A0A, this.A01, this.A08);
                while (lastValidPeriodHolder != null && !nextMediaPeriodHolder.A00.A07) {
                    nextMediaPeriodHolder = nextMediaPeriodHolder.A0I();
                }
                C6Y c6yA0I = nextMediaPeriodHolder.A0I();
                if (iA0A == -1 || c6yA0I == null || timeline.A0A(c6yA0I.A08) != iA0A) {
                    boolean zA0S = A0S(nextMediaPeriodHolder);
                    String[] strArr = A0B;
                    if (strArr[5].length() != strArr[1].length()) {
                        nextMediaPeriodHolder.A00 = A0I(timeline, nextMediaPeriodHolder.A00);
                        if (!zA0S) {
                            return true;
                        }
                    } else {
                        String[] strArr2 = A0B;
                        strArr2[6] = "90zfs8gzmg4UDoZfId";
                        strArr2[4] = "a4jnrj";
                        nextMediaPeriodHolder.A00 = A0I(timeline, nextMediaPeriodHolder.A00);
                        if (!zA0S) {
                            return true;
                        }
                    }
                    return !A0N();
                }
                nextMediaPeriodHolder = c6yA0I;
                if (A0B[7].charAt(7) != 'k') {
                    break;
                }
                A0B[2] = "Cr1P4n0WQ70sIc2hdXVlmIoPdJb3W1mn";
            }
        }
        throw new RuntimeException();
    }

    private boolean A08(Timeline timeline, C2501mL c2501mL, long j10) {
        int adGroupCount = timeline.A0J(c2501mL.A04, this.A09).A03();
        if (adGroupCount == 0) {
            return true;
        }
        int i10 = adGroupCount - 1;
        boolean zA00 = c2501mL.A00();
        if (this.A09.A0D(i10) != Long.MIN_VALUE) {
            return !zA00 && j10 == Long.MIN_VALUE;
        }
        int lastAdGroupIndex = this.A09.A04(i10);
        if (lastAdGroupIndex == -1) {
            return false;
        }
        if (((zA00 && c2501mL.A00 == i10 && c2501mL.A01 == lastAdGroupIndex + (-1)) ? 1 : 0) == 0) {
            return !zA00 && this.A09.A05(i10) == lastAdGroupIndex;
        }
        return true;
    }

    private boolean A09(Timeline timeline, C2501mL c2501mL, boolean z10) {
        int iA0A = timeline.A0A(c2501mL.A04);
        return !timeline.A0K(timeline.A0H(iA0A, this.A09).A00, this.A0A).A0D && timeline.A0O(iA0A, this.A09, this.A0A, this.A01, this.A08) && z10;
    }

    private boolean A0A(C6Y c6y, C6Z c6z) {
        C6Z c6z2 = c6y.A00;
        return c6z2.A03 == c6z.A03 && c6z2.A01 == c6z.A01 && c6z2.A04.equals(c6z.A04);
    }

    public final C6Y A0B() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                C6Y c6y = this.A05;
                if (A0B[3].length() == 26) {
                    throw new RuntimeException();
                }
                A0B[2] = "cSlSOVjTMxyZvCYIIsIM7Z4RVriFSMIi";
                this.A06 = c6y.A0I();
            }
            this.A05.A0M();
            this.A05 = this.A05.A0I();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
            }
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        C6Y c6y2 = this.A05;
        if (A0B[0].length() != 8) {
            A0B[7] = "hdbErrckm1X5j4dXkt1ObCB8O8NcABpS";
            return c6y2;
        }
        A0B[3] = "prScRK6qkOjWt";
        return c6y2;
    }

    public final C6Y A0C() {
        C3M.A08((this.A06 == null || this.A06.A0I() == null) ? false : true);
        this.A06 = this.A06.A0I();
        return this.A06;
    }

    public final C6Y A0D() {
        return A0N() ? this.A05 : this.A04;
    }

    public final C6Y A0E() {
        return this.A04;
    }

    public final C6Y A0F() {
        return this.A05;
    }

    public final C6Y A0G() {
        return this.A06;
    }

    public final C6Z A0H(long j10, C10416x c10416x) {
        if (this.A04 == null) {
            return A05(c10416x);
        }
        return A01(c10416x.A03, this.A04, j10);
    }

    public final InterfaceC2502mM A0J(C7D[] c7dArr, long j10, EK ek2, EO eo2, CL cl2, C6Z c6z, EL el2) {
        long jA0B;
        if (this.A04 != null) {
            jA0B = this.A04.A0B() + this.A04.A00.A00;
        } else {
            jA0B = c6z.A03 + j10;
        }
        C6Y c6y = new C6Y(c7dArr, jA0B, ek2, eo2, cl2, c6z, el2);
        if (this.A04 != null) {
            C3M.A08(A0N());
            this.A04.A0Q(c6y);
        }
        this.A07 = null;
        this.A04 = c6y;
        this.A00++;
        return c6y.A07;
    }

    public final C2501mL A0K(Timeline timeline, Object obj, long j10) {
        return A06(timeline, obj, j10, A00(timeline, obj), this.A09);
    }

    public final void A0L(long j10) {
        if (this.A04 != null) {
            this.A04.A0P(j10);
        }
    }

    public final void A0M(boolean z10) {
        C6Y c6yA0D = A0D();
        if (c6yA0D != null) {
            this.A07 = z10 ? c6yA0D.A08 : null;
            this.A03 = c6yA0D.A00.A04.A03;
            c6yA0D.A0M();
            A0S(c6yA0D);
        } else if (!z10) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0N() {
        return this.A05 != null;
    }

    public final boolean A0O() {
        if (this.A04 != null) {
            if (!this.A04.A00.A05 && this.A04.A0R()) {
                long j10 = this.A04.A00.A00;
                if (A0B[2].charAt(6) == 'F') {
                    throw new RuntimeException();
                }
                A0B[3] = "WQJhcBpqvfFlde6mvMcdcISTeYvrM";
                if (j10 == -9223372036854775807L || this.A00 >= 100) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A0P(Timeline timeline, int i10) {
        this.A01 = i10;
        return A07(timeline);
    }

    public final boolean A0Q(Timeline timeline, C2501mL c2501mL, long j10) {
        int iA0A = timeline.A0A(c2501mL.A04);
        C6Y c6y = null;
        for (C6Y c6yA0D = A0D(); c6yA0D != null; c6yA0D = c6yA0D.A0I()) {
            if (c6y == null) {
                c6yA0D.A00 = A0I(timeline, c6yA0D.A00);
            } else {
                if (iA0A != -1) {
                    boolean zEquals = c6yA0D.A08.equals(timeline.A0M(iA0A));
                    if (A0B[3].length() == 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ytUDxXblB5dYuzkyb9";
                    strArr[4] = "n5GR8r";
                    if (zEquals) {
                        C6Z c6zA01 = A01(timeline, c6y, j10);
                        if (c6zA01 == null) {
                            return true ^ A0S(c6y);
                        }
                        c6yA0D.A00 = A0I(timeline, c6yA0D.A00);
                        if (!A0A(c6yA0D, c6zA01)) {
                            return true ^ A0S(c6y);
                        }
                    }
                }
                return true ^ A0S(c6y);
            }
            if (c6yA0D.A00.A07) {
                iA0A = timeline.A09(iA0A, this.A09, this.A0A, this.A01, this.A08);
            }
            c6y = c6yA0D;
        }
        return true;
    }

    public final boolean A0R(Timeline timeline, boolean z10) {
        this.A08 = z10;
        return A07(timeline);
    }

    public final boolean A0S(C6Y c6y) {
        C3M.A08(c6y != null);
        boolean z10 = false;
        this.A04 = c6y;
        while (c6y.A0I() != null) {
            c6y = c6y.A0I();
            if (c6y == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c6y.A0M();
            this.A00--;
        }
        this.A04.A0Q(null);
        return z10;
    }

    public final boolean A0T(InterfaceC2502mM interfaceC2502mM) {
        return this.A04 != null && this.A04.A07 == interfaceC2502mM;
    }
}
