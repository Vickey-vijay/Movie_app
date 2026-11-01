package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.task.CancelableTask;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class ExpirationHandler {
    private final long expirationTimeMs;

    @NonNull
    private final c expiredTask;

    @NonNull
    private final AtomicBoolean isExpireTrackerSubscribed;

    @NonNull
    private final TaskScheduler taskScheduler;

    public interface Listener {
        void onExpired();
    }

    public interface TaskScheduler {
        void cancelTask(@NonNull CancelableTask cancelableTask);

        void scheduleTask(@NonNull CancelableTask cancelableTask, long j10);
    }

    public static class b implements TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(@NonNull CancelableTask cancelableTask) {
            cancelableTask.setCancel(true);
            Utils.cancelBackgroundThreadTask(cancelableTask);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(@NonNull CancelableTask cancelableTask, long j10) {
            cancelableTask.setCancel(false);
            Utils.onBackgroundThread(cancelableTask, j10);
        }
    }

    public static class c extends CancelableTask {

        @NonNull
        private final WeakReference<Listener> weakExpirationListener;

        @Override // io.bidmachine.utils.task.CancelableTask
        public void runTask() {
            Listener listener = this.weakExpirationListener.get();
            if (listener != null) {
                listener.onExpired();
            }
        }

        public c(@NonNull Listener listener) {
            this.weakExpirationListener = new WeakReference<>(listener);
        }
    }

    public ExpirationHandler(long j10, @NonNull Listener listener) {
        this(j10, listener, new b());
    }

    public ExpirationHandler(long j10, @NonNull Listener listener, @NonNull TaskScheduler taskScheduler) {
        this.expiredTask = new c(listener);
        this.expirationTimeMs = j10;
        this.taskScheduler = taskScheduler;
        this.isExpireTrackerSubscribed = new AtomicBoolean(false);
    }

    @NonNull
    public TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    public void start() {
        if (this.expirationTimeMs <= 0 || !this.isExpireTrackerSubscribed.compareAndSet(false, true)) {
            return;
        }
        this.taskScheduler.scheduleTask(this.expiredTask, this.expirationTimeMs);
    }

    public void stop() {
        this.isExpireTrackerSubscribed.set(false);
        this.taskScheduler.cancelTask(this.expiredTask);
    }
}
