package io.bidmachine.rendering.utils.taskmanager;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public interface TaskManager {
    void cancel(@NonNull Runnable runnable);

    void execute(@NonNull Runnable runnable);

    void schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit);

    default void schedule(@NonNull Runnable runnable, long j10) {
        schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}
