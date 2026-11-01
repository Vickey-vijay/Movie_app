package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f20351b = new Object[0];
    private static final long serialVersionUID = 912559;

    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f20352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20354c;

        @Override // com.google.common.collect.ImmutableCollection.b
        public b<E> b(E... eArr) {
            g(eArr, eArr.length);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        public b<E> c(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                h(this.f20353b + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f20353b = ((ImmutableCollection) collection).copyIntoArray(this.f20352a, this.f20353b);
                    return this;
                }
            }
            super.c(iterable);
            return this;
        }

        public final void h(int i10) {
            Object[] objArr = this.f20352a;
            if (objArr.length < i10) {
                this.f20352a = Arrays.copyOf(objArr, b.e(objArr.length, i10));
                this.f20354c = false;
            } else if (this.f20354c) {
                this.f20352a = (Object[]) objArr.clone();
                this.f20354c = false;
            }
        }

        public a(int i10) {
            j1.b(i10, "initialCapacity");
            this.f20352a = new Object[i10];
            this.f20353b = 0;
        }

        public a<E> f(E e10) {
            m5.l.m(e10);
            h(this.f20353b + 1);
            Object[] objArr = this.f20352a;
            int i10 = this.f20353b;
            this.f20353b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public final void g(Object[] objArr, int i10) {
            d2.c(objArr, i10);
            h(this.f20353b + i10);
            System.arraycopy(objArr, 0, this.f20352a, this.f20353b, i10);
            this.f20353b += i10;
        }
    }

    public static abstract class b<E> {
        public abstract b<E> a(E e10);

        public b<E> b(E... eArr) {
            for (E e10 : eArr) {
                a(e10);
            }
            return this;
        }

        public static int e(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public b<E> c(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public b<E> d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public Object[] internalArray() {
        return null;
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public abstract r2<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f20351b);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        m5.l.m(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrInternalArray = internalArray();
            if (objArrInternalArray != null) {
                return (T[]) h2.a(objArrInternalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) d2.e(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    public ImmutableList<E> asList() {
        if (isEmpty()) {
            return ImmutableList.of();
        }
        return ImmutableList.asImmutableList(toArray());
    }

    public int copyIntoArray(Object[] objArr, int i10) {
        r2<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }
}
