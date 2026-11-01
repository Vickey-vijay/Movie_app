package io.reactivex.internal.operators.observable;

import dj.e;
import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableSampleTimed<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f61266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f61267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61268f;

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip;

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }

        public SampleTimedEmitLast(r<? super T> rVar, long j10, TimeUnit timeUnit, s sVar) {
            super(rVar, j10, timeUnit, sVar);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void complete() {
            this.downstream.onComplete();
        }

        public SampleTimedNoLast(r<? super T> rVar, long j10, TimeUnit timeUnit, s sVar) {
            super(rVar, j10, timeUnit, sVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements r<T>, b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final r<? super T> downstream;
        public final long period;
        public final s scheduler;
        public final AtomicReference<b> timer = new AtomicReference<>();
        public final TimeUnit unit;
        public b upstream;

        public abstract void complete();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
                s sVar = this.scheduler;
                long j10 = this.period;
                DisposableHelper.replace(this.timer, sVar.e(this, j10, j10, this.unit));
            }
        }

        public SampleTimedObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s sVar) {
            this.downstream = rVar;
            this.period = j10;
            this.unit = timeUnit;
            this.scheduler = sVar;
        }

        @Override // mi.b
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        @Override // ii.r
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            cancelTimer();
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        e eVar = new e(rVar);
        if (this.f61268f) {
            this.f74487b.subscribe(new SampleTimedEmitLast(eVar, this.f61265c, this.f61266d, this.f61267e));
        } else {
            this.f74487b.subscribe(new SampleTimedNoLast(eVar, this.f61265c, this.f61266d, this.f61267e));
        }
    }

    public ObservableSampleTimed(p<T> pVar, long j10, TimeUnit timeUnit, s sVar, boolean z10) {
        super(pVar);
        this.f61265c = j10;
        this.f61266d = timeUnit;
        this.f61267e = sVar;
        this.f61268f = z10;
    }
}
