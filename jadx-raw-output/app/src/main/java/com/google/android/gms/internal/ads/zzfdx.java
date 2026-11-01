package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfdx implements zzgzl {
    public final /* synthetic */ zzese zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzfdy zzd;
    public final /* synthetic */ zzfeb zze;

    public zzfdx(zzfeb zzfebVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfdy zzfdyVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfdyVar;
        Objects.requireNonNull(zzfebVar);
        this.zze = zzfebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th2);
        }
        zzfeb zzfebVar = this.zze;
        zzcth zzcthVar = (zzcth) zzfebVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcthVar == null ? zzfkm.zzb(th2, null) : zzcthVar.zza().zzg(th2);
        synchronized (zzfebVar) {
            zzfebVar.zzl(null);
            if (zzcthVar != null) {
                zzcthVar.zze().zzdI(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                    zzfebVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzi().zzdI(zzeVarZzb);
                        }
                    });
                }
            } else {
                zzfebVar.zzi().zzdI(zzeVarZzb);
                ((zzcth) zzfebVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            zzfkh.zza(zzeVarZzb.zza, th2, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzk = zzfebVar.zzk();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzh(zzeVarZzb);
                zzfoeVar.zzj(th2);
                zzfoeVar.zzd(false);
                zzforVarZzk.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzeVarZzb);
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzj(th2);
                zzfoeVar2.zzd(false);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzfeb zzfebVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzfebVar) {
            if (zzcwfVar != null) {
                zzcwfVar.zzt();
                zzfebVar.zzl(null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                    zzcwfVar.zzq().zzc(zzfebVar.zzi());
                }
                this.zza.zzb(zzcwfVar);
                if (((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzk = zzfebVar.zzk();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                    zzfoeVar.zzi(zzcwfVar.zzn().zze());
                    zzfoeVar.zzd(true);
                    zzforVarZzk.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zze(zzcwfVar.zzr().zzb);
                    zzfooVar.zzg(zzcwfVar.zzn().zze());
                    zzfoe zzfoeVar2 = this.zzc;
                    zzfoeVar2.zzd(true);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } else {
                zzfebVar.zzl(null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjx)).booleanValue()) {
                    zzcwfVar.zzq().zzc(zzfebVar.zzi());
                }
                this.zza.zzb(zzcwfVar);
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfor zzforVarZzk2 = zzfebVar.zzk();
                    zzfoe zzfoeVar3 = this.zzc;
                    zzfoeVar3.zzg(zzcwfVar.zzr().zzb);
                    zzfoeVar3.zzi(zzcwfVar.zzn().zze());
                    zzfoeVar3.zzd(true);
                    zzforVarZzk2.zzb(zzfoeVar3.zzm());
                } else {
                    zzfor zzforVarZzk3 = zzfebVar.zzk();
                    zzfoe zzfoeVar4 = this.zzc;
                    zzfoeVar4.zzg(zzcwfVar.zzr().zzb);
                    zzfoeVar4.zzi(zzcwfVar.zzn().zze());
                    zzfoeVar4.zzd(true);
                    zzforVarZzk3.zzb(zzfoeVar4.zzm());
                }
            }
            throw th;
        }
    }
}
