package com.google.common.collect;

import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements k2<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient ImmutableSet<V> f20412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @RetainedWith
    public transient ImmutableSetMultimap<V, K> f20413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @RetainedWith
    public transient ImmutableSet<Map.Entry<K, V>> f20414i;

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Weak
        public final transient ImmutableSetMultimap<K, V> f20415d;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f20415d.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public r2<Map.Entry<K, V>> iterator() {
            return this.f20415d.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f20415d.size();
        }

        public EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f20415d = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        public ImmutableSetMultimap<K, V> h() {
            Collection collectionEntrySet = this.f20384a.entrySet();
            Comparator<? super K> comparator = this.f20385b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableSetMultimap.fromMapEntries(collectionEntrySet, this.f20386c);
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        public Collection<V> c() {
            return h2.f();
        }

        public a<K, V> i(ImmutableMultimap.c<K, V> cVar) {
            super.b(cVar);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<K, V> d(K k10, V v10) {
            super.d(k10, v10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
            super.e(entry);
            return this;
        }

        public a<K, V> l(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.f(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(K k10, Iterable<? extends V> iterable) {
            super.g(k10, iterable);
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j2.b<ImmutableSetMultimap> f20416a = j2.a(ImmutableSetMultimap.class, "emptySet");
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(a2<? extends K, ? extends V> a2Var) {
        return a(a2Var, null);
    }

    public static <K, V> ImmutableSetMultimap<K, V> of() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    public static <V> ImmutableSet<V> b(Comparator<? super V> comparator) {
        return comparator == null ? ImmutableSet.of() : ImmutableSortedSet.emptySet(comparator);
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().l(iterable).h();
    }

    public static <V> ImmutableSet<V> e(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? ImmutableSet.copyOf((Collection) collection) : ImmutableSortedSet.copyOf((Comparator) comparator, (Collection) collection);
    }

    public static <V> ImmutableSet.a<V> f(Comparator<? super V> comparator) {
        return comparator == null ? new ImmutableSet.a<>() : new ImmutableSortedSet.a(comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        return aVarBuilder.h();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.f20413h;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapD = d();
        this.f20413h = immutableSetMultimapD;
        return immutableSetMultimapD;
    }

    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.f20412g;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i10, Comparator<? super V> comparator) {
        super(immutableMap, i10);
        this.f20412g = b(comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> a(a2<? extends K, ? extends V> a2Var, Comparator<? super V> comparator) {
        m5.l.m(a2Var);
        if (a2Var.isEmpty() && comparator == null) {
            return of();
        }
        if (a2Var instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) a2Var;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(a2Var.asMap().entrySet(), comparator);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return i1.r(function, function2);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetE = e(comparator, entry.getValue());
            if (!immutableSetE.isEmpty()) {
                bVar.g(key, immutableSetE);
                size += immutableSetE.size();
            }
        }
        return new ImmutableSetMultimap<>(bVar.c(), size, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i10 = objectInputStream.readInt();
        if (i10 >= 0) {
            ImmutableMap.b bVarBuilder = ImmutableMap.builder();
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object object = objectInputStream.readObject();
                Objects.requireNonNull(object);
                int i13 = objectInputStream.readInt();
                if (i13 > 0) {
                    ImmutableSet.a aVarF = f(comparator);
                    for (int i14 = 0; i14 < i13; i14++) {
                        Object object2 = objectInputStream.readObject();
                        Objects.requireNonNull(object2);
                        aVarF.a(object2);
                    }
                    ImmutableSet immutableSetN = aVarF.n();
                    if (immutableSetN.size() == i13) {
                        bVarBuilder.g(object, immutableSetN);
                        i11 += i13;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
                    }
                } else {
                    throw new InvalidObjectException("Invalid value count " + i13);
                }
            }
            try {
                ImmutableMultimap.d.f20387a.b(this, bVarBuilder.c());
                ImmutableMultimap.d.f20388b.a(this, i11);
                b.f20416a.b(this, b(comparator));
                return;
            } catch (IllegalArgumentException e10) {
                throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
            }
        }
        throw new InvalidObjectException("Invalid key count " + i10);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return i1.Q(function, function2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        j2.e(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableSetMultimap<V, K> d() {
        a aVarBuilder = builder();
        r2 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.d(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapH = aVarBuilder.h();
        immutableSetMultimapH.f20413h = this;
        return immutableSetMultimapH;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.c, com.google.common.collect.a2
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f20414i;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.f20414i = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.a2
    public ImmutableSet<V> get(K k10) {
        return (ImmutableSet) m5.g.a((ImmutableSet) this.map.get(k10), this.f20412g);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.a2
    @Deprecated
    public final ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.c
    @Deprecated
    public final ImmutableSet<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        aVarBuilder.d(k12, v12);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        aVarBuilder.d(k12, v12);
        aVarBuilder.d(k13, v13);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        aVarBuilder.d(k12, v12);
        aVarBuilder.d(k13, v13);
        aVarBuilder.d(k14, v14);
        return aVarBuilder.h();
    }
}
