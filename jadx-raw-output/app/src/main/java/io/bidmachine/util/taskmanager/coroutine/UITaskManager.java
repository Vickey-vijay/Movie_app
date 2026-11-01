package io.bidmachine.util.taskmanager.coroutine;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import nk.j2;
import nk.k0;
import nk.w0;

/* JADX INFO: compiled from: UITaskManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/bidmachine/util/taskmanager/coroutine/UITaskManager;", "Lio/bidmachine/util/taskmanager/coroutine/CoroutineTaskManager;", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UITaskManager extends CoroutineTaskManager {
    @Override // io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager, io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }

    public UITaskManager() {
        super(new k0("UITaskManager").plus(j2.b(null, 1, null)).plus(w0.c().n()));
    }
}
