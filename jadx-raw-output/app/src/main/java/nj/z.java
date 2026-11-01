package nj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: _CollectionsJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public class z extends y {
    public static final <R> List<R> O(Iterable<?> iterable, Class<R> cls) {
        ck.p.j(iterable, "<this>");
        ck.p.j(cls, "klass");
        return (List) P(iterable, new ArrayList(), cls);
    }

    public static final <C extends Collection<? super R>, R> C P(Iterable<?> iterable, C c10, Class<R> cls) {
        ck.p.j(iterable, "<this>");
        ck.p.j(c10, "destination");
        ck.p.j(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c10.add(obj);
            }
        }
        return c10;
    }

    public static final <T> void Q(List<T> list) {
        ck.p.j(list, "<this>");
        Collections.reverse(list);
    }
}
