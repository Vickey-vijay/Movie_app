package io.reactivex.internal.subscriptions;

import qo.b;

/* JADX INFO: loaded from: classes10.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    public static final int CANCELLED = 4;
    public static final int FUSED_CONSUMED = 32;
    public static final int FUSED_EMPTY = 8;
    public static final int FUSED_READY = 16;
    public static final int HAS_REQUEST_HAS_VALUE = 3;
    public static final int HAS_REQUEST_NO_VALUE = 2;
    public static final int NO_REQUEST_HAS_VALUE = 1;
    public static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    public final b<? super T> downstream;
    public T value;

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.d
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public DeferredScalarSubscription(b<? super T> bVar) {
        this.downstream = bVar;
    }

    public final void complete(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                b<? super T> bVar = this.downstream;
                bVar.onNext(t10);
                if (get() != 4) {
                    bVar.onComplete();
                    return;
                }
                return;
            }
            this.value = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t10;
        lazySet(16);
        b<? super T> bVar2 = this.downstream;
        bVar2.onNext(t10);
        if (get() != 4) {
            bVar2.onComplete();
        }
    }

    public final boolean isCancelled() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ri.h
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.value;
        this.value = null;
        return t10;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, qo.c
    public final void request(long j10) {
        T t10;
        if (SubscriptionHelper.validate(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (compareAndSet(1, 3) && (t10 = this.value) != null) {
                        this.value = null;
                        b<? super T> bVar = this.downstream;
                        bVar.onNext(t10);
                        if (get() != 4) {
                            bVar.onComplete();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
