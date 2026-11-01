package ui;

import a.h;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;
import oi.o;

/* JADX INFO: compiled from: FlowableScalarXMap.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: compiled from: FlowableScalarXMap.java */
    public static final class a<T, R> extends ii.e<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f72883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o<? super T, ? extends qo.a<? extends R>> f72884d;

        @Override // ii.e
        public void n(qo.b<? super R> bVar) {
            try {
                qo.a aVar = (qo.a) qi.a.e(this.f72884d.apply(this.f72883c), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    aVar.a(bVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall == null) {
                        EmptySubscription.complete(bVar);
                    } else {
                        bVar.onSubscribe(new ScalarSubscription(bVar, objCall));
                    }
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    EmptySubscription.error(th2, bVar);
                }
            } catch (Throwable th3) {
                EmptySubscription.error(th3, bVar);
            }
        }

        public a(T t10, o<? super T, ? extends qo.a<? extends R>> oVar) {
            this.f72883c = t10;
            this.f72884d = oVar;
        }
    }

    public static <T, U> ii.e<U> a(T t10, o<? super T, ? extends qo.a<? extends U>> oVar) {
        return ej.a.m(new a(t10, oVar));
    }

    public static <T, R> boolean b(qo.a<T> aVar, qo.b<? super R> bVar, o<? super T, ? extends qo.a<? extends R>> oVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) aVar).call();
            if (hVar == null) {
                EmptySubscription.complete(bVar);
                return true;
            }
            try {
                qo.a aVar2 = (qo.a) qi.a.e(oVar.apply(hVar), "The mapper returned a null Publisher");
                if (aVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) aVar2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(bVar);
                            return true;
                        }
                        bVar.onSubscribe(new ScalarSubscription(bVar, objCall));
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        EmptySubscription.error(th2, bVar);
                        return true;
                    }
                } else {
                    aVar2.a(bVar);
                }
                return true;
            } catch (Throwable th3) {
                ni.a.b(th3);
                EmptySubscription.error(th3, bVar);
                return true;
            }
        } catch (Throwable th4) {
            ni.a.b(th4);
            EmptySubscription.error(th4, bVar);
            return true;
        }
    }
}
