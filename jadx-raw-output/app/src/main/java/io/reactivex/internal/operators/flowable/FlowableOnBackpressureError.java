package io.reactivex.internal.operators.flowable;

import ii.e;
import ii.f;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import qo.b;
import qo.c;
import ui.a;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableOnBackpressureError<T> extends a<T, T> {

    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements f<T>, c {
        private static final long serialVersionUID = -3176480756392482682L;
        public boolean done;
        public final b<? super T> downstream;
        public c upstream;

        @Override // qo.c
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // qo.b
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            if (this.done) {
                ej.a.s(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // qo.b
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (get() == 0) {
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            } else {
                this.downstream.onNext(t10);
                bj.b.c(this, 1L);
            }
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public BackpressureErrorSubscriber(b<? super T> bVar) {
            this.downstream = bVar;
        }

        @Override // qo.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                bj.b.a(this, j10);
            }
        }
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        this.f72877c.m(new BackpressureErrorSubscriber(bVar));
    }

    public FlowableOnBackpressureError(e<T> eVar) {
        super(eVar);
    }
}
