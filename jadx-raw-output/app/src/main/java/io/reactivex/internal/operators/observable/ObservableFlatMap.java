package io.reactivex.internal.operators.observable;

import androidx.lifecycle.e;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;
import ri.c;
import ri.g;
import ri.h;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableFlatMap<T, U> extends xi.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends p<? extends U>> f61174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61177f;

    public static final class InnerObserver<T, U> extends AtomicReference<b> implements r<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        public volatile boolean done;
        public int fusionMode;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final long f61178id;
        public final MergeObserver<T, U> parent;
        public volatile h<U> queue;

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.parent.errors.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.parent;
            if (!mergeObserver.delayErrors) {
                mergeObserver.disposeAll();
            }
            this.done = true;
            this.parent.drain();
        }

        @Override // ii.r
        public void onNext(U u10) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u10, this);
            } else {
                this.parent.drain();
            }
        }

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j10) {
            this.f61178id = j10;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this, bVar) && (bVar instanceof c)) {
                c cVar = (c) bVar;
                int iRequestFusion = cVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                }
            }
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements b, r<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final r<? super U> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final o<? super T, ? extends p<? extends U>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<InnerObserver<?, ?>[]> observers;
        public volatile g<U> queue;
        public Queue<p<? extends U>> sources;
        public long uniqueId;
        public b upstream;
        public int wip;
        public static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        public static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];

        public boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    g<U> aVar = this.queue;
                    if (aVar == null) {
                        aVar = this.maxConcurrency == Integer.MAX_VALUE ? new zi.a<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                        this.queue = aVar;
                    }
                    if (!aVar.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.errors.addThrowable(th2);
                drain();
                return true;
            }
        }

        public boolean addInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!e.a(this.observers, innerObserverArr, innerObserverArr2));
            return true;
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th2 = this.errors.get();
            if (this.delayErrors || th2 == null) {
                return false;
            }
            disposeAll();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.f61400a) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        @Override // mi.b
        public void dispose() {
            Throwable thTerminate;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!disposeAll() || (thTerminate = this.errors.terminate()) == null || thTerminate == ExceptionHelper.f61400a) {
                return;
            }
            ej.a.s(thTerminate);
        }

        public boolean disposeAll() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = CANCELLED;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:118:0x00ea A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x00f1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            int size;
            boolean z10;
            r<? super U> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                g<U> gVar = this.queue;
                if (gVar != null) {
                    while (!checkTerminate()) {
                        U uPoll = gVar.poll();
                        if (uPoll != null) {
                            rVar.onNext(uPoll);
                        }
                    }
                    return;
                }
                boolean z11 = this.done;
                g<U> gVar2 = this.queue;
                InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                boolean z12 = false;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.sources.size();
                    }
                } else {
                    size = 0;
                }
                if (z11 && ((gVar2 == null || gVar2.isEmpty()) && length == 0 && size == 0)) {
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != ExceptionHelper.f61400a) {
                        if (thTerminate == null) {
                            rVar.onComplete();
                            return;
                        } else {
                            rVar.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j10 = this.lastId;
                    int i10 = this.lastIndex;
                    if (length <= i10 || innerObserverArr[i10].f61178id != j10) {
                        if (length <= i10) {
                            i10 = 0;
                        }
                        for (int i11 = 0; i11 < length && innerObserverArr[i10].f61178id != j10; i11++) {
                            i10++;
                            if (i10 == length) {
                                i10 = 0;
                            }
                        }
                        this.lastIndex = i10;
                        this.lastId = innerObserverArr[i10].f61178id;
                    }
                    boolean z13 = false;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (checkTerminate()) {
                            return;
                        }
                        InnerObserver<T, U> innerObserver = innerObserverArr[i10];
                        h<U> hVar = innerObserver.queue;
                        if (hVar != null) {
                            do {
                                try {
                                    U uPoll2 = hVar.poll();
                                    if (uPoll2 == null) {
                                        z10 = innerObserver.done;
                                        h<U> hVar2 = innerObserver.queue;
                                        if (z10 && (hVar2 == null || hVar2.isEmpty())) {
                                            removeInner(innerObserver);
                                            if (checkTerminate()) {
                                                return;
                                            } else {
                                                z13 = true;
                                            }
                                        }
                                        i10++;
                                        if (i10 == length) {
                                            i10 = 0;
                                        }
                                    } else {
                                        rVar.onNext(uPoll2);
                                    }
                                } catch (Throwable th2) {
                                    ni.a.b(th2);
                                    innerObserver.dispose();
                                    this.errors.addThrowable(th2);
                                    if (checkTerminate()) {
                                        return;
                                    }
                                    removeInner(innerObserver);
                                    i10++;
                                    if (i10 == length) {
                                        i10 = 0;
                                    }
                                    z13 = true;
                                }
                            } while (!checkTerminate());
                            return;
                        }
                        z10 = innerObserver.done;
                        h<U> hVar3 = innerObserver.queue;
                        if (z10) {
                            removeInner(innerObserver);
                            if (checkTerminate()) {
                                return;
                            } else {
                                z13 = true;
                            }
                        }
                        i10++;
                        if (i10 == length) {
                            i10 = 0;
                        }
                    }
                    this.lastIndex = i10;
                    this.lastId = innerObserverArr[i10].f61178id;
                    z12 = z13;
                }
                if (!z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        p<? extends U> pVarPoll = this.sources.poll();
                        if (pVarPoll == null) {
                            this.wip--;
                        } else {
                            subscribeInner(pVarPoll);
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
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
            } else if (!this.errors.addThrowable(th2)) {
                ej.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                p<? extends U> pVar = (p) qi.a.e(this.mapper.apply(t10), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.wip;
                        if (i10 == this.maxConcurrency) {
                            this.sources.offer(pVar);
                            return;
                        }
                        this.wip = i10 + 1;
                    }
                }
                subscribeInner(pVar);
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

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerObserverArr[i11] == innerObserver) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = EMPTY;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i10);
                    System.arraycopy(innerObserverArr, i10 + 1, innerObserverArr3, i10, (length - i10) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!e.a(this.observers, innerObserverArr, innerObserverArr2));
        }

        public void subscribeInner(p<? extends U> pVar) {
            p<? extends U> pVarPoll;
            while (pVar instanceof Callable) {
                if (!tryEmitScalar((Callable) pVar) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                boolean z10 = false;
                synchronized (this) {
                    pVarPoll = this.sources.poll();
                    if (pVarPoll == null) {
                        this.wip--;
                        z10 = true;
                    }
                }
                if (z10) {
                    drain();
                    return;
                }
                pVar = pVarPoll;
            }
            long j10 = this.uniqueId;
            this.uniqueId = 1 + j10;
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j10);
            if (addInner(innerObserver)) {
                pVar.subscribe(innerObserver);
            }
        }

        public MergeObserver(r<? super U> rVar, o<? super T, ? extends p<? extends U>> oVar, boolean z10, int i10, int i11) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.delayErrors = z10;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i10);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void tryEmit(U u10, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                h aVar = innerObserver.queue;
                if (aVar == null) {
                    aVar = new zi.a(this.bufferSize);
                    innerObserver.queue = aVar;
                }
                aVar.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super U> rVar) {
        if (ObservableScalarXMap.b(this.f74487b, rVar, this.f61174c)) {
            return;
        }
        this.f74487b.subscribe(new MergeObserver(rVar, this.f61174c, this.f61175d, this.f61176e, this.f61177f));
    }

    public ObservableFlatMap(p<T> pVar, o<? super T, ? extends p<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(pVar);
        this.f61174c = oVar;
        this.f61175d = z10;
        this.f61176e = i10;
        this.f61177f = i11;
    }
}
