package io.reactivex.internal.operators.flowable;

import ii.e;
import ii.f;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import qo.b;
import qo.c;
import ri.g;
import ui.a;

/* JADX INFO: loaded from: classes.dex */
public final class FlowableOnBackpressureBuffer<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f61077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oi.a f61078g;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements f<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final b<? super T> downstream;
        public Throwable error;
        public final oi.a onOverflow;
        public boolean outputFused;
        public final g<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public c upstream;

        @Override // qo.b
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.d
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, b<? super T> bVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.delayError) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                this.queue.clear();
                bVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th2);
            } else {
                drain();
            }
        }

        @Override // qo.b
        public void onNext(T t10) {
            if (this.queue.offer(t10)) {
                if (this.outputFused) {
                    this.downstream.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.upstream.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th2) {
                ni.a.b(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
        public void request(long j10) {
            if (this.outputFused || !SubscriptionHelper.validate(j10)) {
                return;
            }
            bj.b.a(this.requested, j10);
            drain();
        }

        public BackpressureBufferSubscriber(b<? super T> bVar, int i10, boolean z10, boolean z11, oi.a aVar) {
            g<T> spscArrayQueue;
            this.downstream = bVar;
            this.onOverflow = aVar;
            this.delayError = z11;
            if (z10) {
                spscArrayQueue = new zi.a<>(i10);
            } else {
                spscArrayQueue = new SpscArrayQueue<>(i10);
            }
            this.queue = spscArrayQueue;
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() == 0) {
                g<T> gVar = this.queue;
                b<? super T> bVar = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, gVar.isEmpty(), bVar)) {
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z11 = this.done;
                        T tPoll = gVar.poll();
                        if (tPoll == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (checkTerminated(z11, z10, bVar)) {
                            return;
                        }
                        if (z10) {
                            break;
                        }
                        bVar.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && checkTerminated(this.done, gVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        this.f72877c.m(new BackpressureBufferSubscriber(bVar, this.f61075d, this.f61076e, this.f61077f, this.f61078g));
    }

    public FlowableOnBackpressureBuffer(e<T> eVar, int i10, boolean z10, boolean z11, oi.a aVar) {
        super(eVar);
        this.f61075d = i10;
        this.f61076e = z10;
        this.f61077f = z11;
        this.f61078g = aVar;
    }
}
