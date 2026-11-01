package io.reactivex.internal.operators.observable;

import ii.k;
import ii.m;
import ii.n;
import ii.r;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.f;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableCreate<T> extends k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n<T> f61160b;

    public static final class CreateEmitter<T> extends AtomicReference<b> implements m<T>, b {
        private static final long serialVersionUID = -3434801548987643227L;
        public final r<? super T> observer;

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", CreateEmitter.class.getSimpleName(), super.toString());
        }

        @Override // ii.d
        public void onNext(T t10) {
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.observer.onNext(t10);
            }
        }

        public m<T> serialize() {
            return new SerializedEmitter(this);
        }

        @Override // ii.m
        public void setCancellable(f fVar) {
            setDisposable(new CancellableDisposable(fVar));
        }

        public boolean tryOnError(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onError(th2);
                return true;
            } finally {
                dispose();
            }
        }

        public CreateEmitter(r<? super T> rVar) {
            this.observer = rVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // ii.m, mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.d
        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.observer.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        @Override // ii.d
        public void onError(Throwable th2) {
            if (!tryOnError(th2)) {
                ej.a.s(th2);
            }
        }

        @Override // ii.m
        public void setDisposable(b bVar) {
            DisposableHelper.set(this, bVar);
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements m<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final m<T> emitter;
        public final AtomicThrowable error = new AtomicThrowable();
        public final zi.a<T> queue = new zi.a<>(16);

        public m<T> serialize() {
            return this;
        }

        public void drainLoop() {
            m<T> mVar = this.emitter;
            zi.a<T> aVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int iAddAndGet = 1;
            while (!mVar.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    aVar.clear();
                    mVar.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z10 = this.done;
                T tPoll = aVar.poll();
                boolean z11 = tPoll == null;
                if (z10 && z11) {
                    mVar.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    mVar.onNext(tPoll);
                }
            }
            aVar.clear();
        }

        @Override // ii.m, mi.b
        public boolean isDisposed() {
            return this.emitter.isDisposed();
        }

        @Override // ii.d
        public void onComplete() {
            if (this.emitter.isDisposed() || this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // ii.d
        public void onNext(T t10) {
            if (this.emitter.isDisposed() || this.done) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.emitter.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                zi.a<T> aVar = this.queue;
                synchronized (aVar) {
                    aVar.offer(t10);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // ii.m
        public void setCancellable(f fVar) {
            this.emitter.setCancellable(fVar);
        }

        @Override // ii.m
        public void setDisposable(b bVar) {
            this.emitter.setDisposable(bVar);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.emitter.toString();
        }

        public boolean tryOnError(Throwable th2) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th2)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }

        public SerializedEmitter(m<T> mVar) {
            this.emitter = mVar;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // ii.d
        public void onError(Throwable th2) {
            if (!tryOnError(th2)) {
                ej.a.s(th2);
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        CreateEmitter createEmitter = new CreateEmitter(rVar);
        rVar.onSubscribe(createEmitter);
        try {
            this.f61160b.subscribe(createEmitter);
        } catch (Throwable th2) {
            ni.a.b(th2);
            createEmitter.onError(th2);
        }
    }

    public ObservableCreate(n<T> nVar) {
        this.f61160b = nVar;
    }
}
