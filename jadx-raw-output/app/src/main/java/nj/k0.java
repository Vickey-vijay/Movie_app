package nj;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes11.dex */
public class k0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        ck.p.j(map, "<this>");
        if (map instanceof i0) {
            return (V) ((i0) map).c(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map, bk.l<? super K, ? extends V> lVar) {
        ck.p.j(map, "<this>");
        ck.p.j(lVar, "defaultValue");
        return map instanceof i0 ? b(((i0) map).i(), lVar) : new j0(map, lVar);
    }
}
