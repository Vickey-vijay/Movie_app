package io.appmetrica.analytics.coreutils.internal.executors;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SafeRunnable implements Runnable {
    public abstract void runSafety() throws Throwable;

    @Override // java.lang.Runnable
    public void run() {
        try {
            runSafety();
        } catch (Throwable unused) {
        }
    }
}
