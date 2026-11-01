package io.reactivex.internal.operators.observable;

import dj.e;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSampleWithObservable<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<?> f61269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61270d;

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public volatile boolean done;
        public final AtomicInteger wip;

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeMain() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeOther() {
            this.done = true;
            if (this.wip.getAndIncrement() == 0) {
                emit();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void run() {
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.done;
                    emit();
                    if (z10) {
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }

        public SampleMainEmitLast(r<? super T> rVar, p<?> pVar) {
            super(rVar, pVar);
            this.wip = new AtomicInteger();
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeMain() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void completeOther() {
            this.downstream.onComplete();
        }

        public SampleMainNoLast(r<? super T> rVar, p<?> pVar) {
            super(rVar, pVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void run() {
            emit();
        }
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements r<T>, b {
        private static final long serialVersionUID = -3517602651313910099L;
        public final r<? super T> downstream;
        public final AtomicReference<b> other = new AtomicReference<>();
        public final p<?> sampler;
        public b upstream;

        public abstract void completeMain();

        public abstract void completeOther();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        public abstract void run();

        public void complete() {
            this.upstream.dispose();
            completeOther();
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.other);
            this.upstream.dispose();
        }

        public void error(Throwable th2) {
            this.upstream.dispose();
            this.downstream.onError(th2);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.other.get() == DisposableHelper.DISPOSED;
        }

        @Override // ii.r
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            completeMain();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new a(this));
                }
            }
        }

        public boolean setOther(b bVar) {
            return DisposableHelper.setOnce(this.other, bVar);
        }

        public SampleMainObserver(r<? super T> rVar, p<?> pVar) {
            this.downstream = rVar;
            this.sampler = pVar;
        }

        @Override // ii.r
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    public static final class a<T> implements r<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SampleMainObserver<T> f61271b;

        @Override // ii.r
        public void onComplete() {
            this.f61271b.complete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f61271b.error(th2);
        }

        @Override // ii.r
        public void onNext(Object obj) {
            this.f61271b.run();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.f61271b.setOther(bVar);
        }

        public a(SampleMainObserver<T> sampleMainObserver) {
            this.f61271b = sampleMainObserver;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        e eVar = new e(rVar);
        if (this.f61270d) {
            this.f74487b.subscribe(new SampleMainEmitLast(eVar, this.f61269c));
        } else {
            this.f74487b.subscribe(new SampleMainNoLast(eVar, this.f61269c));
        }
    }

    public ObservableSampleWithObservable(p<T> pVar, p<?> pVar2, boolean z10) {
        super(pVar);
        this.f61269c = pVar2;
        this.f61270d = z10;
    }
}
