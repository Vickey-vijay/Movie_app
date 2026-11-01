package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: JavaCalls.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f6461a;

    /* JADX INFO: renamed from: com.apm.insight.h.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JavaCalls.java */
    public static class C0026a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f6462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f6463b;
    }

    static {
        HashMap map = new HashMap();
        f6461a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        map.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        map.put(Long.class, cls4);
        map.put(Double.class, Double.TYPE);
        map.put(cls, cls);
        Class cls5 = Byte.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        map.put(cls7, cls7);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        Method method;
        boolean z10;
        try {
            Class<?> cls = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int i10 = 0; i10 < 4; i10++) {
                Object obj = objArr[i10];
                clsArr[i10] = (obj == null || !(obj instanceof C0026a)) ? obj == null ? null : obj.getClass() : ((C0026a) obj).f6462a;
            }
            while (true) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i11];
                    if (method.getName().equals(str2)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes == null || parameterTypes.length != 4) {
                            z10 = false;
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= parameterTypes.length) {
                                z10 = true;
                                break;
                            }
                            if (!parameterTypes[i12].isAssignableFrom(clsArr[i12])) {
                                Map<Class<?>, Class<?>> map = f6461a;
                                if (map.containsKey(parameterTypes[i12]) && map.get(parameterTypes[i12]).equals(map.get(clsArr[i12]))) {
                                }
                                z10 = false;
                                break;
                            }
                            i12++;
                        }
                        if (z10) {
                            break;
                        }
                    }
                    i11++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object[] objArr2 = new Object[4];
                    for (int i13 = 0; i13 < 4; i13++) {
                        Object obj2 = objArr[i13];
                        if (obj2 == null || !(obj2 instanceof C0026a)) {
                            objArr2[i13] = obj2;
                        } else {
                            objArr2[i13] = ((C0026a) obj2).f6463b;
                        }
                    }
                    return (T) method.invoke(null, objArr2);
                }
                if (cls.getSuperclass() == null) {
                    throw new NoSuchMethodException();
                }
                cls = cls.getSuperclass();
            }
        } catch (Exception e10) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e10);
            return null;
        }
    }
}
