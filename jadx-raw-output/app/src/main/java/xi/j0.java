package xi;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableFromCallable.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j0<T> extends ii.k<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends T> f74627b;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) qi.a.e(this.f74627b.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(rVar);
        rVar.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.complete(qi.a.e(this.f74627b.call(), "Callable returned null"));
        } catch (Throwable th2) {
            ni.a.b(th2);
            if (deferredScalarDisposable.isDisposed()) {
                ej.a.s(th2);
            } else {
                rVar.onError(th2);
            }
        }
    }

    public j0(Callable<? extends T> callable) {
        this.f74627b = callable;
    }
}
