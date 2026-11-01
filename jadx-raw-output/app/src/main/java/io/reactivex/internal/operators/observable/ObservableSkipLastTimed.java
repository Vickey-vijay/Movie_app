package io.reactivex.internal.operators.observable;

import ii.p;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSkipLastTimed<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f61298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f61299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f61301g;

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final r<? super T> downstream;
        public Throwable error;
        public final zi.a<Object> queue;
        public final s scheduler;
        public final long time;
        public final TimeUnit unit;
        public b upstream;

        @Override // ii.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // mi.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super T> rVar = this.downstream;
            zi.a<Object> aVar = this.queue;
            boolean z10 = this.delayError;
            TimeUnit timeUnit = this.unit;
            s sVar = this.scheduler;
            long j10 = this.time;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z11 = this.done;
                Long l10 = (Long) aVar.m();
                boolean z12 = l10 == null;
                long jB = sVar.b(timeUnit);
                if (!z12 && l10.longValue() > jB - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.queue.clear();
                            rVar.onError(th2);
                            return;
                        } else if (z12) {
                            rVar.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            rVar.onError(th3);
                            return;
                        } else {
                            rVar.onComplete();
                            return;
                        }
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    aVar.poll();
                    rVar.onNext(aVar.poll());
                }
            }
            this.queue.clear();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.queue.l(Long.valueOf(this.scheduler.b(this.unit)), t10);
            drain();
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public SkipLastTimedObserver(r<? super T> rVar, long j10, TimeUnit timeUnit, s sVar, int i10, boolean z10) {
            this.downstream = rVar;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = sVar;
            this.queue = new zi.a<>(i10);
            this.delayError = z10;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74487b.subscribe(new SkipLastTimedObserver(rVar, this.f61297c, this.f61298d, this.f61299e, this.f61300f, this.f61301g));
    }

    public ObservableSkipLastTimed(p<T> pVar, long j10, TimeUnit timeUnit, s sVar, int i10, boolean z10) {
        super(pVar);
        this.f61297c = j10;
        this.f61298d = timeUnit;
        this.f61299e = sVar;
        this.f61300f = i10;
        this.f61301g = z10;
    }
}
