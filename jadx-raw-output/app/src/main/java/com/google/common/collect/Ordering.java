package com.google.common.collect;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Ordering<T> implements Comparator<T> {
    public static final int LEFT_IS_GREATER = 1;
    public static final int RIGHT_IS_GREATER = -1;

    public static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        public final Object value;

        public IncomparableValueException(Object obj) {
            super("Cannot compare value: " + obj);
            this.value = obj;
        }
    }

    public static class a extends Ordering<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f20512b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConcurrentMap<Object, Integer> f20513c = h2.h(new MapMaker()).i();

        public String toString() {
            return "Ordering.arbitrary()";
        }

        public final Integer a(Object obj) {
            Integer num = this.f20513c.get(obj);
            if (num != null) {
                return num;
            }
            Integer numValueOf = Integer.valueOf(this.f20512b.getAndIncrement());
            Integer numPutIfAbsent = this.f20513c.putIfAbsent(obj, numValueOf);
            return numPutIfAbsent != null ? numPutIfAbsent : numValueOf;
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iB = b(obj);
            int iB2 = b(obj2);
            if (iB != iB2) {
                return iB < iB2 ? -1 : 1;
            }
            int iCompareTo = a(obj).compareTo(a(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ordering<Object> f20514a = new a();
    }

    public static <T> Ordering<T> explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Comparator) m5.l.m(comparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i10) {
        return reverse().leastOf(iterable, i10);
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i10) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) i10) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i10) {
                    array = Arrays.copyOf(array, i10);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i10);
    }

    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering<Object> arbitrary() {
        return b.f20514a;
    }

    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    public static <T> Ordering<T> explicit(T t10, T... tArr) {
        return explicit(Lists.a(t10, tArr));
    }

    public static <C extends Comparable> Ordering<C> natural() {
        return NaturalOrdering.INSTANCE;
    }

    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i10) {
        return reverse().leastOf(it, i10);
    }

    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering(this);
    }

    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering(this);
    }

    public <F> Ordering<F> onResultOf(m5.e<F, ? extends T> eVar) {
        return new ByFunctionOrdering(eVar, this);
    }

    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, T t10) {
        return Collections.binarySearch(list, t10, this);
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public <T2 extends T> Ordering<Map.Entry<T2, ?>> onKeys() {
        return (Ordering<Map.Entry<T2, ?>>) onResultOf(Maps.g());
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrN = y1.n(iterable);
        Arrays.sort(objArrN, this);
        return Lists.j(Arrays.asList(objArrN));
    }

    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) m5.l.m(ordering);
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E max(E e10, E e11) {
        return compare(e10, e11) >= 0 ? e10 : e11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E min(E e10, E e11) {
        return compare(e10, e11) <= 0 ? e10 : e11;
    }

    public <E extends T> E max(E e10, E e11, E e12, E... eArr) {
        E e13 = (E) max(max(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) max(e13, e14);
        }
        return e13;
    }

    public <E extends T> E min(E e10, E e11, E e12, E... eArr) {
        E e13 = (E) min(min(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) min(e13, e14);
        }
        return e13;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i10) {
        m5.l.m(it);
        j1.b(i10, CampaignEx.JSON_KEY_AD_K);
        if (i10 == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i10 >= 1073741823) {
            ArrayList arrayListK = Lists.k(it);
            Collections.sort(arrayListK, this);
            if (arrayListK.size() > i10) {
                arrayListK.subList(i10, arrayListK.size()).clear();
            }
            arrayListK.trimToSize();
            return Collections.unmodifiableList(arrayListK);
        }
        o2 o2VarA = o2.a(i10, this);
        o2VarA.c(it);
        return o2VarA.f();
    }
}
