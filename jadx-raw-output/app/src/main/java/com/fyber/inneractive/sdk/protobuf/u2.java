package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f18301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o3 f18302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o3 f18303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o3 f18304d;

    public static Object a(int i10, List list, Object obj, o3 o3Var) {
        return obj;
    }

    public static void a(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.a(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = b0.f18151b;
            i12++;
        }
        c0Var.f18158a.g(i12);
        while (i11 < list.size()) {
            c0Var.f18158a.a(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void b(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                b0 b0Var = c0Var.f18158a;
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                b0Var.getClass();
                b0Var.a(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = b0.f18151b;
            i12 += 8;
        }
        c0Var.f18158a.g(i12);
        while (i11 < list.size()) {
            b0 b0Var2 = c0Var.f18158a;
            double dDoubleValue2 = ((Double) list.get(i11)).doubleValue();
            b0Var2.getClass();
            b0Var2.c(Double.doubleToRawLongBits(dDoubleValue2));
            i11++;
        }
    }

    public static void c(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.b(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += b0.a(((Integer) list.get(i12)).intValue());
        }
        c0Var.f18158a.g(iA);
        while (i11 < list.size()) {
            c0Var.f18158a.f(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void d(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.a(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = b0.f18151b;
            i12 += 4;
        }
        c0Var.f18158a.g(i12);
        while (i11 < list.size()) {
            c0Var.f18158a.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void e(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.a(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = b0.f18151b;
            i12 += 8;
        }
        c0Var.f18158a.g(i12);
        while (i11 < list.size()) {
            c0Var.f18158a.c(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void f(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                b0 b0Var = c0Var.f18158a;
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                b0Var.getClass();
                b0Var.a(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = b0.f18151b;
            i12 += 4;
        }
        c0Var.f18158a.g(i12);
        while (i11 < list.size()) {
            b0 b0Var2 = c0Var.f18158a;
            float fFloatValue2 = ((Float) list.get(i11)).floatValue();
            b0Var2.getClass();
            b0Var2.e(Float.floatToRawIntBits(fFloatValue2));
            i11++;
        }
    }

    public static void g(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.b(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue = ((Integer) list.get(i12)).intValue();
            iC += iIntValue >= 0 ? b0.c(iIntValue) : 10;
        }
        c0Var.f18158a.g(iC);
        while (i11 < list.size()) {
            c0Var.f18158a.f(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f18301a = cls;
        f18302b = a(false);
        f18303c = a(true);
        f18304d = new o3();
    }

    public static void h(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.b(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += b0.a(((Long) list.get(i12)).longValue());
        }
        c0Var.f18158a.g(iA);
        while (i11 < list.size()) {
            c0Var.f18158a.d(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void i(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.a(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = b0.f18151b;
            i12 += 4;
        }
        c0Var.f18158a.g(i12);
        while (i11 < list.size()) {
            c0Var.f18158a.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void j(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.a(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = b0.f18151b;
            i12 += 8;
        }
        c0Var.f18158a.g(i12);
        while (i11 < list.size()) {
            c0Var.f18158a.c(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void k(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.d(i10, b0.d(((Integer) list.get(i11)).intValue()));
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC += b0.c(b0.d(((Integer) list.get(i12)).intValue()));
        }
        c0Var.f18158a.g(iC);
        while (i11 < list.size()) {
            c0Var.f18158a.g(b0.d(((Integer) list.get(i11)).intValue()));
            i11++;
        }
    }

    public static void l(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.b(i10, b0.b(((Long) list.get(i11)).longValue()));
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += b0.a(b0.b(((Long) list.get(i12)).longValue()));
        }
        c0Var.f18158a.g(iA);
        while (i11 < list.size()) {
            c0Var.f18158a.d(b0.b(((Long) list.get(i11)).longValue()));
            i11++;
        }
    }

    public static void m(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC += b0.c(((Integer) list.get(i12)).intValue());
        }
        c0Var.f18158a.g(iC);
        while (i11 < list.size()) {
            c0Var.f18158a.g(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void n(int i10, List list, c0 c0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (!z10) {
            c0Var.getClass();
            while (i11 < list.size()) {
                c0Var.f18158a.b(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        c0Var.f18158a.c(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += b0.a(((Long) list.get(i12)).longValue());
        }
        c0Var.f18158a.g(iA);
        while (i11 < list.size()) {
            c0Var.f18158a.d(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int d(List list) {
        int iC;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            iC = 0;
            while (i10 < size) {
                a1Var.d(i10);
                iC += b0.c(b0.d(a1Var.f18145b[i10]));
                i10++;
            }
        } else {
            iC = 0;
            while (i10 < size) {
                iC += b0.c(b0.d(((Integer) list.get(i10)).intValue()));
                i10++;
            }
        }
        return iC;
    }

    public static int e(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            iA = 0;
            while (i10 < size) {
                u1Var.c(i10);
                iA += b0.a(b0.b(u1Var.f18299b[i10]));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += b0.a(b0.b(((Long) list.get(i10)).longValue()));
                i10++;
            }
        }
        return iA;
    }

    public static void a(int i10, List list, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0Var.f18158a.a(i10, (s) list.get(i11));
        }
    }

    public static int g(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            iA = 0;
            while (i10 < size) {
                u1Var.c(i10);
                iA += b0.a(u1Var.f18299b[i10]);
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += b0.a(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iA;
    }

    public static void b(int i10, List list, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        int i11 = 0;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            while (i11 < list.size()) {
                Object objA = q1Var.a(i11);
                if (objA instanceof String) {
                    c0Var.f18158a.a((String) objA, i10);
                } else {
                    c0Var.f18158a.a(i10, (s) objA);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            c0Var.f18158a.a((String) list.get(i11), i10);
            i11++;
        }
    }

    public static int c(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            iA = 0;
            while (i10 < size) {
                u1Var.c(i10);
                iA += b0.a(u1Var.f18299b[i10]);
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += b0.a(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iA;
    }

    public static int f(List list) {
        int iC;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            iC = 0;
            while (i10 < size) {
                a1Var.d(i10);
                iC += b0.c(a1Var.f18145b[i10]);
                i10++;
            }
        } else {
            iC = 0;
            while (i10 < size) {
                iC += b0.c(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iC;
    }

    public static void a(int i10, List list, c0 c0Var, t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0Var.a(i10, list.get(i11), t2Var);
        }
    }

    public static int a(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            iA = 0;
            while (i10 < size) {
                a1Var.d(i10);
                iA += b0.a(a1Var.f18145b[i10]);
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += b0.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iA;
    }

    public static int c(int i10, List list) {
        int iA;
        int iA2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iB = b0.b(i10) * size;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            while (i11 < size) {
                Object objA = q1Var.a(i11);
                if (objA instanceof s) {
                    iA2 = b0.a((s) objA);
                } else {
                    iA2 = b0.a((String) objA);
                }
                iB = iA2 + iB;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof s) {
                    iA = b0.a((s) obj);
                } else {
                    iA = b0.a((String) obj);
                }
                iB = iA + iB;
                i11++;
            }
        }
        return iB;
    }

    public static void b(int i10, List list, c0 c0Var, t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0Var.f18158a.a(i10, (d2) list.get(i11), t2Var);
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b0.b(i10) + 4) * size;
    }

    public static o3 a(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (o3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int b(List list) {
        int i10;
        int iC;
        int iC2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            i10 = 0;
            while (i11 < size) {
                a1Var.d(i11);
                int i12 = a1Var.f18145b[i11];
                if (i12 >= 0) {
                    iC2 = b0.c(i12);
                } else {
                    Logger logger = b0.f18151b;
                    iC2 = 10;
                }
                i10 += iC2;
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                if (iIntValue >= 0) {
                    iC = b0.c(iIntValue);
                } else {
                    Logger logger2 = b0.f18151b;
                    iC = 10;
                }
                i10 += iC;
                i11++;
            }
        }
        return i10;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object a(int i10, AbstractList abstractList, e1 e1Var, Object obj, o3 o3Var) {
        if (e1Var == null) {
            return obj;
        }
        int size = abstractList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) abstractList.get(i12);
            int iIntValue = num.intValue();
            if (e1Var.a(iIntValue) != null) {
                if (i12 != i11) {
                    abstractList.set(i11, num);
                }
                i11++;
            } else {
                obj = a(i10, iIntValue, obj, o3Var);
            }
        }
        if (i11 != size) {
            abstractList.subList(i11, size).clear();
        }
        return obj;
    }

    public static Object a(int i10, int i11, Object obj, o3 o3Var) {
        if (obj == null) {
            o3Var.getClass();
            obj = new n3();
        }
        o3Var.getClass();
        ((n3) obj).a(i10 << 3, Long.valueOf(i11));
        return obj;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b0.b(i10) + 8) * size;
    }
}
