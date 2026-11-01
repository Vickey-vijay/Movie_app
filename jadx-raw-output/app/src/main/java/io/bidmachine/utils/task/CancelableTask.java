package io.bidmachine.utils.task;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CancelableTask implements Runnable {

    @NonNull
    private final AtomicBoolean isCanceled = new AtomicBoolean(false);

    public abstract void runTask();

    public boolean isCanceled() {
        return this.isCanceled.get();
    }

    public void setCancel(boolean z10) {
        this.isCanceled.set(z10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }
}
