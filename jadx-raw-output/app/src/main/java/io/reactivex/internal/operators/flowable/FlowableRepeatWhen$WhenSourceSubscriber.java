package io.reactivex.internal.operators.flowable;

import fj.a;
import ii.f;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import qo.b;
import qo.c;

/* JADX INFO: loaded from: classes9.dex */
abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements f<T> {
    private static final long serialVersionUID = -5604623027276966720L;
    public final b<? super T> downstream;
    public final a<U> processor;
    private long produced;
    public final c receiver;

    @Override // qo.b
    public abstract /* synthetic */ void onComplete();

    @Override // qo.b
    public abstract /* synthetic */ void onError(Throwable th2);

    public final void again(U u10) {
        long j10 = this.produced;
        if (j10 != 0) {
            this.produced = 0L;
            produced(j10);
        }
        this.receiver.request(1L);
        this.processor.onNext(u10);
    }

    @Override // qo.b
    public final void onNext(T t10) {
        this.produced++;
        this.downstream.onNext(t10);
    }

    public FlowableRepeatWhen$WhenSourceSubscriber(b<? super T> bVar, a<U> aVar, c cVar) {
        this.downstream = bVar;
        this.processor = aVar;
        this.receiver = cVar;
    }

    @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, qo.c
    public final void cancel() {
        super.cancel();
        this.receiver.cancel();
    }

    @Override // ii.f
    public final void onSubscribe(c cVar) {
        setSubscription(cVar);
    }
}
