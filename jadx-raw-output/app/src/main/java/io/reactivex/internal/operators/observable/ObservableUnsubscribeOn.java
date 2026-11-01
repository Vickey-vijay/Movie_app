package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import mi.b;

/* JADX INFO: loaded from: classes.dex */
public final class ObservableUnsubscribeOn<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f61337c;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = 1015244841293359600L;
        public final r<? super T> downstream;
        public final s scheduler;
        public b upstream;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.upstream.dispose();
            }
        }

        @Override // mi.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.c(new a());
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public UnsubscribeObserver(r<? super T> rVar, s sVar) {
            this.downstream = rVar;
            this.scheduler = sVar;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return get();
        }

        @Override // ii.r
        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (get()) {
                ej.a.s(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (!get()) {
                this.downstream.onNext(t10);
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new UnsubscribeObserver(rVar, this.f61337c));
    }

    public ObservableUnsubscribeOn(p<T> pVar, s sVar) {
        super(pVar);
        this.f61337c = sVar;
    }
}
