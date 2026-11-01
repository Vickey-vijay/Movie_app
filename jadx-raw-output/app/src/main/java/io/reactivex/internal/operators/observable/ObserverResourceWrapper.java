package io.reactivex.internal.operators.observable;

import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes5.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -8612022020200669122L;
    public final r<? super T> downstream;
    public final AtomicReference<b> upstream = new AtomicReference<>();

    @Override // mi.b
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    @Override // ii.r
    public void onNext(T t10) {
        this.downstream.onNext(t10);
    }

    @Override // ii.r
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this.upstream, bVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    public ObserverResourceWrapper(r<? super T> rVar) {
        this.downstream = rVar;
    }

    @Override // ii.r
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        dispose();
        this.downstream.onError(th2);
    }

    public void setResource(b bVar) {
        DisposableHelper.set(this, bVar);
    }
}
