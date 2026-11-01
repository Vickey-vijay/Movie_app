package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M4 {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C2302is A00;
    public final int A01;
    public final String A02;
    public final ArrayList<M3> A03;
    public final TreeSet<C2300iq> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public M4(int i10, String str) {
        this(i10, str, C2302is.A03);
    }

    public M4(int i10, String str, C2302is c2302is) {
        this.A01 = i10;
        this.A02 = str;
        this.A00 = c2302is;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j10, long j11) {
        boolean z10 = true;
        C3M.A07(j10 >= 0);
        if (j11 < 0) {
            z10 = false;
        }
        C3M.A07(z10);
        C2300iq c2300iqA04 = A04(j10, j11);
        if (c2300iqA04.A03()) {
            return -Math.min(c2300iqA04.A04() ? Long.MAX_VALUE : c2300iqA04.A01, j11);
        }
        long j12 = j10 + j11;
        if (j12 < 0) {
            j12 = Long.MAX_VALUE;
        }
        long currentEndPosition = c2300iqA04.A02 + c2300iqA04.A01;
        if (currentEndPosition < j12) {
            TreeSet<C2300iq> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C2300iq c2300iq : treeSet.tailSet(c2300iqA04, false)) {
                if (c2300iq.A02 > currentEndPosition) {
                    break;
                }
                long j13 = c2300iq.A02;
                long queryEndPosition = c2300iq.A01;
                currentEndPosition = Math.max(currentEndPosition, j13 + queryEndPosition);
                if (currentEndPosition >= j12) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j10, j11);
    }

    public final C2302is A03() {
        return this.A00;
    }

    public final C2300iq A04(long j10, long j11) {
        C2300iq c2300iqA03 = C2300iq.A03(this.A02, j10);
        C2300iq c2300iqFloor = this.A04.floor(c2300iqA03);
        if (c2300iqFloor != null && c2300iqFloor.A02 + c2300iqFloor.A01 > j10) {
            return c2300iqFloor;
        }
        C2300iq lookupSpan = this.A04.ceiling(c2300iqA03);
        if (lookupSpan != null) {
            long jMin = lookupSpan.A02 - j10;
            if (j11 != -1) {
                jMin = Math.min(jMin, j11);
            }
            j11 = jMin;
        }
        return C2300iq.A04(this.A02, j10, j11);
    }

    public final C2300iq A05(C2300iq c2300iq, long j10, boolean z10) {
        C3M.A08(this.A04.remove(c2300iq));
        File file = (File) C3M.A01(c2300iq.A03);
        if (z10) {
            File file2 = file.getParentFile();
            File fileA05 = C2300iq.A05((File) C3M.A01(file2), this.A01, c2300iq.A02, j10);
            if (file.renameTo(fileA05)) {
                file = fileA05;
            } else {
                AnonymousClass44.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + fileA05);
            }
        }
        C2300iq newCacheSpan = c2300iq.A09(file, j10);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C2300iq> A06() {
        return this.A04;
    }

    public final void A07(long j10) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A03.get(i10).A01 == j10) {
                this.A03.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void A08(C2300iq c2300iq) {
        this.A04.add(c2300iq);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    public final boolean A0B(long j10, long j11) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A03.get(i10).A00(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0C(long j10, long j11) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A03.get(i10).A01(j10, j11)) {
                return false;
            }
        }
        this.A03.add(new M3(j10, j11));
        return true;
    }

    public final boolean A0D(C1414Lx c1414Lx) {
        if (this.A04.remove(c1414Lx)) {
            if (c1414Lx.A03 != null) {
                c1414Lx.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(M9 m10) {
        C2302is c2302is = this.A00;
        C2302is oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(m10);
        C2302is oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c2302is);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        M4 m10 = (M4) obj;
        if (this.A01 == m10.A01 && this.A02.equals(m10.A02) && this.A04.equals(m10.A04) && this.A00.equals(m10.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = result * 31;
        int result2 = this.A02.hashCode();
        return ((i10 + result2) * 31) + this.A00.hashCode();
    }
}
