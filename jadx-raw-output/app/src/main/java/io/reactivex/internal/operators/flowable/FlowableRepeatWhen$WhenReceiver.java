package io.reactivex.internal.operators.flowable;

import ii.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qo.a;
import qo.c;

/* JADX INFO: loaded from: classes11.dex */
final class FlowableRepeatWhen$WhenReceiver<T, U> extends AtomicInteger implements f<Object>, c {
    private static final long serialVersionUID = 2827772011130406689L;
    public final a<T> source;
    public FlowableRepeatWhen$WhenSourceSubscriber<T, U> subscriber;
    public final AtomicReference<c> upstream = new AtomicReference<>();
    public final AtomicLong requested = new AtomicLong();

    @Override // qo.c
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // qo.b
    public void onComplete() {
        this.subscriber.cancel();
        this.subscriber.downstream.onComplete();
    }

    @Override // qo.b
    public void onError(Throwable th2) {
        this.subscriber.cancel();
        this.subscriber.downstream.onError(th2);
    }

    @Override // ii.f
    public void onSubscribe(c cVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, cVar);
    }

    @Override // qo.c
    public void request(long j10) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
    }

    public FlowableRepeatWhen$WhenReceiver(a<T> aVar) {
        this.source = aVar;
    }

    @Override // qo.b
    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (!SubscriptionHelper.isCancelled(this.upstream.get())) {
                this.source.a(this.subscriber);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
