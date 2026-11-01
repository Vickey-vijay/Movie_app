package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
class zzhaa extends zzgyk {
    private final ExecutorService zza;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.zza.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zza.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.zza;
        String string = super.toString();
        String strValueOf = String.valueOf(executorService);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length() + 1);
        sb2.append(string);
        sb2.append(C3426d4.j.f28586d);
        sb2.append(strValueOf);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    public zzhaa(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
    }
}
