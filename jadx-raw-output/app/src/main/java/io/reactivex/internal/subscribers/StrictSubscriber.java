package io.reactivex.internal.subscribers;

import ii.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qo.b;
import qo.c;

/* JADX INFO: loaded from: classes2.dex */
public class StrictSubscriber<T> extends AtomicInteger implements f<T>, c {
    private static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final b<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<c> upstream = new AtomicReference<>();
    public final AtomicBoolean once = new AtomicBoolean();

    @Override // qo.b
    public void onComplete() {
        this.done = true;
        bj.f.b(this.downstream, this, this.error);
    }

    @Override // qo.b
    public void onError(Throwable th2) {
        this.done = true;
        bj.f.d(this.downstream, th2, this, this.error);
    }

    @Override // qo.c
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // qo.b
    public void onNext(T t10) {
        bj.f.f(this.downstream, t10, this, this.error);
    }

    @Override // ii.f
    public void onSubscribe(c cVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // qo.c
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }

    public StrictSubscriber(b<? super T> bVar) {
        this.downstream = bVar;
    }
}
