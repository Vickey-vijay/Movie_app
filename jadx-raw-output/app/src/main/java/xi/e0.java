package xi;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableEmpty.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends ii.k<Object> implements ri.f<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ii.k<Object> f74566b = new e0();

    @Override // ri.f, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super Object> rVar) {
        EmptyDisposable.complete(rVar);
    }
}
