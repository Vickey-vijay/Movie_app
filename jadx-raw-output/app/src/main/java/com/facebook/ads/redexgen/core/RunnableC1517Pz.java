package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC1517Pz implements Runnable {
    public static Comparator<C1516Py> A04;
    public static byte[] A05;
    public static String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final ThreadLocal<RunnableC1517Pz> A07;
    public long A00;
    public long A01;
    public ArrayList<C10246g> A02 = new ArrayList<>();
    public ArrayList<C1516Py> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, 27, 117, 94, 72, 79, 94, 95, 27, 107, 73, 94, 93, 94, 79, 88, 83, 100, 96, 22, 102, 68, 83, 80, 83, 66, 85, 94};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new C1515Px();
    }

    private AbstractC1524Qg A00(C10246g c10246g, int i10, long j10) {
        if (A08(c10246g, i10)) {
            return null;
        }
        QW qw = c10246g.A0r;
        try {
            c10246g.A1M();
            AbstractC1524Qg abstractC1524QgA0I = qw.A0I(i10, false, j10);
            if (abstractC1524QgA0I != null) {
                if (abstractC1524QgA0I.A0e() && !abstractC1524QgA0I.A0f()) {
                    qw.A0T(abstractC1524QgA0I.A0H);
                } else {
                    qw.A0Z(abstractC1524QgA0I, false);
                }
            }
            return abstractC1524QgA0I;
        } finally {
            c10246g.A1o(false);
        }
    }

    private void A02() {
        C1516Py c1516Py;
        int size = this.A02.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C10246g c10246g = this.A02.get(i11);
            int viewCount = c10246g.getWindowVisibility();
            if (viewCount == 0) {
                c10246g.A02.A04(c10246g, false);
                int viewCount2 = c10246g.A02.A00;
                i10 += viewCount2;
            }
        }
        this.A03.ensureCapacity(i10);
        int j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C10246g c10246g2 = this.A02.get(i12);
            int viewCount3 = c10246g2.getWindowVisibility();
            if (viewCount3 == 0) {
                C2158gJ c2158gJ = c10246g2.A02;
                int viewCount4 = c2158gJ.A01;
                int i13 = Math.abs(viewCount4);
                int viewCount5 = c2158gJ.A02;
                int i14 = i13 + Math.abs(viewCount5);
                for (int i15 = 0; i15 < viewCount * 2; i15 += 2) {
                    int viewCount6 = this.A03.size();
                    if (j10 >= viewCount6) {
                        c1516Py = new C1516Py();
                        this.A03.add(c1516Py);
                    } else {
                        c1516Py = this.A03.get(j10);
                    }
                    int totalTaskCount = i15 + 1;
                    int totalTaskIndex = c2158gJ.A03[totalTaskCount];
                    c1516Py.A04 = totalTaskIndex <= i14;
                    c1516Py.A02 = i14;
                    c1516Py.A00 = totalTaskIndex;
                    c1516Py.A03 = c10246g2;
                    int totalTaskCount2 = c2158gJ.A03[i15];
                    c1516Py.A01 = totalTaskCount2;
                    j10++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j10) {
        for (int i10 = 0; i10 < i; i10++) {
            C1516Py c1516Py = this.A03.get(i10);
            if (A06[7].charAt(15) != 'g') {
                throw new RuntimeException();
            }
            A06[6] = "gpZ2KV2";
            C1516Py c1516Py2 = c1516Py;
            if (c1516Py2.A03 == null) {
                return;
            }
            A06(c1516Py2, j10);
            c1516Py2.A00();
        }
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(C1516Py c1516Py, long j10) {
        AbstractC1524Qg abstractC1524QgA00 = A00(c1516Py.A03, c1516Py.A01, c1516Py.A04 ? Long.MAX_VALUE : j10);
        if (abstractC1524QgA00 != null && abstractC1524QgA00.A09 != null && abstractC1524QgA00.A0e() && !abstractC1524QgA00.A0f()) {
            C10246g c10246g = abstractC1524QgA00.A09.get();
            if (A06[3].charAt(4) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
            strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
            A07(c10246g, j10);
        }
    }

    private void A07(C10246g c10246g, long j10) {
        if (c10246g == null) {
            return;
        }
        if (c10246g.A0C && c10246g.A01.A06() != 0) {
            c10246g.A1P();
        }
        C2158gJ c2158gJ = c10246g.A02;
        c2158gJ.A04(c10246g, true);
        if (c2158gJ.A00 != 0) {
            try {
                OQ.A01(A01(0, 18, 83));
                c10246g.A0s.A05(c10246g.A04);
                for (int i10 = 0; i10 < c2158gJ.A00 * 2; i10 += 2) {
                    A00(c10246g, c2158gJ.A03[i10], j10);
                }
                OQ.A00();
            } catch (Throwable th2) {
                OQ.A00();
                throw th2;
            }
        }
    }

    public static boolean A08(C10246g c10246g, int i10) {
        int iA06 = c10246g.A01.A06();
        for (int i11 = 0; i11 < iA06; i11++) {
            AbstractC1524Qg abstractC1524QgA0F = C10246g.A0F(c10246g.A01.A0A(i11));
            int childCount = abstractC1524QgA0F.A03;
            if (childCount == i10 && !abstractC1524QgA0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C10246g c10246g) {
        this.A02.add(c10246g);
    }

    public final void A0A(C10246g c10246g) {
        this.A02.remove(c10246g);
    }

    public final void A0B(C10246g c10246g, int i10, int i11) {
        if (c10246g.isAttachedToWindow()) {
            long j10 = this.A01;
            String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j10 == 0) {
                this.A01 = c10246g.getNanoTime();
                c10246g.post(this);
            }
        }
        c10246g.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            OQ.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                OQ.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C10246g c10246g = this.A02.get(i10);
                if (c10246g.getWindowVisibility() == 0) {
                    jMax = Math.max(c10246g.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                OQ.A00();
            } else {
                A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
                this.A01 = 0L;
                OQ.A00();
            }
        } catch (Throwable th2) {
            this.A01 = 0L;
            OQ.A00();
            throw th2;
        }
    }
}
