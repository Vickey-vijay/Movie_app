package io.reactivex.internal.operators.flowable;

import ii.e;
import ii.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qo.b;
import qo.c;
import ui.a;

/* JADX INFO: loaded from: classes8.dex */
public final class FlowableOnBackpressureLatest<T> extends a<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements f<T>, c {
        private static final long serialVersionUID = 163080509307634843L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final b<? super T> downstream;
        public Throwable error;
        public c upstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<T> current = new AtomicReference<>();

        @Override // qo.b
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // qo.c
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                atomicReference.lazySet(null);
                bVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // qo.b
        public void onNext(T t10) {
            this.current.lazySet(t10);
            drain();
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public BackpressureLatestSubscriber(b<? super T> bVar) {
            this.downstream = bVar;
        }

        public void drain() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            b<? super T> bVar = this.downstream;
            AtomicLong atomicLong = this.requested;
            AtomicReference<T> atomicReference = this.current;
            int iAddAndGet = 1;
            do {
                long j10 = 0;
                while (true) {
                    z10 = false;
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z12 = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    if (andSet == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (checkTerminated(z12, z11, bVar, atomicReference)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    bVar.onNext(andSet);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    boolean z13 = this.done;
                    if (atomicReference.get() == null) {
                        z10 = true;
                    }
                    if (checkTerminated(z13, z10, bVar, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    bj.b.c(atomicLong, j10);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // qo.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                bj.b.a(this.requested, j10);
                drain();
            }
        }
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        this.f72877c.m(new BackpressureLatestSubscriber(bVar));
    }

    public FlowableOnBackpressureLatest(e<T> eVar) {
        super(eVar);
    }
}
