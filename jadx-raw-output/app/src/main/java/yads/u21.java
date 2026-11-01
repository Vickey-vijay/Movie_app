package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import yads.u21;

/* JADX INFO: loaded from: classes9.dex */
public final class u21 extends dz2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s21 f83330b = new s21() { // from class: cp.ta
        @Override // yads.s21
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return u21.b(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s21 f83331a;

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return C.UTF16_NAME;
        }
        if (i10 != 2) {
            return i10 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    public static wt b(jb2 jb2Var, int i10, int i11, boolean z10, int i12, s21 s21Var) {
        int i13 = jb2Var.f78967b;
        int iB = b(i13, jb2Var.f78966a);
        String str = new String(jb2Var.f78966a, i13, iB - i13, "ISO-8859-1");
        jb2Var.e(iB + 1);
        int iM = jb2Var.m();
        boolean z11 = (iM & 2) != 0;
        boolean z12 = (iM & 1) != 0;
        int iM2 = jb2Var.m();
        String[] strArr = new String[iM2];
        for (int i14 = 0; i14 < iM2; i14++) {
            int i15 = jb2Var.f78967b;
            int iB2 = b(i15, jb2Var.f78966a);
            strArr[i14] = new String(jb2Var.f78966a, i15, iB2 - i15, "ISO-8859-1");
            jb2Var.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (jb2Var.f78967b < i16) {
            v21 v21VarA = a(i11, jb2Var, z10, i12, s21Var);
            if (v21VarA != null) {
                arrayList.add(v21VarA);
            }
        }
        return new wt(str, z11, z12, strArr, (v21[]) arrayList.toArray(new v21[0]));
    }

    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static y53 e(int i10, jb2 jb2Var) {
        if (i10 < 1) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new y53("TXXX", str, a(iA2, a(bArr, iA2, iM), strB, bArr));
    }

    public static ua3 f(int i10, jb2 jb2Var) {
        if (i10 < 1) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new ua3("WXXX", str, a(iA2, b(iA2, bArr), "ISO-8859-1", bArr));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2 A[SYNTHETIC] */
    public final ts1 a(int i10, byte[] bArr) {
        boolean z10;
        t21 t21Var;
        int i11;
        int iG;
        v21 v21VarA;
        ArrayList arrayList = new ArrayList();
        jb2 jb2Var = new jb2(i10, bArr);
        boolean z11 = false;
        if (i10 - jb2Var.f78967b < 10) {
            ih1.d("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iO = jb2Var.o();
            if (iO == 4801587) {
                int iM = jb2Var.m();
                jb2Var.e(jb2Var.f78967b + 1);
                int iM2 = jb2Var.m();
                int iL = jb2Var.l();
                if (iM != 2) {
                    if (iM == 3) {
                        if ((iM2 & 64) != 0) {
                            int iB = jb2Var.b();
                            jb2Var.e(jb2Var.f78967b + iB);
                            iL -= iB + 4;
                        }
                    } else if (iM == 4) {
                        if ((iM2 & 64) != 0) {
                            int iL2 = jb2Var.l();
                            jb2Var.e(jb2Var.f78967b + (iL2 - 4));
                            iL -= iL2;
                        }
                        if ((iM2 & 16) != 0) {
                            iL -= 10;
                        }
                    } else {
                        kf1.a("Skipped ID3 tag with unsupported majorVersion=", iM, "Id3Decoder");
                    }
                    if (iM < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    t21Var = new t21(iM, iL, z10);
                } else if ((iM2 & 64) != 0) {
                    ih1.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iM < 4 || (iM2 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    t21Var = new t21(iM, iL, z10);
                }
                if (t21Var == null) {
                    return null;
                }
                int i12 = jb2Var.f78967b;
                i11 = t21Var.f82868a == 2 ? 6 : 10;
                iG = t21Var.f82870c;
                if (t21Var.f82869b) {
                    iG = g(iG, jb2Var);
                }
                jb2Var.d(i12 + iG);
                if (!a(jb2Var, t21Var.f82868a, i11, false)) {
                    if (t21Var.f82868a == 4 || !a(jb2Var, 4, i11, true)) {
                        ih1.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + t21Var.f82868a);
                        return null;
                    }
                    z11 = true;
                }
                while (jb2Var.f78968c - jb2Var.f78967b >= i11) {
                    v21VarA = a(t21Var.f82868a, jb2Var, z11, i11, this.f83331a);
                    if (v21VarA != null) {
                        arrayList.add(v21VarA);
                    }
                }
                return new ts1(arrayList);
            }
            ih1.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iO))));
        }
        t21Var = null;
        if (t21Var == null) {
            return null;
        }
        int i13 = jb2Var.f78967b;
        if (t21Var.f82868a == 2) {
        }
        iG = t21Var.f82870c;
        if (t21Var.f82869b) {
            iG = g(iG, jb2Var);
        }
        jb2Var.d(i13 + iG);
        if (!a(jb2Var, t21Var.f82868a, i11, false)) {
            if (t21Var.f82868a == 4) {
            }
            ih1.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + t21Var.f82868a);
            return null;
        }
        while (jb2Var.f78968c - jb2Var.f78967b >= i11) {
            v21VarA = a(t21Var.f82868a, jb2Var, z11, i11, this.f83331a);
            if (v21VarA != null) {
                arrayList.add(v21VarA);
            }
        }
        return new ts1(arrayList);
    }

    public static vi2 d(int i10, jb2 jb2Var) {
        byte[] bArr = new byte[i10];
        jb2Var.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        return new vi2(str, i10 <= i11 ? ib3.f78561f : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static int g(int i10, jb2 jb2Var) {
        byte[] bArr = jb2Var.f78966a;
        int i11 = jb2Var.f78967b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    public u21(s21 s21Var) {
        this.f83331a = s21Var;
    }

    public static kt1 c(int i10, jb2 jb2Var) {
        int iR = jb2Var.r();
        int iO = jb2Var.o();
        int iO2 = jb2Var.o();
        int iM = jb2Var.m();
        int iM2 = jb2Var.m();
        ib2 ib2Var = new ib2();
        ib2Var.a(jb2Var.f78968c, jb2Var.f78966a);
        ib2Var.b(jb2Var.f78967b * 8);
        int i11 = ((i10 - 10) * 8) / (iM + iM2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iA = ib2Var.a(iM);
            int iA2 = ib2Var.a(iM2);
            iArr[i12] = iA;
            iArr2[i12] = iA2;
        }
        return new kt1(iR, iO, iO2, iArr, iArr2);
    }

    public static bz0 b(int i10, jb2 jb2Var) {
        byte[] bArrCopyOfRange;
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iM);
        String strA = a(i12, iA, strB, bArr);
        int iA2 = a(iM) + iA;
        int iA3 = a(bArr, iA2, iM);
        String strA2 = a(iA2, iA3, strB, bArr);
        int iA4 = a(iM) + iA3;
        if (i11 <= iA4) {
            bArrCopyOfRange = ib3.f78561f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA4, i11);
        }
        return new bz0(str, strA, strA2, bArrCopyOfRange);
    }

    @Override // yads.dz2
    public final ts1 a(ws1 ws1Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }

    public static ag a(int i10, int i11, jb2 jb2Var) {
        int iB;
        String strConcat;
        byte[] bArrCopyOfRange;
        int iM = jb2Var.m();
        String strB = b(iM);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        jb2Var.a(bArr, 0, i12);
        if (i11 == 2) {
            String str = "image/" + ki.a(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strConcat = str;
            iB = 2;
        } else {
            iB = b(0, bArr);
            String strA = ki.a(new String(bArr, 0, iB, "ISO-8859-1"));
            strConcat = strA.indexOf(47) == -1 ? "image/".concat(strA) : strA;
        }
        int i13 = bArr[iB + 1] & 255;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iM);
        String str2 = new String(bArr, i14, iA - i14, strB);
        int iA2 = a(iM) + iA;
        if (i12 <= iA2) {
            bArrCopyOfRange = ib3.f78561f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA2, i12);
        }
        return new ag(strConcat, str2, i13, bArrCopyOfRange);
    }

    public static ua3 b(int i10, jb2 jb2Var, String str) {
        byte[] bArr = new byte[i10];
        jb2Var.a(bArr, 0, i10);
        return new ua3(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static int b(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static ut a(jb2 jb2Var, int i10, int i11, boolean z10, int i12, s21 s21Var) {
        int i13 = jb2Var.f78967b;
        int iB = b(i13, jb2Var.f78966a);
        String str = new String(jb2Var.f78966a, i13, iB - i13, "ISO-8859-1");
        jb2Var.e(iB + 1);
        int iB2 = jb2Var.b();
        int iB3 = jb2Var.b();
        long jN = jb2Var.n();
        long j10 = jN == 4294967295L ? -1L : jN;
        long jN2 = jb2Var.n();
        long j11 = jN2 == 4294967295L ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (jb2Var.f78967b < i14) {
            v21 v21VarA = a(i11, jb2Var, z10, i12, s21Var);
            if (v21VarA != null) {
                arrayList.add(v21VarA);
            }
        }
        return new ut(str, iB2, iB3, j10, j11, (v21[]) arrayList.toArray(new v21[0]));
    }

    public static px a(int i10, jb2 jb2Var) {
        if (i10 < 4) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        byte[] bArr = new byte[3];
        jb2Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        jb2Var.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iM);
        String str2 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new px(str, str2, a(iA2, a(bArr2, iA2, iM), strB, bArr2));
    }

    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ed A[Catch: all -> 0x012d, UnsupportedEncodingException -> 0x0130, TryCatch #1 {UnsupportedEncodingException -> 0x0130, blocks: (B:91:0x011b, B:160:0x01ff, B:93:0x0123, B:103:0x0140, B:105:0x0148, B:113:0x0162, B:122:0x017a, B:133:0x0195, B:140:0x01a7, B:146:0x01b6, B:151:0x01ce, B:157:0x01e8, B:158:0x01ed), top: B:175:0x0111 }] */
    public static v21 a(int i10, jb2 jb2Var, boolean z10, int i11, s21 s21Var) {
        int iO;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        v21 mpVar;
        int iM = jb2Var.m();
        int iM2 = jb2Var.m();
        int iM3 = jb2Var.m();
        int iM4 = i10 >= 3 ? jb2Var.m() : 0;
        if (i10 == 4) {
            iO = jb2Var.p();
            if (!z10) {
                iO = (((iO >> 24) & 255) << 21) | (iO & 255) | (((iO >> 8) & 255) << 7) | (((iO >> 16) & 255) << 14);
            }
        } else if (i10 == 3) {
            iO = jb2Var.p();
        } else {
            iO = jb2Var.o();
        }
        int i13 = iO;
        int iR = i10 >= 3 ? jb2Var.r() : 0;
        if (iM == 0 && iM2 == 0 && iM3 == 0 && iM4 == 0 && i13 == 0 && iR == 0) {
            jb2Var.e(jb2Var.f78968c);
            return null;
        }
        int i14 = jb2Var.f78967b + i13;
        if (i14 > jb2Var.f78968c) {
            ih1.d("Id3Decoder", "Frame size exceeds remaining tag data");
            jb2Var.e(jb2Var.f78968c);
            return null;
        }
        if (s21Var != null) {
            i12 = i14;
            if (!s21Var.a(i10, iM, iM2, iM3, iM4)) {
                jb2Var.e(i12);
                return null;
            }
        } else {
            i12 = i14;
        }
        if (i10 == 3) {
            z11 = (iR & 128) != 0;
            boolean z16 = (iR & 64) != 0;
            z14 = (iR & 32) != 0;
            z15 = false;
            z13 = z16;
            z12 = z11;
        } else if (i10 == 4) {
            boolean z17 = (iR & 64) != 0;
            z11 = (iR & 8) != 0;
            boolean z18 = (iR & 4) != 0;
            boolean z19 = (iR & 2) != 0;
            if ((iR & 1) != 0) {
                z15 = z19;
                z14 = z17;
                z13 = z18;
                z12 = true;
            } else {
                z15 = z19;
                z14 = z17;
                z13 = z18;
                z12 = false;
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (!z11 && !z13) {
            if (z14) {
                i13--;
                jb2Var.e(jb2Var.f78967b + 1);
            }
            if (z12) {
                i13 -= 4;
                jb2Var.e(jb2Var.f78967b + 4);
            }
            int iG = i13;
            if (z15) {
                iG = g(iG, jb2Var);
            }
            int i15 = iG;
            try {
                try {
                    if (iM == 84 && iM2 == 88 && iM3 == 88 && (i10 == 2 || iM4 == 88)) {
                        mpVar = e(i15, jb2Var);
                    } else if (iM == 84) {
                        mpVar = a(i15, jb2Var, a(i10, iM, iM2, iM3, iM4));
                    } else if (iM == 87 && iM2 == 88 && iM3 == 88 && (i10 == 2 || iM4 == 88)) {
                        mpVar = f(i15, jb2Var);
                    } else if (iM == 87) {
                        mpVar = b(i15, jb2Var, a(i10, iM, iM2, iM3, iM4));
                    } else if (iM == 80 && iM2 == 82 && iM3 == 73 && iM4 == 86) {
                        mpVar = d(i15, jb2Var);
                    } else if (iM == 71 && iM2 == 69 && iM3 == 79 && (iM4 == 66 || i10 == 2)) {
                        mpVar = b(i15, jb2Var);
                    } else if (i10 == 2) {
                        if (iM == 80 && iM2 == 73 && iM3 == 67) {
                            mpVar = a(i15, i10, jb2Var);
                        } else if (iM != 67 && iM2 == 79 && iM3 == 77 && (iM4 == 77 || i10 == 2)) {
                            mpVar = a(i15, jb2Var);
                        } else if (iM != 67 && iM2 == 72 && iM3 == 65 && iM4 == 80) {
                            mpVar = a(jb2Var, i15, i10, z10, i11, s21Var);
                        } else if (iM != 67 && iM2 == 84 && iM3 == 79 && iM4 == 67) {
                            mpVar = b(jb2Var, i15, i10, z10, i11, s21Var);
                        } else if (iM != 77 && iM2 == 76 && iM3 == 76 && iM4 == 84) {
                            mpVar = c(i15, jb2Var);
                        } else {
                            String strA = a(i10, iM, iM2, iM3, iM4);
                            byte[] bArr = new byte[i15];
                            jb2Var.a(bArr, 0, i15);
                            mpVar = new mp(strA, bArr);
                        }
                    } else if (iM == 65 && iM2 == 80 && iM3 == 73 && iM4 == 67) {
                        mpVar = a(i15, i10, jb2Var);
                    } else if (iM != 67) {
                        if (iM != 67) {
                            if (iM != 67) {
                                if (iM != 77) {
                                    String strA2 = a(i10, iM, iM2, iM3, iM4);
                                    byte[] bArr2 = new byte[i15];
                                    jb2Var.a(bArr2, 0, i15);
                                    mpVar = new mp(strA2, bArr2);
                                } else {
                                    String strA3 = a(i10, iM, iM2, iM3, iM4);
                                    byte[] bArr3 = new byte[i15];
                                    jb2Var.a(bArr3, 0, i15);
                                    mpVar = new mp(strA3, bArr3);
                                }
                            } else if (iM != 77) {
                                String strA4 = a(i10, iM, iM2, iM3, iM4);
                                byte[] bArr4 = new byte[i15];
                                jb2Var.a(bArr4, 0, i15);
                                mpVar = new mp(strA4, bArr4);
                            } else {
                                String strA5 = a(i10, iM, iM2, iM3, iM4);
                                byte[] bArr5 = new byte[i15];
                                jb2Var.a(bArr5, 0, i15);
                                mpVar = new mp(strA5, bArr5);
                            }
                        } else if (iM != 67) {
                            if (iM != 77) {
                                String strA6 = a(i10, iM, iM2, iM3, iM4);
                                byte[] bArr6 = new byte[i15];
                                jb2Var.a(bArr6, 0, i15);
                                mpVar = new mp(strA6, bArr6);
                            } else {
                                String strA7 = a(i10, iM, iM2, iM3, iM4);
                                byte[] bArr7 = new byte[i15];
                                jb2Var.a(bArr7, 0, i15);
                                mpVar = new mp(strA7, bArr7);
                            }
                        } else if (iM != 77) {
                            String strA8 = a(i10, iM, iM2, iM3, iM4);
                            byte[] bArr8 = new byte[i15];
                            jb2Var.a(bArr8, 0, i15);
                            mpVar = new mp(strA8, bArr8);
                        } else {
                            String strA9 = a(i10, iM, iM2, iM3, iM4);
                            byte[] bArr9 = new byte[i15];
                            jb2Var.a(bArr9, 0, i15);
                            mpVar = new mp(strA9, bArr9);
                        }
                    } else if (iM != 67) {
                        if (iM != 67) {
                            if (iM != 77) {
                                String strA10 = a(i10, iM, iM2, iM3, iM4);
                                byte[] bArr10 = new byte[i15];
                                jb2Var.a(bArr10, 0, i15);
                                mpVar = new mp(strA10, bArr10);
                            } else {
                                String strA11 = a(i10, iM, iM2, iM3, iM4);
                                byte[] bArr11 = new byte[i15];
                                jb2Var.a(bArr11, 0, i15);
                                mpVar = new mp(strA11, bArr11);
                            }
                        } else if (iM != 77) {
                            String strA12 = a(i10, iM, iM2, iM3, iM4);
                            byte[] bArr12 = new byte[i15];
                            jb2Var.a(bArr12, 0, i15);
                            mpVar = new mp(strA12, bArr12);
                        } else {
                            String strA13 = a(i10, iM, iM2, iM3, iM4);
                            byte[] bArr13 = new byte[i15];
                            jb2Var.a(bArr13, 0, i15);
                            mpVar = new mp(strA13, bArr13);
                        }
                    } else if (iM != 67) {
                        if (iM != 77) {
                            String strA14 = a(i10, iM, iM2, iM3, iM4);
                            byte[] bArr14 = new byte[i15];
                            jb2Var.a(bArr14, 0, i15);
                            mpVar = new mp(strA14, bArr14);
                        } else {
                            String strA15 = a(i10, iM, iM2, iM3, iM4);
                            byte[] bArr15 = new byte[i15];
                            jb2Var.a(bArr15, 0, i15);
                            mpVar = new mp(strA15, bArr15);
                        }
                    } else if (iM != 77) {
                        String strA16 = a(i10, iM, iM2, iM3, iM4);
                        byte[] bArr16 = new byte[i15];
                        jb2Var.a(bArr16, 0, i15);
                        mpVar = new mp(strA16, bArr16);
                    } else {
                        String strA17 = a(i10, iM, iM2, iM3, iM4);
                        byte[] bArr17 = new byte[i15];
                        jb2Var.a(bArr17, 0, i15);
                        mpVar = new mp(strA17, bArr17);
                    }
                    if (mpVar == null) {
                        str = r4;
                        try {
                            ih1.d(str, "Failed to decode frame: id=" + a(i10, iM, iM2, iM3, iM4) + ", frameSize=" + i15);
                        } catch (UnsupportedEncodingException unused) {
                            ih1.d(str, "Unsupported character encoding");
                            jb2Var.e(i12);
                            return null;
                        }
                    }
                    jb2Var.e(i12);
                    return mpVar;
                } catch (UnsupportedEncodingException unused2) {
                    str = r4;
                }
            } catch (Throwable th2) {
                jb2Var.e(i12);
                throw th2;
            }
        } else {
            ih1.d("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            jb2Var.e(i12);
            return null;
        }
    }

    public static String a(int i10, int i11, String str, byte[] bArr) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    public static y53 a(int i10, jb2 jb2Var, String str) {
        if (i10 < 1) {
            return null;
        }
        int iM = jb2Var.m();
        String strB = b(iM);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        jb2Var.a(bArr, 0, i11);
        return new y53(str, null, new String(bArr, 0, a(bArr, 0, iM), strB));
    }

    public static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int a(byte[] bArr, int i10, int i11) {
        int iB = b(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i10) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[PHI: r3
  0x0086: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:39:0x0083, B:31:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(jb2 jb2Var, int i10, int i11, boolean z10) {
        int iO;
        long jO;
        int iR;
        int i12;
        int i13 = jb2Var.f78967b;
        while (true) {
            try {
                boolean z11 = true;
                if (jb2Var.f78968c - jb2Var.f78967b < i11) {
                    jb2Var.e(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iO = jb2Var.b();
                    jO = jb2Var.n();
                    iR = jb2Var.r();
                } else {
                    iO = jb2Var.o();
                    jO = jb2Var.o();
                    iR = 0;
                }
                if (iO == 0 && jO == 0 && iR == 0) {
                    jb2Var.e(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jO) != 0) {
                        jb2Var.e(i13);
                        return false;
                    }
                    jO = (((jO >> 24) & 255) << 21) | (jO & 255) | (((jO >> 8) & 255) << 7) | (((jO >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iR & 64) != 0 ? 1 : 0;
                    if ((iR & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iR & 32) != 0 ? 1 : 0;
                    if ((iR & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jO < i12) {
                    jb2Var.e(i13);
                    return false;
                }
                int i14 = jb2Var.f78968c;
                int i15 = jb2Var.f78967b;
                if (i14 - i15 < jO) {
                    jb2Var.e(i13);
                    return false;
                }
                jb2Var.e(i15 + ((int) jO));
            } catch (Throwable th2) {
                jb2Var.e(i13);
                throw th2;
            }
        }
    }
}
