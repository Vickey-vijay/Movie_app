package io.reactivex.internal.operators.flowable;

import ii.e;
import ii.f;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import qo.b;
import qo.c;
import ui.a;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableSingle<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f61081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61082e;

    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements f<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        public final T defaultValue;
        public boolean done;
        public final boolean failOnEmpty;
        public c upstream;

        @Override // qo.b
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t10 = this.value;
            this.value = null;
            if (t10 == null) {
                t10 = this.defaultValue;
            }
            if (t10 != null) {
                complete(t10);
            } else if (this.failOnEmpty) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
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
            if (this.value == null) {
                this.value = t10;
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // ii.f
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public SingleElementSubscriber(b<? super T> bVar, T t10, boolean z10) {
            super(bVar);
            this.defaultValue = t10;
            this.failOnEmpty = z10;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }

    @Override // ii.e
    public void n(b<? super T> bVar) {
        this.f72877c.m(new SingleElementSubscriber(bVar, this.f61081d, this.f61082e));
    }

    public FlowableSingle(e<T> eVar, T t10, boolean z10) {
        super(eVar);
        this.f61081d = t10;
        this.f61082e = z10;
    }
}
