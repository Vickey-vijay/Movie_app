package io.bidmachine.internal.utils;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.SafeRunnable;

/* JADX INFO: loaded from: classes2.dex */
public interface LogSafeRunnable extends SafeRunnable {
    @Override // io.bidmachine.utils.SafeRunnable
    /* synthetic */ void onRun() throws Throwable;

    @Override // io.bidmachine.utils.SafeRunnable, java.lang.Runnable
    @CallSuper
    /* bridge */ /* synthetic */ default void run() {
        super.run();
    }

    @Override // io.bidmachine.utils.SafeRunnable
    @CallSuper
    default void onThrows(@NonNull Throwable th2) throws Throwable {
        Logger.w(th2);
    }
}
