package ic;

import ic.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: RuntimeEnumAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d<E extends e> extends com.squareup.wire.a<E> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class<E> f54118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Method f54119t;

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f54118s == this.f54118s;
    }

    public int hashCode() {
        return this.f54118s.hashCode();
    }

    public final Method v() {
        Method method = this.f54119t;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.f54118s.getMethod("fromValue", Integer.TYPE);
            this.f54119t = method2;
            return method2;
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    public d(Class<E> cls) {
        super(cls);
        this.f54118s = cls;
    }

    @Override // com.squareup.wire.a
    public E u(int i10) {
        try {
            return (E) v().invoke(null, Integer.valueOf(i10));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }
}
