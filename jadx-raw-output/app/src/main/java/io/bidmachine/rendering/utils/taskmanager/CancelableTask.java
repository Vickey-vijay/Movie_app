package io.bidmachine.rendering.utils.taskmanager;

import io.bidmachine.rendering.utils.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CancelableTask implements Runnable, Cancelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f60946a = new AtomicBoolean(false);

    @Override // io.bidmachine.rendering.utils.Cancelable
    public boolean isCanceled() {
        return this.f60946a.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }

    public abstract void runTask();

    @Override // io.bidmachine.rendering.utils.Cancelable
    public void setCancel(boolean z10) {
        this.f60946a.set(z10);
    }
}
