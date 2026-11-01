package nj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes2.dex */
public class s extends r {
    public static final <T> ArrayList<T> g(T... tArr) {
        ck.p.j(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new h(tArr, true));
    }

    public static final <T> Collection<T> h(T[] tArr) {
        ck.p.j(tArr, "<this>");
        return new h(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int i(List<? extends T> list, T t10, int i10, int i11) {
        ck.p.j(list, "<this>");
        s(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = qj.b.d(list.get(i13), t10);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int j(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return i(list, comparable, i10, i11);
    }

    public static final <T> List<T> k() {
        return EmptyList.INSTANCE;
    }

    public static final ik.i l(Collection<?> collection) {
        ck.p.j(collection, "<this>");
        return new ik.i(0, collection.size() - 1);
    }

    public static final <T> int m(List<? extends T> list) {
        ck.p.j(list, "<this>");
        return list.size() - 1;
    }

    public static final <T> List<T> n(T... tArr) {
        ck.p.j(tArr, "elements");
        return tArr.length > 0 ? l.f(tArr) : k();
    }

    public static final <T> List<T> o(T t10) {
        return t10 != null ? r.e(t10) : k();
    }

    public static final <T> List<T> p(T... tArr) {
        ck.p.j(tArr, "elements");
        return n.G(tArr);
    }

    public static final <T> List<T> q(T... tArr) {
        ck.p.j(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new h(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> r(List<? extends T> list) {
        ck.p.j(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : r.e(list.get(0));
        }
        return k();
    }

    public static final void s(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static final void t() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void u() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
