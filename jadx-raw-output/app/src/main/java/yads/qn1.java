package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qn1 {
    public static Set a(fy1 fy1Var) {
        List list = fy1Var.f77546b;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f81050c);
        }
        return nj.b0.T0(nj.z.O(arrayList, on1.class));
    }
}
