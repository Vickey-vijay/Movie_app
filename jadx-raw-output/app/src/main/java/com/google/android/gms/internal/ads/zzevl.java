package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevl implements zzfax {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final Clock zzc;
    private final Executor zzd;
    private final zzfax zze;
    private final long zzf;
    private final zzdxz zzg;

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        zzevi zzeviVar;
        zzevi zzeviVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznk)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznj)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcei.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzevk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j10 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                AtomicReference atomicReference = this.zza;
                zzeviVar = (zzevi) atomicReference.get();
                if (zzeviVar == null) {
                    zzevi zzeviVar3 = new zzevi(this.zze.zza(), this.zzf, this.zzc);
                    atomicReference.set(zzeviVar3);
                    return zzeviVar3.zza;
                }
                if (!((Boolean) this.zzb.get()).booleanValue() && zzeviVar.zza()) {
                    q5.i iVar = zzeviVar.zza;
                    zzfax zzfaxVar = this.zze;
                    zzeviVar2 = new zzevi(zzfaxVar.zza(), this.zzf, this.zzc);
                    this.zza.set(zzeviVar2);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznl)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznm)).booleanValue()) {
                            zzdxy zzdxyVarZza = this.zzg.zza();
                            zzdxyVarZza.zzc("action", "scs");
                            zzdxyVarZza.zzc("sid", String.valueOf(zzfaxVar.zzb()));
                            zzdxyVarZza.zzd();
                        }
                        return iVar;
                    }
                    zzeviVar = zzeviVar2;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzeviVar = (zzevi) atomicReference2.get();
            if (zzeviVar == null || zzeviVar.zza()) {
                zzfax zzfaxVar2 = this.zze;
                zzeviVar2 = new zzevi(zzfaxVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzeviVar2);
                zzeviVar = zzeviVar2;
            }
        }
        return zzeviVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return this.zze.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzevi(this.zze.zza(), this.zzf, this.zzc));
    }

    public zzevl(zzfax zzfaxVar, long j10, Clock clock, Executor executor, zzdxz zzdxzVar) {
        this.zzc = clock;
        this.zze = zzfaxVar;
        this.zzf = j10;
        this.zzd = executor;
        this.zzg = zzdxzVar;
    }
}
