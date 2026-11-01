package kotlin.coroutines;

import ck.p;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface c extends d.b {
    public static final b D8 = b.f62992b;

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class a {
        public static <E extends d.b> E a(c cVar, d.c<E> cVar2) {
            p.j(cVar2, C3426d4.i.W);
            if (!(cVar2 instanceof kotlin.coroutines.b)) {
                if (c.D8 != cVar2) {
                    return null;
                }
                p.h(cVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar2;
            if (!bVar.a(cVar.getKey())) {
                return null;
            }
            E e10 = (E) bVar.b(cVar);
            if (e10 instanceof d.b) {
                return e10;
            }
            return null;
        }

        public static d b(c cVar, d.c<?> cVar2) {
            p.j(cVar2, C3426d4.i.W);
            if (!(cVar2 instanceof kotlin.coroutines.b)) {
                return c.D8 == cVar2 ? EmptyCoroutineContext.INSTANCE : cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar2;
            return (!bVar.a(cVar.getKey()) || bVar.b(cVar) == null) ? cVar : EmptyCoroutineContext.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class b implements d.c<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f62992b = new b();
    }

    <T> rj.c<T> interceptContinuation(rj.c<? super T> cVar);

    void releaseInterceptedContinuation(rj.c<?> cVar);
}
