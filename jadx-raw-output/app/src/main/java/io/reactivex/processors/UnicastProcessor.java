package io.reactivex.processors;

import fj.a;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qo.b;
import qo.c;

/* JADX INFO: loaded from: classes2.dex */
public final class UnicastProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zi.a<T> f61408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Runnable> f61409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f61411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f61412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<b<? super T>> f61413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f61414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f61415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final BasicIntQueueSubscription<T> f61416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicLong f61417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f61418m;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.d
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.f61418m = true;
            return 2;
        }

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
        public void cancel() {
            if (UnicastProcessor.this.f61414i) {
                return;
            }
            UnicastProcessor.this.f61414i = true;
            UnicastProcessor.this.u();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.f61418m || unicastProcessor.f61416k.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.f61408c.clear();
            UnicastProcessor.this.f61413h.lazySet(null);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
        public void clear() {
            UnicastProcessor.this.f61408c.clear();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
        public boolean isEmpty() {
            return UnicastProcessor.this.f61408c.isEmpty();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
        public T poll() {
            return UnicastProcessor.this.f61408c.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                bj.b.a(UnicastProcessor.this.f61417l, j10);
                UnicastProcessor.this.v();
            }
        }
    }

    public UnicastProcessor(int i10) {
        this(i10, null, true);
    }

    public UnicastProcessor(int i10, Runnable runnable, boolean z10) {
        this.f61408c = new zi.a<>(qi.a.f(i10, "capacityHint"));
        this.f61409d = new AtomicReference<>(runnable);
        this.f61410e = z10;
        this.f61413h = new AtomicReference<>();
        this.f61415j = new AtomicBoolean();
        this.f61416k = new UnicastQueueSubscription();
        this.f61417l = new AtomicLong();
    }

    public static <T> UnicastProcessor<T> t(int i10) {
        return new UnicastProcessor<>(i10);
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        if (this.f61415j.get() || !this.f61415j.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), bVar);
            return;
        }
        bVar.onSubscribe(this.f61416k);
        this.f61413h.set(bVar);
        if (this.f61414i) {
            this.f61413h.lazySet(null);
        } else {
            v();
        }
    }

    @Override // qo.b
    public void onComplete() {
        if (this.f61411f || this.f61414i) {
            return;
        }
        this.f61411f = true;
        u();
        v();
    }

    @Override // qo.b
    public void onError(Throwable th2) {
        qi.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61411f || this.f61414i) {
            ej.a.s(th2);
            return;
        }
        this.f61412g = th2;
        this.f61411f = true;
        u();
        v();
    }

    @Override // qo.b
    public void onNext(T t10) {
        qi.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61411f || this.f61414i) {
            return;
        }
        this.f61408c.offer(t10);
        v();
    }

    @Override // qo.b, ii.f
    public void onSubscribe(c cVar) {
        if (this.f61411f || this.f61414i) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    public boolean s(boolean z10, boolean z11, boolean z12, b<? super T> bVar, zi.a<T> aVar) {
        if (this.f61414i) {
            aVar.clear();
            this.f61413h.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z10 && this.f61412g != null) {
            aVar.clear();
            this.f61413h.lazySet(null);
            bVar.onError(this.f61412g);
            return true;
        }
        if (!z12) {
            return false;
        }
        Throwable th2 = this.f61412g;
        this.f61413h.lazySet(null);
        if (th2 != null) {
            bVar.onError(th2);
        } else {
            bVar.onComplete();
        }
        return true;
    }

    public void u() {
        Runnable andSet = this.f61409d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void v() {
        if (this.f61416k.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        b<? super T> bVar = this.f61413h.get();
        while (bVar == null) {
            iAddAndGet = this.f61416k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                bVar = this.f61413h.get();
            }
        }
        if (this.f61418m) {
            w(bVar);
        } else {
            x(bVar);
        }
    }

    public void w(b<? super T> bVar) {
        zi.a<T> aVar = this.f61408c;
        int iAddAndGet = 1;
        boolean z10 = !this.f61410e;
        while (!this.f61414i) {
            boolean z11 = this.f61411f;
            if (z10 && z11 && this.f61412g != null) {
                aVar.clear();
                this.f61413h.lazySet(null);
                bVar.onError(this.f61412g);
                return;
            }
            bVar.onNext(null);
            if (z11) {
                this.f61413h.lazySet(null);
                Throwable th2 = this.f61412g;
                if (th2 != null) {
                    bVar.onError(th2);
                    return;
                } else {
                    bVar.onComplete();
                    return;
                }
            }
            iAddAndGet = this.f61416k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        aVar.clear();
        this.f61413h.lazySet(null);
    }

    public void x(b<? super T> bVar) {
        long j10;
        zi.a<T> aVar = this.f61408c;
        boolean z10 = true;
        boolean z11 = !this.f61410e;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f61417l.get();
            long j12 = 0;
            while (true) {
                if (j11 == j12) {
                    j10 = j12;
                    break;
                }
                boolean z12 = this.f61411f;
                T tPoll = aVar.poll();
                boolean z13 = tPoll == null ? z10 : false;
                j10 = j12;
                if (s(z11, z12, z13, bVar, aVar)) {
                    return;
                }
                if (z13) {
                    break;
                }
                bVar.onNext(tPoll);
                j12 = 1 + j10;
                z10 = true;
            }
            if (j11 == j12 && s(z11, this.f61411f, aVar.isEmpty(), bVar, aVar)) {
                return;
            }
            if (j10 != 0 && j11 != Long.MAX_VALUE) {
                this.f61417l.addAndGet(-j10);
            }
            iAddAndGet = this.f61416k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z10 = true;
            }
        }
    }
}
