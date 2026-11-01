package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzgzo extends zzgzq {
    public static q5.i zze(Runnable runnable, Executor executor) {
        zzhan zzhanVarZze = zzhan.zze(runnable, null);
        executor.execute(zzhanVarZze);
        return zzhanVarZze;
    }

    public static q5.i zza(Object obj) {
        return obj == null ? zzgzs.zza : new zzgzs(obj);
    }

    public static q5.i zzb() {
        return zzgzs.zza;
    }

    public static q5.i zzd(Callable callable, Executor executor) {
        zzhan zzhanVar = new zzhan(callable);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static q5.i zzf(zzgyv zzgyvVar, Executor executor) {
        zzhan zzhanVar = new zzhan(zzgyvVar);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static q5.i zzg(q5.i iVar, Class cls, zzgqt zzgqtVar, Executor executor) {
        int i10 = zzgyg.zzd;
        zzgyf zzgyfVar = new zzgyf(iVar, cls, zzgqtVar);
        iVar.addListener(zzgyfVar, zzhaf.zzd(executor, zzgyfVar));
        return zzgyfVar;
    }

    public static q5.i zzh(q5.i iVar, Class cls, zzgyw zzgywVar, Executor executor) {
        int i10 = zzgyg.zzd;
        zzgye zzgyeVar = new zzgye(iVar, cls, zzgywVar);
        iVar.addListener(zzgyeVar, zzhaf.zzd(executor, zzgyeVar));
        return zzgyeVar;
    }

    public static q5.i zzj(q5.i iVar, zzgyw zzgywVar, Executor executor) {
        int i10 = zzgyn.zzc;
        zzgyl zzgylVar = new zzgyl(iVar, zzgywVar);
        iVar.addListener(zzgylVar, zzhaf.zzd(executor, zzgylVar));
        return zzgylVar;
    }

    public static q5.i zzk(q5.i iVar, zzgqt zzgqtVar, Executor executor) {
        int i10 = zzgyn.zzc;
        zzgym zzgymVar = new zzgym(iVar, zzgqtVar);
        iVar.addListener(zzgymVar, zzhaf.zzd(executor, zzgymVar));
        return zzgymVar;
    }

    @SafeVarargs
    public static q5.i zzl(q5.i... iVarArr) {
        return new zzgyx(zzguf.zzr(iVarArr), true);
    }

    public static q5.i zzm(Iterable iterable) {
        return new zzgyx(zzguf.zzp(iterable), true);
    }

    public static zzgzn zzn(Iterable iterable) {
        return new zzgzn(false, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgzn zzo(q5.i... iVarArr) {
        return new zzgzn(true, zzguf.zzr(iVarArr), null);
    }

    public static zzgzn zzp(Iterable iterable) {
        return new zzgzn(true, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static q5.i zzq(q5.i... iVarArr) {
        return new zzgyx(zzguf.zzr(iVarArr), false);
    }

    public static q5.i zzc(Throwable th2) {
        th2.getClass();
        return new zzgzr(th2);
    }

    public static q5.i zzi(q5.i iVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (iVar.isDone()) {
            return iVar;
        }
        return zzhak.zze(iVar, j10, timeUnit, scheduledExecutorService);
    }

    public static void zzr(q5.i iVar, zzgzl zzgzlVar, Executor executor) {
        zzgzlVar.getClass();
        iVar.addListener(new zzgzm(iVar, zzgzlVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhap.zza(future);
        }
        throw new IllegalStateException(zzgrt.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhap.zza(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new zzgze((Error) e10.getCause());
            }
            throw new zzhao(e10.getCause());
        }
    }
}
