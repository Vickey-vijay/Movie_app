package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q80 f76850a;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, boolean z10, rj.c cVar) throws Throwable {
        cz0 cz0Var;
        dz0 dz0Var;
        String str2;
        Object next;
        r40 r40Var;
        Object next2;
        Object next3;
        String str3;
        if (cVar instanceof cz0) {
            cz0Var = (cz0) cVar;
            int i10 = cz0Var.f76494f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cz0Var.f76494f = i10 - Integer.MIN_VALUE;
            } else {
                cz0Var = new cz0(this, cVar);
            }
        } else {
            cz0Var = new cz0(this, cVar);
        }
        Object objG = cz0Var.f76492d;
        Object objF = sj.a.f();
        int i11 = cz0Var.f76494f;
        String str4 = null;
        if (i11 == 0) {
            kotlin.c.b(objG);
            q80 q80Var = this.f76850a;
            cz0Var.f76490b = this;
            cz0Var.f76491c = str;
            cz0Var.f76494f = 1;
            objG = nk.h.g(q80Var.f81770d, new p80(q80Var, z10, null), cz0Var);
            if (objG == objF) {
                return objF;
            }
            dz0Var = this;
            str2 = str;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = cz0Var.f76491c;
            dz0Var = cz0Var.f76490b;
            kotlin.c.b(objG);
        }
        u50 u50Var = (u50) objG;
        Iterator it = u50Var.f83382g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ck.p.e(((e40) next).f76910c, str2));
        e40 e40Var = (e40) next;
        if (e40Var == null) {
            return null;
        }
        List list = u50Var.f83379d.f76578a;
        m40 m40Var = e40Var.f76911d;
        dz0Var.getClass();
        if (m40Var == null) {
            r40Var = new r40(nj.s.k());
        } else {
            List<h40> list2 = m40Var.f80078b;
            ArrayList arrayList = new ArrayList(nj.t.v(list2, 10));
            for (h40 h40Var : list2) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (!ck.p.e(((b50) next3).f75725a, h40Var.f78057b));
                b50 b50Var = (b50) next3;
                String str5 = (b50Var == null || (str3 = b50Var.f75726b) == null) ? "" : str3;
                List<p50> list3 = h40Var.f78058c;
                ArrayList arrayList2 = new ArrayList(nj.t.v(list3, 10));
                for (p50 p50Var : list3) {
                    arrayList2.add(new d80(p50Var.f81256a, p50Var.f81257b));
                }
                arrayList.add(new q40(str5, h40Var.f78057b, arrayList2, h40Var.f78059d, h40Var.f78060e, n40.f80550a));
            }
            List<u40> list4 = m40Var.f80077a;
            ArrayList arrayList3 = new ArrayList(nj.t.v(list4, 10));
            for (u40 u40Var : list4) {
                Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = str4;
                        break;
                    }
                    next2 = it3.next();
                } while (!ck.p.e(((b50) next2).f75725a, u40Var.f83361b));
                b50 b50Var2 = (b50) next2;
                String str6 = b50Var2 != null ? b50Var2.f75726b : str4;
                String str7 = str6 == null ? "" : str6;
                List<na0> list5 = u40Var.f83362c;
                ArrayList arrayList4 = new ArrayList(nj.t.v(list5, 10));
                for (na0 na0Var : list5) {
                    arrayList4.add(new d80(na0Var.f80612a, na0Var.f80613b));
                }
                arrayList3.add(new q40(str7, u40Var.f83361b, arrayList4, null, u40Var.f83363d, new o40(u40Var.f83364e, u40Var.f83365f)));
                str4 = null;
            }
            r40Var = new r40(nj.b0.y0(arrayList, arrayList3));
        }
        return new j40(e40Var.f76908a, e40Var.f76909b, str2, r40Var);
    }

    public dz0(q80 q80Var) {
        this.f76850a = q80Var;
    }
}
