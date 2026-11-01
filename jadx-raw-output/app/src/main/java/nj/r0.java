package nj;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes10.dex */
public class r0 extends q0 {
    public static final <T> Set<T> k(Set<? extends T> set, Iterable<? extends T> iterable) {
        ck.p.j(set, "<this>");
        ck.p.j(iterable, "elements");
        Collection<?> collectionE = x.E(iterable);
        if (collectionE.isEmpty()) {
            return b0.T0(set);
        }
        if (!(collectionE instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionE);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t10 : set) {
            if (!((Set) collectionE).contains(t10)) {
                linkedHashSet2.add(t10);
            }
        }
        return linkedHashSet2;
    }

    public static final <T> Set<T> l(Set<? extends T> set, T t10) {
        ck.p.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(l0.f(set.size()));
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && ck.p.e(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> m(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        ck.p.j(set, "<this>");
        ck.p.j(iterable, "elements");
        Integer numW = t.w(iterable);
        if (numW != null) {
            size = set.size() + numW.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(l0.f(size));
        linkedHashSet.addAll(set);
        x.C(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final <T> Set<T> n(Set<? extends T> set, T t10) {
        ck.p.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(l0.f(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
