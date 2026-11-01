package io.reactivex.internal.operators.flowable;

import ii.f;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;
import qo.c;
import ri.e;
import ri.g;
import ri.h;
import ui.a;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMap<T, U> extends a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super T, ? extends qo.a<? extends U>> f61070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f61073g;

    public static final class InnerSubscriber<T, U> extends AtomicReference<c> implements f<U>, b {
        private static final long serialVersionUID = -4606175640614850599L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final long f61074id;
        public final int limit;
        public final MergeSubscriber<T, U> parent;
        public long produced;
        public volatile h<U> queue;

        @Override // qo.b
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th2);
        }

        @Override // qo.b
        public void onNext(U u10) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u10, this);
            } else {
                this.parent.drain();
            }
        }

        public void requestMore(long j10) {
            if (this.fusionMode != 1) {
                long j11 = this.produced + j10;
                if (j11 < this.limit) {
                    this.produced = j11;
                } else {
                    this.produced = 0L;
                    get().request(j11);
                }
            }
        }

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j10) {
            this.f61074id = j10;
            this.parent = mergeSubscriber;
            int i10 = mergeSubscriber.bufferSize;
            this.bufferSize = i10;
            this.limit = i10 >> 2;
        }

        @Override // mi.b
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.setOnce(this, cVar)) {
                if (cVar instanceof e) {
                    e eVar = (e) cVar;
                    int iRequestFusion = eVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = eVar;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = eVar;
                    }
                }
                cVar.request(this.bufferSize);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements f<T>, c {
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final qo.b<? super U> downstream;
        public final AtomicThrowable errs = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final o<? super T, ? extends qo.a<? extends U>> mapper;
        public final int maxConcurrency;
        public volatile g<U> queue;
        public final AtomicLong requested;
        public int scalarEmitted;
        public final int scalarLimit;
        public final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        public long uniqueId;
        public c upstream;
        public static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        public static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];

        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!androidx.lifecycle.e.a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        @Override // qo.c
        public void cancel() {
            g<U> gVar;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeAll();
            if (getAndIncrement() != 0 || (gVar = this.queue) == null) {
                return;
            }
            gVar.clear();
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            clearScalarQueue();
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate != ExceptionHelper.f61400a) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        public void clearScalarQueue() {
            g<U> gVar = this.queue;
            if (gVar != null) {
                gVar.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.dispose();
            }
            Throwable thTerminate = this.errs.terminate();
            if (thTerminate == null || thTerminate == ExceptionHelper.f61400a) {
                return;
            }
            ej.a.s(thTerminate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            long j10;
            long j11;
            boolean z10;
            int i10;
            int i11;
            long j12;
            Object obj;
            qo.b<? super U> bVar = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                g<U> gVar = this.queue;
                long jAddAndGet = this.requested.get();
                boolean z11 = jAddAndGet == Long.MAX_VALUE;
                long j13 = 0;
                long j14 = 0;
                if (gVar != null) {
                    do {
                        long j15 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            U uPoll = gVar.poll();
                            if (checkTerminate()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            bVar.onNext(uPoll);
                            j14++;
                            j15++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j15 != 0) {
                            jAddAndGet = z11 ? Long.MAX_VALUE : this.requested.addAndGet(-j15);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z12 = this.done;
                g<U> gVar2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (z12 && ((gVar2 == null || gVar2.isEmpty()) && length == 0)) {
                    Throwable thTerminate = this.errs.terminate();
                    if (thTerminate != ExceptionHelper.f61400a) {
                        if (thTerminate == null) {
                            bVar.onComplete();
                            return;
                        } else {
                            bVar.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                int i12 = iAddAndGet;
                if (length != 0) {
                    long j16 = this.lastId;
                    int i13 = this.lastIndex;
                    if (length <= i13 || innerSubscriberArr[i13].f61074id != j16) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && innerSubscriberArr[i13].f61074id != j16; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.lastIndex = i13;
                        this.lastId = innerSubscriberArr[i13].f61074id;
                    }
                    int i15 = i13;
                    boolean z13 = false;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (checkTerminate()) {
                            return;
                        }
                        InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr[i15];
                        Object obj2 = null;
                        while (!checkTerminate()) {
                            h<U> hVar = innerSubscriber.queue;
                            if (hVar == null) {
                                i10 = length;
                            } else {
                                i10 = length;
                                Object obj3 = obj2;
                                long j17 = j13;
                                while (jAddAndGet != j13) {
                                    try {
                                        U uPoll2 = hVar.poll();
                                        if (uPoll2 == null) {
                                            obj3 = uPoll2;
                                            j13 = 0;
                                            break;
                                        }
                                        bVar.onNext(uPoll2);
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j17++;
                                        obj3 = uPoll2;
                                        j13 = 0;
                                    } catch (Throwable th2) {
                                        ni.a.b(th2);
                                        innerSubscriber.dispose();
                                        this.errs.addThrowable(th2);
                                        if (!this.delayErrors) {
                                            this.upstream.cancel();
                                        }
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        removeInner(innerSubscriber);
                                        i16++;
                                        z13 = true;
                                        i11 = 1;
                                    }
                                }
                                if (j17 != j13) {
                                    jAddAndGet = !z11 ? this.requested.addAndGet(-j17) : Long.MAX_VALUE;
                                    innerSubscriber.requestMore(j17);
                                    j12 = 0;
                                } else {
                                    j12 = j13;
                                }
                                if (jAddAndGet != j12 && obj3 != null) {
                                    length = i10;
                                    obj2 = obj3;
                                    j13 = 0;
                                }
                            }
                            boolean z14 = innerSubscriber.done;
                            h<U> hVar2 = innerSubscriber.queue;
                            if (z14 && (hVar2 == null || hVar2.isEmpty())) {
                                removeInner(innerSubscriber);
                                if (checkTerminate()) {
                                    return;
                                }
                                j14++;
                                z13 = true;
                            }
                            if (jAddAndGet == 0) {
                                z10 = z13;
                                break;
                            }
                            i15++;
                            if (i15 == i10) {
                                i15 = 0;
                            }
                            i11 = 1;
                            i16 += i11;
                            length = i10;
                            j13 = 0;
                        }
                        return;
                    }
                    this.lastIndex = i15;
                    this.lastId = innerSubscriberArr[i15].f61074id;
                    j11 = j14;
                    j10 = 0;
                } else {
                    j10 = 0;
                    j11 = j14;
                    z10 = false;
                }
                if (j11 != j10 && !this.cancelled) {
                    this.upstream.request(j11);
                }
                if (z10) {
                    iAddAndGet = i12;
                } else {
                    iAddAndGet = addAndGet(-i12);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public h<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            h<U> hVar = innerSubscriber.queue;
            if (hVar != null) {
                return hVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
            innerSubscriber.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        public h<U> getMainQueue() {
            g<U> aVar = this.queue;
            if (aVar == null) {
                aVar = this.maxConcurrency == Integer.MAX_VALUE ? new zi.a<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = aVar;
            }
            return aVar;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th2) {
            if (!this.errs.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            innerSubscriber.done = true;
            if (!this.delayErrors) {
                this.upstream.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                    innerSubscriber2.dispose();
                }
            }
            drain();
        }

        @Override // qo.b
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            if (this.done) {
                ej.a.s(th2);
            } else if (!this.errs.addThrowable(th2)) {
                ej.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qo.b
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                qo.a aVar = (qo.a) qi.a.e(this.mapper.apply(t10), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    long j10 = this.uniqueId;
                    this.uniqueId = 1 + j10;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j10);
                    if (addInner(innerSubscriber)) {
                        aVar.a(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall != null) {
                        tryEmitScalar(objCall);
                        return;
                    }
                    if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                        return;
                    }
                    int i10 = this.scalarEmitted + 1;
                    this.scalarEmitted = i10;
                    int i11 = this.scalarLimit;
                    if (i10 == i11) {
                        this.scalarEmitted = 0;
                        this.upstream.request(i11);
                    }
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.errs.addThrowable(th2);
                    drain();
                }
            } catch (Throwable th3) {
                ni.a.b(th3);
                this.upstream.cancel();
                onError(th3);
            }
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                int i10 = this.maxConcurrency;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i10);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerSubscriberArr[i11] == innerSubscriber) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = EMPTY;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!androidx.lifecycle.e.a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
        }

        public MergeSubscriber(qo.b<? super U> bVar, o<? super T, ? extends qo.a<? extends U>> oVar, boolean z10, int i10, int i11) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = bVar;
            this.mapper = oVar;
            this.delayErrors = z10;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            this.scalarLimit = Math.max(1, i10 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // qo.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                bj.b.a(this.requested, j10);
                drain();
            }
        }

        public void tryEmit(U u10, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.requested.get();
                h<U> innerQueue = innerSubscriber.queue;
                if (j10 != 0 && (innerQueue == null || innerQueue.isEmpty())) {
                    this.downstream.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                } else {
                    if (innerQueue == null) {
                        innerQueue = getInnerQueue(innerSubscriber);
                    }
                    if (!innerQueue.offer(u10)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                h spscArrayQueue = innerSubscriber.queue;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u10)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void tryEmitScalar(U u10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.requested.get();
                h<U> mainQueue = this.queue;
                if (j10 != 0 && (mainQueue == null || mainQueue.isEmpty())) {
                    this.downstream.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i10 = this.scalarEmitted + 1;
                        this.scalarEmitted = i10;
                        int i11 = this.scalarLimit;
                        if (i10 == i11) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i11);
                        }
                    }
                } else {
                    if (mainQueue == null) {
                        mainQueue = getMainQueue();
                    }
                    if (!mainQueue.offer(u10)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u10)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public static <T, U> f<T> r(qo.b<? super U> bVar, o<? super T, ? extends qo.a<? extends U>> oVar, boolean z10, int i10, int i11) {
        return new MergeSubscriber(bVar, oVar, z10, i10, i11);
    }

    @Override // ii.e
    public void n(qo.b<? super U> bVar) {
        if (ui.e.b(this.f72877c, bVar, this.f61070d)) {
            return;
        }
        this.f72877c.m(r(bVar, this.f61070d, this.f61071e, this.f61072f, this.f61073g));
    }

    public FlowableFlatMap(ii.e<T> eVar, o<? super T, ? extends qo.a<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(eVar);
        this.f61070d = oVar;
        this.f61071e = z10;
        this.f61072f = i10;
        this.f61073g = i11;
    }
}
