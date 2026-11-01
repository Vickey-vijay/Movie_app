package bl;

import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v<T> implements z1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.l<jk.c<?>, xk.b<T>> f5474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, m<T>> f5475b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(bk.l<? super jk.c<?>, ? extends xk.b<T>> lVar) {
        ck.p.j(lVar, "compute");
        this.f5474a = lVar;
        this.f5475b = new ConcurrentHashMap<>();
    }

    @Override // bl.z1
    public xk.b<T> a(jk.c<Object> cVar) {
        m<T> mVarPutIfAbsent;
        ck.p.j(cVar, C3426d4.i.W);
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.f5475b;
        Class<?> clsA = ak.a.a(cVar);
        m<T> mVar = concurrentHashMap.get(clsA);
        if (mVar == null && (mVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (mVar = new m<>(this.f5474a.invoke(cVar))))) != null) {
            mVar = mVarPutIfAbsent;
        }
        return mVar.f5438a;
    }
}
