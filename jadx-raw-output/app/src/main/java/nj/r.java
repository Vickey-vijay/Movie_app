package nj;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public class r {
    public static final <E> List<E> a(List<E> list) {
        ck.p.j(list, "builder");
        return ((ListBuilder) list).build();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        ck.p.j(tArr, "<this>");
        if (z10 && ck.p.e(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        ck.p.i(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final <E> List<E> c() {
        return new ListBuilder(0, 1, null);
    }

    public static final <E> List<E> d(int i10) {
        return new ListBuilder(i10);
    }

    public static final <T> T[] f(int i10, T[] tArr) {
        ck.p.j(tArr, "array");
        if (i10 < tArr.length) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public static final <T> List<T> e(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        ck.p.i(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
