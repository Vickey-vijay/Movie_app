package so;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: Reflections.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {
    public static Method g(Class cls, String str) {
        for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredMethod(str, new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new IllegalArgumentException("No such method: " + cls.getName() + '.' + str);
    }

    public static String l(String str, Object... objArr) {
        if (objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            sb2.append(str);
            if (obj == null) {
                sb2.append("null");
            } else {
                sb2.append(obj.getClass().getName());
            }
        }
        return sb2.substring(str.length());
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static Class<?> c(Type type) {
        Class<?> clsC;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return c(((ParameterizedType) type).getRawType());
        }
        if (!(type instanceof GenericArrayType) || (clsC = c(((GenericArrayType) type).getGenericComponentType())) == null) {
            return null;
        }
        return Array.newInstance(clsC, 0).getClass();
    }

    public static Field d(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static List<Field> e(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(cls2)) {
                    arrayList.add(field);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static Method f(Class cls, String str) {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                String name = method.getName();
                if (method.getParameterTypes().length == 0) {
                    if (name.startsWith("get")) {
                        if (a(name.substring(3)).equals(str)) {
                            return method;
                        }
                    } else if (name.startsWith("is") && a(name.substring(2)).equals(str)) {
                        return method;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static String h(String str) {
        if (str.startsWith("get")) {
            return a(str.substring(3));
        }
        if (str.startsWith("is")) {
            return a(str.substring(2));
        }
        if (str.startsWith("set")) {
            return a(str.substring(3));
        }
        return null;
    }

    public static List<Method> i(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(cls2)) {
                    arrayList.add(method);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<Class<?>> j(Class<T> cls, Class<? extends T> cls2) {
        int i10;
        HashMap map = new HashMap();
        while (true) {
            i10 = 0;
            if (c(cls2).equals(cls)) {
                break;
            }
            if (cls2 instanceof Class) {
                cls2 = ((Class) cls2).getGenericSuperclass();
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) cls2;
                Class cls3 = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                TypeVariable<Class<T>>[] typeParameters = cls3.getTypeParameters();
                while (i10 < actualTypeArguments.length) {
                    map.put(typeParameters[i10], actualTypeArguments[i10]);
                    i10++;
                }
                if (!cls3.equals(cls)) {
                    cls2 = (Class<? extends T>) cls3.getGenericSuperclass();
                }
            }
        }
        Type[] typeParameters2 = cls2 instanceof Class ? ((Class) cls2).getTypeParameters() : ((ParameterizedType) cls2).getActualTypeArguments();
        ArrayList arrayList = new ArrayList();
        int length = typeParameters2.length;
        while (i10 < length) {
            Type type = typeParameters2[i10];
            while (map.containsKey(type)) {
                type = (Type) map.get(type);
            }
            arrayList.add(c(type));
            i10++;
        }
        return arrayList;
    }

    public static String m(Member member) {
        return n(member.getDeclaringClass().getName()) + '.' + member.getName();
    }

    public static String n(String str) {
        return o(str, '.');
    }

    public static Object b(Field field, Object obj) throws Exception {
        boolean zIsAccessible = field.isAccessible();
        try {
            try {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                field.setAccessible(zIsAccessible);
                return obj2;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Could not get field value by reflection: " + m(field) + " on: " + obj.getClass().getName(), e10);
            }
        } catch (Throwable th2) {
            field.setAccessible(zIsAccessible);
            throw th2;
        }
    }

    public static Object k(Method method, Object obj, Object... objArr) throws Exception {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalArgumentException e10) {
            String str = "Could not invoke method by reflection: " + m(method);
            if (objArr != null && objArr.length > 0) {
                str = str + " with parameters: (" + l(", ", objArr) + ')';
            }
            throw new IllegalArgumentException(str + " on: " + obj.getClass().getName(), e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof Exception) {
                throw ((Exception) e11.getCause());
            }
            throw e11;
        }
    }

    public static String o(String str, char c10) {
        return str.substring(str.lastIndexOf(c10) + 1, str.length());
    }
}
