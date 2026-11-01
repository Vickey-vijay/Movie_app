package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: Collections2.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k1 {

    /* JADX INFO: compiled from: Collections2.java */
    public static class a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Collection<E> f20622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m5.m<? super E> f20623c;

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.k(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e10) {
            m5.l.d(this.f20623c.apply(e10));
            return this.f20622b.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            y1.k(this.f20622b, this.f20623c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (k1.c(this.f20622b, obj)) {
                return this.f20623c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !y1.b(this.f20622b, this.f20623c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.j(this.f20622b.iterator(), this.f20623c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f20622b.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f20623c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f20622b.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f20623c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f20622b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f20623c.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.k(iterator()).toArray(tArr);
        }

        public a(Collection<E> collection, m5.m<? super E> mVar) {
            this.f20622b = collection;
            this.f20623c = mVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                m5.l.d(this.f20623c.apply(it.next()));
            }
            return this.f20622b.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return k1.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (contains(obj) && this.f20622b.remove(obj)) {
                return true;
            }
            return false;
        }
    }

    public static StringBuilder b(int i10) {
        j1.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Collection<?> collection, Object obj) {
        m5.l.m(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String d(Collection<?> collection) {
        StringBuilder sbB = b(collection.size());
        sbB.append('[');
        boolean z10 = true;
        for (Object obj : collection) {
            if (!z10) {
                sbB.append(", ");
            }
            z10 = false;
            if (obj == collection) {
                sbB.append("(this Collection)");
            } else {
                sbB.append(obj);
            }
        }
        sbB.append(']');
        return sbB.toString();
    }
}
