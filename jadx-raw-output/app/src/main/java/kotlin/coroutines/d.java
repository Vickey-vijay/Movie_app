package kotlin.coroutines;

import ck.p;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface d {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public static final class a {
        public static d b(d dVar, d dVar2) {
            p.j(dVar2, GAMConfig.KEY_CONTEXT);
            return dVar2 == EmptyCoroutineContext.INSTANCE ? dVar : (d) dVar2.fold(dVar, new bk.p() { // from class: rj.e
                @Override // bk.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo1invoke(Object obj, Object obj2) {
                    return kotlin.coroutines.d.a.c((kotlin.coroutines.d) obj, (kotlin.coroutines.d.b) obj2);
                }
            });
        }

        public static d c(d dVar, b bVar) {
            CombinedContext combinedContext;
            p.j(dVar, "acc");
            p.j(bVar, "element");
            d dVarMinusKey = dVar.minusKey(bVar.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (dVarMinusKey == emptyCoroutineContext) {
                return bVar;
            }
            kotlin.coroutines.c.b bVar2 = kotlin.coroutines.c.D8;
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVarMinusKey.get(bVar2);
            if (cVar == null) {
                combinedContext = new CombinedContext(dVarMinusKey, bVar);
            } else {
                d dVarMinusKey2 = dVarMinusKey.minusKey(bVar2);
                if (dVarMinusKey2 == emptyCoroutineContext) {
                    return new CombinedContext(bVar, cVar);
                }
                combinedContext = new CombinedContext(new CombinedContext(dVarMinusKey2, bVar), cVar);
            }
            return combinedContext;
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface b extends d {

        /* JADX INFO: compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(b bVar, R r10, bk.p<? super R, ? super b, ? extends R> pVar) {
                p.j(pVar, "operation");
                return pVar.mo1invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                p.j(cVar, C3426d4.i.W);
                if (!p.e(bVar.getKey(), cVar)) {
                    return null;
                }
                p.h(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static d c(b bVar, c<?> cVar) {
                p.j(cVar, C3426d4.i.W);
                return p.e(bVar.getKey(), cVar) ? EmptyCoroutineContext.INSTANCE : bVar;
            }

            public static d d(b bVar, d dVar) {
                p.j(dVar, GAMConfig.KEY_CONTEXT);
                return a.b(bVar, dVar);
            }
        }

        @Override // kotlin.coroutines.d
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, bk.p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    d minusKey(c<?> cVar);

    d plus(d dVar);
}
