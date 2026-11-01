package io.reactivex.internal.operators.mixed;

import ej.a;
import ii.k;
import ii.r;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;
import ri.g;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableConcatMapSingle<T, R> extends k<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k<T> f61096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends v<? extends R>> f61097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ErrorMode f61098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61099e;

    public static final class ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements r<T>, b {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final ErrorMode errorMode;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);
        public R item;
        public final o<? super T, ? extends v<? extends R>> mapper;
        public final g<T> queue;
        public volatile int state;
        public b upstream;

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<b> implements u<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final ConcatMapSingleMainObserver<?, R> parent;

            @Override // ii.u
            public void onError(Throwable th2) {
                this.parent.innerError(th2);
            }

            @Override // ii.u
            public void onSuccess(R r10) {
                this.parent.innerSuccess(r10);
            }

            public ConcatMapSingleObserver(ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver) {
                this.parent = concatMapSingleMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // ii.u
            public void onSubscribe(b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                a.s(th2);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.dispose();
            }
            this.state = 0;
            drain();
        }

        public void innerSuccess(R r10) {
            this.item = r10;
            this.state = 2;
            drain();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                a.s(th2);
                return;
            }
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.queue.offer(t10);
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public ConcatMapSingleMainObserver(r<? super R> rVar, o<? super T, ? extends v<? extends R>> oVar, int i10, ErrorMode errorMode) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.errorMode = errorMode;
            this.queue = new zi.a(i10);
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super R> rVar = this.downstream;
            ErrorMode errorMode = this.errorMode;
            g<T> gVar = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            int iAddAndGet = 1;
            while (true) {
                if (this.cancelled) {
                    gVar.clear();
                    this.item = null;
                } else {
                    int i10 = this.state;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i10 == 0))) {
                        break;
                    }
                    boolean z10 = false;
                    if (i10 == 0) {
                        boolean z11 = this.done;
                        T tPoll = gVar.poll();
                        if (tPoll == null) {
                            z10 = true;
                        }
                        if (z11 && z10) {
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate == null) {
                                rVar.onComplete();
                                return;
                            } else {
                                rVar.onError(thTerminate);
                                return;
                            }
                        }
                        if (!z10) {
                            try {
                                v vVar = (v) qi.a.e(this.mapper.apply(tPoll), "The mapper returned a null SingleSource");
                                this.state = 1;
                                vVar.b(this.inner);
                            } catch (Throwable th2) {
                                ni.a.b(th2);
                                this.upstream.dispose();
                                gVar.clear();
                                atomicThrowable.addThrowable(th2);
                                rVar.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } else if (i10 == 2) {
                        R r10 = this.item;
                        this.item = null;
                        rVar.onNext(r10);
                        this.state = 0;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            gVar.clear();
            this.item = null;
            rVar.onError(atomicThrowable.terminate());
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super R> rVar) {
        if (wi.a.c(this.f61096b, this.f61097c, rVar)) {
            return;
        }
        this.f61096b.subscribe(new ConcatMapSingleMainObserver(rVar, this.f61097c, this.f61099e, this.f61098d));
    }

    public ObservableConcatMapSingle(k<T> kVar, o<? super T, ? extends v<? extends R>> oVar, ErrorMode errorMode, int i10) {
        this.f61096b = kVar;
        this.f61097c = oVar;
        this.f61098d = errorMode;
        this.f61099e = i10;
    }
}
