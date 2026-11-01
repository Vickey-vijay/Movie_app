package ql;

import android.text.TextUtils;
import kl.c;
import kl.l;
import ll.f;
import ll.g;

/* JADX INFO: compiled from: DanmakuUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static boolean b(int i10, int i11, float[] fArr, float[] fArr2) {
        if (i10 != i11) {
            return false;
        }
        if (i10 == 1) {
            return fArr2[0] < fArr[2];
        }
        return i10 == 6 && fArr2[2] > fArr[0];
    }

    public static int f(int i10, int i11, int i12) {
        return i10 * i11 * i12;
    }

    public static final boolean g(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return false;
        }
        CharSequence charSequence = cVar.f62892c;
        CharSequence charSequence2 = cVar2.f62892c;
        if (charSequence == charSequence2) {
            return true;
        }
        return charSequence != null && charSequence.equals(charSequence2);
    }

    public static f a(c cVar, l lVar, f fVar, int i10) {
        if (fVar == null) {
            fVar = new f();
        }
        fVar.h((int) Math.ceil(cVar.f62904o), (int) Math.ceil(cVar.f62905p), lVar.d(), false, i10);
        g gVar = fVar.get();
        if (gVar != null) {
            ((kl.a) lVar).s(cVar, gVar.f63711a, 0.0f, 0.0f, true);
            if (lVar.isHardwareAccelerated()) {
                gVar.e(lVar.getWidth(), lVar.getHeight(), lVar.o(), lVar.h());
            }
        }
        return fVar;
    }

    public static final int d(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return 0;
        }
        if (cVar == null) {
            return -1;
        }
        if (cVar2 == null) {
            return 1;
        }
        long j10 = cVar.j() - cVar2.j();
        if (j10 > 0) {
            return 1;
        }
        if (j10 < 0) {
            return -1;
        }
        int i10 = cVar.f62907r - cVar2.f62907r;
        if (i10 != 0) {
            return i10 < 0 ? -1 : 1;
        }
        return cVar.hashCode() - cVar.hashCode();
    }

    public static void e(c cVar, CharSequence charSequence) {
        cVar.f62892c = charSequence;
        if (TextUtils.isEmpty(charSequence) || !charSequence.toString().contains("/n")) {
            return;
        }
        String[] strArrSplit = String.valueOf(cVar.f62892c).split("/n", -1);
        if (strArrSplit.length > 1) {
            cVar.f62893d = strArrSplit;
        }
    }

    public static boolean c(l lVar, c cVar, c cVar2, long j10) {
        float[] fArrH = cVar.h(lVar, j10);
        float[] fArrH2 = cVar2.h(lVar, j10);
        if (fArrH != null && fArrH2 != null) {
            return b(cVar.getType(), cVar2.getType(), fArrH, fArrH2);
        }
        return false;
    }

    public static boolean h(l lVar, c cVar, c cVar2, long j10, long j11) {
        int type = cVar.getType();
        if (type != cVar2.getType() || cVar.r()) {
            return false;
        }
        long jB = cVar2.b() - cVar.b();
        if (jB <= 0) {
            return true;
        }
        if (Math.abs(jB) >= j10 || cVar.v() || cVar2.v()) {
            return false;
        }
        if (type == 5 || type == 4) {
            return true;
        }
        if (!c(lVar, cVar, cVar2, j11) && !c(lVar, cVar, cVar2, cVar.b() + cVar.f())) {
            return false;
        }
        return true;
    }
}
