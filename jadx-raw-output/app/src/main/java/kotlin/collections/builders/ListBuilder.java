package kotlin.collections.builders;

import ck.i;
import ck.p;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import nj.d;
import nj.f;
import nj.l;
import nj.r;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ListBuilder<E> extends f<E> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f62967b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ListBuilder f62968c;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class BuilderSubList<E> extends f<E> implements RandomAccess, Serializable {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        /* JADX INFO: compiled from: ListBuilder.kt */
        public static final class a<E> implements ListIterator<E>, dk.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BuilderSubList<E> f62969b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f62970c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f62971d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f62972e;

            public a(BuilderSubList<E> builderSubList, int i10) {
                p.j(builderSubList, "list");
                this.f62969b = builderSubList;
                this.f62970c = i10;
                this.f62971d = -1;
                this.f62972e = ((AbstractList) builderSubList).modCount;
            }

            public final void a() {
                if (((AbstractList) ((BuilderSubList) this.f62969b).root).modCount != this.f62972e) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f62970c < ((BuilderSubList) this.f62969b).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f62970c > 0;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f62970c;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f62970c - 1;
            }

            @Override // java.util.ListIterator
            public void add(E e10) {
                a();
                BuilderSubList<E> builderSubList = this.f62969b;
                int i10 = this.f62970c;
                this.f62970c = i10 + 1;
                builderSubList.add(i10, e10);
                this.f62971d = -1;
                this.f62972e = ((AbstractList) this.f62969b).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                a();
                if (this.f62970c < ((BuilderSubList) this.f62969b).length) {
                    int i10 = this.f62970c;
                    this.f62970c = i10 + 1;
                    this.f62971d = i10;
                    return (E) ((BuilderSubList) this.f62969b).backing[((BuilderSubList) this.f62969b).offset + this.f62971d];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public E previous() {
                a();
                int i10 = this.f62970c;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f62970c = i11;
                    this.f62971d = i11;
                    return (E) ((BuilderSubList) this.f62969b).backing[((BuilderSubList) this.f62969b).offset + this.f62971d];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                boolean z10;
                a();
                int i10 = this.f62971d;
                if (i10 != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f62969b.remove(i10);
                    this.f62970c = this.f62971d;
                    this.f62971d = -1;
                    this.f62972e = ((AbstractList) this.f62969b).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }

            @Override // java.util.ListIterator
            public void set(E e10) {
                boolean z10;
                a();
                int i10 = this.f62971d;
                if (i10 != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f62969b.set(i10, e10);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e10) {
            h();
            g();
            f(this.offset + this.length, e10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> collection) {
            p.j(collection, "elements");
            h();
            g();
            int size = collection.size();
            e(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] tArr) {
            p.j(tArr, "array");
            g();
            int length = tArr.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                l.i(eArr, tArr, 0, i11, i10 + i11);
                return (T[]) r.f(this.length, tArr);
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, tArr.getClass());
            p.i(tArr2, "copyOfRange(...)");
            return tArr2;
        }

        public BuilderSubList(E[] eArr, int i10, int i11, BuilderSubList<E> builderSubList, ListBuilder<E> listBuilder) {
            p.j(eArr, "backing");
            p.j(listBuilder, "root");
            this.backing = eArr;
            this.offset = i10;
            this.length = i11;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        public final void g() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean j(List<?> list) {
            return oj.b.h(this.backing, this.offset, this.length, list);
        }

        public final boolean l() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i10) {
            g();
            d.Companion.c(i10, this.length);
            return new a(this, i10);
        }

        public final void m() {
            ((AbstractList) this).modCount++;
        }

        public final void o(int i10, int i11) {
            if (i11 > 0) {
                m();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.o(i10, i11);
            } else {
                this.root.p(i10, i11);
            }
            this.length -= i11;
        }

        public final int p(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            BuilderSubList<E> builderSubList = this.parent;
            int iP = builderSubList != null ? builderSubList.p(i10, i11, collection, z10) : this.root.q(i10, i11, collection, z10);
            if (iP > 0) {
                m();
            }
            this.length -= iP;
            return iP;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> collection) {
            p.j(collection, "elements");
            h();
            g();
            return p(this.offset, this.length, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> collection) {
            p.j(collection, "elements");
            h();
            g();
            return p(this.offset, this.length, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i10, int i11) {
            d.Companion.d(i10, i11, this.length);
            return new BuilderSubList(this.backing, this.offset + i10, i11 - i10, this, this.root);
        }

        private final Object writeReplace() throws NotSerializableException {
            if (l()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            h();
            g();
            o(this.offset, this.length);
        }

        public final void e(int i10, Collection<? extends E> collection, int i11) {
            m();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.e(i10, collection, i11);
            } else {
                builderSubList.e(i10, collection, i11);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i11;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            g();
            if (obj != this && (!(obj instanceof List) || !j((List) obj))) {
                return false;
            }
            return true;
        }

        public final void f(int i10, E e10) {
            m();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.f(i10, e10);
            } else {
                builderSubList.f(i10, e10);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            g();
            d.Companion.b(i10, this.length);
            return this.backing[this.offset + i10];
        }

        @Override // nj.f
        public int getSize() {
            g();
            return this.length;
        }

        public final void h() {
            if (!l()) {
            } else {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            g();
            return oj.b.i(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            g();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (p.e(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            g();
            if (this.length == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            g();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (p.e(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        public final E n(int i10) {
            E eN;
            m();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                eN = (E) this.root.o(i10);
            } else {
                eN = builderSubList.n(i10);
            }
            this.length--;
            return eN;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            h();
            g();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            if (iIndexOf >= 0) {
                return true;
            }
            return false;
        }

        @Override // nj.f
        public E removeAt(int i10) {
            h();
            g();
            d.Companion.b(i10, this.length);
            return n(this.offset + i10);
        }

        @Override // nj.f, java.util.AbstractList, java.util.List
        public E set(int i10, E e10) {
            h();
            g();
            d.Companion.b(i10, this.length);
            E[] eArr = this.backing;
            int i11 = this.offset;
            E e11 = eArr[i11 + i10];
            eArr[i11 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            g();
            return oj.b.j(this.backing, this.offset, this.length, this);
        }

        @Override // nj.f, java.util.AbstractList, java.util.List
        public void add(int i10, E e10) {
            h();
            g();
            d.Companion.c(i10, this.length);
            f(this.offset + i10, e10);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection<? extends E> collection) {
            p.j(collection, "elements");
            h();
            g();
            d.Companion.c(i10, this.length);
            int size = collection.size();
            e(this.offset + i10, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            g();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return l.m(eArr, i10, this.length + i10);
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class b<E> implements ListIterator<E>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListBuilder<E> f62973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f62975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f62976e;

        public b(ListBuilder<E> listBuilder, int i10) {
            p.j(listBuilder, "list");
            this.f62973b = listBuilder;
            this.f62974c = i10;
            this.f62975d = -1;
            this.f62976e = ((AbstractList) listBuilder).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f62973b).modCount != this.f62976e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f62974c < ((ListBuilder) this.f62973b).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f62974c > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f62974c;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f62974c - 1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            a();
            ListBuilder<E> listBuilder = this.f62973b;
            int i10 = this.f62974c;
            this.f62974c = i10 + 1;
            listBuilder.add(i10, e10);
            this.f62975d = -1;
            this.f62976e = ((AbstractList) this.f62973b).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.f62974c < ((ListBuilder) this.f62973b).length) {
                int i10 = this.f62974c;
                this.f62974c = i10 + 1;
                this.f62975d = i10;
                return (E) ((ListBuilder) this.f62973b).backing[this.f62975d];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i10 = this.f62974c;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f62974c = i11;
                this.f62975d = i11;
                return (E) ((ListBuilder) this.f62973b).backing[this.f62975d];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            int i10 = this.f62975d;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f62973b.remove(i10);
                this.f62974c = this.f62975d;
                this.f62975d = -1;
                this.f62976e = ((AbstractList) this.f62973b).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            boolean z10;
            a();
            int i10 = this.f62975d;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f62973b.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    public ListBuilder(int i10) {
        this.backing = (E[]) oj.b.d(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        g();
        f(this.length, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        p.j(collection, "elements");
        g();
        int size = collection.size();
        e(this.length, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (p.e(this.backing[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final int q(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.backing[i14]) == z10) {
                E[] eArr = this.backing;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.backing;
        l.i(eArr2, eArr2, i10 + i13, i11 + i10, this.length);
        E[] eArr3 = this.backing;
        int i16 = this.length;
        oj.b.g(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            n();
        }
        this.length -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        int length = tArr.length;
        int i10 = this.length;
        if (length >= i10) {
            l.i(this.backing, tArr, 0, 0, i10);
            return (T[]) r.f(this.length, tArr);
        }
        T[] tArr2 = (T[]) Arrays.copyOfRange(this.backing, 0, i10, tArr.getClass());
        p.i(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f62968c = listBuilder;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && h((List) obj));
    }

    public final void g() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        d.Companion.b(i10, this.length);
        return this.backing[i10];
    }

    @Override // nj.f
    public int getSize() {
        return this.length;
    }

    public final boolean h(List<?> list) {
        return oj.b.h(this.backing, 0, this.length, list);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return oj.b.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    public final void j(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i10 > eArr.length) {
            this.backing = (E[]) oj.b.e(this.backing, d.Companion.e(eArr.length, i10));
        }
    }

    public final void l(int i10) {
        j(this.length + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.length - 1; i10 >= 0; i10--) {
            if (p.e(this.backing[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        d.Companion.c(i10, this.length);
        return new b(this, i10);
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    public final void p(int i10, int i11) {
        if (i11 > 0) {
            n();
        }
        E[] eArr = this.backing;
        l.i(eArr, eArr, i10, i10 + i11, this.length);
        E[] eArr2 = this.backing;
        int i12 = this.length;
        oj.b.g(eArr2, i12 - i11, i12);
        this.length -= i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        p.j(collection, "elements");
        g();
        return q(0, this.length, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        p.j(collection, "elements");
        g();
        return q(0, this.length, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        d.Companion.d(i10, i11, this.length);
        return new BuilderSubList(this.backing, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return oj.b.j(this.backing, 0, this.length, this);
    }

    public /* synthetic */ ListBuilder(int i10, int i11, i iVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // nj.f, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        g();
        d.Companion.c(i10, this.length);
        f(i10, e10);
    }

    public final List<E> build() {
        g();
        this.isReadOnly = true;
        if (this.length > 0) {
            return this;
        }
        return f62968c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        g();
        p(0, this.length);
    }

    public final void e(int i10, Collection<? extends E> collection, int i11) {
        n();
        m(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.backing[i10 + i12] = it.next();
        }
    }

    public final void f(int i10, E e10) {
        n();
        m(i10, 1);
        this.backing[i10] = e10;
    }

    public final void m(int i10, int i11) {
        l(i11);
        E[] eArr = this.backing;
        l.i(eArr, eArr, i10 + i11, i10, this.length);
        this.length += i11;
    }

    public final E o(int i10) {
        n();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        l.i(eArr, eArr, i10, i10 + 1, this.length);
        oj.b.f(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        if (iIndexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // nj.f
    public E removeAt(int i10) {
        g();
        d.Companion.b(i10, this.length);
        return o(i10);
    }

    @Override // nj.f, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        g();
        d.Companion.b(i10, this.length);
        E[] eArr = this.backing;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        p.j(collection, "elements");
        g();
        d.Companion.c(i10, this.length);
        int size = collection.size();
        e(i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return l.m(this.backing, 0, this.length);
    }
}
