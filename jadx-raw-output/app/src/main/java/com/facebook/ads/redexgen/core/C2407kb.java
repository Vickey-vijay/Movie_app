package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2407kb implements GX {
    public static byte[] A0e;
    public static String[] A0f = {"ywSCwlzG1SMdvvW", "WbYO2rYjmhbf4R3oYDPvQZ3H98amgjSr", "Za", "aa8pMmtLKrvpWkukTfymetmlHniL9M", "752FE5aLUbaesINptKDix8v", "1m6bsNbzXuacY99BBbBsLUDHw0asFdhp", "tFAwrqTGVJ2tUOf2i", "X0elgRXJnrwhMbXNAucG6j3nQ1B9k96A"};
    public static final InterfaceC1263Gb A0g;
    public static final C2654or A0h;
    public static final byte[] A0i;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public SparseArray<IV> A0D;
    public C4J A0E;
    public GY A0F;
    public IV A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public H1[] A0K;
    public H1[] A0L;
    public final int A0M;
    public final DrmInitData A0N;
    public final C4J A0O;
    public final C4J A0P;
    public final C4J A0Q;
    public final C4J A0R;
    public final C4J A0S;
    public final C4R A0T;
    public final H1 A0U;
    public final HO A0V;
    public final C1325Im A0W;
    public final ArrayDeque<C2415kj> A0X;
    public final ArrayDeque<IU> A0Y;
    public final List<C2654or> A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final byte[] A0d;

    /* JADX WARN: Code duplicated, block: B:11:0x0061  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(IV iv, int i10, long j10, int i11, C4J c4j, int i12) {
        boolean z10;
        int iA0L;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j11;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z15;
        int i13;
        long j12;
        int iA0L2;
        int iA0L3;
        int iA0C;
        boolean z16;
        String[] strArr;
        int i14 = i12;
        long j13 = j10;
        c4j.A0f(8);
        int iA00 = II.A00(c4j.A0C());
        C1325Im c1325Im = iv.A05;
        C1327Io c1327Io = iv.A07;
        IP ip = c1327Io.A06;
        c1327Io.A0C[i10] = c4j.A0L();
        c1327Io.A0E[i10] = c1327Io.A04;
        if ((iA00 & 1) == 0) {
            if ((iA00 & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            iA0L = ip.A01;
            if (z10) {
                iA0L = c4j.A0L();
            }
            if ((iA00 & 256) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((iA00 & 512) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((iA00 & 1024) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((iA00 & 2048) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            j11 = 0;
            if (c1325Im.A08 != null) {
                j11 = c1325Im.A09[0];
            }
            iArr = c1327Io.A0B;
            jArr = c1327Io.A0D;
            zArr = c1327Io.A0G;
            if (c1325Im.A03 == 2) {
                z15 = false;
            } else {
                z15 = false;
            }
            i13 = i14 + c1327Io.A0C[i10];
            j12 = c1325Im.A06;
            if (i10 > 0) {
                j13 = c1327Io.A05;
            }
            while (i14 < i13) {
                if (z11) {
                    iA0L2 = c4j.A0L();
                } else {
                    iA0L2 = ip.A00;
                }
                if (z12) {
                    iA0L3 = c4j.A0L();
                    strArr = A0f;
                    if (strArr[3].length() != strArr[6].length()) {
                        String[] strArr2 = A0f;
                        strArr2[1] = "prYCRILb9XoLiqEuzjLvSymHGedE7tyJ";
                        strArr2[5] = "tQPxWhVMkiMqfE1WSn5JfVNHf8FlQpL7";
                    }
                } else {
                    iA0L3 = ip.A03;
                }
                if (i14 != 0) {
                    if (z13) {
                        iA0C = c4j.A0C();
                    } else if (A0f[4].length() == 23) {
                        A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                        iA0C = ip.A01;
                    }
                } else if (z13) {
                    iA0C = c4j.A0C();
                } else if (A0f[4].length() == 23) {
                    A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                    iA0C = ip.A01;
                }
                jArr[i14] = AbstractC09664a.A0U((((long) (z14 ? c4j.A0C() : 0)) + j13) - j11, 1000000L, j12);
                if (((iA0C >> 16) & 1) == 0) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                zArr[i14] = z16;
                iArr[i14] = iA0L3;
                j13 += (long) iA0L2;
                i14++;
            }
            c1327Io.A05 = j13;
            return i13;
        }
        long[] jArr2 = c1327Io.A0E;
        String[] strArr3 = A0f;
        if (strArr3[1].charAt(23) == strArr3[5].charAt(23)) {
            A0f[2] = "02";
            jArr2[i10] = jArr2[i10] + ((long) c4j.A0C());
            if ((iA00 & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            iA0L = ip.A01;
            if (z10) {
                iA0L = c4j.A0L();
            }
            if ((iA00 & 256) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((iA00 & 512) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((iA00 & 1024) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((iA00 & 2048) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            j11 = 0;
            if (c1325Im.A08 != null && c1325Im.A08.length == 1 && c1325Im.A08[0] == 0) {
                j11 = c1325Im.A09[0];
            }
            iArr = c1327Io.A0B;
            jArr = c1327Io.A0D;
            zArr = c1327Io.A0G;
            if (c1325Im.A03 == 2 || (i11 & 1) == 0) {
                z15 = false;
            } else {
                z15 = true;
            }
            i13 = i14 + c1327Io.A0C[i10];
            j12 = c1325Im.A06;
            if (i10 > 0) {
                j13 = c1327Io.A05;
            }
            while (i14 < i13) {
                if (z11) {
                    iA0L2 = c4j.A0L();
                } else {
                    iA0L2 = ip.A00;
                }
                if (z12) {
                    iA0L3 = c4j.A0L();
                    strArr = A0f;
                    if (strArr[3].length() != strArr[6].length()) {
                        String[] strArr4 = A0f;
                        strArr4[1] = "prYCRILb9XoLiqEuzjLvSymHGedE7tyJ";
                        strArr4[5] = "tQPxWhVMkiMqfE1WSn5JfVNHf8FlQpL7";
                    }
                } else {
                    iA0L3 = ip.A03;
                }
                if (i14 != 0 && z10) {
                    iA0C = iA0L;
                } else if (z13) {
                    iA0C = c4j.A0C();
                } else if (A0f[4].length() == 23) {
                    A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                    iA0C = ip.A01;
                }
                jArr[i14] = AbstractC09664a.A0U((((long) (z14 ? c4j.A0C() : 0)) + j13) - j11, 1000000L, j12);
                if (((iA0C >> 16) & 1) == 0 || (z15 && i14 != 0)) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                zArr[i14] = z16;
                iArr[i14] = iA0L3;
                j13 += (long) iA0L2;
                i14++;
            }
            c1327Io.A05 = j13;
            return i13;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C2448lT> A04(C4J c4j, long j10) throws C09222i {
        long jA0R;
        long jA0R2;
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        long jA0Q = c4j.A0Q();
        if (iA01 == 0) {
            jA0R = c4j.A0Q();
            jA0R2 = j10 + c4j.A0Q();
        } else {
            jA0R = c4j.A0R();
            jA0R2 = j10 + c4j.A0R();
        }
        long jA0U = AbstractC09664a.A0U(jA0R, 1000000L, jA0Q);
        c4j.A0g(2);
        int iA0M = c4j.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i10 = 0; i10 < iA0M; i10++) {
            int iA0C = c4j.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw new C09222i(A0B(634, 28, 93));
            }
            long jA0Q2 = c4j.A0Q();
            iArr[i10] = Integer.MAX_VALUE & iA0C;
            jArr[i10] = jA0R2;
            jArr3[i10] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC09664a.A0U(jA0R, 1000000L, jA0Q);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "mBjUzKzbBV9DJWZlH52EoviqXd7Fx3w7";
            jArr2[i10] = jA0U2 - jArr3[i10];
            c4j.A0g(4);
            jA0R2 += (long) iArr[i10];
        }
        return Pair.create(Long.valueOf(jA0U), new C2448lT(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static IV A09(C4J c4j, SparseArray<IV> sparseArray, boolean z10) {
        c4j.A0f(8);
        int iA00 = II.A00(c4j.A0C());
        IV ivA08 = A08(sparseArray, c4j.A0C(), z10);
        if (ivA08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c4j.A0R();
            ivA08.A07.A04 = jA0R;
            ivA08.A07.A03 = jA0R;
        }
        IP ip = ivA08.A04;
        ivA08.A07.A06 = new IP((iA00 & 2) != 0 ? c4j.A0L() - 1 : ip.A02, (iA00 & 8) != 0 ? c4j.A0L() : ip.A00, (iA00 & 16) != 0 ? c4j.A0L() : ip.A03, (iA00 & 32) != 0 ? c4j.A0L() : ip.A01);
        return ivA08;
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        String[] strArr = A0f;
        if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[1] = "BGZmKOZPo9hBykc2GdFNUQpHC0I3sPv1";
        strArr2[5] = "CvUkm70dQ0grN9w1V6xWMg6HVylPciNL";
        A0e = new byte[]{84, 88, 95, 106, 113, 115, 62, 109, 119, 100, 123, 62, 114, 123, 109, 109, 62, 106, 118, 127, 112, 62, 118, 123, 127, 122, 123, 108, 62, 114, 123, 112, 121, 106, 118, 62, 54, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 55, 48, 99, 72, 82, 84, 95, 6, 69, 73, 83, 72, 82, 6, 79, 72, 6, 85, 68, 65, 86, 6, 7, 27, 6, 23, 6, 14, 83, 72, 85, 83, 86, 86, 73, 84, 82, 67, 66, 15, 8, 73, 98, 120, 126, 117, 44, 111, 99, 121, 98, 120, 44, 101, 98, 44, 127, 107, 124, 104, 44, 45, 49, 44, 61, 44, 36, 121, 98, 127, 121, 124, 124, 99, 126, 120, 105, 104, 37, 34, 104, 92, 79, 73, 67, 75, 64, 90, 75, 74, 99, 94, 26, 107, 86, 90, 92, 79, 77, 90, 65, 92, 57, 23, 30, 31, 2, 25, 30, 23, 80, 30, 21, 23, 17, 4, 25, 6, 21, 80, 31, 22, 22, 3, 21, 4, 80, 4, 31, 80, 3, 17, 29, 0, 28, 21, 80, 20, 17, 4, 17, 94, 116, 83, 75, 92, 81, 84, 89, 29, 115, 124, 113, 29, 81, 88, 83, 90, 73, 85, 113, 88, 92, 91, 29, 92, 73, 82, 80, 29, 89, 88, 91, 84, 83, 88, 78, 29, 88, 69, 73, 88, 83, 89, 88, 89, 29, 92, 73, 82, 80, 29, 78, 84, 71, 88, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 19, 62, 23, 19, 20, 82, 19, 6, 29, 31, 82, 5, 27, 6, 26, 82, 30, 23, 28, 21, 6, 26, 82, 76, 82, 64, 67, 70, 69, 70, 74, 65, 68, 70, 69, 82, 90, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 91, 92, 2, 43, 32, 41, 58, 38, 110, 35, 39, 61, 35, 47, 58, 45, 38, 116, 110, 82, 123, 123, 110, 120, 105, 61, 105, 114, 61, 120, 115, 126, 111, 100, 109, 105, 116, 114, 115, 61, 121, 124, 105, 124, 61, 106, 124, 110, 61, 115, 120, 122, 124, 105, 116, 107, 120, 51, 123, 82, 82, 71, 81, 64, 20, 64, 91, 20, 81, 90, 80, 20, 91, 82, 20, 89, 80, 85, 64, 20, 67, 85, 71, 20, 90, 81, 83, 85, 64, 93, 66, 81, 26, 61, 4, 23, 0, 0, 27, 22, 27, 28, 21, 82, 38, 0, 19, 17, 25, 55, 28, 17, 0, 11, 2, 6, 27, 29, 28, 48, 29, 10, 82, 2, 19, 0, 19, 31, 23, 6, 23, 0, 1, 82, 27, 1, 82, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 92, 84, 108, 110, 119, 119, 98, 99, 39, 119, 116, 116, 111, 39, 102, 115, 104, 106, 39, 47, 97, 102, 110, 107, 98, 99, 39, 115, 104, 39, 98, 127, 115, 117, 102, 100, 115, 39, 114, 114, 110, 99, 46, 60, 4, 6, 31, 31, 6, 1, 8, 79, 14, 27, 0, 2, 79, 24, 6, 27, 7, 79, 3, 10, 1, 8, 27, 7, 79, 81, 79, 93, 94, 91, 88, 91, 87, 92, 89, 91, 88, 79, 71, 26, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 70, 65, 79, 119, 117, 108, 108, 117, 114, 123, 60, 105, 114, 111, 105, 108, 108, 115, 110, 104, 121, 120, 60, 121, 113, 111, 123, 60, 106, 121, 110, 111, 117, 115, 114, 38, 60, 57, 2, 9, 20, 28, 9, 15, 24, 9, 8, 76, 1, 3, 3, 26, 76, 14, 3, 20, 66, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 97, 115, 123, 125, 50, 119, 124, 102, 96, 107, 50, 113, 125, 103, 124, 102, 40, 50, 107, 80, 86, 95, 80, 90, 82, 91, 90, 30, 87, 80, 90, 87, 76, 91, 93, 74, 30, 76, 91, 88, 91, 76, 91, 80, 93, 91, 107, 92, 79, 84, 92, 95, 81, 88, 29, 81, 88, 83, 90, 73, 85, 29, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, 29, 84, 83, 29, 78, 90, 77, 89, 29, 91, 82, 72, 83, 89, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 83, 66, 66, 94, 91, 81, 83, 70, 91, 93, 92, 29, 74, 31, 87, 95, 65, 85, 66, 83, 83, 79, 74, 64, 66, 87, 74, 76, 77, 12, 91, 14, 78, 83, 23, 14, 85, 87, 87, 70, 89, 84, 85, 95, 31, 88, 85, 70, 83, 40, 55, 58, 59, 49, 113, 51, 46, 106};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0I(C4J c4j, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0L == null || this.A0L.length == 0) {
            return;
        }
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                if (A0f[2].length() != 2) {
                    throw new RuntimeException();
                }
                A0f[0] = "4yWaL9iFGGaDiXT";
                long jA0Q2 = c4j.A0Q();
                jA0U2 = AbstractC09664a.A0U(c4j.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = AbstractC09664a.A0U(c4j.A0Q(), 1000L, jA0Q2);
                jA0Q = c4j.A0Q();
                break;
                break;
            case 1:
                long jA0Q3 = c4j.A0Q();
                jA05 = AbstractC09664a.A0U(c4j.A0R(), 1000000L, jA0Q3);
                jA0U = AbstractC09664a.A0U(c4j.A0Q(), 1000L, jA0Q3);
                jA0Q = c4j.A0Q();
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                break;
            default:
                AnonymousClass44.A07(A0B(128, 22, 77), A0B(550, 35, 127) + iA01);
                return;
        }
        byte[] bArr = new byte[c4j.A07()];
        c4j.A0k(bArr, 0, c4j.A07());
        int i10 = 0;
        C4J c4j2 = new C4J(this.A0V.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c4j2.A07();
        H1[] h1Arr = this.A0L;
        int length = h1Arr.length;
        int i11 = 0;
        while (i11 < length) {
            H1 h10 = h1Arr[i11];
            c4j2.A0f(i10);
            h10.AJu(uri);
            h10.AI7(c4j2, iA07);
            i11++;
            i10 = 0;
        }
        if (jA05 == -9223372036854775807L) {
            this.A0Y.addLast(new IU(jA0U2, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0T != null) {
            jA05 = this.A0T.A05(jA05);
        }
        if (this.A0b && this.A0A != -9223372036854775807L) {
            jA05 = this.A0A;
        }
        for (H1 h11 : this.A0L) {
            h11.AIA(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0J(C4J c4j, C4J c4j2, String str, C1327Io c1327Io) throws C09222i {
        c4j.A0f(8);
        int iA0C = c4j.A0C();
        if (c4j.A0C() != 1936025959) {
            return;
        }
        int iA01 = II.A01(iA0C);
        if (A0f[2].length() != 2) {
            throw new RuntimeException();
        }
        A0f[0] = "QrVDtjxvyixdHPq";
        if (iA01 == 1) {
            c4j.A0g(4);
        }
        if (c4j.A0C() != 1) {
            throw new C09222i(A0B(50, 39, 69));
        }
        c4j2.A0f(8);
        int iA0C2 = c4j2.A0C();
        if (c4j2.A0C() != 1936025959) {
            return;
        }
        int iA02 = II.A01(iA0C2);
        if (iA02 == 1) {
            if (c4j2.A0Q() == 0) {
                throw new C09222i(A0B(EventTypeExtended.EVENT_TYPE_EXTENDED_SK_OVERLAY_PRESENTING_VALUE, 55, 94));
            }
        } else if (iA02 >= 2) {
            c4j2.A0g(4);
        }
        if (c4j2.A0Q() != 1) {
            throw new C09222i(A0B(89, 39, 111));
        }
        c4j2.A0g(1);
        int iA0I = c4j2.A0I();
        int i10 = (iA0I & 240) >> 4;
        int i11 = iA0I & 15;
        boolean z10 = c4j2.A0I() == 1;
        if (z10) {
            int iA0I2 = c4j2.A0I();
            byte[] bArr = new byte[16];
            c4j2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c4j2.A0I();
                bArr2 = new byte[iA0I3];
                c4j2.A0k(bArr2, 0, iA0I3);
            }
            c1327Io.A08 = true;
            c1327Io.A07 = new C1326In(z10, str, iA0I2, bArr, i10, i11, bArr2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0R(C2415kj c2415kj) throws C09222i {
        C3M.A0A(this.A0W == null, A0B(585, 20, 15));
        DrmInitData drmInitDataA05 = A05(c2415kj.A02);
        C2415kj c2415kj2 = (C2415kj) C3M.A01(c2415kj.A06(1836475768));
        SparseArray<IP> sparseArray = new SparseArray<>();
        long jA01 = -9223372036854775807L;
        int size = c2415kj2.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2414ki c2414ki = c2415kj2.A02.get(i10);
            if (((II) c2414ki).A00 == 1953654136) {
                Pair<Integer, IP> pairA03 = A03(c2414ki.A00);
                int iIntValue = ((Integer) pairA03.first).intValue();
                Object obj = pairA03.second;
                if (A0f[7].charAt(29) == '0') {
                    throw new RuntimeException();
                }
                A0f[0] = "KUxAVqQLzsv7ujT";
                sparseArray.put(iIntValue, (IP) obj);
            } else {
                int i11 = ((II) c2414ki).A00;
                if (A0f[7].charAt(29) != '0') {
                    A0f[2] = "EA";
                    if (i11 == 1835362404) {
                        jA01 = A01(c2414ki.A00);
                    }
                } else {
                    String[] strArr = A0f;
                    strArr[3] = "P1l2XCTjN0GLzwkC984rH7zDpCyyqZ";
                    strArr[6] = "39xRaNo9QFkrA6tLq";
                    if (i11 == 237072518) {
                        jA01 = A01(c2414ki.A00);
                    }
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c2415kj.A01.size();
        for (int i12 = 0; i12 < size2; i12++) {
            C2415kj c2415kj3 = c2415kj.A01.get(i12);
            if (((II) c2415kj3).A00 == 1953653099) {
                C1325Im c1325ImA0A = A0A(IO.A0J(c2415kj3, c2415kj.A07(1836476516), jA01, drmInitDataA05, (this.A0M & 16) != 0, false));
                if (c1325ImA0A != null) {
                    sparseArray2.put(c1325ImA0A.A00, c1325ImA0A);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0D.size() != 0) {
            C3M.A08(this.A0D.size() == size3);
            for (int i13 = 0; i13 < size3; i13++) {
                C1325Im c1325Im = (C1325Im) sparseArray2.valueAt(i13);
                this.A0D.get(c1325Im.A00).A08(c1325Im, A06(sparseArray, c1325Im.A00));
            }
            return;
        }
        for (int i14 = 0; i14 < size3; i14++) {
            C1325Im c1325Im2 = (C1325Im) sparseArray2.valueAt(i14);
            IV iv = new IV(this.A0F.AJh(i14, c1325Im2.A03));
            iv.A08(c1325Im2, A06(sparseArray, c1325Im2.A00));
            this.A0D.put(c1325Im2.A00, iv);
            this.A08 = Math.max(this.A08, c1325Im2.A04);
        }
        A0D();
        GY gy = this.A0F;
        if (A0f[7].charAt(29) != '0') {
            String[] strArr2 = A0f;
            strArr2[3] = "NZTZhjA83sW4NrmiIOwSslFR5UdjBx";
            strArr2[6] = "jWtg8I2sGrLmtghr5";
            gy.A6G();
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a A[PHI: r0 r3
  0x006a: PHI (r0v33 com.facebook.ads.redexgen.X.ki) = (r0v12 com.facebook.ads.redexgen.X.ki), (r0v38 com.facebook.ads.redexgen.X.ki) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r3v6 com.facebook.ads.redexgen.X.In) = (r3v1 com.facebook.ads.redexgen.X.In), (r3v7 com.facebook.ads.redexgen.X.In) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C2415kj c2415kj, SparseArray<IV> sparseArray, int i10, byte[] bArr, boolean z10) throws C09222i {
        C1326In c1326InA00;
        C2414ki c2414kiA07;
        IV ivA09 = A09(c2415kj.A07(1952868452).A00, sparseArray, z10);
        if (ivA09 == null) {
            return;
        }
        C1327Io c1327Io = ivA09.A07;
        long jA02 = c1327Io.A05;
        ivA09.A05();
        if (c2415kj.A07(1952867444) != null) {
            int i11 = i10 & 2;
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            A0f[4] = "8CfIIEomKXR2z1rzEceKdGz";
            if (i11 == 0) {
                jA02 = A02(c2415kj.A07(1952867444).A00);
            }
        }
        A0U(c2415kj, ivA09, jA02, i10);
        C1325Im c1325Im = ivA09.A05;
        if (A0f[2].length() != 2) {
            c1326InA00 = c1325Im.A00(c1327Io.A06.A02);
            c2414kiA07 = c2415kj.A07(1935763834);
            if (c2414kiA07 != null) {
                A0W(c1326InA00, c2414kiA07.A00, c1327Io);
            }
        } else {
            String[] strArr = A0f;
            strArr[1] = "KgLNgt4jXc3ey27lHSoy2KaHmXxTtgSL";
            strArr[5] = "0TnPqkkfx8cOSuGK7tHkJ8yHXf83oy0i";
            c1326InA00 = c1325Im.A00(c1327Io.A06.A02);
            c2414kiA07 = c2415kj.A07(1935763834);
            if (c2414kiA07 != null) {
                A0W(c1326InA00, c2414kiA07.A00, c1327Io);
            }
        }
        C2414ki c2414kiA08 = c2415kj.A07(1935763823);
        if (c2414kiA08 != null) {
            C4J c4j = c2414kiA08.A00;
            if (A0f[7].charAt(29) != '0') {
                A0f[2] = "tW";
                A0K(c4j, c1327Io);
            } else {
                A0f[0] = "kXc0iULHRQw05uA";
                A0K(c4j, c1327Io);
            }
        }
        C2414ki c2414kiA09 = c2415kj.A07(1936027235);
        if (c2414kiA09 != null) {
            A0L(c2414kiA09.A00, c1327Io);
        }
        C2414ki c2414kiA010 = c2415kj.A07(1935828848);
        C2414ki c2414kiA011 = c2415kj.A07(1936158820);
        if (c2414kiA010 != null && c2414kiA011 != null) {
            A0J(c2414kiA010.A00, c2414kiA011.A00, c1326InA00 != null ? c1326InA00.A02 : null, c1327Io);
        }
        int size = c2415kj.A02.size();
        for (int i12 = 0; i12 < size; i12++) {
            C2414ki c2414ki = c2415kj.A02.get(i12);
            if (((II) c2414ki).A00 == 1970628964) {
                A0M(c2414ki.A00, c1327Io, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0W(C1326In c1326In, C4J c4j, C1327Io c1327Io) throws C09222i {
        int i10 = c1326In.A00;
        c4j.A0f(8);
        if ((II.A00(c4j.A0C()) & 1) == 1) {
            c4j.A0g(8);
        }
        int iA0I = c4j.A0I();
        int iA0L = c4j.A0L();
        if (iA0L != c1327Io.A00) {
            throw new C09222i(A0B(308, 17, 45) + iA0L + A0B(0, 2, 27) + c1327Io.A00);
        }
        int i11 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c1327Io.A0F;
            for (int i12 = 0; i12 < iA0L; i12++) {
                int iA0I2 = c4j.A0I();
                i11 += iA0I2;
                zArr[i12] = iA0I2 > i10;
            }
        } else {
            i11 = 0 + (iA0I * iA0L);
            Arrays.fill(c1327Io.A0F, 0, iA0L, iA0I > i10);
        }
        c1327Io.A02(i11);
    }

    static {
        A0E();
        A0g = new InterfaceC1263Gb() { // from class: com.facebook.ads.redexgen.X.kf
            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final GX[] A5F() {
                return C2407kb.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1263Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1262Ga.A01(this, uri, map);
            }
        };
        A0i = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0h = new C2D().A11(A0B(717, 18, 81)).A14();
    }

    public C2407kb() {
        this(0);
    }

    public C2407kb(int i10) {
        this(i10, null);
    }

    public C2407kb(int i10, C4R c4r) {
        this(i10, c4r, null, null);
    }

    public C2407kb(int i10, C4R c4r, C1325Im c1325Im, DrmInitData drmInitData) {
        this(i10, c4r, c1325Im, drmInitData, Collections.emptyList());
    }

    public C2407kb(int i10, C4R c4r, C1325Im c1325Im, DrmInitData drmInitData, List<C2654or> list) {
        this(i10, c4r, c1325Im, drmInitData, list, null, false, false, false);
    }

    public C2407kb(int i10, C4R c4r, C1325Im c1325Im, DrmInitData drmInitData, List<C2654or> list, H1 h10, boolean z10, boolean z11, boolean z12) {
        this.A0A = -9223372036854775807L;
        this.A0M = (c1325Im != null ? 8 : 0) | i10;
        this.A0T = c4r;
        this.A0W = c1325Im;
        this.A0N = drmInitData;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0U = h10;
        this.A0c = z10;
        this.A0b = z11;
        this.A0a = z12;
        this.A0V = new HO();
        this.A0O = new C4J(16);
        this.A0R = new C4J(AbstractC1278Gq.A03);
        this.A0Q = new C4J(5);
        this.A0P = new C4J();
        this.A0d = new byte[16];
        this.A0S = new C4J(this.A0d);
        this.A0X = new ArrayDeque<>();
        this.A0Y = new ArrayDeque<>();
        this.A0D = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        A0C();
    }

    public static long A01(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        return II.A01(fullAtom) == 0 ? c4j.A0Q() : c4j.A0R();
    }

    public static long A02(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        int version = II.A01(fullAtom);
        return version == 1 ? c4j.A0R() : c4j.A0Q();
    }

    public static Pair<Integer, IP> A03(C4J c4j) {
        c4j.A0f(12);
        int defaultSampleDescriptionIndex = c4j.A0C();
        int trackId = c4j.A0L();
        int defaultSampleFlags = c4j.A0L();
        int defaultSampleSize = c4j.A0L();
        int defaultSampleDuration = c4j.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new IP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C2414ki> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2414ki c2414ki = list.get(i10);
            int leafChildrenSize = A0f[4].length();
            if (leafChildrenSize != 23) {
                throw new RuntimeException();
            }
            A0f[0] = "gRucWkmmr3YeQcV";
            C2414ki c2414ki2 = c2414ki;
            int leafChildrenSize2 = ((II) c2414ki2).A00;
            if (leafChildrenSize2 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c2414ki2.A00.A00;
                UUID uuidA02 = AbstractC1318If.A02(bArr);
                if (uuidA02 == null) {
                    AnonymousClass44.A07(A0B(128, 22, 77), A0B(455, 42, 100));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0B(766, 9, 61), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private IP A06(SparseArray<IP> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (IP) C3M.A01(sparseArray.get(i10));
    }

    public static IV A07(SparseArray<IV> sparseArray) {
        IV iv = null;
        long j10 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            IV ivValueAt = sparseArray.valueAt(i10);
            if (ivValueAt.A02 != ivValueAt.A07.A01) {
                long nextTrackRunOffset = ivValueAt.A07.A0E[ivValueAt.A02];
                if (nextTrackRunOffset < j10) {
                    iv = ivValueAt;
                    j10 = nextTrackRunOffset;
                }
            }
        }
        return iv;
    }

    public static IV A08(SparseArray<IV> sparseArray, int i10, boolean z10) {
        if (sparseArray.size() == 1 && !z10) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    private final C1325Im A0A(C1325Im c1325Im) {
        return c1325Im;
    }

    private void A0C() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0D() {
        if (this.A0L == null) {
            this.A0L = new H1[2];
            int i10 = 0;
            if (this.A0U != null) {
                this.A0L[0] = this.A0U;
                i10 = 0 + 1;
            }
            int emsgTrackOutputCount = this.A0M;
            if ((emsgTrackOutputCount & 4) != 0) {
                H1[] h1Arr = this.A0L;
                int i11 = i10 + 1;
                if (A0f[7].charAt(29) == '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A0f;
                strArr[1] = "2Ynf6gmdLfe6xE9EEWKUzFfHKl41sL7a";
                strArr[5] = "AN0qqeacVBgpTr6ZS3JdezHHRUzhKU8l";
                h1Arr[i10] = this.A0F.AJh(this.A0D.size(), 5);
                i10 = i11;
            }
            this.A0L = (H1[]) Arrays.copyOf(this.A0L, i10);
            for (H1 h10 : this.A0L) {
                h10.A6W(A0h);
            }
        }
        if (this.A0K == null) {
            this.A0K = new H1[this.A0Z.size()];
            for (int i12 = 0; i12 < i; i12++) {
                GY gy = this.A0F;
                int i13 = this.A0D.size();
                H1 output = gy.AJh(i13 + 1 + i12, 3);
                output.A6W(this.A0Z.get(i12));
                this.A0K[i12] = output;
            }
        }
    }

    private void A0F(long j10) {
        while (!this.A0Y.isEmpty()) {
            IU iuRemoveFirst = this.A0Y.removeFirst();
            this.A03 -= iuRemoveFirst.A00;
            long jA05 = j10 + iuRemoveFirst.A01;
            if (this.A0T != null) {
                jA05 = this.A0T.A05(jA05);
            }
            for (H1 h10 : this.A0L) {
                h10.AIA(jA05, 1, iuRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j10) throws C09222i {
        while (!this.A0X.isEmpty() && this.A0X.peek().A00 == j10) {
            A0P(this.A0X.pop());
        }
        A0C();
    }

    public static void A0H(C4J c4j, int i10, C1327Io c1327Io) throws C09222i {
        c4j.A0f(i10 + 8);
        int fullAtom = c4j.A0C();
        int flags = II.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c4j.A0L();
            int fullAtom4 = c1327Io.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c1327Io.A0F, 0, sampleCount, z10);
                int fullAtom5 = c4j.A07();
                c1327Io.A02(fullAtom5);
                c1327Io.A04(c4j);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0B(308, 17, 45)).append(sampleCount).append(A0B(0, 2, 27));
            int fullAtom6 = c1327Io.A00;
            throw new C09222i(sbAppend.append(fullAtom6).toString());
        }
        throw new C09222i(A0B(399, 56, 17));
    }

    public static void A0K(C4J c4j, C1327Io c1327Io) throws C09222i {
        c4j.A0f(8);
        int flags = c4j.A0C();
        int fullAtom = II.A00(flags) & 1;
        if (fullAtom == 1) {
            c4j.A0g(8);
        }
        int iA0L = c4j.A0L();
        if (iA0L == 1) {
            int entryCount = II.A01(flags);
            c1327Io.A03 += entryCount == 0 ? c4j.A0Q() : c4j.A0R();
            return;
        }
        throw new C09222i(A0B(605, 29, 113) + iA0L);
    }

    public static void A0L(C4J c4j, C1327Io c1327Io) throws C09222i {
        A0H(c4j, 0, c1327Io);
    }

    public static void A0M(C4J c4j, C1327Io c1327Io, byte[] bArr) throws C09222i {
        c4j.A0f(8);
        c4j.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0i)) {
            return;
        }
        A0H(c4j, 16, c1327Io);
    }

    private void A0N(InterfaceC2443lN interfaceC2443lN) throws IOException {
        int i10 = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC2443lN.readFully(this.A0E.A00, 8, i10);
            A0V(new C2414ki(this.A01, this.A0E), interfaceC2443lN);
        } else {
            interfaceC2443lN.AJJ(i10);
        }
        A0G(interfaceC2443lN.A8f());
    }

    private void A0O(InterfaceC2443lN interfaceC2443lN) throws IOException {
        IV ivValueAt = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0D.size();
        for (int i10 = 0; i10 < size; i10++) {
            IV nextTrackBundle = this.A0D.valueAt(i10);
            C1327Io c1327Io = nextTrackBundle.A07;
            if (c1327Io.A0A) {
                long nextDataOffset = c1327Io.A03;
                String[] strArr = A0f;
                if (strArr[3].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                A0f[4] = "mIjUpcDFQdM2YkTgY6cnbvy";
                if (nextDataOffset < j10) {
                    j10 = c1327Io.A03;
                    ivValueAt = this.A0D.valueAt(i10);
                }
            }
        }
        if (ivValueAt == null) {
            if (A0f[4].length() == 23) {
                A0f[0] = "NbtoUSPOiQE3wq0";
                this.A02 = 3;
                return;
            }
            throw new RuntimeException();
        }
        int iA8f = (int) (j10 - interfaceC2443lN.A8f());
        if (iA8f >= 0) {
            interfaceC2443lN.AJJ(iA8f);
            ivValueAt.A07.A05(interfaceC2443lN);
            return;
        }
        throw new C09222i(A0B(325, 39, 126));
    }

    private void A0P(C2415kj c2415kj) throws C09222i {
        if (((II) c2415kj).A00 == 1836019574) {
            A0R(c2415kj);
        } else if (((II) c2415kj).A00 == 1836019558) {
            A0Q(c2415kj);
        } else {
            if (this.A0X.isEmpty()) {
                return;
            }
            this.A0X.peek().A08(c2415kj);
        }
    }

    private void A0Q(C2415kj c2415kj) throws C09222i {
        A0S(c2415kj, this.A0D, this.A0M, this.A0d, this.A0c);
        DrmInitData drmInitDataA05 = this.A0N != null ? null : A05(c2415kj.A02);
        if (drmInitDataA05 != null) {
            int i10 = this.A0D.size();
            for (int trackCount = 0; trackCount < i10; trackCount++) {
                this.A0D.valueAt(trackCount).A07(drmInitDataA05);
            }
        }
        if (this.A0B != -9223372036854775807L) {
            int size = this.A0D.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0D.valueAt(i11).A06(this.A0B);
            }
            this.A0B = -9223372036854775807L;
        }
    }

    public static void A0S(C2415kj c2415kj, SparseArray<IV> sparseArray, int i10, byte[] bArr, boolean z10) throws C09222i {
        int size = c2415kj.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2415kj child = c2415kj.A01.get(i11);
            int i12 = ((II) child).A00;
            if (i12 == 1953653094) {
                boolean z11 = true;
                if (size <= 1 || !z10) {
                    z11 = false;
                }
                A0T(child, sparseArray, i10, bArr, z11);
            }
        }
    }

    public static void A0U(C2415kj c2415kj, IV iv, long j10, int i10) {
        int i11 = 0;
        int i12 = 0;
        List<C2414ki> list = c2415kj.A02;
        int size = list.size();
        int i13 = 0;
        while (true) {
            String[] strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A0f[0] = "3b9EJYgpciD07do";
            if (i13 < size) {
                C2414ki c2414ki = list.get(i13);
                if (((II) c2414ki).A00 == 1953658222) {
                    C4J trunData = c2414ki.A00;
                    trunData.A0f(12);
                    int iA0L = trunData.A0L();
                    if (iA0L > 0) {
                        i12 += iA0L;
                        i11++;
                    }
                }
                i13++;
            } else {
                iv.A02 = 0;
                iv.A00 = 0;
                iv.A01 = 0;
                iv.A07.A03(i11, i12);
                int i14 = 0;
                int trunStartPosition = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    C2414ki c2414ki2 = list.get(i15);
                    if (((II) c2414ki2).A00 == 1953658222) {
                        trunStartPosition = A00(iv, i14, j10, i10, c2414ki2.A00, trunStartPosition);
                        i14++;
                    }
                }
                return;
            }
        }
    }

    private void A0V(C2414ki c2414ki, InterfaceC2443lN interfaceC2443lN) throws C09222i {
        Uri uriA9H;
        if (!this.A0X.isEmpty()) {
            this.A0X.peek().A09(c2414ki);
            return;
        }
        if (((II) c2414ki).A00 == 1936286840) {
            Pair<Long, C2448lT> pairA04 = A04(c2414ki.A00, interfaceC2443lN.A8f());
            this.A0C = ((Long) pairA04.first).longValue();
            this.A0F.AIN((InterfaceC1284Gw) pairA04.second);
            if (A0f[2].length() != 2) {
                throw new RuntimeException();
            }
            A0f[2] = "jw";
            this.A0H = true;
            return;
        }
        if (((II) c2414ki).A00 != 1701671783 || (uriA9H = interfaceC2443lN.A9H()) == null) {
            return;
        }
        A0I(c2414ki.A00, uriA9H);
    }

    public static boolean A0X(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean A0Y(int i10) {
        if (i10 != 1751411826 && i10 != 1835296868 && i10 != 1836476516 && i10 != 1936286840 && i10 != 1937011556 && i10 != 1952867444 && i10 != 1952868452 && i10 != 1953196132 && i10 != 1953654136 && i10 != 1953658222 && i10 != 1886614376) {
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[1] = "pufslWDHGkolcxIdleA53YlHTmcCni23";
            strArr[5] = "pxTVwd0BvZHkKJbeu8mcyfUHnPvesqsQ";
            if (i10 != 1935763834 && i10 != 1935763823 && i10 != 1936027235 && i10 != 1970628964 && i10 != 1935828848 && i10 != 1936158820 && i10 != 1701606260 && i10 != 1835362404 && i10 != 1701671783) {
                return false;
            }
        }
        return true;
    }

    private boolean A0Z(InterfaceC2443lN interfaceC2443lN) throws IOException {
        if (this.A00 == 0) {
            if (!interfaceC2443lN.AGh(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0f(0);
            this.A07 = this.A0O.A0Q();
            this.A01 = this.A0O.A0C();
        }
        if (this.A07 == 1) {
            interfaceC2443lN.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0R();
        } else if (this.A07 == 0) {
            long jA8G = interfaceC2443lN.A8G();
            if (jA8G == -1 && !this.A0X.isEmpty()) {
                jA8G = this.A0X.peek().A00;
            }
            if (jA8G != -1) {
                long jA8f = jA8G - interfaceC2443lN.A8f();
                int trackCount = this.A00;
                this.A07 = jA8f + ((long) trackCount);
            }
        }
        if (this.A07 >= this.A00) {
            long jA8f2 = interfaceC2443lN.A8f() - ((long) this.A00);
            if (this.A01 == 1836019558) {
                int size = this.A0D.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1327Io c1327Io = this.A0D.valueAt(i10).A07;
                    c1327Io.A02 = jA8f2;
                    c1327Io.A03 = jA8f2;
                    c1327Io.A04 = jA8f2;
                }
            }
            if (this.A01 == 1835295092) {
                this.A0G = null;
                this.A09 = this.A07 + jA8f2;
                if (!this.A0H) {
                    this.A0F.AIN(new C2438lI(this.A08, jA8f2));
                    this.A0H = true;
                }
                this.A02 = 2;
                return true;
            }
            boolean zA0X = A0X(this.A01);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "BTpsgrbOJA5y808qoKaZGmPima83kMX9";
            if (zA0X) {
                long jA8f3 = (interfaceC2443lN.A8f() + this.A07) - 8;
                this.A0X.push(new C2415kj(this.A01, jA8f3));
                if (this.A07 == this.A00) {
                    A0G(jA8f3);
                } else {
                    A0C();
                }
            } else if (A0Y(this.A01)) {
                if (this.A00 != 8) {
                    throw new C09222i(A0B(208, 51, 94));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new C4J((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new C09222i(A0B(259, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                this.A02 = 1;
            } else {
                throw new C09222i(A0B(497, 53, 12));
            }
            return true;
        }
        throw new C09222i(A0B(2, 48, 125));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0201  */
    /* JADX WARN: Code duplicated, block: B:66:0x0205  */
    /* JADX WARN: Code duplicated, block: B:69:0x022a  */
    /* JADX WARN: Code duplicated, block: B:72:0x023f A[LOOP:1: B:67:0x0224->B:72:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x025d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0266  */
    /* JADX WARN: Code duplicated, block: B:84:0x0290  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
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
    private boolean A0a(InterfaceC2443lN interfaceC2443lN) throws IOException {
        C1327Io c1327Io;
        C1325Im c1325Im;
        H1 h10;
        int i10;
        long jA00;
        int i11;
        int i12;
        boolean z10;
        C1287Gz c1287Gz;
        C1326In c1326InA00;
        ?? r11;
        int i13;
        String[] strArr;
        String str;
        String[] strArr2;
        byte[] bArr;
        int i14;
        int i15;
        int iA0C;
        boolean z11;
        int iAI5;
        int i16 = 4;
        int i17 = 1;
        int i18 = 0;
        if (this.A02 == 3) {
            if (this.A0G == null) {
                IV ivA07 = A07(this.A0D);
                if (ivA07 == null) {
                    int iA8f = (int) (this.A09 - interfaceC2443lN.A8f());
                    if (A0f[0].length() == 15) {
                        A0f[4] = "i1YiOY4gD0FAVv8vBgekv9L";
                        if (iA8f >= 0) {
                            interfaceC2443lN.AJJ(iA8f);
                            A0C();
                            return false;
                        }
                        throw new C09222i(A0B(364, 35, 87));
                    }
                } else {
                    int iA8f2 = (int) (ivA07.A07.A0E[ivA07.A02] - interfaceC2443lN.A8f());
                    if (iA8f2 < 0) {
                        AnonymousClass44.A07(A0B(128, 22, 77), A0B(150, 40, 19));
                        iA8f2 = 0;
                    }
                    interfaceC2443lN.AJJ(iA8f2);
                    this.A0G = ivA07;
                }
            }
            this.A06 = this.A0G.A07.A0B[this.A0G.A01];
            if (this.A0G.A01 < this.A0G.A03) {
                interfaceC2443lN.AJJ(this.A06);
                if (A0f[4].length() != 23) {
                    this.A0G.A02();
                    if (!this.A0G.A09()) {
                        this.A0G = null;
                    }
                } else {
                    A0f[0] = "A3KFlo0OZ1vz3cN";
                    this.A0G.A02();
                    if (!this.A0G.A09()) {
                        this.A0G = null;
                    }
                }
                this.A02 = 3;
                return true;
            }
            if (this.A0G.A05.A02 == 1) {
                this.A06 -= 8;
                interfaceC2443lN.AJJ(8);
            }
            this.A04 = this.A0G.A04();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
            c1327Io = this.A0G.A07;
            c1325Im = this.A0G.A05;
            h10 = this.A0G.A06;
            i10 = this.A0G.A01;
            jA00 = c1327Io.A00(i10);
            if (this.A0T != null) {
                jA00 = this.A0T.A05(jA00);
            }
            i11 = c1325Im.A01;
            if (A0f[0].length() != 15) {
                if (i11 != 0) {
                    bArr = this.A0Q.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    i14 = c1325Im.A01 + 1;
                    i15 = 4 - c1325Im.A01;
                    while (this.A04 < this.A06) {
                        if (this.A05 == 0) {
                            interfaceC2443lN.readFully(bArr, i15, i14);
                            this.A0Q.A0f(i18);
                            iA0C = this.A0Q.A0C();
                            if (iA0C >= i17) {
                                this.A05 = iA0C - 1;
                                this.A0R.A0f(i18);
                                h10.AI7(this.A0R, i16);
                                h10.AI7(this.A0Q, i17);
                                if (this.A0K.length > 0) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                this.A0J = z11;
                                this.A04 += 5;
                                if (A0f[2].length() != 2) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A0f;
                                strArr3[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                                strArr3[6] = "SO50y9aywvhjzs541";
                                this.A06 += i15;
                                i17 = 1;
                            } else {
                                throw new C09222i(A0B(190, 18, 94));
                            }
                        } else {
                            if (this.A0J) {
                                this.A0P.A0d(this.A05);
                                interfaceC2443lN.readFully(this.A0P.A00, i18, this.A05);
                                h10.AI7(this.A0P, this.A05);
                                iAI5 = this.A05;
                                int iA02 = AbstractC1278Gq.A02(this.A0P.A00, this.A0P.A0A());
                                this.A0P.A0f(A0B(756, 10, 83).equals(c1325Im.A07.A0W) ? 1 : 0);
                                this.A0P.A0e(iA02);
                                JG.A03(jA00, this.A0P, this.A0K);
                            } else {
                                iAI5 = h10.AI5(interfaceC2443lN, this.A05, false);
                            }
                            this.A04 += iAI5;
                            this.A05 -= iAI5;
                            i16 = 4;
                            i17 = 1;
                            i18 = 0;
                        }
                    }
                } else {
                    if (this.A0I) {
                        GI.A07(this.A06, this.A0S);
                        int iA0A = this.A0S.A0A();
                        h10.AI7(this.A0S, iA0A);
                        this.A06 += iA0A;
                        this.A04 += iA0A;
                        this.A0I = false;
                    }
                    while (this.A04 < this.A06) {
                        i12 = this.A06 - this.A04;
                        if (A0f[4].length() != 23) {
                            A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                            this.A04 += h10.AI5(interfaceC2443lN, i12, false);
                        }
                    }
                }
                z10 = c1327Io.A0G[i10];
                c1287Gz = null;
                c1326InA00 = this.A0G.A00();
                r11 = z10;
                if (c1326InA00 != null) {
                    int i19 = (z10 ? 1 : 0) | 1073741824;
                    c1287Gz = c1326InA00.A01;
                    r11 = i19;
                }
                i13 = r11;
                if (this.A0G != null) {
                    str = this.A0G.A05.A07.A0W;
                    strArr2 = A0f;
                    if (strArr2[3].length() != strArr2[6].length()) {
                        A0f[2] = "aG";
                        if (str == A0B(735, 21, 64)) {
                            i13 = r11;
                            i13 = r11;
                            i13 = r11;
                            i13 = (r11 == true ? 1 : 0) | true;
                        }
                    }
                }
                i13 = r11;
                i13 = r11;
                i13 = r11;
                i13 = r11;
                i13 = r11;
                i13 = r11;
                long j10 = jA00;
                h10.AIA(jA00, i13, this.A06, 0, c1287Gz);
                this.A0A = j10;
                A0F(j10);
                if (!this.A0G.A09()) {
                    strArr = A0f;
                    if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                        this.A0G = null;
                    } else {
                        String[] strArr4 = A0f;
                        strArr4[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                        strArr4[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                        this.A0G = null;
                    }
                }
                this.A02 = 3;
                return true;
            }
            String[] strArr5 = A0f;
            strArr5[1] = "1reQ2pcS16Hgv6ya8EYaKcYHA8e9gTqM";
            strArr5[5] = "zXUoCiVQDhh6v7GYUtROZrCHyvEA77y8";
            if (i11 != 0) {
                bArr = this.A0Q.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i14 = c1325Im.A01 + 1;
                i15 = 4 - c1325Im.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC2443lN.readFully(bArr, i15, i14);
                        this.A0Q.A0f(i18);
                        iA0C = this.A0Q.A0C();
                        if (iA0C >= i17) {
                            this.A05 = iA0C - 1;
                            this.A0R.A0f(i18);
                            h10.AI7(this.A0R, i16);
                            h10.AI7(this.A0Q, i17);
                            if (this.A0K.length > 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            this.A0J = z11;
                            this.A04 += 5;
                            if (A0f[2].length() != 2) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0f;
                            strArr6[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                            strArr6[6] = "SO50y9aywvhjzs541";
                            this.A06 += i15;
                            i17 = 1;
                        } else {
                            throw new C09222i(A0B(190, 18, 94));
                        }
                    } else {
                        if (this.A0J) {
                            this.A0P.A0d(this.A05);
                            interfaceC2443lN.readFully(this.A0P.A00, i18, this.A05);
                            h10.AI7(this.A0P, this.A05);
                            iAI5 = this.A05;
                            int iA03 = AbstractC1278Gq.A02(this.A0P.A00, this.A0P.A0A());
                            this.A0P.A0f(A0B(756, 10, 83).equals(c1325Im.A07.A0W) ? 1 : 0);
                            this.A0P.A0e(iA03);
                            JG.A03(jA00, this.A0P, this.A0K);
                        } else {
                            iAI5 = h10.AI5(interfaceC2443lN, this.A05, false);
                        }
                        this.A04 += iAI5;
                        this.A05 -= iAI5;
                        i16 = 4;
                        i17 = 1;
                        i18 = 0;
                    }
                }
            } else {
                if (this.A0I) {
                    GI.A07(this.A06, this.A0S);
                    int iA0A2 = this.A0S.A0A();
                    h10.AI7(this.A0S, iA0A2);
                    this.A06 += iA0A2;
                    this.A04 += iA0A2;
                    this.A0I = false;
                }
                while (this.A04 < this.A06) {
                    i12 = this.A06 - this.A04;
                    if (A0f[4].length() != 23) {
                        A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                        this.A04 += h10.AI5(interfaceC2443lN, i12, false);
                    }
                }
            }
            z10 = c1327Io.A0G[i10];
            c1287Gz = null;
            c1326InA00 = this.A0G.A00();
            r11 = z10;
            if (c1326InA00 != null) {
                int i110 = (z10 ? 1 : 0) | 1073741824;
                c1287Gz = c1326InA00.A01;
                r11 = i110;
            }
            i13 = r11;
            if (this.A0G != null) {
                str = this.A0G.A05.A07.A0W;
                strArr2 = A0f;
                if (strArr2[3].length() != strArr2[6].length()) {
                    A0f[2] = "aG";
                    if (str == A0B(735, 21, 64)) {
                        i13 = r11;
                        i13 = r11;
                        i13 = r11;
                        i13 = (r11 == true ? 1 : 0) | true;
                    }
                }
            }
            i13 = r11;
            i13 = r11;
            i13 = r11;
            i13 = r11;
            i13 = r11;
            i13 = r11;
            long j11 = jA00;
            h10.AIA(jA00, i13, this.A06, 0, c1287Gz);
            this.A0A = j11;
            A0F(j11);
            if (!this.A0G.A09()) {
                strArr = A0f;
                if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                    this.A0G = null;
                } else {
                    String[] strArr7 = A0f;
                    strArr7[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                    strArr7[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                    this.A0G = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        c1327Io = this.A0G.A07;
        c1325Im = this.A0G.A05;
        h10 = this.A0G.A06;
        i10 = this.A0G.A01;
        jA00 = c1327Io.A00(i10);
        if (this.A0T != null) {
            jA00 = this.A0T.A05(jA00);
        }
        i11 = c1325Im.A01;
        if (A0f[0].length() != 15) {
            if (i11 != 0) {
                bArr = this.A0Q.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i14 = c1325Im.A01 + 1;
                i15 = 4 - c1325Im.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC2443lN.readFully(bArr, i15, i14);
                        this.A0Q.A0f(i18);
                        iA0C = this.A0Q.A0C();
                        if (iA0C >= i17) {
                            this.A05 = iA0C - 1;
                            this.A0R.A0f(i18);
                            h10.AI7(this.A0R, i16);
                            h10.AI7(this.A0Q, i17);
                            if (this.A0K.length > 0 || !AbstractC1278Gq.A0I(c1325Im.A07.A0W, bArr[i16])) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            this.A0J = z11;
                            this.A04 += 5;
                            if (A0f[2].length() != 2) {
                                throw new RuntimeException();
                            }
                            String[] strArr8 = A0f;
                            strArr8[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                            strArr8[6] = "SO50y9aywvhjzs541";
                            this.A06 += i15;
                            i17 = 1;
                        } else {
                            throw new C09222i(A0B(190, 18, 94));
                        }
                    } else {
                        if (this.A0J) {
                            this.A0P.A0d(this.A05);
                            interfaceC2443lN.readFully(this.A0P.A00, i18, this.A05);
                            h10.AI7(this.A0P, this.A05);
                            iAI5 = this.A05;
                            int iA04 = AbstractC1278Gq.A02(this.A0P.A00, this.A0P.A0A());
                            this.A0P.A0f(A0B(756, 10, 83).equals(c1325Im.A07.A0W) ? 1 : 0);
                            this.A0P.A0e(iA04);
                            JG.A03(jA00, this.A0P, this.A0K);
                        } else {
                            iAI5 = h10.AI5(interfaceC2443lN, this.A05, false);
                        }
                        this.A04 += iAI5;
                        this.A05 -= iAI5;
                        i16 = 4;
                        i17 = 1;
                        i18 = 0;
                    }
                }
            } else {
                if (this.A0I) {
                    GI.A07(this.A06, this.A0S);
                    int iA0A3 = this.A0S.A0A();
                    h10.AI7(this.A0S, iA0A3);
                    this.A06 += iA0A3;
                    this.A04 += iA0A3;
                    this.A0I = false;
                }
                while (this.A04 < this.A06) {
                    i12 = this.A06 - this.A04;
                    if (A0f[4].length() != 23) {
                        A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                        this.A04 += h10.AI5(interfaceC2443lN, i12, false);
                    }
                }
            }
            z10 = c1327Io.A0G[i10];
            c1287Gz = null;
            c1326InA00 = this.A0G.A00();
            r11 = z10;
            if (c1326InA00 != null) {
                int i111 = (z10 ? 1 : 0) | 1073741824;
                c1287Gz = c1326InA00.A01;
                r11 = i111;
            }
            i13 = r11;
            if (this.A0G != null && this.A0G.A05 != null && this.A0G.A05.A07 != null) {
                str = this.A0G.A05.A07.A0W;
                strArr2 = A0f;
                if (strArr2[3].length() != strArr2[6].length()) {
                    A0f[2] = "aG";
                    if (str == A0B(735, 21, 64)) {
                        i13 = r11;
                        i13 = r11;
                        i13 = r11;
                        i13 = (r11 == true ? 1 : 0) | true;
                    }
                }
            }
            i13 = r11;
            i13 = r11;
            i13 = r11;
            i13 = r11;
            i13 = r11;
            i13 = r11;
            long j12 = jA00;
            h10.AIA(jA00, i13, this.A06, 0, c1287Gz);
            this.A0A = j12;
            A0F(j12);
            if (!this.A0G.A09()) {
                strArr = A0f;
                if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                    this.A0G = null;
                } else {
                    String[] strArr9 = A0f;
                    strArr9[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                    strArr9[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                    this.A0G = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        String[] strArr10 = A0f;
        strArr10[1] = "1reQ2pcS16Hgv6ya8EYaKcYHA8e9gTqM";
        strArr10[5] = "zXUoCiVQDhh6v7GYUtROZrCHyvEA77y8";
        if (i11 != 0) {
            bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            i14 = c1325Im.A01 + 1;
            i15 = 4 - c1325Im.A01;
            while (this.A04 < this.A06) {
                if (this.A05 == 0) {
                    interfaceC2443lN.readFully(bArr, i15, i14);
                    this.A0Q.A0f(i18);
                    iA0C = this.A0Q.A0C();
                    if (iA0C >= i17) {
                        this.A05 = iA0C - 1;
                        this.A0R.A0f(i18);
                        h10.AI7(this.A0R, i16);
                        h10.AI7(this.A0Q, i17);
                        if (this.A0K.length > 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        this.A0J = z11;
                        this.A04 += 5;
                        if (A0f[2].length() != 2) {
                            throw new RuntimeException();
                        }
                        String[] strArr11 = A0f;
                        strArr11[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
                        strArr11[6] = "SO50y9aywvhjzs541";
                        this.A06 += i15;
                        i17 = 1;
                    } else {
                        throw new C09222i(A0B(190, 18, 94));
                    }
                } else {
                    if (this.A0J) {
                        this.A0P.A0d(this.A05);
                        interfaceC2443lN.readFully(this.A0P.A00, i18, this.A05);
                        h10.AI7(this.A0P, this.A05);
                        iAI5 = this.A05;
                        int iA05 = AbstractC1278Gq.A02(this.A0P.A00, this.A0P.A0A());
                        this.A0P.A0f(A0B(756, 10, 83).equals(c1325Im.A07.A0W) ? 1 : 0);
                        this.A0P.A0e(iA05);
                        JG.A03(jA00, this.A0P, this.A0K);
                    } else {
                        iAI5 = h10.AI5(interfaceC2443lN, this.A05, false);
                    }
                    this.A04 += iAI5;
                    this.A05 -= iAI5;
                    i16 = 4;
                    i17 = 1;
                    i18 = 0;
                }
            }
        } else {
            if (this.A0I) {
                GI.A07(this.A06, this.A0S);
                int iA0A4 = this.A0S.A0A();
                h10.AI7(this.A0S, iA0A4);
                this.A06 += iA0A4;
                this.A04 += iA0A4;
                this.A0I = false;
            }
            while (this.A04 < this.A06) {
                i12 = this.A06 - this.A04;
                if (A0f[4].length() != 23) {
                    A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
                    this.A04 += h10.AI5(interfaceC2443lN, i12, false);
                }
            }
        }
        z10 = c1327Io.A0G[i10];
        c1287Gz = null;
        c1326InA00 = this.A0G.A00();
        r11 = z10;
        if (c1326InA00 != null) {
            int i112 = (z10 ? 1 : 0) | 1073741824;
            c1287Gz = c1326InA00.A01;
            r11 = i112;
        }
        i13 = r11;
        if (this.A0G != null) {
            str = this.A0G.A05.A07.A0W;
            strArr2 = A0f;
            if (strArr2[3].length() != strArr2[6].length()) {
                A0f[2] = "aG";
                if (str == A0B(735, 21, 64)) {
                    i13 = r11;
                    i13 = r11;
                    i13 = r11;
                    i13 = (r11 == true ? 1 : 0) | true;
                }
            }
        }
        i13 = r11;
        i13 = r11;
        i13 = r11;
        i13 = r11;
        i13 = r11;
        i13 = r11;
        long j13 = jA00;
        h10.AIA(jA00, i13, this.A06, 0, c1287Gz);
        this.A0A = j13;
        A0F(j13);
        if (!this.A0G.A09()) {
            strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                this.A0G = null;
            } else {
                String[] strArr12 = A0f;
                strArr12[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
                strArr12[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
                this.A0G = null;
            }
        }
        this.A02 = 3;
        return true;
        i13 = r11;
        i13 = r11;
        throw new RuntimeException();
    }

    public static /* synthetic */ GX[] A0b() {
        return new GX[]{new C2407kb()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0F = gy;
        if (this.A0W != null) {
            IV iv = new IV(gy.AJh(0, this.A0W.A03));
            iv.A08(this.A0W, new IP(0, 0, 0, 0));
            this.A0D.put(0, iv);
            A0D();
            this.A0F.A6G();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2443lN interfaceC2443lN, C1281Gt c1281Gt) throws IOException {
        while (true) {
            int i10 = this.A02;
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[3] = "yYIiClYY3RZS73RDJ5vLPk2bDdZFXU";
            strArr[6] = "bGm4sUzBrXbQjG5ES";
            switch (i10) {
                case 0:
                    if (!A0Z(interfaceC2443lN)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0N(interfaceC2443lN);
                    break;
                case 2:
                    A0O(interfaceC2443lN);
                    break;
                default:
                    if (A0a(interfaceC2443lN)) {
                        return 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        int size = this.A0D.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0D.valueAt(i10).A05();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0B = j11;
        this.A0X.clear();
        this.A0I = false;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2443lN interfaceC2443lN) throws IOException {
        return AbstractC1323Ik.A01(interfaceC2443lN);
    }
}
