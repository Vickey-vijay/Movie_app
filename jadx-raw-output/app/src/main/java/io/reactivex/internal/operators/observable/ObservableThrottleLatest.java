package io.reactivex.internal.operators.observable;

import ii.k;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableThrottleLatest<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f61320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f61321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61322f;

    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements r<T>, b, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final r<? super T> downstream;
        public final boolean emitLast;
        public Throwable error;
        public final AtomicReference<T> latest = new AtomicReference<>();
        public final long timeout;
        public volatile boolean timerFired;
        public boolean timerRunning;
        public final TimeUnit unit;
        public b upstream;
        public final s.c worker;

        @Override // mi.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.latest.set(t10);
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public ThrottleLatestObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar, boolean z10) {
            this.downstream = rVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = cVar;
            this.emitLast = z10;
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            r<? super T> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z11 = this.done;
                if (z11 && this.error != null) {
                    atomicReference.lazySet(null);
                    rVar.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                if (atomicReference.get() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z10 && this.emitLast) {
                        rVar.onNext(andSet);
                    }
                    rVar.onComplete();
                    this.worker.dispose();
                    return;
                }
                if (z10) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    rVar.onNext(atomicReference.getAndSet(null));
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.c(this, this.timeout, this.unit);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new ThrottleLatestObserver(rVar, this.f61319c, this.f61320d, this.f61321e.a(), this.f61322f));
    }

    public ObservableThrottleLatest(k<T> kVar, long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        super(kVar);
        this.f61319c = j10;
        this.f61320d = timeUnit;
        this.f61321e = sVar;
        this.f61322f = z10;
    }
}
