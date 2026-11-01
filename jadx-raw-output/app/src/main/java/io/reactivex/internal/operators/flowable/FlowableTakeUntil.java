package io.reactivex.internal.operators.flowable;

import ii.e;
import ii.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qo.b;
import qo.c;
import ui.a;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableTakeUntil<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qo.a<? extends U> f61083d;

    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements f<T>, c {
        private static final long serialVersionUID = -4945480365982832967L;
        public final b<? super T> downstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<c> upstream = new AtomicReference<>();
        public final TakeUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        public final AtomicThrowable error = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<c> implements f<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public OtherSubscriber() {
            }

            @Override // qo.b
            public void onComplete() {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                bj.f.b(takeUntilMainSubscriber.downstream, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // qo.b
            public void onError(Throwable th2) {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                bj.f.d(takeUntilMainSubscriber.downstream, th2, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // qo.b
            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // ii.f
            public void onSubscribe(c cVar) {
                SubscriptionHelper.setOnce(this, cVar, Long.MAX_VALUE);
            }
        }

        @Override // qo.c
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // qo.b
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            bj.f.b(this.downstream, this, this.error);
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.other);
            bj.f.d(this.downstream, th2, this, this.error);
        }

        @Override // qo.b
        public void onNext(T t10) {
            bj.f.f(this.downstream, t10, this, this.error);
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, cVar);
        }

        @Override // qo.c
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }

        public TakeUntilMainSubscriber(b<? super T> bVar) {
            this.downstream = bVar;
        }
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        TakeUntilMainSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(bVar);
        bVar.onSubscribe(takeUntilMainSubscriber);
        this.f61083d.a(takeUntilMainSubscriber.other);
        this.f72877c.m(takeUntilMainSubscriber);
    }

    public FlowableTakeUntil(e<T> eVar, qo.a<? extends U> aVar) {
        super(eVar);
        this.f61083d = aVar;
    }
}
