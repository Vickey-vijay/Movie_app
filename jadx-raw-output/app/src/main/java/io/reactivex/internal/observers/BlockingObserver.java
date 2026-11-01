package io.reactivex.internal.observers;

import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingObserver<T> extends AtomicReference<b> implements r<T>, b {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    public final Queue<Object> queue;

    @Override // ii.r
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        this.queue.offer(NotificationLite.error(th2));
    }

    @Override // ii.r
    public void onNext(T t10) {
        this.queue.offer(NotificationLite.next(t10));
    }

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // mi.b
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // mi.b
    public boolean isDisposed() {
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // ii.r
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
