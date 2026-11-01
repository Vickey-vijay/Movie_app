package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.c<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Map<K, Collection<V>> f20267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f20268h;

    public class c extends Maps.j<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f20269d;

        public class a extends Maps.d<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.d
            public Map<K, Collection<V>> c() {
                return c.this;
            }

            @Override // com.google.common.collect.Maps.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return k1.c(c.this.f20269d.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.Maps.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.c(entry.getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f20272b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Collection<V> f20273c;

            public b() {
                this.f20272b = c.this.f20269d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f20272b.next();
                this.f20273c = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f20272b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                m5.l.s(this.f20273c != null, "no calls to next() since the last call to remove()");
                this.f20272b.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.f20273c.size());
                this.f20273c.clear();
                this.f20273c = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.f20269d = map;
        }

        @Override // com.google.common.collect.Maps.j
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f20269d == AbstractMapBasedMultimap.this.f20267g) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.m(this.f20269d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Maps.n(this.f20269d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f20269d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionCreateCollection = AbstractMapBasedMultimap.this.createCollection();
            collectionCreateCollection.addAll(collectionRemove);
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionCreateCollection;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f20269d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f20269d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f20269d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f20269d.toString();
        }

        public Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.e(key, AbstractMapBasedMultimap.this.wrapCollection(key, entry.getValue()));
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f20275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public K f20276c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Collection<V> f20277d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator<V> f20278e = Iterators.i();

        public abstract T a(K k10, V v10);

        public d() {
            this.f20275b = AbstractMapBasedMultimap.this.f20267g.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20275b.hasNext() || this.f20278e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f20278e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f20275b.next();
                this.f20276c = next.getKey();
                Collection<V> value = next.getValue();
                this.f20277d = value;
                this.f20278e = value.iterator();
            }
            return a(c2.a(this.f20276c), this.f20278e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f20278e.remove();
            Collection<V> collection = this.f20277d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f20275b.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    public class e extends Maps.f<K, Collection<V>> {

        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f20281b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f20282c;

            public a(Iterator it) {
                this.f20282c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f20282c.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f20282c.next();
                this.f20281b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                m5.l.s(this.f20281b != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f20281b.getValue();
                this.f20282c.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, value.size());
                value.clear();
                this.f20281b = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || e().keySet().equals(obj);
        }

        @Override // com.google.common.collect.Maps.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return e().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return e().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(e().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = e().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            } else {
                size = 0;
            }
            if (size <= 0) {
                return false;
            }
            return true;
        }
    }

    public final class f extends AbstractMapBasedMultimap<K, V>.i implements NavigableMap<K, Collection<V>> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(j().descendingMap());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(j().headMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return new g(j());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, com.google.common.collect.AbstractMapBasedMultimap.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return (NavigableSet) super.h();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(j().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(j().tailMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = j().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return j().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = j().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = j().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return j().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = j().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return j().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = j().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = j().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return j().lowerKey(k10);
        }

        public Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionCreateCollection = AbstractMapBasedMultimap.this.createCollection();
            collectionCreateCollection.addAll(next.getValue());
            it.remove();
            return Maps.e(next.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(collectionCreateCollection));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return h();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }
    }

    public final class g extends AbstractMapBasedMultimap<K, V>.j implements NavigableSet<K> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(e().descendingMap());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(e().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(e().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(e().tailMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return e().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return e().floorKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> e() {
            return (NavigableMap) super.e();
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return e().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return e().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.r(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.r(descendingIterator());
        }
    }

    public class i extends AbstractMapBasedMultimap<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SortedSet<K> f20286f;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> g() {
            return new j(j());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> h() {
            SortedSet<K> sortedSet = this.f20286f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetG = g();
            this.f20286f = sortedSetG;
            return sortedSetG;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(j().headMap(k10));
        }

        public SortedMap<K, Collection<V>> j() {
            return (SortedMap) this.f20269d;
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(j().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(j().tailMap(k10));
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return j().firstKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return j().lastKey();
        }
    }

    public class j extends AbstractMapBasedMultimap<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> headSet(K k10) {
            return new j(e().headMap(k10));
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(e().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(e().tailMap(k10));
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return e().comparator();
        }

        public SortedMap<K, Collection<V>> e() {
            return (SortedMap) super.e();
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

    public class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f20289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection<V> f20290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractMapBasedMultimap<K, V>.k f20291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Collection<V> f20292e;

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<V> f20294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Collection<V> f20295c;

            public a() {
                Collection<V> collection = k.this.f20290c;
                this.f20295c = collection;
                this.f20294b = AbstractMapBasedMultimap.b(collection);
            }

            public void b() {
                k.this.h();
                if (k.this.f20290c != this.f20295c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f20294b.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                k.this.i();
            }

            public Iterator<V> a() {
                b();
                return this.f20294b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f20294b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f20294b.next();
            }

            public a(Iterator<V> it) {
                this.f20295c = k.this.f20290c;
                this.f20294b = it;
            }
        }

        public k(K k10, Collection<V> collection, AbstractMapBasedMultimap<K, V>.k kVar) {
            this.f20289b = k10;
            this.f20290c = collection;
            this.f20291d = kVar;
            this.f20292e = kVar == null ? null : kVar.f();
        }

        public void c() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f20291d;
            if (kVar != null) {
                kVar.c();
            } else {
                AbstractMapBasedMultimap.this.f20267g.put(this.f20289b, this.f20290c);
            }
        }

        public AbstractMapBasedMultimap<K, V>.k e() {
            return this.f20291d;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            h();
            return this.f20290c.equals(obj);
        }

        public Collection<V> f() {
            return this.f20290c;
        }

        K g() {
            return this.f20289b;
        }

        public void h() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.k kVar = this.f20291d;
            if (kVar != null) {
                kVar.h();
                if (this.f20291d.f() != this.f20292e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f20290c.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.f20267g.get(this.f20289b)) == null) {
                    return;
                }
                this.f20290c = collection;
            }
        }

        public void i() {
            AbstractMapBasedMultimap<K, V>.k kVar = this.f20291d;
            if (kVar != null) {
                kVar.i();
            } else if (this.f20290c.isEmpty()) {
                AbstractMapBasedMultimap.this.f20267g.remove(this.f20289b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            h();
            boolean zIsEmpty = this.f20290c.isEmpty();
            boolean zAdd = this.f20290c.add(v10);
            if (zAdd) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    c();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f20290c.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f20290c.size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f20290c.clear();
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
            i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            h();
            return this.f20290c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            h();
            return this.f20290c.containsAll(collection);
        }

        @Override // java.util.Collection
        public int hashCode() {
            h();
            return this.f20290c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            h();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            h();
            boolean zRemove = this.f20290c.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                i();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f20290c.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f20290c.size() - size);
                i();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            m5.l.m(collection);
            int size = size();
            boolean zRetainAll = this.f20290c.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f20290c.size() - size);
                i();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            h();
            return this.f20290c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            h();
            return this.f20290c.toString();
        }
    }

    public class l extends AbstractMapBasedMultimap<K, V>.k implements List<V> {

        public class a extends AbstractMapBasedMultimap<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(l.this.j().listIterator(i10));
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v10);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    l.this.c();
                }
            }

            public final ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                c().set(v10);
            }
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            h();
            return new a();
        }

        public l(K k10, List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            h();
            boolean zIsEmpty = f().isEmpty();
            j().add(i10, v10);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = j().addAll(i10, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, f().size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            h();
            return j().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            h();
            return j().indexOf(obj);
        }

        public List<V> j() {
            return (List) f();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            h();
            return j().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            h();
            return new a(i10);
        }

        @Override // java.util.List
        public V remove(int i10) {
            h();
            V vRemove = j().remove(i10);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            i();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            h();
            return j().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            k kVarE;
            h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objG = g();
            List<V> listSubList = j().subList(i10, i11);
            if (e() == null) {
                kVarE = this;
            } else {
                kVarE = e();
            }
            return abstractMapBasedMultimap.wrapList(objG, listSubList, kVarE);
        }
    }

    public class m extends AbstractMapBasedMultimap<K, V>.o implements NavigableSet<V> {
        public m(K k10, NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(j().descendingIterator());
        }

        public final NavigableSet<V> m(NavigableSet<V> navigableSet) {
            return new m(this.f20289b, navigableSet, e() == null ? this : e());
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v10) {
            return j().ceiling(v10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m(j().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v10) {
            return j().floor(v10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v10, boolean z10) {
            return m(j().headSet(v10, z10));
        }

        @Override // java.util.NavigableSet
        public V higher(V v10) {
            return j().higher(v10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.o
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> j() {
            return (NavigableSet) super.j();
        }

        @Override // java.util.NavigableSet
        public V lower(V v10) {
            return j().lower(v10);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.r(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.r(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v10, boolean z10, V v11, boolean z11) {
            return m(j().subSet(v10, z10, v11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v10, boolean z10) {
            return m(j().tailSet(v10, z10));
        }
    }

    public class n extends AbstractMapBasedMultimap<K, V>.k implements Set<V> {
        public n(K k10, Set<V> set) {
            super(k10, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zI = Sets.i((Set) this.f20290c, collection);
            if (zI) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f20290c.size() - size);
                i();
            }
            return zI;
        }
    }

    public class o extends AbstractMapBasedMultimap<K, V>.k implements SortedSet<V> {
        public o(K k10, SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            h();
            return j().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v10) {
            k kVarE;
            h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objG = g();
            SortedSet<V> sortedSetHeadSet = j().headSet(v10);
            if (e() == null) {
                kVarE = this;
            } else {
                kVarE = e();
            }
            return new o(objG, sortedSetHeadSet, kVarE);
        }

        public SortedSet<V> j() {
            return (SortedSet) f();
        }

        @Override // java.util.SortedSet
        public V last() {
            h();
            return j().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v10, V v11) {
            k kVarE;
            h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objG = g();
            SortedSet<V> sortedSetSubSet = j().subSet(v10, v11);
            if (e() == null) {
                kVarE = this;
            } else {
                kVarE = e();
            }
            return new o(objG, sortedSetSubSet, kVarE);
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v10) {
            k kVarE;
            h();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object objG = g();
            SortedSet<V> sortedSetTailSet = j().tailSet(v10);
            if (e() == null) {
                kVarE = this;
            } else {
                kVarE = e();
            }
            return new o(objG, sortedSetTailSet, kVarE);
        }
    }

    public abstract Collection<V> createCollection();

    public class a extends AbstractMapBasedMultimap<K, V>.d<V> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        public V a(K k10, V v10) {
            return v10;
        }

        public a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }
    }

    public class b extends AbstractMapBasedMultimap<K, V>.d<Map.Entry<K, V>> {
        public b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10, V v10) {
            return Maps.e(k10, v10);
        }
    }

    public class h extends AbstractMapBasedMultimap<K, V>.l implements RandomAccess {
        public h(AbstractMapBasedMultimap abstractMapBasedMultimap, K k10, List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    public static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f20268h;
        abstractMapBasedMultimap.f20268h = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f20268h;
        abstractMapBasedMultimap.f20268h = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f20268h + i10;
        abstractMapBasedMultimap.f20268h = i11;
        return i11;
    }

    public static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f20268h - i10;
        abstractMapBasedMultimap.f20268h = i11;
        return i11;
    }

    public static <E> Iterator<E> b(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final Collection<V> a(K k10) {
        Collection<V> collection = this.f20267g.get(k10);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateCollection = createCollection(k10);
        this.f20267g.put(k10, collectionCreateCollection);
        return collectionCreateCollection;
    }

    public Map<K, Collection<V>> backingMap() {
        return this.f20267g;
    }

    public final void c(Object obj) {
        Collection collection = (Collection) Maps.o(this.f20267g, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f20268h -= size;
        }
    }

    @Override // com.google.common.collect.a2
    public void clear() {
        Iterator<Collection<V>> it = this.f20267g.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f20267g.clear();
        this.f20268h = 0;
    }

    @Override // com.google.common.collect.a2
    public boolean containsKey(Object obj) {
        return this.f20267g.containsKey(obj);
    }

    @Override // com.google.common.collect.c
    public Map<K, Collection<V>> createAsMap() {
        return new c(this.f20267g);
    }

    @Override // com.google.common.collect.c
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof k2 ? new com.google.common.collect.c.b(this) : new com.google.common.collect.c.a();
    }

    @Override // com.google.common.collect.c
    public Set<K> createKeySet() {
        return new e(this.f20267g);
    }

    @Override // com.google.common.collect.c
    public b2<K> createKeys() {
        return new Multimaps.b(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.f20267g;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f20267g);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f20267g) : new c(this.f20267g);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.f20267g;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f20267g);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f20267g) : new e(this.f20267g);
    }

    @Override // com.google.common.collect.c
    public Collection<V> createValues() {
        return new com.google.common.collect.c.C0201c();
    }

    @Override // com.google.common.collect.c
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new b(this);
    }

    @Override // com.google.common.collect.a2
    public Collection<V> get(K k10) {
        Collection<V> collectionCreateCollection = this.f20267g.get(k10);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(k10);
        }
        return wrapCollection(k10, collectionCreateCollection);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f20267g.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f20268h++;
            return true;
        }
        Collection<V> collectionCreateCollection = createCollection(k10);
        if (!collectionCreateCollection.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f20268h++;
        this.f20267g.put(k10, collectionCreateCollection);
        return true;
    }

    @Override // com.google.common.collect.a2
    public Collection<V> removeAll(Object obj) {
        Collection<V> collectionRemove = this.f20267g.remove(obj);
        if (collectionRemove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionRemove);
        this.f20268h -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.f20267g = map;
        this.f20268h = 0;
        for (Collection<V> collection : map.values()) {
            m5.l.d(!collection.isEmpty());
            this.f20268h += collection.size();
        }
    }

    @Override // com.google.common.collect.a2
    public int size() {
        return this.f20268h;
    }

    @Override // com.google.common.collect.c
    public Iterator<V> valueIterator() {
        return new a(this);
    }

    public Collection<V> wrapCollection(K k10, Collection<V> collection) {
        return new k(k10, collection, null);
    }

    public final List<V> wrapList(K k10, List<V> list, AbstractMapBasedMultimap<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k10, list, kVar) : new l(k10, list, kVar);
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        m5.l.d(map.isEmpty());
        this.f20267g = map;
    }

    public Collection<V> createCollection(K k10) {
        return createCollection();
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.c
    public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k10);
        }
        Collection<V> collectionA = a(k10);
        Collection<V> collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionA);
        this.f20268h -= collectionA.size();
        collectionA.clear();
        while (it.hasNext()) {
            if (collectionA.add(it.next())) {
                this.f20268h++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public Collection<V> values() {
        return super.values();
    }
}
