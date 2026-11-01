package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g20 implements vj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b20 f77602a;

    public g20(b20 b20Var) {
        this.f77602a = b20Var;
    }

    @Override // yads.vj3
    public final Map a() {
        e20 e20Var = this.f77602a.f75703e;
        List listK = e20Var != null ? e20Var.f76890b : null;
        if (listK == null) {
            listK = nj.s.k();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listK) {
            String str = ((x73) obj).f84470a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(nj.l0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(nj.t.v(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((x73) it.next()).f84471b);
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }
}
