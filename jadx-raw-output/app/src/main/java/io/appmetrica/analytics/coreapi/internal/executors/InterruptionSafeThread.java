package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f54636a;

    public InterruptionSafeThread() {
        this.f54636a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f54636a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f54636a = false;
        interrupt();
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f54636a = true;
    }

    public InterruptionSafeThread(@NonNull String str) {
        super(str);
        this.f54636a = true;
    }

    @VisibleForTesting(otherwise = 5)
    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
        this.f54636a = true;
    }
}
