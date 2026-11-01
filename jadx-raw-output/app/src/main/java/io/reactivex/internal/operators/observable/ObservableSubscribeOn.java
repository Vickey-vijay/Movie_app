package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableSubscribeOn<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f61302c;

    public static final class SubscribeOnObserver<T> extends AtomicReference<b> implements r<T>, b {
        private static final long serialVersionUID = 8094547886072529208L;
        public final r<? super T> downstream;
        public final AtomicReference<b> upstream = new AtomicReference<>();

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        @Override // ii.r
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public SubscribeOnObserver(r<? super T> rVar) {
            this.downstream = rVar;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        public void setDisposable(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SubscribeOnObserver<T> f61303b;

        public a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.f61303b = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.f74487b.subscribe(this.f61303b);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(rVar);
        rVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.f61302c.c(new a(subscribeOnObserver)));
    }

    public ObservableSubscribeOn(p<T> pVar, s sVar) {
        super(pVar);
        this.f61302c = sVar;
    }
}
