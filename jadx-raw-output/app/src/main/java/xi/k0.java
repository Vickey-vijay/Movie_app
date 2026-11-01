package xi;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableFromFuture.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k0<T> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Future<? extends T> f74643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f74645d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(rVar);
        rVar.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f74645d;
            deferredScalarDisposable.complete(qi.a.e(timeUnit != null ? this.f74643b.get(this.f74644c, timeUnit) : this.f74643b.get(), "Future returned null"));
        } catch (Throwable th2) {
            ni.a.b(th2);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            rVar.onError(th2);
        }
    }

    public k0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f74643b = future;
        this.f74644c = j10;
        this.f74645d = timeUnit;
    }
}
