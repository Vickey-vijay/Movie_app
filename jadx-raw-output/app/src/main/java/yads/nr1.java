package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class nr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final or1 f80732a;

    public final ArrayList a(List list) {
        hr1 hr1Var;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g80 g80Var = (g80) it.next();
            List<String> list2 = g80Var.f77689e;
            ArrayList arrayList2 = new ArrayList(nj.t.v(list2, 10));
            for (String str : list2) {
                List listM0 = lk.a0.M0(str, new char[]{'.'}, false, 0, 6, null);
                String str2 = (String) nj.b0.i0(listM0, nj.s.m(listM0) - 1);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new oq1(str2, str));
            }
            String str3 = g80Var.f77686b;
            String str4 = g80Var.f77685a;
            if (str4 != null) {
                hr1.f78308c.getClass();
                hr1Var = (hr1) hr1.f78309d.get(str4);
                if (hr1Var == null) {
                    hr1Var = hr1.f78329x;
                }
            } else {
                hr1Var = hr1.f78329x;
            }
            arrayList.add(new pq1(str3, hr1Var, arrayList2));
        }
        return this.f80732a.a(arrayList);
    }

    public nr1(or1 or1Var) {
        this.f80732a = or1Var;
    }
}
