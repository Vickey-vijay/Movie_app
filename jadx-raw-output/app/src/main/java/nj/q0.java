package nj;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: Sets.kt */
/* JADX INFO: loaded from: classes10.dex */
public class q0 extends p0 {
    public static final <T> Set<T> f() {
        return EmptySet.INSTANCE;
    }

    public static final <T> HashSet<T> g(T... tArr) {
        ck.p.j(tArr, "elements");
        return (HashSet) n.m0(tArr, new HashSet(l0.f(tArr.length)));
    }

    public static final <T> Set<T> h(T... tArr) {
        ck.p.j(tArr, "elements");
        return (Set) n.m0(tArr, new LinkedHashSet(l0.f(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> i(Set<? extends T> set) {
        ck.p.j(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : p0.d(set.iterator().next());
        }
        return f();
    }

    public static final <T> Set<T> j(T... tArr) {
        ck.p.j(tArr, "elements");
        return n.t0(tArr);
    }
}
