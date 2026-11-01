package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcwu {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final q5.i zzc;
    private volatile boolean zzd = true;

    public zzcwu(Executor executor, ScheduledExecutorService scheduledExecutorService, q5.i iVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = iVar;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zza(zzgzl zzgzlVar) {
        zzgzo.zzr(this.zzc, new zzcwo(this, zzgzlVar), this.zza);
    }

    public final /* synthetic */ q5.i zzc(zzgzl zzgzlVar, q5.i iVar, zzcwf zzcwfVar) {
        if (zzcwfVar != null) {
            zzgzlVar.zzb(zzcwfVar);
        }
        return zzgzo.zzi(iVar, ((Long) zzbjs.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zze(List list, final zzgzl zzgzlVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgzlVar.zza(new zzecr(3));
                }
            });
            return;
        }
        q5.i iVarZza = zzgzo.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final q5.i iVar = (q5.i) it.next();
            zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwq
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ q5.i zza(Object obj) {
                    zzgzlVar.zza((Throwable) obj);
                    return zzgzo.zza(null);
                }
            };
            Executor executor = this.zza;
            iVarZza = zzgzo.zzj(zzgzo.zzh(iVarZza, Throwable.class, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwr
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ q5.i zza(Object obj) {
                    return this.zza.zzc(zzgzlVar, iVar, (zzcwf) obj);
                }
            }, executor);
        }
        zzgzo.zzr(iVarZza, new zzcwp(this, zzgzlVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcws
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
