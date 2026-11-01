package io.bidmachine.utils.task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class BackgroundTaskManager implements TaskManager {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;

    @NonNull
    private final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(CORE_POOL_SIZE);

    @NonNull
    private final Map<Runnable, Future<?>> futureMap = new ConcurrentHashMap();

    public class a implements Runnable {

        @NonNull
        private final Runnable runnable;

        public a(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            BackgroundTaskManager.this.removeFuture(this.runnable);
            this.runnable.run();
        }
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void cancel(@NonNull CancelableTask cancelableTask) {
        try {
            cancelableTask.setCancel(true);
            Future<?> futureRemoveFuture = removeFuture(cancelableTask);
            if (futureRemoveFuture == null) {
                return;
            }
            futureRemoveFuture.cancel(false);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull CancelableTask cancelableTask, long j10) {
        super.schedule(cancelableTask, j10);
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void schedule(@NonNull CancelableTask cancelableTask, long j10, @NonNull TimeUnit timeUnit) {
        try {
            cancelableTask.setCancel(false);
            this.futureMap.put(cancelableTask, this.executor.schedule(new a(cancelableTask), j10, timeUnit));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public Future<?> removeFuture(@NonNull Runnable runnable) {
        try {
            return this.futureMap.remove(runnable);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.utils.task.TaskManager
    public void execute(@NonNull Runnable runnable) {
        try {
            this.executor.execute(runnable);
        } catch (Throwable unused) {
        }
    }

    @NonNull
    @VisibleForTesting
    public Map<Runnable, Future<?>> getFutureMap() {
        return this.futureMap;
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
    }
}
