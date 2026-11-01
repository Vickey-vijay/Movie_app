package io.reactivex.internal.operators.flowable;

import ii.e;
import ii.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import oi.g;
import qo.b;
import qo.c;
import ui.a;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnBackpressureDrop<T> extends a<T, T> implements g<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<? super T> f61079d;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements f<T>, c {
        private static final long serialVersionUID = -6246093802440953054L;
        public boolean done;
        public final b<? super T> downstream;
        public final g<? super T> onDrop;
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
            if (get() != 0) {
                this.downstream.onNext(t10);
                bj.b.c(this, 1L);
                return;
            }
            try {
                this.onDrop.accept(t10);
            } catch (Throwable th2) {
                ni.a.b(th2);
                cancel();
                onError(th2);
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

        public BackpressureDropSubscriber(b<? super T> bVar, g<? super T> gVar) {
            this.downstream = bVar;
            this.onDrop = gVar;
        }

        @Override // qo.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                bj.b.a(this, j10);
            }
        }
    }

    @Override // oi.g
    public void accept(T t10) {
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        this.f72877c.m(new BackpressureDropSubscriber(bVar, this.f61079d));
    }

    public FlowableOnBackpressureDrop(e<T> eVar) {
        super(eVar);
        this.f61079d = this;
    }
}
