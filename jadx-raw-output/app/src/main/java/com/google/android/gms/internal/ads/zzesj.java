package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzesj implements zzgzl {
    public final /* synthetic */ zzese zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzdmq zzd;
    public final /* synthetic */ zzesm zze;

    public zzesj(zzesm zzesmVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdmq zzdmqVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdmqVar;
        Objects.requireNonNull(zzesmVar);
        this.zze = zzesmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th2);
        }
        zzdmq zzdmqVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdmqVar.zza().zzg(th2);
        zzdmqVar.zzb().zzdI(zzeVarZzg);
        zzesm zzesmVar = this.zze;
        zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdI(zzeVarZzg);
            }
        });
        zzfkh.zza(zzeVarZzg.zza, th2, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
            zzfor zzforVarZzg = zzesmVar.zzg();
            zzfoe zzfoeVar = this.zzc;
            zzfoeVar.zzh(zzeVarZzg);
            zzfoeVar.zzj(th2);
            zzfoeVar.zzd(false);
            zzforVarZzg.zzb(zzfoeVar.zzm());
            return;
        }
        zzfooVar.zzf(zzeVarZzg);
        zzfoe zzfoeVar2 = this.zzc;
        zzfoeVar2.zzj(th2);
        zzfoeVar2.zzd(false);
        zzfooVar.zza(zzfoeVar2);
        zzfooVar.zzh();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0061 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x003d, B:10:0x0041, B:12:0x0085, B:11:0x0061), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzesm zzesmVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzesmVar) {
            if (zzcwfVar != null) {
                zzcwfVar.zzt();
                zzcwfVar.zzq().zza(zzesmVar.zzf().zzc());
                this.zza.zzb(zzcwfVar);
                zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesi
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzd().zzg();
                    }
                });
                if (((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzg = zzesmVar.zzg();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                    zzfoeVar.zzi(zzcwfVar.zzn().zze());
                    zzfoeVar.zzd(true);
                    zzforVarZzg.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zze(zzcwfVar.zzr().zzb);
                    zzfooVar.zzg(zzcwfVar.zzn().zze());
                    zzfoe zzfoeVar2 = this.zzc;
                    zzfoeVar2.zzd(true);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } else {
                zzcwfVar.zzq().zza(zzesmVar.zzf().zzc());
                this.zza.zzb(zzcwfVar);
                zzesmVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesi
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzd().zzg();
                    }
                });
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfor zzforVarZzg2 = zzesmVar.zzg();
                    zzfoe zzfoeVar3 = this.zzc;
                    zzfoeVar3.zzg(zzcwfVar.zzr().zzb);
                    zzfoeVar3.zzi(zzcwfVar.zzn().zze());
                    zzfoeVar3.zzd(true);
                    zzforVarZzg2.zzb(zzfoeVar3.zzm());
                } else {
                    zzfor zzforVarZzg3 = zzesmVar.zzg();
                    zzfoe zzfoeVar4 = this.zzc;
                    zzfoeVar4.zzg(zzcwfVar.zzr().zzb);
                    zzfoeVar4.zzi(zzcwfVar.zzn().zze());
                    zzfoeVar4.zzd(true);
                    zzforVarZzg3.zzb(zzfoeVar4.zzm());
                }
            }
            throw th;
        }
    }
}
