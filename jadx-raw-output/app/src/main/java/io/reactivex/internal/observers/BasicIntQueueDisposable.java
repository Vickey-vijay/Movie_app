package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import ri.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements c<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // ri.h
    public abstract /* synthetic */ void clear();

    @Override // mi.b
    public abstract /* synthetic */ void dispose();

    @Override // mi.b
    public abstract /* synthetic */ boolean isDisposed();

    @Override // ri.h
    public abstract /* synthetic */ boolean isEmpty();

    @Override // ri.h
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // ri.h
    public abstract /* synthetic */ T poll() throws Exception;

    @Override // ri.d
    public abstract /* synthetic */ int requestFusion(int i10);

    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
