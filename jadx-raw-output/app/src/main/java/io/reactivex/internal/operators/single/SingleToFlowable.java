package io.reactivex.internal.operators.single;

import ii.e;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class SingleToFlowable<T> extends e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<? extends T> f61381c;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements u<T> {
        private static final long serialVersionUID = 187782011903685568L;
        public b upstream;

        @Override // ii.u
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public SingleToFlowableObserver(qo.b<? super T> bVar) {
            super(bVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            complete(t10);
        }
    }

    @Override // ii.e
    public void n(qo.b<? super T> bVar) {
        this.f61381c.b(new SingleToFlowableObserver(bVar));
    }

    public SingleToFlowable(v<? extends T> vVar) {
        this.f61381c = vVar;
    }
}
