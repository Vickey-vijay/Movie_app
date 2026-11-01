package io.bidmachine.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
public class ReflectionUtils {
    @Nullable
    public static Object findValue(@NonNull Object obj, @NonNull String str) {
        return findValue(obj.getClass(), str, obj);
    }

    @Nullable
    public static Object findValueByPath(@NonNull Object obj, @NonNull String[] strArr) {
        if (strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            obj = findValue(obj, str);
            if (obj == null) {
                return null;
            }
        }
        return obj;
    }

    @Nullable
    public static Object findValue(@NonNull Class<?> cls, @NonNull String str, @Nullable Object obj) {
        try {
            return getValue(cls, str, obj);
        } catch (Throwable unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return findValue(superclass, str, obj);
        }
    }

    @Nullable
    public static Object getValue(@NonNull Class<?> cls, @NonNull String str, @Nullable Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
