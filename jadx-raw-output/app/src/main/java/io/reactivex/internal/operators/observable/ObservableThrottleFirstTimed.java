package io.reactivex.internal.operators.observable;

import dj.e;
import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableThrottleFirstTimed<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f61317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f61318e;

    public static final class DebounceTimedObserver<T> extends AtomicReference<b> implements r<T>, b, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        public boolean done;
        public final r<? super T> downstream;
        public volatile boolean gate;
        public final long timeout;
        public final TimeUnit unit;
        public b upstream;
        public final s.c worker;

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }

        @Override // mi.b
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.done) {
                ej.a.s(th2);
                return;
            }
            this.done = true;
            this.downstream.onError(th2);
            this.worker.dispose();
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.gate || this.done) {
                return;
            }
            this.gate = true;
            this.downstream.onNext(t10);
            b bVar = get();
            if (bVar != null) {
                bVar.dispose();
            }
            DisposableHelper.replace(this, this.worker.c(this, this.timeout, this.unit));
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public DebounceTimedObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar) {
            this.downstream = rVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = cVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new DebounceTimedObserver(new e(rVar), this.f61316c, this.f61317d, this.f61318e.a()));
    }

    public ObservableThrottleFirstTimed(p<T> pVar, long j10, TimeUnit timeUnit, s sVar) {
        super(pVar);
        this.f61316c = j10;
        this.f61317d = timeUnit;
        this.f61318e = sVar;
    }
}
