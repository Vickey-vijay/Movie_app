package q5;

import com.google.common.collect.r1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFuture.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c<V> extends r1 implements Future<V> {
    public abstract Future<? extends V> g();

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return g().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return g().get(j10, timeUnit);
    }

    public boolean cancel(boolean z10) {
        return g().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return g().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return g().isDone();
    }
}
