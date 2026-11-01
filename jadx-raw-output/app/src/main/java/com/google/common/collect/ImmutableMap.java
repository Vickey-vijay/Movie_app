package com.google.common.collect;

import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RetainedWith
    public transient ImmutableSet<Map.Entry<K, V>> f20359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RetainedWith
    public transient ImmutableSet<K> f20360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RetainedWith
    public transient ImmutableCollection<V> f20361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient ImmutableSetMultimap<K, V> f20362e;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        public abstract r2<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                public r2<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        public class a extends r2<Map.Entry<K, ImmutableSet<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f20363b;

            /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a$a, reason: collision with other inner class name */
            public class C0198a extends com.google.common.collect.b<K, ImmutableSet<V>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f20364b;

                public C0198a(a aVar, Map.Entry entry) {
                    this.f20364b = entry;
                }

                @Override // com.google.common.collect.b, java.util.Map.Entry
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.of(this.f20364b.getValue());
                }

                @Override // com.google.common.collect.b, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f20364b.getKey();
                }
            }

            public a(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
                this.f20363b = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new C0198a(this, (Map.Entry) this.f20363b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f20363b.hasNext();
            }
        }

        public MapViewOfValuesAsSingletonSets() {
        }

        public /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public r2<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            return new a(this, ImmutableMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        /* JADX WARN: Multi-variable type inference failed */
        public final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            b<K, V> bVarMakeBuilder = makeBuilder(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                bVarMakeBuilder.g(objArr[i10], objArr2[i10]);
            }
            return bVarMakeBuilder.c();
        }

        public b<K, V> makeBuilder(int i10) {
            return new b<>(i10);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            b<K, V> bVarMakeBuilder = makeBuilder(immutableSet.size());
            r2 it = immutableSet.iterator();
            r2 it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                bVarMakeBuilder.g(it.next(), it2.next());
            }
            return bVarMakeBuilder.c();
        }

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            r2<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }
    }

    public class a extends r2<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r2 f20365b;

        public a(ImmutableMap immutableMap, r2 r2Var) {
            this.f20365b = r2Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20365b.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f20365b.next()).getKey();
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Comparator<? super V> f20366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f20367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f20370e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f20371a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f20372b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f20373c;

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f20371a + "=" + this.f20372b + " and " + this.f20371a + "=" + this.f20373c);
            }

            public a(Object obj, Object obj2, Object obj3) {
                this.f20371a = obj;
                this.f20372b = obj2;
                this.f20373c = obj3;
            }
        }

        public b() {
            this(4);
        }

        public ImmutableMap<K, V> c() {
            return b(true);
        }

        public b(int i10) {
            this.f20367b = new Object[i10 * 2];
            this.f20368c = 0;
            this.f20369d = false;
        }

        public static <V> void j(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, Ordering.from(comparator).onResultOf(Maps.q()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public final ImmutableMap<K, V> b(boolean z10) {
            Object[] objArrF;
            a aVar;
            a aVar2;
            if (z10 && (aVar2 = this.f20370e) != null) {
                throw aVar2.a();
            }
            int length = this.f20368c;
            if (this.f20366a == null) {
                objArrF = this.f20367b;
            } else {
                if (this.f20369d) {
                    this.f20367b = Arrays.copyOf(this.f20367b, length * 2);
                }
                objArrF = this.f20367b;
                if (!z10) {
                    objArrF = f(objArrF, this.f20368c);
                    if (objArrF.length < this.f20367b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                j(objArrF, length, this.f20366a);
            }
            this.f20369d = true;
            RegularImmutableMap regularImmutableMapCreate = RegularImmutableMap.create(length, objArrF, this);
            if (!z10 || (aVar = this.f20370e) == null) {
                return regularImmutableMapCreate;
            }
            throw aVar.a();
        }

        public final void e(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f20367b;
            if (i11 > objArr.length) {
                this.f20367b = Arrays.copyOf(objArr, ImmutableCollection.b.e(objArr.length, i11));
                this.f20369d = false;
            }
        }

        public final Object[] f(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        public b<K, V> g(K k10, V v10) {
            e(this.f20368c + 1);
            j1.a(k10, v10);
            Object[] objArr = this.f20367b;
            int i10 = this.f20368c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f20368c = i10 + 1;
            return this;
        }

        public b<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                e(this.f20368c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            return this;
        }

        public ImmutableMap<K, V> a() {
            return c();
        }

        public b<K, V> d(b<K, V> bVar) {
            m5.l.m(bVar);
            e(this.f20368c + bVar.f20368c);
            System.arraycopy(bVar.f20367b, 0, this.f20367b, this.f20368c * 2, bVar.f20368c * 2);
            this.f20368c += bVar.f20368c;
            return this;
        }

        public b<K, V> h(Map.Entry<? extends K, ? extends V> entry) {
            return g(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return i1.L(function, function2);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public abstract V get(Object obj);

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public static <K, V> b<K, V> builder() {
        return new b<>();
    }

    public static <K, V> b<K, V> builderWithExpectedSize(int i10) {
        j1.b(i10, "expectedSize");
        return new b<>(i10);
    }

    public static void checkNoConflict(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw conflictException(str, obj, obj2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10) {
        j1.a(k10, v10);
        return RegularImmutableMap.create(1, new Object[]{k10, v10});
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return i1.M(function, function2, binaryOperator);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f20359b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetCreateEntrySet = createEntrySet();
        this.f20359b = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f20360c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.f20360c = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f20361d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.f20361d = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k10, V v10) {
        j1.a(k10, v10);
        return new AbstractMap.SimpleImmutableEntry(k10, v10);
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.f20362e;
        if (immutableSetMultimap == null) {
            ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(this, null), size(), null);
            this.f20362e = immutableSetMultimap2;
            return immutableSetMultimap2;
        }
        return immutableSetMultimap;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.d(this, obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        if (v11 != null) {
            return v11;
        }
        return v10;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.d(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public r2<K> keyIterator() {
        return new a(this, entrySet().iterator());
    }

    public String toString() {
        return Maps.p(this);
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        return RegularImmutableMap.create(2, new Object[]{k10, v10, k11, v11});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.i(iterable);
        return bVar.a();
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        return RegularImmutableMap.create(3, new Object[]{k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        j1.a(k13, v13);
        return RegularImmutableMap.create(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        j1.a(k13, v13);
        j1.a(k14, v14);
        return RegularImmutableMap.create(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        j1.a(k13, v13);
        j1.a(k14, v14);
        j1.a(k15, v15);
        return RegularImmutableMap.create(6, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        j1.a(k13, v13);
        j1.a(k14, v14);
        j1.a(k15, v15);
        j1.a(k16, v16);
        return RegularImmutableMap.create(7, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        j1.a(k13, v13);
        j1.a(k14, v14);
        j1.a(k15, v15);
        j1.a(k16, v16);
        j1.a(k17, v17);
        return RegularImmutableMap.create(8, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        j1.a(k13, v13);
        j1.a(k14, v14);
        j1.a(k15, v15);
        j1.a(k16, v16);
        j1.a(k17, v17);
        j1.a(k18, v18);
        return RegularImmutableMap.create(9, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        j1.a(k10, v10);
        j1.a(k11, v11);
        j1.a(k12, v12);
        j1.a(k13, v13);
        j1.a(k14, v14);
        j1.a(k15, v15);
        j1.a(k16, v16);
        j1.a(k17, v17);
        j1.a(k18, v18);
        j1.a(k19, v19);
        return RegularImmutableMap.create(10, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19});
    }
}
