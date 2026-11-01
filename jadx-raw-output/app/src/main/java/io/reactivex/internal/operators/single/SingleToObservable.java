package io.reactivex.internal.operators.single;

import ii.k;
import ii.r;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import mi.b;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleToObservable<T> extends k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v<? extends T> f61382b;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements u<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        public b upstream;

        @Override // ii.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public SingleToObservableObserver(r<? super T> rVar) {
            super(rVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // ii.u
        public void onError(Throwable th2) {
            error(th2);
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            complete(t10);
        }
    }

    public static <T> u<T> b(r<? super T> rVar) {
        return new SingleToObservableObserver(rVar);
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f61382b.b(b(rVar));
    }

    public SingleToObservable(v<? extends T> vVar) {
        this.f61382b = vVar;
    }
}
