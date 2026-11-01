package io.reactivex.internal.operators.observable;

import a.i;
import androidx.lifecycle.e;
import ii.k;
import ii.p;
import ii.r;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableFlatMapSingle<T, R> extends xi.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends v<? extends R>> f61186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61187d;

    public static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 8600231336733376951L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final r<? super R> downstream;
        public final o<? super T, ? extends v<? extends R>> mapper;
        public b upstream;
        public final mi.a set = new mi.a();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicInteger active = new AtomicInteger(1);
        public final AtomicReference<zi.a<R>> queue = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<b> implements u<R>, b {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // ii.u
            public void onError(Throwable th2) {
                FlatMapSingleObserver.this.innerError(this, th2);
            }

            @Override // ii.u
            public void onSuccess(R r10) {
                FlatMapSingleObserver.this.innerSuccess(this, r10);
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
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public void clear() {
            zi.a<R> aVar = this.queue.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        public void drainLoop() {
            r<? super R> rVar = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<zi.a<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!this.delayErrors && this.errors.get() != null) {
                    Throwable thTerminate = this.errors.terminate();
                    clear();
                    rVar.onError(thTerminate);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                zi.a<R> aVar = atomicReference.get();
                i iVarPoll = aVar != null ? aVar.poll() : null;
                boolean z11 = iVarPoll == null;
                if (z10 && z11) {
                    Throwable thTerminate2 = this.errors.terminate();
                    if (thTerminate2 != null) {
                        rVar.onError(thTerminate2);
                        return;
                    } else {
                        rVar.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    rVar.onNext(iVarPoll);
                }
            }
            clear();
        }

        public zi.a<R> getOrCreateQueue() {
            zi.a<R> aVar;
            do {
                zi.a<R> aVar2 = this.queue.get();
                if (aVar2 != null) {
                    return aVar2;
                }
                aVar = new zi.a<>(k.bufferSize());
            } while (!e.a(this.queue, null, aVar));
            return aVar;
        }

        public void innerError(FlatMapSingleObserver<T, R>.InnerObserver innerObserver, Throwable th2) {
            this.set.delete(innerObserver);
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                this.set.dispose();
            }
            this.active.decrementAndGet();
            drain();
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0062 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void innerSuccess(FlatMapSingleObserver<T, R>.InnerObserver innerObserver, R r10) {
            zi.a<R> orCreateQueue;
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.downstream.onNext(r10);
                    boolean z10 = this.active.decrementAndGet() == 0;
                    zi.a<R> aVar = this.queue.get();
                    if (z10 && (aVar == null || aVar.isEmpty())) {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            this.downstream.onError(thTerminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    orCreateQueue = getOrCreateQueue();
                    synchronized (orCreateQueue) {
                        orCreateQueue.offer(r10);
                    }
                    this.active.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                orCreateQueue = getOrCreateQueue();
                synchronized (orCreateQueue) {
                    orCreateQueue.offer(r10);
                    this.active.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            drainLoop();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.active.decrementAndGet();
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (!this.delayErrors) {
                this.set.dispose();
            }
            drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            try {
                v vVar = (v) qi.a.e(this.mapper.apply(t10), "The mapper returned a null SingleSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.b(innerObserver)) {
                    return;
                }
                vVar.b(innerObserver);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public FlatMapSingleObserver(r<? super R> rVar, o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.delayErrors = z10;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        this.f74487b.subscribe(new FlatMapSingleObserver(rVar, this.f61186c, this.f61187d));
    }

    public ObservableFlatMapSingle(p<T> pVar, o<? super T, ? extends v<? extends R>> oVar, boolean z10) {
        super(pVar);
        this.f61186c = oVar;
        this.f61187d = z10;
    }
}
