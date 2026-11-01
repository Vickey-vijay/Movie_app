package zb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ReflectUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static Method a(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object b(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Method methodA = a(obj, str, clsArr);
        if (methodA != null) {
            try {
                methodA.setAccessible(true);
                return methodA.invoke(obj, objArr);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return null;
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
                return null;
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
