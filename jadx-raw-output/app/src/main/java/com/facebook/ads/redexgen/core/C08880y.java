package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C08880y extends AnonymousClass94 {
    public static byte[] A0H;
    public static String[] A0I = {"m5Q3aiQKICJZrVflAtkG72aHaW7D7vzV", "Te6TlfxhDkM1nSnzhWnFswazR8GhYsIL", "RAA", "kEgqAeLW1EWE377lDOv4M7tHjIvdZKXO", "06ys5nuQ5LNcvNVR71UhF3Tfl10HYLje", "yFo", "kDpjkJehLDjfyQcmHJ0GXPIrbeMaoLDA", "wnjbAtiJPFcw6YA"};
    public AnonymousClass96 A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final AbstractC1121Am<C1202Ds> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final C3T A0F;
    public final EU A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C08880y(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C2620oH c2620oH, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i10, EU eu, int i11, long j10, long j11, long j12, int i12, int i13, float f10, float f11, long j13, List<C1202Ds> list, C3T c3t) {
        super(c2620oH, iArr, i10);
        if (j12 < j10) {
            AnonymousClass44.A07(A03(0, 22, 43), A03(22, 90, 50));
            j12 = j10;
        }
        this.A0G = eu;
        this.A0D = i11;
        this.A08 = j10 * 1000;
        this.A0E = j11 * 1000;
        this.A09 = 1000 * j12;
        this.A07 = i12;
        this.A06 = i13;
        this.A0C = f10;
        this.A05 = f11;
        this.A0B = AbstractC1121Am.A05(list);
        this.A0A = j13;
        this.A0F = c3t;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{-59, -24, -27, -12, -8, -19, -6, -23, -40, -10, -27, -25, -17, -41, -23, -16, -23, -25, -8, -19, -13, -14, -52, -17, -11, 0, -2, -1, -12, -7, -14, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -33, -6, -35, -16, -1, -20, -12, -7, -52, -15, -1, -16, -3, -49, -12, -2, -18, -20, -3, -17, -40, -2, -85, -1, -6, -85, -19, -16, -85, -20, -1, -85, -9, -16, -20, -2, -1, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -47, -6, -3, -36, 0, -20, -9, -12, -1, 4, -44, -7, -18, -3, -16, -20, -2, -16, -40, -2};
    }

    static {
        A04();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<java.lang.Integer> */
    public static AbstractC1121Am<AbstractC1121Am<C1202Ds>> A00(E9[] e9Arr) {
        C08971h c08971h;
        AbstractC1121Am abstractC1121AmA05;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < e9Arr.length; i10++) {
            if (e9Arr[i10] != null && e9Arr[i10].A02.length > 1) {
                C08971h c08971hA01 = AbstractC1121Am.A01();
                c08971hA01.A04(new C1202Ds(0L, 0L));
                arrayList.add(c08971hA01);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArrA06 = A06(e9Arr);
        int length = jArrA06.length;
        if (A0I[0].charAt(10) != 'x') {
            A0I[0] = "UXetESR07W40Ugl2KcKxfZnSKo41RBjF";
            int[] iArr = new int[length];
            long[] jArr = new long[jArrA06.length];
            for (int i11 = 0; i11 < jArrA06.length; i11++) {
                int length2 = jArrA06[i11].length;
                if (A0I[0].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A0I[7] = VastAttributes.HORIZONTAL_POSITION;
                jArr[i11] = length2 == 0 ? 0L : jArrA06[i11][0];
                String[] strArr = A0I;
                if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                    String[] strArr2 = A0I;
                    strArr2[1] = "cSuX5sbs1mm7BtC5NofnfdI255eKyli3";
                    strArr2[4] = "Z411JjDvpqHs7gscP9Mv86ZFtFCMjIgX";
                }
            }
            A05(arrayList, jArr);
            AbstractC1121Am<Integer> abstractC1121AmA02 = A02(jArrA06);
            for (int i12 = 0; i12 < abstractC1121AmA02.size(); i12++) {
                int iIntValue = abstractC1121AmA02.get(i12).intValue();
                int i13 = iArr[iIntValue] + 1;
                iArr[iIntValue] = i13;
                jArr[iIntValue] = jArrA06[iIntValue][i13];
                A05(arrayList, jArr);
            }
            for (int i14 = 0; i14 < e9Arr.length; i14++) {
                if (arrayList.get(i14) != null) {
                    jArr[i14] = jArr[i14] * 2;
                }
            }
            A05(arrayList, jArr);
            C08971h c08971hA02 = AbstractC1121Am.A01();
            int i15 = 0;
            while (true) {
                int size = arrayList.size();
                String[] strArr3 = A0I;
                if (strArr3[5].length() != strArr3[2].length()) {
                    String[] strArr4 = A0I;
                    strArr4[5] = "B5d";
                    strArr4[2] = "E7u";
                    if (i15 >= size) {
                        break;
                    }
                    c08971h = (C08971h) arrayList.get(i15);
                    if (c08971h == null) {
                        abstractC1121AmA05 = AbstractC1121Am.A03();
                    } else {
                        abstractC1121AmA05 = c08971h.A05();
                    }
                    c08971hA02.A04(abstractC1121AmA05);
                    i15++;
                } else {
                    String[] strArr5 = A0I;
                    strArr5[6] = "P6lwie0zupyVMIziqYi4GtWsnZGWabHp";
                    strArr5[3] = "HBKI3D47JNzwp3E4fcvtN9y7FoJFPrZj";
                    if (i15 >= size) {
                        break;
                    }
                    c08971h = (C08971h) arrayList.get(i15);
                    if (c08971h == null) {
                        abstractC1121AmA05 = AbstractC1121Am.A03();
                    } else {
                        abstractC1121AmA05 = c08971h.A05();
                    }
                    c08971hA02.A04(abstractC1121AmA05);
                    i15++;
                }
            }
            return c08971hA02.A05();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oE != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static AbstractC1121Am<Integer> A02(long[][] jArr) {
        InterfaceC2617oE interfaceC2617oEA00 = AbstractC2619oG.A02().A03().A00();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                double[] logBitrates = new double[jArr[i10].length];
                int i11 = 0;
                while (true) {
                    double dLog = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        dLog = Math.log(jArr[i10][i11]);
                    }
                    logBitrates[i11] = dLog;
                    i11++;
                }
                double d10 = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i12 = 0;
                for (int i13 = 1; i12 < logBitrates.length - i13; i13 = 1) {
                    interfaceC2617oEA00.AGU(Double.valueOf(d10 == 0.0d ? 1.0d : (((logBitrates[i12] + logBitrates[i12 + 1]) * 0.5d) - logBitrates[0]) / d10), Integer.valueOf(i10));
                    i12++;
                }
            }
        }
        return AbstractC1121Am.A05(interfaceC2617oEA00.values());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C08971h<C1202Ds>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            String[] strArr = A0I;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0I[0] = "hzQzkxJwAHZ0fRiIn7Pvrd3jIUiof14p";
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            C08971h<C1202Ds> c08971h = list.get(i10);
            if (A0I[0].charAt(10) == 'x') {
                throw new RuntimeException();
            }
            A0I[0] = "0V4VZlbFayh1Opq7Ah9Nva0ccysrREXP";
            if (c08971h != null) {
                c08971h.A04(new C1202Ds(j10, jArr[i10]));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[PHI: r5
  0x006e: PHI (r5v2 long[]) = (r5v0 long[]), (r5v3 long[]) binds: [B:21:0x007c, B:17:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    public static long[][] A06(E9[] e9Arr) {
        long j10;
        long[] jArr;
        long[][] jArr2 = new long[e9Arr.length][];
        for (int i10 = 0; i10 < e9Arr.length; i10++) {
            E9 e10 = e9Arr[i10];
            if (e10 == null) {
                jArr2[i10] = new long[0];
            } else {
                long[] jArr3 = new long[e10.A02.length];
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[3];
                int i11 = str.charAt(18);
                if (i11 == str2.charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "e4C";
                strArr2[2] = "lZL";
                jArr2[i10] = jArr3;
                for (int i12 = 0; i12 < e10.A02.length; i12++) {
                    int j11 = e10.A01.A08(e10.A02[i12]).A05;
                    int i13 = A0I[7].length();
                    if (i13 != 11) {
                        String[] strArr3 = A0I;
                        strArr3[5] = "HL2";
                        strArr3[2] = "liv";
                        j10 = j11;
                        jArr = jArr2[i10];
                        if (j10 == -1) {
                            j10 = 0;
                        }
                    } else {
                        j10 = j11;
                        jArr = jArr2[i10];
                        if (j10 == -1) {
                            j10 = 0;
                        }
                    }
                    jArr[i12] = j10;
                }
                Arrays.sort(jArr2[i10]);
            }
        }
        return jArr2;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass94, com.facebook.ads.redexgen.core.InterfaceC2464lj
    public final void A5p() {
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass94, com.facebook.ads.redexgen.core.InterfaceC2464lj
    public final void A6C() {
        this.A04 = -9223372036854775807L;
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2464lj
    public final int A8v() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass94, com.facebook.ads.redexgen.core.InterfaceC2464lj
    public final void AEc(float f10) {
        this.A01 = f10;
    }
}
