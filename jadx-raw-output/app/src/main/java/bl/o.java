package bl;

import java.util.List;
import kotlinx.serialization.internal.ClassValueCache;
import kotlinx.serialization.internal.ClassValueParametrizedCache;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f5446a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f5446a = z10;
    }

    public static final <T> z1<T> a(bk.l<? super jk.c<?>, ? extends xk.b<T>> lVar) {
        ck.p.j(lVar, "factory");
        return f5446a ? new ClassValueCache(lVar) : new v(lVar);
    }

    public static final <T> l1<T> b(bk.p<? super jk.c<Object>, ? super List<? extends jk.n>, ? extends xk.b<T>> pVar) {
        ck.p.j(pVar, "factory");
        return f5446a ? new ClassValueParametrizedCache(pVar) : new w(pVar);
    }
}
