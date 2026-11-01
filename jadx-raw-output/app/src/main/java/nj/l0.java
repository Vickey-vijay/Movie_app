package nj;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes11.dex */
public class l0 extends k0 {
    public static final int f(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> c(Map<K, V> map) {
        ck.p.j(map, "builder");
        return ((MapBuilder) map).build();
    }

    public static final <K, V> Map<K, V> d() {
        return new MapBuilder();
    }

    public static final <K, V> Map<K, V> e(int i10) {
        return new MapBuilder(i10);
    }

    public static final <K, V> Map<K, V> g(Pair<? extends K, ? extends V> pair) {
        ck.p.j(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        ck.p.i(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> h(Pair<? extends K, ? extends V>... pairArr) {
        ck.p.j(pairArr, "pairs");
        TreeMap treeMap = new TreeMap();
        kotlin.collections.a.u(treeMap, pairArr);
        return treeMap;
    }

    public static final <K, V> Map<K, V> i(Map<? extends K, ? extends V> map) {
        ck.p.j(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        ck.p.i(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
