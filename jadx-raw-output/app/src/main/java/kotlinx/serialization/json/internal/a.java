package kotlinx.serialization.json.internal;

import ck.p;
import com.ironsource.C3426d4;
import dl.c0;
import java.util.Map;

/* JADX INFO: compiled from: SchemaCache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<kotlinx.serialization.descriptors.a, Map<C0569a<Object>, Object>> f63308a = c0.a(16);

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SchemaCache.kt */
    public static final class C0569a<T> {
    }

    public final <T> T a(kotlinx.serialization.descriptors.a aVar, C0569a<T> c0569a) {
        p.j(aVar, "descriptor");
        p.j(c0569a, C3426d4.i.W);
        Map<C0569a<Object>, Object> map = this.f63308a.get(aVar);
        Object obj = map != null ? map.get(c0569a) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> T b(kotlinx.serialization.descriptors.a aVar, C0569a<T> c0569a, bk.a<? extends T> aVar2) {
        p.j(aVar, "descriptor");
        p.j(c0569a, C3426d4.i.W);
        p.j(aVar2, "defaultValue");
        T t10 = (T) a(aVar, c0569a);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar2.invoke();
        c(aVar, c0569a, tInvoke);
        return tInvoke;
    }

    public final <T> void c(kotlinx.serialization.descriptors.a aVar, C0569a<T> c0569a, T t10) {
        p.j(aVar, "descriptor");
        p.j(c0569a, C3426d4.i.W);
        p.j(t10, "value");
        Map<kotlinx.serialization.descriptors.a, Map<C0569a<Object>, Object>> map = this.f63308a;
        Map<C0569a<Object>, Object> mapA = map.get(aVar);
        if (mapA == null) {
            mapA = c0.a(2);
            map.put(aVar, mapA);
        }
        mapA.put(c0569a, t10);
    }
}
