package nj;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Arrays.kt */
/* JADX INFO: loaded from: classes2.dex */
public class k extends j {
    public static final <T> String c(T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder((ik.k.g(tArr.length, 429496729) * 5) + 2);
        d(tArr, sb2, new ArrayList());
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void d(T[] tArr, StringBuilder sb2, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb2.append(ImpressionLog.S);
            return;
        }
        list.add(tArr);
        sb2.append('[');
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object[] objArr = tArr[i10];
            if (objArr == 0) {
                sb2.append("null");
            } else if (objArr instanceof Object[]) {
                d(objArr, sb2, list);
                mj.r rVar = mj.r.f64562a;
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                ck.p.i(string, "toString(...)");
                sb2.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                ck.p.i(string2, "toString(...)");
                sb2.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                ck.p.i(string3, "toString(...)");
                sb2.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                ck.p.i(string4, "toString(...)");
                sb2.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                ck.p.i(string5, "toString(...)");
                sb2.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                ck.p.i(string6, "toString(...)");
                sb2.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                ck.p.i(string7, "toString(...)");
                sb2.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                ck.p.i(string8, "toString(...)");
                sb2.append(string8);
            } else if (objArr instanceof mj.j) {
                sb2.append(pj.b.a(((mj.j) objArr).v()));
            } else if (objArr instanceof mj.q) {
                sb2.append(pj.b.c(((mj.q) objArr).v()));
            } else if (objArr instanceof mj.l) {
                sb2.append(pj.b.b(((mj.l) objArr).v()));
            } else if (objArr instanceof mj.n) {
                sb2.append(pj.b.d(((mj.n) objArr).v()));
            } else {
                sb2.append(objArr.toString());
            }
        }
        sb2.append(']');
        list.remove(s.m(list));
    }
}
