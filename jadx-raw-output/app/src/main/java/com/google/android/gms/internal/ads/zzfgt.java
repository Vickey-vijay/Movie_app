package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfgt implements zzgzl {
    public final /* synthetic */ zzese zza;
    public final /* synthetic */ zzfoo zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzdlu zzd;
    public final /* synthetic */ zzfgv zze;

    public zzfgt(zzfgv zzfgvVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdlu zzdluVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdluVar;
        Objects.requireNonNull(zzfgvVar);
        this.zze = zzfgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th2);
        }
        zzdlu zzdluVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdluVar.zzb().zzg(th2);
        zzfgv zzfgvVar = this.zze;
        synchronized (zzfgvVar) {
            zzfgvVar.zzi(null);
            zzdluVar.zza().zzdI(zzeVarZzg);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjy)).booleanValue()) {
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzdI(zzeVarZzg);
                    }
                });
                zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzdI(zzeVarZzg);
                    }
                });
            }
            zzfkh.zza(zzeVarZzg.zza, th2, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzforVarZzh = zzfgvVar.zzh();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzh(zzeVarZzg);
                zzfoeVar.zzj(th2);
                zzfoeVar.zzd(false);
                zzforVarZzh.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzeVarZzg);
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzj(th2);
                zzfoeVar2.zzd(false);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0092 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbgv zzbgvVar;
        zzfoo zzfooVar;
        zzfgv zzfgvVar = this.zze;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzfgvVar) {
            if (zzdknVar != null) {
                zzdknVar.zzt();
                zzfgvVar.zzi(null);
                zzbgvVar = zzbhe.zzjy;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    zzdev zzdevVarZzq = zzdknVar.zzq();
                    zzdevVarZzq.zza(zzfgvVar.zzf());
                    zzdevVarZzq.zzd(zzfgvVar.zzg());
                }
                this.zza.zzb(zzdknVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgs
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzg();
                        }
                    });
                    zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzg();
                        }
                    });
                }
                if (((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzforVarZzh = zzfgvVar.zzh();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzg(zzdknVar.zzr().zzb);
                    zzfoeVar.zzi(zzdknVar.zzn().zze());
                    zzfoeVar.zzd(true);
                    zzforVarZzh.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zze(zzdknVar.zzr().zzb);
                    zzfooVar.zzg(zzdknVar.zzn().zze());
                    zzfoe zzfoeVar2 = this.zzc;
                    zzfoeVar2.zzd(true);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } else {
                zzfgvVar.zzi(null);
                zzbgvVar = zzbhe.zzjy;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    zzdev zzdevVarZzq2 = zzdknVar.zzq();
                    zzdevVarZzq2.zza(zzfgvVar.zzf());
                    zzdevVarZzq2.zzd(zzfgvVar.zzg());
                }
                this.zza.zzb(zzdknVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgs
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzg();
                        }
                    });
                    zzfgvVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzg();
                        }
                    });
                }
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfor zzforVarZzh2 = zzfgvVar.zzh();
                    zzfoe zzfoeVar3 = this.zzc;
                    zzfoeVar3.zzg(zzdknVar.zzr().zzb);
                    zzfoeVar3.zzi(zzdknVar.zzn().zze());
                    zzfoeVar3.zzd(true);
                    zzforVarZzh2.zzb(zzfoeVar3.zzm());
                } else {
                    zzfor zzforVarZzh3 = zzfgvVar.zzh();
                    zzfoe zzfoeVar4 = this.zzc;
                    zzfoeVar4.zzg(zzdknVar.zzr().zzb);
                    zzfoeVar4.zzi(zzdknVar.zzn().zze());
                    zzfoeVar4.zzd(true);
                    zzforVarZzh3.zzb(zzfoeVar4.zzm());
                }
            }
            throw th;
        }
    }
}
