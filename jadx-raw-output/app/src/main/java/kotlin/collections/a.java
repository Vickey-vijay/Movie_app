package kotlin.collections;

import ck.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kk.i;
import kotlin.Pair;
import nj.k0;
import nj.l0;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a extends l0 {
    public static final <K, V, M extends Map<? super K, ? super V>> M A(Pair<? extends K, ? extends V>[] pairArr, M m10) {
        p.j(pairArr, "<this>");
        p.j(m10, "destination");
        u(m10, pairArr);
        return m10;
    }

    public static final <K, V> Map<K, V> B(Map<? extends K, ? extends V> map) {
        p.j(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final <K, V> Map<K, V> j() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        p.h(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final <K, V> V k(Map<K, ? extends V> map, K k10) {
        p.j(map, "<this>");
        return (V) k0.a(map, k10);
    }

    public static final <K, V> HashMap<K, V> l(Pair<? extends K, ? extends V>... pairArr) {
        p.j(pairArr, "pairs");
        HashMap<K, V> map = new HashMap<>(l0.f(pairArr.length));
        u(map, pairArr);
        return map;
    }

    public static final <K, V> Map<K, V> m(Pair<? extends K, ? extends V>... pairArr) {
        p.j(pairArr, "pairs");
        return pairArr.length > 0 ? A(pairArr, new LinkedHashMap(l0.f(pairArr.length))) : j();
    }

    public static final <K, V> Map<K, V> n(Map<? extends K, ? extends V> map, K k10) {
        p.j(map, "<this>");
        Map mapB = B(map);
        mapB.remove(k10);
        return p(mapB);
    }

    public static final <K, V> Map<K, V> o(Pair<? extends K, ? extends V>... pairArr) {
        p.j(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0.f(pairArr.length));
        u(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        p.j(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : l0.i(map);
        }
        return j();
    }

    public static final <K, V> Map<K, V> q(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        p.j(map, "<this>");
        p.j(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> r(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        p.j(map, "<this>");
        p.j(pair, "pair");
        if (map.isEmpty()) {
            return l0.g(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final <K, V> void s(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        p.j(map, "<this>");
        p.j(iterable, "pairs");
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void t(Map<? super K, ? super V> map, i<? extends Pair<? extends K, ? extends V>> iVar) {
        p.j(map, "<this>");
        p.j(iVar, "pairs");
        for (Pair<? extends K, ? extends V> pair : iVar) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void u(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        p.j(map, "<this>");
        p.j(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> Map<K, V> v(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        p.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p(w(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j();
        }
        if (size != 1) {
            return w(iterable, new LinkedHashMap(l0.f(collection.size())));
        }
        return l0.g((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M w(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m10) {
        p.j(iterable, "<this>");
        p.j(m10, "destination");
        s(m10, iterable);
        return m10;
    }

    public static final <K, V> Map<K, V> x(Map<? extends K, ? extends V> map) {
        p.j(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? B(map) : l0.i(map);
        }
        return j();
    }

    public static final <K, V> Map<K, V> y(i<? extends Pair<? extends K, ? extends V>> iVar) {
        p.j(iVar, "<this>");
        return p(z(iVar, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M z(i<? extends Pair<? extends K, ? extends V>> iVar, M m10) {
        p.j(iVar, "<this>");
        p.j(m10, "destination");
        t(m10, iVar);
        return m10;
    }
}
