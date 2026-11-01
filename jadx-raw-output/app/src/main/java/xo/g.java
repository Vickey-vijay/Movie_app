package xo;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<a, Object> f75091a = new e<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75092b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f75093c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, xo.a<?>> f75094d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f75096f;

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f75097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f75098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f75099c;

        public void a(int i10, Class<?> cls) {
            this.f75098b = i10;
            this.f75099c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f75098b == aVar.f75098b && this.f75099c == aVar.f75099c;
        }

        public int hashCode() {
            int i10 = this.f75098b * 31;
            Class<?> cls = this.f75099c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        @Override // xo.h
        public void offer() {
            this.f75097a.d(this);
        }

        public String toString() {
            return "Key{size=" + this.f75098b + "array=" + this.f75099c + '}';
        }

        public a(b bVar) {
            this.f75097a = bVar;
        }
    }

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class b extends c<a> {
        @Override // xo.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a f(int i10, Class<?> cls) {
            a aVarC = c();
            aVarC.a(i10, cls);
            return aVarC;
        }
    }

    public synchronized void a() {
        d(0);
    }

    public synchronized <T> T e(int i10, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = j(cls).ceilingKey(Integer.valueOf(i10));
        return (T) i(m(i10, numCeilingKey) ? this.f75092b.f(numCeilingKey.intValue(), cls) : this.f75092b.f(i10, cls), cls);
    }

    public synchronized <T> void n(T t10) {
        Class<?> cls = t10.getClass();
        xo.a<T> aVarG = g(cls);
        int arrayLength = aVarG.getArrayLength(t10);
        int elementSizeInBytes = aVarG.getElementSizeInBytes() * arrayLength;
        if (l(elementSizeInBytes)) {
            a aVarF = this.f75092b.f(arrayLength, cls);
            this.f75091a.d(aVarF, t10);
            NavigableMap<Integer, Integer> navigableMapJ = j(cls);
            Integer num = navigableMapJ.get(Integer.valueOf(aVarF.f75098b));
            Integer numValueOf = Integer.valueOf(aVarF.f75098b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapJ.put(numValueOf, Integer.valueOf(iIntValue));
            this.f75096f += elementSizeInBytes;
            c();
        }
    }

    public final void c() {
        d(this.f75095e);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(int i10) {
        while (this.f75096f > i10) {
            Object objF = this.f75091a.f();
            xo.a aVarF = f(objF);
            this.f75096f -= aVarF.getArrayLength(objF) * aVarF.getElementSizeInBytes();
            b(aVarF.getArrayLength(objF), objF.getClass());
            if (Log.isLoggable(aVarF.getTag(), 2)) {
                Log.v(aVarF.getTag(), "evicted: " + aVarF.getArrayLength(objF));
            }
        }
    }

    public final <T> xo.a<T> g(Class<T> cls) {
        xo.a<T> dVar = (xo.a) this.f75094d.get(cls);
        if (dVar == null) {
            if (cls.equals(int[].class)) {
                dVar = new f();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                dVar = new d();
            }
            this.f75094d.put(cls, dVar);
        }
        return dVar;
    }

    public final <T> T h(a aVar) {
        return (T) this.f75091a.a(aVar);
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f75093c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f75093c.put(cls, treeMap);
        return treeMap;
    }

    public final boolean k() {
        int i10 = this.f75096f;
        return i10 == 0 || this.f75095e / i10 >= 2;
    }

    public final boolean l(int i10) {
        return i10 <= this.f75095e / 2;
    }

    public final boolean m(int i10, Integer num) {
        return num != null && (k() || num.intValue() <= i10 * 8);
    }

    public g(int i10) {
        this.f75095e = i10;
    }

    public final void b(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapJ = j(cls);
        Integer num = navigableMapJ.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapJ.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapJ.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final <T> xo.a<T> f(T t10) {
        return g(t10.getClass());
    }

    public final <T> T i(a aVar, Class<T> cls) {
        xo.a<T> aVarG = g(cls);
        T t10 = (T) h(aVar);
        if (t10 != null) {
            this.f75096f -= aVarG.getArrayLength(t10) * aVarG.getElementSizeInBytes();
            b(aVarG.getArrayLength(t10), cls);
        }
        if (t10 == null) {
            if (Log.isLoggable(aVarG.getTag(), 2)) {
                Log.v(aVarG.getTag(), "Allocated " + aVar.f75098b + " bytes");
            }
            return aVarG.newArray(aVar.f75098b);
        }
        return t10;
    }
}
