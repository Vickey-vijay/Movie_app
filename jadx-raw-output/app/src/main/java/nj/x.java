package nj;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
public class x extends w {
    public static final <T> boolean C(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ck.p.j(collection, "<this>");
        ck.p.j(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean D(Collection<? super T> collection, T[] tArr) {
        ck.p.j(collection, "<this>");
        ck.p.j(tArr, "elements");
        return collection.addAll(l.f(tArr));
    }

    public static final <T> Collection<T> E(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : b0.O0(iterable);
    }

    public static final <T> boolean G(List<T> list, bk.l<? super T, Boolean> lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            ck.p.h(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return F(ck.x.b(list), lVar, z10);
        }
        int iM = s.m(list);
        if (iM >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (lVar.invoke(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == iM) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iM2 = s.m(list);
        if (i10 > iM2) {
            return true;
        }
        while (true) {
            list.remove(iM2);
            if (iM2 == i10) {
                return true;
            }
            iM2--;
        }
    }

    public static final <T> boolean H(Iterable<? extends T> iterable, bk.l<? super T, Boolean> lVar) {
        ck.p.j(iterable, "<this>");
        ck.p.j(lVar, "predicate");
        return F(iterable, lVar, true);
    }

    public static final <T> boolean I(List<T> list, bk.l<? super T, Boolean> lVar) {
        ck.p.j(list, "<this>");
        ck.p.j(lVar, "predicate");
        return G(list, lVar, true);
    }

    public static final <T> T J(List<T> list) {
        ck.p.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final <T> T K(List<T> list) {
        ck.p.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(s.m(list));
    }

    public static final <T> T L(List<T> list) {
        ck.p.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(s.m(list));
    }

    public static final <T> boolean M(Iterable<? extends T> iterable, bk.l<? super T, Boolean> lVar) {
        ck.p.j(iterable, "<this>");
        ck.p.j(lVar, "predicate");
        return F(iterable, lVar, false);
    }

    public static final <T> boolean N(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ck.p.j(collection, "<this>");
        ck.p.j(iterable, "elements");
        return collection.retainAll(E(iterable));
    }

    public static final <T> boolean F(Iterable<? extends T> iterable, bk.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }
}
