package sg.bigo.ads.common.r;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static Object a(Object obj, String str) {
        Field field;
        try {
            try {
                field = obj.getClass().getDeclaredField(str);
            } catch (Exception unused) {
                field = obj.getClass().getField(str);
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            sg.bigo.ads.common.t.a.a(0, "ReflectionHelper", Log.getStackTraceString(e10));
            return null;
        }
    }

    public static Object a(Object obj, String str, Class cls) {
        boolean z10;
        if (obj == null) {
            return null;
        }
        for (Method method : obj.getClass().getMethods()) {
            if (TextUtils.equals(str, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (!k.a((Object[]) null)) {
                    throw null;
                }
                if ((k.a(parameterTypes) ? 0 : parameterTypes.length) != 0) {
                    z10 = false;
                    break;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= 0) {
                        z10 = true;
                        break;
                    }
                    if (!Objects.isNull(parameterTypes[i10])) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    Class<?> returnType = method.getReturnType();
                    if ((a(cls) && a(returnType)) || returnType == cls) {
                        try {
                            method.setAccessible(true);
                            return method.invoke(obj, null);
                        } catch (Exception e10) {
                            sg.bigo.ads.common.t.a.a(0, "ReflectionHelper", Log.getStackTraceString(e10));
                            return null;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @Nullable
    public static <T> T a(String str, Class<T> cls) {
        try {
            Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(new Object[0]);
        } catch (Exception unused) {
            sg.bigo.ads.common.t.a.a(0, 5, "ReflectionHelper", "Cannot find class: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static boolean a(Class cls) {
        return cls == null || Void.class == cls;
    }

    public static boolean a(Class<?> cls, String... strArr) {
        if (k.a(strArr)) {
            return false;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            Class<?> cls2 = null;
            try {
                cls2 = Class.forName(strArr[i10]);
            } catch (Exception unused) {
            }
            if (cls2 != null && cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
