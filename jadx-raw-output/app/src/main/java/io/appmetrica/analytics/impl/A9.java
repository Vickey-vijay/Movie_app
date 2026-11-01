package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class A9 implements IHandlerExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f54954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f54955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThreadC4138db f54956c;

    public A9(@NonNull String str) {
        this(a(str));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10) {
        this.f54955b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j10));
    }

    public A9(HandlerThreadC4138db handlerThreadC4138db) {
        this(handlerThreadC4138db, handlerThreadC4138db.getLooper(), new Handler(handlerThreadC4138db.getLooper()));
    }

    public static HandlerThreadC4138db a(String str) {
        HandlerThreadC4138db handlerThreadC4138db = new HandlerThreadC4138db(str + "-" + Ad.f54959a.incrementAndGet());
        handlerThreadC4138db.start();
        return handlerThreadC4138db;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f54955b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f54955b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f54954a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z10;
        HandlerThreadC4138db handlerThreadC4138db = this.f54956c;
        synchronized (handlerThreadC4138db) {
            z10 = handlerThreadC4138db.f56581a;
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f54955b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f54955b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC4138db handlerThreadC4138db = this.f54956c;
        synchronized (handlerThreadC4138db) {
            handlerThreadC4138db.f56581a = false;
            handlerThreadC4138db.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f54955b.post(futureTask);
        return futureTask;
    }

    @VisibleForTesting
    public A9(@NonNull HandlerThreadC4138db handlerThreadC4138db, @NonNull Looper looper, @NonNull Handler handler) {
        this.f54956c = handlerThreadC4138db;
        this.f54954a = looper;
        this.f54955b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        this.f54955b.postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
