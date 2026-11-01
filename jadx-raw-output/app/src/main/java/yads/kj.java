package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class kj {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f81050c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            List listE = obj instanceof u41 ? nj.r.e(obj) : obj instanceof on1 ? ((on1) obj).f81112c : null;
            if (listE != null) {
                arrayList2.add(listE);
            }
        }
        return nj.b0.T0(nj.t.x(arrayList2));
    }
}
