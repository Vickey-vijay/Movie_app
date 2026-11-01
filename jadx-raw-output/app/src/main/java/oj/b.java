package oj;

import ck.p;
import com.ironsource.C3426d4;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final <T> int i(T[] tArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            T t10 = tArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (t10 != null ? t10.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final <E> E[] d(int i10) {
        if (i10 >= 0) {
            return (E[]) new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] e(T[] tArr, int i10) {
        p.j(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        p.i(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void f(E[] eArr, int i10) {
        p.j(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void g(E[] eArr, int i10, int i11) {
        p.j(eArr, "<this>");
        while (i10 < i11) {
            f(eArr, i10);
            i10++;
        }
    }

    public static final <T> String j(T[] tArr, int i10, int i11, Collection<? extends T> collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append(C3426d4.j.f28586d);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            T t10 = tArr[i10 + i12];
            if (t10 == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(t10);
            }
        }
        sb2.append(C3426d4.j.f28588e);
        String string = sb2.toString();
        p.i(string, "toString(...)");
        return string;
    }

    public static final <T> boolean h(T[] tArr, int i10, int i11, List<?> list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!p.e(tArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }
}
