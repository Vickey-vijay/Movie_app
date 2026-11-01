package com.google.common.collect;

import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes10.dex */
public final class Multimaps {

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient m5.p<? extends List<V>> factory;

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public List<V> createCollection() {
            return this.factory.get();
        }

        public CustomListMultimap(Map<K, Collection<V>> map, m5.p<? extends List<V>> pVar) {
            super(map);
            this.factory = (m5.p) m5.l.m(pVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.factory = (m5.p) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            setMap((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }
    }

    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient m5.p<? extends Set<V>> factory;

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Set<V> createCollection() {
            return this.factory.get();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return Sets.k((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public Collection<V> wrapCollection(K k10, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.m(k10, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new AbstractMapBasedMultimap.o(k10, (SortedSet) collection, null) : new AbstractMapBasedMultimap.n(k10, (Set) collection);
        }

        public CustomSetMultimap(Map<K, Collection<V>> map, m5.p<? extends Set<V>> pVar) {
            super(map);
            this.factory = (m5.p) m5.l.m(pVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.factory = (m5.p) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            setMap((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }
    }

    public static abstract class a<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract a2<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    public static class b<K, V> extends d<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Weak
        public final a2<K, V> f20502d;

        public class a extends p2<Map.Entry<K, Collection<V>>, b2.a<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.Multimaps$b$a$a, reason: collision with other inner class name */
            public class C0199a extends Multisets.a<K> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f20503b;

                public C0199a(a aVar, Map.Entry entry) {
                    this.f20503b = entry;
                }

                @Override // com.google.common.collect.b2.a
                public int getCount() {
                    return ((Collection) this.f20503b.getValue()).size();
                }

                @Override // com.google.common.collect.b2.a
                public K getElement() {
                    return (K) this.f20503b.getKey();
                }
            }

            @Override // com.google.common.collect.p2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b2.a<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C0199a(this, entry);
            }

            public a(b bVar, Iterator it) {
                super(it);
            }
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f20502d.clear();
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
        public boolean contains(Object obj) {
            return this.f20502d.containsKey(obj);
        }

        @Override // com.google.common.collect.b2
        public int count(Object obj) {
            Collection collection = (Collection) Maps.n(this.f20502d.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.d
        public int distinctElements() {
            return this.f20502d.asMap().size();
        }

        @Override // com.google.common.collect.d
        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.d, com.google.common.collect.b2
        public Set<K> elementSet() {
            return this.f20502d.keySet();
        }

        @Override // com.google.common.collect.d
        public Iterator<b2.a<K>> entryIterator() {
            return new a(this, this.f20502d.asMap().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return Maps.h(this.f20502d.entries().iterator());
        }

        @Override // com.google.common.collect.d, com.google.common.collect.b2
        public int remove(Object obj, int i10) {
            j1.b(i10, "occurrences");
            if (i10 == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.n(this.f20502d.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i10 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i11 = 0; i11 < i10; i11++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
        public int size() {
            return this.f20502d.size();
        }

        public b(a2<K, V> a2Var) {
            this.f20502d = a2Var;
        }
    }

    public static boolean a(a2<?, ?> a2Var, Object obj) {
        if (obj == a2Var) {
            return true;
        }
        if (obj instanceof a2) {
            return a2Var.asMap().equals(((a2) obj).asMap());
        }
        return false;
    }

    public static <K, V> z1<K, V> b(Map<K, Collection<V>> map, m5.p<? extends List<V>> pVar) {
        return new CustomListMultimap(map, pVar);
    }

    public static <K, V> k2<K, V> c(Map<K, Collection<V>> map, m5.p<? extends Set<V>> pVar) {
        return new CustomSetMultimap(map, pVar);
    }
}
