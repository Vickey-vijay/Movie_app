package nj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: _Maps.kt */
/* JADX INFO: loaded from: classes10.dex */
public class n0 extends m0 {
    public static final <K, V> kk.i<Map.Entry<K, V>> C(Map<? extends K, ? extends V> map) {
        ck.p.j(map, "<this>");
        return b0.S(map.entrySet());
    }

    public static final <K, V> List<Pair<K, V>> D(Map<? extends K, ? extends V> map) {
        ck.p.j(map, "<this>");
        if (map.size() == 0) {
            return s.k();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return s.k();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return r.e(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
