package bl;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m1 {
    public static final Object a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField(VastTagName.COMPANION);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> xk.b<T> b(jk.c<T> cVar) {
        ck.p.j(cVar, "<this>");
        return d(cVar, new xk.b[0]);
    }

    public static final <T> xk.b<T> c(Class<T> cls, xk.b<Object>... bVarArr) throws IllegalAccessException, InvocationTargetException {
        xk.b<T> bVar;
        Field field;
        xk.b<T> bVarG;
        ck.p.j(cls, "<this>");
        ck.p.j(bVarArr, "args");
        if (cls.isEnum() && i(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (bVarG = g(cls)) != null) {
            return bVarG;
        }
        xk.b<T> bVarH = h(cls, (xk.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (bVarH != null) {
            return bVarH;
        }
        xk.b<T> bVarF = f(cls);
        if (bVarF != null) {
            return bVarF;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            ck.p.i(declaredClasses, "declaredClasses");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (!z10) {
                        break;
                    }
                    break;
                }
                Class<?> cls3 = declaredClasses[i10];
                if (ck.p.e(cls3.getSimpleName(), "$serializer")) {
                    if (!z10) {
                        z10 = true;
                        cls2 = cls3;
                    }
                }
                i10++;
                cls2 = null;
                break;
            }
            Class<?> cls4 = cls2;
            Object obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
            bVar = obj instanceof xk.b ? (xk.b) obj : null;
        } catch (NoSuchFieldException unused) {
        }
        if (bVar != null) {
            return bVar;
        }
        if (j(cls)) {
            return new PolymorphicSerializer(ak.a.c(cls));
        }
        return null;
    }

    public static final <T> xk.b<T> d(jk.c<T> cVar, xk.b<Object>... bVarArr) {
        ck.p.j(cVar, "<this>");
        ck.p.j(bVarArr, "args");
        return c(ak.a.a(cVar), (xk.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final <T> xk.b<T> g(Class<T> cls) {
        xk.f fVar = (xk.f) cls.getAnnotation(xk.f.class);
        if (fVar == null || ck.p.e(ck.s.b(fVar.with()), ck.s.b(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer(ak.a.c(cls));
        }
        return null;
    }

    public static final <T> boolean i(Class<T> cls) {
        return cls.getAnnotation(xk.f.class) == null && cls.getAnnotation(xk.c.class) == null;
    }

    public static final <T> boolean j(Class<T> cls) {
        if (cls.getAnnotation(xk.c.class) != null) {
            return true;
        }
        xk.f fVar = (xk.f) cls.getAnnotation(xk.f.class);
        return fVar != null && ck.p.e(ck.s.b(fVar.with()), ck.s.b(PolymorphicSerializer.class));
    }

    public static final boolean k(jk.c<Object> cVar) {
        ck.p.j(cVar, "rootClass");
        return ak.a.a(cVar).isArray();
    }

    public static final Void l(jk.c<?> cVar) {
        ck.p.j(cVar, "<this>");
        n1.f(cVar);
        throw new KotlinNothingValueException();
    }

    public static final <T, E extends T> E[] m(ArrayList<E> arrayList, jk.c<T> cVar) {
        ck.p.j(arrayList, "<this>");
        ck.p.j(cVar, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) ak.a.a(cVar), arrayList.size());
        ck.p.h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        ck.p.i(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }

    public static final <T> xk.b<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        ck.p.i(canonicalName, "canonicalName");
        ck.p.h(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    public static final <T> xk.b<T> f(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        boolean z10;
        boolean z11;
        boolean z12;
        Field[] declaredFields = cls.getDeclaredFields();
        ck.p.i(declaredFields, "declaredFields");
        int length = declaredFields.length;
        int i10 = 0;
        boolean z13 = false;
        Field field = null;
        while (true) {
            if (i10 < length) {
                Field field2 = declaredFields[i10];
                if (ck.p.e(field2.getName(), "INSTANCE") && ck.p.e(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (!z13) {
                        z13 = true;
                        field = field2;
                    }
                }
                i10++;
            } else {
                if (!z13) {
                    break;
                }
                break;
            }
            field = null;
            break;
        }
        Field field3 = field;
        if (field3 == null) {
            return null;
        }
        Object obj = field3.get(null);
        Method[] methods = cls.getMethods();
        ck.p.i(methods, "methods");
        int length2 = methods.length;
        int i11 = 0;
        boolean z14 = false;
        Method method = null;
        while (true) {
            if (i11 < length2) {
                Method method2 = methods[i11];
                if (ck.p.e(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    ck.p.i(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && ck.p.e(method2.getReturnType(), xk.b.class)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (!z14) {
                        z14 = true;
                        method = method2;
                    }
                }
                i11++;
            } else {
                if (!z14) {
                    break;
                }
                break;
            }
            method = null;
            break;
        }
        Method method3 = method;
        if (method3 == null) {
            return null;
        }
        Object objInvoke = method3.invoke(obj, new Object[0]);
        if (!(objInvoke instanceof xk.b)) {
            return null;
        }
        return (xk.b) objInvoke;
    }

    public static final <T> xk.b<T> h(Class<?> cls, xk.b<Object>... bVarArr) throws IllegalAccessException, InvocationTargetException {
        boolean z10;
        Class[] clsArr;
        Object objA = a(cls);
        if (objA == null) {
            return null;
        }
        try {
            if (bVarArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = xk.b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = objA.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(objA, Arrays.copyOf(bVarArr, bVarArr.length));
            if (!(objInvoke instanceof xk.b)) {
                return null;
            }
            return (xk.b) objInvoke;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e10.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e10;
        }
    }
}
