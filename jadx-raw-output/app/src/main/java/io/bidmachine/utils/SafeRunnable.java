package io.bidmachine.utils;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public interface SafeRunnable extends Runnable {
    void onRun() throws Throwable;

    void onThrows(@NonNull Throwable th2) throws Throwable;

    @Override // java.lang.Runnable
    @CallSuper
    default void run() {
        try {
            onRun();
        } catch (Throwable th2) {
            try {
                onThrows(th2);
            } catch (Throwable unused) {
            }
        }
    }
}
