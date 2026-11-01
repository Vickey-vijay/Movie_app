package io.reactivex.internal.observers;

import ej.a;
import ii.r;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    public static final int DISPOSED = 4;
    public static final int FUSED_CONSUMED = 32;
    public static final int FUSED_EMPTY = 8;
    public static final int FUSED_READY = 16;
    public static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    public final r<? super T> downstream;
    public T value;

    public final void complete(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        r<? super T> rVar = this.downstream;
        if (i10 == 8) {
            this.value = t10;
            lazySet(16);
            rVar.onNext(null);
        } else {
            lazySet(2);
            rVar.onNext(t10);
        }
        if (get() != 4) {
            rVar.onComplete();
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.d
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public DeferredScalarDisposable(r<? super T> rVar) {
        this.downstream = rVar;
    }

    public final void error(Throwable th2) {
        if ((get() & 54) != 0) {
            a.s(th2);
        } else {
            lazySet(2);
            this.downstream.onError(th2);
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t10 = this.value;
        this.value = null;
        lazySet(32);
        return t10;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }
}
