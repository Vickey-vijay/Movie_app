package m6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import l6.q;
import y5.i;
import y5.j;
import y5.k;

/* JADX INFO: compiled from: RSS14Reader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f64157i = {1, 10, 34, 70, 126};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f64158j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f64159k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f64160l = {0, 336, IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 1516};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f64161m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f64162n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f64163o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<d> f64164g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<d> f64165h = new ArrayList();

    @Override // l6.q
    public i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        q(this.f64164g, v(aVar, false, i10, map));
        aVar.p();
        q(this.f64165h, v(aVar, true, i10, map));
        aVar.p();
        for (d dVar : this.f64164g) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f64165h) {
                    if (dVar2.c() > 1 && s(dVar, dVar2)) {
                        return t(dVar, dVar2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final d v(c6.a aVar, boolean z10, int i10, Map<DecodeHintType, ?> map) {
        try {
            c cVarX = x(aVar, i10, z10, w(aVar, z10));
            k kVar = map == null ? null : (k) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (kVar != null) {
                int[] iArrB = cVarX.b();
                float fL = ((iArrB[0] + iArrB[1]) - 1) / 2.0f;
                if (z10) {
                    fL = (aVar.l() - 1) - fL;
                }
                kVar.a(new j(fL, i10));
            }
            b bVarU = u(aVar, cVarX, true);
            b bVarU2 = u(aVar, cVarX, false);
            return new d((bVarU.b() * 1597) + bVarU2.b(), bVarU.a() + (bVarU2.a() * 4), cVarX);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final c x(c6.a aVar, int i10, boolean z10, int[] iArr) throws NotFoundException {
        int iL;
        int i11;
        boolean zG = aVar.g(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && zG != aVar.g(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArrI = i();
        System.arraycopy(iArrI, 0, iArrI, 1, iArrI.length - 1);
        iArrI[0] = i14;
        int iP = a.p(iArrI, f64163o);
        int i15 = iArr[1];
        if (z10) {
            int iL2 = (aVar.l() - 1) - i13;
            iL = (aVar.l() - 1) - i15;
            i11 = iL2;
        } else {
            iL = i15;
            i11 = i13;
        }
        return new c(iP, new int[]{i13, iArr[1]}, i11, iL, i10);
    }

    public static void q(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        boolean z10 = false;
        for (d dVar2 : collection) {
            if (dVar2.b() == dVar.b()) {
                dVar2.e();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        collection.add(dVar);
    }

    @Override // l6.q, y5.h
    public void reset() {
        this.f64164g.clear();
        this.f64165h.clear();
    }

    public static boolean s(d dVar, d dVar2) {
        int iA = (dVar.a() + (dVar2.a() * 16)) % 79;
        int iC = (dVar.d().c() * 9) + dVar2.d().c();
        if (iC > 72) {
            iC--;
        }
        if (iC > 8) {
            iC--;
        }
        if (iA == iC) {
            return true;
        }
        return false;
    }

    public static i t(d dVar, d dVar2) {
        String strValueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(strValueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int iCharAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                iCharAt *= 3;
            }
            i10 += iCharAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        j[] jVarArrA = dVar.d().a();
        j[] jVarArrA2 = dVar2.d().a();
        return new i(sb2.toString(), null, new j[]{jVarArrA[0], jVarArrA[1], jVarArrA2[0], jVarArrA2[1]}, BarcodeFormat.RSS_14);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c A[PHI: r6 r7
  0x003c: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:22:0x003a, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r7v4 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:22:0x003a, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0041 A[PHI: r6 r7
  0x0041: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044 A[PHI: r6 r7
  0x0044: PHI (r6v7 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r7v11 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:24:0x003f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public final void r(boolean z10, int i10) throws NotFoundException {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int iD = d6.a.d(l());
        int iD2 = d6.a.d(j());
        boolean z16 = false;
        boolean z17 = true;
        if (z10) {
            if (iD > 12) {
                z11 = false;
                z12 = true;
            } else if (iD < 4) {
                z12 = false;
                z11 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            if (iD2 <= 12) {
                if (iD2 < 4) {
                    z14 = false;
                    z13 = true;
                } else {
                    z13 = false;
                    z14 = false;
                }
            } else {
                z13 = false;
                z14 = true;
            }
        } else {
            if (iD > 11) {
                z11 = false;
                z12 = true;
            } else if (iD < 5) {
                z12 = false;
                z11 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            if (iD2 > 10) {
                z13 = false;
                z14 = true;
            } else if (iD2 < 4) {
                z14 = false;
                z13 = true;
            } else {
                z13 = false;
                z14 = false;
            }
        }
        int i11 = (iD + iD2) - i10;
        if ((iD & 1) == z10) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((iD2 & 1) == 1) {
            z16 = true;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    if (z15) {
                        if (!z16) {
                            z12 = true;
                        } else {
                            throw NotFoundException.getNotFoundInstance();
                        }
                    } else if (z16) {
                        z14 = true;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z15) {
                if (z16) {
                    if (iD < iD2) {
                        z14 = true;
                    } else {
                        z13 = true;
                        z12 = true;
                    }
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z16) {
                throw NotFoundException.getNotFoundInstance();
            }
            z17 = z11;
        } else if (z15) {
            if (z16) {
                throw NotFoundException.getNotFoundInstance();
            }
        } else if (z16) {
            z13 = true;
            z17 = z11;
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z17) {
            if (!z12) {
                a.n(l(), m());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z12) {
            a.g(l(), m());
        }
        if (z13) {
            if (!z14) {
                a.n(j(), m());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z14) {
            a.g(j(), k());
        }
    }

    public final b u(c6.a aVar, c cVar, boolean z10) throws NotFoundException {
        int i10;
        int[] iArrH = h();
        Arrays.fill(iArrH, 0);
        if (z10) {
            q.f(aVar, cVar.b()[0], iArrH);
        } else {
            q.e(aVar, cVar.b()[1], iArrH);
            int i11 = 0;
            for (int length = iArrH.length - 1; i11 < length; length--) {
                int i12 = iArrH[i11];
                iArrH[i11] = iArrH[length];
                iArrH[length] = i12;
                i11++;
            }
        }
        if (z10) {
            i10 = 16;
        } else {
            i10 = 15;
        }
        float fD = d6.a.d(iArrH) / i10;
        int[] iArrL = l();
        int[] iArrJ = j();
        float[] fArrM = m();
        float[] fArrK = k();
        for (int i13 = 0; i13 < iArrH.length; i13++) {
            float f10 = iArrH[i13] / fD;
            int i14 = (int) (0.5f + f10);
            if (i14 <= 0) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                iArrL[i15] = i14;
                fArrM[i15] = f10 - i14;
            } else {
                iArrJ[i15] = i14;
                fArrK[i15] = f10 - i14;
            }
        }
        r(z10, i10);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = iArrL.length - 1; length2 >= 0; length2--) {
            int i18 = iArrL[length2];
            i16 = (i16 * 9) + i18;
            i17 += i18;
        }
        int i19 = 0;
        int i20 = 0;
        for (int length3 = iArrJ.length - 1; length3 >= 0; length3--) {
            int i21 = iArrJ[length3];
            i19 = (i19 * 9) + i21;
            i20 += i21;
        }
        int i22 = i16 + (i19 * 3);
        if (z10) {
            if ((i17 & 1) == 0 && i17 <= 12 && i17 >= 4) {
                int i23 = (12 - i17) / 2;
                int i24 = f64161m[i23];
                int i25 = 9 - i24;
                return new b((f.b(iArrL, i24, false) * f64157i[i23]) + f.b(iArrJ, i25, true) + f64159k[i23], i22);
            }
            throw NotFoundException.getNotFoundInstance();
        }
        if ((i20 & 1) == 0 && i20 <= 10 && i20 >= 4) {
            int i26 = (10 - i20) / 2;
            int i27 = f64162n[i26];
            return new b((f.b(iArrJ, 9 - i27, false) * f64158j[i26]) + f.b(iArrL, i27, true) + f64160l[i26], i22);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] w(c6.a aVar, boolean z10) throws NotFoundException {
        int[] iArrI = i();
        iArrI[0] = 0;
        iArrI[1] = 0;
        iArrI[2] = 0;
        iArrI[3] = 0;
        int iL = aVar.l();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < iL) {
            z11 = !aVar.g(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < iL) {
            if (aVar.g(i10) != z11) {
                iArrI[i11] = iArrI[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (a.o(iArrI)) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArrI[0] + iArrI[1];
                    iArrI[0] = iArrI[2];
                    iArrI[1] = iArrI[3];
                    iArrI[2] = 0;
                    iArrI[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArrI[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
