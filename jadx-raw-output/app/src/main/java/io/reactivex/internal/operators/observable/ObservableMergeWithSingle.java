package io.reactivex.internal.operators.observable;

import a.i;
import ii.k;
import ii.r;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import ri.g;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableMergeWithSingle<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<? extends T> f61213c;

    public static final class MergeWithObserver<T> extends AtomicInteger implements r<T>, b {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean disposed;
        public final r<? super T> downstream;
        public volatile boolean mainDone;
        public volatile int otherState;
        public volatile g<T> queue;
        public T singleItem;
        public final AtomicReference<b> mainDisposable = new AtomicReference<>();
        public final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        public final AtomicThrowable error = new AtomicThrowable();

        public static final class OtherObserver<T> extends AtomicReference<b> implements u<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final MergeWithObserver<T> parent;

            @Override // ii.u
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            @Override // ii.u
            public void onSuccess(T t10) {
                this.parent.otherSuccess(t10);
            }

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // ii.u
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.disposed = true;
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        @Override // ii.r
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void otherSuccess(T t10) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t10);
                this.otherState = 2;
            } else {
                this.singleItem = t10;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void drainLoop() {
            r<? super T> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!this.disposed) {
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    rVar.onError(this.error.terminate());
                    return;
                }
                int i10 = this.otherState;
                if (i10 == 1) {
                    T t10 = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    rVar.onNext(t10);
                    i10 = 2;
                }
                boolean z10 = this.mainDone;
                g<T> gVar = this.queue;
                i iVarPoll = gVar != null ? gVar.poll() : null;
                boolean z11 = iVarPoll == null;
                if (z10 && z11 && i10 == 2) {
                    this.queue = null;
                    rVar.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    rVar.onNext(iVarPoll);
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        public g<T> getOrCreateQueue() {
            g<T> gVar = this.queue;
            if (gVar != null) {
                return gVar;
            }
            zi.a aVar = new zi.a(k.bufferSize());
            this.queue = aVar;
            return aVar;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                ej.a.s(th2);
            } else {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.mainDisposable, bVar);
        }

        public void otherError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                ej.a.s(th2);
            } else {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
            }
        }

        public MergeWithObserver(r<? super T> rVar) {
            this.downstream = rVar;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(rVar);
        rVar.onSubscribe(mergeWithObserver);
        this.f74487b.subscribe(mergeWithObserver);
        this.f61213c.b(mergeWithObserver.otherObserver);
    }

    public ObservableMergeWithSingle(k<T> kVar, v<? extends T> vVar) {
        super(kVar);
        this.f61213c = vVar;
    }
}
