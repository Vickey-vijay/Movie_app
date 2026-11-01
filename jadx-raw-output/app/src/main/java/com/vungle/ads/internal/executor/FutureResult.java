package com.vungle.ads.internal.executor;

import ck.i;
import ck.p;
import com.ironsource.Ne;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;

/* JADX INFO: compiled from: FutureResult.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002:\u0001\u0013B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000bJ \u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/executor/FutureResult;", "T", "Ljava/util/concurrent/Future;", "future", "(Ljava/util/concurrent/Future;)V", "getFuture", "()Ljava/util/concurrent/Future;", "cancel", "", "mayInterruptIfRunning", "get", "()Ljava/lang/Object;", "timeout", "", Ne.f27158n1, "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FutureResult<T> implements Future<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = FutureResult.class.getSimpleName();
    private final Future<T> future;

    @Override // java.util.concurrent.Future
    public T get() {
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            Logger.Companion companion = Logger.INSTANCE;
            String str = TAG;
            p.i(str, "TAG");
            companion.w(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            Logger.Companion companion2 = Logger.INSTANCE;
            String str2 = TAG;
            p.i(str2, "TAG");
            companion2.e(str2, "error on execution", e10);
            return null;
        }
    }

    /* JADX INFO: compiled from: FutureResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/executor/FutureResult$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String getTAG() {
            return FutureResult.TAG;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        Future<T> future = this.future;
        if (future != null) {
            return future.cancel(mayInterruptIfRunning);
        }
        return false;
    }

    public final Future<T> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    public FutureResult(Future<T> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) {
        p.j(unit, Ne.f27158n1);
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get(timeout, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            Logger.Companion companion = Logger.INSTANCE;
            String str = TAG;
            p.i(str, "TAG");
            companion.w(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            Logger.Companion companion2 = Logger.INSTANCE;
            String str2 = TAG;
            p.i(str2, "TAG");
            companion2.e(str2, "error on execution", e10);
            return null;
        } catch (TimeoutException e11) {
            Logger.Companion companion3 = Logger.INSTANCE;
            String str3 = TAG;
            p.i(str3, "TAG");
            companion3.e(str3, "error on timeout", e11);
            p.i(str3, "TAG");
            companion3.w(str3, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
