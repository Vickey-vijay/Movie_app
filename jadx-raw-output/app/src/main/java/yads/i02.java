package yads;

import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o61 f78433a;

    public /* synthetic */ i02() {
        this(new o61());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static List a(w02 w02Var) {
        ?? E;
        if (w02Var instanceof v22) {
            ArrayList arrayListI = ((v22) w02Var).i();
            E = new ArrayList(nj.t.v(arrayListI, 10));
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                E.add(((w02) it.next()).a());
            }
        } else {
            E = nj.r.e(w02Var != null ? w02Var.a() : null);
        }
        return nj.b0.c0(E);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    public static List b(w02 w02Var) {
        k00 k00Var;
        k00 k00Var2 = null;
        if (!(w02Var instanceof v22)) {
            if (w02Var != null && (w02Var.getCreativeId() != null || w02Var.getCampaignId() != null)) {
                k00Var2 = new k00(w02Var.getCreativeId(), w02Var.getCampaignId());
            }
            return nj.s.o(k00Var2);
        }
        ArrayList<w02> arrayListI = ((v22) w02Var).i();
        ArrayList arrayList = new ArrayList();
        for (w02 w02Var2 : arrayListI) {
            if ((w02Var2 != null ? w02Var2.getCreativeId() : null) != null) {
                k00Var = new k00(w02Var2.getCreativeId(), w02Var2.getCampaignId());
            } else if ((w02Var2 != null ? w02Var2.getCampaignId() : null) != null) {
                k00Var = new k00(w02Var2.getCreativeId(), w02Var2.getCampaignId());
            } else {
                k00Var = null;
            }
            if (k00Var != null) {
                arrayList.add(k00Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.util.List] */
    public final String c(w02 w02Var) {
        ?? O;
        if (w02Var instanceof v22) {
            ArrayList arrayListI = ((v22) w02Var).i();
            O = new ArrayList();
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                String info = ((w02) it.next()).getInfo();
                if (info != null) {
                    O.add(info);
                }
            }
        } else {
            O = nj.s.o(w02Var != null ? w02Var.getInfo() : null);
        }
        ?? r10 = O;
        this.f78433a.getClass();
        if (r10.isEmpty()) {
            return null;
        }
        return nj.b0.p0(r10, StringUtils.COMMA, C3426d4.j.f28586d, C3426d4.j.f28588e, 0, null, null, 56, null);
    }

    public i02(o61 o61Var) {
        this.f78433a = o61Var;
    }
}
