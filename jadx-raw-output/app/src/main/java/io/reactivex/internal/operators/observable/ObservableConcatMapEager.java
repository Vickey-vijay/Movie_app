package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import mi.b;
import oi.o;
import ri.c;
import ri.h;
import si.i;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableConcatMapEager<T, R> extends xi.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends p<? extends R>> f61153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ErrorMode f61154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61156f;

    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements r<T>, b, i<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        public int activeCount;
        public volatile boolean cancelled;
        public InnerQueuedObserver<R> current;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final ErrorMode errorMode;
        public final o<? super T, ? extends p<? extends R>> mapper;
        public final int maxConcurrency;
        public final int prefetch;
        public h<T> queue;
        public int sourceMode;
        public b upstream;
        public final AtomicThrowable error = new AtomicThrowable();
        public final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();

        @Override // mi.b
        public void dispose() {
            this.cancelled = true;
            if (getAndIncrement() == 0) {
                this.queue.clear();
                disposeAll();
            }
        }

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void disposeAll() {
            InnerQueuedObserver<R> innerQueuedObserver = this.current;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                InnerQueuedObserver<R> innerQueuedObserverPoll = this.observers.poll();
                if (innerQueuedObserverPoll == null) {
                    return;
                } else {
                    innerQueuedObserverPoll.dispose();
                }
            }
        }

        @Override // si.i
        public void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.upstream.dispose();
            }
            innerQueuedObserver.setDone();
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
                this.queue = new zi.a(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }

        public ConcatMapEagerMainObserver(r<? super R> rVar, o<? super T, ? extends p<? extends R>> oVar, int i10, int i11, ErrorMode errorMode) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.maxConcurrency = i10;
            this.prefetch = i11;
            this.errorMode = errorMode;
        }

        @Override // si.i
        public void drain() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            h<T> hVar = this.queue;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
            r<? super R> rVar = this.downstream;
            ErrorMode errorMode = this.errorMode;
            int iAddAndGet = 1;
            while (true) {
                int i10 = this.activeCount;
                while (i10 != this.maxConcurrency) {
                    if (this.cancelled) {
                        hVar.clear();
                        disposeAll();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                        hVar.clear();
                        disposeAll();
                        rVar.onError(this.error.terminate());
                        return;
                    }
                    try {
                        T tPoll = hVar.poll();
                        if (tPoll == null) {
                            break;
                        }
                        p pVar = (p) qi.a.e(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                        arrayDeque.offer(innerQueuedObserver);
                        pVar.subscribe(innerQueuedObserver);
                        i10++;
                    } catch (Throwable th2) {
                        ni.a.b(th2);
                        this.upstream.dispose();
                        hVar.clear();
                        disposeAll();
                        this.error.addThrowable(th2);
                        rVar.onError(this.error.terminate());
                        return;
                    }
                }
                this.activeCount = i10;
                if (this.cancelled) {
                    hVar.clear();
                    disposeAll();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                    hVar.clear();
                    disposeAll();
                    rVar.onError(this.error.terminate());
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == ErrorMode.BOUNDARY && this.error.get() != null) {
                        hVar.clear();
                        disposeAll();
                        rVar.onError(this.error.terminate());
                        return;
                    }
                    boolean z12 = this.done;
                    InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                    if (innerQueuedObserverPoll == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z11) {
                        if (this.error.get() != null) {
                            hVar.clear();
                            disposeAll();
                            rVar.onError(this.error.terminate());
                            return;
                        }
                        rVar.onComplete();
                        return;
                    }
                    if (!z11) {
                        this.current = innerQueuedObserverPoll;
                    }
                    innerQueuedObserver2 = innerQueuedObserverPoll;
                }
                if (innerQueuedObserver2 != null) {
                    h<R> hVarQueue = innerQueuedObserver2.queue();
                    while (true) {
                        if (this.cancelled) {
                            hVar.clear();
                            disposeAll();
                            return;
                        }
                        boolean zIsDone = innerQueuedObserver2.isDone();
                        if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                            hVar.clear();
                            disposeAll();
                            rVar.onError(this.error.terminate());
                            return;
                        }
                        try {
                            R rPoll = hVarQueue.poll();
                            if (rPoll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (zIsDone && z10) {
                                this.current = null;
                                this.activeCount--;
                            } else if (!z10) {
                                rVar.onNext(rPoll);
                            }
                        } catch (Throwable th3) {
                            ni.a.b(th3);
                            this.error.addThrowable(th3);
                            this.current = null;
                            this.activeCount--;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // si.i
        public void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            drain();
        }

        @Override // si.i
        public void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r10) {
            innerQueuedObserver.queue().offer(r10);
            drain();
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        this.f74487b.subscribe(new ConcatMapEagerMainObserver(rVar, this.f61153c, this.f61155e, this.f61156f, this.f61154d));
    }

    public ObservableConcatMapEager(p<T> pVar, o<? super T, ? extends p<? extends R>> oVar, ErrorMode errorMode, int i10, int i11) {
        super(pVar);
        this.f61153c = oVar;
        this.f61154d = errorMode;
        this.f61155e = i10;
        this.f61156f = i11;
    }
}
