package ck;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import lk.a0;
import nj.l0;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements jk.c<Object>, f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6048c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<Class<? extends mj.e<?>>, Integer> f6049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap<String, String> f6050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, String> f6051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap<String, String> f6052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map<String, String> f6053h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f6054b;

    /* JADX INFO: compiled from: ClassReference.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            p.j(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) g.f6052g.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) g.f6052g.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class<?> cls) {
            String str;
            p.j(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        p.g(simpleName);
                        String strW0 = a0.W0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (strW0 != null) {
                            return strW0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        p.g(simpleName);
                        return a0.V0(simpleName, '$', null, 2, null);
                    }
                    p.g(simpleName);
                    return a0.W0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                }
                if (!cls.isArray()) {
                    String str3 = (String) g.f6053h.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) g.f6053h.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }

        public final boolean c(Object obj, Class<?> cls) {
            p.j(cls, "jClass");
            Map map = g.f6049d;
            p.h(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return x.k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = ak.a.b(ak.a.c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List listN = nj.s.n(bk.a.class, bk.l.class, bk.p.class, bk.q.class, bk.r.class, bk.s.class, bk.t.class, bk.u.class, bk.v.class, bk.w.class, bk.b.class, bk.c.class, bk.d.class, bk.e.class, bk.f.class, bk.g.class, bk.h.class, bk.i.class, bk.j.class, bk.k.class, bk.m.class, bk.n.class, bk.o.class);
        ArrayList arrayList = new ArrayList(nj.t.v(listN, 10));
        for (Object obj : listN) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nj.s.u();
            }
            arrayList.add(mj.h.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f6049d = kotlin.collections.a.v(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put(ImpressionLog.f43647w, "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f6050e = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f6051f = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put(com.safedk.android.utils.k.f45011d, "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        p.i(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            p.g(str);
            sb2.append(a0.Z0(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            Pair pairA = mj.h.a(sb2.toString(), str + ".Companion");
            map3.put(pairA.getFirst(), pairA.getSecond());
        }
        for (Map.Entry<Class<? extends mj.e<?>>, Integer> entry : f6049d.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f6052g = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0.f(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            p.g(str2);
            linkedHashMap.put(key, a0.Z0(str2, '.', null, 2, null));
        }
        f6053h = linkedHashMap;
    }

    public g(Class<?> cls) {
        p.j(cls, "jClass");
        this.f6054b = cls;
    }

    @Override // ck.f
    public Class<?> a() {
        return this.f6054b;
    }

    @Override // jk.c
    public String d() {
        return f6048c.a(a());
    }

    @Override // jk.c
    public boolean e(Object obj) {
        return f6048c.c(obj, a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && p.e(ak.a.b(this), ak.a.b((jk.c) obj));
    }

    @Override // jk.c
    public String i() {
        return f6048c.b(a());
    }

    public String toString() {
        return a() + " (Kotlin reflection is not available)";
    }

    public int hashCode() {
        return ak.a.b(this).hashCode();
    }
}
