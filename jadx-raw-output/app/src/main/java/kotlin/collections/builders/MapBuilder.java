package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import ik.k;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, dk.e {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MapBuilder f62977b;
    private kotlin.collections.builders.a<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private kotlin.collections.builders.b<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private kotlin.collections.builders.c<V> valuesView;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, dk.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            p.j(mapBuilder, "map");
        }

        public final void k(StringBuilder sb2) {
            p.j(sb2, "sb");
            if (b() >= ((MapBuilder) e()).length) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = ((MapBuilder) e()).keysArray[d()];
            if (obj == e()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append(G5.T);
            Object[] objArr = ((MapBuilder) e()).valuesArray;
            p.g(objArr);
            Object obj2 = objArr[d()];
            if (obj2 == e()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            a();
            if (b() < ((MapBuilder) e()).length) {
                int iB = b();
                g(iB + 1);
                h(iB);
                c<K, V> cVar = new c<>(e(), d());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final int l() {
            int iHashCode;
            if (b() < ((MapBuilder) e()).length) {
                int iB = b();
                g(iB + 1);
                h(iB);
                Object obj = ((MapBuilder) e()).keysArray[d()];
                int iHashCode2 = 0;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                Object[] objArr = ((MapBuilder) e()).valuesArray;
                p.g(objArr);
                Object obj2 = objArr[d()];
                if (obj2 != null) {
                    iHashCode2 = obj2.hashCode();
                }
                int i10 = iHashCode ^ iHashCode2;
                f();
                return i10;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MapBuilder<K, V> f62978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62980d;

        public c(MapBuilder<K, V> mapBuilder, int i10) {
            p.j(mapBuilder, "map");
            this.f62978b = mapBuilder;
            this.f62979c = i10;
            this.f62980d = ((MapBuilder) mapBuilder).modCount;
        }

        public final void a() {
            if (((MapBuilder) this.f62978b).modCount != this.f62980d) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (p.e(entry.getKey(), getKey()) && p.e(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append(G5.T);
            sb2.append(getValue());
            return sb2.toString();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((MapBuilder) this.f62978b).keysArray[this.f62979c];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = ((MapBuilder) this.f62978b).valuesArray;
            p.g(objArr);
            return (V) objArr[this.f62979c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            K key = getKey();
            int iHashCode2 = 0;
            if (key != null) {
                iHashCode = key.hashCode();
            } else {
                iHashCode = 0;
            }
            V value = getValue();
            if (value != null) {
                iHashCode2 = value.hashCode();
            }
            return iHashCode ^ iHashCode2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a();
            this.f62978b.checkIsMutable$kotlin_stdlib();
            Object[] objArrD = this.f62978b.d();
            int i10 = this.f62979c;
            V v11 = (V) objArrD[i10];
            objArrD[i10] = v10;
            return v11;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static class d<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MapBuilder<K, V> f62981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f62983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f62984e;

        public d(MapBuilder<K, V> mapBuilder) {
            p.j(mapBuilder, "map");
            this.f62981b = mapBuilder;
            this.f62983d = -1;
            this.f62984e = ((MapBuilder) mapBuilder).modCount;
            f();
        }

        public final void a() {
            if (((MapBuilder) this.f62981b).modCount != this.f62984e) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f62982c;
        }

        public final int d() {
            return this.f62983d;
        }

        public final MapBuilder<K, V> e() {
            return this.f62981b;
        }

        public final void f() {
            while (this.f62982c < ((MapBuilder) this.f62981b).length) {
                int[] iArr = ((MapBuilder) this.f62981b).presenceArray;
                int i10 = this.f62982c;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f62982c = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f62982c = i10;
        }

        public final void h(int i10) {
            this.f62983d = i10;
        }

        public final boolean hasNext() {
            return this.f62982c < ((MapBuilder) this.f62981b).length;
        }

        public final void remove() {
            boolean z10;
            a();
            if (this.f62983d != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f62981b.checkIsMutable$kotlin_stdlib();
                this.f62981b.s(this.f62983d);
                this.f62983d = -1;
                this.f62984e = ((MapBuilder) this.f62981b).modCount;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, dk.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            p.j(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (b() < ((MapBuilder) e()).length) {
                int iB = b();
                g(iB + 1);
                h(iB);
                K k10 = (K) ((MapBuilder) e()).keysArray[d()];
                f();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, dk.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            p.j(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (b() < ((MapBuilder) e()).length) {
                int iB = b();
                g(iB + 1);
                h(iB);
                Object[] objArr = ((MapBuilder) e()).valuesArray;
                p.g(objArr);
                V v10 = (V) objArr[d()];
                f();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    public MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i10;
        this.length = i11;
        this.hashShift = Companion.d(l());
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int c(int i10) {
            return Integer.highestOneBit(k.d(i10, 1) * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final MapBuilder e() {
            return MapBuilder.f62977b;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f62977b = mapBuilder;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> collection) {
        p.j(collection, InneractiveMediationDefs.GENDER_MALE);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "entry");
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        p.g(vArr);
        return p.e(vArr[iJ], entry.getValue());
    }

    public final V[] d() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) oj.b.d(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    public final void e(boolean z10) {
        int i10;
        V[] vArr = this.valuesArray;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.length;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.hashArray[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        oj.b.g(this.keysArray, i12, i10);
        if (vArr != null) {
            oj.b.g(vArr, i12, this.length);
        }
        this.length = i12;
    }

    public final b<K, V> entriesIterator$kotlin_stdlib() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && f((Map) obj));
    }

    public final void g(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > getCapacity$kotlin_stdlib()) {
            int iE = nj.d.Companion.e(getCapacity$kotlin_stdlib(), i10);
            this.keysArray = (K[]) oj.b.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) oj.b.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iE);
            p.i(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iC = Companion.c(iE);
            if (iC > l()) {
                r(iC);
            }
        }
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        kotlin.collections.builders.a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a<K, V> aVar2 = new kotlin.collections.builders.a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    public Set<K> getKeys() {
        kotlin.collections.builders.b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b<K> bVar2 = new kotlin.collections.builders.b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        kotlin.collections.builders.c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    public final int k(V v10) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                p.g(vArr);
                if (p.e(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    public final e<K, V> keysIterator$kotlin_stdlib() {
        return new e<>(this);
    }

    public final int l() {
        return this.hashArray.length;
    }

    public final int m(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    public final boolean p(int i10) {
        int iM = m(this.keysArray[i10]);
        int i11 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iM] == 0) {
                iArr[iM] = i10 + 1;
                this.presenceArray[i10] = iM;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iM = iM == 0 ? l() - 1 : iM - 1;
        }
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        p.j(map, TypedValues.TransitionType.S_FROM);
        checkIsMutable$kotlin_stdlib();
        n(map.entrySet());
    }

    public final void q() {
        this.modCount++;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        p.g(vArr);
        if (!p.e(vArr[iJ], entry.getValue())) {
            return false;
        }
        s(iJ);
        return true;
    }

    public final void s(int i10) {
        oj.b.f(this.keysArray, i10);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            oj.b.f(vArr, i10);
        }
        t(this.presenceArray[i10]);
        this.presenceArray[i10] = -1;
        this.size = size() - 1;
        q();
    }

    public final void t(int i10) {
        int iG = k.g(this.maxProbeDistance * 2, l() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? l() - 1 : i10 - 1;
            i11++;
            if (i11 > this.maxProbeDistance) {
                this.hashArray[i12] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((m(this.keysArray[i14]) - i10) & (l() - 1)) >= i11) {
                    this.hashArray[i12] = i13;
                    this.presenceArray[i14] = i12;
                }
                iG--;
            }
            i12 = i10;
            i11 = 0;
            iG--;
        } while (iG >= 0);
        this.hashArray[i12] = -1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append(h.f44171d);
        b<K, V> bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i10 = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarEntriesIterator$kotlin_stdlib.k(sb2);
            i10++;
        }
        sb2.append(h.f44172e);
        String string = sb2.toString();
        p.i(string, "toString(...)");
        return string;
    }

    public final f<K, V> valuesIterator$kotlin_stdlib() {
        return new f<>(this);
    }

    public final int addKey$kotlin_stdlib(K k10) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iM = m(k10);
            int iG = k.g(this.maxProbeDistance * 2, l() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.hashArray[iM];
                if (i11 <= 0) {
                    if (this.length >= getCapacity$kotlin_stdlib()) {
                        h(1);
                        break;
                    }
                    int i12 = this.length;
                    int i13 = i12 + 1;
                    this.length = i13;
                    this.keysArray[i12] = k10;
                    this.presenceArray[i12] = iM;
                    this.hashArray[iM] = i13;
                    this.size = size() + 1;
                    q();
                    if (i10 > this.maxProbeDistance) {
                        this.maxProbeDistance = i10;
                    }
                    return i12;
                }
                if (p.e(this.keysArray[i11 - 1], k10)) {
                    return -i11;
                }
                i10++;
                if (i10 > iG) {
                    r(l() * 2);
                    break;
                }
                int i14 = iM - 1;
                if (iM == 0) {
                    iM = l() - 1;
                } else {
                    iM = i14;
                }
            }
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f62977b;
        p.h(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i10 = this.length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.hashArray[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        oj.b.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            oj.b.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (j(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (k(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final boolean f(Map<?, ?> map) {
        if (size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        p.g(vArr);
        return vArr[iJ];
    }

    public final void h(int i10) {
        if (u(i10)) {
            e(true);
        } else {
            g(this.length + i10);
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iL = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            iL += bVarEntriesIterator$kotlin_stdlib.l();
        }
        return iL;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(K k10) {
        int iM = m(k10);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iM];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (p.e(this.keysArray[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = iM - 1;
            if (iM == 0) {
                iM = l() - 1;
            } else {
                iM = i13;
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final boolean n(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        h(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (o(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean o(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrD = d();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrD[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i10 = (-iAddKey$kotlin_stdlib) - 1;
        if (!p.e(entry.getValue(), vArrD[i10])) {
            vArrD[i10] = entry.getValue();
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(k10);
        V[] vArrD = d();
        if (iAddKey$kotlin_stdlib < 0) {
            int i10 = (-iAddKey$kotlin_stdlib) - 1;
            V v11 = vArrD[i10];
            vArrD[i10] = v10;
            return v11;
        }
        vArrD[iAddKey$kotlin_stdlib] = v10;
        return null;
    }

    public final void r(int i10) {
        q();
        int i11 = 0;
        if (this.length > size()) {
            e(false);
        }
        this.hashArray = new int[i10];
        this.hashShift = Companion.d(i10);
        while (i11 < this.length) {
            int i12 = i11 + 1;
            if (p(i11)) {
                i11 = i12;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        p.g(vArr);
        V v10 = vArr[iJ];
        s(iJ);
        return v10;
    }

    public final boolean removeKey$kotlin_stdlib(K k10) {
        checkIsMutable$kotlin_stdlib();
        int iJ = j(k10);
        if (iJ < 0) {
            return false;
        }
        s(iJ);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V v10) {
        checkIsMutable$kotlin_stdlib();
        int iK = k(v10);
        if (iK < 0) {
            return false;
        }
        s(iK);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final boolean u(int i10) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i11 = this.length;
        int i12 = capacity$kotlin_stdlib - i11;
        int size = i11 - size();
        if (i12 < i10 && i12 + size >= i10 && size >= getCapacity$kotlin_stdlib() / 4) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(oj.b.d(i10), null, new int[i10], new int[Companion.c(i10)], 2, 0);
    }
}
