package com.google.common.collect;

import com.google.j2objc.annotations.RetainedWith;
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

/* JADX INFO: loaded from: classes4.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements z1<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @RetainedWith
    public transient ImmutableListMultimap<V, K> f20358g;

    public static <K, V> ImmutableListMultimap<K, V> copyOf(a2<? extends K, ? extends V> a2Var) {
        if (a2Var.isEmpty()) {
            return of();
        }
        if (a2Var instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) a2Var;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(a2Var.asMap().entrySet(), null);
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        public ImmutableListMultimap<K, V> h() {
            return (ImmutableListMultimap) super.a();
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

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        return aVarBuilder.h();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.f20358g;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapD = d();
        this.f20358g = immutableListMultimapD;
        return immutableListMultimapD;
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i10) {
        super(immutableMap, i10);
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return i1.q(function, function2);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        ImmutableList immutableListSortedCopyOf;
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                immutableListSortedCopyOf = ImmutableList.copyOf((Collection) value);
            } else {
                immutableListSortedCopyOf = ImmutableList.sortedCopyOf(comparator, value);
            }
            if (!immutableListSortedCopyOf.isEmpty()) {
                bVar.g(key, immutableListSortedCopyOf);
                size += immutableListSortedCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(bVar.c(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 >= 0) {
            ImmutableMap.b bVarBuilder = ImmutableMap.builder();
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object object = objectInputStream.readObject();
                Objects.requireNonNull(object);
                int i13 = objectInputStream.readInt();
                if (i13 > 0) {
                    ImmutableList.a aVarBuilder = ImmutableList.builder();
                    for (int i14 = 0; i14 < i13; i14++) {
                        Object object2 = objectInputStream.readObject();
                        Objects.requireNonNull(object2);
                        aVarBuilder.a(object2);
                    }
                    bVarBuilder.g(object, aVarBuilder.m());
                    i11 += i13;
                } else {
                    throw new InvalidObjectException("Invalid value count " + i13);
                }
            }
            try {
                ImmutableMultimap.d.f20387a.b(this, bVarBuilder.c());
                ImmutableMultimap.d.f20388b.a(this, i11);
                return;
            } catch (IllegalArgumentException e10) {
                throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
            }
        }
        throw new InvalidObjectException("Invalid key count " + i10);
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return i1.K(function, function2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        j2.e(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableListMultimap<V, K> d() {
        a aVarBuilder = builder();
        r2 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.d(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapH = aVarBuilder.h();
        immutableListMultimapH.f20358g = this;
        return immutableListMultimapH;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.a2
    public ImmutableList<V> get(K k10) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k10);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.a2
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.c
    @Deprecated
    public final ImmutableList<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().l(iterable).h();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        aVarBuilder.d(k12, v12);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        aVarBuilder.d(k12, v12);
        aVarBuilder.d(k13, v13);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarBuilder = builder();
        aVarBuilder.d(k10, v10);
        aVarBuilder.d(k11, v11);
        aVarBuilder.d(k12, v12);
        aVarBuilder.d(k13, v13);
        aVarBuilder.d(k14, v14);
        return aVarBuilder.h();
    }
}
