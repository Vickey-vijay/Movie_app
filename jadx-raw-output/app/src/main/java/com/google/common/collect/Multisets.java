package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class Multisets {

    public static class ImmutableEntry<E> extends a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }

        @Override // com.google.common.collect.b2.a
        public final int getCount() {
            return this.count;
        }

        @Override // com.google.common.collect.b2.a
        public final E getElement() {
            return this.element;
        }

        public ImmutableEntry(E e10, int i10) {
            this.element = e10;
            this.count = i10;
            j1.b(i10, "count");
        }
    }

    public static abstract class a<E> implements b2.a<E> {
        public boolean equals(Object obj) {
            if (!(obj instanceof b2.a)) {
                return false;
            }
            b2.a aVar = (b2.a) obj;
            return getCount() == aVar.getCount() && m5.i.a(getElement(), aVar.getElement());
        }

        public int hashCode() {
            int iHashCode;
            E element = getElement();
            if (element == null) {
                iHashCode = 0;
            } else {
                iHashCode = element.hashCode();
            }
            return iHashCode ^ getCount();
        }

        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count != 1) {
                return strValueOf + " x " + count;
            }
            return strValueOf;
        }
    }

    public static abstract class c<E> extends Sets.d<b2.a<E>> {
        public abstract b2<E> c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof b2.a)) {
                return false;
            }
            b2.a aVar = (b2.a) obj;
            return aVar.getCount() > 0 && c().count(aVar.getElement()) == aVar.getCount();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof b2.a) {
                b2.a aVar = (b2.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return c().setCount(element, count, 0);
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }
    }

    public static final class d<E> implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b2<E> f20504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<b2.a<E>> f20505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b2.a<E> f20506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f20509g;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20507e > 0 || this.f20505c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            j1.e(this.f20509g);
            if (this.f20508f == 1) {
                this.f20505c.remove();
            } else {
                b2<E> b2Var = this.f20504b;
                b2.a<E> aVar = this.f20506d;
                Objects.requireNonNull(aVar);
                b2Var.remove(aVar.getElement());
            }
            this.f20508f--;
            this.f20509g = false;
        }

        public d(b2<E> b2Var, Iterator<b2.a<E>> it) {
            this.f20504b = b2Var;
            this.f20505c = it;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                if (this.f20507e == 0) {
                    b2.a<E> next = this.f20505c.next();
                    this.f20506d = next;
                    int count = next.getCount();
                    this.f20507e = count;
                    this.f20508f = count;
                }
                this.f20507e--;
                this.f20509g = true;
                b2.a<E> aVar = this.f20506d;
                Objects.requireNonNull(aVar);
                return aVar.getElement();
            }
            throw new NoSuchElementException();
        }
    }

    public static boolean e(b2<?> b2Var, Object obj) {
        if (obj == b2Var) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var2 = (b2) obj;
            if (b2Var.size() == b2Var2.size() && b2Var.entrySet().size() == b2Var2.entrySet().size()) {
                for (b2.a aVar : b2Var2.entrySet()) {
                    if (b2Var.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static abstract class b<E> extends Sets.d<E> {
        public abstract b2<E> c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return c().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (c().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().entrySet().size();
        }
    }

    public static <E> boolean b(b2<E> b2Var, b2<? extends E> b2Var2) {
        if (b2Var2 instanceof AbstractMapBasedMultiset) {
            return a(b2Var, (AbstractMapBasedMultiset) b2Var2);
        }
        if (b2Var2.isEmpty()) {
            return false;
        }
        for (b2.a<? extends E> aVar : b2Var2.entrySet()) {
            b2Var.add(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    public static <T> b2<T> d(Iterable<T> iterable) {
        return (b2) iterable;
    }

    public static <E> b2.a<E> f(E e10, int i10) {
        return new ImmutableEntry(e10, i10);
    }

    public static int g(Iterable<?> iterable) {
        if (iterable instanceof b2) {
            return ((b2) iterable).elementSet().size();
        }
        return 11;
    }

    public static <E> Iterator<E> h(b2<E> b2Var) {
        return new d(b2Var, b2Var.entrySet().iterator());
    }

    public static boolean i(b2<?> b2Var, Collection<?> collection) {
        if (collection instanceof b2) {
            collection = ((b2) collection).elementSet();
        }
        return b2Var.elementSet().removeAll(collection);
    }

    public static <E> int k(b2<E> b2Var, E e10, int i10) {
        j1.b(i10, "count");
        int iCount = b2Var.count(e10);
        int i11 = i10 - iCount;
        if (i11 > 0) {
            b2Var.add(e10, i11);
        } else if (i11 < 0) {
            b2Var.remove(e10, -i11);
        }
        return iCount;
    }

    public static <E> boolean l(b2<E> b2Var, E e10, int i10, int i11) {
        j1.b(i10, "oldCount");
        j1.b(i11, "newCount");
        if (b2Var.count(e10) != i10) {
            return false;
        }
        b2Var.setCount(e10, i11);
        return true;
    }

    public static <E> boolean a(b2<E> b2Var, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(b2Var);
        return true;
    }

    public static <E> boolean c(b2<E> b2Var, Collection<? extends E> collection) {
        m5.l.m(b2Var);
        m5.l.m(collection);
        if (collection instanceof b2) {
            return b(b2Var, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a(b2Var, collection.iterator());
    }

    public static boolean j(b2<?> b2Var, Collection<?> collection) {
        m5.l.m(collection);
        if (collection instanceof b2) {
            collection = ((b2) collection).elementSet();
        }
        return b2Var.elementSet().retainAll(collection);
    }
}
