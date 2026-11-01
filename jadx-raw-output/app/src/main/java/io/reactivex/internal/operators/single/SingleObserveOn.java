package io.reactivex.internal.operators.single;

import ii.s;
import ii.t;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleObserveOn<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<T> f61373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f61374b;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<b> implements u<T>, b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        public final u<? super T> downstream;
        public Throwable error;
        public final s scheduler;
        public T value;

        @Override // ii.u
        public void onError(Throwable th2) {
            this.error = th2;
            DisposableHelper.replace(this, this.scheduler.c(this));
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            this.value = t10;
            DisposableHelper.replace(this, this.scheduler.c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.error;
            if (th2 != null) {
                this.downstream.onError(th2);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }

        public ObserveOnSingleObserver(u<? super T> uVar, s sVar) {
            this.downstream = uVar;
            this.scheduler = sVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // ii.t
    public void m(u<? super T> uVar) {
        this.f61373a.b(new ObserveOnSingleObserver(uVar, this.f61374b));
    }

    public SingleObserveOn(v<T> vVar, s sVar) {
        this.f61373a = vVar;
        this.f61374b = sVar;
    }
}
