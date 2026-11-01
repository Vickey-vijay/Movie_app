package xm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: TypeUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zm.c f75064a = zm.b.a(p.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f75065b = 13;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f75066c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<String, Class<?>> f75067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap<Class<?>, String> f75068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<Class<?>, Method> f75069f;

    public static String h(byte b10) {
        return i(new byte[]{b10}, 0, 1);
    }

    static {
        HashMap<String, Class<?>> map = new HashMap<>();
        f75067d = map;
        Class<?> cls = Boolean.TYPE;
        map.put(TypedValues.Custom.S_BOOLEAN, cls);
        map.put("byte", Byte.TYPE);
        map.put("char", Character.TYPE);
        map.put("double", Double.TYPE);
        Class<?> cls2 = Float.TYPE;
        map.put(TypedValues.Custom.S_FLOAT, cls2);
        Class<?> cls3 = Integer.TYPE;
        map.put(ImpressionLog.f43647w, cls3);
        Class<?> cls4 = Long.TYPE;
        map.put("long", cls4);
        map.put("short", Short.TYPE);
        map.put("void", Void.TYPE);
        map.put("java.lang.Boolean.TYPE", cls);
        map.put("java.lang.Byte.TYPE", Byte.TYPE);
        map.put("java.lang.Character.TYPE", Character.TYPE);
        map.put("java.lang.Double.TYPE", Double.TYPE);
        map.put("java.lang.Float.TYPE", cls2);
        map.put("java.lang.Integer.TYPE", cls3);
        map.put("java.lang.Long.TYPE", cls4);
        map.put("java.lang.Short.TYPE", Short.TYPE);
        map.put("java.lang.Void.TYPE", Void.TYPE);
        map.put("java.lang.Boolean", Boolean.class);
        map.put("java.lang.Byte", Byte.class);
        map.put("java.lang.Character", Character.class);
        map.put("java.lang.Double", Double.class);
        map.put("java.lang.Float", Float.class);
        map.put("java.lang.Integer", Integer.class);
        map.put("java.lang.Long", Long.class);
        map.put("java.lang.Short", Short.class);
        map.put("Boolean", Boolean.class);
        map.put("Byte", Byte.class);
        map.put("Character", Character.class);
        map.put("Double", Double.class);
        map.put("Float", Float.class);
        map.put("Integer", Integer.class);
        map.put("Long", Long.class);
        map.put("Short", Short.class);
        map.put(null, Void.TYPE);
        map.put(TypedValues.Custom.S_STRING, String.class);
        map.put("String", String.class);
        map.put(com.safedk.android.utils.k.f45011d, String.class);
        HashMap<Class<?>, String> map2 = new HashMap<>();
        f75068e = map2;
        map2.put(cls, TypedValues.Custom.S_BOOLEAN);
        map2.put(Byte.TYPE, "byte");
        map2.put(Character.TYPE, "char");
        map2.put(Double.TYPE, "double");
        map2.put(cls2, TypedValues.Custom.S_FLOAT);
        map2.put(cls3, ImpressionLog.f43647w);
        map2.put(cls4, "long");
        map2.put(Short.TYPE, "short");
        map2.put(Void.TYPE, "void");
        map2.put(Boolean.class, "java.lang.Boolean");
        map2.put(Byte.class, "java.lang.Byte");
        map2.put(Character.class, "java.lang.Character");
        map2.put(Double.class, "java.lang.Double");
        map2.put(Float.class, "java.lang.Float");
        map2.put(Integer.class, "java.lang.Integer");
        map2.put(Long.class, "java.lang.Long");
        map2.put(Short.class, "java.lang.Short");
        map2.put(null, "void");
        map2.put(String.class, com.safedk.android.utils.k.f45011d);
        HashMap<Class<?>, Method> map3 = new HashMap<>();
        f75069f = map3;
        try {
            Class[] clsArr = {String.class};
            map3.put(cls, Boolean.class.getMethod("valueOf", clsArr));
            map3.put(Byte.TYPE, Byte.class.getMethod("valueOf", clsArr));
            map3.put(Double.TYPE, Double.class.getMethod("valueOf", clsArr));
            map3.put(cls2, Float.class.getMethod("valueOf", clsArr));
            map3.put(cls3, Integer.class.getMethod("valueOf", clsArr));
            map3.put(cls4, Long.class.getMethod("valueOf", clsArr));
            map3.put(Short.TYPE, Short.class.getMethod("valueOf", clsArr));
            map3.put(Boolean.class, Boolean.class.getMethod("valueOf", clsArr));
            map3.put(Byte.class, Byte.class.getMethod("valueOf", clsArr));
            map3.put(Double.class, Double.class.getMethod("valueOf", clsArr));
            map3.put(Float.class, Float.class.getMethod("valueOf", clsArr));
            map3.put(Integer.class, Integer.class.getMethod("valueOf", clsArr));
            map3.put(Long.class, Long.class.getMethod("valueOf", clsArr));
            map3.put(Short.class, Short.class.getMethod("valueOf", clsArr));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public static <T> List<T> a(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public static byte b(byte b10) {
        byte b11 = (byte) (((b10 & 31) + ((b10 >> 6) * 25)) - 16);
        if (b11 >= 0 && b11 <= 15) {
            return b11;
        }
        throw new IllegalArgumentException("!hex " + ((int) b10));
    }

    public static int c(int i10) {
        int i11 = ((i10 & 31) + ((i10 >> 6) * 25)) - 16;
        if (i11 >= 0 && i11 <= 15) {
            return i11;
        }
        throw new NumberFormatException("!hex " + i10);
    }

    public static int e(String str, int i10, int i11, int i12) throws NumberFormatException {
        if (i11 < 0) {
            i11 = str.length() - i10;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int iC = c(str.charAt(i10 + i14));
            if (iC < 0 || iC >= i12) {
                throw new NumberFormatException(str.substring(i10, i11 + i10));
            }
            i13 = (i13 * i12) + iC;
        }
        return i13;
    }

    public static int f(byte[] bArr, int i10, int i11, int i12) throws NumberFormatException {
        int i13;
        if (i11 < 0) {
            i11 = bArr.length - i10;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            char c10 = (char) (bArr[i10 + i15] & 255);
            int i16 = c10 - '0';
            if ((i16 < 0 || i16 >= i12 || i16 >= 10) && ((i16 = (i13 = c10 + '\n') - 65) < 10 || i16 >= i12)) {
                i16 = i13 - 97;
            }
            if (i16 < 0 || i16 >= i12) {
                throw new NumberFormatException(new String(bArr, i10, i11));
            }
            i14 = (i14 * i12) + i16;
        }
        return i14;
    }

    public static void g(byte b10, Appendable appendable) {
        int i10 = ((b10 & 240) >> 4) & 15;
        int i11 = 55;
        try {
            appendable.append((char) ((i10 > 9 ? 55 : 48) + i10));
            int i12 = b10 & 15;
            if (i12 <= 9) {
                i11 = 48;
            }
            appendable.append((char) (i11 + i12));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String i(byte[] bArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            int i13 = bArr[i12] & 255;
            int i14 = ((i13 / 16) % 16) + 48;
            if (i14 > 57) {
                i14 = ((i14 - 48) - 10) + 65;
            }
            sb2.append((char) i14);
            int i15 = (i13 % 16) + 48;
            if (i15 > 57) {
                i15 = ((i15 - 48) - 10) + 97;
            }
            sb2.append((char) i15);
        }
        return sb2.toString();
    }

    public static String j(byte[] bArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 : bArr) {
            int i12 = i11 & 255;
            int i13 = ((i12 / i10) % i10) + 48;
            if (i13 > 57) {
                i13 = ((i13 - 48) - 10) + 97;
            }
            sb2.append((char) i13);
            int i14 = (i12 % i10) + 48;
            if (i14 > 57) {
                i14 = ((i14 - 48) - 10) + 97;
            }
            sb2.append((char) i14);
        }
        return sb2.toString();
    }

    public static Object call(Class<?> cls, String str, Object obj, Object[] objArr) throws NoSuchMethodException, InvocationTargetException {
        boolean z10;
        Method[] methods = cls.getMethods();
        for (int i10 = 0; methods != null && i10 < methods.length; i10++) {
            if (methods[i10].getName().equals(str) && methods[i10].getParameterTypes().length == objArr.length) {
                boolean zIsStatic = Modifier.isStatic(methods[i10].getModifiers());
                if (obj == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zIsStatic == z10 && (obj != null || methods[i10].getDeclaringClass() == cls)) {
                    try {
                        return methods[i10].invoke(obj, objArr);
                    } catch (IllegalAccessException e10) {
                        f75064a.h(e10);
                    } catch (IllegalArgumentException e11) {
                        f75064a.h(e11);
                    }
                }
            }
        }
        throw new NoSuchMethodException(str);
    }

    public static byte[] d(String str, int i10) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i11 = 0; i11 < str.length(); i11 += 2) {
            bArr[i11 / 2] = (byte) e(str, i11, 2, i10);
        }
        return bArr;
    }
}
