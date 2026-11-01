package io.reactivex.internal.operators.observable;

import ii.c;
import ii.k;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import oi.o;
import ri.b;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends ii.a implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<T> f61181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends c> f61182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61183c;

    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements mi.b, r<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final ii.b downstream;
        public final o<? super T, ? extends c> mapper;
        public mi.b upstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final mi.a set = new mi.a();

        public final class InnerObserver extends AtomicReference<mi.b> implements ii.b, mi.b {
            private static final long serialVersionUID = 8606673141535671828L;

            public InnerObserver() {
            }

            @Override // ii.b
            public void onComplete() {
                FlatMapCompletableMainObserver.this.innerComplete(this);
            }

            @Override // ii.b
            public void onError(Throwable th2) {
                FlatMapCompletableMainObserver.this.innerError(this, th2);
            }

            @Override // mi.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // mi.b
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // ii.b
            public void onSubscribe(mi.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public void innerComplete(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            onComplete();
        }

        public void innerError(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th2) {
            this.set.delete(innerObserver);
            onError(th2);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (this.delayErrors) {
                if (decrementAndGet() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            try {
                c cVar = (c) qi.a.e(this.mapper.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.disposed || !this.set.b(innerObserver)) {
                    return;
                }
                cVar.b(innerObserver);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public FlatMapCompletableMainObserver(ii.b bVar, o<? super T, ? extends c> oVar, boolean z10) {
            this.downstream = bVar;
            this.mapper = oVar;
            this.delayErrors = z10;
            lazySet(1);
        }

        @Override // ii.r
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTerminate = this.errors.terminate();
                if (thTerminate != null) {
                    this.downstream.onError(thTerminate);
                } else {
                    this.downstream.onComplete();
                }
            }
        }
    }

    @Override // ri.b
    public k<T> a() {
        return ej.a.o(new ObservableFlatMapCompletable(this.f61181a, this.f61182b, this.f61183c));
    }

    @Override // ii.a
    public void f(ii.b bVar) {
        this.f61181a.subscribe(new FlatMapCompletableMainObserver(bVar, this.f61182b, this.f61183c));
    }

    public ObservableFlatMapCompletableCompletable(p<T> pVar, o<? super T, ? extends c> oVar, boolean z10) {
        this.f61181a = pVar;
        this.f61182b = oVar;
        this.f61183c = z10;
    }
}
