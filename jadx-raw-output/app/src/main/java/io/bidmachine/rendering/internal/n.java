package io.bidmachine.rendering.internal;

import androidx.annotation.CallSuper;
import io.bidmachine.util.SafeRunnable;

/* JADX INFO: loaded from: classes11.dex */
public interface n extends SafeRunnable {
    @Override // io.bidmachine.util.SafeRunnable
    /* synthetic */ void onRun() throws Throwable;

    @Override // io.bidmachine.util.SafeRunnable
    default void onThrows(Throwable th2) {
        o.b(th2);
    }

    @Override // io.bidmachine.util.SafeRunnable, java.lang.Runnable
    @CallSuper
    /* bridge */ /* synthetic */ default void run() {
        super.run();
    }
}
