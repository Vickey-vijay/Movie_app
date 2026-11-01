package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import com.ironsource.G5;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class Maps {

    public enum EntryFunction implements m5.e<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.collect.Maps.EntryFunction, m5.e
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.collect.Maps.EntryFunction, m5.e
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        @Override // m5.e
        public abstract /* synthetic */ Object apply(Map.Entry<?, ?> entry);

        /* synthetic */ EntryFunction(a aVar) {
            this();
        }
    }

    public static abstract class c<K, V> extends q1<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Comparator<? super K> f20486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f20487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public transient NavigableSet<K> f20488e;

        public class a extends d<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.d
            public Map<K, V> c() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return c.this.h();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> h();

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            return j().tailMap(k10, z10).descendingMap();
        }

        public abstract NavigableMap<K, V> j();

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            return j().subMap(k11, z11, k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            return j().headMap(k10, z10).descendingMap();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f20486c;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = j().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingL = l(comparator2);
            this.f20486c = orderingL;
            return orderingL;
        }

        @Override // com.google.common.collect.q1, com.google.common.collect.r1
        /* JADX INFO: renamed from: delegate */
        public final Map<K, V> g() {
            return j();
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f20487d;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setG = g();
            this.f20487d = setG;
            return setG;
        }

        public Set<Map.Entry<K, V>> g() {
            return new a();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f20488e;
            if (navigableSet != null) {
                return navigableSet;
            }
            g gVar = new g(this);
            this.f20488e = gVar;
            return gVar;
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // com.google.common.collect.q1, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new i(this);
        }

        public static <T> Ordering<T> l(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k10) {
            return j().floorEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return j().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return j().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return j();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return j().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return j().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k10) {
            return j().ceilingEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return j().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k10) {
            return j().lowerEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return j().lowerKey(k10);
        }

        @Override // com.google.common.collect.q1, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return j().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return j().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k10) {
            return j().higherEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return j().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return j().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return j().pollFirstEntry();
        }

        @Override // com.google.common.collect.r1
        public String toString() {
            return standardToString();
        }
    }

    public static abstract class d<K, V> extends Sets.d<Map.Entry<K, V>> {
        public abstract Map<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objN = Maps.n(c(), key);
            if (m5.i.a(objN, entry.getValue())) {
                return objN != null || c().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return c().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) m5.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.j(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) m5.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = Sets.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return c().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }
    }

    public static abstract class e<K, V> extends AbstractMap<K, V> {

        public class a extends d<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.d
            public Map<K, V> c() {
                return e.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return e.this.a();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.c(a());
        }
    }

    public static class f<K, V> extends Sets.d<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f20491b;

        /* JADX INFO: renamed from: c */
        public Map<K, V> e() {
            return this.f20491b;
        }

        public f(Map<K, V> map) {
            this.f20491b = (Map) m5.l.m(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.h(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                e().remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    public static class g<K, V> extends h<K, V> implements NavigableSet<K> {
        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return c().headMap(k10, z10).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return c().subMap(k10, z10, k11, z11).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return c().tailMap(k10, z10).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> e() {
            return (NavigableMap) this.f20491b;
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        public g(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return c().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return c().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return c().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return c().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return c().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.i(c().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.i(c().pollLastEntry());
        }
    }

    public static class i<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f20492b;

        public final Map<K, V> c() {
            return this.f20492b;
        }

        public i(Map<K, V> map) {
            this.f20492b = (Map) m5.l.m(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return c().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.r(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (m5.i.a(obj, entry.getValue())) {
                        c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) m5.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Sets.f();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return c().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) m5.l.m(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Sets.f();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return c().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    public static abstract class j<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f20493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Collection<V> f20494c;

        public abstract Set<Map.Entry<K, V>> a();

        public Collection<V> b() {
            return new i(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f20493b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f20493b = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f20494c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionB = b();
            this.f20494c = collectionB;
            return collectionB;
        }
    }

    public static int a(int i10) {
        if (i10 < 3) {
            j1.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class a<K, V> extends p2<Map.Entry<K, V>, K> {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.p2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public class b<K, V> extends p2<Map.Entry<K, V>, V> {
        public b(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.p2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public static class h<K, V> extends f<K, V> implements SortedSet<K> {
        public SortedMap<K, V> e() {
            throw null;
        }

        public h(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return e().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return e().firstKey();
        }

        @Override // java.util.SortedSet
        public K last() {
            return e().lastKey();
        }
    }

    public static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> e(K k10, V v10) {
        return new ImmutableEntry(k10, v10);
    }

    public static <E> ImmutableMap<E, Integer> f(Collection<E> collection) {
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        Iterator<E> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bVar.g(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return bVar.c();
    }

    public static <K> m5.e<Map.Entry<K, ?>, K> g() {
        return EntryFunction.KEY;
    }

    public static <K, V> Iterator<K> h(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }

    public static <K> K i(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K, V> HashMap<K, V> j(int i10) {
        return new HashMap<>(a(i10));
    }

    public static <K, V> IdentityHashMap<K, V> k() {
        return new IdentityHashMap<>();
    }

    public static <V> m5.e<Map.Entry<?, V>, V> q() {
        return EntryFunction.VALUE;
    }

    public static <K, V> Iterator<V> r(Iterator<Map.Entry<K, V>> it) {
        return new b(it);
    }

    public static <V> V s(Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        return Iterators.e(h(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map<?, ?> map, Object obj) {
        return Iterators.e(r(map.entrySet().iterator()), obj);
    }

    public static <K, V> void l(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public static boolean m(Map<?, ?> map, Object obj) {
        m5.l.m(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V n(Map<?, V> map, Object obj) {
        m5.l.m(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V o(Map<?, V> map, Object obj) {
        m5.l.m(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String p(Map<?, ?> map) {
        StringBuilder sbB = k1.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            z10 = false;
            sbB.append(entry.getKey());
            sbB.append(G5.T);
            sbB.append(entry.getValue());
        }
        sbB.append('}');
        return sbB.toString();
    }
}
