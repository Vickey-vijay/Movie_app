package io.bidmachine.util;

import androidx.core.graphics.drawable.IconCompat;
import ck.p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: ReflectionUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001aI\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\t\u001a9\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\n\u001a,\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a'\u0010\u000f\u001a\u00020\f*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u0004\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004\u001a$\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u0016\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u001a$\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u001aI\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\t\u001a\u0016\u0010\u001a\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u0004\u001a\u001e\u0010\u001b\u001a\u00020\f*\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a,\u0010\u001c\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¨\u0006\u001d"}, d2 = {"findAndInvokeMethod", "", "Ljava/lang/Class;", "methodName", "", "parameterTypes", "", "parameterObjects", IconCompat.EXTRA_OBJ, "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "findAndSetValue", "", "fieldName", "newValue", "findAndSetValueByPath", "path", "(Ljava/lang/Object;[Ljava/lang/String;Ljava/lang/Object;)Z", "findField", "Ljava/lang/reflect/Field;", "findValue", "findValueByPath", "(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;", "getSafely", "getValue", "invokeMethod", "peekField", "setSafely", "setValue", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ReflectionUtilsKt {
    public static final Object findAndInvokeMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object obj) {
        p.j(cls, "<this>");
        p.j(str, "methodName");
        p.j(clsArr, "parameterTypes");
        p.j(objArr, "parameterObjects");
        try {
            return invokeMethod(cls, str, clsArr, objArr, obj);
        } catch (Throwable unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass != null) {
                return findAndInvokeMethod(superclass, str, clsArr, objArr, obj);
            }
            return null;
        }
    }

    public static final boolean findAndSetValue(Class<?> cls, String str, Object obj, Object obj2) {
        p.j(cls, "<this>");
        p.j(str, "fieldName");
        Field fieldFindField = findField(cls, str);
        return fieldFindField != null && setSafely(fieldFindField, obj2, obj);
    }

    public static final Field findField(Class<?> cls, String str) {
        Field fieldPeekField;
        p.j(cls, "<this>");
        p.j(str, "fieldName");
        try {
            fieldPeekField = peekField(cls, str);
        } catch (Throwable unused) {
            fieldPeekField = null;
        }
        if (fieldPeekField != null) {
            return fieldPeekField;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return findField((Class<?>) superclass, str);
        }
        return null;
    }

    public static final Object findValue(Class<?> cls, String str, Object obj) {
        p.j(cls, "<this>");
        p.j(str, "fieldName");
        Field fieldFindField = findField(cls, str);
        if (fieldFindField != null) {
            return getSafely(fieldFindField, obj);
        }
        return null;
    }

    public static /* synthetic */ Object findAndInvokeMethod$default(Class cls, String str, Class[] clsArr, Object[] objArr, Object obj, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            obj = null;
        }
        return findAndInvokeMethod(cls, str, clsArr, objArr, obj);
    }

    public static final boolean findAndSetValue(Object obj, String str, Object obj2) {
        p.j(obj, "<this>");
        p.j(str, "fieldName");
        return findAndSetValue(obj.getClass(), str, obj2, obj);
    }

    public static /* synthetic */ boolean findAndSetValue$default(Class cls, String str, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        return findAndSetValue(cls, str, obj, obj2);
    }

    public static final boolean findAndSetValueByPath(Object obj, String[] strArr, Object obj2) {
        p.j(obj, "<this>");
        p.j(strArr, "path");
        if (strArr.length == 0) {
            return false;
        }
        Field fieldFindField = null;
        for (String str : strArr) {
            fieldFindField = findField(obj, str);
            if (fieldFindField == null || (obj = getSafely(fieldFindField, obj)) == null) {
                return false;
            }
        }
        return fieldFindField != null && setSafely(fieldFindField, obj, obj2);
    }

    public static final Object findValue(Object obj, String str) {
        p.j(obj, "<this>");
        p.j(str, "fieldName");
        return findValue(obj.getClass(), str, obj);
    }

    public static /* synthetic */ Object findValue$default(Class cls, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return findValue(cls, str, obj);
    }

    public static final Object findValueByPath(Object obj, String[] strArr) {
        p.j(obj, "<this>");
        p.j(strArr, "path");
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

    public static final Object getSafely(Field field, Object obj) {
        p.j(field, "<this>");
        try {
            return field.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Object getValue(Class<?> cls, String str, Object obj) throws NoSuchFieldException, SecurityException {
        p.j(cls, "<this>");
        p.j(str, "fieldName");
        return getSafely(peekField(cls, str), obj);
    }

    public static /* synthetic */ Object getValue$default(Class cls, String str, Object obj, int i10, Object obj2) throws NoSuchFieldException, SecurityException {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return getValue(cls, str, obj);
    }

    public static final Object invokeMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object obj) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        p.j(cls, "<this>");
        p.j(str, "methodName");
        p.j(clsArr, "parameterTypes");
        p.j(objArr, "parameterObjects");
        Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public static /* synthetic */ Object invokeMethod$default(Class cls, String str, Class[] clsArr, Object[] objArr, Object obj, int i10, Object obj2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if ((i10 & 8) != 0) {
            obj = null;
        }
        return invokeMethod(cls, str, clsArr, objArr, obj);
    }

    public static final Field peekField(Class<?> cls, String str) throws NoSuchFieldException, SecurityException {
        p.j(cls, "<this>");
        p.j(str, "fieldName");
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        p.i(declaredField, "getDeclaredField(fieldNa…isAccessible = true\n    }");
        return declaredField;
    }

    public static final boolean setSafely(Field field, Object obj, Object obj2) {
        Boolean bool;
        p.j(field, "<this>");
        try {
            field.set(obj, obj2);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.e(bool, Boolean.TRUE);
    }

    public static final boolean setValue(Class<?> cls, String str, Object obj, Object obj2) throws NoSuchFieldException, SecurityException {
        p.j(cls, "<this>");
        p.j(str, "fieldName");
        return setSafely(peekField(cls, str), obj2, obj);
    }

    public static /* synthetic */ boolean setValue$default(Class cls, String str, Object obj, Object obj2, int i10, Object obj3) throws NoSuchFieldException, SecurityException {
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        return setValue(cls, str, obj, obj2);
    }

    public static final Object findAndInvokeMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        p.j(obj, "<this>");
        p.j(str, "methodName");
        p.j(clsArr, "parameterTypes");
        p.j(objArr, "parameterObjects");
        return findAndInvokeMethod(obj.getClass(), str, clsArr, objArr, obj);
    }

    public static final Field findField(Object obj, String str) {
        p.j(obj, "<this>");
        p.j(str, "fieldName");
        return findField(obj.getClass(), str);
    }
}
