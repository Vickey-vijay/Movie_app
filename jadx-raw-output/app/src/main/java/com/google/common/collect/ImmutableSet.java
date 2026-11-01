package com.google.common.collect;

import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RetainedWith
    public transient ImmutableList<E> f20409c;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }
    }

    public static class a<E> extends ImmutableCollection.a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object[] f20410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20411e;

        public a() {
            super(4);
        }

        public a(int i10) {
            super(i10);
            this.f20410d = new Object[ImmutableSet.chooseTableSize(i10)];
        }

        public a<E> j(E... eArr) {
            if (this.f20410d != null) {
                for (E e10 : eArr) {
                    a(e10);
                }
            } else {
                super.b(eArr);
            }
            return this;
        }

        public final void m(E e10) {
            Objects.requireNonNull(this.f20410d);
            int length = this.f20410d.length - 1;
            int iHashCode = e10.hashCode();
            int iB = v1.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f20410d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f20411e += iHashCode;
                    super.f(e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        public ImmutableSet<E> n() {
            ImmutableSet<E> immutableSetC;
            int i10 = this.f20353b;
            if (i10 == 0) {
                return ImmutableSet.of();
            }
            if (i10 == 1) {
                Object obj = this.f20352a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.f20410d == null || ImmutableSet.chooseTableSize(i10) != this.f20410d.length) {
                immutableSetC = ImmutableSet.c(this.f20353b, this.f20352a);
                this.f20353b = immutableSetC.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.e(this.f20353b, this.f20352a.length) ? Arrays.copyOf(this.f20352a, this.f20353b) : this.f20352a;
                int i11 = this.f20411e;
                Object[] objArr = this.f20410d;
                immutableSetC = new RegularImmutableSet<>(objArrCopyOf, i11, objArr, objArr.length - 1, this.f20353b);
            }
            this.f20354c = true;
            this.f20410d = null;
            return immutableSetC;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a<E> o(a<E> aVar) {
            if (this.f20410d != null) {
                for (int i10 = 0; i10 < aVar.f20353b; i10++) {
                    Object obj = aVar.f20352a[i10];
                    Objects.requireNonNull(obj);
                    a(obj);
                }
            } else {
                g(aVar.f20352a, aVar.f20353b);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            m5.l.m(e10);
            if (this.f20410d != null && ImmutableSet.chooseTableSize(this.f20353b) <= this.f20410d.length) {
                m(e10);
                return this;
            }
            this.f20410d = null;
            super.f(e10);
            return this;
        }

        public a<E> k(Iterable<? extends E> iterable) {
            m5.l.m(iterable);
            if (this.f20410d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } else {
                super.c(iterable);
            }
            return this;
        }

        public a<E> l(Iterator<? extends E> it) {
            m5.l.m(it);
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    public static int chooseTableSize(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            m5.l.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return c(array.length, array);
    }

    public static boolean e(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.EMPTY;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract r2<E> iterator();

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static <E> a<E> builderWithExpectedSize(int i10) {
        j1.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <E> ImmutableSet<E> c(int i10, Object... objArr) {
        if (i10 == 0) {
            return of();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iChooseTableSize = chooseTableSize(i10);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i11 = iChooseTableSize - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = d2.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = v1.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (chooseTableSize(i13) < iChooseTableSize / 2) {
            return c(i13, objArr);
        }
        if (e(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new RegularImmutableSet(objArr, i12, objArr2, i11, i13);
    }

    public static <E> ImmutableSet<E> of(E e10) {
        return new SingletonImmutableSet(e10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f20409c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListCreateAsList = createAsList();
        this.f20409c = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.a(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableSet<E> of(E e10, E e11) {
        return c(2, e10, e11);
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return i1.P();
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.d(this);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12) {
        return c(3, e10, e11, e12);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13) {
        return c(4, e10, e11, e12, e13);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13, E e14) {
        return c(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        m5.l.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return c(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new a().a(next).l(it).n();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return c(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
