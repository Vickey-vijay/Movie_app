package yads;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w41 f85209a = new w41();

    public final void a(List list, Map map) {
        List list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.f81050c;
            if (ck.p.e(oiVar.f81049b, C3426d4.i.I0) && (obj instanceof on1) && (list2 = ((on1) obj).f81112c) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    this.f85209a.getClass();
                    if (w41.a((u41) obj2, map)) {
                        arrayList.add(obj2);
                    }
                }
                list2.retainAll(arrayList);
            }
        }
    }
}
