package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import qo.b;
import ri.e;

/* JADX INFO: loaded from: classes5.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements e<T> {
    public static final int CANCELLED = 2;
    public static final int NO_REQUEST = 0;
    public static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    public final b<? super T> subscriber;
    public final T value;

    @Override // qo.c
    public void cancel() {
        lazySet(2);
    }

    @Override // ri.h
    public void clear() {
        lazySet(1);
    }

    @Override // ri.h
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ri.d
    public int requestFusion(int i10) {
        return i10 & 1;
    }

    public boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public ScalarSubscription(b<? super T> bVar, T t10) {
        this.subscriber = bVar;
        this.value = t10;
    }

    public boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    @Override // ri.h
    public boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Override // ri.h
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.value;
        }
        return null;
    }

    @Override // qo.c
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            b<? super T> bVar = this.subscriber;
            bVar.onNext(this.value);
            if (get() != 2) {
                bVar.onComplete();
            }
        }
    }
}
