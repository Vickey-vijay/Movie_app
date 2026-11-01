package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f20309h = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f20310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f20311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f20312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Set<K> f20313e;
    public transient int[] entries;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f20314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Collection<V> f20315g;
    public transient Object[] keys;
    public transient Object[] values;

    public class a extends CompactHashMap<K, V>.e<K> {
        public a() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        public K b(int i10) {
            return (K) CompactHashMap.this.f(i10);
        }
    }

    public class b extends CompactHashMap<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i10) {
            return new g(i10);
        }
    }

    public class c extends CompactHashMap<K, V>.e<V> {
        public c() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        public V b(int i10) {
            return (V) CompactHashMap.this.s(i10);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = CompactHashMap.this.e(entry.getKey());
            return iE != -1 && m5.i.a(CompactHashMap.this.s(iE), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.needsAllocArrays()) {
                return false;
            }
            int iD = CompactHashMap.this.d();
            int iF = l1.f(entry.getKey(), entry.getValue(), iD, CompactHashMap.this.k(), CompactHashMap.this.h(), CompactHashMap.this.j(), CompactHashMap.this.l());
            if (iF == -1) {
                return false;
            }
            CompactHashMap.this.moveLastEntry(iF, iD);
            CompactHashMap.access$1210(CompactHashMap.this);
            CompactHashMap.this.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20322d;

        public e() {
            this.f20320b = CompactHashMap.this.f20311c;
            this.f20321c = CompactHashMap.this.firstEntryIndex();
            this.f20322d = -1;
        }

        public abstract T b(int i10);

        public final void a() {
            if (CompactHashMap.this.f20311c != this.f20320b) {
                throw new ConcurrentModificationException();
            }
        }

        public void c() {
            this.f20320b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20321c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i10 = this.f20321c;
                this.f20322d = i10;
                T tB = b(i10);
                this.f20321c = CompactHashMap.this.getSuccessor(this.f20321c);
                return tB;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            if (this.f20322d >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j1.e(z10);
            c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.f(this.f20322d));
            this.f20321c = CompactHashMap.this.adjustAfterRemove(this.f20321c, this.f20322d);
            this.f20322d = -1;
        }

        public /* synthetic */ e(CompactHashMap compactHashMap, a aVar) {
            this();
        }
    }

    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.keySet().remove(obj);
            }
            return CompactHashMap.this.g(obj) != CompactHashMap.f20309h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class g extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f20325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20326c;

        public g(int i10) {
            this.f20325b = (K) CompactHashMap.this.f(i10);
            this.f20326c = i10;
        }

        public final void d() {
            int i10 = this.f20326c;
            if (i10 == -1 || i10 >= CompactHashMap.this.size() || !m5.i.a(this.f20325b, CompactHashMap.this.f(this.f20326c))) {
                this.f20326c = CompactHashMap.this.e(this.f20325b);
            }
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public K getKey() {
            return this.f20325b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) c2.a(mapDelegateOrNull.get(this.f20325b));
            }
            d();
            int i10 = this.f20326c;
            return i10 == -1 ? (V) c2.b() : (V) CompactHashMap.this.s(i10);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) c2.a(mapDelegateOrNull.put(this.f20325b, v10));
            }
            d();
            int i10 = this.f20326c;
            if (i10 == -1) {
                CompactHashMap.this.put(this.f20325b, v10);
                return (V) c2.b();
            }
            V v11 = (V) CompactHashMap.this.s(i10);
            CompactHashMap.this.r(this.f20326c, v10);
            return v11;
        }
    }

    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public void accessEntry(int i10) {
    }

    public int adjustAfterRemove(int i10, int i11) {
        return i10 - 1;
    }

    public void init(int i10) {
        m5.l.e(i10 >= 0, "Expected size must be >= 0");
        this.f20311c = Ints.f(i10, 1, 1073741823);
    }

    public void insertEntry(int i10, K k10, V v10, int i11, int i12) {
        o(i10, l1.d(i11, 0, i12));
        q(i10, k10);
        r(i10, v10);
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i10 = compactHashMap.f20312d;
        compactHashMap.f20312d = i10 - 1;
        return i10;
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i10) {
        return new CompactHashMap<>(i10);
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new d();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    public Set<K> createKeySet() {
        return new f();
    }

    public Collection<V> createValues() {
        return new h();
    }

    public final int d() {
        return (1 << (this.f20311c & 31)) - 1;
    }

    public Map<K, V> delegateOrNull() {
        Object obj = this.f20310b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20314f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.f20314f = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public int getSuccessor(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f20312d) {
            return i11;
        }
        return -1;
    }

    public final int[] h() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void incrementModCount() {
        this.f20311c += 32;
    }

    public final Object[] j() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object k() {
        Object obj = this.f20310b;
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f20313e;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.f20313e = setCreateKeySet;
        return setCreateKeySet;
    }

    public final Object[] l() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public boolean needsAllocArrays() {
        return this.f20310b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f20315g;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.f20315g = collectionCreateValues;
        return collectionCreateValues;
    }

    public CompactHashMap(int i10) {
        init(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 >= 0) {
            init(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + i10);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final int a(int i10) {
        return h()[i10];
    }

    public int allocArrays() {
        m5.l.s(needsAllocArrays(), "Arrays already allocated");
        int i10 = this.f20311c;
        int iJ = l1.j(i10);
        this.f20310b = l1.a(iJ);
        p(iJ - 1);
        this.entries = new int[i10];
        this.keys = new Object[i10];
        this.values = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.f20311c = Ints.f(size(), 3, 1073741823);
            mapDelegateOrNull.clear();
            this.f20310b = null;
            this.f20312d = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f20312d, (Object) null);
        Arrays.fill(l(), 0, this.f20312d, (Object) null);
        l1.g(k());
        Arrays.fill(h(), 0, this.f20312d, 0);
        this.f20312d = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f20312d; i10++) {
            if (m5.i.a(obj, s(i10))) {
                return true;
            }
        }
        return false;
    }

    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(d() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(f(iFirstEntryIndex), s(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.f20310b = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public final int e(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iC = v1.c(obj);
        int iD = d();
        int iH = l1.h(k(), iC & iD);
        if (iH == 0) {
            return -1;
        }
        int iB = l1.b(iC, iD);
        do {
            int i10 = iH - 1;
            int iA = a(i10);
            if (l1.b(iA, iD) == iB && m5.i.a(obj, f(i10))) {
                return i10;
            }
            iH = l1.c(iA, iD);
        } while (iH != 0);
        return -1;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.entrySet().iterator();
        }
        return new b();
    }

    public final K f(int i10) {
        return (K) j()[i10];
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final Object g(Object obj) {
        if (needsAllocArrays()) {
            return f20309h;
        }
        int iD = d();
        int iF = l1.f(obj, null, iD, k(), h(), j(), null);
        if (iF == -1) {
            return f20309h;
        }
        V vS = s(iF);
        moveLastEntry(iF, iD);
        this.f20312d--;
        incrementModCount();
        return vS;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        accessEntry(iE);
        return s(iE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.keySet().iterator();
        }
        return new a();
    }

    public final void m(int i10) {
        int iMin;
        int length = h().length;
        if (i10 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(iMin);
        }
    }

    public void moveLastEntry(int i10, int i11) {
        Object objK = k();
        int[] iArrH = h();
        Object[] objArrJ = j();
        Object[] objArrL = l();
        int size = size() - 1;
        if (i10 < size) {
            Object obj = objArrJ[size];
            objArrJ[i10] = obj;
            objArrL[i10] = objArrL[size];
            objArrJ[size] = null;
            objArrL[size] = null;
            iArrH[i10] = iArrH[size];
            iArrH[size] = 0;
            int iC = v1.c(obj) & i11;
            int iH = l1.h(objK, iC);
            int i12 = size + 1;
            if (iH == i12) {
                l1.i(objK, iC, i10 + 1);
                return;
            }
            while (true) {
                int i13 = iH - 1;
                int i14 = iArrH[i13];
                int iC2 = l1.c(i14, i11);
                if (iC2 == i12) {
                    iArrH[i13] = l1.d(i14, i10 + 1, i11);
                    return;
                }
                iH = iC2;
            }
        } else {
            objArrJ[i10] = null;
            objArrL[i10] = null;
            iArrH[i10] = 0;
        }
    }

    public final int n(int i10, int i11, int i12, int i13) {
        Object objA = l1.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l1.i(objA, i12 & i14, i13 + 1);
        }
        Object objK = k();
        int[] iArrH = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = l1.h(objK, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrH[i16];
                int iB = l1.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = l1.h(objA, i18);
                l1.i(objA, i18, iH);
                iArrH[i16] = l1.d(iB, iH2, i14);
                iH = l1.c(i17, i10);
            }
        }
        this.f20310b = objA;
        p(i14);
        return i14;
    }

    public final void o(int i10, int i11) {
        h()[i10] = i11;
    }

    public final void p(int i10) {
        this.f20311c = l1.d(this.f20311c, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int iN;
        int i10;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k10, v10);
        }
        int[] iArrH = h();
        Object[] objArrJ = j();
        Object[] objArrL = l();
        int i11 = this.f20312d;
        int i12 = i11 + 1;
        int iC = v1.c(k10);
        int iD = d();
        int i13 = iC & iD;
        int iH = l1.h(k(), i13);
        if (iH == 0) {
            if (i12 > iD) {
                iN = n(iD, l1.e(iD), iC, i11);
                i10 = iN;
            } else {
                l1.i(k(), i13, i12);
                i10 = iD;
            }
        } else {
            int iB = l1.b(iC, iD);
            int i14 = 0;
            while (true) {
                int i15 = iH - 1;
                int i16 = iArrH[i15];
                if (l1.b(i16, iD) == iB && m5.i.a(k10, objArrJ[i15])) {
                    V v11 = (V) objArrL[i15];
                    objArrL[i15] = v10;
                    accessEntry(i15);
                    return v11;
                }
                int iC2 = l1.c(i16, iD);
                i14++;
                if (iC2 == 0) {
                    if (i14 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k10, v10);
                    }
                    if (i12 > iD) {
                        iN = n(iD, l1.e(iD), iC, i11);
                        i10 = iN;
                    } else {
                        iArrH[i15] = l1.d(i16, i12, iD);
                        i10 = iD;
                    }
                } else {
                    iH = iC2;
                }
            }
        }
        m(i12);
        insertEntry(i11, k10, v10, iC, i10);
        this.f20312d = i12;
        incrementModCount();
        return null;
    }

    public final void q(int i10, K k10) {
        j()[i10] = k10;
    }

    public final void r(int i10, V v10) {
        l()[i10] = v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v10 = (V) g(obj);
        if (v10 == f20309h) {
            return null;
        }
        return v10;
    }

    public void resizeEntries(int i10) {
        this.entries = Arrays.copyOf(h(), i10);
        this.keys = Arrays.copyOf(j(), i10);
        this.values = Arrays.copyOf(l(), i10);
    }

    public final V s(int i10) {
        return (V) l()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.size();
        }
        return this.f20312d;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.f20310b = mapCreateHashFloodingResistantDelegate;
            return;
        }
        int i10 = this.f20312d;
        if (i10 < h().length) {
            resizeEntries(i10);
        }
        int iJ = l1.j(i10);
        int iD = d();
        if (iJ < iD) {
            n(iD, iJ, 0, 0);
        }
    }

    public Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.values().iterator();
        }
        return new c();
    }
}
