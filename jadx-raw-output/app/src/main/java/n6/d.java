package n6;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l6.q;
import m6.f;
import o6.j;
import y5.i;

/* JADX INFO: compiled from: RSSExpandedReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d extends m6.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f64691k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f64692l = {4, 20, 52, 104, 204};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f64693m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[][] f64694n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f64695o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, BaseTransientBottomBar.ANIMATION_FADE_DURATION, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, new int[]{185, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, new int[]{103, 98, 83, 38, 114, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[][] f64696p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<b> f64697g = new ArrayList(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<c> f64698h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f64699i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f64700j;

    public static void F(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    public final m6.c C(c6.a aVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f64699i[0] - 1;
            while (i14 >= 0 && !aVar.g(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f64699i;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f64699i;
            int i16 = iArr2[0];
            int iK = aVar.k(iArr2[1] + 1);
            i11 = iK;
            i12 = i16;
            i13 = iK - this.f64699i[1];
        }
        int[] iArrI = i();
        System.arraycopy(iArrI, 0, iArrI, 1, iArrI.length - 1);
        iArrI[0] = i13;
        try {
            return new m6.c(m6.a.p(iArrI, f64694n), new int[]{i12, i11}, i12, i11, i10);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public final void G(int i10) {
        boolean zC;
        int i11 = 0;
        boolean zC2 = false;
        while (true) {
            if (i11 >= this.f64698h.size()) {
                zC = false;
                break;
            }
            c cVar = this.f64698h.get(i11);
            if (cVar.b() > i10) {
                zC = cVar.c(this.f64697g);
                break;
            } else {
                zC2 = cVar.c(this.f64697g);
                i11++;
            }
        }
        if (zC || zC2 || A(this.f64697g, this.f64698h)) {
            return;
        }
        this.f64698h.add(i11, new c(this.f64697g, i10, false));
        D(this.f64697g, this.f64698h);
    }

    public m6.b v(c6.a aVar, m6.c cVar, boolean z10, boolean z11) throws NotFoundException {
        int[] iArrH = h();
        Arrays.fill(iArrH, 0);
        if (z11) {
            q.f(aVar, cVar.b()[0], iArrH);
        } else {
            q.e(aVar, cVar.b()[1], iArrH);
            int i10 = 0;
            for (int length = iArrH.length - 1; i10 < length; length--) {
                int i11 = iArrH[i10];
                iArrH[i10] = iArrH[length];
                iArrH[length] = i11;
                i10++;
            }
        }
        float fD = d6.a.d(iArrH) / 17.0f;
        float f10 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(fD - f10) / f10 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] iArrL = l();
        int[] iArrJ = j();
        float[] fArrM = m();
        float[] fArrK = k();
        for (int i12 = 0; i12 < iArrH.length; i12++) {
            float f11 = (iArrH[i12] * 1.0f) / fD;
            int i13 = (int) (0.5f + f11);
            if (i13 <= 0) {
                if (f11 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i13 = 1;
            } else if (i13 > 8) {
                if (f11 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                iArrL[i14] = i13;
                fArrM[i14] = f11 - i13;
            } else {
                iArrJ[i14] = i13;
                fArrK[i14] = f11 - i13;
            }
        }
        q(17);
        int iC = (((cVar.c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int i15 = 0;
        int i16 = 0;
        for (int length2 = iArrL.length - 1; length2 >= 0; length2--) {
            if (z(cVar, z10, z11)) {
                i15 += iArrL[length2] * f64695o[iC][length2 * 2];
            }
            i16 += iArrL[length2];
        }
        int i17 = 0;
        for (int length3 = iArrJ.length - 1; length3 >= 0; length3--) {
            if (z(cVar, z10, z11)) {
                i17 += iArrJ[length3] * f64695o[iC][(length3 * 2) + 1];
            }
        }
        int i18 = i15 + i17;
        if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i19 = (13 - i16) / 2;
        int i20 = f64691k[i19];
        return new m6.b((f.b(iArrL, i20, true) * f64692l[i19]) + f.b(iArrJ, 9 - i20, false) + f64693m[i19], i18);
    }

    public List<b> w(int i10, c6.a aVar) throws NotFoundException {
        boolean z10 = false;
        while (!z10) {
            try {
                List<b> list = this.f64697g;
                list.add(E(aVar, list, i10));
            } catch (NotFoundException e10) {
                if (this.f64697g.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (r()) {
            return this.f64697g;
        }
        boolean z11 = !this.f64698h.isEmpty();
        G(i10);
        if (z11) {
            List<b> listT = t(false);
            if (listT != null) {
                return listT;
            }
            List<b> listT2 = t(true);
            if (listT2 != null) {
                return listT2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static boolean B(List<b> list) {
        boolean z10;
        for (int[] iArr : f64696p) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    }
                    if (list.get(i10).a().c() != iArr[i10]) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l6.q
    public i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f64697g.clear();
        this.f64700j = false;
        try {
            return u(w(i10, aVar));
        } catch (NotFoundException unused) {
            this.f64697g.clear();
            this.f64700j = true;
            return u(w(i10, aVar));
        }
    }

    public final boolean r() {
        b bVar = this.f64697g.get(0);
        m6.b bVarB = bVar.b();
        m6.b bVarC = bVar.c();
        if (bVarC == null) {
            return false;
        }
        int iA = bVarC.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f64697g.size(); i11++) {
            b bVar2 = this.f64697g.get(i11);
            iA += bVar2.b().a();
            i10++;
            m6.b bVarC2 = bVar2.c();
            if (bVarC2 != null) {
                iA += bVarC2.a();
                i10++;
            }
        }
        return ((i10 + (-4)) * LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE) + (iA % LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE) == bVarB.b();
    }

    @Override // l6.q, y5.h
    public void reset() {
        this.f64697g.clear();
        this.f64698h.clear();
    }

    public final List<b> s(List<c> list, int i10) throws NotFoundException {
        while (i10 < this.f64698h.size()) {
            c cVar = this.f64698h.get(i10);
            this.f64697g.clear();
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                this.f64697g.addAll(it.next().a());
            }
            this.f64697g.addAll(cVar.a());
            if (B(this.f64697g)) {
                if (r()) {
                    return this.f64697g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return s(arrayList, i10 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final List<b> t(boolean z10) {
        List<b> listS = null;
        if (this.f64698h.size() > 25) {
            this.f64698h.clear();
            return null;
        }
        this.f64697g.clear();
        if (z10) {
            Collections.reverse(this.f64698h);
        }
        try {
            listS = s(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z10) {
            Collections.reverse(this.f64698h);
        }
        return listS;
    }

    public static boolean A(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z10;
        boolean z11;
        Iterator<c> it = iterable2.iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            c next = it.next();
            Iterator<b> it2 = iterable.iterator();
            do {
                if (it2.hasNext()) {
                    b next2 = it2.next();
                    Iterator<b> it3 = next.a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                } else {
                    z10 = true;
                    break;
                }
            } while (z11);
        } while (!z10);
        return true;
    }

    public static void D(Collection<b> collection, Collection<c> collection2) {
        Iterator<c> it = collection2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != collection.size()) {
                boolean z10 = true;
                Iterator<b> it2 = next.a().iterator();
                while (it2.hasNext()) {
                    if (!collection.contains(it2.next())) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    it.remove();
                }
            }
        }
    }

    public static i u(List<b> list) throws NotFoundException, FormatException {
        String strD = j.a(a.a(list)).d();
        y5.j[] jVarArrA = list.get(0).a().a();
        y5.j[] jVarArrA2 = list.get(list.size() - 1).a().a();
        return new i(strD, null, new y5.j[]{jVarArrA[0], jVarArrA[1], jVarArrA2[0], jVarArrA2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    public static int y(c6.a aVar, int i10) {
        if (aVar.g(i10)) {
            return aVar.j(aVar.k(i10));
        }
        return aVar.k(aVar.j(i10));
    }

    public static boolean z(m6.c cVar, boolean z10, boolean z11) {
        if (cVar.c() == 0 && z10 && z11) {
            return false;
        }
        return true;
    }

    public b E(c6.a aVar, List<b> list, int i10) throws NotFoundException {
        boolean z10;
        m6.c cVarC;
        m6.b bVarV;
        if (list.size() % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f64700j) {
            z10 = !z10;
        }
        int iY = -1;
        boolean z11 = true;
        do {
            x(aVar, list, iY);
            cVarC = C(aVar, i10, z10);
            if (cVarC == null) {
                iY = y(aVar, this.f64699i[0]);
            } else {
                z11 = false;
            }
        } while (z11);
        m6.b bVarV2 = v(aVar, cVarC, z10, true);
        if (!list.isEmpty() && list.get(list.size() - 1).d()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            bVarV = v(aVar, cVarC, z10, false);
        } catch (NotFoundException unused) {
            bVarV = null;
        }
        return new b(bVarV2, bVarV, cVarC);
    }

    public final void q(int i10) throws NotFoundException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int iD = d6.a.d(l());
        int iD2 = d6.a.d(j());
        boolean z15 = false;
        boolean z16 = true;
        if (iD > 13) {
            z10 = false;
            z11 = true;
        } else if (iD < 4) {
            z11 = false;
            z10 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        if (iD2 > 13) {
            z12 = false;
            z13 = true;
        } else if (iD2 < 4) {
            z13 = false;
            z12 = true;
        } else {
            z12 = false;
            z13 = false;
        }
        int i11 = (iD + iD2) - i10;
        if ((iD & 1) == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((iD2 & 1) == 0) {
            z15 = true;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    if (z14) {
                        if (!z15) {
                            z11 = true;
                        } else {
                            throw NotFoundException.getNotFoundInstance();
                        }
                    } else if (z15) {
                        z13 = true;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z14) {
                if (z15) {
                    if (iD < iD2) {
                        z13 = true;
                    } else {
                        z12 = true;
                        z11 = true;
                    }
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z15) {
                throw NotFoundException.getNotFoundInstance();
            }
            z16 = z10;
        } else if (z14) {
            if (z15) {
                throw NotFoundException.getNotFoundInstance();
            }
        } else if (z15) {
            z12 = true;
            z16 = z10;
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z16) {
            if (!z11) {
                m6.a.n(l(), m());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z11) {
            m6.a.g(l(), m());
        }
        if (z12) {
            if (!z13) {
                m6.a.n(j(), m());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z13) {
            m6.a.g(j(), k());
        }
    }

    public final void x(c6.a aVar, List<b> list, int i10) throws NotFoundException {
        boolean z10;
        int[] iArrI = i();
        iArrI[0] = 0;
        iArrI[1] = 0;
        iArrI[2] = 0;
        iArrI[3] = 0;
        int iL = aVar.l();
        if (i10 < 0) {
            if (list.isEmpty()) {
                i10 = 0;
            } else {
                i10 = list.get(list.size() - 1).a().b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f64700j) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < iL) {
            z11 = !aVar.g(i10);
            if (!z11) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = 0;
        boolean z12 = z11;
        int i12 = i10;
        while (i10 < iL) {
            if (aVar.g(i10) != z12) {
                iArrI[i11] = iArrI[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        F(iArrI);
                    }
                    if (m6.a.o(iArrI)) {
                        int[] iArr = this.f64699i;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        F(iArrI);
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
                z12 = !z12;
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
