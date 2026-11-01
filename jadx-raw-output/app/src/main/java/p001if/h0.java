package p001if;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.core.Logger;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: TaskExecutorImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public class h0 implements TaskExecutor {
    private static final int CORE_POOL_SIZE = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));

    @NonNull
    @VisibleForTesting
    public final ScheduledExecutorService executorService;

    public h0() {
        this(Executors.newScheduledThreadPool(CORE_POOL_SIZE));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.TaskExecutor
    public boolean execute(@NonNull Runnable runnable) {
        return execute(runnable, 0L);
    }

    public h0(@NonNull ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.TaskExecutor
    public boolean execute(@NonNull Runnable runnable, long j10) {
        try {
            this.executorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th2) {
            Logger.w(th2);
            return false;
        }
    }
}
