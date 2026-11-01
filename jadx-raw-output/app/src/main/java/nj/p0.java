package nj;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: compiled from: SetsJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class p0 {
    public static final <E> Set<E> a(Set<E> set) {
        ck.p.j(set, "builder");
        return ((SetBuilder) set).build();
    }

    public static final <E> Set<E> b() {
        return new SetBuilder();
    }

    public static final <E> Set<E> c(int i10) {
        return new SetBuilder(i10);
    }

    public static final <T> TreeSet<T> e(T... tArr) {
        ck.p.j(tArr, "elements");
        return (TreeSet) n.m0(tArr, new TreeSet());
    }

    public static final <T> Set<T> d(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        ck.p.i(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
