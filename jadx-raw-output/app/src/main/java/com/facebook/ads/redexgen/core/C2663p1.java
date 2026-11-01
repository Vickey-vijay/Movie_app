package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2663p1 implements C1S {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;
    public final int[] A05;
    public final long[] A06;
    public final Uri[] A07;
    public static String[] A08 = {"OkxecgD0Gv2GK", "dTJXSSjTvXtvCpVWxsqZ6", "wYzs5zgiK5G18", "klAEANkVopL6T8N0G4GCOYVrDlyPlXqI", "4WcRthq3aJhjltodanyM1lxGrZBe12qe", "Nzs6zPyAK9Q7ZYWQPcJbQV1Iqfi6la98", "CqWpbShPfJkKIhE6JIbgz0xValvGrdcB", "ap1AkjUIhWjw5r6nQb"};
    public static final String A0G = AbstractC09664a.A0h(0);
    public static final String A0B = AbstractC09664a.A0h(1);
    public static final String A0H = AbstractC09664a.A0h(2);
    public static final String A0F = AbstractC09664a.A0h(3);
    public static final String A0C = AbstractC09664a.A0h(4);
    public static final String A0A = AbstractC09664a.A0h(5);
    public static final String A0D = AbstractC09664a.A0h(6);
    public static final String A0E = AbstractC09664a.A0h(7);
    public static final C1R<C2663p1> A09 = new C1R() { // from class: com.facebook.ads.redexgen.X.p2
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2663p1.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2663p1 A00(Bundle bundle) {
        long j10 = bundle.getLong(A0G);
        int i10 = bundle.getInt(A0B);
        int i11 = bundle.getInt(A0E);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0H);
        int[] intArray = bundle.getIntArray(A0F);
        long[] longArray = bundle.getLongArray(A0C);
        long j11 = bundle.getLong(A0A);
        boolean z10 = bundle.getBoolean(A0D);
        if (intArray == null) {
            intArray = new int[0];
        }
        Uri[] uriArr = new Uri[0];
        String[] strArr = A08;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "h5Cz72DlneqkJ";
        strArr2[0] = "HzHttfqxNoxwC";
        if (parcelableArrayList != null) {
            uriArr = (Uri[]) parcelableArrayList.toArray(uriArr);
        }
        if (longArray == null) {
            longArray = new long[0];
        }
        return new C2663p1(j10, i10, i11, intArray, uriArr, longArray, j11, z10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C2663p1 A06(int i10) {
        int[] iArrA02 = A02(this.A05, i10);
        long[] jArrA03 = A03(this.A06, i10);
        return new C2663p1(this.A03, i10, this.A01, iArrA02, (Uri[]) Arrays.copyOf(this.A07, i10), jArrA03, this.A02, this.A04);
    }

    public C2663p1(long j10) {
        this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public C2663p1(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        C3M.A07(iArr.length == uriArr.length);
        this.A03 = j10;
        this.A00 = i10;
        this.A01 = i11;
        this.A05 = iArr;
        this.A07 = uriArr;
        this.A06 = jArr;
        this.A02 = j11;
        this.A04 = z10;
    }

    public static int[] A02(int[] iArr, int i10) {
        int length = iArr.length;
        int iMax = Math.max(i10, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        return iArrCopyOf;
    }

    public static long[] A03(long[] jArr, int i10) {
        int length = jArr.length;
        int iMax = Math.max(i10, length);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
        return jArrCopyOf;
    }

    public final int A04() {
        return A05(-1);
    }

    public final int A05(int i10) {
        int i11 = i10 + 1;
        while (true) {
            int[] iArr = this.A05;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[4];
            int iCharAt = str.charAt(30);
            int nextAdIndexToPlay = str2.charAt(30);
            if (iCharAt != nextAdIndexToPlay) {
                throw new RuntimeException();
            }
            A08[6] = "Wtq62hhDQ1jo9VyQ6cIhlPoFSuywDvdH";
            int nextAdIndexToPlay2 = iArr.length;
            if (i11 < nextAdIndexToPlay2 && !this.A04) {
                int nextAdIndexToPlay3 = this.A05[i11];
                if (nextAdIndexToPlay3 != 0 && this.A05[i11] != 1) {
                    i11++;
                }
            }
            return i11;
        }
    }

    public final boolean A07() {
        if (this.A00 == -1) {
            return true;
        }
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = this.A05[i10];
            if (i11 != 0) {
                int i12 = this.A05[i10];
                if (i12 != 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A08() {
        return this.A00 == -1 || A04() < this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2663p1 c2663p1 = (C2663p1) obj;
        if (this.A03 == c2663p1.A03 && this.A00 == c2663p1.A00 && this.A01 == c2663p1.A01 && Arrays.equals(this.A07, c2663p1.A07) && Arrays.equals(this.A05, c2663p1.A05) && Arrays.equals(this.A06, c2663p1.A06)) {
            long j10 = this.A02;
            if (A08[5].charAt(25) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[3] = "oTIVhrwO4wW48XZtZFkmZHaHYFeLbVqJ";
            strArr[4] = "xLWtDigMD9KXXhkKgPNBVDDiVfKu3Nqc";
            if (j10 == c2663p1.A02 && this.A04 == c2663p1.A04) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A00 * 31) + this.A01) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + Arrays.hashCode(this.A07)) * 31) + Arrays.hashCode(this.A05)) * 31) + Arrays.hashCode(this.A06)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A04 ? 1 : 0);
    }
}
