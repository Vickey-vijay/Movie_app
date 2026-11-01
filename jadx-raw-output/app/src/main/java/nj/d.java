package nj;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d<E> extends nj.b<E> implements List<E> {
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - d.maxArraySize <= 0) {
                return i12;
            }
            if (i11 > d.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return d.maxArraySize;
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final boolean f(Collection<?> collection, Collection<?> collection2) {
            ck.p.j(collection, "c");
            ck.p.j(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!ck.p.e(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection<?> collection) {
            ck.p.j(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public class b implements Iterator<E>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64727b;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public b() {
        }

        public final int a() {
            return this.f64727b;
        }

        public final void b(int i10) {
            this.f64727b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64727b < d.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                d<E> dVar = d.this;
                int i10 = this.f64727b;
                this.f64727b = i10 + 1;
                return dVar.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    public class c extends d<E>.b implements ListIterator<E> {
        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public c(int i10) {
            super();
            d.Companion.c(i10, d.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (a() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                d<E> dVar = d.this;
                b(a() - 1);
                return dVar.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }
    }

    /* JADX INFO: renamed from: nj.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class C0593d<E> extends d<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d<E> f64730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f64731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f64732d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0593d(d<? extends E> dVar, int i10, int i11) {
            ck.p.j(dVar, "list");
            this.f64730b = dVar;
            this.f64731c = i10;
            d.Companion.d(i10, i11, dVar.size());
            this.f64732d = i11 - i10;
        }

        @Override // nj.d, java.util.List
        public E get(int i10) {
            d.Companion.b(i10, this.f64732d);
            return this.f64730b.get(this.f64731c + i10);
        }

        @Override // nj.d, nj.b
        public int getSize() {
            return this.f64732d;
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i10);

    @Override // nj.b
    public abstract int getSize();

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.f(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    @Override // nj.b, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new C0593d(this, i10, i11);
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!ck.p.e(it.next(), obj)) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (ck.p.e(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
