package w3;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import g5.k0;
import g5.p;
import g5.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f73347a = k0.c0("OpusHead");

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f73349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f73350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f73351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f73352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t f73353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final t f73354g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f73355h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f73356i;

        public boolean a() {
            int i10 = this.f73349b + 1;
            this.f73349b = i10;
            if (i10 == this.f73348a) {
                return false;
            }
            this.f73351d = this.f73352e ? this.f73353f.D() : this.f73353f.A();
            if (this.f73349b == this.f73355h) {
                this.f73350c = this.f73354g.C();
                this.f73354g.M(4);
                int i11 = this.f73356i - 1;
                this.f73356i = i11;
                this.f73355h = i11 > 0 ? this.f73354g.C() - 1 : -1;
            }
            return true;
        }

        public a(t tVar, t tVar2, boolean z10) {
            this.f73354g = tVar;
            this.f73353f = tVar2;
            this.f73352e = z10;
            tVar2.L(12);
            this.f73348a = tVar2.C();
            tVar.L(12);
            this.f73356i = tVar.C();
            g5.a.g(tVar.j() == 1, "first_chunk must be 1");
            this.f73349b = -1;
        }
    }

    /* JADX INFO: renamed from: w3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtomParsers.java */
    public interface InterfaceC0774b {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class d implements InterfaceC0774b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f73363c;

        @Override // w3.b.InterfaceC0774b
        public int getSampleCount() {
            return this.f73362b;
        }

        @Override // w3.b.InterfaceC0774b
        public boolean isFixedSampleSize() {
            return this.f73361a != 0;
        }

        @Override // w3.b.InterfaceC0774b
        public int readNextSampleSize() {
            int i10 = this.f73361a;
            return i10 == 0 ? this.f73363c.C() : i10;
        }

        public d(w3.a.b bVar) {
            t tVar = bVar.f73346b;
            this.f73363c = tVar;
            tVar.L(12);
            this.f73361a = tVar.C();
            this.f73362b = tVar.C();
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class e implements InterfaceC0774b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f73364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f73368e;

        @Override // w3.b.InterfaceC0774b
        public boolean isFixedSampleSize() {
            return false;
        }

        @Override // w3.b.InterfaceC0774b
        public int getSampleCount() {
            return this.f73365b;
        }

        @Override // w3.b.InterfaceC0774b
        public int readNextSampleSize() {
            int i10 = this.f73366c;
            if (i10 == 8) {
                return this.f73364a.y();
            }
            if (i10 == 16) {
                return this.f73364a.E();
            }
            int i11 = this.f73367d;
            this.f73367d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f73368e & 15;
            }
            int iY = this.f73364a.y();
            this.f73368e = iY;
            return (iY & 240) >> 4;
        }

        public e(w3.a.b bVar) {
            t tVar = bVar.f73346b;
            this.f73364a = tVar;
            tVar.L(12);
            this.f73366c = tVar.C() & 255;
            this.f73365b = tVar.C();
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f73370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73371c;

        public f(int i10, long j10, int i11) {
            this.f73369a = i10;
            this.f73370b = j10;
            this.f73371c = i11;
        }
    }

    public static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[k0.q(4, 0, length)] && jArr[k0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    public static int c(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 4 : -1;
    }

    @Nullable
    public static Metadata w(w3.a.b bVar, boolean z10) {
        if (z10) {
            return null;
        }
        t tVar = bVar.f73346b;
        tVar.L(8);
        while (tVar.a() >= 8) {
            int iC = tVar.c();
            int iJ = tVar.j();
            if (tVar.j() == 1835365473) {
                tVar.L(iC);
                return x(tVar, iC + iJ);
            }
            tVar.L(iC + iJ);
        }
        return null;
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m[] f73357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Format f73358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f73359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73360d = 0;

        public c(int i10) {
            this.f73357a = new m[i10];
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0264  */
    /* JADX WARN: Code duplicated, block: B:121:0x0270  */
    /* JADX WARN: Code duplicated, block: B:122:0x0272  */
    /* JADX WARN: Code duplicated, block: B:125:0x0279  */
    /* JADX WARN: Code duplicated, block: B:127:0x028f  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(t tVar, int i10, int i11, int i12, int i13, String str, boolean z10, DrmInitData drmInitData, c cVar, int i14) throws ParserException {
        int iE;
        int iZ;
        int iC;
        int i15;
        int iIntValue;
        int iIntValue2;
        int i16;
        String str2;
        byte[] bArr;
        int iJ;
        boolean z11;
        int iJ2;
        int i17;
        int i18;
        char c10;
        DrmInitData drmInitData2;
        char c11;
        int i19;
        int iB;
        byte b10;
        String str3;
        int i20 = i11;
        DrmInitData drmInitDataC = drmInitData;
        tVar.L(i20 + 8 + 8);
        int i21 = 0;
        if (z10) {
            iE = tVar.E();
            tVar.M(6);
        } else {
            tVar.M(8);
            iE = 0;
        }
        char c12 = 1;
        if (iE == 0 || iE == 1) {
            int iE2 = tVar.E();
            tVar.M(6);
            iZ = tVar.z();
            if (iE == 1) {
                tVar.M(16);
            }
            iC = iE2;
        } else {
            if (iE != 2) {
                return;
            }
            tVar.M(16);
            iZ = (int) Math.round(tVar.i());
            iC = tVar.C();
            tVar.M(20);
        }
        int iC2 = tVar.c();
        int iIntValue3 = i10;
        if (iIntValue3 == 1701733217) {
            Pair<Integer, m> pairP = p(tVar, i20, i12);
            if (pairP != null) {
                iIntValue3 = ((Integer) pairP.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((m) pairP.second).f73464b);
                cVar.f73357a[i14] = (m) pairP.second;
            }
            tVar.L(iC2);
        }
        DrmInitData drmInitData3 = drmInitDataC;
        char c13 = 24931;
        String str4 = "audio/raw";
        if (iIntValue3 == 1633889587) {
            str4 = "audio/ac3";
        } else if (iIntValue3 == 1700998451) {
            str4 = "audio/eac3";
        } else if (iIntValue3 == 1633889588) {
            str4 = "audio/ac4";
        } else if (iIntValue3 == 1685353315) {
            str4 = "audio/vnd.dts";
        } else if (iIntValue3 == 1685353320 || iIntValue3 == 1685353324) {
            str4 = "audio/vnd.dts.hd";
        } else if (iIntValue3 == 1685353317) {
            str4 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue3 == 1935764850) {
            str4 = "audio/3gpp";
        } else {
            if (iIntValue3 != 1935767394) {
                if (iIntValue3 == 1819304813 || iIntValue3 == 1936684916) {
                    i15 = 2;
                } else if (iIntValue3 == 1953984371) {
                    i15 = 268435456;
                } else if (iIntValue3 == 778924083) {
                    str4 = "audio/mpeg";
                } else if (iIntValue3 == 1634492771) {
                    str4 = "audio/alac";
                } else if (iIntValue3 == 1634492791) {
                    str4 = "audio/g711-alaw";
                } else if (iIntValue3 == 1970037111) {
                    str4 = "audio/g711-mlaw";
                } else if (iIntValue3 == 1332770163) {
                    str4 = "audio/opus";
                } else if (iIntValue3 == 1716281667) {
                    str4 = "audio/flac";
                } else {
                    i15 = -1;
                    str4 = null;
                }
                iIntValue = iZ;
                iIntValue2 = iC;
                i16 = iC2;
                str2 = str4;
                bArr = null;
                while (i16 - i20 < i12) {
                    tVar.L(i16);
                    iJ = tVar.j();
                    if (iJ > 0) {
                        z11 = c12;
                    } else {
                        z11 = i21;
                    }
                    g5.a.b(z11, "childAtomSize should be positive");
                    iJ2 = tVar.j();
                    if (iJ2 != 1702061171 || (z10 && iJ2 == 2002876005)) {
                        i17 = iJ;
                        i18 = i16;
                        c10 = c13;
                        drmInitData2 = drmInitData3;
                        c11 = c12;
                        i19 = i21;
                        if (iJ2 == 1702061171) {
                            iB = i18;
                        } else {
                            iB = b(tVar, i18, i17);
                        }
                        b10 = -1;
                        if (iB != -1) {
                            Pair<String, byte[]> pairG = g(tVar, iB);
                            str3 = (String) pairG.first;
                            bArr = (byte[]) pairG.second;
                            if ("audio/mp4a-latm".equals(str3)) {
                                Pair<Integer, Integer> pairJ = g5.d.j(bArr);
                                iIntValue = ((Integer) pairJ.first).intValue();
                                iIntValue2 = ((Integer) pairJ.second).intValue();
                            }
                            str2 = str3;
                        }
                    } else {
                        if (iJ2 == 1684103987) {
                            tVar.L(i16 + 8);
                            cVar.f73358b = m3.a.c(tVar, Integer.toString(i13), str, drmInitData3);
                        } else if (iJ2 == 1684366131) {
                            tVar.L(i16 + 8);
                            cVar.f73358b = m3.a.g(tVar, Integer.toString(i13), str, drmInitData3);
                        } else if (iJ2 == 1684103988) {
                            tVar.L(i16 + 8);
                            cVar.f73358b = m3.b.b(tVar, Integer.toString(i13), str, drmInitData3);
                        } else {
                            if (iJ2 == 1684305011) {
                                drmInitData2 = drmInitData3;
                                c11 = c12;
                                i19 = i21;
                                cVar.f73358b = Format.p(Integer.toString(i13), str2, null, -1, -1, iIntValue2, iIntValue, null, drmInitData2, 0, str);
                                i17 = iJ;
                                i18 = i16;
                                c10 = 24931;
                            } else {
                                int i22 = i16;
                                drmInitData2 = drmInitData3;
                                c11 = c12;
                                i19 = i21;
                                if (iJ2 == 1682927731) {
                                    i17 = iJ;
                                    int i23 = i17 - 8;
                                    byte[] bArr2 = f73347a;
                                    byte[] bArr3 = new byte[bArr2.length + i23];
                                    System.arraycopy(bArr2, i19, bArr3, i19, bArr2.length);
                                    i18 = i22;
                                    tVar.L(i18 + 8);
                                    tVar.h(bArr3, bArr2.length, i23);
                                    bArr = bArr3;
                                } else {
                                    i17 = iJ;
                                    i18 = i22;
                                    if (iJ2 == 1684425825) {
                                        int i24 = i17 - 12;
                                        byte[] bArr4 = new byte[i24 + 4];
                                        bArr4[i19] = 102;
                                        bArr4[c11] = 76;
                                        bArr4[2] = 97;
                                        bArr4[3] = 67;
                                        tVar.L(i18 + 12);
                                        tVar.h(bArr4, 4, i24);
                                        bArr = bArr4;
                                    } else {
                                        c10 = 24931;
                                        if (iJ2 == 1634492771) {
                                            int i25 = i17 - 12;
                                            byte[] bArr5 = new byte[i25];
                                            tVar.L(i18 + 12);
                                            tVar.h(bArr5, i19, i25);
                                            Pair<Integer, Integer> pairK = g5.d.k(bArr5);
                                            iIntValue = ((Integer) pairK.first).intValue();
                                            iIntValue2 = ((Integer) pairK.second).intValue();
                                            bArr = bArr5;
                                        }
                                    }
                                }
                                b10 = -1;
                                c10 = 24931;
                            }
                            b10 = -1;
                        }
                        i17 = iJ;
                        i18 = i16;
                        c10 = c13;
                        drmInitData2 = drmInitData3;
                        c11 = c12;
                        i19 = i21;
                        b10 = -1;
                    }
                    i16 = i18 + i17;
                    i21 = i19;
                    c13 = c10;
                    drmInitData3 = drmInitData2;
                    c12 = c11;
                    i20 = i11;
                }
                DrmInitData drmInitData4 = drmInitData3;
                if (cVar.f73358b == null || str2 == null) {
                }
                cVar.f73358b = Format.o(Integer.toString(i13), str2, null, -1, -1, iIntValue2, iIntValue, i15, bArr == null ? null : Collections.singletonList(bArr), drmInitData4, 0, str);
                return;
            }
            str4 = "audio/amr-wb";
        }
        i15 = -1;
        iIntValue = iZ;
        iIntValue2 = iC;
        i16 = iC2;
        str2 = str4;
        bArr = null;
        while (i16 - i20 < i12) {
            tVar.L(i16);
            iJ = tVar.j();
            if (iJ > 0) {
                z11 = c12;
            } else {
                z11 = i21;
            }
            g5.a.b(z11, "childAtomSize should be positive");
            iJ2 = tVar.j();
            if (iJ2 != 1702061171) {
                i17 = iJ;
                i18 = i16;
                c10 = c13;
                drmInitData2 = drmInitData3;
                c11 = c12;
                i19 = i21;
                if (iJ2 == 1702061171) {
                    iB = i18;
                } else {
                    iB = b(tVar, i18, i17);
                }
                b10 = -1;
                if (iB != -1) {
                    Pair<String, byte[]> pairG2 = g(tVar, iB);
                    str3 = (String) pairG2.first;
                    bArr = (byte[]) pairG2.second;
                    if ("audio/mp4a-latm".equals(str3)) {
                        Pair<Integer, Integer> pairJ2 = g5.d.j(bArr);
                        iIntValue = ((Integer) pairJ2.first).intValue();
                        iIntValue2 = ((Integer) pairJ2.second).intValue();
                    }
                    str2 = str3;
                }
            } else {
                i17 = iJ;
                i18 = i16;
                c10 = c13;
                drmInitData2 = drmInitData3;
                c11 = c12;
                i19 = i21;
                if (iJ2 == 1702061171) {
                    iB = i18;
                } else {
                    iB = b(tVar, i18, i17);
                }
                b10 = -1;
                if (iB != -1) {
                    Pair<String, byte[]> pairG3 = g(tVar, iB);
                    str3 = (String) pairG3.first;
                    bArr = (byte[]) pairG3.second;
                    if ("audio/mp4a-latm".equals(str3)) {
                        Pair<Integer, Integer> pairJ3 = g5.d.j(bArr);
                        iIntValue = ((Integer) pairJ3.first).intValue();
                        iIntValue2 = ((Integer) pairJ3.second).intValue();
                    }
                    str2 = str3;
                }
            }
            i16 = i18 + i17;
            i21 = i19;
            c13 = c10;
            drmInitData3 = drmInitData2;
            c12 = c11;
            i20 = i11;
        }
        DrmInitData drmInitData5 = drmInitData3;
        if (cVar.f73358b == null) {
        }
    }

    public static Pair<Integer, m> e(t tVar, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        String strV = null;
        Integer numValueOf = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            tVar.L(i12);
            int iJ = tVar.j();
            int iJ2 = tVar.j();
            if (iJ2 == 1718775137) {
                numValueOf = Integer.valueOf(tVar.j());
            } else if (iJ2 == 1935894637) {
                tVar.M(4);
                strV = tVar.v(4);
            } else if (iJ2 == 1935894633) {
                i13 = i12;
                i14 = iJ;
            }
            i12 += iJ;
        }
        if (!"cenc".equals(strV) && !"cbc1".equals(strV) && !"cens".equals(strV) && !"cbcs".equals(strV)) {
            return null;
        }
        g5.a.b(numValueOf != null, "frma atom is mandatory");
        g5.a.b(i13 != -1, "schi atom is mandatory");
        m mVarQ = q(tVar, i13, i14, strV);
        g5.a.b(mVarQ != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, mVarQ);
    }

    public static Pair<long[], long[]> f(w3.a.C0773a c0773a) {
        w3.a.b bVarG;
        if (c0773a == null || (bVarG = c0773a.g(1701606260)) == null) {
            return Pair.create(null, null);
        }
        t tVar = bVarG.f73346b;
        tVar.L(8);
        int iC = w3.a.c(tVar.j());
        int iC2 = tVar.C();
        long[] jArr = new long[iC2];
        long[] jArr2 = new long[iC2];
        for (int i10 = 0; i10 < iC2; i10++) {
            jArr[i10] = iC == 1 ? tVar.D() : tVar.A();
            jArr2[i10] = iC == 1 ? tVar.r() : tVar.j();
            if (tVar.u() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            tVar.M(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> g(t tVar, int i10) {
        tVar.L(i10 + 8 + 4);
        tVar.M(1);
        h(tVar);
        tVar.M(2);
        int iY = tVar.y();
        if ((iY & 128) != 0) {
            tVar.M(2);
        }
        if ((iY & 64) != 0) {
            tVar.M(tVar.E());
        }
        if ((iY & 32) != 0) {
            tVar.M(2);
        }
        tVar.M(1);
        h(tVar);
        String strF = p.f(tVar.y());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return Pair.create(strF, null);
        }
        tVar.M(12);
        tVar.M(1);
        int iH = h(tVar);
        byte[] bArr = new byte[iH];
        tVar.h(bArr, 0, iH);
        return Pair.create(strF, bArr);
    }

    public static int i(t tVar) {
        tVar.L(16);
        return tVar.j();
    }

    @Nullable
    public static Metadata j(t tVar, int i10) {
        tVar.M(8);
        ArrayList arrayList = new ArrayList();
        while (tVar.c() < i10) {
            Metadata.Entry entryD = g.d(tVar);
            if (entryD != null) {
                arrayList.add(entryD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair<Long, String> k(t tVar) {
        tVar.L(8);
        int iC = w3.a.c(tVar.j());
        tVar.M(iC == 0 ? 8 : 16);
        long jA = tVar.A();
        tVar.M(iC == 0 ? 4 : 8);
        int iE = tVar.E();
        return Pair.create(Long.valueOf(jA), "" + ((char) (((iE >> 10) & 31) + 96)) + ((char) (((iE >> 5) & 31) + 96)) + ((char) ((iE & 31) + 96)));
    }

    public static long m(t tVar) {
        tVar.L(8);
        tVar.M(w3.a.c(tVar.j()) != 0 ? 16 : 8);
        return tVar.A();
    }

    public static float n(t tVar, int i10) {
        tVar.L(i10 + 8);
        return tVar.C() / tVar.C();
    }

    public static byte[] o(t tVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            tVar.L(i12);
            int iJ = tVar.j();
            if (tVar.j() == 1886547818) {
                return Arrays.copyOfRange(tVar.f53154a, i12, iJ + i12);
            }
            i12 += iJ;
        }
        return null;
    }

    public static m q(t tVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            tVar.L(i14);
            int iJ = tVar.j();
            if (tVar.j() == 1952804451) {
                int iC = w3.a.c(tVar.j());
                tVar.M(1);
                if (iC == 0) {
                    tVar.M(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iY = tVar.y();
                    i12 = iY & 15;
                    i13 = (iY & 240) >> 4;
                }
                boolean z10 = tVar.y() == 1;
                int iY2 = tVar.y();
                byte[] bArr2 = new byte[16];
                tVar.h(bArr2, 0, 16);
                if (z10 && iY2 == 0) {
                    int iY3 = tVar.y();
                    bArr = new byte[iY3];
                    tVar.h(bArr, 0, iY3);
                }
                return new m(z10, str, iY2, bArr2, i13, i12, bArr);
            }
            i14 += iJ;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0243  */
    /* JADX WARN: Code duplicated, block: B:106:0x0252 A[LOOP:9: B:104:0x024c->B:106:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0294  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x0335  */
    /* JADX WARN: Code duplicated, block: B:143:0x037c  */
    /* JADX WARN: Code duplicated, block: B:144:0x037e  */
    /* JADX WARN: Code duplicated, block: B:148:0x038e  */
    /* JADX WARN: Code duplicated, block: B:150:0x039c  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:161:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:166:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:169:0x0400  */
    /* JADX WARN: Code duplicated, block: B:170:0x0403  */
    /* JADX WARN: Code duplicated, block: B:172:0x0406  */
    /* JADX WARN: Code duplicated, block: B:173:0x0409  */
    /* JADX WARN: Code duplicated, block: B:175:0x040d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0411  */
    /* JADX WARN: Code duplicated, block: B:178:0x0414  */
    /* JADX WARN: Code duplicated, block: B:182:0x041f  */
    /* JADX WARN: Code duplicated, block: B:184:0x042d  */
    /* JADX WARN: Code duplicated, block: B:185:0x043d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0445  */
    /* JADX WARN: Code duplicated, block: B:199:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0123 A[EDGE_INSN: B:204:0x0123->B:53:0x0123 BREAK  A[LOOP:1: B:49:0x0106->B:52:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x03ef A[EDGE_INSN: B:210:0x03ef->B:163:0x03ef BREAK  A[LOOP:5: B:146:0x0389->B:162:0x03e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[LOOP:1: B:49:0x0106->B:52:0x010e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0149 A[ADDED_TO_REGION, LOOP:2: B:57:0x0149->B:59:0x014d, LOOP_START, PHI: r16 r21 r24
  0x0149: PHI (r16v16 int) = (r16v12 int), (r16v17 int) binds: [B:56:0x0147, B:59:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r21v16 int) = (r21v12 int), (r21v17 int) binds: [B:56:0x0147, B:59:0x014d] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r24v4 int) = (r24v2 int), (r24v6 int) binds: [B:56:0x0147, B:59:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d1 A[LOOP:3: B:81:0x01c7->B:85:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:99:0x022b  */
    public static o r(l lVar, w3.a.C0773a c0773a, q3.o oVar) throws ParserException {
        InterfaceC0774b eVar;
        boolean z10;
        int iC;
        int iC2;
        boolean z11;
        l lVar2;
        long[] jArr;
        int[] iArr;
        long j10;
        int i10;
        int[] iArr2;
        long[] jArr2;
        int i11;
        int[] iArr3;
        long[] jArr3;
        long jY0;
        long[] jArr4;
        int i12;
        long[] jArr5;
        boolean z12;
        int[] iArr4;
        int[] iArr5;
        boolean z13;
        int i13;
        int i14;
        int i15;
        long[] jArr6;
        int[] iArr6;
        int i16;
        int i17;
        boolean z14;
        long[] jArr7;
        int[] iArr7;
        int[] iArr8;
        long[] jArr8;
        int i18;
        long j11;
        long j12;
        int i19;
        int i20;
        int[] iArr9;
        long j13;
        boolean z15;
        int i21;
        int i22;
        boolean z16;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int iC3;
        int i23;
        int i24;
        int iJ;
        int i25;
        int iC4;
        long j14;
        long j15;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z17;
        int i31;
        String str;
        long j16;
        int i32;
        boolean zA;
        int i33;
        int i34;
        int nextSampleSize;
        int i35;
        int iC5;
        int iJ2;
        int i36;
        w3.a.b bVarG = c0773a.g(1937011578);
        if (bVarG != null) {
            eVar = new d(bVarG);
        } else {
            w3.a.b bVarG2 = c0773a.g(1937013298);
            if (bVarG2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            eVar = new e(bVarG2);
        }
        int sampleCount = eVar.getSampleCount();
        if (sampleCount == 0) {
            return new o(lVar, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        w3.a.b bVarG3 = c0773a.g(1937007471);
        if (bVarG3 == null) {
            bVarG3 = c0773a.g(1668232756);
            z10 = true;
        } else {
            z10 = false;
        }
        t tVar = bVarG3.f73346b;
        t tVar2 = c0773a.g(1937011555).f73346b;
        t tVar3 = c0773a.g(1937011827).f73346b;
        w3.a.b bVarG4 = c0773a.g(1937011571);
        t tVar4 = null;
        t tVar5 = bVarG4 != null ? bVarG4.f73346b : null;
        w3.a.b bVarG5 = c0773a.g(1668576371);
        t tVar6 = bVarG5 != null ? bVarG5.f73346b : null;
        a aVar = new a(tVar2, tVar, z10);
        tVar3.L(12);
        int iC6 = tVar3.C() - 1;
        int iC7 = tVar3.C();
        int iC8 = tVar3.C();
        if (tVar6 != null) {
            tVar6.L(12);
            iC = tVar6.C();
        } else {
            iC = 0;
        }
        int iC9 = -1;
        if (tVar5 != null) {
            tVar5.L(12);
            iC2 = tVar5.C();
            iC9 = iC2 > 0 ? tVar5.C() - 1 : -1;
            if (!eVar.isFixedSampleSize() && "audio/raw".equals(lVar.f73457f.f18970j) && iC6 == 0 && iC == 0 && iC2 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                lVar2 = lVar;
                int i37 = aVar.f73348a;
                jArr = new long[i37];
                iArr = new int[i37];
                while (aVar.a()) {
                    int i38 = aVar.f73349b;
                    jArr[i38] = aVar.f73351d;
                    iArr[i38] = aVar.f73350c;
                }
                Format format = lVar2.f73457f;
                w3.d.b bVarA = w3.d.a(k0.S(format.f18985y, format.f18983w), jArr, iArr, iC8);
                long[] jArr9 = bVarA.f73376a;
                int[] iArr10 = bVarA.f73377b;
                int i39 = bVarA.f73378c;
                long[] jArr10 = bVarA.f73379d;
                int[] iArr11 = bVarA.f73380e;
                j10 = bVarA.f73381f;
                i10 = sampleCount;
                iArr2 = iArr11;
                jArr2 = jArr10;
                i11 = i39;
                iArr3 = iArr10;
                jArr3 = jArr9;
            } else {
                jArrCopyOf = new long[sampleCount];
                iArrCopyOf = new int[sampleCount];
                jArrCopyOf2 = new long[sampleCount];
                iArrCopyOf2 = new int[sampleCount];
                iC3 = iC9;
                i23 = 0;
                i24 = 0;
                iJ = 0;
                i25 = 0;
                iC4 = 0;
                j14 = 0;
                j15 = 0;
                i26 = iC;
                i27 = iC8;
                i28 = iC7;
                while (true) {
                    if (i23 < sampleCount) {
                        i29 = i28;
                        i30 = i25;
                        break;
                    }
                    j16 = j15;
                    i32 = i25;
                    zA = true;
                    while (i32 == 0) {
                        zA = aVar.a();
                        if (zA) {
                            break;
                        }
                        int i40 = i28;
                        long j17 = aVar.f73351d;
                        i32 = aVar.f73350c;
                        j16 = j17;
                        i28 = i40;
                        i27 = i27;
                        sampleCount = sampleCount;
                    }
                    i33 = sampleCount;
                    i29 = i28;
                    i34 = i27;
                    if (!zA) {
                        g5.m.h("AtomParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i23);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i23);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i23);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i23);
                        sampleCount = i23;
                        i30 = i32;
                        break;
                    }
                    if (tVar6 != null) {
                        while (iC4 == 0 && i26 > 0) {
                            iC4 = tVar6.C();
                            iJ = tVar6.j();
                            i26--;
                        }
                        iC4--;
                    }
                    int i41 = iJ;
                    jArrCopyOf[i23] = j16;
                    nextSampleSize = eVar.readNextSampleSize();
                    iArrCopyOf[i23] = nextSampleSize;
                    if (nextSampleSize > i24) {
                        i24 = nextSampleSize;
                    }
                    jArrCopyOf2[i23] = j14 + ((long) i41);
                    if (tVar4 == null) {
                        i35 = 1;
                    } else {
                        i35 = 0;
                    }
                    iArrCopyOf2[i23] = i35;
                    if (i23 == iC3) {
                        iArrCopyOf2[i23] = 1;
                        iC2--;
                        if (iC2 > 0) {
                            iC3 = tVar4.C() - 1;
                        }
                    }
                    int i42 = iC3;
                    j14 += (long) i34;
                    iC5 = i29 - 1;
                    if (iC5 == 0 || iC6 <= 0) {
                        iJ2 = i34;
                        i36 = iC6;
                    } else {
                        iC5 = tVar3.C();
                        iJ2 = tVar3.j();
                        i36 = iC6 - 1;
                    }
                    int i43 = iC5;
                    long j18 = j16 + ((long) iArrCopyOf[i23]);
                    i25 = i32 - 1;
                    i23++;
                    j15 = j18;
                    iC3 = i42;
                    i27 = iJ2;
                    sampleCount = i33;
                    iJ = i41;
                    int i44 = i36;
                    i28 = i43;
                    iC6 = i44;
                }
                long j19 = j14 + ((long) iJ);
                while (true) {
                    if (i26 > 0) {
                        z17 = true;
                        break;
                    }
                    if (tVar6.C() != 0) {
                        z17 = false;
                        break;
                    }
                    tVar6.j();
                    i26--;
                }
                if (iC2 != 0 && i29 == 0 && i30 == 0 && iC6 == 0) {
                    i31 = iC4;
                    if (i31 == 0 && z17) {
                        lVar2 = lVar;
                    }
                    i10 = sampleCount;
                    jArr3 = jArrCopyOf;
                    jArr2 = jArrCopyOf2;
                    iArr2 = iArrCopyOf2;
                    i11 = i24;
                    iArr3 = iArrCopyOf;
                    j10 = j19;
                } else {
                    i31 = iC4;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                lVar2 = lVar;
                sb2.append(lVar2.f73452a);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iC2);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i29);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i30);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(iC6);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i31);
                if (z17) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                sb2.append(str);
                g5.m.h("AtomParsers", sb2.toString());
                i10 = sampleCount;
                jArr3 = jArrCopyOf;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
                i11 = i24;
                iArr3 = iArrCopyOf;
                j10 = j19;
            }
            jY0 = k0.y0(j10, 1000000L, lVar2.f73454c);
            jArr4 = lVar2.f73459h;
            if (jArr4 == null) {
                k0.A0(jArr2, 1000000L, lVar2.f73454c);
                return new o(lVar, jArr3, iArr3, i11, jArr2, iArr2, jY0);
            }
            if (jArr4.length == 1 || lVar2.f73453b != 1 || jArr2.length < 2) {
                i12 = i10;
            } else {
                long j20 = lVar2.f73460i[0];
                long jY1 = k0.y0(jArr4[0], lVar2.f73454c, lVar2.f73455d) + j20;
                if (a(jArr2, j10, j20, jY1)) {
                    long j21 = j10 - jY1;
                    long jY2 = k0.y0(j20 - jArr2[0], lVar2.f73457f.f18984x, lVar2.f73454c);
                    i12 = i10;
                    long jY3 = k0.y0(j21, lVar2.f73457f.f18984x, lVar2.f73454c);
                    if ((jY2 != 0 || jY3 != 0) && jY2 <= 2147483647L && jY3 <= 2147483647L) {
                        oVar.f66460a = (int) jY2;
                        oVar.f66461b = (int) jY3;
                        k0.A0(jArr2, 1000000L, lVar2.f73454c);
                        return new o(lVar, jArr3, iArr3, i11, jArr2, iArr2, k0.y0(lVar2.f73459h[0], 1000000L, lVar2.f73455d));
                    }
                } else {
                    i12 = i10;
                }
            }
            jArr5 = lVar2.f73459h;
            if (jArr5.length != 1 && jArr5[0] == 0) {
                long j22 = lVar2.f73460i[0];
                for (int i45 = 0; i45 < jArr2.length; i45++) {
                    jArr2[i45] = k0.y0(jArr2[i45] - j22, 1000000L, lVar2.f73454c);
                }
                return new o(lVar, jArr3, iArr3, i11, jArr2, iArr2, k0.y0(j10 - j22, 1000000L, lVar2.f73454c));
            }
            if (lVar2.f73453b == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            iArr4 = new int[jArr5.length];
            iArr5 = new int[jArr5.length];
            z13 = false;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            while (true) {
                jArr6 = lVar2.f73459h;
                if (i14 < jArr6.length) {
                    break;
                }
                int[] iArr12 = iArr3;
                int i46 = i11;
                j13 = lVar2.f73460i[i14];
                if (j13 != -1) {
                    boolean z18 = z13;
                    int i47 = i13;
                    long jY4 = k0.y0(jArr6[i14], lVar2.f73454c, lVar2.f73455d);
                    iArr4[i14] = k0.h(jArr2, j13, true, true);
                    iArr5[i14] = k0.e(jArr2, j13 + jY4, z12, false);
                    while (true) {
                        i21 = iArr4[i14];
                        i22 = iArr5[i14];
                        if (i21 >= i22 || (iArr2[i21] & 1) != 0) {
                            break;
                        }
                        iArr4[i14] = i21 + 1;
                    }
                    i13 = i47 + (i22 - i21);
                    if (i15 != i21) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z15 = z18 | z16;
                    i15 = i22;
                } else {
                    z15 = z13;
                }
                i14++;
                z13 = z15;
                i12 = i12;
                i11 = i46;
                iArr3 = iArr12;
            }
            iArr6 = iArr3;
            i16 = i11;
            boolean z19 = z13;
            i17 = 0;
            z14 = z19 | (i13 != i12);
            if (z14) {
                jArr7 = new long[i13];
            } else {
                jArr7 = jArr3;
            }
            if (z14) {
                iArr7 = new int[i13];
            } else {
                iArr7 = iArr6;
            }
            if (z14) {
                i16 = 0;
            }
            if (z14) {
                iArr8 = new int[i13];
            } else {
                iArr8 = iArr2;
            }
            jArr8 = new long[i13];
            i18 = 0;
            j11 = 0;
            while (i17 < lVar2.f73459h.length) {
                j12 = lVar2.f73460i[i17];
                i19 = iArr4[i17];
                int[] iArr13 = iArr4;
                i20 = iArr5[i17];
                int[] iArr14 = iArr5;
                if (z14) {
                    int i48 = i20 - i19;
                    System.arraycopy(jArr3, i19, jArr7, i18, i48);
                    iArr9 = iArr6;
                    System.arraycopy(iArr9, i19, iArr7, i18, i48);
                    System.arraycopy(iArr2, i19, iArr8, i18, i48);
                } else {
                    iArr9 = iArr6;
                }
                int i49 = i16;
                while (i19 < i20) {
                    int[] iArr15 = iArr2;
                    int i50 = i20;
                    long j23 = j11;
                    int[] iArr16 = iArr9;
                    long[] jArr11 = jArr7;
                    jArr8[i18] = k0.y0(j11, 1000000L, lVar2.f73455d) + k0.y0(Math.max(0L, jArr2[i19] - j12), 1000000L, lVar2.f73454c);
                    if (!z14 && iArr7[i18] > i49) {
                        i49 = iArr16[i19];
                    }
                    i18++;
                    i19++;
                    iArr2 = iArr15;
                    i20 = i50;
                    iArr9 = iArr16;
                    j11 = j23;
                    jArr7 = jArr11;
                }
                j11 += lVar2.f73459h[i17];
                i17++;
                iArr2 = iArr2;
                i16 = i49;
                iArr6 = iArr9;
                iArr4 = iArr13;
                iArr5 = iArr14;
                jArr3 = jArr3;
                jArr7 = jArr7;
            }
            return new o(lVar, jArr7, iArr7, i16, jArr8, iArr8, k0.y0(j11, 1000000L, lVar2.f73455d));
        }
        iC2 = 0;
        tVar4 = tVar5;
        if (!eVar.isFixedSampleSize()) {
            z11 = false;
        } else {
            z11 = false;
        }
        if (z11) {
            jArrCopyOf = new long[sampleCount];
            iArrCopyOf = new int[sampleCount];
            jArrCopyOf2 = new long[sampleCount];
            iArrCopyOf2 = new int[sampleCount];
            iC3 = iC9;
            i23 = 0;
            i24 = 0;
            iJ = 0;
            i25 = 0;
            iC4 = 0;
            j14 = 0;
            j15 = 0;
            i26 = iC;
            i27 = iC8;
            i28 = iC7;
            while (true) {
                if (i23 < sampleCount) {
                    i29 = i28;
                    i30 = i25;
                    break;
                }
                j16 = j15;
                i32 = i25;
                zA = true;
                while (i32 == 0) {
                    zA = aVar.a();
                    if (zA) {
                        break;
                        break;
                    }
                    int i410 = i28;
                    long j110 = aVar.f73351d;
                    i32 = aVar.f73350c;
                    j16 = j110;
                    i28 = i410;
                    i27 = i27;
                    sampleCount = sampleCount;
                }
                i33 = sampleCount;
                i29 = i28;
                i34 = i27;
                if (!zA) {
                    g5.m.h("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i23);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i23);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i23);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i23);
                    sampleCount = i23;
                    i30 = i32;
                    break;
                }
                if (tVar6 != null) {
                    while (iC4 == 0) {
                        iC4 = tVar6.C();
                        iJ = tVar6.j();
                        i26--;
                    }
                    iC4--;
                }
                int i411 = iJ;
                jArrCopyOf[i23] = j16;
                nextSampleSize = eVar.readNextSampleSize();
                iArrCopyOf[i23] = nextSampleSize;
                if (nextSampleSize > i24) {
                    i24 = nextSampleSize;
                }
                jArrCopyOf2[i23] = j14 + ((long) i411);
                if (tVar4 == null) {
                    i35 = 1;
                } else {
                    i35 = 0;
                }
                iArrCopyOf2[i23] = i35;
                if (i23 == iC3) {
                    iArrCopyOf2[i23] = 1;
                    iC2--;
                    if (iC2 > 0) {
                        iC3 = tVar4.C() - 1;
                    }
                }
                int i412 = iC3;
                j14 += (long) i34;
                iC5 = i29 - 1;
                if (iC5 == 0) {
                    iJ2 = i34;
                    i36 = iC6;
                } else {
                    iJ2 = i34;
                    i36 = iC6;
                }
                int i413 = iC5;
                long j111 = j16 + ((long) iArrCopyOf[i23]);
                i25 = i32 - 1;
                i23++;
                j15 = j111;
                iC3 = i412;
                i27 = iJ2;
                sampleCount = i33;
                iJ = i411;
                int i414 = i36;
                i28 = i413;
                iC6 = i414;
            }
            long j112 = j14 + ((long) iJ);
            while (true) {
                if (i26 > 0) {
                    z17 = true;
                    break;
                }
                if (tVar6.C() != 0) {
                    z17 = false;
                    break;
                }
                tVar6.j();
                i26--;
            }
            if (iC2 != 0) {
                i31 = iC4;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Inconsistent stbl box for track ");
                lVar2 = lVar;
                sb3.append(lVar2.f73452a);
                sb3.append(": remainingSynchronizationSamples ");
                sb3.append(iC2);
                sb3.append(", remainingSamplesAtTimestampDelta ");
                sb3.append(i29);
                sb3.append(", remainingSamplesInChunk ");
                sb3.append(i30);
                sb3.append(", remainingTimestampDeltaChanges ");
                sb3.append(iC6);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i31);
                if (z17) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                g5.m.h("AtomParsers", sb3.toString());
            } else {
                i31 = iC4;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Inconsistent stbl box for track ");
                lVar2 = lVar;
                sb4.append(lVar2.f73452a);
                sb4.append(": remainingSynchronizationSamples ");
                sb4.append(iC2);
                sb4.append(", remainingSamplesAtTimestampDelta ");
                sb4.append(i29);
                sb4.append(", remainingSamplesInChunk ");
                sb4.append(i30);
                sb4.append(", remainingTimestampDeltaChanges ");
                sb4.append(iC6);
                sb4.append(", remainingSamplesAtTimestampOffset ");
                sb4.append(i31);
                if (z17) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb4.append(str);
                g5.m.h("AtomParsers", sb4.toString());
            }
            i10 = sampleCount;
            jArr3 = jArrCopyOf;
            jArr2 = jArrCopyOf2;
            iArr2 = iArrCopyOf2;
            i11 = i24;
            iArr3 = iArrCopyOf;
            j10 = j112;
        } else {
            lVar2 = lVar;
            int i310 = aVar.f73348a;
            jArr = new long[i310];
            iArr = new int[i310];
            while (aVar.a()) {
                int i311 = aVar.f73349b;
                jArr[i311] = aVar.f73351d;
                iArr[i311] = aVar.f73350c;
            }
            Format format2 = lVar2.f73457f;
            w3.d.b bVarA2 = w3.d.a(k0.S(format2.f18985y, format2.f18983w), jArr, iArr, iC8);
            long[] jArr12 = bVarA2.f73376a;
            int[] iArr17 = bVarA2.f73377b;
            int i312 = bVarA2.f73378c;
            long[] jArr13 = bVarA2.f73379d;
            int[] iArr18 = bVarA2.f73380e;
            j10 = bVarA2.f73381f;
            i10 = sampleCount;
            iArr2 = iArr18;
            jArr2 = jArr13;
            i11 = i312;
            iArr3 = iArr17;
            jArr3 = jArr12;
        }
        jY0 = k0.y0(j10, 1000000L, lVar2.f73454c);
        jArr4 = lVar2.f73459h;
        if (jArr4 == null) {
            k0.A0(jArr2, 1000000L, lVar2.f73454c);
            return new o(lVar, jArr3, iArr3, i11, jArr2, iArr2, jY0);
        }
        if (jArr4.length == 1) {
            i12 = i10;
        } else {
            i12 = i10;
        }
        jArr5 = lVar2.f73459h;
        if (jArr5.length != 1) {
        }
        if (lVar2.f73453b == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        iArr4 = new int[jArr5.length];
        iArr5 = new int[jArr5.length];
        z13 = false;
        i13 = 0;
        i14 = 0;
        i15 = 0;
        while (true) {
            jArr6 = lVar2.f73459h;
            if (i14 < jArr6.length) {
                break;
                break;
            }
            int[] iArr19 = iArr3;
            int i415 = i11;
            j13 = lVar2.f73460i[i14];
            if (j13 != -1) {
                boolean z110 = z13;
                int i416 = i13;
                long jY5 = k0.y0(jArr6[i14], lVar2.f73454c, lVar2.f73455d);
                iArr4[i14] = k0.h(jArr2, j13, true, true);
                iArr5[i14] = k0.e(jArr2, j13 + jY5, z12, false);
                while (true) {
                    i21 = iArr4[i14];
                    i22 = iArr5[i14];
                    if (i21 >= i22) {
                        break;
                    }
                    break;
                    break;
                    iArr4[i14] = i21 + 1;
                }
                i13 = i416 + (i22 - i21);
                if (i15 != i21) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z15 = z110 | z16;
                i15 = i22;
            } else {
                z15 = z13;
            }
            i14++;
            z13 = z15;
            i12 = i12;
            i11 = i415;
            iArr3 = iArr19;
        }
        iArr6 = iArr3;
        i16 = i11;
        boolean z111 = z13;
        i17 = 0;
        z14 = z111 | (i13 != i12);
        if (z14) {
            jArr7 = new long[i13];
        } else {
            jArr7 = jArr3;
        }
        if (z14) {
            iArr7 = new int[i13];
        } else {
            iArr7 = iArr6;
        }
        if (z14) {
            i16 = 0;
        }
        if (z14) {
            iArr8 = new int[i13];
        } else {
            iArr8 = iArr2;
        }
        jArr8 = new long[i13];
        i18 = 0;
        j11 = 0;
        while (i17 < lVar2.f73459h.length) {
            j12 = lVar2.f73460i[i17];
            i19 = iArr4[i17];
            int[] iArr110 = iArr4;
            i20 = iArr5[i17];
            int[] iArr111 = iArr5;
            if (z14) {
                int i417 = i20 - i19;
                System.arraycopy(jArr3, i19, jArr7, i18, i417);
                iArr9 = iArr6;
                System.arraycopy(iArr9, i19, iArr7, i18, i417);
                System.arraycopy(iArr2, i19, iArr8, i18, i417);
            } else {
                iArr9 = iArr6;
            }
            int i418 = i16;
            while (i19 < i20) {
                int[] iArr112 = iArr2;
                int i51 = i20;
                long j24 = j11;
                int[] iArr113 = iArr9;
                long[] jArr14 = jArr7;
                jArr8[i18] = k0.y0(j11, 1000000L, lVar2.f73455d) + k0.y0(Math.max(0L, jArr2[i19] - j12), 1000000L, lVar2.f73454c);
                if (!z14) {
                }
                i18++;
                i19++;
                iArr2 = iArr112;
                i20 = i51;
                iArr9 = iArr113;
                j11 = j24;
                jArr7 = jArr14;
            }
            j11 += lVar2.f73459h[i17];
            i17++;
            iArr2 = iArr2;
            i16 = i418;
            iArr6 = iArr9;
            iArr4 = iArr110;
            iArr5 = iArr111;
            jArr3 = jArr3;
            jArr7 = jArr7;
        }
        return new o(lVar, jArr7, iArr7, i16, jArr8, iArr8, k0.y0(j11, 1000000L, lVar2.f73455d));
    }

    public static c s(t tVar, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws ParserException {
        tVar.L(12);
        int iJ = tVar.j();
        c cVar = new c(iJ);
        for (int i12 = 0; i12 < iJ; i12++) {
            int iC = tVar.c();
            int iJ2 = tVar.j();
            g5.a.b(iJ2 > 0, "childAtomSize should be positive");
            int iJ3 = tVar.j();
            if (iJ3 == 1635148593 || iJ3 == 1635148595 || iJ3 == 1701733238 || iJ3 == 1836070006 || iJ3 == 1752589105 || iJ3 == 1751479857 || iJ3 == 1932670515 || iJ3 == 1987063864 || iJ3 == 1987063865 || iJ3 == 1635135537 || iJ3 == 1685479798 || iJ3 == 1685479729 || iJ3 == 1685481573 || iJ3 == 1685481521) {
                y(tVar, iJ3, iC, iJ2, i10, i11, drmInitData, cVar, i12);
            } else if (iJ3 == 1836069985 || iJ3 == 1701733217 || iJ3 == 1633889587 || iJ3 == 1700998451 || iJ3 == 1633889588 || iJ3 == 1685353315 || iJ3 == 1685353317 || iJ3 == 1685353320 || iJ3 == 1685353324 || iJ3 == 1935764850 || iJ3 == 1935767394 || iJ3 == 1819304813 || iJ3 == 1936684916 || iJ3 == 1953984371 || iJ3 == 778924083 || iJ3 == 1634492771 || iJ3 == 1634492791 || iJ3 == 1970037111 || iJ3 == 1332770163 || iJ3 == 1716281667) {
                d(tVar, iJ3, iC, iJ2, i10, str, z10, drmInitData, cVar, i12);
            } else if (iJ3 == 1414810956 || iJ3 == 1954034535 || iJ3 == 2004251764 || iJ3 == 1937010800 || iJ3 == 1664495672) {
                t(tVar, iJ3, iC, iJ2, i10, str, cVar);
            } else if (iJ3 == 1667329389) {
                cVar.f73358b = Format.t(Integer.toString(i10), "application/x-camera-motion", null, -1, null);
            }
            tVar.L(iC + iJ2);
        }
        return cVar;
    }

    public static void t(t tVar, int i10, int i11, int i12, int i13, String str, c cVar) throws ParserException {
        tVar.L(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        List listSingletonList = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                tVar.h(bArr, 0, i14);
                listSingletonList = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                cVar.f73360d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.f73358b = Format.y(Integer.toString(i13), str2, null, -1, 0, str, -1, null, j10, listSingletonList);
    }

    public static f u(t tVar) {
        boolean z10;
        tVar.L(8);
        int iC = w3.a.c(tVar.j());
        tVar.M(iC == 0 ? 8 : 16);
        int iJ = tVar.j();
        tVar.M(4);
        int iC2 = tVar.c();
        int i10 = iC == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (tVar.f53154a[iC2 + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            tVar.M(i10);
        } else {
            long jA = iC == 0 ? tVar.A() : tVar.D();
            if (jA != 0) {
                j10 = jA;
            }
        }
        tVar.M(16);
        int iJ2 = tVar.j();
        int iJ3 = tVar.j();
        tVar.M(4);
        int iJ4 = tVar.j();
        int iJ5 = tVar.j();
        if (iJ2 == 0 && iJ3 == 65536 && iJ4 == -65536 && iJ5 == 0) {
            i11 = 90;
        } else if (iJ2 == 0 && iJ3 == -65536 && iJ4 == 65536 && iJ5 == 0) {
            i11 = 270;
        } else if (iJ2 == -65536 && iJ3 == 0 && iJ4 == 0 && iJ5 == -65536) {
            i11 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
        }
        return new f(iJ, j10, i11);
    }

    public static l v(w3.a.C0773a c0773a, w3.a.b bVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        w3.a.C0773a c0773aF = c0773a.f(1835297121);
        int iC = c(i(c0773aF.g(1751411826).f73346b));
        if (iC == -1) {
            return null;
        }
        f fVarU = u(c0773a.g(1953196132).f73346b);
        long j11 = j10 == -9223372036854775807L ? fVarU.f73370b : j10;
        long jM = m(bVar.f73346b);
        long jY0 = j11 != -9223372036854775807L ? k0.y0(j11, 1000000L, jM) : -9223372036854775807L;
        w3.a.C0773a c0773aF2 = c0773aF.f(1835626086).f(1937007212);
        Pair<Long, String> pairK = k(c0773aF.g(1835296868).f73346b);
        c cVarS = s(c0773aF2.g(1937011556).f73346b, fVarU.f73369a, fVarU.f73371c, (String) pairK.second, drmInitData, z11);
        if (z10) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> pairF = f(c0773a.f(1701082227));
            long[] jArr3 = (long[]) pairF.first;
            jArr2 = (long[]) pairF.second;
            jArr = jArr3;
        }
        if (cVarS.f73358b == null) {
            return null;
        }
        return new l(fVarU.f73369a, iC, ((Long) pairK.first).longValue(), jM, jY0, cVarS.f73358b, cVarS.f73360d, cVarS.f73357a, cVarS.f73359c, jArr, jArr2);
    }

    @Nullable
    public static Metadata x(t tVar, int i10) {
        tVar.M(12);
        while (tVar.c() < i10) {
            int iC = tVar.c();
            int iJ = tVar.j();
            if (tVar.j() == 1768715124) {
                tVar.L(iC);
                return j(tVar, iC + iJ);
            }
            tVar.L(iC + iJ);
        }
        return null;
    }

    public static void y(t tVar, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, c cVar, int i15) throws ParserException {
        int i16 = i11;
        DrmInitData drmInitDataC = drmInitData;
        tVar.L(i16 + 8 + 8);
        tVar.M(16);
        int iE = tVar.E();
        int iE2 = tVar.E();
        tVar.M(50);
        int iC = tVar.c();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, m> pairP = p(tVar, i16, i12);
            if (pairP != null) {
                iIntValue = ((Integer) pairP.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((m) pairP.second).f73464b);
                cVar.f73357a[i15] = (m) pairP.second;
            }
            tVar.L(iC);
        }
        DrmInitData drmInitData2 = drmInitDataC;
        int i17 = -1;
        String str = null;
        List<byte[]> listSingletonList = null;
        byte[] bArrO = null;
        float fN = 1.0f;
        String str2 = null;
        boolean z10 = false;
        while (iC - i16 < i12) {
            tVar.L(iC);
            int iC2 = tVar.c();
            int iJ = tVar.j();
            if (iJ == 0 && tVar.c() - i16 == i12) {
                break;
            }
            g5.a.b(iJ > 0, "childAtomSize should be positive");
            int iJ2 = tVar.j();
            if (iJ2 == 1635148611) {
                g5.a.f(str == null);
                tVar.L(iC2 + 8);
                h5.a aVarB = h5.a.b(tVar);
                listSingletonList = aVarB.f53703a;
                cVar.f73359c = aVarB.f53704b;
                if (!z10) {
                    fN = aVarB.f53707e;
                }
                str = "video/avc";
            } else if (iJ2 == 1752589123) {
                g5.a.f(str == null);
                tVar.L(iC2 + 8);
                h5.c cVarA = h5.c.a(tVar);
                listSingletonList = cVarA.f53711a;
                cVar.f73359c = cVarA.f53712b;
                str = "video/hevc";
            } else if (iJ2 == 1685480259 || iJ2 == 1685485123) {
                h5.b bVarA = h5.b.a(tVar);
                if (bVarA != null) {
                    str2 = bVarA.f53710c;
                    str = "video/dolby-vision";
                }
            } else if (iJ2 == 1987076931) {
                g5.a.f(str == null);
                str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (iJ2 == 1635135811) {
                g5.a.f(str == null);
                str = "video/av01";
            } else if (iJ2 == 1681012275) {
                g5.a.f(str == null);
                str = "video/3gpp";
            } else if (iJ2 == 1702061171) {
                g5.a.f(str == null);
                Pair<String, byte[]> pairG = g(tVar, iC2);
                str = (String) pairG.first;
                listSingletonList = Collections.singletonList((byte[]) pairG.second);
            } else if (iJ2 == 1885434736) {
                fN = n(tVar, iC2);
                z10 = true;
            } else if (iJ2 == 1937126244) {
                bArrO = o(tVar, iC2, iJ);
            } else if (iJ2 == 1936995172) {
                int iY = tVar.y();
                tVar.M(3);
                if (iY == 0) {
                    int iY2 = tVar.y();
                    if (iY2 == 0) {
                        i17 = 0;
                    } else if (iY2 == 1) {
                        i17 = 1;
                    } else if (iY2 == 2) {
                        i17 = 2;
                    } else if (iY2 == 3) {
                        i17 = 3;
                    }
                }
            }
            iC += iJ;
            i16 = i11;
        }
        if (str == null) {
            return;
        }
        cVar.f73358b = Format.C(Integer.toString(i13), str, str2, -1, -1, iE, iE2, -1.0f, listSingletonList, i14, fN, bArrO, i17, null, drmInitData2);
    }

    public static int b(t tVar, int i10, int i11) {
        boolean z10;
        int iC = tVar.c();
        while (iC - i10 < i11) {
            tVar.L(iC);
            int iJ = tVar.j();
            if (iJ > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g5.a.b(z10, "childAtomSize should be positive");
            if (tVar.j() == 1702061171) {
                return iC;
            }
            iC += iJ;
        }
        return -1;
    }

    public static int h(t tVar) {
        int iY = tVar.y();
        int i10 = iY & 127;
        while ((iY & 128) == 128) {
            iY = tVar.y();
            i10 = (i10 << 7) | (iY & 127);
        }
        return i10;
    }

    @Nullable
    public static Metadata l(w3.a.C0773a c0773a) {
        w3.a.b bVarG = c0773a.g(1751411826);
        w3.a.b bVarG2 = c0773a.g(1801812339);
        w3.a.b bVarG3 = c0773a.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || i(bVarG.f73346b) != 1835299937) {
            return null;
        }
        t tVar = bVarG2.f73346b;
        tVar.L(12);
        int iJ = tVar.j();
        String[] strArr = new String[iJ];
        for (int i10 = 0; i10 < iJ; i10++) {
            int iJ2 = tVar.j();
            tVar.M(4);
            strArr[i10] = tVar.v(iJ2 - 8);
        }
        t tVar2 = bVarG3.f73346b;
        tVar2.L(8);
        ArrayList arrayList = new ArrayList();
        while (tVar2.a() > 8) {
            int iC = tVar2.c();
            int iJ3 = tVar2.j();
            int iJ4 = tVar2.j() - 1;
            if (iJ4 >= 0 && iJ4 < iJ) {
                MdtaMetadataEntry mdtaMetadataEntryG = g.g(tVar2, iC + iJ3, strArr[iJ4]);
                if (mdtaMetadataEntryG != null) {
                    arrayList.add(mdtaMetadataEntryG);
                }
            } else {
                g5.m.h("AtomParsers", "Skipped metadata with unknown key index: " + iJ4);
            }
            tVar2.L(iC + iJ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair<Integer, m> p(t tVar, int i10, int i11) {
        boolean z10;
        Pair<Integer, m> pairE;
        int iC = tVar.c();
        while (iC - i10 < i11) {
            tVar.L(iC);
            int iJ = tVar.j();
            if (iJ > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g5.a.b(z10, "childAtomSize should be positive");
            if (tVar.j() == 1936289382 && (pairE = e(tVar, iC, iJ)) != null) {
                return pairE;
            }
            iC += iJ;
        }
        return null;
    }
}
