package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ImmutableMultimap<K, V> extends h<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    public final transient int size;

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        @Weak
        public final ImmutableMultimap<K, V> multimap;

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public r2<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }

        public EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        public Keys() {
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.b2
        public int count(Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.map.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.b2
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public b2.a<K> getEntry(int i10) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.map.entrySet().asList().get(i10);
            return Multisets.f(entry.getKey(), entry.getValue().size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    public static final class KeysSerializedForm implements Serializable {
        public final ImmutableMultimap<?, ?> multimap;

        public Object readResolve() {
            return this.multimap.keys();
        }

        public KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.multimap = immutableMultimap;
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Weak
        public final transient ImmutableMultimap<K, V> f20376c;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f20376c.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i10) {
            r2<? extends ImmutableCollection<V>> it = this.f20376c.map.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().copyIntoArray(objArr, i10);
            }
            return i10;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public r2<V> iterator() {
            return this.f20376c.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f20376c.size();
        }

        public Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f20376c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public class a extends r2<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f20377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public K f20378c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<V> f20379d = Iterators.g();

        public a() {
            this.f20377b = ImmutableMultimap.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f20379d.hasNext()) {
                Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f20377b.next();
                this.f20378c = next.getKey();
                this.f20379d = next.getValue().iterator();
            }
            K k10 = this.f20378c;
            Objects.requireNonNull(k10);
            return Maps.e(k10, this.f20379d.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20379d.hasNext() || this.f20377b.hasNext();
        }
    }

    public class b extends r2<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<? extends ImmutableCollection<V>> f20381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<V> f20382c = Iterators.g();

        public b() {
            this.f20381b = ImmutableMultimap.this.map.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20382c.hasNext() || this.f20381b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f20382c.hasNext()) {
                this.f20382c = this.f20381b.next().iterator();
            }
            return this.f20382c.next();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<K, Collection<V>> f20384a = h2.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Comparator<? super K> f20385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Comparator<? super V> f20386c;

        public ImmutableMultimap<K, V> a() {
            Collection collectionEntrySet = this.f20384a.entrySet();
            Comparator<? super K> comparator = this.f20385b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableListMultimap.fromMapEntries(collectionEntrySet, this.f20386c);
        }

        public c<K, V> b(c<K, V> cVar) {
            for (Map.Entry<K, Collection<V>> entry : cVar.f20384a.entrySet()) {
                g(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Collection<V> c() {
            return new ArrayList();
        }

        public c<K, V> g(K k10, Iterable<? extends V> iterable) {
            if (k10 == null) {
                throw new NullPointerException("null key in entry: null=" + y1.p(iterable));
            }
            Collection<V> collection = this.f20384a.get(k10);
            if (collection != null) {
                for (V v10 : iterable) {
                    j1.a(k10, v10);
                    collection.add(v10);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> collectionC = c();
            while (it.hasNext()) {
                V next = it.next();
                j1.a(k10, next);
                collectionC.add(next);
            }
            this.f20384a.put(k10, collectionC);
            return this;
        }

        public c<K, V> d(K k10, V v10) {
            j1.a(k10, v10);
            Collection<V> collection = this.f20384a.get(k10);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f20384a;
                Collection<V> collectionC = c();
                map.put(k10, collectionC);
                collection = collectionC;
            }
            collection.add(v10);
            return this;
        }

        public c<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
            return d(entry.getKey(), entry.getValue());
        }

        public c<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            return this;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j2.b<ImmutableMultimap> f20387a = j2.a(ImmutableMultimap.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j2.b<ImmutableMultimap> f20388b = j2.a(ImmutableMultimap.class, "size");
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(a2<? extends K, ? extends V> a2Var) {
        if (a2Var instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) a2Var;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf((a2) a2Var);
    }

    public static <K, V> ImmutableMultimap<K, V> of() {
        return ImmutableListMultimap.of();
    }

    @Override // com.google.common.collect.a2
    public abstract ImmutableCollection<V> get(K k10);

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.c
    @Deprecated
    public final boolean putAll(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> c<K, V> builder() {
        return new c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    @Override // com.google.common.collect.a2
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a2
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.c
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.c
    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.c
    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.c
    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.c
    public ImmutableMultiset<K> createKeys() {
        return new Keys();
    }

    @Override // com.google.common.collect.c
    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    @Override // com.google.common.collect.c
    public r2<Map.Entry<K, V>> entryIterator() {
        return new a();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.c
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    @Deprecated
    public final boolean putAll(a2<? extends K, ? extends V> a2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a2
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.c
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a2
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.c
    public r2<V> valueIterator() {
        return new b();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i10) {
        this.map = immutableMap;
        this.size = i10;
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.a2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf((Iterable) iterable);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13);
    }

    public static <K, V> ImmutableMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return ImmutableListMultimap.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13, (Object) k14, (Object) v14);
    }
}
