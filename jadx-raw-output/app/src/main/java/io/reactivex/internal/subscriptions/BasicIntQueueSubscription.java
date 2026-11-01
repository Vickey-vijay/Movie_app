package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import ri.e;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements e<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    @Override // ri.h
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ T poll() throws Exception;

    public abstract /* synthetic */ void request(long j10);

    public abstract /* synthetic */ int requestFusion(int i10);

    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
