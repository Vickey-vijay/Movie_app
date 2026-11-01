package xi;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableDefer.java */
/* JADX INFO: loaded from: classes11.dex */
public final class r<T> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends ii.p<? extends T>> f74779b;

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        try {
            ((ii.p) qi.a.e(this.f74779b.call(), "null ObservableSource supplied")).subscribe(rVar);
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }

    public r(Callable<? extends ii.p<? extends T>> callable) {
        this.f74779b = callable;
    }
}
