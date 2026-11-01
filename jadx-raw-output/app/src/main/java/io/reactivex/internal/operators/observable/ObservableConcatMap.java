package io.reactivex.internal.operators.observable;

import dj.e;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;
import ri.c;
import ri.h;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableConcatMap<T, U> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends p<? extends U>> f61150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ErrorMode f61152e;

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = -6951100001833242599L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final AtomicThrowable error = new AtomicThrowable();
        public final o<? super T, ? extends p<? extends R>> mapper;
        public final DelayErrorInnerObserver<R> observer;
        public h<T> queue;
        public int sourceMode;
        public final boolean tillTheEnd;
        public b upstream;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<b> implements r<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            public final r<? super R> downstream;
            public final ConcatMapDelayErrorObserver<?, R> parent;

            @Override // ii.r
            public void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.drain();
            }

            @Override // ii.r
            public void onError(Throwable th2) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                if (!concatMapDelayErrorObserver.error.addThrowable(th2)) {
                    ej.a.s(th2);
                    return;
                }
                if (!concatMapDelayErrorObserver.tillTheEnd) {
                    concatMapDelayErrorObserver.upstream.dispose();
                }
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.drain();
            }

            @Override // ii.r
            public void onNext(R r10) {
                this.downstream.onNext(r10);
            }

            public DelayErrorInnerObserver(r<? super R> rVar, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.downstream = rVar;
                this.parent = concatMapDelayErrorObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // ii.r
            public void onSubscribe(b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.dispose();
        }

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                ej.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.sourceMode == 0) {
                this.queue.offer(t10);
            }
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new zi.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        public ConcatMapDelayErrorObserver(r<? super R> rVar, o<? super T, ? extends p<? extends R>> oVar, int i10, boolean z10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.bufferSize = i10;
            this.tillTheEnd = z10;
            this.observer = new DelayErrorInnerObserver<>(rVar, this);
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super R> rVar = this.downstream;
            h<T> hVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        hVar.clear();
                        return;
                    }
                    if (!this.tillTheEnd && atomicThrowable.get() != null) {
                        hVar.clear();
                        this.cancelled = true;
                        rVar.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z11 = this.done;
                    try {
                        T tPoll = hVar.poll();
                        if (tPoll == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z11 && z10) {
                            this.cancelled = true;
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                rVar.onError(thTerminate);
                                return;
                            } else {
                                rVar.onComplete();
                                return;
                            }
                        }
                        if (!z10) {
                            try {
                                p pVar = (p) qi.a.e(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (pVar instanceof Callable) {
                                    try {
                                        a.h hVar2 = (Object) ((Callable) pVar).call();
                                        if (hVar2 != null && !this.cancelled) {
                                            rVar.onNext(hVar2);
                                        }
                                    } catch (Throwable th2) {
                                        ni.a.b(th2);
                                        atomicThrowable.addThrowable(th2);
                                    }
                                } else {
                                    this.active = true;
                                    pVar.subscribe(this.observer);
                                }
                            } catch (Throwable th3) {
                                ni.a.b(th3);
                                this.cancelled = true;
                                this.upstream.dispose();
                                hVar.clear();
                                atomicThrowable.addThrowable(th3);
                                rVar.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        ni.a.b(th4);
                        this.cancelled = true;
                        this.upstream.dispose();
                        atomicThrowable.addThrowable(th4);
                        rVar.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 8828587559905699186L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean disposed;
        public volatile boolean done;
        public final r<? super U> downstream;
        public int fusionMode;
        public final InnerObserver<U> inner;
        public final o<? super T, ? extends p<? extends U>> mapper;
        public h<T> queue;
        public b upstream;

        public static final class InnerObserver<U> extends AtomicReference<b> implements r<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            public final r<? super U> downstream;
            public final SourceObserver<?, ?> parent;

            @Override // ii.r
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // ii.r
            public void onError(Throwable th2) {
                this.parent.dispose();
                this.downstream.onError(th2);
            }

            @Override // ii.r
            public void onNext(U u10) {
                this.downstream.onNext(u10);
            }

            public InnerObserver(r<? super U> rVar, SourceObserver<?, ?> sourceObserver) {
                this.downstream = rVar;
                this.parent = sourceObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // ii.r
            public void onSubscribe(b bVar) {
                DisposableHelper.set(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.disposed = true;
            this.inner.dispose();
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // ii.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.done) {
                ej.a.s(th2);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
                this.queue.offer(t10);
            }
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new zi.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        public SourceObserver(r<? super U> rVar, o<? super T, ? extends p<? extends U>> oVar, int i10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.bufferSize = i10;
            this.inner = new InnerObserver<>(rVar, this);
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.disposed) {
                if (!this.active) {
                    boolean z11 = this.done;
                    try {
                        T tPoll = this.queue.poll();
                        if (tPoll == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z11 && z10) {
                            this.disposed = true;
                            this.downstream.onComplete();
                            return;
                        } else if (!z10) {
                            try {
                                p pVar = (p) qi.a.e(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.active = true;
                                pVar.subscribe(this.inner);
                            } catch (Throwable th2) {
                                ni.a.b(th2);
                                dispose();
                                this.queue.clear();
                                this.downstream.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        ni.a.b(th3);
                        dispose();
                        this.queue.clear();
                        this.downstream.onError(th3);
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

    @Override // ii.k
    public void subscribeActual(r<? super U> rVar) {
        if (ObservableScalarXMap.b(this.f74487b, rVar, this.f61150c)) {
            return;
        }
        if (this.f61152e == ErrorMode.IMMEDIATE) {
            this.f74487b.subscribe(new SourceObserver(new e(rVar), this.f61150c, this.f61151d));
        } else {
            this.f74487b.subscribe(new ConcatMapDelayErrorObserver(rVar, this.f61150c, this.f61151d, this.f61152e == ErrorMode.END));
        }
    }

    public ObservableConcatMap(p<T> pVar, o<? super T, ? extends p<? extends U>> oVar, int i10, ErrorMode errorMode) {
        super(pVar);
        this.f61150c = oVar;
        this.f61152e = errorMode;
        this.f61151d = Math.max(8, i10);
    }
}
