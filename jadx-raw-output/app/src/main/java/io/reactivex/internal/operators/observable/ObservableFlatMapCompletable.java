package io.reactivex.internal.operators.observable;

import ii.c;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableFlatMapCompletable<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends c> f61179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61180d;

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements r<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final r<? super T> downstream;
        public final o<? super T, ? extends c> mapper;
        public b upstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final mi.a set = new mi.a();

        public final class InnerObserver extends AtomicReference<b> implements ii.b, b {
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
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public void clear() {
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public T poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.d
        public int requestFusion(int i10) {
            return i10 & 2;
        }

        public void innerComplete(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            onComplete();
        }

        public void innerError(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th2) {
            this.set.delete(innerObserver);
            onError(th2);
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
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
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public FlatMapCompletableMainObserver(r<? super T> rVar, o<? super T, ? extends c> oVar, boolean z10) {
            this.downstream = rVar;
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

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new FlatMapCompletableMainObserver(rVar, this.f61179c, this.f61180d));
    }

    public ObservableFlatMapCompletable(p<T> pVar, o<? super T, ? extends c> oVar, boolean z10) {
        super(pVar);
        this.f61179c = oVar;
        this.f61180d = z10;
    }
}
