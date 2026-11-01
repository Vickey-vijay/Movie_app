package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class v50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr1 f83768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr1 f83769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j50 f83770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kr1 f83771d;

    public final u50 a(b80 b80Var, j80 j80Var) {
        List listK;
        List listK2;
        List listK3;
        h50 h50Var;
        Object next;
        a50 y40Var;
        if (j80Var == null || (listK = j80Var.f78944g) == null) {
            listK = nj.s.k();
        }
        m50 m50Var = b80Var.f75759a;
        t80 t80Var = b80Var.f75760b;
        b40 b40Var = new b40(j80Var != null ? j80Var.f78938a : null, j80Var != null ? j80Var.f78941d : null, j80Var != null ? j80Var.f78940c : null);
        List<br1> list = b80Var.f75761c;
        ArrayList arrayListA = this.f83769b.a(listK);
        if (!arrayListA.isEmpty()) {
            list = arrayListA;
        }
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        for (br1 br1Var : list) {
            Iterator it = listK.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ck.p.e(((g80) next).f77686b, br1Var.f75934a));
            g80 g80Var = (g80) next;
            this.f83768a.getClass();
            boolean zA = cr1.a(br1Var);
            this.f83771d.getClass();
            List list2 = br1Var.f75937d;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                y40Var = x40.f84447a;
                break;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    y40Var = x40.f84447a;
                    break;
                }
                if (!((ar1) it2.next()).f75610c) {
                    List list3 = br1Var.f75937d;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                y40Var = z40.f85208a;
                                break;
                            }
                            if (!(!((ar1) it3.next()).f75610c)) {
                                dr1 dr1Var = dr1.INVALID_MEDIATION_ADAPTER_VERSION;
                                y40Var = new y40();
                                break;
                            }
                        }
                    } else {
                        y40Var = z40.f85208a;
                        break;
                    }
                }
            }
            a50 a50Var = y40Var;
            String str = br1Var.f75934a;
            String str2 = g80Var != null ? g80Var.f77687c : null;
            ar1 ar1Var = (ar1) nj.b0.h0(br1Var.f75937d);
            String str3 = ar1Var != null ? ar1Var.f75609b : null;
            String str4 = g80Var != null ? g80Var.f77690f : null;
            String str5 = br1Var.f75936c;
            List list4 = br1Var.f75937d;
            ArrayList arrayList2 = new ArrayList(nj.t.v(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((ar1) it4.next()).f75608a);
            }
            arrayList.add(new b50(str, str2, zA, str3, str4, str5, a50Var, arrayList2));
        }
        d50 d50Var = new d50(arrayList);
        t50 t50Var = b80Var.f75762d;
        u70 u70Var = b80Var.f75763e;
        if (j80Var == null || (listK2 = j80Var.f78943f) == null) {
            listK2 = nj.s.k();
        }
        List list5 = listK2;
        j50 j50Var = this.f83770c;
        List list6 = j80Var != null ? j80Var.f78942e : null;
        j50Var.getClass();
        if (list6 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list6) {
                g50 g50Var = (g50) obj;
                if (g50Var.f77633a != null || g50Var.f77634b != null) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(nj.t.v(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                g50 g50Var2 = (g50) it5.next();
                String str6 = g50Var2.f77633a;
                String str7 = g50Var2.f77634b;
                h50[] h50VarArrValues = h50.values();
                int length = h50VarArrValues.length;
                Iterator it6 = it5;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        h50Var = null;
                        break;
                    }
                    int i11 = length;
                    h50Var = h50VarArrValues[i10];
                    h50[] h50VarArr = h50VarArrValues;
                    g50 g50Var3 = g50Var2;
                    if (ck.p.e(g50Var2.f77635c, h50Var.f78069b)) {
                        break;
                    }
                    i10++;
                    h50VarArrValues = h50VarArr;
                    length = i11;
                    g50Var2 = g50Var3;
                }
                if (h50Var == null) {
                    h50Var = h50.f78067c;
                }
                arrayList4.add(new i50(str6, str7, h50Var));
                it5 = it6;
            }
            listK3 = arrayList4;
        } else {
            listK3 = nj.s.k();
        }
        return new u50(m50Var, t80Var, b40Var, d50Var, t50Var, u70Var, list5, listK3);
    }

    public v50(cr1 cr1Var, nr1 nr1Var, j50 j50Var, kr1 kr1Var) {
        this.f83768a = cr1Var;
        this.f83769b = nr1Var;
        this.f83770c = j50Var;
        this.f83771d = kr1Var;
    }
}
