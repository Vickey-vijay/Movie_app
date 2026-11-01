package io.reactivex.internal.operators.single;

import ii.f;
import ii.t;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import qo.a;
import qo.c;

/* JADX INFO: loaded from: classes9.dex */
public final class SingleTakeUntil<T, U> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<T> f61379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<U> f61380b;

    public static final class TakeUntilMainObserver<T> extends AtomicReference<b> implements u<T>, b {
        private static final long serialVersionUID = -622603812305745221L;
        public final u<? super T> downstream;
        public final TakeUntilOtherSubscriber other = new TakeUntilOtherSubscriber(this);

        @Override // ii.u
        public void onError(Throwable th2) {
            this.other.dispose();
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                ej.a.s(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            this.other.dispose();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t10);
            }
        }

        public TakeUntilMainObserver(u<? super T> uVar) {
            this.downstream = uVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.other.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.u
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        public void otherError(Throwable th2) {
            b andSet;
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper && (andSet = getAndSet(disposableHelper)) != disposableHelper) {
                if (andSet != null) {
                    andSet.dispose();
                }
                this.downstream.onError(th2);
                return;
            }
            ej.a.s(th2);
        }
    }

    public static final class TakeUntilOtherSubscriber extends AtomicReference<c> implements f<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        public final TakeUntilMainObserver<?> parent;

        @Override // qo.b
        public void onError(Throwable th2) {
            this.parent.otherError(th2);
        }

        public TakeUntilOtherSubscriber(TakeUntilMainObserver<?> takeUntilMainObserver) {
            this.parent = takeUntilMainObserver;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // qo.b
        public void onComplete() {
            c cVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (cVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // qo.b
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.otherError(new CancellationException());
            }
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            SubscriptionHelper.setOnce(this, cVar, Long.MAX_VALUE);
        }
    }

    @Override // ii.t
    public void m(u<? super T> uVar) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(uVar);
        uVar.onSubscribe(takeUntilMainObserver);
        this.f61380b.a(takeUntilMainObserver.other);
        this.f61379a.b(takeUntilMainObserver);
    }

    public SingleTakeUntil(v<T> vVar, a<U> aVar) {
        this.f61379a = vVar;
        this.f61380b = aVar;
    }
}
