package io.reactivex.internal.operators.flowable;

import ii.e;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;
import oi.o;
import qo.b;
import qo.c;
import ui.a;

/* JADX INFO: loaded from: classes8.dex */
public final class FlowableRetryWhen<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super e<Throwable>, ? extends qo.a<?>> f61080d;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, qo.b
        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        public RetryWhenSubscriber(b<? super T> bVar, fj.a<Throwable> aVar, c cVar) {
            super(bVar, aVar, cVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, qo.b
        public void onError(Throwable th2) {
            again(th2);
        }
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        ij.a aVar = new ij.a(bVar);
        fj.a<T> aVarR = UnicastProcessor.t(8).r();
        try {
            qo.a aVar2 = (qo.a) qi.a.e(this.f61080d.apply(aVarR), "handler returned a null Publisher");
            FlowableRepeatWhen$WhenReceiver flowableRepeatWhen$WhenReceiver = new FlowableRepeatWhen$WhenReceiver(this.f72877c);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(aVar, aVarR, flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.subscriber = retryWhenSubscriber;
            bVar.onSubscribe(retryWhenSubscriber);
            aVar2.a(flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.onNext(0);
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptySubscription.error(th2, bVar);
        }
    }

    public FlowableRetryWhen(e<T> eVar, o<? super e<Throwable>, ? extends qo.a<?>> oVar) {
        super(eVar);
        this.f61080d = oVar;
    }
}
