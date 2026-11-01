package u5;

import com.google.gson.JsonIOException;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Type, s5.d<?>> f72706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5.b f72707b = w5.b.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class a<T> implements u5.e<T> {
        public a() {
        }

        @Override // u5.e
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: u5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class C0760b<T> implements u5.e<T> {
        public C0760b() {
        }

        @Override // u5.e
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class c<T> implements u5.e<T> {
        public c() {
        }

        @Override // u5.e
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class d<T> implements u5.e<T> {
        public d() {
        }

        @Override // u5.e
        public T a() {
            return (T) new LinkedTreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class e<T> implements u5.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u5.i f72712a = u5.i.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f72713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Type f72714c;

        public e(Class cls, Type type) {
            this.f72713b = cls;
            this.f72714c = type;
        }

        @Override // u5.e
        public T a() {
            try {
                return (T) this.f72712a.c(this.f72713b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f72714c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class f<T> implements u5.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s5.d f72716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f72717b;

        public f(s5.d dVar, Type type) {
            this.f72716a = dVar;
            this.f72717b = type;
        }

        @Override // u5.e
        public T a() {
            return (T) this.f72716a.a(this.f72717b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class g<T> implements u5.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s5.d f72719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f72720b;

        public g(s5.d dVar, Type type) {
            this.f72719a = dVar;
            this.f72720b = type;
        }

        @Override // u5.e
        public T a() {
            return (T) this.f72719a.a(this.f72720b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class h<T> implements u5.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f72722a;

        public h(Constructor constructor) {
            this.f72722a = constructor;
        }

        @Override // u5.e
        public T a() {
            try {
                return (T) this.f72722a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f72722a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f72722a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class i<T> implements u5.e<T> {
        public i() {
        }

        @Override // u5.e
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class j<T> implements u5.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f72725a;

        public j(Type type) {
            this.f72725a = type;
        }

        @Override // u5.e
        public T a() {
            Type type = this.f72725a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f72725a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f72725a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class k<T> implements u5.e<T> {
        public k() {
        }

        @Override // u5.e
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class l<T> implements u5.e<T> {
        public l() {
        }

        @Override // u5.e
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class m<T> implements u5.e<T> {
        public m() {
        }

        @Override // u5.e
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class n<T> implements u5.e<T> {
        public n() {
        }

        @Override // u5.e
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public final <T> u5.e<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f72707b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> u5.e<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            return Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new n();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new a();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new C0760b();
        }
        return (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(x5.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new c();
    }

    public final <T> u5.e<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public String toString() {
        return this.f72706a.toString();
    }

    public b(Map<Type, s5.d<?>> map) {
        this.f72706a = map;
    }

    public <T> u5.e<T> a(x5.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> clsC = aVar.c();
        s5.d<?> dVar = this.f72706a.get(type);
        if (dVar != null) {
            return new f(dVar, type);
        }
        s5.d<?> dVar2 = this.f72706a.get(clsC);
        if (dVar2 != null) {
            return new g(dVar2, type);
        }
        u5.e<T> eVarB = b(clsC);
        if (eVarB != null) {
            return eVarB;
        }
        u5.e<T> eVarC = c(type, clsC);
        if (eVarC != null) {
            return eVarC;
        }
        return d(type, clsC);
    }
}
