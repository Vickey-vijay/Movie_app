package io.reactivex.internal.operators.mixed;

import ii.a;
import ii.c;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;
import ri.h;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableConcatMapCompletable<T> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f61088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends c> f61089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ErrorMode f61090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61091d;

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 3610901111000061034L;
        public volatile boolean active;
        public volatile boolean disposed;
        public volatile boolean done;
        public final ii.b downstream;
        public final ErrorMode errorMode;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
        public final o<? super T, ? extends c> mapper;
        public final int prefetch;
        public h<T> queue;
        public b upstream;

        public static final class ConcatMapInnerObserver extends AtomicReference<b> implements ii.b {
            private static final long serialVersionUID = 5638352172918776687L;
            public final ConcatMapCompletableObserver<?> parent;

            @Override // ii.b
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // ii.b
            public void onError(Throwable th2) {
                this.parent.innerError(th2);
            }

            public ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.parent = concatMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // ii.b
            public void onSubscribe(b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.active = false;
                drain();
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.f61400a) {
                this.downstream.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.done = true;
                drain();
                return;
            }
            this.disposed = true;
            this.inner.dispose();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.f61400a) {
                this.downstream.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (t10 != null) {
                this.queue.offer(t10);
            }
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof ri.c) {
                    ri.c cVar = (ri.c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new zi.a(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }

        public ConcatMapCompletableObserver(ii.b bVar, o<? super T, ? extends c> oVar, ErrorMode errorMode, int i10) {
            this.downstream = bVar;
            this.mapper = oVar;
            this.errorMode = errorMode;
            this.prefetch = i10;
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.errors;
            ErrorMode errorMode = this.errorMode;
            while (!this.disposed) {
                if (!this.active) {
                    if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.disposed = true;
                        this.queue.clear();
                        this.downstream.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z11 = this.done;
                    c cVar = null;
                    try {
                        T tPoll = this.queue.poll();
                        if (tPoll != null) {
                            cVar = (c) qi.a.e(this.mapper.apply(tPoll), "The mapper returned a null CompletableSource");
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z11 && z10) {
                            this.disposed = true;
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                this.downstream.onError(thTerminate);
                                return;
                            } else {
                                this.downstream.onComplete();
                                return;
                            }
                        }
                        if (!z10) {
                            this.active = true;
                            cVar.b(this.inner);
                        }
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.disposed = true;
                        this.queue.clear();
                        this.upstream.dispose();
                        atomicThrowable.addThrowable(th2);
                        this.downstream.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }
    }

    @Override // ii.a
    public void f(ii.b bVar) {
        if (wi.a.a(this.f61088a, this.f61089b, bVar)) {
            return;
        }
        this.f61088a.subscribe(new ConcatMapCompletableObserver(bVar, this.f61089b, this.f61090c, this.f61091d));
    }

    public ObservableConcatMapCompletable(k<T> kVar, o<? super T, ? extends c> oVar, ErrorMode errorMode, int i10) {
        this.f61088a = kVar;
        this.f61089b = oVar;
        this.f61090c = errorMode;
        this.f61091d = i10;
    }
}
