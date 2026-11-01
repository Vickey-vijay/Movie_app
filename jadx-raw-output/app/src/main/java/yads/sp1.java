package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class sp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f82730a;

    public /* synthetic */ sp1() {
        this(nj.s.n("AppOpenAd", "Banner", "Interstitial", "Rewarded", "Native"));
    }

    public final e00 a(qq1 qq1Var) {
        Object next;
        String strF0 = lk.a0.F0(lk.a0.Z0(qq1Var.f81930b, '.', null, 2, null), "Adapter");
        if (strF0.length() <= 0) {
            strF0 = null;
        }
        if (strF0 == null) {
            return null;
        }
        Iterator it = this.f82730a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!lk.x.D(strF0, (String) next, false, 2, null));
        String str = (String) next;
        if (str == null) {
            return null;
        }
        d00 d00Var = e00.f76858c;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        d00Var.getClass();
        return d00.a(lowerCase);
    }

    public final String b(qq1 qq1Var) {
        Object next;
        String strF0 = lk.a0.F0(lk.a0.Z0(qq1Var.f81930b, '.', null, 2, null), "Adapter");
        if (strF0.length() <= 0) {
            strF0 = null;
        }
        if (strF0 == null) {
            return null;
        }
        Iterator it = this.f82730a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!lk.x.D(strF0, (String) next, false, 2, null));
        String str = (String) next;
        if (str == null) {
            return null;
        }
        String strF1 = lk.a0.F0(strF0, str);
        if (strF1.length() > 0) {
            return strF1;
        }
        return null;
    }

    public sp1(List list) {
        this.f82730a = list;
    }
}
