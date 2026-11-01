package io.bidmachine.util.taskmanager;

import ck.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: compiled from: TaskManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/taskmanager/TaskManager;", "", "Ljava/lang/Runnable;", "task", "Lmj/r;", "execute", "", "executeSafely", "", "delayMs", "schedule", "scheduleSafely", "delay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "cancel", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public interface TaskManager {
    void cancel(Runnable runnable);

    void schedule(Runnable runnable, long j10) throws Throwable;

    default boolean scheduleSafely(Runnable task, long delayMs) {
        Boolean bool;
        p.j(task, "task");
        try {
            schedule(task, delayMs);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.e(bool, Boolean.TRUE);
    }

    default void execute(Runnable runnable) throws Throwable {
        p.j(runnable, "task");
        schedule(runnable, 0L);
    }

    default boolean executeSafely(Runnable task) {
        Boolean bool;
        p.j(task, "task");
        try {
            execute(task);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.e(bool, Boolean.TRUE);
    }

    default void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        p.j(runnable, "task");
        p.j(timeUnit, "timeUnit");
        schedule(runnable, timeUnit.toMillis(j10));
    }

    default boolean scheduleSafely(Runnable task, long delay, TimeUnit timeUnit) {
        Boolean bool;
        p.j(task, "task");
        p.j(timeUnit, "timeUnit");
        try {
            schedule(task, delay, timeUnit);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return p.e(bool, Boolean.TRUE);
    }
}
