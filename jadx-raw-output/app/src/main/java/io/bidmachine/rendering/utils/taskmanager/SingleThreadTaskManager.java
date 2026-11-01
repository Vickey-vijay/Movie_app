package io.bidmachine.rendering.utils.taskmanager;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SingleThreadTaskManager extends BaseTaskManager {
    public abstract Handler a();

    public boolean b() {
        return Looper.myLooper() == a().getLooper();
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void cancel(@NonNull Runnable runnable) {
        super.cancel(runnable);
        a().removeCallbacks(runnable);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void execute(@NonNull Runnable runnable) {
        super.execute(runnable);
        if (b()) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j10) {
        super.schedule(runnable, j10);
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public void schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        super.schedule(runnable, j10, timeUnit);
        a().postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
