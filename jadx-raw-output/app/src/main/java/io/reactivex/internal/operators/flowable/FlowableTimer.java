package io.reactivex.internal.operators.flowable;

import ii.e;
import ii.s;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import qo.c;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTimer extends e<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f61084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f61085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f61086e;

    public static final class TimerSubscriber extends AtomicReference<b> implements c, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final qo.b<? super Long> downstream;
        public volatile boolean requested;

        public TimerSubscriber(qo.b<? super Long> bVar) {
            this.downstream = bVar;
        }

        @Override // qo.c
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // qo.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (this.requested) {
                    this.downstream.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                } else {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                }
            }
        }

        public void setResource(b bVar) {
            DisposableHelper.trySet(this, bVar);
        }
    }

    @Override // ii.e
    public void n(qo.b<? super Long> bVar) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(bVar);
        bVar.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.f61084c.d(timerSubscriber, this.f61085d, this.f61086e));
    }

    public FlowableTimer(long j10, TimeUnit timeUnit, s sVar) {
        this.f61085d = j10;
        this.f61086e = timeUnit;
        this.f61084c = sVar;
    }
}
