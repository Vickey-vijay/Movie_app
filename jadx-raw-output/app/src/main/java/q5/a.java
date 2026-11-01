package q5;

import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: AbstractListeningExecutorService.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends AbstractExecutorService implements k {
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t10) {
        return TrustedListenableFutureTask.I(runnable, t10);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return TrustedListenableFutureTask.J(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i<?> submit(Runnable runnable) {
        return (i) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <T> i<T> submit(Runnable runnable, T t10) {
        return (i) super.submit(runnable, t10);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> i<T> submit(Callable<T> callable) {
        return (i) super.submit((Callable) callable);
    }
}
