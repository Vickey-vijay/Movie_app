package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhaf {
    public static Executor zza() {
        return zzgzd.INSTANCE;
    }

    public static zzgzy zzb(ExecutorService executorService) {
        if (executorService instanceof zzgzy) {
            return (zzgzy) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzhae((ScheduledExecutorService) executorService) : new zzhaa(executorService);
    }

    public static zzgzz zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzhae(scheduledExecutorService);
    }

    public static Executor zzd(final Executor executor, final zzgyh zzgyhVar) {
        executor.getClass();
        if (executor == zzgzd.INSTANCE) {
            return executor;
        }
        return new Executor() { // from class: com.google.android.gms.internal.ads.zzhab
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzhaf.zzf(executor, zzgyhVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzgyh zzgyhVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e10) {
            zzgyhVar.zzb(e10);
        }
    }
}
