package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public final class Lists {

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        public final E first;
        public final E[] rest;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return o5.d.g(this.rest.length, 1);
        }

        public OnePlusArrayList(E e10, E[] eArr) {
            this.first = e10;
            this.rest = (E[]) ((Object[]) m5.l.m(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            m5.l.k(i10, size());
            if (i10 == 0) {
                return this.first;
            }
            return this.rest[i10 - 1];
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> fromList;
        public final m5.e<? super F, ? extends T> function;

        public class a extends q2<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.p2
            public T a(F f10) {
                return TransformingRandomAccessList.this.function.apply(f10);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.function.apply(this.fromList.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.fromList.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.function.apply(this.fromList.remove(i10));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i10, int i11) {
            this.fromList.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }

        public TransformingRandomAccessList(List<F> list, m5.e<? super F, ? extends T> eVar) {
            this.fromList = (List) m5.l.m(list);
            this.function = (m5.e) m5.l.m(eVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> fromList;
        public final m5.e<? super F, ? extends T> function;

        public class a extends q2<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.p2
            public T a(F f10) {
                return TransformingSequentialList.this.function.apply(f10);
            }
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.fromList.listIterator(i10));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i10, int i11) {
            this.fromList.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }

        public TransformingSequentialList(List<F> list, m5.e<? super F, ? extends T> eVar) {
            this.fromList = (List) m5.l.m(list);
            this.function = (m5.e) m5.l.m(eVar);
        }
    }

    public static <E> List<E> a(E e10, E[] eArr) {
        return new OnePlusArrayList(e10, eArr);
    }

    public static <T> List<T> b(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static int c(int i10) {
        j1.b(i10, "arraySize");
        return Ints.m(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    public static int e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (m5.i.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int g(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return h(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (m5.i.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int h(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> i() {
        return new ArrayList<>();
    }

    public static <F, T> List<T> m(List<F> list, m5.e<? super F, ? extends T> eVar) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, eVar) : new TransformingSequentialList(list, eVar);
    }

    public static boolean d(List<?> list, Object obj) {
        if (obj == m5.l.m(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!m5.i.a(list.get(i10), list2.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return Iterators.f(list.iterator(), list2.iterator());
    }

    public static int f(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <E> ArrayList<E> j(Iterable<? extends E> iterable) {
        m5.l.m(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return k(iterable.iterator());
    }

    public static <E> ArrayList<E> k(Iterator<? extends E> it) {
        ArrayList<E> arrayListI = i();
        Iterators.a(arrayListI, it);
        return arrayListI;
    }

    @SafeVarargs
    public static <E> ArrayList<E> l(E... eArr) {
        m5.l.m(eArr);
        ArrayList<E> arrayList = new ArrayList<>(c(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
