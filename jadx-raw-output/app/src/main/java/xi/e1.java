package xi;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableReduceWithSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e1<T, R> extends ii.t<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<R> f74568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.c<R, ? super T, R> f74569c;

    @Override // ii.t
    public void m(ii.u<? super R> uVar) {
        try {
            this.f74567a.subscribe(new d1.a(uVar, this.f74569c, qi.a.e(this.f74568b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, uVar);
        }
    }

    public e1(ii.p<T> pVar, Callable<R> callable, oi.c<R, ? super T, R> cVar) {
        this.f74567a = pVar;
        this.f74568b = callable;
        this.f74569c = cVar;
    }
}
