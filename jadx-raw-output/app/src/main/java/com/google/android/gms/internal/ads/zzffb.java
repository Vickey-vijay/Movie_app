package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzffb implements zzgzl {
    public final /* synthetic */ zzfoo zza;
    public final /* synthetic */ zzfoe zzb;
    public final /* synthetic */ zzcvc zzc;
    public final /* synthetic */ zzfff zzd;

    public zzffb(zzfff zzfffVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzcvc zzcvcVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = zzcvcVar;
        Objects.requireNonNull(zzfffVar);
        this.zzd = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzfoo zzfooVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th2);
        }
        zzfff zzfffVar = this.zzd;
        synchronized (zzfffVar) {
            zzcvc zzcvcVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcvcVar.zzc().zzg(th2);
            zzfffVar.zzs(zzeVarZzg);
            zzcvcVar.zzb().zzdI(zzeVarZzg);
            zzfkh.zza(zzeVarZzg.zza, th2, "BannerAdLoader.onFailure");
            if (zzfffVar.zzr()) {
                zzfffVar.zzn();
                zzfffVar.zzo().zzd(zzfffVar.zzq().zzc());
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                zzfor zzforVarZzp = zzfffVar.zzp();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzh(zzeVarZzg);
                zzfoeVar.zzj(th2);
                zzfoeVar.zzd(false);
                zzforVarZzp.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zzf(zzeVarZzg);
                zzfoe zzfoeVar2 = this.zzb;
                zzfoeVar2.zzj(th2);
                zzfoeVar2.zzd(false);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0010 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzfff zzfffVar = this.zzd;
        zzctx zzctxVar = (zzctx) obj;
        synchronized (zzfffVar) {
            if (zzctxVar != null) {
                zzctxVar.zzt();
                if (zzfffVar.zzr()) {
                    zzfffVar.zzc();
                }
                if (((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                    zzfor zzforVarZzp = zzfffVar.zzp();
                    zzfoe zzfoeVar = this.zzb;
                    zzfoeVar.zzg(zzctxVar.zzr().zzb);
                    zzfoeVar.zzi(zzctxVar.zzn().zze());
                    zzfoeVar.zzd(true);
                    zzforVarZzp.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zze(zzctxVar.zzr().zzb);
                    zzfooVar.zzg(zzctxVar.zzn().zze());
                    zzfoe zzfoeVar2 = this.zzb;
                    zzfoeVar2.zzd(true);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } else {
                if (zzfffVar.zzr()) {
                    zzfffVar.zzc();
                }
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfor zzforVarZzp2 = zzfffVar.zzp();
                    zzfoe zzfoeVar3 = this.zzb;
                    zzfoeVar3.zzg(zzctxVar.zzr().zzb);
                    zzfoeVar3.zzi(zzctxVar.zzn().zze());
                    zzfoeVar3.zzd(true);
                    zzforVarZzp2.zzb(zzfoeVar3.zzm());
                } else {
                    zzfor zzforVarZzp3 = zzfffVar.zzp();
                    zzfoe zzfoeVar4 = this.zzb;
                    zzfoeVar4.zzg(zzctxVar.zzr().zzb);
                    zzfoeVar4.zzi(zzctxVar.zzn().zze());
                    zzfoeVar4.zzd(true);
                    zzforVarZzp3.zzb(zzfoeVar4.zzm());
                }
            }
            throw th;
        }
    }
}
