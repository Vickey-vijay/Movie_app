package io.bidmachine.rendering.utils.taskmanager;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class UITaskManager extends SingleThreadTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f60947a = new Handler(Looper.getMainLooper());

    @Override // io.bidmachine.rendering.utils.taskmanager.SingleThreadTaskManager
    public Handler a() {
        return f60947a;
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.SingleThreadTaskManager, io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j10) {
        super.schedule(runnable, j10);
    }
}
