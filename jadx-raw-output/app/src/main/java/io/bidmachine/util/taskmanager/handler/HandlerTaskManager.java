package io.bidmachine.util.taskmanager.handler;

import android.os.Handler;
import android.os.Looper;
import ck.p;
import io.bidmachine.util.taskmanager.BaseTaskManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: HandlerTaskManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lio/bidmachine/util/taskmanager/handler/HandlerTaskManager;", "Lio/bidmachine/util/taskmanager/BaseTaskManager;", "", "isCurrentThread", "Ljava/lang/Runnable;", "task", "", "delayMs", "Lmj/r;", "scheduleTask", "cancelTask", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "(Landroid/os/Handler;)V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public class HandlerTaskManager extends BaseTaskManager {
    private final Handler handler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandlerTaskManager(Looper looper) {
        this(new Handler(looper));
        p.j(looper, "looper");
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }

    public HandlerTaskManager(Handler handler) {
        p.j(handler, "handler");
        this.handler = handler;
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager
    public void cancelTask(Runnable runnable) throws Throwable {
        p.j(runnable, "task");
        this.handler.removeCallbacks(runnable);
    }

    public final Handler getHandler() {
        return this.handler;
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager
    public void scheduleTask(Runnable runnable, long j10) throws Throwable {
        p.j(runnable, "task");
        if (j10 > 0) {
            this.handler.postDelayed(runnable, j10);
        } else if (isCurrentThread()) {
            runnable.run();
        } else {
            this.handler.post(runnable);
        }
    }

    private final boolean isCurrentThread() {
        return p.e(Looper.myLooper(), this.handler.getLooper());
    }
}
