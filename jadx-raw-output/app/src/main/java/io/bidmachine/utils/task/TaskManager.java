package io.bidmachine.utils.task;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface TaskManager {
    void cancel(@NonNull CancelableTask cancelableTask);

    void execute(@NonNull Runnable runnable);

    void schedule(@NonNull CancelableTask cancelableTask, long j10, @NonNull TimeUnit timeUnit);

    default void schedule(@NonNull CancelableTask cancelableTask, long j10) {
        schedule(cancelableTask, j10, TimeUnit.MILLISECONDS);
    }
}
