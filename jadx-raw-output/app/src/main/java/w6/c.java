package w6;

import c6.f;
import c6.h;
import c6.j;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.util.Map;
import y5.k;

/* JADX INFO: compiled from: Detector.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.b f73523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f73524b;

    public final a f(float f10, int i10, int i11, float f11) throws NotFoundException {
        int i12 = (int) (f11 * f10);
        int iMax = Math.max(0, i10 - i12);
        int iMin = Math.min(this.f73523a.j() - 1, i10 + i12) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(this.f73523a.g() - 1, i11 + i12) - iMax2;
        if (iMin2 >= f12) {
            return new b(this.f73523a, iMax, iMax2, iMin, iMin2, f10, this.f73524b).c();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static j d(y5.j jVar, y5.j jVar2, y5.j jVar3, y5.j jVar4, int i10) {
        float fC;
        float fD;
        float f10;
        float f11 = i10 - 3.5f;
        if (jVar4 != null) {
            fC = jVar4.c();
            fD = jVar4.d();
            f10 = f11 - 3.0f;
        } else {
            fC = (jVar2.c() - jVar.c()) + jVar3.c();
            fD = (jVar2.d() - jVar.d()) + jVar3.d();
            f10 = f11;
        }
        return j.b(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, jVar.c(), jVar.d(), jVar2.c(), jVar2.d(), fC, fD, jVar3.c(), jVar3.d());
    }

    public final f e(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f73524b = map == null ? null : (k) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        return g(new FinderPatternFinder(this.f73523a, this.f73524b).g(map));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[RETURN] */
    public final float i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int iAbs = Math.abs(i16 - i14);
        int iAbs2 = Math.abs(i17 - i15);
        int i20 = 2;
        int i21 = (-iAbs) / 2;
        int i22 = i14 < i16 ? 1 : -1;
        int i23 = i15 < i17 ? 1 : -1;
        int i24 = i16 + i22;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if ((i27 == i19 ? i19 : 0) == this.f73523a.d(z10 ? i26 : i25, z10 ? i25 : i26)) {
                if (i27 == 2) {
                    return d6.a.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i21 += iAbs2;
            if (i21 > 0) {
                if (i26 == i17) {
                    i18 = 2;
                    if (i27 == i18) {
                        return d6.a.b(i24, i17, i14, i15);
                    }
                    return Float.NaN;
                }
                i26 += i23;
                i21 -= iAbs;
            }
            i25 += i22;
            i24 = i24;
            z10 = z10;
            i19 = 1;
            i20 = 2;
        }
        i24 = i24;
        i18 = i20;
        if (i27 == i18) {
            return d6.a.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    public c(c6.b bVar) {
        this.f73523a = bVar;
    }

    public static int c(y5.j jVar, y5.j jVar2, y5.j jVar3, float f10) throws NotFoundException {
        int iC = ((d6.a.c(y5.j.b(jVar, jVar2) / f10) + d6.a.c(y5.j.b(jVar, jVar3) / f10)) / 2) + 7;
        int i10 = iC & 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 == 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                return iC;
            }
            return iC - 1;
        }
        return iC + 1;
    }

    public static c6.b h(c6.b bVar, j jVar, int i10) throws NotFoundException {
        return h.b().d(bVar, i10, i10, jVar);
    }

    public final float a(y5.j jVar, y5.j jVar2, y5.j jVar3) {
        return (b(jVar, jVar2) + b(jVar, jVar3)) / 2.0f;
    }

    public final float b(y5.j jVar, y5.j jVar2) {
        float fJ = j((int) jVar.c(), (int) jVar.d(), (int) jVar2.c(), (int) jVar2.d());
        float fJ2 = j((int) jVar2.c(), (int) jVar2.d(), (int) jVar.c(), (int) jVar.d());
        if (Float.isNaN(fJ)) {
            return fJ2 / 7.0f;
        }
        if (Float.isNaN(fJ2)) {
            return fJ / 7.0f;
        }
        return (fJ + fJ2) / 14.0f;
    }

    public final f g(e eVar) throws NotFoundException, FormatException {
        y5.j[] jVarArr;
        d dVarB = eVar.b();
        d dVarC = eVar.c();
        d dVarA = eVar.a();
        float fA = a(dVarB, dVarC, dVarA);
        if (fA >= 1.0f) {
            int iC = c(dVarB, dVarC, dVarA, fA);
            v6.f fVarG = v6.f.g(iC);
            int iE = fVarG.e() - 7;
            a aVarF = null;
            if (fVarG.d().length > 0) {
                float fC = (dVarC.c() - dVarB.c()) + dVarA.c();
                float fD = (dVarC.d() - dVarB.d()) + dVarA.d();
                float f10 = 1.0f - (3.0f / iE);
                int iC2 = (int) (dVarB.c() + ((fC - dVarB.c()) * f10));
                int iD = (int) (dVarB.d() + (f10 * (fD - dVarB.d())));
                for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                    try {
                        aVarF = f(fA, iC2, iD, i10);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
            }
            c6.b bVarH = h(this.f73523a, d(dVarB, dVarC, dVarA, aVarF, iC), iC);
            if (aVarF == null) {
                jVarArr = new y5.j[]{dVarA, dVarB, dVarC};
            } else {
                jVarArr = new y5.j[]{dVarA, dVarB, dVarC, aVarF};
            }
            return new f(bVarH, jVarArr);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final float j(int i10, int i11, int i12, int i13) {
        float fJ;
        float fG;
        float fI = i(i10, i11, i12, i13);
        int iJ = i10 - (i12 - i10);
        int iG = 0;
        if (iJ < 0) {
            fJ = i10 / (i10 - iJ);
            iJ = 0;
        } else if (iJ >= this.f73523a.j()) {
            fJ = ((this.f73523a.j() - 1) - i10) / (iJ - i10);
            iJ = this.f73523a.j() - 1;
        } else {
            fJ = 1.0f;
        }
        float f10 = i11;
        int i14 = (int) (f10 - ((i13 - i11) * fJ));
        if (i14 < 0) {
            fG = f10 / (i11 - i14);
        } else if (i14 >= this.f73523a.g()) {
            fG = ((this.f73523a.g() - 1) - i11) / (i14 - i11);
            iG = this.f73523a.g() - 1;
        } else {
            iG = i14;
            fG = 1.0f;
        }
        return (fI + i(i10, i11, (int) (i10 + ((iJ - i10) * fG)), iG)) - 1.0f;
    }
}
