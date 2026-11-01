package io.reactivex.internal.operators.observable;

import ii.k;
import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimeoutTimed<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f61327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f61328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<? extends T> f61329f;

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<mi.b> implements r<T>, mi.b, b {
        private static final long serialVersionUID = 3764492702657003550L;
        public final r<? super T> downstream;
        public p<? extends T> fallback;
        public final long timeout;
        public final TimeUnit unit;
        public final s.c worker;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicLong index = new AtomicLong();
        public final AtomicReference<mi.b> upstream = new AtomicReference<>();

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.worker.dispose();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ej.a.s(th2);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th2);
            this.worker.dispose();
        }

        @Override // ii.r
        public void onNext(T t10) {
            long j10 = this.index.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.index.compareAndSet(j10, j11)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t10);
                    startTimeout(j11);
                }
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                p<? extends T> pVar = this.fallback;
                this.fallback = null;
                pVar.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j10) {
            this.task.replace(this.worker.c(new c(j10, this), this.timeout, this.unit));
        }

        public TimeoutFallbackObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar, p<? extends T> pVar) {
            this.downstream = rVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = pVar;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements r<T>, mi.b, b {
        private static final long serialVersionUID = 3764492702657003550L;
        public final r<? super T> downstream;
        public final long timeout;
        public final TimeUnit unit;
        public final s.c worker;
        public final SequentialDisposable task = new SequentialDisposable();
        public final AtomicReference<mi.b> upstream = new AtomicReference<>();

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.worker.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public void startTimeout(long j10) {
            this.task.replace(this.worker.c(new c(j10, this), this.timeout, this.unit));
        }

        public TimeoutObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar) {
            this.downstream = rVar;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // ii.r
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t10);
                    startTimeout(j11);
                }
            }
        }

        @Override // ii.r
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th2);
                this.worker.dispose();
                return;
            }
            ej.a.s(th2);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.c(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }
    }

    public static final class a<T> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super T> f61330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<mi.b> f61331c;

        @Override // ii.r
        public void onComplete() {
            this.f61330b.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f61330b.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f61330b.onNext(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            DisposableHelper.replace(this.f61331c, bVar);
        }

        public a(r<? super T> rVar, AtomicReference<mi.b> atomicReference) {
            this.f61330b = rVar;
            this.f61331c = atomicReference;
        }
    }

    public interface b {
        void onTimeout(long j10);
    }

    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f61332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f61333c;

        @Override // java.lang.Runnable
        public void run() {
            this.f61332b.onTimeout(this.f61333c);
        }

        public c(long j10, b bVar) {
            this.f61333c = j10;
            this.f61332b = bVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        if (this.f61329f == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(rVar, this.f61326c, this.f61327d, this.f61328e.a());
            rVar.onSubscribe(timeoutObserver);
            timeoutObserver.startTimeout(0L);
            this.f74487b.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(rVar, this.f61326c, this.f61327d, this.f61328e.a(), this.f61329f);
        rVar.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startTimeout(0L);
        this.f74487b.subscribe(timeoutFallbackObserver);
    }

    public ObservableTimeoutTimed(k<T> kVar, long j10, TimeUnit timeUnit, s sVar, p<? extends T> pVar) {
        super(kVar);
        this.f61326c = j10;
        this.f61327d = timeUnit;
        this.f61328e = sVar;
        this.f61329f = pVar;
    }
}
