package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Iterables.java */
/* JADX INFO: loaded from: classes11.dex */
public final class y1 {
    public static <T> boolean l(List<T> list, m5.m<? super T> mVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!mVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        m(list, mVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m(list, mVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : Iterators.a(collection, ((Iterable) m5.l.m(iterable)).iterator());
    }

    public static <E> Collection<E> c(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.k(iterable.iterator());
    }

    public static <T> T f(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.l(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) h(list);
    }

    public static <T> T g(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) h(Lists.b(iterable));
            }
        }
        return (T) Iterators.m(iterable.iterator(), t10);
    }

    public static boolean j(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> boolean k(Iterable<T> iterable, m5.m<? super T> mVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? l((List) iterable, (m5.m) m5.l.m(mVar)) : Iterators.t(iterable.iterator(), mVar);
    }

    public static <T> boolean b(Iterable<T> iterable, m5.m<? super T> mVar) {
        return Iterators.b(iterable.iterator(), mVar);
    }

    public static <T> Iterable<T> d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return n1.c(iterable, iterable2);
    }

    public static <T> T e(Iterable<? extends T> iterable, T t10) {
        return (T) Iterators.n(iterable.iterator(), t10);
    }

    public static <T> T h(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T i(Iterable<T> iterable) {
        return (T) Iterators.o(iterable.iterator());
    }

    public static <T> void m(List<T> list, m5.m<? super T> mVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (mVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static Object[] n(Iterable<?> iterable) {
        return c(iterable).toArray();
    }

    public static <T> T[] o(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) c(iterable).toArray(tArr);
    }

    public static String p(Iterable<?> iterable) {
        return Iterators.x(iterable.iterator());
    }
}
