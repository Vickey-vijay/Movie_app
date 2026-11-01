package nj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes2.dex */
public class t extends s {
    public static final <T> int v(Iterable<? extends T> iterable, int i10) {
        ck.p.j(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final <T> Integer w(Iterable<? extends T> iterable) {
        ck.p.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static final <T> List<T> x(Iterable<? extends Iterable<? extends T>> iterable) {
        ck.p.j(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            x.C(arrayList, it.next());
        }
        return arrayList;
    }
}
