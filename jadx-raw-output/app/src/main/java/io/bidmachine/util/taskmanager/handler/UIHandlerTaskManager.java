package io.bidmachine.util.taskmanager.handler;

import android.os.Looper;
import ck.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: UIHandlerTaskManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/bidmachine/util/taskmanager/handler/UIHandlerTaskManager;", "Lio/bidmachine/util/taskmanager/handler/HandlerTaskManager;", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UIHandlerTaskManager extends HandlerTaskManager {
    @Override // io.bidmachine.util.taskmanager.handler.HandlerTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.handler.HandlerTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.handler.HandlerTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // io.bidmachine.util.taskmanager.handler.HandlerTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // io.bidmachine.util.taskmanager.handler.HandlerTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UIHandlerTaskManager() {
        Looper mainLooper = Looper.getMainLooper();
        p.i(mainLooper, "getMainLooper()");
        super(mainLooper);
    }
}
