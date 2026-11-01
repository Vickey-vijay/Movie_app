package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<Comparable> f20716b = new a();
    public Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.b entrySet;
    public final e<K, V> header;
    private LinkedTreeMap<K, V>.c keySet;
    public int modCount;
    public e<K, V> root;
    public int size;

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarFindByEntry;
            if (!(obj instanceof Map.Entry) || (eVarFindByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(eVarFindByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends LinkedTreeMap<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f20730g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f20721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f20722c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20723d;

        public d() {
            this.f20721b = LinkedTreeMap.this.header.f20728e;
            this.f20723d = LinkedTreeMap.this.modCount;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f20721b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.modCount != this.f20723d) {
                throw new ConcurrentModificationException();
            }
            this.f20721b = eVar.f20728e;
            this.f20722c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20721b != LinkedTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f20722c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.removeInternal(eVar, true);
            this.f20722c = null;
            this.f20723d = LinkedTreeMap.this.modCount;
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f20725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f20726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f20727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e<K, V> f20728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e<K, V> f20729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K f20730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public V f20731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20732i;

        public e() {
            this.f20730g = null;
            this.f20729f = this;
            this.f20728e = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f20726c; eVar2 != null; eVar2 = eVar2.f20726c) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f20727d; eVar2 != null; eVar2 = eVar2.f20727d) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f20730g;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f20731h;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f20730g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f20731h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f20730g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f20731h;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f20731h;
            this.f20731h = v10;
            return v11;
        }

        public String toString() {
            return this.f20730g + "=" + this.f20731h;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f20725b = eVar;
            this.f20730g = k10;
            this.f20732i = 1;
            this.f20728e = eVar2;
            this.f20729f = eVar3;
            eVar3.f20728e = this;
            eVar2.f20729f = this;
        }
    }

    public LinkedTreeMap() {
        this(f20716b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.f20729f = eVar;
        eVar.f20728e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.header = new e<>();
        this.comparator = comparator == null ? f20716b : comparator;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final void b(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f20726c;
            e<K, V> eVar3 = eVar.f20727d;
            int i10 = eVar2 != null ? eVar2.f20732i : 0;
            int i11 = eVar3 != null ? eVar3.f20732i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f20726c;
                e<K, V> eVar5 = eVar3.f20727d;
                int i13 = (eVar4 != null ? eVar4.f20732i : 0) - (eVar5 != null ? eVar5.f20732i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(eVar);
                } else {
                    f(eVar3);
                    e(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f20726c;
                e<K, V> eVar7 = eVar2.f20727d;
                int i14 = (eVar6 != null ? eVar6.f20732i : 0) - (eVar7 != null ? eVar7.f20732i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(eVar);
                } else {
                    e(eVar2);
                    f(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f20732i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f20732i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f20725b;
        }
    }

    public final void d(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f20725b;
        eVar.f20725b = null;
        if (eVar2 != null) {
            eVar2.f20725b = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f20726c == eVar) {
            eVar3.f20726c = eVar2;
        } else {
            eVar3.f20727d = eVar2;
        }
    }

    public final void e(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f20726c;
        e<K, V> eVar3 = eVar.f20727d;
        e<K, V> eVar4 = eVar3.f20726c;
        e<K, V> eVar5 = eVar3.f20727d;
        eVar.f20727d = eVar4;
        if (eVar4 != null) {
            eVar4.f20725b = eVar;
        }
        d(eVar, eVar3);
        eVar3.f20726c = eVar;
        eVar.f20725b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f20732i : 0, eVar4 != null ? eVar4.f20732i : 0) + 1;
        eVar.f20732i = iMax;
        eVar3.f20732i = Math.max(iMax, eVar5 != null ? eVar5.f20732i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f20726c;
        e<K, V> eVar3 = eVar.f20727d;
        e<K, V> eVar4 = eVar2.f20726c;
        e<K, V> eVar5 = eVar2.f20727d;
        eVar.f20726c = eVar5;
        if (eVar5 != null) {
            eVar5.f20725b = eVar;
        }
        d(eVar, eVar2);
        eVar2.f20727d = eVar;
        eVar.f20725b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f20732i : 0, eVar5 != null ? eVar5.f20732i : 0) + 1;
        eVar.f20732i = iMax;
        eVar2.f20732i = Math.max(iMax, eVar4 != null ? eVar4.f20732i : 0) + 1;
    }

    public e<K, V> find(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.comparator;
        e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            Comparable comparable = comparator == f20716b ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f20730g) : comparator.compare(k10, eVar2.f20730g);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f20726c : eVar2.f20727d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f20729f);
            if (iCompareTo < 0) {
                eVar2.f20726c = eVar;
            } else {
                eVar2.f20727d = eVar;
            }
            b(eVar2, true);
        } else {
            if (comparator == f20716b && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f20729f);
            this.root = eVar;
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarFind = find(k10, true);
        V v11 = eVarFind.f20731h;
        eVarFind.f20731h = v10;
        return v11;
    }

    public void removeInternal(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f20729f;
            eVar2.f20728e = eVar.f20728e;
            eVar.f20728e.f20729f = eVar2;
        }
        e<K, V> eVar3 = eVar.f20726c;
        e<K, V> eVar4 = eVar.f20727d;
        e<K, V> eVar5 = eVar.f20725b;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                d(eVar, eVar3);
                eVar.f20726c = null;
            } else if (eVar4 != null) {
                d(eVar, eVar4);
                eVar.f20727d = null;
            } else {
                d(eVar, null);
            }
            b(eVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        e<K, V> eVarB = eVar3.f20732i > eVar4.f20732i ? eVar3.b() : eVar4.a();
        removeInternal(eVarB, false);
        e<K, V> eVar6 = eVar.f20726c;
        if (eVar6 != null) {
            i10 = eVar6.f20732i;
            eVarB.f20726c = eVar6;
            eVar6.f20725b = eVarB;
            eVar.f20726c = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f20727d;
        if (eVar7 != null) {
            i11 = eVar7.f20732i;
            eVarB.f20727d = eVar7;
            eVar7.f20725b = eVarB;
            eVar.f20727d = null;
        }
        eVarB.f20732i = Math.max(i10, i11) + 1;
        d(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    public e<K, V> findByEntry(Map.Entry<?, ?> entry) {
        boolean z10;
        e<K, V> eVarFindByObject = findByObject(entry.getKey());
        if (eVarFindByObject != null && a(eVarFindByObject.f20731h, entry.getValue())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        return eVarFindByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarFindByObject = findByObject(obj);
        if (eVarFindByObject != null) {
            return eVarFindByObject.f20731h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarRemoveInternalByKey = removeInternalByKey(obj);
        if (eVarRemoveInternalByKey != null) {
            return eVarRemoveInternalByKey.f20731h;
        }
        return null;
    }

    public e<K, V> removeInternalByKey(Object obj) {
        e<K, V> eVarFindByObject = findByObject(obj);
        if (eVarFindByObject != null) {
            removeInternal(eVarFindByObject, true);
        }
        return eVarFindByObject;
    }
}
