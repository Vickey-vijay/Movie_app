package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17490b = z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.l f17491a;

    public n() {
        this.f17491a = null;
    }

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static h b(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, boolean z10, int i12, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        int i13 = nVar.f17846b;
        int iB = b(i13, nVar.f17845a);
        String str = new String(nVar.f17845a, i13, iB - i13, "ISO-8859-1");
        nVar.e(iB + 1);
        int iJ = nVar.j();
        boolean z11 = (iJ & 2) != 0;
        boolean z12 = (iJ & 1) != 0;
        int iJ2 = nVar.j();
        String[] strArr = new String[iJ2];
        for (int i14 = 0; i14 < iJ2; i14++) {
            int i15 = nVar.f17846b;
            int iB2 = b(i15, nVar.f17845a);
            strArr[i14] = new String(nVar.f17845a, i15, iB2 - i15, "ISO-8859-1");
            nVar.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (nVar.f17846b < i16) {
            o oVarA = a(i11, nVar, z10, i12, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new h(str, z11, z12, strArr, oVarArr);
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

    public static s d(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new s("TXXX", str, iA2 < i11 ? new String(bArr, iA2, a(bArr, iA2, iJ) - iA2, strB) : "");
    }

    public static u e(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new u("WXXX", str, iA2 < i11 ? new String(bArr, iA2, b(iA2, bArr) - iA2, "ISO-8859-1") : "");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7 A[SYNTHETIC] */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a(int i10, byte[] bArr) {
        boolean z10;
        m mVar;
        int i11;
        int iF;
        o oVarA;
        ArrayList arrayList = new ArrayList();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i10, bArr);
        boolean z11 = false;
        if (i10 - nVar.f17846b < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iL = nVar.l();
            if (iL == f17490b) {
                int iJ = nVar.j();
                nVar.e(nVar.f17846b + 1);
                int iJ2 = nVar.j();
                int i12 = nVar.i();
                if (iJ != 2) {
                    if (iJ == 3) {
                        if ((iJ2 & 64) != 0) {
                            int iB = nVar.b();
                            nVar.e(nVar.f17846b + iB);
                            i12 -= iB + 4;
                        }
                    } else if (iJ == 4) {
                        if ((iJ2 & 64) != 0) {
                            int i13 = nVar.i();
                            nVar.e(nVar.f17846b + (i13 - 4));
                            i12 -= i13;
                        }
                        if ((iJ2 & 16) != 0) {
                            i12 -= 10;
                        }
                    } else {
                        Log.w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iJ);
                    }
                    if (iJ < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    mVar = new m(z10, iJ, i12);
                } else if ((iJ2 & 64) != 0) {
                    Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iJ < 4 || (iJ2 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    mVar = new m(z10, iJ, i12);
                }
                if (mVar == null) {
                    return null;
                }
                int i14 = nVar.f17846b;
                i11 = mVar.f17487a == 2 ? 6 : 10;
                iF = mVar.f17489c;
                if (mVar.f17488b) {
                    iF = f(iF, nVar);
                }
                nVar.d(i14 + iF);
                if (!a(nVar, mVar.f17487a, i11, false)) {
                    if (mVar.f17487a == 4 || !a(nVar, 4, i11, true)) {
                        Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + mVar.f17487a);
                        return null;
                    }
                    z11 = true;
                }
                while (nVar.f17847c - nVar.f17846b >= i11) {
                    oVarA = a(mVar.f17487a, nVar, z11, i11, this.f17491a);
                    if (oVarA != null) {
                        arrayList.add(oVarA);
                    }
                }
                return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList);
            }
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: " + iL);
        }
        mVar = null;
        if (mVar == null) {
            return null;
        }
        int i15 = nVar.f17846b;
        if (mVar.f17487a == 2) {
        }
        iF = mVar.f17489c;
        if (mVar.f17488b) {
            iF = f(iF, nVar);
        }
        nVar.d(i15 + iF);
        if (!a(nVar, mVar.f17487a, i11, false)) {
            if (mVar.f17487a == 4) {
            }
            Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + mVar.f17487a);
            return null;
        }
        while (nVar.f17847c - nVar.f17846b >= i11) {
            oVarA = a(mVar.f17487a, nVar, z11, i11, this.f17491a);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList);
    }

    public static q c(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = new byte[i10];
        nVar.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        return new q(str, i11 < i10 ? Arrays.copyOfRange(bArr, i11, i10) : new byte[0]);
    }

    public static int f(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = nVar.f17845a;
        int i11 = nVar.f17846b;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return i10;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i10 - i11) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        this.f17491a = lVar;
    }

    public static u b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        byte[] bArr = new byte[i10];
        nVar.a(bArr, 0, i10);
        return new u(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static l b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iJ);
        String str2 = new String(bArr, i12, iA - i12, strB);
        int iA2 = a(iJ) + iA;
        int iA3 = a(bArr, iA2, iJ);
        return new l(str, str2, new String(bArr, iA2, iA3 - iA2, strB), Arrays.copyOfRange(bArr, a(iJ) + iA3, i11));
    }

    public static f a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, boolean z10, int i12, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        int i13 = nVar.f17846b;
        int iB = b(i13, nVar.f17845a);
        String str = new String(nVar.f17845a, i13, iB - i13, "ISO-8859-1");
        nVar.e(iB + 1);
        int iB2 = nVar.b();
        int iB3 = nVar.b();
        long jK = nVar.k();
        long j10 = jK == 4294967295L ? -1L : jK;
        long jK2 = nVar.k();
        long j11 = jK2 == 4294967295L ? -1L : jK2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (nVar.f17846b < i14) {
            o oVarA = a(i11, nVar, z10, i12, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new f(str, iB2, iB3, j10, j11, oVarArr);
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

    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[PHI: r3
  0x0086: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:39:0x0083, B:31:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, boolean z10) {
        int iL;
        long jL;
        int iO;
        int i12;
        int i13 = nVar.f17846b;
        while (true) {
            try {
                boolean z11 = true;
                if (nVar.f17847c - nVar.f17846b < i11) {
                    nVar.e(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iL = nVar.b();
                    jL = nVar.k();
                    iO = nVar.o();
                } else {
                    iL = nVar.l();
                    jL = nVar.l();
                    iO = 0;
                }
                if (iL == 0 && jL == 0 && iO == 0) {
                    nVar.e(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jL) != 0) {
                        nVar.e(i13);
                        return false;
                    }
                    jL = (((jL >> 24) & 255) << 21) | (jL & 255) | (((jL >> 8) & 255) << 7) | (((jL >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iO & 64) != 0 ? 1 : 0;
                    if ((iO & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iO & 32) != 0 ? 1 : 0;
                    if ((iO & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jL < i12) {
                    nVar.e(i13);
                    return false;
                }
                int i14 = nVar.f17847c;
                int i15 = nVar.f17846b;
                if (i14 - i15 < jL) {
                    nVar.e(i13);
                    return false;
                }
                nVar.e(i15 + ((int) jL));
            } catch (Throwable th2) {
                nVar.e(i13);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0199  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e1 A[Catch: all -> 0x0135, UnsupportedEncodingException -> 0x0213, TryCatch #0 {UnsupportedEncodingException -> 0x0213, blocks: (B:162:0x01f4, B:152:0x01c0, B:159:0x01d0, B:160:0x01e1), top: B:171:0x0119 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x01f4 A[Catch: all -> 0x0135, UnsupportedEncodingException -> 0x0213, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0213, blocks: (B:162:0x01f4, B:152:0x01c0, B:159:0x01d0, B:160:0x01e1), top: B:171:0x0119 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:162:0x01f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String] */
    public static o a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10, int i11, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        int iL;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        o dVar;
        int iJ = nVar.j();
        int iJ2 = nVar.j();
        int iJ3 = nVar.j();
        int iJ4 = i10 >= 3 ? nVar.j() : 0;
        if (i10 == 4) {
            iL = nVar.m();
            if (!z10) {
                iL = (((iL >> 24) & 255) << 21) | (iL & 255) | (((iL >> 8) & 255) << 7) | (((iL >> 16) & 255) << 14);
            }
        } else if (i10 == 3) {
            iL = nVar.m();
        } else {
            iL = nVar.l();
        }
        int iO = i10 >= 3 ? nVar.o() : 0;
        if (iJ == 0 && iJ2 == 0 && iJ3 == 0 && iJ4 == 0 && iL == 0 && iO == 0) {
            nVar.e(nVar.f17847c);
            return null;
        }
        int i12 = nVar.f17846b;
        int i13 = i12 + iL;
        if (i13 > nVar.f17847c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            nVar.e(nVar.f17847c);
            return null;
        }
        String str = 67;
        if (lVar != null && (iJ != 67 || iJ2 != 79 || iJ3 != 77 || (iJ4 != 77 && i10 != 2))) {
            nVar.e(i13);
            return null;
        }
        if (i10 == 3) {
            z12 = (iO & 128) != 0;
            boolean z16 = (iO & 64) != 0;
            z11 = (iO & 32) != 0;
            z14 = z16;
            z15 = false;
            z13 = z12;
        } else if (i10 == 4) {
            boolean z17 = (iO & 64) != 0;
            boolean z18 = (iO & 8) != 0;
            z14 = (iO & 4) != 0;
            z15 = (iO & 2) != 0;
            if ((iO & 1) != 0) {
                z11 = z17;
                z12 = z18;
                z13 = true;
            } else {
                z11 = z17;
                z12 = z18;
                z13 = false;
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (!z12 && !z14) {
            if (z11) {
                iL--;
                nVar.e(i12 + 1);
            }
            if (z13) {
                iL -= 4;
                nVar.e(nVar.f17846b + 4);
            }
            if (z15) {
                iL = f(iL, nVar);
            }
            int i14 = iL;
            try {
                try {
                    try {
                        if (iJ == 84 && iJ2 == 88 && iJ3 == 88 && (i10 == 2 || iJ4 == 88)) {
                            dVar = d(i14, nVar);
                        } else if (iJ == 84) {
                            dVar = a(i14, nVar, a(i10, iJ, iJ2, iJ3, iJ4));
                        } else if (iJ == 87 && iJ2 == 88 && iJ3 == 88 && (i10 == 2 || iJ4 == 88)) {
                            dVar = e(i14, nVar);
                        } else if (iJ == 87) {
                            dVar = b(i14, nVar, a(i10, iJ, iJ2, iJ3, iJ4));
                        } else if (iJ == 80 && iJ2 == 82 && iJ3 == 73 && iJ4 == 86) {
                            dVar = c(i14, nVar);
                        } else if (iJ == 71 && iJ2 == 69 && iJ3 == 79 && (iJ4 == 66 || i10 == 2)) {
                            dVar = b(i14, nVar);
                        } else {
                            if (i10 == 2) {
                                if (iJ == 80 && iJ2 == 73 && iJ3 == 67) {
                                    dVar = a(nVar, i14, i10);
                                } else if (iJ != 67 && iJ2 == 79 && iJ3 == 77 && (iJ4 == 77 || i10 == 2)) {
                                    dVar = a(i14, nVar);
                                } else if (iJ != 67 && iJ2 == 72 && iJ3 == 65 && iJ4 == 80) {
                                    str = "Id3Decoder";
                                    dVar = a(nVar, i14, i10, z10, i11, lVar);
                                } else if (iJ != 67 && iJ2 == 84 && iJ3 == 79 && iJ4 == 67) {
                                    str = "Id3Decoder";
                                    dVar = b(nVar, i14, i10, z10, i11, lVar);
                                } else {
                                    str = "Id3Decoder";
                                    String strA = a(i10, iJ, iJ2, iJ3, iJ4);
                                    byte[] bArr = new byte[i14];
                                    nVar.a(bArr, 0, i14);
                                    dVar = new d(strA, bArr);
                                }
                            } else if (iJ == 65 && iJ2 == 80 && iJ3 == 73 && iJ4 == 67) {
                                dVar = a(nVar, i14, i10);
                            } else {
                                if (iJ != 67) {
                                }
                                if (iJ != 67) {
                                    if (iJ != 67) {
                                        str = "Id3Decoder";
                                        String strA2 = a(i10, iJ, iJ2, iJ3, iJ4);
                                        byte[] bArr2 = new byte[i14];
                                        nVar.a(bArr2, 0, i14);
                                        dVar = new d(strA2, bArr2);
                                    } else {
                                        str = "Id3Decoder";
                                        String strA3 = a(i10, iJ, iJ2, iJ3, iJ4);
                                        byte[] bArr3 = new byte[i14];
                                        nVar.a(bArr3, 0, i14);
                                        dVar = new d(strA3, bArr3);
                                    }
                                } else if (iJ != 67) {
                                    str = "Id3Decoder";
                                    String strA4 = a(i10, iJ, iJ2, iJ3, iJ4);
                                    byte[] bArr4 = new byte[i14];
                                    nVar.a(bArr4, 0, i14);
                                    dVar = new d(strA4, bArr4);
                                } else {
                                    str = "Id3Decoder";
                                    String strA5 = a(i10, iJ, iJ2, iJ3, iJ4);
                                    byte[] bArr5 = new byte[i14];
                                    nVar.a(bArr5, 0, i14);
                                    dVar = new d(strA5, bArr5);
                                }
                            }
                            if (dVar == null) {
                                Log.w((String) str, "Failed to decode frame: id=" + a(i10, iJ, iJ2, iJ3, iJ4) + ", frameSize=" + i14);
                            }
                            nVar.e(i13);
                            return dVar;
                        }
                        str = "Id3Decoder";
                        if (dVar == null) {
                            Log.w((String) str, "Failed to decode frame: id=" + a(i10, iJ, iJ2, iJ3, iJ4) + ", frameSize=" + i14);
                        }
                        nVar.e(i13);
                        return dVar;
                    } catch (UnsupportedEncodingException unused) {
                        Log.w(str, "Unsupported character encoding");
                        nVar.e(i13);
                        return null;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    str = "Id3Decoder";
                    Log.w(str, "Unsupported character encoding");
                    nVar.e(i13);
                    return null;
                }
            } catch (Throwable th2) {
                nVar.e(i13);
                throw th2;
            }
        }
        Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
        nVar.e(i13);
        return null;
    }

    public static s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        return new s(str, null, new String(bArr, 0, a(bArr, 0, iJ), strB));
    }

    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11) {
        int iB;
        String strConcat;
        int iJ = nVar.j();
        String strB = b(iJ);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        nVar.a(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US);
            if (strConcat.equals("image/jpg")) {
                strConcat = "image/jpeg";
            }
            iB = 2;
        } else {
            iB = b(0, bArr);
            String lowerCase = new String(bArr, 0, iB, "ISO-8859-1").toLowerCase(Locale.US);
            strConcat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i13 = bArr[iB + 1] & 255;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iJ);
        return new b(strConcat, new String(bArr, i14, iA - i14, strB), i13, Arrays.copyOfRange(bArr, a(iJ) + iA, i12));
    }

    public static j a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i10 < 4) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        byte[] bArr = new byte[3];
        nVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        nVar.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iJ);
        String str2 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new j(str, str2, iA2 < i11 ? new String(bArr2, iA2, a(bArr2, iA2, iJ) - iA2, strB) : "");
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
            if (iB % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }
}
