package io.reactivex.internal.operators.observable;

import ii.k;
import ii.r;
import ri.f;

/* JADX INFO: compiled from: ObservableJust.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends k<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f61372b;

    @Override // ri.f, java.util.concurrent.Callable
    public T call() {
        return this.f61372b;
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(rVar, this.f61372b);
        rVar.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }

    public a(T t10) {
        this.f61372b = t10;
    }
}
