package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.utils.task.BackgroundTaskManager;
import io.bidmachine.utils.task.TaskManager;

/* JADX INFO: compiled from: CommonBackgroundTaskManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 {

    @Nullable
    private static volatile TaskManager instance;

    @NonNull
    public static TaskManager get() {
        TaskManager backgroundTaskManager = instance;
        if (backgroundTaskManager == null) {
            synchronized (x2.class) {
                backgroundTaskManager = instance;
                if (backgroundTaskManager == null) {
                    backgroundTaskManager = new BackgroundTaskManager();
                    instance = backgroundTaskManager;
                }
            }
        }
        return backgroundTaskManager;
    }
}
