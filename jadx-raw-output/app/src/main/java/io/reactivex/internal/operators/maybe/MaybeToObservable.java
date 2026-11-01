package io.reactivex.internal.operators.maybe;

import ii.h;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class MaybeToObservable<T> extends k<T> {

    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements h<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        public b upstream;

        @Override // ii.h
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public MaybeToObservableObserver(r<? super T> rVar) {
            super(rVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // ii.h
        public void onComplete() {
            complete();
        }

        @Override // ii.h
        public void onError(Throwable th2) {
            error(th2);
        }

        @Override // ii.h
        public void onSuccess(T t10) {
            complete(t10);
        }
    }

    public static <T> h<T> b(r<? super T> rVar) {
        return new MaybeToObservableObserver(rVar);
    }
}
