package com.inmobi.media;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3029ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24819a = 0;

    public static JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            cls.getSimpleName();
            Class superclass = cls.getSuperclass();
            if (superclass == null || ck.p.e(Object.class, superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                ck.p.g(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator itA = ck.b.a(cls.getDeclaredFields());
            while (itA.hasNext()) {
                Field field = (Field) itA.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                        ck.p.g(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !ck.p.e(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (ck.p.e(cls2, type) || ck.p.e(cls2, type) || ck.p.e(Integer.class, type)) {
                                Object obj2 = field.get(obj);
                                ck.p.h(obj2, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj2).intValue());
                            } else {
                                Class cls3 = Boolean.TYPE;
                                if (ck.p.e(cls3, type) || ck.p.e(cls3, type) || ck.p.e(Boolean.class, type)) {
                                    Object obj3 = field.get(obj);
                                    ck.p.h(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj3).booleanValue());
                                } else {
                                    Class cls4 = Double.TYPE;
                                    if (ck.p.e(cls4, type) || ck.p.e(cls4, type) || ck.p.e(Double.class, type)) {
                                        Object obj4 = field.get(obj);
                                        ck.p.h(obj4, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj4).doubleValue());
                                    } else {
                                        Class cls5 = Float.TYPE;
                                        if (ck.p.e(cls5, type) || ck.p.e(cls5, type) || ck.p.e(Float.class, type)) {
                                            Object obj5 = field.get(obj);
                                            ck.p.h(obj5, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj5);
                                        } else {
                                            Class cls6 = Long.TYPE;
                                            if (ck.p.e(cls6, type) || ck.p.e(cls6, type) || ck.p.e(Long.class, type)) {
                                                Object obj6 = field.get(obj);
                                                ck.p.h(obj6, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj6).longValue());
                                            } else {
                                                Class cls7 = Byte.TYPE;
                                                if (ck.p.e(cls7, type) || ck.p.e(cls7, type) || ck.p.e(Byte.class, type)) {
                                                    Object obj7 = field.get(obj);
                                                    ck.p.h(obj7, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj7);
                                                } else if (ck.p.e(String.class, type) || ck.p.e(JSONObject.class, type) || ck.p.e(JSONArray.class, type)) {
                                                    jSONObject.put(name, field.get(obj));
                                                } else {
                                                    Class cls8 = Short.TYPE;
                                                    if (ck.p.e(cls8, type) || ck.p.e(cls8, type) || ck.p.e(Short.class, type)) {
                                                        Object obj8 = field.get(obj);
                                                        ck.p.h(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                        jSONObject.put(name, (Short) obj8);
                                                    } else if (Map.class.isAssignableFrom(type)) {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        Object obj9 = field.get(obj);
                                                        if (obj9 != null) {
                                                            Map map = (Map) obj9;
                                                            for (Object obj10 : map.keySet()) {
                                                                Object objA = map.get(obj10);
                                                                if (objA != null) {
                                                                    if (!a(objA.getClass())) {
                                                                        objA = a(objA, objA.getClass());
                                                                    }
                                                                    jSONObject2.put(String.valueOf(obj10), objA);
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONObject2);
                                                    } else if (List.class.isAssignableFrom(type)) {
                                                        JSONArray jSONArray = new JSONArray();
                                                        Object obj11 = field.get(obj);
                                                        if (obj11 != null) {
                                                            for (Object obj12 : (List) obj11) {
                                                                if (obj12 != null) {
                                                                    Object objA2 = a(obj12.getClass()) ? obj12 : a(obj12, obj12.getClass());
                                                                    if (objA2 == null) {
                                                                        obj12.getClass().toString();
                                                                    } else {
                                                                        jSONArray.put(objA2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray);
                                                    } else if (type.isArray()) {
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        Object obj13 = field.get(obj);
                                                        if (obj13 != null) {
                                                            int length = Array.getLength(obj13);
                                                            for (int i10 = 0; i10 < length; i10++) {
                                                                Object obj14 = Array.get(obj13, i10);
                                                                if (obj14 != null) {
                                                                    Object objA3 = a(obj14.getClass()) ? obj14 : a(obj14, obj14.getClass());
                                                                    if (objA3 == null) {
                                                                        obj14.getClass().toString();
                                                                    } else {
                                                                        jSONArray2.put(objA3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray2);
                                                    } else {
                                                        Object obj15 = field.get(obj);
                                                        if (obj15 != null) {
                                                            jSONObject.put(name, a(obj15, obj15.getClass()));
                                                        } else {
                                                            mj.r rVar = mj.r.f64562a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public static void b(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        double d10 = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Double.TYPE) {
                field.getName();
                field.setDouble(obj, d10);
            } else {
                field.getName();
                field.set(obj, Double.valueOf(d10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void c(Field field, Object obj, JSONObject jSONObject) {
        float f10 = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Float.TYPE) {
                field.getName();
                field.setFloat(obj, f10);
            } else {
                field.getName();
                field.set(obj, Float.valueOf(f10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void d(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Integer.TYPE) {
                field.getName();
                field.setInt(obj, i10);
            } else {
                field.getName();
                field.set(obj, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void e(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        long j10 = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == Long.TYPE) {
                field.getName();
                field.setLong(obj, j10);
            } else {
                field.getName();
                field.set(obj, Long.valueOf(j10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void f(Field field, Object obj, JSONObject jSONObject) {
        short s10 = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Short.TYPE) {
                field.getName();
                field.setShort(obj, s10);
            } else {
                field.getName();
                field.set(obj, Short.valueOf(s10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static Object a(JSONObject jSONObject, Class cls, Object obj, Object obj2) throws JSONException, IllegalAccessException {
        Constructor<?> constructor;
        Object objValueOf;
        Object objValueOf2;
        List linkedList;
        cls.getSimpleName();
        cls.toString();
        Objects.toString(obj);
        if (obj2 == null) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                ck.p.g(declaredConstructors);
                if (declaredConstructors.length == 0) {
                    obj2 = cls.newInstance();
                } else {
                    int length = declaredConstructors.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = declaredConstructors[i10];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        ck.p.i(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            break;
                        }
                        i10++;
                    }
                    if (constructor == null) {
                        constructor = declaredConstructors[0];
                    }
                    constructor.setAccessible(true);
                    int length2 = constructor.getParameterTypes().length;
                    if (length2 == 0) {
                        obj2 = constructor.newInstance(new Object[0]);
                    } else {
                        Object[] objArr = new Object[length2];
                        Iterator itA = ck.b.a(constructor.getParameterTypes());
                        int i11 = 0;
                        while (itA.hasNext()) {
                            Class cls2 = (Class) itA.next();
                            int i12 = i11 + 1;
                            ck.p.g(cls2);
                            if (!ck.p.e(Integer.TYPE, cls2) && !ck.p.e(Long.TYPE, cls2)) {
                                if (ck.p.e(Boolean.TYPE, cls2)) {
                                    objValueOf = Boolean.FALSE;
                                } else {
                                    objValueOf = (ck.p.e(Double.TYPE, cls2) || ck.p.e(Float.TYPE, cls2)) ? Double.valueOf(0.0d) : null;
                                }
                            } else {
                                objValueOf = 0;
                            }
                            objArr[i11] = objValueOf;
                            i11 = i12;
                        }
                        obj2 = constructor.newInstance(Arrays.copyOf(objArr, length2));
                    }
                }
            } catch (Exception e10) {
                e10.getMessage();
                cls.toString();
                return null;
            }
        }
        if (cls.getSuperclass() != null) {
            Class superclass = cls.getSuperclass();
            superclass.getSimpleName();
            ck.p.g(superclass);
            obj2 = a(jSONObject, superclass, obj, obj2);
        }
        Iterator itA2 = ck.b.a(cls.getDeclaredFields());
        while (itA2.hasNext()) {
            Field field = (Field) itA2.next();
            field.setAccessible(true);
            String name = field.getName();
            if (!ck.p.e(name, "shadow$_klass_") && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                if (jSONObject.has(name) && !jSONObject.isNull(name)) {
                    Class<?> type = field.getType();
                    Class cls3 = Integer.TYPE;
                    if (!ck.p.e(cls3, type) && !ck.p.e(cls3, type) && !ck.p.e(Integer.class, type)) {
                        Class cls4 = Boolean.TYPE;
                        if (!ck.p.e(cls4, type) && !ck.p.e(cls4, type) && !ck.p.e(Boolean.class, type)) {
                            Class cls5 = Double.TYPE;
                            if (!ck.p.e(cls5, type) && !ck.p.e(cls5, type) && !ck.p.e(Double.class, type)) {
                                Class cls6 = Float.TYPE;
                                if (!ck.p.e(cls6, type) && !ck.p.e(cls6, type) && !ck.p.e(Float.class, type)) {
                                    Class cls7 = Long.TYPE;
                                    if (!ck.p.e(cls7, type) && !ck.p.e(cls7, type) && !ck.p.e(Long.class, type)) {
                                        Class cls8 = Byte.TYPE;
                                        if (!ck.p.e(cls8, type) && !ck.p.e(cls8, type) && !ck.p.e(Byte.class, type)) {
                                            if (ck.p.e(String.class, type)) {
                                                field.set(obj2, jSONObject.getString(name));
                                            } else {
                                                Class cls9 = Short.TYPE;
                                                if (!ck.p.e(cls9, type) && !ck.p.e(cls9, type) && !ck.p.e(Short.class, type)) {
                                                    if (ck.p.e(JSONObject.class, type)) {
                                                        ck.p.g(field);
                                                        JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        ck.p.j(field, "<this>");
                                                        if (jSONObject2 == null) {
                                                            jSONObject2 = jSONObject3;
                                                        }
                                                        field.set(obj2, jSONObject2);
                                                    } else if (ck.p.e(JSONArray.class, type)) {
                                                        field.set(obj2, jSONObject.getJSONArray(name));
                                                    } else if (Map.class.isAssignableFrom(type)) {
                                                        JSONObject jSONObject4 = jSONObject.getJSONObject(name);
                                                        Objects.toString(jSONObject4);
                                                        HashMap map = new HashMap();
                                                        Iterator<String> itKeys = jSONObject4.keys();
                                                        while (itKeys.hasNext()) {
                                                            String next = itKeys.next();
                                                            ck.p.g(jSONObject4);
                                                            ck.p.g(next);
                                                            Type genericType = field.getGenericType();
                                                            ck.p.h(genericType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                            Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[1];
                                                            ck.p.h(type2, "null cannot be cast to non-null type java.lang.Class<*>");
                                                            Class cls10 = (Class) type2;
                                                            if (ck.p.e(Integer.TYPE, cls10)) {
                                                                objValueOf2 = Integer.valueOf(jSONObject4.getInt(next));
                                                            } else if (ck.p.e(Double.TYPE, cls10)) {
                                                                objValueOf2 = Double.valueOf(jSONObject4.getDouble(next));
                                                            } else if (ck.p.e(Float.TYPE, cls10)) {
                                                                objValueOf2 = Float.valueOf((float) jSONObject4.getDouble(next));
                                                            } else if (ck.p.e(Long.TYPE, cls10)) {
                                                                objValueOf2 = Long.valueOf(jSONObject4.getLong(next));
                                                            } else if (ck.p.e(Byte.TYPE, cls10)) {
                                                                objValueOf2 = Byte.valueOf((byte) jSONObject4.getInt(next));
                                                            } else if (ck.p.e(Short.TYPE, cls10)) {
                                                                objValueOf2 = Short.valueOf((short) jSONObject4.getInt(next));
                                                            } else {
                                                                objValueOf2 = jSONObject4.get(next);
                                                            }
                                                            ck.p.g(objValueOf2);
                                                            if (objValueOf2 == null || !a(objValueOf2.getClass())) {
                                                                JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                                                ck.p.i(jSONObject5, "getJSONObject(...)");
                                                                Type genericType2 = field.getGenericType();
                                                                ck.p.h(genericType2, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[1];
                                                                ck.p.h(type3, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                objValueOf2 = a(jSONObject5, (Class) type3, null, null);
                                                            }
                                                            if (objValueOf2 != null) {
                                                                map.put(next, objValueOf2);
                                                            }
                                                        }
                                                        field.set(obj2, map);
                                                    } else if (List.class.isAssignableFrom(type)) {
                                                        JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                        ck.p.g(field);
                                                        if (!ck.p.e(field.getType(), LinkedList.class) && !ck.p.e(field.getType(), LinkedList.class)) {
                                                            linkedList = new ArrayList();
                                                        } else {
                                                            linkedList = new LinkedList();
                                                        }
                                                        int length3 = jSONArray.length();
                                                        for (int i13 = 0; i13 < length3; i13++) {
                                                            ck.p.g(jSONArray);
                                                            Type genericType3 = field.getGenericType();
                                                            ck.p.h(genericType3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                            Type type4 = ((ParameterizedType) genericType3).getActualTypeArguments()[0];
                                                            ck.p.h(type4, "null cannot be cast to non-null type java.lang.Class<*>");
                                                            Object objA = a(jSONArray, i13, (Class) type4);
                                                            if (objA == null || !a(objA.getClass())) {
                                                                JSONObject jSONObject6 = jSONArray.getJSONObject(i13);
                                                                ck.p.i(jSONObject6, "getJSONObject(...)");
                                                                Type genericType4 = field.getGenericType();
                                                                ck.p.h(genericType4, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                Type type5 = ((ParameterizedType) genericType4).getActualTypeArguments()[0];
                                                                ck.p.h(type5, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                objA = a(jSONObject6, (Class) type5, null, null);
                                                            }
                                                            if (objA != null) {
                                                                linkedList.add(objA);
                                                            }
                                                        }
                                                        field.set(obj2, linkedList);
                                                    } else if (type.isArray()) {
                                                        JSONArray jSONArray2 = jSONObject.getJSONArray(name);
                                                        Class<?> componentType = type.getComponentType();
                                                        int length4 = jSONArray2.length();
                                                        Object objNewInstance = Array.newInstance(componentType, length4);
                                                        for (int i14 = 0; i14 < length4; i14++) {
                                                            ck.p.g(jSONArray2);
                                                            ck.p.g(componentType);
                                                            Object objA2 = a(jSONArray2, i14, componentType);
                                                            if (objA2 == null || !a(objA2.getClass())) {
                                                                JSONObject jSONObject7 = jSONArray2.getJSONObject(i14);
                                                                ck.p.i(jSONObject7, "getJSONObject(...)");
                                                                objA2 = a(jSONObject7, componentType, null, null);
                                                            }
                                                            if (objA2 != null) {
                                                                Array.set(objNewInstance, i14, objA2);
                                                            }
                                                        }
                                                        field.set(obj2, objNewInstance);
                                                    } else {
                                                        JSONObject jSONObject8 = jSONObject.getJSONObject(name);
                                                        Objects.toString(obj2);
                                                        ck.p.g(jSONObject8);
                                                        ck.p.g(type);
                                                        field.set(obj2, a(jSONObject8, type, obj2, null));
                                                    }
                                                } else {
                                                    ck.p.g(field);
                                                    f(field, obj2, jSONObject);
                                                }
                                            }
                                        } else {
                                            ck.p.g(field);
                                            a(field, obj2, jSONObject);
                                        }
                                    } else {
                                        ck.p.g(field);
                                        e(field, obj2, jSONObject);
                                    }
                                } else {
                                    ck.p.g(field);
                                    c(field, obj2, jSONObject);
                                }
                            } else {
                                ck.p.g(field);
                                b(field, obj2, jSONObject);
                            }
                        } else {
                            ck.p.g(field);
                            a(field, obj2, a(jSONObject, field));
                        }
                    } else {
                        ck.p.g(field);
                        d(field, obj2, jSONObject);
                    }
                } else if (field.isAnnotationPresent(Ue.class)) {
                    throw new JSONException("NonNullable field " + name + " is not present or null in the JSONObject");
                }
            }
        }
        return obj2;
    }

    public static Boolean a(JSONObject jSONObject, Field field) {
        boolean z10;
        String name = field.getName();
        try {
            z10 = jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            z10 = jSONObject.getInt(name) != 0;
        }
        return Boolean.valueOf(z10);
    }

    public static void a(Field field, Object obj, Boolean bool) {
        try {
            if (field.getType() == Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (Exception unused) {
            field.getName();
        }
    }

    public static void a(Field field, Object obj, JSONObject jSONObject) {
        byte b10 = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Byte.TYPE) {
                field.getName();
                field.setByte(obj, b10);
            } else {
                field.getName();
                field.set(obj, Byte.valueOf(b10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static boolean a(Class cls) {
        Class cls2 = Integer.TYPE;
        if (ck.p.e(cls2, cls) || ck.p.e(cls2, cls) || ck.p.e(Integer.class, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (ck.p.e(cls3, cls) || ck.p.e(cls3, cls) || ck.p.e(Boolean.class, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (ck.p.e(cls4, cls) || ck.p.e(cls4, cls) || ck.p.e(Double.class, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (ck.p.e(cls5, cls) || ck.p.e(cls5, cls) || ck.p.e(Float.class, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (ck.p.e(cls6, cls) || ck.p.e(cls6, cls) || ck.p.e(Long.class, cls) || ck.p.e(String.class, cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (ck.p.e(cls7, cls) || ck.p.e(cls7, cls) || ck.p.e(Byte.class, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return ck.p.e(cls8, cls) || ck.p.e(cls8, cls) || ck.p.e(Short.class, cls);
    }

    public static Object a(JSONArray jSONArray, int i10, Class cls) throws JSONException {
        Object objValueOf;
        if (ck.p.e(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONArray.getInt(i10));
        } else if (ck.p.e(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONArray.getDouble(i10));
        } else if (ck.p.e(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONArray.getDouble(i10));
        } else if (ck.p.e(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONArray.getLong(i10));
        } else if (ck.p.e(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONArray.getInt(i10));
        } else if (ck.p.e(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONArray.getInt(i10));
        } else {
            objValueOf = jSONArray.get(i10);
        }
        ck.p.g(objValueOf);
        return objValueOf;
    }
}
