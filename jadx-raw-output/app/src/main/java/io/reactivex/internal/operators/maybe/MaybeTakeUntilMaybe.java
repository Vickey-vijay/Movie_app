package io.reactivex.internal.operators.maybe;

import ii.h;
import ii.i;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import vi.a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTakeUntilMaybe<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<U> f61087b;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<b> implements h<T>, b {
        private static final long serialVersionUID = -2187421758664251153L;
        public final h<? super T> downstream;
        public final TakeUntilOtherMaybeObserver<U> other = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<b> implements h<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            public final TakeUntilMainMaybeObserver<?, U> parent;

            @Override // ii.h
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // ii.h
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            @Override // ii.h
            public void onSuccess(Object obj) {
                this.parent.otherComplete();
            }

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.parent = takeUntilMainMaybeObserver;
            }

            @Override // ii.h
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // ii.h
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onComplete();
            }
        }

        @Override // ii.h
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onError(th2);
            } else {
                ej.a.s(th2);
            }
        }

        @Override // ii.h
        public void onSuccess(T t10) {
            DisposableHelper.dispose(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t10);
            }
        }

        public TakeUntilMainMaybeObserver(h<? super T> hVar) {
            this.downstream = hVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.h
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        public void otherComplete() {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        public void otherError(Throwable th2) {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onError(th2);
            } else {
                ej.a.s(th2);
            }
        }
    }

    @Override // ii.g
    public void d(h<? super T> hVar) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(hVar);
        hVar.onSubscribe(takeUntilMainMaybeObserver);
        this.f61087b.b(takeUntilMainMaybeObserver.other);
        this.f73172a.b(takeUntilMainMaybeObserver);
    }

    public MaybeTakeUntilMaybe(i<T> iVar, i<U> iVar2) {
        super(iVar);
        this.f61087b = iVar2;
    }
}
