package ck;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TypeIntrinsics.java */
/* JADX INFO: loaded from: classes6.dex */
public class x {
    public static Collection a(Object obj) {
        if ((obj instanceof dk.a) && !(obj instanceof dk.b)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof dk.a) && !(obj instanceof dk.c)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof dk.a) && !(obj instanceof dk.d)) {
            p(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof dk.a) && !(obj instanceof dk.e)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            p(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).getArity();
        }
        if (obj instanceof bk.a) {
            return 0;
        }
        if (obj instanceof bk.l) {
            return 1;
        }
        if (obj instanceof bk.p) {
            return 2;
        }
        if (obj instanceof bk.q) {
            return 3;
        }
        if (obj instanceof bk.r) {
            return 4;
        }
        if (obj instanceof bk.s) {
            return 5;
        }
        if (obj instanceof bk.t) {
            return 6;
        }
        if (obj instanceof bk.u) {
            return 7;
        }
        if (obj instanceof bk.v) {
            return 8;
        }
        if (obj instanceof bk.w) {
            return 9;
        }
        if (obj instanceof bk.b) {
            return 10;
        }
        if (obj instanceof bk.c) {
            return 11;
        }
        if (obj instanceof bk.d) {
            return 12;
        }
        if (obj instanceof bk.e) {
            return 13;
        }
        if (obj instanceof bk.f) {
            return 14;
        }
        if (obj instanceof bk.g) {
            return 15;
        }
        if (obj instanceof bk.h) {
            return 16;
        }
        if (obj instanceof bk.i) {
            return 17;
        }
        if (obj instanceof bk.j) {
            return 18;
        }
        if (obj instanceof bk.k) {
            return 19;
        }
        if (obj instanceof bk.m) {
            return 20;
        }
        if (obj instanceof bk.n) {
            return 21;
        }
        return obj instanceof bk.o ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof mj.e) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        return (obj instanceof List) && (!(obj instanceof dk.a) || (obj instanceof dk.d));
    }

    public static boolean m(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof dk.a) || (obj instanceof dk.e));
    }

    public static <T extends Throwable> T n(T t10) {
        return (T) p.r(t10, x.class.getName());
    }

    public static void p(Object obj, String str) {
        q((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }
}
