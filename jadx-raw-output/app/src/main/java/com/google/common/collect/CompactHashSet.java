package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public static final double HASH_FLOODING_FPP = 0.001d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f20329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f20330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f20331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f20332e;
    public transient Object[] elements;

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20335d = -1;

        public a() {
            this.f20333b = CompactHashSet.this.f20331d;
            this.f20334c = CompactHashSet.this.firstEntryIndex();
        }

        public final void a() {
            if (CompactHashSet.this.f20331d != this.f20333b) {
                throw new ConcurrentModificationException();
            }
        }

        public void b() {
            this.f20333b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20334c >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            if (hasNext()) {
                int i10 = this.f20334c;
                this.f20335d = i10;
                E e10 = (E) CompactHashSet.this.e(i10);
                this.f20334c = CompactHashSet.this.getSuccessor(this.f20334c);
                return e10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            if (this.f20335d >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j1.e(z10);
            b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.e(this.f20335d));
            this.f20334c = CompactHashSet.this.adjustAfterRemove(this.f20334c, this.f20335d);
            this.f20335d = -1;
        }
    }

    public CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    public int adjustAfterRemove(int i10, int i11) {
        return i10 - 1;
    }

    public void init(int i10) {
        m5.l.e(i10 >= 0, "Expected size must be >= 0");
        this.f20331d = Ints.f(i10, 1, 1073741823);
    }

    public void insertEntry(int i10, E e10, int i11, int i12) {
        o(i10, l1.d(i11, 0, i12));
        n(i10, e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(h(), this.f20332e);
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i10) {
        return new CompactHashSet<>(i10);
    }

    public final Set<E> c(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    public Set<E> delegateOrNull() {
        Object obj = this.f20329b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final int g() {
        return (1 << (this.f20331d & 31)) - 1;
    }

    public int getSuccessor(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f20332e) {
            return i11;
        }
        return -1;
    }

    public final Object[] h() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] i() {
        int[] iArr = this.f20330c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void incrementModCount() {
        this.f20331d += 32;
    }

    public final Object j() {
        Object obj = this.f20329b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public boolean needsAllocArrays() {
        return this.f20329b == null;
    }

    public CompactHashSet(int i10) {
        init(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 >= 0) {
            init(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException("Invalid size: " + i10);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(e10);
        }
        int[] iArrI = i();
        Object[] objArrH = h();
        int i10 = this.f20332e;
        int i11 = i10 + 1;
        int iC = v1.c(e10);
        int iG = g();
        int i12 = iC & iG;
        int iH = l1.h(j(), i12);
        if (iH == 0) {
            if (i11 > iG) {
                iG = m(iG, l1.e(iG), iC, i10);
            } else {
                l1.i(j(), i12, i11);
            }
        } else {
            int iB = l1.b(iC, iG);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrI[i14];
                if (l1.b(i15, iG) == iB && m5.i.a(e10, objArrH[i14])) {
                    return false;
                }
                int iC2 = l1.c(i15, iG);
                i13++;
                if (iC2 == 0) {
                    if (i13 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e10);
                    }
                    if (i11 > iG) {
                        iG = m(iG, l1.e(iG), iC, i10);
                    } else {
                        iArrI[i14] = l1.d(i15, i11, iG);
                    }
                } else {
                    iH = iC2;
                }
            }
        }
        l(i11);
        insertEntry(i10, e10, iC, iG);
        this.f20332e = i11;
        incrementModCount();
        return true;
    }

    public int allocArrays() {
        m5.l.s(needsAllocArrays(), "Arrays already allocated");
        int i10 = this.f20331d;
        int iJ = l1.j(i10);
        this.f20329b = l1.a(iJ);
        p(iJ - 1);
        this.f20330c = new int[i10];
        this.elements = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.f20331d = Ints.f(size(), 3, 1073741823);
            setDelegateOrNull.clear();
            this.f20329b = null;
            this.f20332e = 0;
            return;
        }
        Arrays.fill(h(), 0, this.f20332e, (Object) null);
        l1.g(j());
        Arrays.fill(i(), 0, this.f20332e, 0);
        this.f20332e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(obj);
        }
        int iC = v1.c(obj);
        int iG = g();
        int iH = l1.h(j(), iC & iG);
        if (iH == 0) {
            return false;
        }
        int iB = l1.b(iC, iG);
        do {
            int i10 = iH - 1;
            int iF = f(i10);
            if (l1.b(iF, iG) == iB && m5.i.a(obj, e(i10))) {
                return true;
            }
            iH = l1.c(iF, iG);
        } while (iH != 0);
        return false;
    }

    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setC = c(g() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            setC.add(e(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.f20329b = setC;
        this.f20330c = null;
        this.elements = null;
        incrementModCount();
        return setC;
    }

    public final E e(int i10) {
        return (E) h()[i10];
    }

    public final int f(int i10) {
        return i()[i10];
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isUsingHashFloodingResistance() {
        if (delegateOrNull() != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.iterator();
        }
        return new a();
    }

    public final void l(int i10) {
        int iMin;
        int length = i().length;
        if (i10 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(iMin);
        }
    }

    public final int m(int i10, int i11, int i12, int i13) {
        Object objA = l1.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l1.i(objA, i12 & i14, i13 + 1);
        }
        Object objJ = j();
        int[] iArrI = i();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = l1.h(objJ, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrI[i16];
                int iB = l1.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = l1.h(objA, i18);
                l1.i(objA, i18, iH);
                iArrI[i16] = l1.d(iB, iH2, i14);
                iH = l1.c(i17, i10);
            }
        }
        this.f20329b = objA;
        p(i14);
        return i14;
    }

    public void moveLastEntry(int i10, int i11) {
        Object objJ = j();
        int[] iArrI = i();
        Object[] objArrH = h();
        int size = size() - 1;
        if (i10 < size) {
            Object obj = objArrH[size];
            objArrH[i10] = obj;
            objArrH[size] = null;
            iArrI[i10] = iArrI[size];
            iArrI[size] = 0;
            int iC = v1.c(obj) & i11;
            int iH = l1.h(objJ, iC);
            int i12 = size + 1;
            if (iH == i12) {
                l1.i(objJ, iC, i10 + 1);
                return;
            }
            while (true) {
                int i13 = iH - 1;
                int i14 = iArrI[i13];
                int iC2 = l1.c(i14, i11);
                if (iC2 == i12) {
                    iArrI[i13] = l1.d(i14, i10 + 1, i11);
                    return;
                }
                iH = iC2;
            }
        } else {
            objArrH[i10] = null;
            iArrI[i10] = 0;
        }
    }

    public final void n(int i10, E e10) {
        h()[i10] = e10;
    }

    public final void o(int i10, int i11) {
        i()[i10] = i11;
    }

    public final void p(int i10) {
        this.f20331d = l1.d(this.f20331d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(obj);
        }
        int iG = g();
        int iF = l1.f(obj, null, iG, j(), i(), h(), null);
        if (iF == -1) {
            return false;
        }
        moveLastEntry(iF, iG);
        this.f20332e--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i10) {
        this.f20330c = Arrays.copyOf(i(), i10);
        this.elements = Arrays.copyOf(h(), i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.size();
        }
        return this.f20332e;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            Set<E> setC = c(size());
            setC.addAll(setDelegateOrNull);
            this.f20329b = setC;
            return;
        }
        int i10 = this.f20332e;
        if (i10 < i().length) {
            resizeEntries(i10);
        }
        int iJ = l1.j(i10);
        int iG = g();
        if (iJ < iG) {
            m(iG, iJ, 0, 0);
        }
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, eArr);
        return compactHashSetCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return (T[]) setDelegateOrNull.toArray(tArr);
        }
        return (T[]) d2.h(h(), 0, this.f20332e, tArr);
    }
}
