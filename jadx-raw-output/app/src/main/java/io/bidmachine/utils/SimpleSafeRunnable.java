package io.bidmachine.utils;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public interface SimpleSafeRunnable extends SafeRunnable {
    @Override // io.bidmachine.utils.SafeRunnable
    /* synthetic */ void onRun() throws Throwable;

    @Override // io.bidmachine.utils.SafeRunnable
    default void onThrows(@NonNull Throwable th2) throws Throwable {
    }

    @Override // io.bidmachine.utils.SafeRunnable, java.lang.Runnable
    @CallSuper
    /* bridge */ /* synthetic */ default void run() {
        super.run();
    }
}
