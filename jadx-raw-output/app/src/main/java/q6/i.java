package q6;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import java.lang.reflect.Array;
import java.util.ArrayList;
import y5.j;

/* JADX INFO: compiled from: PDF417ScanningDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r6.a f66552a = new r6.a();

    public static c a(g gVar) throws NotFoundException {
        int[] iArrJ;
        if (gVar == null || (iArrJ = gVar.j()) == null) {
            return null;
        }
        int iP = p(iArrJ);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArrJ) {
            i11 += iP - i12;
            if (i12 > 0) {
                break;
            }
        }
        d[] dVarArrD = gVar.d();
        for (int i13 = 0; i11 > 0 && dVarArrD[i13] == null; i13++) {
            i11--;
        }
        for (int length = iArrJ.length - 1; length >= 0; length--) {
            int i14 = iArrJ[length];
            i10 += iP - i14;
            if (i14 > 0) {
                break;
            }
        }
        for (int length2 = dVarArrD.length - 1; i10 > 0 && dVarArrD[length2] == null; length2--) {
            i10--;
        }
        return gVar.a().a(i11, i10, gVar.k());
    }

    public static void b(e eVar, b[][] bVarArr) throws NotFoundException {
        b bVar = bVarArr[0][1];
        int[] iArrA = bVar.a();
        int iJ = (eVar.j() * eVar.l()) - r(eVar.k());
        if (iArrA.length == 0) {
            if (iJ <= 0 || iJ > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            bVar.b(iJ);
            return;
        }
        if (iArrA[0] == iJ || iJ <= 0 || iJ > 928) {
            return;
        }
        bVar.b(iJ);
    }

    public static boolean d(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    public static c6.d h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return j(iArr, i10, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr5[i14];
                    if (i15 < iArr4[i14].length - 1) {
                        iArr5[i14] = i15 + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
                i11 = i12;
            }
        }
    }

    public static c6.d j(int[] iArr, int i10, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i11 = 1 << (i10 + 1);
        int iE = e(iArr, iArr2, i11);
        w(iArr, i11);
        c6.d dVarB = DecodedBitStreamParser.b(iArr, String.valueOf(i10));
        dVarB.k(Integer.valueOf(iE));
        dVarB.j(Integer.valueOf(iArr2.length));
        return dVarB;
    }

    public static a l(g gVar, g gVar2) {
        a aVarI;
        a aVarI2;
        if (gVar == null || (aVarI = gVar.i()) == null) {
            if (gVar2 == null) {
                return null;
            }
            return gVar2.i();
        }
        if (gVar2 == null || (aVarI2 = gVar2.i()) == null || aVarI.a() == aVarI2.a() || aVarI.b() == aVarI2.b() || aVarI.c() == aVarI2.c()) {
            return aVarI;
        }
        return null;
    }

    public static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static int p(int[] iArr) {
        int iMax = -1;
        for (int i10 : iArr) {
            iMax = Math.max(iMax, i10);
        }
        return iMax;
    }

    public static int r(int i10) {
        return 2 << i10;
    }

    public static e v(g gVar, g gVar2) throws NotFoundException {
        a aVarL;
        if ((gVar == null && gVar2 == null) || (aVarL = l(gVar, gVar2)) == null) {
            return null;
        }
        return new e(aVarL, c.j(a(gVar), a(gVar2)));
    }

    public static void w(int[] iArr, int i10) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    public static int c(c6.b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int i14 = z10 ? -1 : 1;
        int i15 = i12;
        for (int i16 = 0; i16 < 2; i16++) {
            while (true) {
                if (!z10) {
                    if (i15 >= i11) {
                        break;
                    }
                    if (z10 == bVar.d(i15, i13)) {
                        break;
                        break;
                    }
                    if (Math.abs(i12 - i15) > 2) {
                        return i12;
                    }
                    i15 += i14;
                } else {
                    if (i15 < i10) {
                        break;
                    }
                    if (z10 == bVar.d(i15, i13)) {
                        break;
                    }
                    if (Math.abs(i12 - i15) > 2) {
                        return i12;
                    }
                    i15 += i14;
                }
            }
            i14 = -i14;
            z10 = !z10;
        }
        return i15;
    }

    public static int e(int[] iArr, int[] iArr2, int i10) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f66552a.a(iArr, i10, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    public static c6.d i(c6.b bVar, j jVar, j jVar2, j jVar3, j jVar4, int i10, int i11) throws NotFoundException, ChecksumException, FormatException {
        int i12;
        int i13;
        int i14;
        c cVar = new c(bVar, jVar, jVar2, jVar3, jVar4);
        g gVarS = null;
        g gVarS2 = null;
        boolean z10 = true;
        while (true) {
            c cVar2 = cVar;
            if (jVar != null) {
                gVarS = s(bVar, cVar2, jVar, true, i10, i11);
            }
            if (jVar3 != null) {
                gVarS2 = s(bVar, cVar2, jVar3, false, i10, i11);
            }
            e eVarV = v(gVarS, gVarS2);
            if (eVarV == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            cVar = eVarV.m();
            if (!z10 || cVar == null || (cVar.g() >= cVar2.g() && cVar.e() <= cVar2.e())) {
                eVarV.p(cVar2);
                int iJ = eVarV.j() + 1;
                eVarV.q(0, gVarS);
                eVarV.q(iJ, gVarS2);
                boolean z11 = gVarS != null;
                int iMin = i10;
                int iMax = i11;
                for (int i15 = 1; i15 <= iJ; i15++) {
                    int i16 = z11 ? i15 : iJ - i15;
                    if (eVarV.n(i16) == null) {
                        f gVar = (i16 == 0 || i16 == iJ) ? new g(cVar2, i16 == 0) : new f(cVar2);
                        eVarV.q(i16, gVar);
                        int i17 = -1;
                        int iG = cVar2.g();
                        int i18 = -1;
                        while (iG <= cVar2.e()) {
                            int iT = t(eVarV, i16, iG, z11);
                            if (iT < 0 || iT > cVar2.d()) {
                                if (i18 != i17) {
                                    i14 = i18;
                                } else {
                                    i12 = iG;
                                    i13 = i17;
                                }
                                i18 = i18;
                                iG = i12 + 1;
                                i17 = i13;
                            } else {
                                i14 = iT;
                            }
                            int i19 = iG;
                            i13 = i17;
                            d dVarK = k(bVar, cVar2.f(), cVar2.d(), z11, i14, i19, iMin, iMax);
                            i12 = i19;
                            if (dVarK != null) {
                                gVar.f(i12, dVarK);
                                iMin = Math.min(iMin, dVarK.f());
                                iMax = Math.max(iMax, dVarK.f());
                                i18 = i14;
                            } else {
                                i18 = i18;
                            }
                            iG = i12 + 1;
                            i17 = i13;
                        }
                    }
                }
                return g(eVarV);
            }
            z10 = false;
        }
    }

    public static int[] m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:28:0x0027 A[EDGE_INSN: B:28:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:7:0x000c->B:31:0x000c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x001b A[SYNTHETIC] */
    public static int[] q(c6.b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int[] iArr = new int[8];
        int i14 = z10 ? 1 : -1;
        int i15 = 0;
        boolean z11 = z10;
        while (true) {
            if (!z10) {
                if (i12 < i10) {
                    break;
                }
                if (i15 < 8) {
                    break;
                    break;
                }
                if (bVar.d(i12, i13) == z11) {
                    iArr[i15] = iArr[i15] + 1;
                    i12 += i14;
                } else {
                    i15++;
                    z11 = !z11;
                }
            } else {
                if (i12 >= i11) {
                    break;
                }
                if (i15 < 8) {
                    break;
                }
                if (bVar.d(i12, i13) == z11) {
                    iArr[i15] = iArr[i15] + 1;
                    i12 += i14;
                } else {
                    i15++;
                    z11 = !z11;
                }
            }
        }
        if (i15 != 8) {
            if (z10) {
                i10 = i11;
            }
            if (i12 != i10 || i15 != 7) {
                return null;
            }
        }
        return iArr;
    }

    public static g s(c6.b bVar, c cVar, j jVar, boolean z10, int i10, int i11) {
        g gVar = new g(cVar, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int iC = (int) jVar.c();
            for (int iD = (int) jVar.d(); iD <= cVar.e() && iD >= cVar.g(); iD += i13) {
                d dVarK = k(bVar, 0, bVar.j(), z10, iC, iD, i10, i11);
                if (dVarK != null) {
                    gVar.f(iD, dVarK);
                    iC = z10 ? dVarK.d() : dVarK.b();
                }
            }
            i12++;
        }
        return gVar;
    }

    public static int t(e eVar, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        d dVarB = u(eVar, i13) ? eVar.n(i13).b(i11) : null;
        if (dVarB != null) {
            return z10 ? dVarB.b() : dVarB.d();
        }
        d dVarC = eVar.n(i10).c(i11);
        if (dVarC != null) {
            return z10 ? dVarC.d() : dVarC.b();
        }
        if (u(eVar, i13)) {
            dVarC = eVar.n(i13).c(i11);
        }
        if (dVarC != null) {
            return z10 ? dVarC.b() : dVarC.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!u(eVar, i10)) {
                c cVarM = eVar.m();
                return z10 ? cVarM.f() : cVarM.d();
            }
            for (d dVar : eVar.n(i10).d()) {
                if (dVar != null) {
                    return (z10 ? dVar.b() : dVar.d()) + (i12 * i14 * (dVar.b() - dVar.d()));
                }
            }
            i14++;
        }
    }

    public static boolean u(e eVar, int i10) {
        return i10 >= 0 && i10 <= eVar.j() + 1;
    }

    public static b[][] f(e eVar) {
        int iC;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, eVar.l(), eVar.j() + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i10 = 0;
            while (true) {
                if (i10 < bVarArr2.length) {
                    bVarArr2[i10] = new b();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (f fVar : eVar.o()) {
            if (fVar != null) {
                for (d dVar : fVar.d()) {
                    if (dVar != null && (iC = dVar.c()) >= 0 && iC < bVarArr.length) {
                        bVarArr[iC][i11].b(dVar.e());
                    }
                }
            }
            i11++;
        }
        return bVarArr;
    }

    public static c6.d g(e eVar) throws NotFoundException, ChecksumException, FormatException {
        b[][] bVarArrF = f(eVar);
        b(eVar, bVarArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[eVar.l() * eVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < eVar.l(); i10++) {
            int i11 = 0;
            while (i11 < eVar.j()) {
                int i12 = i11 + 1;
                int[] iArrA = bVarArrF[i10][i12].a();
                int iJ = (eVar.j() * i10) + i11;
                if (iArrA.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrA.length == 1) {
                    iArr[iJ] = iArrA[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrA);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return h(eVar.k(), iArr, p6.a.b(arrayList), p6.a.b(arrayList3), iArr2);
    }

    public static d k(c6.b bVar, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int iD;
        int iA;
        int iC = c(bVar, i10, i11, z10, i12, i13);
        int[] iArrQ = q(bVar, i10, i11, z10, iC, i13);
        if (iArrQ == null) {
            return null;
        }
        int iD2 = d6.a.d(iArrQ);
        if (z10) {
            i16 = iC + iD2;
        } else {
            for (int i17 = 0; i17 < iArrQ.length / 2; i17++) {
                int i18 = iArrQ[i17];
                iArrQ[i17] = iArrQ[(iArrQ.length - 1) - i17];
                iArrQ[(iArrQ.length - 1) - i17] = i18;
            }
            iC -= iD2;
            i16 = iC;
        }
        if (!d(iD2, i14, i15) || (iA = p6.a.a((iD = h.d(iArrQ)))) == -1) {
            return null;
        }
        return new d(iC, i16, n(iD), iA);
    }

    public static int n(int i10) {
        return o(m(i10));
    }
}
