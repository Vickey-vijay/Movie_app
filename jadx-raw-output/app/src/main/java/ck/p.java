package ck;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: compiled from: Intrinsics.java */
/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: compiled from: Intrinsics.java */
    public static class a {
    }

    public static boolean b(Double d10, Double d11) {
        if (d10 == null) {
            if (d11 == null) {
                return true;
            }
        } else if (d11 != null && d10.doubleValue() == d11.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean d(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 == null) {
                return true;
            }
        } else if (f11 != null && f10.floatValue() == f11.floatValue()) {
            return true;
        }
        return false;
    }

    public static int l(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int m(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static void A(String str) {
        throw ((UninitializedPropertyAccessException) q(new UninitializedPropertyAccessException(str)));
    }

    public static void B(String str) {
        A("lateinit property " + str + " has not been initialized");
    }

    public static boolean a(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    public static boolean c(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) q(new IllegalStateException(str + " must not be null")));
    }

    public static void g(Object obj) {
        if (obj == null) {
            t();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) q(new NullPointerException(str + " must not be null")));
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            x(str);
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            w(str);
        }
    }

    public static <T extends Throwable> T q(T t10) {
        return (T) r(t10, p.class.getName());
    }

    public static String s(String str, Object obj) {
        return str + obj;
    }

    public static void t() {
        throw ((NullPointerException) q(new NullPointerException()));
    }

    public static void u(String str) {
        throw ((NullPointerException) q(new NullPointerException(str)));
    }

    public static void v() {
        throw ((KotlinNullPointerException) q(new KotlinNullPointerException()));
    }

    public static void w(String str) {
        throw ((IllegalArgumentException) q(new IllegalArgumentException(n(str))));
    }

    public static void x(String str) {
        throw ((NullPointerException) q(new NullPointerException(n(str))));
    }

    public static void y() {
        z("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void z(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static String n(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = p.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void o() {
        y();
    }

    public static void p(int i10, String str) {
        y();
    }

    public static <T extends Throwable> T r(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }
}
