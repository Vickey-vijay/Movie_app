package com.google.common.util.concurrent;

import com.ironsource.C3426d4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import m5.l;

/* JADX INFO: loaded from: classes9.dex */
public class TrustedListenableFutureTask<V> extends a.AbstractC0203a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile InterruptibleTask<?> f20689i;

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;

        public TrustedFutureInterruptibleTask(Callable<V> callable) {
            this.callable = (Callable) l.m(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblyFailure(Throwable th2) {
            TrustedListenableFutureTask.this.F(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(V v10) {
            TrustedListenableFutureTask.this.D(v10);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public V runInterruptibly() throws Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.callable.toString();
        }
    }

    public static <V> TrustedListenableFutureTask<V> I(Runnable runnable, V v10) {
        return new TrustedListenableFutureTask<>(Executors.callable(runnable, v10));
    }

    public static <V> TrustedListenableFutureTask<V> J(Callable<V> callable) {
        return new TrustedListenableFutureTask<>(callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask<?> interruptibleTask = this.f20689i;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f20689i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String z() {
        InterruptibleTask<?> interruptibleTask = this.f20689i;
        if (interruptibleTask == null) {
            return super.z();
        }
        return "task=[" + interruptibleTask + C3426d4.j.f28588e;
    }

    public TrustedListenableFutureTask(Callable<V> callable) {
        this.f20689i = new TrustedFutureInterruptibleTask(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void n() {
        InterruptibleTask<?> interruptibleTask;
        super.n();
        if (H() && (interruptibleTask = this.f20689i) != null) {
            interruptibleTask.interruptTask();
        }
        this.f20689i = null;
    }
}
