package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10577n implements InterfaceC2416kk {
    public static byte[] A06;
    public static String[] A07 = {"QubeI9WU03qBZcNvE4IUkWvlw0NRrBK6", "F1d068LLA73yClDAGmhas6o", "9YpbVeLOd0f6m", "7Ycu3nAZXESMUbUrutcG9271koISuOhT", "QjcyZL4t35rbWMpE5hp6oYgD7sVhkS0D", "M48I8dHdEQTg0rHaHaNT6qI1", "cVfJzOsNywAlxLknvQSr1dDTMZn5TIAU", "kJeh17rnzHgOQ2HfO7oDpw4wPPnH7lFe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C10577n A01(long j10, long j11, C1273Gl c1273Gl, C4J c4j) {
        int iA0L;
        int i10 = c1273Gl.A04;
        int i11 = c1273Gl.A03;
        int iA0C = c4j.A0C();
        if ((iA0C & 1) != 1 || (iA0L = c4j.A0L()) == 0) {
            return null;
        }
        long jA0U = AbstractC09664a.A0U(iA0L, ((long) i10) * 1000000, i11);
        if ((iA0C & 6) != 6) {
            return new C10577n(j11, c1273Gl.A02, jA0U);
        }
        long jA0Q = c4j.A0Q();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c4j.A0I();
        }
        if (j10 != -1 && j10 != j11 + jA0Q) {
            AnonymousClass44.A07(A02(27, 10, 78), A02(2, 25, 105) + j10 + A02(0, 2, 40) + (j11 + jA0Q));
        }
        return new C10577n(j11, c1273Gl.A02, jA0U, jA0Q, jArr);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[2] = "La6";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 30);
            i13++;
        }
    }

    public static void A03() {
        A06 = new byte[]{114, 102, -33, -48, -43, -50, -89, -21, -24, -5, -24, -89, -6, -16, 1, -20, -89, -12, -16, -6, -12, -24, -5, -22, -17, -63, -89, -60, -43, -38, -45, -65, -47, -47, -41, -47, -34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1284Gw
    public final C1283Gv A8t(long j10) {
        double d10;
        if (!AAa()) {
            return new C1283Gv(new C1285Gx(0L, this.A03 + ((long) this.A00)));
        }
        long jA0T = AbstractC09664a.A0T(j10, 0L, this.A04);
        double d11 = (jA0T * 100.0d) / this.A04;
        if (d11 <= 0.0d) {
            d10 = 0.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = (long[]) C3M.A02(this.A05);
            double d12 = jArr[i10];
            d10 = (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d11 - ((double) i10))) + d12;
        }
        return new C1283Gv(new C1285Gx(jA0T, this.A03 + AbstractC09664a.A0T(Math.round((d10 / 256.0d) * this.A02), this.A00, this.A02 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2416kk
    public final long A99(long j10) {
        long j11 = j10 - this.A03;
        if (!AAa() || j11 <= this.A00) {
            return 0L;
        }
        long[] jArr = (long[]) C3M.A02(this.A05);
        double d10 = (j11 * 256.0d) / this.A02;
        int iA0L = AbstractC09664a.A0L(jArr, (long) d10, true, true);
        long jA00 = A00(iA0L);
        long j12 = jArr[iA0L];
        long jA01 = A00(iA0L + 1);
        long j13 = iA0L == 99 ? 256L : jArr[iA0L + 1];
        String[] strArr = A07;
        if (strArr[0].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A07[6] = "PlWtaQzxKmV3LAe12cSeUsJTirSwbfkK";
        return Math.round((jA01 - jA00) * (j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12))) + jA00;
    }

    static {
        A03();
    }

    public C10577n(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public C10577n(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A03 = j10;
        this.A00 = i10;
        this.A04 = j11;
        this.A05 = jArr;
        this.A02 = j12;
        this.A01 = j12 != -1 ? j10 + j12 : -1L;
    }

    private long A00(int i10) {
        return (this.A04 * ((long) i10)) / 100;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2416kk
    public final long A7b() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1284Gw
    public final long A7l() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1284Gw
    public final boolean AAa() {
        return this.A05 != null;
    }
}
