package io.bidmachine.rendering.utils.taskmanager;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import io.bidmachine.rendering.utils.Cancelable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTaskManager implements TaskManager {
    private void a(Runnable runnable, boolean z10) {
        try {
            if (runnable instanceof Cancelable) {
                ((Cancelable) runnable).setCancel(z10);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void cancel(@NonNull Runnable runnable) {
        a(runnable, true);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void execute(@NonNull Runnable runnable) {
        a(runnable, false);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j10) {
        super.schedule(runnable, j10);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.TaskManager
    @CallSuper
    public void schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        a(runnable, false);
    }
}
