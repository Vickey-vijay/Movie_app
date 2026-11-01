package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfia implements zzgzl {
    public final /* synthetic */ zzese zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzfid zzd;
    public final /* synthetic */ zzfie zze;

    public zzfia(zzfie zzfieVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfid zzfidVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfidVar;
        Objects.requireNonNull(zzfieVar);
        this.zze = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th2);
        }
        zzfie zzfieVar = this.zze;
        zzdue zzdueVar = (zzdue) zzfieVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdueVar == null ? zzfkm.zzb(th2, null) : zzdueVar.zza().zzg(th2);
        synchronized (zzfieVar) {
            try {
                if (zzdueVar != null) {
                    zzdueVar.zze().zzdI(zzeVarZzb);
                    zzfieVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdI(zzeVarZzb);
                        }
                    });
                } else {
                    zzfieVar.zzg().zzdI(zzeVarZzb);
                    zzfieVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfkh.zza(zzeVarZzb.zza, th2, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzi = zzfieVar.zzi();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzh(zzeVarZzb);
                    zzfoeVar.zzj(th2);
                    zzfoeVar.zzd(false);
                    zzforVarZzi.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zzf(zzeVarZzb);
                    zzfoe zzfoeVar2 = this.zzc;
                    zzfoeVar2.zzj(th2);
                    zzfoeVar2.zzd(false);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0067 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0043, B:10:0x0047, B:12:0x008b, B:11:0x0067), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzfie zzfieVar = this.zze;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfieVar) {
            if (zzdtzVar != null) {
                zzdtzVar.zzt();
                zzdtzVar.zzq().zzd(zzfieVar.zzg());
                this.zza.zzb(zzdtzVar);
                Executor executorZzf = zzfieVar.zzf();
                final zzfhv zzfhvVarZzg = zzfieVar.zzg();
                Objects.requireNonNull(zzfhvVarZzg);
                executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfhvVarZzg.zzg();
                    }
                });
                zzfieVar.zzg().onAdMetadataChanged();
                if (((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzi = zzfieVar.zzi();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzg(zzdtzVar.zzr().zzb);
                    zzfoeVar.zzi(zzdtzVar.zzn().zze());
                    zzfoeVar.zzd(true);
                    zzforVarZzi.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zze(zzdtzVar.zzr().zzb);
                    zzfooVar.zzg(zzdtzVar.zzn().zze());
                    zzfoe zzfoeVar2 = this.zzc;
                    zzfoeVar2.zzd(true);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } else {
                zzdtzVar.zzq().zzd(zzfieVar.zzg());
                this.zza.zzb(zzdtzVar);
                Executor executorZzf2 = zzfieVar.zzf();
                final zzfhv zzfhvVarZzg2 = zzfieVar.zzg();
                Objects.requireNonNull(zzfhvVarZzg2);
                executorZzf2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfhvVarZzg2.zzg();
                    }
                });
                zzfieVar.zzg().onAdMetadataChanged();
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfor zzforVarZzi2 = zzfieVar.zzi();
                    zzfoe zzfoeVar3 = this.zzc;
                    zzfoeVar3.zzg(zzdtzVar.zzr().zzb);
                    zzfoeVar3.zzi(zzdtzVar.zzn().zze());
                    zzfoeVar3.zzd(true);
                    zzforVarZzi2.zzb(zzfoeVar3.zzm());
                } else {
                    zzfor zzforVarZzi3 = zzfieVar.zzi();
                    zzfoe zzfoeVar4 = this.zzc;
                    zzfoeVar4.zzg(zzdtzVar.zzr().zzb);
                    zzfoeVar4.zzi(zzdtzVar.zzn().zze());
                    zzfoeVar4.zzd(true);
                    zzforVarZzi3.zzb(zzfoeVar4.zzm());
                }
            }
            throw th;
        }
    }
}
