package io.bidmachine.util.taskmanager;

import ck.p;
import io.bidmachine.util.Cancelable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: BaseTaskManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH$J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H$¨\u0006\u000f"}, d2 = {"Lio/bidmachine/util/taskmanager/BaseTaskManager;", "Lio/bidmachine/util/taskmanager/TaskManager;", "Ljava/lang/Runnable;", "task", "", "isCancel", "Lmj/r;", "cancel", "", "delayMs", "schedule", "scheduleTask", "cancelTask", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public abstract class BaseTaskManager implements TaskManager {
    @Override // io.bidmachine.util.taskmanager.TaskManager
    public void cancel(Runnable runnable) {
        p.j(runnable, "task");
        cancel(runnable, true);
    }

    public abstract void cancelTask(Runnable runnable) throws Throwable;

    @Override // io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.TaskManager
    public void schedule(Runnable runnable, long j10) throws Throwable {
        p.j(runnable, "task");
        cancel(runnable, false);
        scheduleTask(runnable, j10);
    }

    @Override // io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }

    public abstract void scheduleTask(Runnable runnable, long j10) throws Throwable;

    private final void cancel(Runnable runnable, boolean z10) {
        Cancelable cancelable = runnable instanceof Cancelable ? (Cancelable) runnable : null;
        if (cancelable != null) {
            try {
                cancelable.setCancel(z10);
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }
        try {
            cancelTask(runnable);
            r rVar2 = r.f64562a;
        } catch (Throwable unused2) {
        }
    }
}
