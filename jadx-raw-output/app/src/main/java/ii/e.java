package ii;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.subscribers.StrictSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Flowable.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e<T> implements qo.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f54176b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void n(qo.b<? super T> bVar);

    public static int b() {
        return f54176b;
    }

    public static <T> e<T> c() {
        return ej.a.m(ui.b.f72878c);
    }

    public static <T> e<T> d(Throwable th2) {
        qi.a.e(th2, "throwable is null");
        return e(Functions.k(th2));
    }

    public static <T> e<T> e(Callable<? extends Throwable> callable) {
        qi.a.e(callable, "errorSupplier is null");
        return ej.a.m(new ui.c(callable));
    }

    public static e<Long> q(long j10, TimeUnit timeUnit, s sVar) {
        qi.a.e(timeUnit, "unit is null");
        qi.a.e(sVar, "scheduler is null");
        return ej.a.m(new FlowableTimer(Math.max(0L, j10), timeUnit, sVar));
    }

    @Override // qo.a
    public final void a(qo.b<? super T> bVar) {
        if (bVar instanceof f) {
            m((f) bVar);
        } else {
            qi.a.e(bVar, "s is null");
            m(new StrictSubscriber(bVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> e<R> g(oi.o<? super T, ? extends qo.a<? extends R>> oVar, boolean z10, int i10, int i11) {
        qi.a.e(oVar, "mapper is null");
        qi.a.f(i10, "maxConcurrency");
        qi.a.f(i11, "bufferSize");
        if (!(this instanceof ri.f)) {
            return ej.a.m(new FlowableFlatMap(this, oVar, z10, i10, i11));
        }
        Object objCall = ((ri.f) this).call();
        return objCall == null ? c() : ui.e.a(objCall, oVar);
    }

    public final e<T> i(int i10, boolean z10, boolean z11) {
        qi.a.f(i10, "bufferSize");
        return ej.a.m(new FlowableOnBackpressureBuffer(this, i10, z11, z10, Functions.f61031c));
    }

    public final e<T> j() {
        return ej.a.m(new FlowableOnBackpressureDrop(this));
    }

    public final e<T> k() {
        return ej.a.m(new FlowableOnBackpressureLatest(this));
    }

    public final e<T> l(oi.o<? super e<Throwable>, ? extends qo.a<?>> oVar) {
        qi.a.e(oVar, "handler is null");
        return ej.a.m(new FlowableRetryWhen(this, oVar));
    }

    public final void m(f<? super T> fVar) {
        qi.a.e(fVar, "s is null");
        try {
            qo.b<? super T> bVarZ = ej.a.z(this, fVar);
            qi.a.e(bVarZ, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            n(bVarZ);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            ni.a.b(th2);
            ej.a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final <U> e<T> o(qo.a<U> aVar) {
        qi.a.e(aVar, "other is null");
        return ej.a.m(new FlowableTakeUntil(this, aVar));
    }

    public static e<Long> p(long j10, TimeUnit timeUnit) {
        return q(j10, timeUnit, gj.a.a());
    }

    public final <R> e<R> f(oi.o<? super T, ? extends qo.a<? extends R>> oVar) {
        return g(oVar, false, b(), b());
    }

    public final e<T> h() {
        return i(b(), false, true);
    }
}
