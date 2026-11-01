package xi;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableError.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f0<T> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends Throwable> f74576b;

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        try {
            th = (Throwable) qi.a.e(this.f74576b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            ni.a.b(th);
        }
        EmptyDisposable.error(th, rVar);
    }

    public f0(Callable<? extends Throwable> callable) {
        this.f74576b = callable;
    }
}
