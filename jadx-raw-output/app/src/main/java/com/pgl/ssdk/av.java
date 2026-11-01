package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f43254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f43255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f43256c;

    public static Object a(Object obj, Class cls, String str, Object obj2) {
        try {
            Field fieldA = a(cls, str);
            if (fieldA == null) {
                return obj2;
            }
            fieldA.setAccessible(true);
            return fieldA.get(obj);
        } catch (Throwable unused) {
            return obj2;
        }
    }

    static {
        try {
            f43254a = Class.class.getDeclaredMethod("forName", String.class);
            f43255b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f43256c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    public static Field a(Class cls, String str) {
        if (!a()) {
            return null;
        }
        try {
            Field field = (Field) f43256c.invoke(cls, str);
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
            return field;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        if (!a()) {
            return null;
        }
        try {
            Method method = (Method) f43255b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
            } catch (Throwable unused) {
            }
            return method;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Method methodA = a(cls, str, clsArr);
            if (methodA != null) {
                return methodA.invoke(obj, objArr);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static boolean a() {
        return (f43254a == null || f43255b == null || f43256c == null) ? false : true;
    }
}
