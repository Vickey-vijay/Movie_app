package ii;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTakeUntil;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Single.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class t<T> implements v<T> {
    public abstract void m(u<? super T> uVar);

    public static <T> t<T> f(Throwable th2) {
        qi.a.e(th2, "error is null");
        return g(Functions.k(th2));
    }

    public static <T> t<T> g(Callable<? extends Throwable> callable) {
        qi.a.e(callable, "errorSupplier is null");
        return ej.a.p(new yi.a(callable));
    }

    public static <T> t<T> s(e<T> eVar) {
        return ej.a.p(new ui.f(eVar, null));
    }

    public static <T> t<T> t(v<T> vVar) {
        qi.a.e(vVar, "source is null");
        return vVar instanceof t ? ej.a.p((t) vVar) : ej.a.p(new yi.b(vVar));
    }

    @Override // ii.v
    public final void b(u<? super T> uVar) {
        qi.a.e(uVar, "subscriber is null");
        u<? super T> uVarY = ej.a.y(this, uVar);
        qi.a.e(uVarY, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            m(uVarY);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            ni.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T d() {
        si.f fVar = new si.f();
        b(fVar);
        return (T) fVar.a();
    }

    public final <R> t<R> e(w<? super T, ? extends R> wVar) {
        return t(((w) qi.a.e(wVar, "transformer is null")).apply(this));
    }

    public final <R> t<R> h(oi.o<? super T, ? extends R> oVar) {
        qi.a.e(oVar, "mapper is null");
        return ej.a.p(new yi.c(this, oVar));
    }

    public final t<T> i(s sVar) {
        qi.a.e(sVar, "scheduler is null");
        return ej.a.p(new SingleObserveOn(this, sVar));
    }

    public final t<T> j(oi.o<? super Throwable, ? extends v<? extends T>> oVar) {
        qi.a.e(oVar, "resumeFunctionInCaseOfError is null");
        return ej.a.p(new SingleResumeNext(this, oVar));
    }

    public final mi.b l(oi.g<? super T> gVar, oi.g<? super Throwable> gVar2) {
        qi.a.e(gVar, "onSuccess is null");
        qi.a.e(gVar2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(gVar, gVar2);
        b(consumerSingleObserver);
        return consumerSingleObserver;
    }

    public final t<T> n(s sVar) {
        qi.a.e(sVar, "scheduler is null");
        return ej.a.p(new SingleSubscribeOn(this, sVar));
    }

    public final <E> t<T> o(v<? extends E> vVar) {
        qi.a.e(vVar, "other is null");
        return p(new SingleToFlowable(vVar));
    }

    public final <E> t<T> p(qo.a<E> aVar) {
        qi.a.e(aVar, "other is null");
        return ej.a.p(new SingleTakeUntil(this, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<T> q() {
        return this instanceof ri.a ? ((ri.a) this).c() : ej.a.m(new SingleToFlowable(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k<T> r() {
        return this instanceof ri.b ? ((ri.b) this).a() : ej.a.o(new SingleToObservable(this));
    }

    public final t<T> k(oi.o<? super e<Throwable>, ? extends qo.a<?>> oVar) {
        return s(q().l(oVar));
    }
}
